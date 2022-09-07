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
public class InvListaDetalleVentasTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "lvd_secuencial")
    private Integer secuencial;

    @Column(name = "lvd_bodega")
    private String codigoBodega;

    @Column(name = "lvd_pendiente")
    private Boolean pendiente;

    @Column(name = "lvd_producto_codigo")
    private String codigoProducto;

    @Column(name = "lvd_producto_nombre")
    private String nombreProducto;

    @Column(name = "lvd_cantidad")
    private java.math.BigDecimal cantidadProducto;

    @Column(name = "lvd_medida")
    private String medidaDetalle;

    @Column(name = "lvd_precio")
    private java.math.BigDecimal precioProducto;

    @Column(name = "lvd_parcial")
    private java.math.BigDecimal parcialProducto;

    @Column(name = "lvd_recargo_porcentaje")
    private java.math.BigDecimal porcentajeRecargo;// 10

    @Column(name = "lvd_descuento_porcentaje")
    private java.math.BigDecimal porcentajeDescuento;

    @Column(name = "lvd_iva_cobrado")
    private java.math.BigDecimal ivaCobrado;

    @Column(name = "lvd_total")
    private java.math.BigDecimal detalleTotal;

    @Column(name = "lvd_sector")
    private String codigoCP;

    @Column(name = "lvd_piscina")
    private String codigoCC;

    @Column(name = "lvd_graba_iva")
    private String gravaIva;

    @Column(name = "lvd_modificar_precio")
    private Boolean editarFila;

    @Column(name = "lvd_cantidad_caja")
    private java.math.BigDecimal detCantidadCaja;

    @Column(name = "lvd_empaque")
    private String detEmpaque;

    @Column(name = "lvd_presentacion_unidad")
    private String detPresentacionUnidad;

    @Column(name = "lvd_presentacion_caja")
    private String detPresentacionCaja;

    @Column(name = "lvd_producto_tipo")
    private String detProductoTipo;

    @Column(name = "lvd_monto_ice")
    private java.math.BigDecimal detMontoIce;

    @Column(name = "lvd_ice_codigo")
    private String iceCodigo;

    @Column(name = "lvd_ice_porcentaje")
    private java.math.BigDecimal icePorcentaje;

    @Column(name = "lvd_ice_tarifa_fija")
    private java.math.BigDecimal iceTarifaFija;

    @Column(name = "lvd_pro_complementario")
    private Integer proComplementario;

    @Column(name = "det_observaciones")
    private String detObservaciones;

    @Column(name = "det_empaque")
    private String detEmpaqueExportadora;
    @Column(name = "det_empaque_cantidad")
    private BigDecimal detEmpaqueCantidad;
    @Column(name = "det_conversion_peso_neto")
    private BigDecimal detConversionPesoNeto;

    public InvListaDetalleVentasTO() {
    }

    public InvListaDetalleVentasTO(Integer secuencial, String codigoBodega, Boolean pendiente, String codigoProducto,
            String nombreProducto, BigDecimal cantidadProducto, String medidaDetalle, BigDecimal precioProducto,
            BigDecimal parcialProducto, BigDecimal porcentajeRecargo, BigDecimal porcentajeDescuento,
            BigDecimal ivaCobrado, BigDecimal detalleTotal, String codigoCP, String codigoCC, String gravaIva,
            Boolean editarFila, BigDecimal detCantidadCaja, String detEmpaque, String detPresentacionUnidad,
            String detPresentacionCaja, String detProductoTipo, Integer id,
            BigDecimal detMontoIce, BigDecimal iceTarifaFija, BigDecimal icePorcentaje, String iceCodigo) {
        this.secuencial = secuencial;
        this.codigoBodega = codigoBodega;
        this.pendiente = pendiente;
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.cantidadProducto = cantidadProducto;
        this.medidaDetalle = medidaDetalle;
        this.precioProducto = precioProducto;
        this.parcialProducto = parcialProducto;
        this.porcentajeRecargo = porcentajeRecargo;
        this.porcentajeDescuento = porcentajeDescuento;
        this.ivaCobrado = ivaCobrado;
        this.detalleTotal = detalleTotal;
        this.codigoCP = codigoCP;
        this.codigoCC = codigoCC;
        this.gravaIva = gravaIva;
        this.editarFila = editarFila;
        this.detCantidadCaja = detCantidadCaja;
        this.detEmpaque = detEmpaque;
        this.detPresentacionUnidad = detPresentacionUnidad;
        this.detPresentacionCaja = detPresentacionCaja;
        this.detProductoTipo = detProductoTipo;
        this.id = id;
        this.detMontoIce = detMontoIce;
        this.iceTarifaFija = iceTarifaFija;
        this.icePorcentaje = icePorcentaje;
        this.iceCodigo = iceCodigo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGravaIva() {
        return gravaIva;
    }

    public void setGravaIva(String gravaIva) {
        this.gravaIva = gravaIva;
    }

    public BigDecimal getIvaCobrado() {
        return ivaCobrado;
    }

    public void setIvaCobrado(BigDecimal ivaCobrado) {
        this.ivaCobrado = ivaCobrado;
    }

    public BigDecimal getPorcentajeRecargo() {
        return porcentajeRecargo;
    }

    public void setPorcentajeRecargo(BigDecimal porcentajeRecargo) {
        this.porcentajeRecargo = porcentajeRecargo;
    }

    public BigDecimal getDetCantidadCaja() {
        return detCantidadCaja;
    }

    public void setDetCantidadCaja(BigDecimal detCantidadCaja) {
        this.detCantidadCaja = detCantidadCaja;
    }

    public String getDetEmpaque() {
        return detEmpaque;
    }

    public void setDetEmpaque(String detEmpaque) {
        this.detEmpaque = detEmpaque;
    }

    public String getDetPresentacionUnidad() {
        return detPresentacionUnidad;
    }

    public void setDetPresentacionUnidad(String detPresentacionUnidad) {
        this.detPresentacionUnidad = detPresentacionUnidad;
    }

    public String getDetPresentacionCaja() {
        return detPresentacionCaja;
    }

    public void setDetPresentacionCaja(String detPresentacionCaja) {
        this.detPresentacionCaja = detPresentacionCaja;
    }

    public BigDecimal getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(BigDecimal cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getCodigoBodega() {
        return codigoBodega;
    }

    public void setCodigoBodega(String codigoBodega) {
        this.codigoBodega = codigoBodega;
    }

    public String getCodigoCC() {
        return codigoCC;
    }

    public void setCodigoCC(String codigoCC) {
        this.codigoCC = codigoCC;
    }

    public String getCodigoCP() {
        return codigoCP;
    }

    public void setCodigoCP(String codigoCP) {
        this.codigoCP = codigoCP;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public BigDecimal getDetalleTotal() {
        return detalleTotal;
    }

    public void setDetalleTotal(BigDecimal detalleTotal) {
        this.detalleTotal = detalleTotal;
    }

    public Boolean getEditarFila() {
        return editarFila;
    }

    public void setEditarFila(Boolean editarFila) {
        this.editarFila = editarFila;
    }

    public String getMedidaDetalle() {
        return medidaDetalle;
    }

    public void setMedidaDetalle(String medidaDetalle) {
        this.medidaDetalle = medidaDetalle;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public BigDecimal getParcialProducto() {
        return parcialProducto;
    }

    public void setParcialProducto(BigDecimal parcialProducto) {
        this.parcialProducto = parcialProducto;
    }

    public Boolean getPendiente() {
        return pendiente;
    }

    public void setPendiente(Boolean pendiente) {
        this.pendiente = pendiente;
    }

    public BigDecimal getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(BigDecimal porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public BigDecimal getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(BigDecimal precioProducto) {
        this.precioProducto = precioProducto;
    }

    public Integer getSecuencial() {
        return secuencial;
    }

    public void setSecuencial(Integer secuencial) {
        this.secuencial = secuencial;
    }

    public String getDetProductoTipo() {
        return detProductoTipo;
    }

    public void setDetProductoTipo(String detProductoTipo) {
        this.detProductoTipo = detProductoTipo;
    }

    public BigDecimal getDetMontoIce() {
        return detMontoIce;
    }

    public void setDetMontoIce(BigDecimal detMontoIce) {
        this.detMontoIce = detMontoIce;
    }

    public String getIceCodigo() {
        return iceCodigo;
    }

    public void setIceCodigo(String iceCodigo) {
        this.iceCodigo = iceCodigo;
    }

    public BigDecimal getIcePorcentaje() {
        return icePorcentaje;
    }

    public void setIcePorcentaje(BigDecimal icePorcentaje) {
        this.icePorcentaje = icePorcentaje;
    }

    public BigDecimal getIceTarifaFija() {
        return iceTarifaFija;
    }

    public void setIceTarifaFija(BigDecimal iceTarifaFija) {
        this.iceTarifaFija = iceTarifaFija;
    }

    public Integer getProComplementario() {
        return proComplementario;
    }

    public void setProComplementario(Integer proComplementario) {
        this.proComplementario = proComplementario;
    }

    public String getDetObservaciones() {
        return detObservaciones;
    }

    public void setDetObservaciones(String detObservaciones) {
        this.detObservaciones = detObservaciones;
    }

    public String getDetEmpaqueExportadora() {
        return detEmpaqueExportadora;
    }

    public void setDetEmpaqueExportadora(String detEmpaqueExportadora) {
        this.detEmpaqueExportadora = detEmpaqueExportadora;
    }

    public BigDecimal getDetEmpaqueCantidad() {
        return detEmpaqueCantidad;
    }

    public void setDetEmpaqueCantidad(BigDecimal detEmpaqueCantidad) {
        this.detEmpaqueCantidad = detEmpaqueCantidad;
    }

    public BigDecimal getDetConversionPesoNeto() {
        return detConversionPesoNeto;
    }

    public void setDetConversionPesoNeto(BigDecimal detConversionPesoNeto) {
        this.detConversionPesoNeto = detConversionPesoNeto;
    }

}
