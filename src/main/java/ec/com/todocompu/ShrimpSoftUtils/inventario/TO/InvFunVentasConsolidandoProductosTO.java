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
public class InvFunVentasConsolidandoProductosTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "vcp_producto")
	private String vcpProducto;

	@Column(name = "vcp_codigo")
	private String vcpCodigo;

	@Column(name = "vcp_medida")
	private String vcpMedida;

	@Column(name = "vcp_cantidad")
	private java.math.BigDecimal vcpCantidad;

	@Column(name = "vcp_total")
	private java.math.BigDecimal vcpTotal;

	@Column(name = "vcp_porcentaje")
	private java.math.BigDecimal vcpPorcentaje;

	public InvFunVentasConsolidandoProductosTO() {
	}

	public InvFunVentasConsolidandoProductosTO(String vcpProducto, String vcpCodigo, String vcpMedida,
			BigDecimal vcpCantidad, BigDecimal vcpTotal, BigDecimal vcpPorcentaje, Integer id) {
		this.vcpProducto = vcpProducto;
		this.vcpCodigo = vcpCodigo;
		this.vcpMedida = vcpMedida;
		this.vcpCantidad = vcpCantidad;
		this.vcpTotal = vcpTotal;
		this.vcpPorcentaje = vcpPorcentaje;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getVcpCantidad() {
		return vcpCantidad;
	}

	public void setVcpCantidad(BigDecimal vcpCantidad) {
		this.vcpCantidad = vcpCantidad;
	}

	public String getVcpCodigo() {
		return vcpCodigo;
	}

	public void setVcpCodigo(String vcpCodigo) {
		this.vcpCodigo = vcpCodigo;
	}

	public String getVcpMedida() {
		return vcpMedida;
	}

	public void setVcpMedida(String vcpMedida) {
		this.vcpMedida = vcpMedida;
	}

	public BigDecimal getVcpPorcentaje() {
		return vcpPorcentaje;
	}

	public void setVcpPorcentaje(BigDecimal vcpPorcentaje) {
		this.vcpPorcentaje = vcpPorcentaje;
	}

	public String getVcpProducto() {
		return vcpProducto;
	}

	public void setVcpProducto(String vcpProducto) {
		this.vcpProducto = vcpProducto;
	}

	public BigDecimal getVcpTotal() {
		return vcpTotal;
	}

	public void setVcpTotal(BigDecimal vcpTotal) {
		this.vcpTotal = vcpTotal;
	}

}
