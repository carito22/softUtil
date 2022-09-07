package ec.com.todocompu.ShrimpSoftUtils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.context.SecurityContextHolder;

import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisInfoTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.UsuarioEmpresaReporteTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.entity.SisEmpresa;

public class UtilsAplicacion {

    private static final List<SisInfoTO> listSisInfoTO = new ArrayList<SisInfoTO>();
    public static UsuarioEmpresaReporteTO usuarioEmpresaReporteTO;

    public static void addSisInfoTO(SisInfoTO sisInfoTO) {
        listSisInfoTO.add(sisInfoTO);
    }

    public static boolean removeSisInfoTO(SisInfoTO sisInfoTO) {
        return listSisInfoTO.remove(sisInfoTO);
    }

    public static SisInfoTO removeSisInfoTO() {
        for (int i = 0; i < listSisInfoTO.size(); i++) {
            if (listSisInfoTO.get(i).getUsuarioNick()
                    .compareToIgnoreCase(SecurityContextHolder.getContext().getAuthentication().getName()) == 0) {
                return listSisInfoTO.remove(i);
            }
        }
        return null;
    }

    public static SisInfoTO getSisInfoTO() {
        try {
            for (SisInfoTO sisInfoTO : listSisInfoTO) {
                if (sisInfoTO.getUsuarioNick()
                        .compareToIgnoreCase(SecurityContextHolder.getContext().getAuthentication().getName()) == 0) {
                    return sisInfoTO;
                }
            }
        } catch (Exception e) {
            return listSisInfoTO.get(0);
        }
        return null;
    }

    public static String armarUsuarioEmpresaReporteTO(List<SisEmpresa> list, String empresaCodigo, SisInfoTO sisInfoTO) {

        UsuarioEmpresaReporteTO usuarioEmpresaReporteTO = new UsuarioEmpresaReporteTO();
        for (SisEmpresa se : list) {
            if (se.getEmpCodigo().compareToIgnoreCase(empresaCodigo) == 0) {
                usuarioEmpresaReporteTO.setEmpNombre(se.getEmpNombre());
                usuarioEmpresaReporteTO.setEmpCodigo(se.getEmpCodigo());
                usuarioEmpresaReporteTO.setEmpRuc(se.getEmpRuc());
                usuarioEmpresaReporteTO.setEmpDireccion(se.getEmpDireccion());
                usuarioEmpresaReporteTO.setEmpTelefono(se.getEmpTelefono());
                usuarioEmpresaReporteTO.setUsrNick(sisInfoTO == null ? UtilsAplicacion.getSisInfoTO().getUsuario() : sisInfoTO.getUsuario());
                break;
            }
        }

        UtilsAplicacion.usuarioEmpresaReporteTO = usuarioEmpresaReporteTO;

        return usuarioEmpresaReporteTO.getEmpNombre();
    }

    public static void enviarVariableVista(String variable, boolean valor) {
        //RequestContext.getCurrentInstance().addCallbackParam(variable, valor);
    }

    public static void update(String... updates) {
        //RequestContext.getCurrentInstance().update(new ArrayList<String>(Arrays.asList(updates)));
    }

    public static void execute(String... jqs) {
//		for (String jq : jqs)
//			RequestContext.getCurrentInstance().execute(jq);
    }

    public static String generarMensajeLista(List<String> listaMensaje) {
        String mensaje = "";
        for (String menAux : listaMensaje) {
            mensaje += menAux + "\n";
        }
        return mensaje += "";
    }

    public static double redondear(double numero, int numeroDecimales) {
        long mult = (long) Math.pow(10, numeroDecimales);
        double resultado = (Math.round(numero * mult)) / (double) mult;
        return resultado;
    }

}
