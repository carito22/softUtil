/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import java.math.BigDecimal;

/**
 *
 * @author Usuario1
 */
public class AnxRetencionVentaReporteTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String vtaNumeroDocumento;
    private String venPeriodo;
    private String venMotivo;
    private String venNumero;
    private String vtaFecha;

    private String cliCedula;
    private String cliNombre;
    private String cliDireccion;
    private String cliTelefono;

    private String venRetencionNumero;
    private String venRetencionAutorizacion;
    private String venRetencionFechaEmision;
    private java.math.BigDecimal venBase0;
    private java.math.BigDecimal venBaseImponible;
    private java.math.BigDecimal venBaseNoObjetoIva;
    private java.math.BigDecimal venMontoIva;
    private java.math.BigDecimal venValorRetenidoIva;
    private java.math.BigDecimal venValorRetenidoRenta;
    private java.math.BigDecimal venValorTotal;

    public AnxRetencionVentaReporteTO() {
    }

    public String getVtaNumeroDocumento() {
        return vtaNumeroDocumento;
    }

    public void setVtaNumeroDocumento(String vtaNumeroDocumento) {
        this.vtaNumeroDocumento = vtaNumeroDocumento;
    }

    public String getVtaFecha() {
        return vtaFecha;
    }

    public void setVtaFecha(String vtaFecha) {
        this.vtaFecha = vtaFecha;
    }

    public String getCliCedula() {
        return cliCedula;
    }

    public void setCliCedula(String cliCedula) {
        this.cliCedula = cliCedula;
    }

    public String getCliNombre() {
        return cliNombre;
    }

    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }

    public String getCliDireccion() {
        return cliDireccion;
    }

    public void setCliDireccion(String cliDireccion) {
        this.cliDireccion = cliDireccion;
    }

    public String getCliTelefono() {
        return cliTelefono;
    }

    public void setCliTelefono(String cliTelefono) {
        this.cliTelefono = cliTelefono;
    }

    public String getVenPeriodo() {
        return venPeriodo;
    }

    public void setVenPeriodo(String venPeriodo) {
        this.venPeriodo = venPeriodo;
    }

    public String getVenMotivo() {
        return venMotivo;
    }

    public void setVenMotivo(String venMotivo) {
        this.venMotivo = venMotivo;
    }

    public String getVenNumero() {
        return venNumero;
    }

    public void setVenNumero(String venNumero) {
        this.venNumero = venNumero;
    }

    public String getVenRetencionNumero() {
        return venRetencionNumero;
    }

    public void setVenRetencionNumero(String venRetencionNumero) {
        this.venRetencionNumero = venRetencionNumero;
    }

    public String getVenRetencionAutorizacion() {
        return venRetencionAutorizacion;
    }

    public void setVenRetencionAutorizacion(String venRetencionAutorizacion) {
        this.venRetencionAutorizacion = venRetencionAutorizacion;
    }

    public String getVenRetencionFechaEmision() {
        return venRetencionFechaEmision;
    }

    public void setVenRetencionFechaEmision(String venRetencionFechaEmision) {
        this.venRetencionFechaEmision = venRetencionFechaEmision;
    }

    public BigDecimal getVenBase0() {
        return venBase0;
    }

    public void setVenBase0(BigDecimal venBase0) {
        this.venBase0 = venBase0;
    }

    public BigDecimal getVenBaseImponible() {
        return venBaseImponible;
    }

    public void setVenBaseImponible(BigDecimal venBaseImponible) {
        this.venBaseImponible = venBaseImponible;
    }

    public BigDecimal getVenBaseNoObjetoIva() {
        return venBaseNoObjetoIva;
    }

    public void setVenBaseNoObjetoIva(BigDecimal venBaseNoObjetoIva) {
        this.venBaseNoObjetoIva = venBaseNoObjetoIva;
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

    public BigDecimal getVenValorTotal() {
        return venValorTotal;
    }

    public void setVenValorTotal(BigDecimal venValorTotal) {
        this.venValorTotal = venValorTotal;
    }

}
