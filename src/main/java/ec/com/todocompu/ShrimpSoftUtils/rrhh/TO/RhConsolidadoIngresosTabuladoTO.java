/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class RhConsolidadoIngresosTabuladoTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "cit_id")
	private String brCedula;

	@Column(name = "cit_nombres")
	private String brNombre;

	@Column(name = "cit_fecha_ingreso")
	private String brFechaIngreso;

	@Column(name = "cit_fecha_salida")
	private String brFechaSalida;

	@Column(name = "cit_periodo")
	private String brPeriodo;

	@Column(name = "cit_valor")
	private java.math.BigDecimal brTotal;

	public RhConsolidadoIngresosTabuladoTO() {
	}

	public RhConsolidadoIngresosTabuladoTO(String brPeriodo, String brCedula, String brNombre, String brFechaIngreso,
			String brFechaSalida, BigDecimal brTotal, Integer id) {
		this.brPeriodo = brPeriodo;
		this.brCedula = brCedula;
		this.brNombre = brNombre;
		this.brFechaIngreso = brFechaIngreso;
		this.brFechaSalida = brFechaSalida;
		this.brTotal = brTotal;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBrPeriodo() {
		return brPeriodo;
	}

	public void setBrPeriodo(String brPeriodo) {
		this.brPeriodo = brPeriodo;
	}

	public String getBrCedula() {
		return brCedula;
	}

	public void setBrCedula(String brCedula) {
		this.brCedula = brCedula;
	}

	public String getBrNombre() {
		return brNombre;
	}

	public void setBrNombre(String brNombre) {
		this.brNombre = brNombre;
	}

	public String getBrFechaIngreso() {
		return brFechaIngreso;
	}

	public void setBrFechaIngreso(String brFechaIngreso) {
		this.brFechaIngreso = brFechaIngreso;
	}

	public String getBrFechaSalida() {
		return brFechaSalida;
	}

	public void setBrFechaSalida(String brFechaSalida) {
		this.brFechaSalida = brFechaSalida;
	}

	public BigDecimal getBrTotal() {
		return brTotal;
	}

	public void setBrTotal(BigDecimal brTotal) {
		this.brTotal = brTotal;
	}

	@Override
	public String toString() {
		return this.brPeriodo + " " + this.brCedula + " " + this.brNombre + " " + this.brFechaIngreso + " "
				+ this.brTotal;
	}
}
