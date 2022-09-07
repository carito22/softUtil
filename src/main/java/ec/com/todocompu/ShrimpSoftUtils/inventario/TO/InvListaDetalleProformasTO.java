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
public class InvListaDetalleProformasTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "lpd_secuencial")
	private Integer secuencial;

	@Column(name = "lpd_producto_codigo")
	private String codigoProducto;

	@Column(name = "lpd_producto_nombre")
	private String nombreProducto;

	@Column(name = "lpd_cantidad")
	private java.math.BigDecimal cantidadProducto;

	@Column(name = "lpd_medida")
	private String medidaDetalle;

	@Column(name = "lpd_precio")
	private java.math.BigDecimal precioProducto;

	@Column(name = "lpd_parcial")
	private java.math.BigDecimal parcialProducto;

	@Column(name = "lpd_porcentaje_recargo")
	private java.math.BigDecimal porcentajeRecargo;

	@Column(name = "lpd_porcentaje_descuento")
	private java.math.BigDecimal porcentajeDescuento;

	@Column(name = "lpd_iva_cobrado")
	private java.math.BigDecimal ivaCobrado;

	@Column(name = "lpd_subtotal")
	private java.math.BigDecimal detalleTotal;

	@Column(name = "lpd_iva")
	private Boolean gravaIva;

	@Column(name = "lpd_modificar_precio")
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

	public InvListaDetalleProformasTO() {
	}

	public InvListaDetalleProformasTO(Integer secuencial, String codigoProducto, String nombreProducto,
			BigDecimal cantidadProducto, String medidaDetalle, BigDecimal precioProducto, BigDecimal parcialProducto,
			BigDecimal porcentajeRecargo, BigDecimal porcentajeDescuento, BigDecimal ivaCobrado,
			BigDecimal detalleTotal, Boolean gravaIva, Boolean editarFila, BigDecimal detCantidadCaja,
			String detEmpaque, String detPresentacionUnidad, String detPresentacionCaja, String detProductoTipo,
			Integer id) {
		this.secuencial = secuencial;
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
		this.gravaIva = gravaIva;
		this.editarFila = editarFila;
		this.detCantidadCaja = detCantidadCaja;
		this.detEmpaque = detEmpaque;
		this.detPresentacionUnidad = detPresentacionUnidad;
		this.detPresentacionCaja = detPresentacionCaja;
		this.detProductoTipo = detProductoTipo;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(BigDecimal cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
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

	public String getDetPresentacionCaja() {
		return detPresentacionCaja;
	}

	public void setDetPresentacionCaja(String detPresentacionCaja) {
		this.detPresentacionCaja = detPresentacionCaja;
	}

	public String getDetPresentacionUnidad() {
		return detPresentacionUnidad;
	}

	public void setDetPresentacionUnidad(String detPresentacionUnidad) {
		this.detPresentacionUnidad = detPresentacionUnidad;
	}

	public String getDetProductoTipo() {
		return detProductoTipo;
	}

	public void setDetProductoTipo(String detProductoTipo) {
		this.detProductoTipo = detProductoTipo;
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

	public Boolean getGravaIva() {
		return gravaIva;
	}

	public void setGravaIva(Boolean gravaIva) {
		this.gravaIva = gravaIva;
	}

	public BigDecimal getIvaCobrado() {
		return ivaCobrado;
	}

	public void setIvaCobrado(BigDecimal ivaCobrado) {
		this.ivaCobrado = ivaCobrado;
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

	public BigDecimal getPorcentajeDescuento() {
		return porcentajeDescuento;
	}

	public void setPorcentajeDescuento(BigDecimal porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	public BigDecimal getPorcentajeRecargo() {
		return porcentajeRecargo;
	}

	public void setPorcentajeRecargo(BigDecimal porcentajeRecargo) {
		this.porcentajeRecargo = porcentajeRecargo;
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
}
