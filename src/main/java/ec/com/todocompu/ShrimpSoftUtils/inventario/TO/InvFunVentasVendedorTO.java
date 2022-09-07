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
public class InvFunVentasVendedorTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "vta_numero_sistema")
    private String vtaNumeroSistema;

    @Column(name = "vta_vendedor_codigo")
    private String vtaVendedorCodigo;

    @Column(name = "vta_vendedor_nombre")
    private String vtaVendedorNombre;

    @Column(name = "vta_fecha")
    private String vtaFecha;

    @Column(name = "vta_identificacion")
    private String vtaIdentificacion;

    @Column(name = "vta_id_numero")
    private String vtaIdNumero;

    @Column(name = "vta_cliente")
    private String vtaCliente;

    @Column(name = "vta_documento_numero")
    private String vtaDocumentoNumero;

    @Column(name = "vta_documento_tipo")
    private String vtaDocumentoTipo;

    @Column(name = "vta_cantidad")
    private java.math.BigDecimal vtaCantidad;

    @Column(name = "vta_base0")
    private java.math.BigDecimal vtaBase0;

    @Column(name = "vta_base_imponible")
    private java.math.BigDecimal vtaBaseImponible;

    @Column(name = "vta_monto_iva")
    private java.math.BigDecimal vtaMontoIva;

    @Column(name = "vta_total")
    private java.math.BigDecimal vtaTotal;

    @Column(name = "vta_forma_pago")
    private String vtaFormaPago;

    @Column(name = "vta_observaciones")
    private String vtaObservaciones;

    @Column(name = "vta_pendiente")
    private Boolean vtaPendiente;

    @Column(name = "vta_anulado")
    private Boolean vtaAnulado;

    public InvFunVentasVendedorTO() {
    }

    public InvFunVentasVendedorTO(Integer id, String vtaNumeroSistema, String vtaFecha, String vtaIdentificacion,
            String vtaCliente, String vtaDocumentoNumero, BigDecimal vtaCantidad, BigDecimal vtaBase0,
            BigDecimal vtaBaseImponible, BigDecimal vtaMontoIva, BigDecimal vtaTotal, String vtaFormaPago,
            String vtaObservaciones, Boolean vtaPendiente, Boolean vtaAnulado) {

        this.id = id;
        this.vtaNumeroSistema = vtaNumeroSistema;
        this.vtaFecha = vtaFecha;
        this.vtaIdentificacion = vtaIdentificacion;
        this.vtaCliente = vtaCliente;
        this.vtaDocumentoNumero = vtaDocumentoNumero;
        this.vtaCantidad = vtaCantidad;
        this.vtaBase0 = vtaBase0;
        this.vtaBaseImponible = vtaBaseImponible;
        this.vtaMontoIva = vtaMontoIva;
        this.vtaTotal = vtaTotal;
        this.vtaFormaPago = vtaFormaPago;
        this.vtaObservaciones = vtaObservaciones;
        this.vtaPendiente = vtaPendiente;
        this.vtaAnulado = vtaAnulado;
    }

    public String getVtaIdentificacion() {
        return vtaIdentificacion;
    }

    public void setVtaIdentificacion(String vtaIdentificacion) {
        this.vtaIdentificacion = vtaIdentificacion;
    }

    public java.math.BigDecimal getVtaCantidad() {
        return vtaCantidad;
    }

    public void setVtaCantidad(java.math.BigDecimal vtaCantidad) {
        this.vtaCantidad = vtaCantidad;
    }

    public Boolean getVtaAnulado() {
        return vtaAnulado;
    }

    public void setVtaAnulado(Boolean vtaAnulado) {
        this.vtaAnulado = vtaAnulado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getVtaBase0() {
        return vtaBase0;
    }

    public void setVtaBase0(BigDecimal vtaBase0) {
        this.vtaBase0 = vtaBase0;
    }

    public BigDecimal getVtaBaseImponible() {
        return vtaBaseImponible;
    }

    public void setVtaBaseImponible(BigDecimal vtaBaseImponible) {
        this.vtaBaseImponible = vtaBaseImponible;
    }

    public String getVtaCliente() {
        return vtaCliente;
    }

    public void setVtaCliente(String vtaCliente) {
        this.vtaCliente = vtaCliente;
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

    public String getVtaFormaPago() {
        return vtaFormaPago;
    }

    public void setVtaFormaPago(String vtaFormaPago) {
        this.vtaFormaPago = vtaFormaPago;
    }

    public BigDecimal getVtaMontoIva() {
        return vtaMontoIva;
    }

    public void setVtaMontoIva(BigDecimal vtaMontoIva) {
        this.vtaMontoIva = vtaMontoIva;
    }

    public String getVtaNumeroSistema() {
        return vtaNumeroSistema;
    }

    public void setVtaNumeroSistema(String vtaNumeroSistema) {
        this.vtaNumeroSistema = vtaNumeroSistema;
    }

    public String getVtaObservaciones() {
        return vtaObservaciones;
    }

    public void setVtaObservaciones(String vtaObservaciones) {
        this.vtaObservaciones = vtaObservaciones;
    }

    public Boolean getVtaPendiente() {
        return vtaPendiente;
    }

    public void setVtaPendiente(Boolean vtaPendiente) {
        this.vtaPendiente = vtaPendiente;
    }

    public BigDecimal getVtaTotal() {
        return vtaTotal;
    }

    public void setVtaTotal(BigDecimal vtaTotal) {
        this.vtaTotal = vtaTotal;
    }

    public String getVtaIdNumero() {
        return vtaIdNumero;
    }

    public void setVtaIdNumero(String vtaIdNumero) {
        this.vtaIdNumero = vtaIdNumero;
    }

    public String getVtaDocumentoTipo() {
        return vtaDocumentoTipo;
    }

    public void setVtaDocumentoTipo(String vtaDocumentoTipo) {
        this.vtaDocumentoTipo = vtaDocumentoTipo;
    }

    public String getVtaVendedorCodigo() {
        return vtaVendedorCodigo;
    }

    public void setVtaVendedorCodigo(String vtaVendedorCodigo) {
        this.vtaVendedorCodigo = vtaVendedorCodigo;
    }

    public String getVtaVendedorNombre() {
        return vtaVendedorNombre;
    }

    public void setVtaVendedorNombre(String vtaVendedorNombre) {
        this.vtaVendedorNombre = vtaVendedorNombre;
    }

}
