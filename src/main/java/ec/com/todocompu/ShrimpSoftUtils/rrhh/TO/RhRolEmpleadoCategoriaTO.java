package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;

public class RhRolEmpleadoCategoriaTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String empId;
	private String empApellidosNombres;// agregado

	public RhRolEmpleadoCategoriaTO(String empId, String empApellidosNombres) {
		this.empId = empId;
		this.empApellidosNombres = empApellidosNombres;
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

	public String getInformacion() {
		return "\nId: " + empId + "\nApellidos Nombres: " + empApellidosNombres;
	}
}
