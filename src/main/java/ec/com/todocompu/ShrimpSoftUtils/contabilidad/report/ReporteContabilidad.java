package ec.com.todocompu.ShrimpSoftUtils.contabilidad.report;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConContableReporteTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.UsuarioEmpresaReporteTO;

public class ReporteContabilidad {

    public static List<ReporteContableDetalle> generarColeccionContableDetalle(
            UsuarioEmpresaReporteTO usuarioEmpresaReporteTO, List<ConContableReporteTO> listConContableReporteTO,
            String elaboradoPor) {
        List<ReporteContableDetalle> listaContableDetalle = new ArrayList<ReporteContableDetalle>();
        try {

            for (ConContableReporteTO ccrto : listConContableReporteTO) {
                if (ccrto != null) {
                    for (int i = 0; i < ccrto.getListConDetalleTablaTO().size(); i++) {
                        ReporteContableDetalle reporteContableDetalle = new ReporteContableDetalle();
                        /////////// TITULO REPORTE
                        reporteContableDetalle.setTitulo(ccrto.getTitulo());

                        /////////// CABECERA
                        reporteContableDetalle.setEmpCodigo(ccrto.getConContableTO().getEmpCodigo());
                        reporteContableDetalle.setPerCodigo(ccrto.getConContableTO().getPerCodigo());
                        reporteContableDetalle.setTipCodigo(ccrto.getConContableTO().getTipCodigo());
                        reporteContableDetalle.setConNumero(ccrto.getConContableTO().getConNumero());
                        reporteContableDetalle.setConFecha(ccrto.getConContableTO().getConFecha());
                        reporteContableDetalle.setConPendiente(ccrto.getConContableTO().getConPendiente());
                        reporteContableDetalle.setConRevisado(ccrto.getConContableTO().getConAnulado());
                        reporteContableDetalle.setConAnulado(ccrto.getConContableTO().getConAnulado());
                        reporteContableDetalle.setConGenerado(ccrto.getConContableTO().getConGenerado());
                        reporteContableDetalle.setConConcepto(ccrto.getConContableTO().getConConcepto());
                        reporteContableDetalle.setConDetalle(ccrto.getConContableTO().getConDetalle());
                        reporteContableDetalle.setConObservaciones(ccrto.getConContableTO().getConObservaciones());
                        reporteContableDetalle.setUsrInserta(ccrto.getConContableTO().getUsrInsertaContable());
                        reporteContableDetalle
                                .setUsrFechaInserta(ccrto.getConContableTO().getUsrFechaInsertaContable());

                        reporteContableDetalle.setImpElaborado(elaboradoPor);

                        reporteContableDetalle.setImpAprobado(usuarioEmpresaReporteTO.getEmpGerente());
                        reporteContableDetalle.setImpRevisado("");
                        reporteContableDetalle.setImpContabilidad(usuarioEmpresaReporteTO.getEmpContador());
                        ///////////// DETALLE
                        reporteContableDetalle.setConCtaCodigoPadre(ccrto.getCuentaPadre().get(i).trim()
                                .substring(0, ccrto.getCuentaPadre().get(i).trim().indexOf("|")).trim());
                        reporteContableDetalle.setConNombreCuentaPadre(ccrto.getCuentaPadre().get(i).trim()
                                .substring(ccrto.getCuentaPadre().get(i).trim().indexOf("|") + 1).trim());
                        reporteContableDetalle.setConCtaCodigo(ccrto.getListConDetalleTablaTO().get(i).getCtaCodigo());
                        reporteContableDetalle
                                .setConNombreCuenta(ccrto.getListConDetalleTablaTO().get(i).getCtaDetalle());
                        reporteContableDetalle.setDetCentroProduccion(ccrto.getListConDetalleTablaTO().get(i).getSecCodigo());
                        reporteContableDetalle.setDetCentroProduccionNombre(ccrto.getListConDetalleTablaTO().get(i).getSecNombre());
                        reporteContableDetalle.setDetCentroCosto(ccrto.getListConDetalleTablaTO().get(i).getPisNumero() == null ? ""
                                        : ccrto.getListConDetalleTablaTO().get(i).getPisNumero());
                        reporteContableDetalle
                                .setDetDocumento(ccrto.getListConDetalleTablaTO().get(i).getDetDocumento() == null ? ""
                                        : ccrto.getListConDetalleTablaTO().get(i).getDetDocumento());
                        if (ccrto.getListConDetalleTablaTO().get(i).getDetDebitos() != null
                                && ccrto.getListConDetalleTablaTO().get(i).getDetDebitos()
                                        .compareTo(new BigDecimal("0.00")) > 0) {
                            reporteContableDetalle.setDetDebitoCredito('D');
                            reporteContableDetalle.setDetValor(ccrto.getListConDetalleTablaTO().get(i).getDetDebitos());
                        } else {
                            reporteContableDetalle.setDetDebitoCredito('C');
                            reporteContableDetalle
                                    .setDetValor(ccrto.getListConDetalleTablaTO().get(i).getDetCreditos());
                        }
                        reporteContableDetalle.setDetGenerado(ccrto.getListConDetalleTablaTO().get(i).getDetGenerado());
                        reporteContableDetalle.setDetReferencia(ccrto.getConContableTO().getConReferencia());
                        reporteContableDetalle.setDetOrden(i + 1);
                        listaContableDetalle.add(reporteContableDetalle);
                    }
                }
            }
            return listaContableDetalle;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
