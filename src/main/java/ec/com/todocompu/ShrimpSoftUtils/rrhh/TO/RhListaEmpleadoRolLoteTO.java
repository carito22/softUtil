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
public class RhListaEmpleadoRolLoteTO implements Serializable {
	// personal
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "emp_id")
	private String empId;

	@Column(name = "emp_apellidos_nombres")
	private String empApellidosNombres;

	@Column(name = "sec_codigo")
	private String secCodigo;

	// @Column(name = "emp_id ")
	private Boolean deducible;

	public RhListaEmpleadoRolLoteTO() {
	}

	public RhListaEmpleadoRolLoteTO(String empId, String empApellidosNombres, String secCodigo, Boolean deducible) {
		this.empId = empId;
		this.empApellidosNombres = empApellidosNombres;
		this.secCodigo = secCodigo;
		this.deducible = deducible;
	}

	public String getEmpApellidosNombres() {
		return empApellidosNombres;
	}

	public void setEmpApellidosNombres(String empApellidosNombres) {
		this.empApellidosNombres = empApellidosNombres;
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

	public Boolean getDeducible() {
		return deducible;
	}

	public void setDeducible(Boolean deducible) {
		this.deducible = deducible;
	}

	public String getInformacion() {
		return "sector: " + secCodigo + "\nId: " + empId + "\nApellidosNombres: " + empApellidosNombres
				+ "\nDeducible: " + deducible;
	}
}
