/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.report;

import java.math.BigDecimal;

/**
 *
 * @author Mario Ramos Duque
 */
public class ReporteConsultaHorasExtrasLote {

    private String periodo;
    private String tipo;
    private String numero;

    ///// DETALLE
    private String dblFecha;
    private String dblId;
    private String dblNombres;
    private java.math.BigDecimal dblValor50;
    private java.math.BigDecimal dblValor100;
    private java.math.BigDecimal dblValorExtraordinarias100;

    private String formaPago;
    private String documento;
    private String observaciones;

    public ReporteConsultaHorasExtrasLote() {
    }

    public String getDblFecha() {
        return dblFecha;
    }

    public void setDblFecha(String dblFecha) {
        this.dblFecha = dblFecha;
    }

    public String getDblId() {
        return dblId;
    }

    public void setDblId(String dblId) {
        this.dblId = dblId;
    }

    public String getDblNombres() {
        return dblNombres;
    }

    public void setDblNombres(String dblNombres) {
        this.dblNombres = dblNombres;
    }

    public BigDecimal getDblValor50() {
        return dblValor50;
    }

    public void setDblValor50(BigDecimal dblValor50) {
        this.dblValor50 = dblValor50;
    }

    public BigDecimal getDblValor100() {
        return dblValor100;
    }

    public void setDblValor100(BigDecimal dblValor100) {
        this.dblValor100 = dblValor100;
    }

    public BigDecimal getDblValorExtraordinarias100() {
        return dblValorExtraordinarias100;
    }

    public void setDblValorExtraordinarias100(BigDecimal dblValorExtraordinarias100) {
        this.dblValorExtraordinarias100 = dblValorExtraordinarias100;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
