/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.report;

import java.math.BigDecimal;

public class ReporteConsolidadoRetencionesVentas {

    private String desde;
    private String hasta;

    private String rvcTransaccion;
    private String rvcIdentificacion;
    private String rvcComprobanteTipo;
    private Integer rvcNumeroRetenciones;
    private java.math.BigDecimal rvcBaseNoObjetoIva;
    private java.math.BigDecimal rvcBase0;
    private java.math.BigDecimal venBaseImponible;
    private java.math.BigDecimal venMontoIce;
    private java.math.BigDecimal venMontoIva;
    private java.math.BigDecimal venValorRetenidoIva;
    private java.math.BigDecimal venValorRetenidoRenta;

    public ReporteConsolidadoRetencionesVentas() {
    }

    public ReporteConsolidadoRetencionesVentas(String desde, String hasta, String rvcTransaccion, String rvcIdentificacion, String rvcComprobanteTipo,
            Integer rvcNumeroRetenciones, BigDecimal rvcBaseNoObjetoIva, BigDecimal rvcBase0, BigDecimal venBaseImponible, BigDecimal venMontoIce, BigDecimal venMontoIva,
            BigDecimal venValorRetenidoIva, BigDecimal venValorRetenidoRenta) {
        this.desde = desde;
        this.hasta = hasta;
        this.rvcTransaccion = rvcTransaccion;
        this.rvcIdentificacion = rvcIdentificacion;
        this.rvcComprobanteTipo = rvcComprobanteTipo;
        this.rvcNumeroRetenciones = rvcNumeroRetenciones;
        this.rvcBaseNoObjetoIva = rvcBaseNoObjetoIva;
        this.rvcBase0 = rvcBase0;
        this.venBaseImponible = venBaseImponible;
        this.venMontoIce = venMontoIce;
        this.venMontoIva = venMontoIva;
        this.venValorRetenidoIva = venValorRetenidoIva;
        this.venValorRetenidoRenta = venValorRetenidoRenta;
    }

    public String getDesde() {
        return desde;
    }

    public void setDesde(String desde) {
        this.desde = desde;
    }

    public String getHasta() {
        return hasta;
    }

    public void setHasta(String hasta) {
        this.hasta = hasta;
    }

    public String getRvcTransaccion() {
        return rvcTransaccion;
    }

    public void setRvcTransaccion(String rvcTransaccion) {
        this.rvcTransaccion = rvcTransaccion;
    }

    public String getRvcIdentificacion() {
        return rvcIdentificacion;
    }

    public void setRvcIdentificacion(String rvcIdentificacion) {
        this.rvcIdentificacion = rvcIdentificacion;
    }

    public String getRvcComprobanteTipo() {
        return rvcComprobanteTipo;
    }

    public void setRvcComprobanteTipo(String rvcComprobanteTipo) {
        this.rvcComprobanteTipo = rvcComprobanteTipo;
    }

    public Integer getRvcNumeroRetenciones() {
        return rvcNumeroRetenciones;
    }

    public void setRvcNumeroRetenciones(Integer rvcNumeroRetenciones) {
        this.rvcNumeroRetenciones = rvcNumeroRetenciones;
    }

    public BigDecimal getRvcBaseNoObjetoIva() {
        return rvcBaseNoObjetoIva;
    }

    public void setRvcBaseNoObjetoIva(BigDecimal rvcBaseNoObjetoIva) {
        this.rvcBaseNoObjetoIva = rvcBaseNoObjetoIva;
    }

    public BigDecimal getRvcBase0() {
        return rvcBase0;
    }

    public void setRvcBase0(BigDecimal rvcBase0) {
        this.rvcBase0 = rvcBase0;
    }

    public BigDecimal getVenBaseImponible() {
        return venBaseImponible;
    }

    public void setVenBaseImponible(BigDecimal venBaseImponible) {
        this.venBaseImponible = venBaseImponible;
    }

    public BigDecimal getVenMontoIva() {
        return venMontoIva;
    }

    public void setVenMontoIva(BigDecimal venMontoIva) {
        this.venMontoIva = venMontoIva;
    }

    public BigDecimal getVenValorRetenidoIva() {
        return venValorRetenidoIva;
    }

    public void setVenValorRetenidoIva(BigDecimal venValorRetenidoIva) {
        this.venValorRetenidoIva = venValorRetenidoIva;
    }

    public BigDecimal getVenValorRetenidoRenta() {
        return venValorRetenidoRenta;
    }

    public void setVenValorRetenidoRenta(BigDecimal venValorRetenidoRenta) {
        this.venValorRetenidoRenta = venValorRetenidoRenta;
    }

    public BigDecimal getVenMontoIce() {
        return venMontoIce;
    }

    public void setVenMontoIce(BigDecimal venMontoIce) {
        this.venMontoIce = venMontoIce;
    }

}
