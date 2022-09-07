package ec.com.todocompu.ShrimpSoftUtils.contabilidad;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ec.com.todocompu.ShrimpSoftUtils.UtilsExcepciones;
import ec.com.todocompu.ShrimpSoftUtils.UtilsValidacion;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConContableTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConCuentasTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConDetalleTablaTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConEstructuraTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConContable;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConDetalle;
import ec.com.todocompu.ShrimpSoftUtils.delegate.ContabilidadDelegate;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisInfoTO;

public class UtilsContable {

    private final static BigDecimal ZERO = new BigDecimal("0.00");

    private static Short estGrupo1;
    private static Short estGrupo2;
    private static Short estGrupo3;
    private static Short estGrupo4;
    private static Short estGrupo5;
    private static Short estGrupo6;

    private static String codigoContableFormulario;
    private static List<ConCuentasTO> listaConCuentasTO = new ArrayList<ConCuentasTO>();

    public static Map<String, BigDecimal> calcularDebeHaberSaldo(List<ConDetalleTablaTO> listConDetalleTO) {
        BigDecimal debe = ZERO;
        BigDecimal haber = ZERO;
        BigDecimal saldo = ZERO;
        for (ConDetalleTablaTO cdt : listConDetalleTO) {
            debe = debe.add(cdt.getDetDebitos());
            haber = haber.add(cdt.getDetCreditos());
        }
        saldo = debe.subtract(haber).abs();

        Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();
        map.put("debe", debe);
        map.put("haber", haber);
        map.put("saldo", saldo);
        return map;
    }

    public static Map<String, BigDecimal> calcularDebitoCreditoDiferencia(List<ConDetalle> listConDetalle) {
        BigDecimal debe = new BigDecimal("0.00");
        BigDecimal haber = new BigDecimal("0.00");
        BigDecimal saldo = new BigDecimal("0.00");
        for (ConDetalle cdt : listConDetalle) {
            debe = debe.add(cdt.getDetDebitoCredito() == 'D' ? cdt.getDetValor() : ZERO);
            haber = haber.add(cdt.getDetDebitoCredito() == 'C' ? cdt.getDetValor() : ZERO);
        }
        saldo = debe.subtract(haber).abs();

        Map<String, BigDecimal> map = new HashMap<String, BigDecimal>();
        map.put("debe", debe);
        map.put("haber", haber);
        map.put("saldo", saldo);
        return map;
    }

    public static Map<String, Short> obtenerEstructura(String empresa, SisInfoTO sisInfoTO) {
        List<ConEstructuraTO> list = ContabilidadDelegate.getInstance().getListaConEstructura(empresa, sisInfoTO);
        if (list == null || list.isEmpty()) {
        } else {
            estGrupo1 = list.get(0).getEstGrupo1();
            estGrupo2 = list.get(0).getEstGrupo2();
            estGrupo3 = list.get(0).getEstGrupo3();
            estGrupo4 = list.get(0).getEstGrupo4();
            estGrupo5 = list.get(0).getEstGrupo5();
            estGrupo6 = list.get(0).getEstGrupo6();
        }

        Map<String, Short> map = new HashMap<String, Short>();
        map.put("estGrupo1", estGrupo1);
        map.put("estGrupo2", estGrupo2);
        map.put("estGrupo3", estGrupo3);
        map.put("estGrupo4", estGrupo4);
        map.put("estGrupo5", estGrupo5);
        map.put("estGrupo6", estGrupo6);
        return map;
    }

    public static short getEstDestalle() {
        return (short) (estGrupo1 + estGrupo2 + estGrupo3 + estGrupo4 + estGrupo5 + estGrupo6);
    }

    public static List<ConCuentasTO> llenarPlanCuentas(String empCodigo, SisInfoTO sisInfoTO) throws Exception {
        return listaConCuentasTO = ContabilidadDelegate.getInstance().getListaBuscarConCuentas(empCodigo,
                codigoContableFormulario, null, sisInfoTO);
    }

    public static String buscarDetalleContablePadre(String codigo, String empresa, SisInfoTO sisInfoTO) {
        String encontro = "";
        codigoContableFormulario = codigo;
        try {
            llenarPlanCuentas(empresa, sisInfoTO);
        } catch (Exception e) {
            UtilsExcepciones.enviarError(e, "UtilsContable", sisInfoTO);
        }

        for (ConCuentasTO conCuentasTO : listaConCuentasTO) {
            if (conCuentasTO.getCuentaCodigo().equals(codigo)) {
                encontro = conCuentasTO.getCuentaDetalle().trim();
                break;
            } else {
                encontro = "";
            }
        }
        return encontro;
    }

    public static String buscarDetalleContablePadre(String codigo, String empresa, SisInfoTO sisInfoTO, List<ConCuentasTO> listaConCuentasTO) {
        String encontro = "";
        try {
            llenarPlanCuentas(empresa, sisInfoTO);
        } catch (Exception e) {
            UtilsExcepciones.enviarError(e, "UtilsContable", sisInfoTO);
        }

        for (ConCuentasTO conCuentasTO : listaConCuentasTO) {
            if (conCuentasTO.getCuentaCodigo().equals(codigo)) {
                encontro = conCuentasTO.getCuentaDetalle().trim();
                break;
            } else {
                encontro = "";
            }
        }
        return encontro;
    }

    public static ConContableTO convertirConContable_ConContableTO(ConContable conContable) {
        ConContableTO conContableTO = new ConContableTO();
        conContableTO.setConAnulado(conContable.getConAnulado());
        conContableTO.setConBloqueado(conContable.getConBloqueado());
        conContableTO.setConCodigo(conContable.getConCodigo());
        conContableTO.setConConcepto(conContable.getConConcepto());
        conContableTO.setConDetalle(conContable.getConDetalle());
        conContableTO.setConFecha(UtilsValidacion.fecha(conContable.getConFecha(), "yyyy-mm-dd"));
        conContableTO.setConGenerado(conContable.getConGenerado());
        conContableTO.setConNumero(conContable.getConContablePK().getConNumero());
        conContableTO.setConObservaciones(conContable.getConObservaciones());
        conContableTO.setConPendiente(conContable.getConPendiente());
        conContableTO.setConReferencia(conContable.getConReferencia());
        conContableTO.setConReversado(conContable.getConReversado());
        conContableTO.setEmpCodigo(conContable.getConContablePK().getConEmpresa());
        conContableTO.setPerCodigo(conContable.getConContablePK().getConPeriodo());
        conContableTO.setTipCodigo(conContable.getConContablePK().getConTipo());
        conContableTO.setUsrFechaInsertaContable(conContable.getUsrFechaInserta().toString());
        conContableTO.setUsrInsertaContable(conContable.getUsrCodigo());

        return conContableTO;
    }

}
