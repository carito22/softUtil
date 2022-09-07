/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.report;
import java.io.Serializable;
import java.math.BigDecimal;
/**
 *
 * @author Usuario1
 */
public class ReporteComprobantesElectronicosRecibidos implements Serializable{
    private static final long  serialVersionUID = 1L;
    
    private String comproComprobante;
    private String comproSerieComprobante;
    private String comproRucEmisor;
    private String comproRazonSocialEmisor;
    private String comproFechaEmision;
    private String comproFechaAutorizacion;
    private String comproClaveAcceso;
    private String comproNumeroAutorizacion;
    private BigDecimal comproImporteTotal;
    private boolean comproEstado;
    
    public ReporteComprobantesElectronicosRecibidos(){}

    public String getComproComprobante() {
        return comproComprobante;
    }

    public void setComproComprobante(String comproComprobante) {
        this.comproComprobante = comproComprobante;
    }

    public String getComproSerieComprobante() {
        return comproSerieComprobante;
    }

    public void setComproSerieComprobante(String comproSerieComprobante) {
        this.comproSerieComprobante = comproSerieComprobante;
    }

    public String getComproRucEmisor() {
        return comproRucEmisor;
    }

    public void setComproRucEmisor(String comproRucEmisor) {
        this.comproRucEmisor = comproRucEmisor;
    }

    public String getComproRazonSocialEmisor() {
        return comproRazonSocialEmisor;
    }

    public void setComproRazonSocialEmisor(String comproRazonSocialEmisor) {
        this.comproRazonSocialEmisor = comproRazonSocialEmisor;
    }

    public String getComproFechaEmision() {
        return comproFechaEmision;
    }

    public void setComproFechaEmision(String comproFechaEmision) {
        this.comproFechaEmision = comproFechaEmision;
    }

    public String getComproFechaAutorizacion() {
        return comproFechaAutorizacion;
    }

    public void setComproFechaAutorizacion(String comproFechaAutorizacion) {
        this.comproFechaAutorizacion = comproFechaAutorizacion;
    }

    public String getComproClaveAcceso() {
        return comproClaveAcceso;
    }

    public void setComproClaveAcceso(String comproClaveAcceso) {
        this.comproClaveAcceso = comproClaveAcceso;
    }

    public String getComproNumeroAutorizacion() {
        return comproNumeroAutorizacion;
    }

    public void setComproNumeroAutorizacion(String comproNumeroAutorizacion) {
        this.comproNumeroAutorizacion = comproNumeroAutorizacion;
    }

    public BigDecimal getComproImporteTotal() {
        return comproImporteTotal;
    }

    public void setComproImporteTotal(BigDecimal comproImporteTotal) {
        this.comproImporteTotal = comproImporteTotal;
    }

    public boolean isComproEstado() {
        return comproEstado;
    }

    public void setComproEstado(boolean comproEstado) {
        this.comproEstado = comproEstado;
    }
    
    
}
