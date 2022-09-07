/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class RhListaEmpleadoTO implements Serializable {
	// personal

	private static final long serialVersionUID = 1L;

	@Column(name = "sec_codigo")
	private String secCodigo;

	@Id
	@Column(name = "emp_id")
	private String empId;

	@Column(name = "emp_apellidos_nombre")
	private String empApellidosNombres;

	@Column(name = "emp_cargo")
	private String empCargo;

	@Column(name = "emp_fecha_afiliacion_iess") ////// ESTE CAMPO NO LO RECONOCE
												////// emp_fecha_afiliacion_iess
	private Boolean empAfiliacionIess;

	@Column(name = "emp_salario_neto")
	private Boolean empSalarioNeto;

	@Column(name = "emp_residencia_tipo")
	private String empNacionlidad;

	public RhListaEmpleadoTO() {
	}

	public RhListaEmpleadoTO(String secCodigo, String empId, String empApellidosNombres, String empCargo,
			Boolean empAfiliacionIess, Boolean empSalarioNeto, String empNacionalidad) {
		this.secCodigo = secCodigo;
		this.empId = empId;
		this.empApellidosNombres = empApellidosNombres;
		this.empCargo = empCargo;
		this.empAfiliacionIess = empAfiliacionIess;
		this.empSalarioNeto = empSalarioNeto;
		this.empNacionlidad = empNacionalidad;
	}

	public Boolean getEmpAfiliacionIess() {
		return empAfiliacionIess;
	}

	public void setEmpAfiliacionIess(Boolean empAfiliacionIess) {
		this.empAfiliacionIess = empAfiliacionIess;
	}

	public String getEmpApellidosNombres() {
		return empApellidosNombres;
	}

	public void setEmpApellidosNombres(String empApellidosNombres) {
		this.empApellidosNombres = empApellidosNombres;
	}

	public String getEmpCargo() {
		return empCargo;
	}

	public void setEmpCargo(String empCargo) {
		this.empCargo = empCargo;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	public Boolean getEmpSalarioNeto() {
		return empSalarioNeto;
	}

	public void setEmpSalarioNeto(Boolean empSalarioNeto) {
		this.empSalarioNeto = empSalarioNeto;
	}

	public String getInformacion() {
		return "Codigo Sector: " + secCodigo + "\nId: " + empId + "\nApellidosNombres: " + empApellidosNombres
				+ "\nFecha Afiliacion IESS: " + empAfiliacionIess;
	}

	public String getEmpNacionlidad() {
		return empNacionlidad;
	}

	public void setEmpNacionlidad(String empNacionlidad) {
		this.empNacionlidad = empNacionlidad;
	}
}
