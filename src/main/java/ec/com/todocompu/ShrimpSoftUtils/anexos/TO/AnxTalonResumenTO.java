/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class AnxTalonResumenTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "ret_concepto")
	private String retConcepto;

	@Column(name = "ret_cantidad")
	private Integer retCantidad;

	@Column(name = "ret_baseimponible")
	private java.math.BigDecimal retBaseImponible;

	@Column(name = "ret_porcentaje")
	private java.math.BigDecimal retPorcentaje;

	@Column(name = "ret_valorretenido")
	private java.math.BigDecimal retValorRetenido;

	public AnxTalonResumenTO() {
	}

	public AnxTalonResumenTO(String retConcepto, Integer retCantidad, BigDecimal retBaseImponible,
			BigDecimal retPorcentaje, BigDecimal retValorRetenido, Integer id) {
		this.retConcepto = retConcepto;
		this.retCantidad = retCantidad;
		this.retBaseImponible = retBaseImponible;
		this.retPorcentaje = retPorcentaje;
		this.retValorRetenido = retValorRetenido;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getRetBaseImponible() {
		return retBaseImponible;
	}

	public void setRetBaseImponible(BigDecimal retBaseImponible) {
		this.retBaseImponible = retBaseImponible;
	}

	public Integer getRetCantidad() {
		return retCantidad;
	}

	public void setRetCantidad(Integer retCantidad) {
		this.retCantidad = retCantidad;
	}

	public String getRetConcepto() {
		return retConcepto;
	}

	public void setRetConcepto(String retConcepto) {
		this.retConcepto = retConcepto;
	}

	public BigDecimal getRetPorcentaje() {
		return retPorcentaje;
	}

	public void setRetPorcentaje(BigDecimal retPorcentaje) {
		this.retPorcentaje = retPorcentaje;
	}

	public BigDecimal getRetValorRetenido() {
		return retValorRetenido;
	}

	public void setRetValorRetenido(BigDecimal retValorRetenido) {
		this.retValorRetenido = retValorRetenido;
	}
}
