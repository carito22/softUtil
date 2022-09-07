/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author DEVELOPER
 */
@Entity
public class InvVentasDetalleProductoTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "vta_numero_sistema")
    private String vtaNumeroSistema;
    @Column(name = "vta_fecha")
    private Date vtaFecha;
    @Column(name = "vta_fecha_vencimiento")
    private Date vtaFechaVencimiento;
    @Column(name = "vta_dias_credito")
    private Integer vtaDiasCredito;
    @Column(name = "vta_cliente_id")
    private String vtaClienteId;
    @Column(name = "vta_cliente_razon_social")
    private String vtaClienteRazonSocial;
    @Column(name = "vta_documento_tipo")
    private String vtaDocumentoTipo;
    @Column(name = "vta_documento_numero")
    private String vtaDocumentoNumero;
    @Column(name = "det_bodega")
    private String detBodega;
    @Column(name = "det_producto_codigo")
    private String detProductoCodigo;
    @Column(name = "det_producto_nombre")
    private String detProductoNombre;
    @Column(name = "det_producto_detalle")
    private String detProductoDetalle;
    @Column(name = "det_producto_marca")
    private String detProductoMarca;
    @Column(name = "det_producto_tipo")
    private String detProductoTipo;
    @Column(name = "det_cantidad")
    private BigDecimal detCantidad;
    @Column(name = "det_producto_medida")
    private String detProductoMedida;
    @Column(name = "det_precio")
    private BigDecimal detPrecio;
    @Column(name = "det_subtotal")
    private BigDecimal detSubtotal;
    @Column(name = "det_iva")
    private BigDecimal detIva;
    @Column(name = "det_total")
    private BigDecimal detTotal;
    @Column(name = "vta_forma_pago")
    private String vtaFormaPago;
    @Column(name = "vta_observaciones")
    private String vtaObservaciones;
    @Column(name = "det_centro_produccion")
    private String detCentroProduccion;
    @Column(name = "det_centro_costo")
    private String detCentroCosto;
    @Column(name = "vta_total_final")
    private BigDecimal vtaTotalFinal;
    @Column(name = "vta_cliente_codigo")
    private String vtaClienteCodigo;
    @Column(name = "vta_cliente_grupo_empresarial")
    private String vtaClienteGrupoEmpresarial;

    public InvVentasDetalleProductoTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVtaNumeroSistema() {
        return vtaNumeroSistema;
    }

    public void setVtaNumeroSistema(String vtaNumeroSistema) {
        this.vtaNumeroSistema = vtaNumeroSistema;
    }

    public Date getVtaFecha() {
        return vtaFecha;
    }

    public void setVtaFecha(Date vtaFecha) {
        this.vtaFecha = vtaFecha;
    }

    public Date getVtaFechaVencimiento() {
        return vtaFechaVencimiento;
    }

    public void setVtaFechaVencimiento(Date vtaFechaVencimiento) {
        this.vtaFechaVencimiento = vtaFechaVencimiento;
    }

    public Integer getVtaDiasCredito() {
        return vtaDiasCredito;
    }

    public void setVtaDiasCredito(Integer vtaDiasCredito) {
        this.vtaDiasCredito = vtaDiasCredito;
    }

    public String getVtaClienteId() {
        return vtaClienteId;
    }

    public void setVtaClienteId(String vtaClienteId) {
        this.vtaClienteId = vtaClienteId;
    }

    public String getVtaClienteRazonSocial() {
        return vtaClienteRazonSocial;
    }

    public void setVtaClienteRazonSocial(String vtaClienteRazonSocial) {
        this.vtaClienteRazonSocial = vtaClienteRazonSocial;
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

    public String getDetBodega() {
        return detBodega;
    }

    public void setDetBodega(String detBodega) {
        this.detBodega = detBodega;
    }

    public String getDetProductoCodigo() {
        return detProductoCodigo;
    }

    public void setDetProductoCodigo(String detProductoCodigo) {
        this.detProductoCodigo = detProductoCodigo;
    }

    public String getDetProductoNombre() {
        return detProductoNombre;
    }

    public void setDetProductoNombre(String detProductoNombre) {
        this.detProductoNombre = detProductoNombre;
    }

    public String getDetProductoMarca() {
        return detProductoMarca;
    }

    public void setDetProductoMarca(String detProductoMarca) {
        this.detProductoMarca = detProductoMarca;
    }

    public String getDetProductoTipo() {
        return detProductoTipo;
    }

    public void setDetProductoTipo(String detProductoTipo) {
        this.detProductoTipo = detProductoTipo;
    }

    public BigDecimal getDetCantidad() {
        return detCantidad;
    }

    public void setDetCantidad(BigDecimal detCantidad) {
        this.detCantidad = detCantidad;
    }

    public String getDetProductoMedida() {
        return detProductoMedida;
    }

    public void setDetProductoMedida(String detProductoMedida) {
        this.detProductoMedida = detProductoMedida;
    }

    public BigDecimal getDetPrecio() {
        return detPrecio;
    }

    public void setDetPrecio(BigDecimal detPrecio) {
        this.detPrecio = detPrecio;
    }

    public BigDecimal getDetSubtotal() {
        return detSubtotal;
    }

    public void setDetSubtotal(BigDecimal detSubtotal) {
        this.detSubtotal = detSubtotal;
    }

    public BigDecimal getDetIva() {
        return detIva;
    }

    public void setDetIva(BigDecimal detIva) {
        this.detIva = detIva;
    }

    public BigDecimal getDetTotal() {
        return detTotal;
    }

    public void setDetTotal(BigDecimal detTotal) {
        this.detTotal = detTotal;
    }

    public String getVtaFormaPago() {
        return vtaFormaPago;
    }

    public void setVtaFormaPago(String vtaFormaPago) {
        this.vtaFormaPago = vtaFormaPago;
    }

    public String getVtaObservaciones() {
        return vtaObservaciones;
    }

    public void setVtaObservaciones(String vtaObservaciones) {
        this.vtaObservaciones = vtaObservaciones;
    }

    public String getDetCentroProduccion() {
        return detCentroProduccion;
    }

    public void setDetCentroProduccion(String detCentroProduccion) {
        this.detCentroProduccion = detCentroProduccion;
    }

    public BigDecimal getVtaTotalFinal() {
        return vtaTotalFinal;
    }

    public void setVtaTotalFinal(BigDecimal vtaTotalFinal) {
        this.vtaTotalFinal = vtaTotalFinal;
    }

    public String getDetCentroCosto() {
        return detCentroCosto;
    }

    public void setDetCentroCosto(String detCentroCosto) {
        this.detCentroCosto = detCentroCosto;
    }

    public String getVtaClienteCodigo() {
        return vtaClienteCodigo;
    }

    public void setVtaClienteCodigo(String vtaClienteCodigo) {
        this.vtaClienteCodigo = vtaClienteCodigo;
    }

    public String getVtaClienteGrupoEmpresarial() {
        return vtaClienteGrupoEmpresarial;
    }

    public void setVtaClienteGrupoEmpresarial(String vtaClienteGrupoEmpresarial) {
        this.vtaClienteGrupoEmpresarial = vtaClienteGrupoEmpresarial;
    }

    public String getDetProductoDetalle() {
        return detProductoDetalle;
    }

    public void setDetProductoDetalle(String detProductoDetalle) {
        this.detProductoDetalle = detProductoDetalle;
    }

}
