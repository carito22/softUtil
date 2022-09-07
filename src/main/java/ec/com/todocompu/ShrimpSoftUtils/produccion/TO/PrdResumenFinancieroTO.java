/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdResumenFinancieroTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	// @Column(name = "id")
	private String costoProducto;

	// @Column(name = "id")
	private String costoCodigo;

	// @Column(name = "id")
	private String costoMedida;

	// @Column(name = "id")
	private java.math.BigDecimal costoCantidad;

	// @Column(name = "id")
	private java.math.BigDecimal costoTotal;

	// @Column(name = "id")
	private java.math.BigDecimal costoPorcentaje;

	public PrdResumenFinancieroTO() {
	}

	public PrdResumenFinancieroTO(String costoProducto, String costoCodigo, String costoMedida,
			BigDecimal costoCantidad, BigDecimal costoTotal, BigDecimal costoPorcentaje, Integer id) {
		this.costoProducto = costoProducto;
		this.costoCodigo = costoCodigo;
		this.costoMedida = costoMedida;
		this.costoCantidad = costoCantidad;
		this.costoTotal = costoTotal;
		this.costoPorcentaje = costoPorcentaje;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getCostoCantidad() {
		return costoCantidad;
	}

	public void setCostoCantidad(BigDecimal costoCantidad) {
		this.costoCantidad = costoCantidad;
	}

	public String getCostoCodigo() {
		return costoCodigo;
	}

	public void setCostoCodigo(String costoCodigo) {
		this.costoCodigo = costoCodigo;
	}

	public String getCostoMedida() {
		return costoMedida;
	}

	public void setCostoMedida(String costoMedida) {
		this.costoMedida = costoMedida;
	}

	public BigDecimal getCostoPorcentaje() {
		return costoPorcentaje;
	}

	public void setCostoPorcentaje(BigDecimal costoPorcentaje) {
		this.costoPorcentaje = costoPorcentaje;
	}

	public String getCostoProducto() {
		return costoProducto;
	}

	public void setCostoProducto(String costoProducto) {
		this.costoProducto = costoProducto;
	}

	public BigDecimal getCostoTotal() {
		return costoTotal;
	}

	public void setCostoTotal(BigDecimal costoTotal) {
		this.costoTotal = costoTotal;
	}
}
