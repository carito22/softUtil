/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvVentaCabeceraTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "vta_documento_tipo")
    private String vtaDocumentoTipo;

    @Column(name = "vta_documento_numero")
    private String vtaDocumentoNumero;

    @Column(name = "vta_fecha")
    private String vtaFecha;

    @Column(name = "vta_fecha_vencimiento")
    private String vtaFechaVencimiento;

    @Column(name = "vta_iva_vigente")
    private java.math.BigDecimal vtaIvaVigente;

    @Column(name = "vta_observaciones")
    private String vtaObservaciones;

    @Column(name = "vta_informacion_adicional")
    private String vtaInformacionAdicional;

    @Column(name = "vta_pendiente")
    private Boolean vtaPendiente;

    @Column(name = "vta_revisado")
    private Boolean vtaRevisado;

    @Column(name = "vta_anulado")
    private Boolean vtaAnulado;

    @Column(name = "vta_forma_pago")
    private String vtaFormaPago;

    @Column(name = "vta_base0")
    private java.math.BigDecimal vtaBase0;

    @Column(name = "vta_base_imponible")
    private java.math.BigDecimal vtaBaseImponible;

    @Column(name = "vta_montoiva")
    private java.math.BigDecimal vtaMontoiva;

    @Column(name = "vta_descuento_base0")
    private java.math.BigDecimal vtaDescuentoBase0;

    @Column(name = "vta_descuento_base_imponible")
    private java.math.BigDecimal vtaDescuentoBaseImponible;

    @Column(name = "vta_descuento_base_no_objeto")
    private java.math.BigDecimal vtaDescuentoBaseNoObjeto;

    @Column(name = "vta_descuento_base_exenta")
    private java.math.BigDecimal vtaDescuentoBaseExenta;

    @Column(name = "vta_subtotal_base0")
    private java.math.BigDecimal vtaSubtotalBase0;

    @Column(name = "vta_subtotal_base_imponible")
    private java.math.BigDecimal vtaSubtotalBaseImponible;

    @Column(name = "vta_subtotal_base_no_objeto")
    private java.math.BigDecimal vtaSubtotalBaseNoObjeto;

    @Column(name = "vta_subtotal_base_exenta")
    private java.math.BigDecimal vtaSubtotalBaseExenta;

    @Column(name = "vta_base_no_objeto") //////
    private java.math.BigDecimal vtaBaseNoObjeto;

    @Column(name = "vta_base_exenta") /////
    private java.math.BigDecimal vtaBaseExenta;

    @Column(name = "vta_total") /////////
    private java.math.BigDecimal vtaTotal;///

    @Column(name = "cli_codigo")
    private String cliCodigo;

    @Column(name = "sec_codigo")
    private String secCodigo;

    @Column(name = "con_periodo")
    private String conPeriodo;

    @Column(name = "con_tipo")
    private String conTipo;

    @Column(name = "con_numero")
    private String conNumero;

    @Column(name = "usr_codigo")
    private String usuarioInserto;

    @Column(name = "usr_fecha_inserta")
    private String fechaUsuarioInserto;

    @Column(name = "com_documento_tipo")
    private String comDocumentoTipo;

    @Column(name = "com_documento_numero")
    private String comDocumentoNumero;

    @Column(name = "usr_modifica")
    private String usrModifica;

    @Column(name = "usr_fecha_modifica")
    private String usuarioModifico;

    @Column(name = "usr_comentario")
    private String usrComentario;

    @Column(name = "vta_pagado_efectivo")
    private BigDecimal vtaPagadoEfectivo;

    @Column(name = "vta_pagado_dinero_electronico")
    private BigDecimal vtaPagadoDineroElectronico;

    @Column(name = "vta_pagado_tarjeta_credito")
    private BigDecimal vtaPagadoTarjetaCredito;

    @Column(name = "vta_pagado_otros")
    private BigDecimal vtaPagadoOtro;

    @Column(name = "vta_lista_de_precios")
    private String vtaListaDePrecios;

    @Column(name = "fc_secuencial")
    private Integer fcSecuencial;

    @Column(name = "fc_banco")
    private String fcBanco;

    @Column(name = "fc_cuenta")
    private String fcCuenta;

    @Column(name = "fc_cheque")
    private String fcCheque;

    @Column(name = "fc_lote")
    private String fcLote;

    @Column(name = "fc_titular")
    private String fcTitular;

    @Column(name = "bod_empresa")
    private String bodEmpresa;

    @Column(name = "bod_codigo")
    private String bodCodigo;

    @Column(name = "vta_vendedor")
    private String vtaVendedor;

    @Column(name = "vta_consignacion")
    private boolean vtaConsignacion;

    @Column(name = "cli_codigo_establecimiento")
    private String cliCodigoEstablecimiento;

    @Column(name = "vta_monto_ice")
    private BigDecimal vtaMontoIce;

    @Column(name = "fecha_ultima_validacion_sri")
    private String fechaUltimaValidacionSri;
    @Column(name = "vta_negociable")
    private boolean vtaNegociable;

    public InvVentaCabeceraTO() {
    }

    public InvVentaCabeceraTO(String vtaDocumentoTipo, String vtaDocumentoNumero,
            String vtaFecha, String vtaFechaVencimiento, BigDecimal vtaIvaVigente, String vtaObservaciones,
            String vtaInformacionAdicional, Boolean vtaPendiente, Boolean vtaRevisado, Boolean vtaAnulado,
            String vtaFormaPago, BigDecimal vtaBase0, BigDecimal vtaBaseImponible, BigDecimal vtaMontoiva,
            BigDecimal vtaDescuentoBase0, BigDecimal vtaDescuentoBaseImponible, BigDecimal vtaDescuentoBaseNoObjeto,
            BigDecimal vtaDescuentoBaseExenta, BigDecimal vtaSubtotalBase0, BigDecimal vtaSubtotalBaseImponible,
            BigDecimal vtaSubtotalBaseNoObjeto, BigDecimal vtaSubtotalBaseExenta, BigDecimal vtaBaseNoObjeto,
            BigDecimal vtaBaseExenta, BigDecimal vtaTotal, String cliCodigo, String secCodigo, String conPeriodo,
            String conTipo, String conNumero, String usuarioInserto, String fechaUsuarioInserto,
            String comDocumentoTipo, String comDocumentoNumero, String usrModifica, String usuarioModifico,
            String usrComentario, BigDecimal vtaPagadoEfectivo, BigDecimal vtaPagadoDineroElectronico,
            BigDecimal vtaPagadoTarjetaCredito, BigDecimal vtaPagadoOtro, BigDecimal vtaMontoIce) {
        this.vtaDocumentoTipo = vtaDocumentoTipo;
        this.vtaDocumentoNumero = vtaDocumentoNumero;
        this.vtaFecha = vtaFecha;
        this.vtaFechaVencimiento = vtaFechaVencimiento;
        this.vtaIvaVigente = vtaIvaVigente;
        this.vtaObservaciones = vtaObservaciones;
        this.vtaInformacionAdicional = vtaInformacionAdicional;
        this.vtaPendiente = vtaPendiente;
        this.vtaRevisado = vtaRevisado;
        this.vtaAnulado = vtaAnulado;
        this.vtaFormaPago = vtaFormaPago;
        this.vtaBase0 = vtaBase0;
        this.vtaBaseImponible = vtaBaseImponible;
        this.vtaMontoiva = vtaMontoiva;
        this.vtaDescuentoBase0 = vtaDescuentoBase0;
        this.vtaDescuentoBaseImponible = vtaDescuentoBaseImponible;
        this.vtaDescuentoBaseNoObjeto = vtaDescuentoBaseNoObjeto;
        this.vtaDescuentoBaseExenta = vtaDescuentoBaseExenta;
        this.vtaSubtotalBase0 = vtaSubtotalBase0;
        this.vtaSubtotalBaseImponible = vtaSubtotalBaseImponible;
        this.vtaSubtotalBaseNoObjeto = vtaSubtotalBaseNoObjeto;
        this.vtaSubtotalBaseExenta = vtaSubtotalBaseExenta;
        this.vtaBaseNoObjeto = vtaBaseNoObjeto;
        this.vtaBaseExenta = vtaBaseExenta;
        this.vtaTotal = vtaTotal;
        this.cliCodigo = cliCodigo;
        this.secCodigo = secCodigo;
        this.conPeriodo = conPeriodo;
        this.conTipo = conTipo;
        this.conNumero = conNumero;
        this.usuarioInserto = usuarioInserto;
        this.fechaUsuarioInserto = fechaUsuarioInserto;
        this.comDocumentoTipo = comDocumentoTipo;
        this.comDocumentoNumero = comDocumentoNumero;
        this.usrModifica = usrModifica;
        this.usuarioModifico = usuarioModifico;
        this.usrComentario = usrComentario;
        this.vtaPagadoEfectivo = vtaPagadoEfectivo;
        this.vtaPagadoDineroElectronico = vtaPagadoDineroElectronico;
        this.vtaPagadoTarjetaCredito = vtaPagadoTarjetaCredito;
        this.vtaPagadoOtro = vtaPagadoOtro;
        this.vtaMontoIce = vtaMontoIce;
    }

    public String getUsrComentario() {
        return usrComentario;
    }

    public void setUsrComentario(String usrComentario) {
        this.usrComentario = usrComentario;
    }

    public String getVtaDocumentoTipo() {
        return vtaDocumentoTipo;
    }

    public void setVtaDocumentoTipo(String vtaDocumentoTipo) {
        this.vtaDocumentoTipo = vtaDocumentoTipo;
    }

    public String getVtaDocumentoNumero() {
        return vtaDocumentoNumero;
    }

    public void setVtaDocumentoNumero(String vtaDocumentoNumero) {
        this.vtaDocumentoNumero = vtaDocumentoNumero;
    }

    public String getVtaFecha() {
        return vtaFecha;
    }

    public void setVtaFecha(String vtaFecha) {
        this.vtaFecha = vtaFecha;
    }

    public String getVtaFechaVencimiento() {
        return vtaFechaVencimiento;
    }

    public void setVtaFechaVencimiento(String vtaFechaVencimiento) {
        this.vtaFechaVencimiento = vtaFechaVencimiento;
    }

    public java.math.BigDecimal getVtaIvaVigente() {
        return vtaIvaVigente;
    }

    public void setVtaIvaVigente(java.math.BigDecimal vtaIvaVigente) {
        this.vtaIvaVigente = vtaIvaVigente;
    }

    public String getVtaObservaciones() {
        return vtaObservaciones;
    }

    public void setVtaObservaciones(String vtaObservaciones) {
        this.vtaObservaciones = vtaObservaciones;
    }

    public String getVtaInformacionAdicional() {
        return vtaInformacionAdicional;
    }

    public void setVtaInformacionAdicional(String vtaInformacionAdicional) {
        this.vtaInformacionAdicional = vtaInformacionAdicional;
    }

    public Boolean getVtaPendiente() {
        return vtaPendiente;
    }

    public void setVtaPendiente(Boolean vtaPendiente) {
        this.vtaPendiente = vtaPendiente;
    }

    public Boolean getVtaRevisado() {
        return vtaRevisado;
    }

    public void setVtaRevisado(Boolean vtaRevisado) {
        this.vtaRevisado = vtaRevisado;
    }

    public Boolean getVtaAnulado() {
        return vtaAnulado;
    }

    public void setVtaAnulado(Boolean vtaAnulado) {
        this.vtaAnulado = vtaAnulado;
    }

    public String getVtaFormaPago() {
        return vtaFormaPago;
    }

    public void setVtaFormaPago(String vtaFormaPago) {
        this.vtaFormaPago = vtaFormaPago;
    }

    public java.math.BigDecimal getVtaBase0() {
        return vtaBase0;
    }

    public void setVtaBase0(java.math.BigDecimal vtaBase0) {
        this.vtaBase0 = vtaBase0;
    }

    public java.math.BigDecimal getVtaBaseImponible() {
        return vtaBaseImponible;
    }

    public void setVtaBaseImponible(java.math.BigDecimal vtaBaseImponible) {
        this.vtaBaseImponible = vtaBaseImponible;
    }

    public java.math.BigDecimal getVtaMontoiva() {
        return vtaMontoiva;
    }

    public void setVtaMontoiva(java.math.BigDecimal vtaMontoiva) {
        this.vtaMontoiva = vtaMontoiva;
    }

    public java.math.BigDecimal getVtaDescuentoBase0() {
        return vtaDescuentoBase0;
    }

    public void setVtaDescuentoBase0(java.math.BigDecimal vtaDescuentoBase0) {
        this.vtaDescuentoBase0 = vtaDescuentoBase0;
    }

    public java.math.BigDecimal getVtaDescuentoBaseImponible() {
        return vtaDescuentoBaseImponible;
    }

    public void setVtaDescuentoBaseImponible(java.math.BigDecimal vtaDescuentoBaseImponible) {
        this.vtaDescuentoBaseImponible = vtaDescuentoBaseImponible;
    }

    public java.math.BigDecimal getVtaDescuentoBaseNoObjeto() {
        return vtaDescuentoBaseNoObjeto;
    }

    public void setVtaDescuentoBaseNoObjeto(java.math.BigDecimal vtaDescuentoBaseNoObjeto) {
        this.vtaDescuentoBaseNoObjeto = vtaDescuentoBaseNoObjeto;
    }

    public java.math.BigDecimal getVtaDescuentoBaseExenta() {
        return vtaDescuentoBaseExenta;
    }

    public void setVtaDescuentoBaseExenta(java.math.BigDecimal vtaDescuentoBaseExenta) {
        this.vtaDescuentoBaseExenta = vtaDescuentoBaseExenta;
    }

    public java.math.BigDecimal getVtaSubtotalBase0() {
        return vtaSubtotalBase0;
    }

    public void setVtaSubtotalBase0(java.math.BigDecimal vtaSubtotalBase0) {
        this.vtaSubtotalBase0 = vtaSubtotalBase0;
    }

    public java.math.BigDecimal getVtaSubtotalBaseImponible() {
        return vtaSubtotalBaseImponible;
    }

    public void setVtaSubtotalBaseImponible(java.math.BigDecimal vtaSubtotalBaseImponible) {
        this.vtaSubtotalBaseImponible = vtaSubtotalBaseImponible;
    }

    public java.math.BigDecimal getVtaSubtotalBaseNoObjeto() {
        return vtaSubtotalBaseNoObjeto;
    }

    public void setVtaSubtotalBaseNoObjeto(java.math.BigDecimal vtaSubtotalBaseNoObjeto) {
        this.vtaSubtotalBaseNoObjeto = vtaSubtotalBaseNoObjeto;
    }

    public java.math.BigDecimal getVtaSubtotalBaseExenta() {
        return vtaSubtotalBaseExenta;
    }

    public void setVtaSubtotalBaseExenta(java.math.BigDecimal vtaSubtotalBaseExenta) {
        this.vtaSubtotalBaseExenta = vtaSubtotalBaseExenta;
    }

    public java.math.BigDecimal getVtaBaseNoObjeto() {
        return vtaBaseNoObjeto;
    }

    public void setVtaBaseNoObjeto(java.math.BigDecimal vtaBaseNoObjeto) {
        this.vtaBaseNoObjeto = vtaBaseNoObjeto;
    }

    public java.math.BigDecimal getVtaBaseExenta() {
        return vtaBaseExenta;
    }

    public void setVtaBaseExenta(java.math.BigDecimal vtaBaseExenta) {
        this.vtaBaseExenta = vtaBaseExenta;
    }

    public java.math.BigDecimal getVtaTotal() {
        return vtaTotal;
    }

    public void setVtaTotal(java.math.BigDecimal vtaTotal) {
        this.vtaTotal = vtaTotal;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getConPeriodo() {
        return conPeriodo;
    }

    public void setConPeriodo(String conPeriodo) {
        this.conPeriodo = conPeriodo;
    }

    public String getConTipo() {
        return conTipo;
    }

    public void setConTipo(String conTipo) {
        this.conTipo = conTipo;
    }

    public String getConNumero() {
        return conNumero;
    }

    public void setConNumero(String conNumero) {
        this.conNumero = conNumero;
    }

    public String getUsuarioInserto() {
        return usuarioInserto;
    }

    public void setUsuarioInserto(String usuarioInserto) {
        this.usuarioInserto = usuarioInserto;
    }

    public String getFechaUsuarioInserto() {
        return fechaUsuarioInserto;
    }

    public void setFechaUsuarioInserto(String fechaUsuarioInserto) {
        this.fechaUsuarioInserto = fechaUsuarioInserto;
    }

    public String getComDocumentoTipo() {
        return comDocumentoTipo;
    }

    public void setComDocumentoTipo(String comDocumentoTipo) {
        this.comDocumentoTipo = comDocumentoTipo;
    }

    public String getComDocumentoNumero() {
        return comDocumentoNumero;
    }

    public void setComDocumentoNumero(String comDocumentoNumero) {
        this.comDocumentoNumero = comDocumentoNumero;
    }

    public String getUsrModifica() {
        return usrModifica;
    }

    public void setUsrModifica(String usrModifica) {
        this.usrModifica = usrModifica;
    }

    public String getUsuarioModifico() {
        return usuarioModifico;
    }

    public void setUsuarioModifico(String usuarioModifico) {
        this.usuarioModifico = usuarioModifico;
    }

    public BigDecimal getVtaPagadoEfectivo() {
        return vtaPagadoEfectivo;
    }

    public void setVtaPagadoEfectivo(BigDecimal vtaPagadoEfectivo) {
        this.vtaPagadoEfectivo = vtaPagadoEfectivo;
    }

    public BigDecimal getVtaPagadoDineroElectronico() {
        return vtaPagadoDineroElectronico;
    }

    public void setVtaPagadoDineroElectronico(BigDecimal vtaPagadoDineroElectronico) {
        this.vtaPagadoDineroElectronico = vtaPagadoDineroElectronico;
    }

    public BigDecimal getVtaPagadoTarjetaCredito() {
        return vtaPagadoTarjetaCredito;
    }

    public void setVtaPagadoTarjetaCredito(BigDecimal vtaPagadoTarjetaCredito) {
        this.vtaPagadoTarjetaCredito = vtaPagadoTarjetaCredito;
    }

    public BigDecimal getVtaPagadoOtro() {
        return vtaPagadoOtro;
    }

    public void setVtaPagadoOtro(BigDecimal vtaPagadoOtro) {
        this.vtaPagadoOtro = vtaPagadoOtro;
    }

    public Integer getFcSecuencial() {
        return fcSecuencial;
    }

    public void setFcSecuencial(Integer fcSecuencial) {
        this.fcSecuencial = fcSecuencial;
    }

    public String getFcBanco() {
        return fcBanco;
    }

    public void setFcBanco(String fcBanco) {
        this.fcBanco = fcBanco;
    }

    public String getFcCuenta() {
        return fcCuenta;
    }

    public void setFcCuenta(String fcCuenta) {
        this.fcCuenta = fcCuenta;
    }

    public String getFcCheque() {
        return fcCheque;
    }

    public void setFcCheque(String fcCheque) {
        this.fcCheque = fcCheque;
    }

    public String getFcLote() {
        return fcLote;
    }

    public void setFcLote(String fcLote) {
        this.fcLote = fcLote;
    }

    public String getFcTitular() {
        return fcTitular;
    }

    public void setFcTitular(String fcTitular) {
        this.fcTitular = fcTitular;
    }

    public String getBodEmpresa() {
        return bodEmpresa;
    }

    public void setBodEmpresa(String bodEmpresa) {
        this.bodEmpresa = bodEmpresa;
    }

    public String getBodCodigo() {
        return bodCodigo;
    }

    public void setBodCodigo(String bodCodigo) {
        this.bodCodigo = bodCodigo;
    }

    public String getVtaListaDePrecios() {
        return vtaListaDePrecios;
    }

    public void setVtaListaDePrecios(String vtaListaDePrecios) {
        this.vtaListaDePrecios = vtaListaDePrecios;
    }

    public String getVtaVendedor() {
        return vtaVendedor;
    }

    public void setVtaVendedor(String vtaVendedor) {
        this.vtaVendedor = vtaVendedor;
    }

    public boolean isVtaConsignacion() {
        return vtaConsignacion;
    }

    public void setVtaConsignacion(boolean vtaConsignacion) {
        this.vtaConsignacion = vtaConsignacion;
    }

    public String getCliCodigoEstablecimiento() {
        return cliCodigoEstablecimiento;
    }

    public void setCliCodigoEstablecimiento(String cliCodigoEstablecimiento) {
        this.cliCodigoEstablecimiento = cliCodigoEstablecimiento;
    }

    public BigDecimal getVtaMontoIce() {
        return vtaMontoIce;
    }

    public void setVtaMontoIce(BigDecimal vtaMontoIce) {
        this.vtaMontoIce = vtaMontoIce;
    }

    public String getFechaUltimaValidacionSri() {
        return fechaUltimaValidacionSri;
    }

    public void setFechaUltimaValidacionSri(String fechaUltimaValidacionSri) {
        this.fechaUltimaValidacionSri = fechaUltimaValidacionSri;
    }

    public boolean isVtaNegociable() {
        return vtaNegociable;
    }

    public void setVtaNegociable(boolean vtaNegociable) {
        this.vtaNegociable = vtaNegociable;
    }

}
