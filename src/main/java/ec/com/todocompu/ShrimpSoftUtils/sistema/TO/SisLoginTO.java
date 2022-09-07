/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.TO;

import java.io.Serializable;

/**
 *
 * @author Carlos Ajila
 */
public class SisLoginTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private String usrCodigo;
    private String usrNombre;
    private String usrApellido;
    private String usrEstado;
    private String usrNick;
    private String usrEmail;
    private String usrTelefono;

    private Boolean perEliminarFilas;
    private Boolean perCambiarPrecio;
    private Boolean perAplicarDescuentos;
    private Boolean perCambiarFecha;

    private String perMotivoPermitido;
    private String perBodegaPermitida;
    private String perDocumentoPermitido;
    private String perSecuencialPermitidoVentas;
    private String perSecuencialPermitidoRetenciones;
    private String perSecuencialPermitidoGuias;
    private String perSecuencialPermitidoLiquidacionCompras;
    private String perFormaPagoPermitida;

    private String perSecuencialPermitidoNotaCredito;
    private String perSecuencialPermitidoNotaDebito;
    private Boolean perPermisoCredito;
    private Integer perPrecioPermitido;

    public SisLoginTO() {
    }

    public String getPerSecuencialPermitidoNotaCredito() {
        return perSecuencialPermitidoNotaCredito;
    }

    public void setPerSecuencialPermitidoNotaCredito(String perSecuencialPermitidoNotaCredito) {
        this.perSecuencialPermitidoNotaCredito = perSecuencialPermitidoNotaCredito;
    }

    public String getPerSecuencialPermitidoNotaDebito() {
        return perSecuencialPermitidoNotaDebito;
    }

    public void setPerSecuencialPermitidoNotaDebito(String perSecuencialPermitidoNotaDebito) {
        this.perSecuencialPermitidoNotaDebito = perSecuencialPermitidoNotaDebito;
    }

    public Boolean getPerAplicarDescuentos() {
        return perAplicarDescuentos;
    }

    public void setPerAplicarDescuentos(Boolean perAplicarDescuentos) {
        this.perAplicarDescuentos = perAplicarDescuentos;
    }

    public String getPerBodegaPermitida() {
        return perBodegaPermitida;
    }

    public void setPerBodegaPermitida(String perBodegaPermitida) {
        this.perBodegaPermitida = perBodegaPermitida;
    }

    public Boolean getPerCambiarFecha() {
        return perCambiarFecha;
    }

    public void setPerCambiarFecha(Boolean perCambiarFecha) {
        this.perCambiarFecha = perCambiarFecha;
    }

    public Boolean getPerCambiarPrecio() {
        return perCambiarPrecio;
    }

    public void setPerCambiarPrecio(Boolean perCambiarPrecio) {
        this.perCambiarPrecio = perCambiarPrecio;
    }

    public String getPerDocumentoPermitido() {
        return perDocumentoPermitido;
    }

    public void setPerDocumentoPermitido(String perDocumentoPermitido) {
        this.perDocumentoPermitido = perDocumentoPermitido;
    }

    public Boolean getPerEliminarFilas() {
        return perEliminarFilas;
    }

    public void setPerEliminarFilas(Boolean perEliminarFilas) {
        this.perEliminarFilas = perEliminarFilas;
    }

    public String getPerFormaPagoPermitida() {
        return perFormaPagoPermitida;
    }

    public void setPerFormaPagoPermitida(String perFormaPagoPermitida) {
        this.perFormaPagoPermitida = perFormaPagoPermitida;
    }

    public String getPerMotivoPermitido() {
        return perMotivoPermitido;
    }

    public void setPerMotivoPermitido(String perMotivoPermitido) {
        this.perMotivoPermitido = perMotivoPermitido;
    }

    public Boolean getPerPermisoCredito() {
        return perPermisoCredito;
    }

    public void setPerPermisoCredito(Boolean perPermisoCredito) {
        this.perPermisoCredito = perPermisoCredito;
    }

    public Integer getPerPrecioPermitido() {
        return perPrecioPermitido;
    }

    public void setPerPrecioPermitido(Integer perPrecioPermitido) {
        this.perPrecioPermitido = perPrecioPermitido;
    }

    public String getPerSecuencialPermitidoVentas() {
        return perSecuencialPermitidoVentas;
    }

    public void setPerSecuencialPermitidoVentas(String perSecuencialPermitidoVentas) {
        this.perSecuencialPermitidoVentas = perSecuencialPermitidoVentas;
    }

    public String getPerSecuencialPermitidoRetenciones() {
        return perSecuencialPermitidoRetenciones;
    }

    public void setPerSecuencialPermitidoRetenciones(String perSecuencialPermitidoRetenciones) {
        this.perSecuencialPermitidoRetenciones = perSecuencialPermitidoRetenciones;
    }

    public String getPerSecuencialPermitidoGuias() {
        return perSecuencialPermitidoGuias;
    }

    public void setPerSecuencialPermitidoGuias(String perSecuencialPermitidoGuias) {
        this.perSecuencialPermitidoGuias = perSecuencialPermitidoGuias;
    }

    public String getUsrApellido() {
        return usrApellido;
    }

    public void setUsrApellido(String usrApellido) {
        this.usrApellido = usrApellido;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrEstado() {
        return usrEstado;
    }

    public void setUsrEstado(String usrEstado) {
        this.usrEstado = usrEstado;
    }

    public String getUsrNick() {
        return usrNick;
    }

    public void setUsrNick(String usrNick) {
        this.usrNick = usrNick;
    }

    public String getUsrNombre() {
        return usrNombre;
    }

    public void setUsrNombre(String usrNombre) {
        this.usrNombre = usrNombre;
    }

    public String getPerSecuencialPermitidoLiquidacionCompras() {
        return perSecuencialPermitidoLiquidacionCompras;
    }

    public void setPerSecuencialPermitidoLiquidacionCompras(String perSecuencialPermitidoLiquidacionCompras) {
        this.perSecuencialPermitidoLiquidacionCompras = perSecuencialPermitidoLiquidacionCompras;
    }

    public String getUsrEmail() {
        return usrEmail;
    }

    public void setUsrEmail(String usrEmail) {
        this.usrEmail = usrEmail;
    }

    public String getUsrTelefono() {
        return usrTelefono;
    }

    public void setUsrTelefono(String usrTelefono) {
        this.usrTelefono = usrTelefono;
    }

}
