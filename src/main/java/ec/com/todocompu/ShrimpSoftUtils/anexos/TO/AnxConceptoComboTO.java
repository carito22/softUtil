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
public class AnxConceptoComboTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "con_codigo")
	private String conCodigo;

	@Column(name = "con_concepto")
	private String conConcepto;

	@Column(name = "con_porcentaje")
	private java.math.BigDecimal conPorcentaje;

	@Column(name = "con_ingresa_porcentaje")
	private Character conIngresaPorcentaje;

	public AnxConceptoComboTO() {
	}

	public AnxConceptoComboTO(String conCodigo, String conConcepto, BigDecimal conPorcentaje,
			Character conIngresaPorcentaje) {
		this.conCodigo = conCodigo;
		this.conConcepto = conConcepto;
		this.conPorcentaje = conPorcentaje;
		this.conIngresaPorcentaje = conIngresaPorcentaje;
	}

	public String getConCodigo() {
		return conCodigo;
	}

	public void setConCodigo(String conCodigo) {
		this.conCodigo = conCodigo;
	}

	public String getConConcepto() {
		return conConcepto;
	}

	public void setConConcepto(String conConcepto) {
		this.conConcepto = conConcepto;
	}

	public Character getConIngresaPorcentaje() {
		return conIngresaPorcentaje;
	}

	public void setConIngresaPorcentaje(Character conIngresaPorcentaje) {
		this.conIngresaPorcentaje = conIngresaPorcentaje;
	}

	public BigDecimal getConPorcentaje() {
		return conPorcentaje;
	}

	public void setConPorcentaje(BigDecimal conPorcentaje) {
		this.conPorcentaje = conPorcentaje;
	}

	@Override
	public String toString() {
		return this.conConcepto;
	}
}
