/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
public class AnxRetencionVentaTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ret_id")
    private Integer id;
    @Column(name = "ret_cli_id_numero")
    private String retCliIdNumero;
    @Column(name = "ret_cli_razon_social")
    private String retCliRazonSocial;
    @Column(name = "ret_tc_descripcion")
    private String retTcDescripcion;
    @Column(name = "ret_vta_documento_numero")
    private String retVtaDocumentoNumero;
    @Column(name = "ret_vta_autorizacion")
    private String retVtaAutorizacion;
    @Column(name = "ret_vta_fecha")
    private Date retVtaFecha;
    @Column(name = "ret_venta")
    private String retVenta;
    @Column(name = "ret_vta_base0")
    private BigDecimal retVtaBase0;
    @Column(name = "ret_vta_base_imponible")
    private BigDecimal retVtaBaseImponible;
    @Column(name = "ret_ice")
    private BigDecimal retIce;
    @Column(name = "ret_vta_monto_iva")
    private BigDecimal retVtaMontoIva;
    @Column(name = "ret_vta_retencion_autorizacion")
    private String retVtaRetencionAutorizacion;
    @Column(name = "ret_vta_retencion_numero")
    private String retVtaRetencionNumero;
    @Column(name = "ret_vta_retencion_fecha_emision")
    private Date retVtaRetencionFechaEmision;
    @Column(name = "ret_valor_retenido_ir")
    private BigDecimal retValorRetenidoIr;
    @Column(name = "ret_valor_retenido_iva")
    private BigDecimal retValorRetenidoIva;
    @Column(name = "ret_total_retenido")
    private BigDecimal retTotalRetenido;
    @Column(name = "ret_vta_observaciones")
    private String retVtaObservaciones;
    @Column(name = "ret_vta_forma_pago")
    private String retVtaFormaPago;
    @Column(name = "ret_vta_total")
    private BigDecimal retVtaTotal;
    @Column(name = "ret_valor_retenido")
    private BigDecimal retValorRetenido;
    @Column(name = "ret_valor_soportar")
    private BigDecimal retValorSoportar;
    @Column(name = "ret_valor_soportar_cheque_deposito")
    private BigDecimal retValorSoportarChequeDeposito;
    @Column(name = "ret_vta_estado")
    private Boolean retVtaEstado;

    public AnxRetencionVentaTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRetCliIdNumero() {
        return retCliIdNumero;
    }

    public void setRetCliIdNumero(String retCliIdNumero) {
        this.retCliIdNumero = retCliIdNumero;
    }

    public String getRetCliRazonSocial() {
        return retCliRazonSocial;
    }

    public void setRetCliRazonSocial(String retCliRazonSocial) {
        this.retCliRazonSocial = retCliRazonSocial;
    }

    public String getRetTcDescripcion() {
        return retTcDescripcion;
    }

    public void setRetTcDescripcion(String retTcDescripcion) {
        this.retTcDescripcion = retTcDescripcion;
    }

    public String getRetVtaDocumentoNumero() {
        return retVtaDocumentoNumero;
    }

    public void setRetVtaDocumentoNumero(String retVtaDocumentoNumero) {
        this.retVtaDocumentoNumero = retVtaDocumentoNumero;
    }

    public String getRetVtaAutorizacion() {
        return retVtaAutorizacion;
    }

    public void setRetVtaAutorizacion(String retVtaAutorizacion) {
        this.retVtaAutorizacion = retVtaAutorizacion;
    }

    public Date getRetVtaFecha() {
        return retVtaFecha;
    }

    public void setRetVtaFecha(Date retVtaFecha) {
        this.retVtaFecha = retVtaFecha;
    }

    public String getRetVenta() {
        return retVenta;
    }

    public void setRetVenta(String retVenta) {
        this.retVenta = retVenta;
    }

    public BigDecimal getRetVtaBase0() {
        return retVtaBase0;
    }

    public void setRetVtaBase0(BigDecimal retVtaBase0) {
        this.retVtaBase0 = retVtaBase0;
    }

    public BigDecimal getRetVtaBaseImponible() {
        return retVtaBaseImponible;
    }

    public void setRetVtaBaseImponible(BigDecimal retVtaBaseImponible) {
        this.retVtaBaseImponible = retVtaBaseImponible;
    }

    public BigDecimal getRetIce() {
        return retIce;
    }

    public void setRetIce(BigDecimal retIce) {
        this.retIce = retIce;
    }

    public BigDecimal getRetVtaMontoIva() {
        return retVtaMontoIva;
    }

    public void setRetVtaMontoIva(BigDecimal retVtaMontoIva) {
        this.retVtaMontoIva = retVtaMontoIva;
    }

    public String getRetVtaRetencionAutorizacion() {
        return retVtaRetencionAutorizacion;
    }

    public void setRetVtaRetencionAutorizacion(String retVtaRetencionAutorizacion) {
        this.retVtaRetencionAutorizacion = retVtaRetencionAutorizacion;
    }

    public String getRetVtaRetencionNumero() {
        return retVtaRetencionNumero;
    }

    public void setRetVtaRetencionNumero(String retVtaRetencionNumero) {
        this.retVtaRetencionNumero = retVtaRetencionNumero;
    }

    public Date getRetVtaRetencionFechaEmision() {
        return retVtaRetencionFechaEmision;
    }

    public void setRetVtaRetencionFechaEmision(Date retVtaRetencionFechaEmision) {
        this.retVtaRetencionFechaEmision = retVtaRetencionFechaEmision;
    }

    public BigDecimal getRetValorRetenidoIr() {
        return retValorRetenidoIr;
    }

    public void setRetValorRetenidoIr(BigDecimal retValorRetenidoIr) {
        this.retValorRetenidoIr = retValorRetenidoIr;
    }

    public BigDecimal getRetValorRetenidoIva() {
        return retValorRetenidoIva;
    }

    public void setRetValorRetenidoIva(BigDecimal retValorRetenidoIva) {
        this.retValorRetenidoIva = retValorRetenidoIva;
    }

    public BigDecimal getRetTotalRetenido() {
        return retTotalRetenido;
    }

    public void setRetTotalRetenido(BigDecimal retTotalRetenido) {
        this.retTotalRetenido = retTotalRetenido;
    }

    public String getRetVtaObservaciones() {
        return retVtaObservaciones;
    }

    public void setRetVtaObservaciones(String retVtaObservaciones) {
        this.retVtaObservaciones = retVtaObservaciones;
    }

    public String getRetVtaFormaPago() {
        return retVtaFormaPago;
    }

    public void setRetVtaFormaPago(String retVtaFormaPago) {
        this.retVtaFormaPago = retVtaFormaPago;
    }

    public BigDecimal getRetVtaTotal() {
        return retVtaTotal;
    }

    public void setRetVtaTotal(BigDecimal retVtaTotal) {
        this.retVtaTotal = retVtaTotal;
    }

    public BigDecimal getRetValorRetenido() {
        return retValorRetenido;
    }

    public void setRetValorRetenido(BigDecimal retValorRetenido) {
        this.retValorRetenido = retValorRetenido;
    }

    public BigDecimal getRetValorSoportar() {
        return retValorSoportar;
    }

    public void setRetValorSoportar(BigDecimal retValorSoportar) {
        this.retValorSoportar = retValorSoportar;
    }

    public BigDecimal getRetValorSoportarChequeDeposito() {
        return retValorSoportarChequeDeposito;
    }

    public void setRetValorSoportarChequeDeposito(BigDecimal retValorSoportarChequeDeposito) {
        this.retValorSoportarChequeDeposito = retValorSoportarChequeDeposito;
    }

    public Boolean getRetVtaEstado() {
        return retVtaEstado;
    }

    public void setRetVtaEstado(Boolean retVtaEstado) {
        this.retVtaEstado = retVtaEstado;
    }

}
