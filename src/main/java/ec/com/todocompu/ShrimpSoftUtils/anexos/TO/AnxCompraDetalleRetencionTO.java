/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import java.math.BigDecimal;

/**
 *
 * @author User
 */
public class AnxCompraDetalleRetencionTO {

    private static final long serialVersionUID = 1L;
    private Integer detSecuencial;
    private String detConcepto;
    private String nombreConcepto;
    private java.math.BigDecimal detBase0;
    private java.math.BigDecimal detBaseImponible;
    private java.math.BigDecimal detBaseNoObjetoIva;
    private java.math.BigDecimal detPorcentaje;
    private java.math.BigDecimal detValorRetenido;
    private Integer detOrden;
    private String compEmpresa;
    private String compPeriodo;
    private String compMotivo;
    private String compNumero;
    private Integer divSecuencial;
    private String divFechaPago;
    private java.math.BigDecimal divIrAsociado;
    private String divAnioUtilidades;
    private String conCodigoCopia;
    private boolean conIngresaPorcentaje;

    public AnxCompraDetalleRetencionTO() {
    }

    public String getConCodigoCopia() {
        return conCodigoCopia;
    }

    public void setConCodigoCopia(String conCodigoCopia) {
        this.conCodigoCopia = conCodigoCopia;
    }

    public String getNombreConcepto() {
        return nombreConcepto;
    }

    public void setNombreConcepto(String nombreConcepto) {
        this.nombreConcepto = nombreConcepto;
    }

    public Integer getDetSecuencial() {
        return detSecuencial;
    }

    public void setDetSecuencial(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public String getDetConcepto() {
        return detConcepto;
    }

    public void setDetConcepto(String detConcepto) {
        this.detConcepto = detConcepto;
    }

    public BigDecimal getDetBase0() {
        return detBase0;
    }

    public void setDetBase0(BigDecimal detBase0) {
        this.detBase0 = detBase0;
    }

    public BigDecimal getDetBaseImponible() {
        return detBaseImponible;
    }

    public void setDetBaseImponible(BigDecimal detBaseImponible) {
        this.detBaseImponible = detBaseImponible;
    }

    public BigDecimal getDetBaseNoObjetoIva() {
        return detBaseNoObjetoIva;
    }

    public void setDetBaseNoObjetoIva(BigDecimal detBaseNoObjetoIva) {
        this.detBaseNoObjetoIva = detBaseNoObjetoIva;
    }

    public BigDecimal getDetPorcentaje() {
        return detPorcentaje;
    }

    public void setDetPorcentaje(BigDecimal detPorcentaje) {
        this.detPorcentaje = detPorcentaje;
    }

    public BigDecimal getDetValorRetenido() {
        return detValorRetenido;
    }

    public void setDetValorRetenido(BigDecimal detValorRetenido) {
        this.detValorRetenido = detValorRetenido;
    }

    public Integer getDetOrden() {
        return detOrden;
    }

    public void setDetOrden(Integer detOrden) {
        this.detOrden = detOrden;
    }

    public String getCompEmpresa() {
        return compEmpresa;
    }

    public void setCompEmpresa(String compEmpresa) {
        this.compEmpresa = compEmpresa;
    }

    public String getCompPeriodo() {
        return compPeriodo;
    }

    public void setCompPeriodo(String compPeriodo) {
        this.compPeriodo = compPeriodo;
    }

    public String getCompMotivo() {
        return compMotivo;
    }

    public void setCompMotivo(String compMotivo) {
        this.compMotivo = compMotivo;
    }

    public String getCompNumero() {
        return compNumero;
    }

    public void setCompNumero(String compNumero) {
        this.compNumero = compNumero;
    }

    public Integer getDivSecuencial() {
        return divSecuencial;
    }

    public void setDivSecuencial(Integer divSecuencial) {
        this.divSecuencial = divSecuencial;
    }

    public String getDivFechaPago() {
        return divFechaPago;
    }

    public void setDivFechaPago(String divFechaPago) {
        this.divFechaPago = divFechaPago;
    }

    public BigDecimal getDivIrAsociado() {
        return divIrAsociado;
    }

    public void setDivIrAsociado(BigDecimal divIrAsociado) {
        this.divIrAsociado = divIrAsociado;
    }

    public String getDivAnioUtilidades() {
        return divAnioUtilidades;
    }

    public void setDivAnioUtilidades(String divAnioUtilidades) {
        this.divAnioUtilidades = divAnioUtilidades;
    }

    public boolean isConIngresaPorcentaje() {
        return conIngresaPorcentaje;
    }

    public void setConIngresaPorcentaje(boolean conIngresaPorcentaje) {
        this.conIngresaPorcentaje = conIngresaPorcentaje;
    }

}
