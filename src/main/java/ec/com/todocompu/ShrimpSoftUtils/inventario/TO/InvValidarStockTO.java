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
public class InvValidarStockTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "v_bodega")
	private String bodega;

	@Column(name = "v_producto_codigo")
	private String codigoProducto;

	@Column(name = "v_producto_nombre")
	private String nombreProducto;

	@Column(name = "v_cantidad")
	private BigDecimal cantidad;

	@Column(name = "v_disponible")
	private BigDecimal disponible;

	public InvValidarStockTO() {
	}

	public InvValidarStockTO(Integer id, String bodega, String codigoProducto, String nombreProducto,
			BigDecimal cantidad, BigDecimal disponible) {
		this.id = id;
		this.bodega = bodega;
		this.codigoProducto = codigoProducto;
		this.nombreProducto = nombreProducto;
		this.cantidad = cantidad;
		this.disponible = disponible;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBodega() {
		return bodega;
	}

	public void setBodega(String bodega) {
		this.bodega = bodega;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public BigDecimal getCantidad() {
		return cantidad;
	}

	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getDisponible() {
		return disponible;
	}

	public void setDisponible(BigDecimal disponible) {
		this.disponible = disponible;
	}

}
