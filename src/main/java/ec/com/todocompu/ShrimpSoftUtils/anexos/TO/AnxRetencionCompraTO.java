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
public class AnxRetencionCompraTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ret_id")
    private Integer id;

    @Column(name = "ret_sustentotributario")
    private String retSustentoTributario;

    @Column(name = "ret_prov_id_numero")
    private String retProvIdNumero;

    @Column(name = "ret_prov_razon_social")
    private String retProvRazonSocial;

    @Column(name = "ret_tc_descripcion")
    private String retTcDescripcion;

    @Column(name = "ret_comp_documento_numero")
    private String retCompDocumentoNumero;

    @Column(name = "ret_comp_autorizacion")
    private String retCompAutorizacion;
    
    @Column(name = "ret_comp_fecha_autorizacion")
    private String retCompFechaAutorizacion;
    
    @Column(name = "ret_comp_fecha_caduca")
    private String retCompFechaCaduca;

    @Column(name = "ret_comp_fecha")
    private Date retCompFecha;

    @Column(name = "ret_compra")
    private String retCompra;

    @Column(name = "ret_comp_base0")
    private BigDecimal retCompBase0;

    @Column(name = "ret_comp_base_imponible")
    private BigDecimal retCompBaseImponible;

    @Column(name = "ret_ice")
    private BigDecimal retIce;

    @Column(name = "ret_comp_monto_iva")
    private BigDecimal retCompMontoIva;

    @Column(name = "ret_comp_retencion_autorizacion")
    private String retCompRetencionAutorizacion;

    @Column(name = "ret_comp_retencion_numero")
    private String retCompRetencionNumero;

    @Column(name = "ret_comp_retencion_fecha_emision")
    private Date retCompRetencionFechaEmision;

    @Column(name = "ret_valor_retenido_ir")
    private BigDecimal retValorRetenidoIr;

    @Column(name = "ret_valor_retenido_iva")
    private BigDecimal retValorRetenidoIva;

    @Column(name = "ret_total_retenido")
    private BigDecimal retTotalRetenido;

    @Column(name = "ret_comp_observaciones")
    private String retCompObservaciones;
    @Column(name = "ret_comp_forma_pago")
    private String retCompFormaPago;
    @Column(name = "ret_comp_documento")
    private String retCompDocumento;

    @Column(name = "ret_comp_total")
    private BigDecimal retCompTotal;
    @Column(name = "ret_valor_retenido")
    private BigDecimal retValorRetenido;
    @Column(name = "ret_valor_soportar")
    private BigDecimal retValorSoportar;
    @Column(name = "ret_valor_soportar_cheque_deposito")
    private BigDecimal retValorSoportarChequeDeposito;
    @Column(name = "ret_comp_estado")
    private Boolean retCompEstado;

    public AnxRetencionCompraTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRetSustentoTributario() {
        return retSustentoTributario;
    }

    public void setRetSustentoTributario(String retSustentoTributario) {
        this.retSustentoTributario = retSustentoTributario;
    }

    public String getRetProvIdNumero() {
        return retProvIdNumero;
    }

    public void setRetProvIdNumero(String retProvIdNumero) {
        this.retProvIdNumero = retProvIdNumero;
    }

    public String getRetProvRazonSocial() {
        return retProvRazonSocial;
    }

    public void setRetProvRazonSocial(String retProvRazonSocial) {
        this.retProvRazonSocial = retProvRazonSocial;
    }

    public String getRetTcDescripcion() {
        return retTcDescripcion;
    }

    public void setRetTcDescripcion(String retTcDescripcion) {
        this.retTcDescripcion = retTcDescripcion;
    }

    public String getRetCompDocumentoNumero() {
        return retCompDocumentoNumero;
    }

    public void setRetCompDocumentoNumero(String retCompDocumentoNumero) {
        this.retCompDocumentoNumero = retCompDocumentoNumero;
    }

    public String getRetCompAutorizacion() {
        return retCompAutorizacion;
    }

    public void setRetCompAutorizacion(String retCompAutorizacion) {
        this.retCompAutorizacion = retCompAutorizacion;
    }

    public BigDecimal getRetCompBase0() {
        return retCompBase0;
    }

    public void setRetCompBase0(BigDecimal retCompBase0) {
        this.retCompBase0 = retCompBase0;
    }

    public BigDecimal getRetCompBaseImponible() {
        return retCompBaseImponible;
    }

    public void setRetCompBaseImponible(BigDecimal retCompBaseImponible) {
        this.retCompBaseImponible = retCompBaseImponible;
    }

    public BigDecimal getRetCompMontoIva() {
        return retCompMontoIva;
    }

    public void setRetCompMontoIva(BigDecimal retCompMontoIva) {
        this.retCompMontoIva = retCompMontoIva;
    }

    public String getRetCompRetencionAutorizacion() {
        return retCompRetencionAutorizacion;
    }

    public void setRetCompRetencionAutorizacion(String retCompRetencionAutorizacion) {
        this.retCompRetencionAutorizacion = retCompRetencionAutorizacion;
    }

    public String getRetCompRetencionNumero() {
        return retCompRetencionNumero;
    }

    public void setRetCompRetencionNumero(String retCompRetencionNumero) {
        this.retCompRetencionNumero = retCompRetencionNumero;
    }

    public Date getRetCompRetencionFechaEmision() {
        return retCompRetencionFechaEmision;
    }

    public void setRetCompRetencionFechaEmision(Date retCompRetencionFechaEmision) {
        this.retCompRetencionFechaEmision = retCompRetencionFechaEmision;
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

    public Date getRetCompFecha() {
        return retCompFecha;
    }

    public void setRetCompFecha(Date retCompFecha) {
        this.retCompFecha = retCompFecha;
    }

    public String getRetCompra() {
        return retCompra;
    }

    public void setRetCompra(String retCompra) {
        this.retCompra = retCompra;
    }

    public String getRetCompObservaciones() {
        return retCompObservaciones;
    }

    public void setRetCompObservaciones(String retCompObservaciones) {
        this.retCompObservaciones = retCompObservaciones;
    }

    public String getRetCompFormaPago() {
        return retCompFormaPago;
    }

    public void setRetCompFormaPago(String retCompFormaPago) {
        this.retCompFormaPago = retCompFormaPago;
    }

    public String getRetCompDocumento() {
        return retCompDocumento;
    }

    public void setRetCompDocumento(String retCompDocumento) {
        this.retCompDocumento = retCompDocumento;
    }

    public BigDecimal getRetCompTotal() {
        return retCompTotal;
    }

    public void setRetCompTotal(BigDecimal retCompTotal) {
        this.retCompTotal = retCompTotal;
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

    public BigDecimal getRetIce() {
        return retIce;
    }

    public void setRetIce(BigDecimal retIce) {
        this.retIce = retIce;
    }

    public Boolean getRetCompEstado() {
        return retCompEstado;
    }

    public void setRetCompEstado(Boolean retCompEstado) {
        this.retCompEstado = retCompEstado;
    }

    public String getRetCompFechaAutorizacion() {
        return retCompFechaAutorizacion;
    }

    public void setRetCompFechaAutorizacion(String retCompFechaAutorizacion) {
        this.retCompFechaAutorizacion = retCompFechaAutorizacion;
    }

    public String getRetCompFechaCaduca() {
        return retCompFechaCaduca;
    }

    public void setRetCompFechaCaduca(String retCompFechaCaduca) {
        this.retCompFechaCaduca = retCompFechaCaduca;
    }

}
