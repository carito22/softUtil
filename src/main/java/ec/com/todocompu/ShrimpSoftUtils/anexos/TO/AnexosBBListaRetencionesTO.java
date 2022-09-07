/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import java.util.List;

public class AnexosBBListaRetencionesTO implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private List<AnxListaRetencionesTO> anxListaRetencionesTO;
    private List<AnxListaRetencionesFuenteIvaTO> anxListaRetencionesFuenteIvaTOs;
    private List<AnxListaRetencionesPendientesTO> anxListaRetencionesPendientesTOs;
    private List<AnxListaRetencionesRentaTO> anxListaRetencionesRentaTO;

    private List<AnxListaComprobanteAnuladoTO> anxListaComprobanteAnuladoTOs;
    private List<AnxListaRetencionVentaTO> anxListaRetencionVentaTOs;
    private List<AnxListaConsolidadoRetencionesVentasTO> anxListaConsolidadoRetencionesVentasTOs;
    private List<AnxListadoRetencionesVentasTO> anxListadoRetencionesVentasTOs;
    private List<AnxFunListadoDevolucionIvaVentasTO> anxFunListadoDevolucionIvaVentasTOs;
    private List<AnxListaEstablecimientoRetencionesVentasTO> anxListaEstablecimientoRetencionesVentasTOs;
    private List<AnxListaVentaExportacionTO> anxListaExportaciones;

    public AnexosBBListaRetencionesTO() {
        this.anxListaRetencionesTO = new java.util.ArrayList();
        this.anxListaRetencionesFuenteIvaTOs = new java.util.ArrayList();
        this.anxListaRetencionesPendientesTOs = new java.util.ArrayList();
        this.anxListaRetencionesRentaTO = new java.util.ArrayList();
        this.anxListaComprobanteAnuladoTOs = new java.util.ArrayList();
        this.anxListaRetencionVentaTOs = new java.util.ArrayList();
        this.anxListaConsolidadoRetencionesVentasTOs = new java.util.ArrayList();
        this.anxListadoRetencionesVentasTOs = new java.util.ArrayList();
        this.anxFunListadoDevolucionIvaVentasTOs = new java.util.ArrayList();
        this.anxListaEstablecimientoRetencionesVentasTOs = new java.util.ArrayList();
    }

    public List<AnxListaRetencionesTO> getAnxListaRetencionesTO() {
        return anxListaRetencionesTO;
    }

    public void setAnxListaRetencionesTO(List<AnxListaRetencionesTO> anxListaRetencionesTO) {
        this.anxListaRetencionesTO = anxListaRetencionesTO;
    }

    public List<AnxListaRetencionesFuenteIvaTO> getAnxListaRetencionesFuenteIvaTOs() {
        return anxListaRetencionesFuenteIvaTOs;
    }

    public void setAnxListaRetencionesFuenteIvaTOs(List<AnxListaRetencionesFuenteIvaTO> anxListaRetencionesFuenteIvaTOs) {
        this.anxListaRetencionesFuenteIvaTOs = anxListaRetencionesFuenteIvaTOs;
    }

    public List<AnxListaRetencionesPendientesTO> getAnxListaRetencionesPendientesTOs() {
        return anxListaRetencionesPendientesTOs;
    }

    public void setAnxListaRetencionesPendientesTOs(List<AnxListaRetencionesPendientesTO> anxListaRetencionesPendientesTOs) {
        this.anxListaRetencionesPendientesTOs = anxListaRetencionesPendientesTOs;
    }

    public List<AnxListaRetencionesRentaTO> getAnxListaRetencionesRentaTO() {
        return anxListaRetencionesRentaTO;
    }

    public void setAnxListaRetencionesRentaTO(List<AnxListaRetencionesRentaTO> anxListaRetencionesRentaTO) {
        this.anxListaRetencionesRentaTO = anxListaRetencionesRentaTO;
    }

    public List<AnxListaComprobanteAnuladoTO> getAnxListaComprobanteAnuladoTOs() {
        return anxListaComprobanteAnuladoTOs;
    }

    public void setAnxListaComprobanteAnuladoTOs(List<AnxListaComprobanteAnuladoTO> anxListaComprobanteAnuladoTOs) {
        this.anxListaComprobanteAnuladoTOs = anxListaComprobanteAnuladoTOs;
    }

    public List<AnxListaRetencionVentaTO> getAnxListaRetencionVentaTOs() {
        return anxListaRetencionVentaTOs;
    }

    public void setAnxListaRetencionVentaTOs(List<AnxListaRetencionVentaTO> anxListaRetencionVentaTOs) {
        this.anxListaRetencionVentaTOs = anxListaRetencionVentaTOs;
    }

    public List<AnxListaConsolidadoRetencionesVentasTO> getAnxListaConsolidadoRetencionesVentasTOs() {
        return anxListaConsolidadoRetencionesVentasTOs;
    }

    public void setAnxListaConsolidadoRetencionesVentasTOs(List<AnxListaConsolidadoRetencionesVentasTO> anxListaConsolidadoRetencionesVentasTOs) {
        this.anxListaConsolidadoRetencionesVentasTOs = anxListaConsolidadoRetencionesVentasTOs;
    }

    public List<AnxListadoRetencionesVentasTO> getAnxListadoRetencionesVentasTOs() {
        return anxListadoRetencionesVentasTOs;
    }

    public void setAnxListadoRetencionesVentasTOs(List<AnxListadoRetencionesVentasTO> anxListadoRetencionesVentasTOs) {
        this.anxListadoRetencionesVentasTOs = anxListadoRetencionesVentasTOs;
    }

    public List<AnxFunListadoDevolucionIvaVentasTO> getAnxFunListadoDevolucionIvaVentasTOs() {
        return anxFunListadoDevolucionIvaVentasTOs;
    }

    public void setAnxFunListadoDevolucionIvaVentasTOs(List<AnxFunListadoDevolucionIvaVentasTO> anxFunListadoDevolucionIvaVentasTOs) {
        this.anxFunListadoDevolucionIvaVentasTOs = anxFunListadoDevolucionIvaVentasTOs;
    }

    public List<AnxListaEstablecimientoRetencionesVentasTO> getAnxListaEstablecimientoRetencionesVentasTOs() {
        return anxListaEstablecimientoRetencionesVentasTOs;
    }

    public void setAnxListaEstablecimientoRetencionesVentasTOs(List<AnxListaEstablecimientoRetencionesVentasTO> anxListaEstablecimientoRetencionesVentasTOs) {
        this.anxListaEstablecimientoRetencionesVentasTOs = anxListaEstablecimientoRetencionesVentasTOs;
    }

    public List<AnxListaVentaExportacionTO> getAnxListaExportaciones() {
        return anxListaExportaciones;
    }

    public void setAnxListaExportaciones(List<AnxListaVentaExportacionTO> anxListaExportaciones) {
        this.anxListaExportaciones = anxListaExportaciones;
    }

}
