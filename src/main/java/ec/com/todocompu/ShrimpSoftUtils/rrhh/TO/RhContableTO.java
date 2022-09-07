package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class RhContableTO implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Id
	// @Column(name = "emp_codigo")
	private RhRolTO rhRolTO;
	private String perCodigo;
	private String tipCodigo;
	private String conNumero;
	private String mensaje;
	private List<String> listaEmpleadoTO = new ArrayList<String>(1);

	public RhContableTO() {
	}

	public RhContableTO(String perCodigo, String tipCodigo, String conNumero, String mensaje) {
		this.perCodigo = perCodigo;
		this.tipCodigo = tipCodigo;
		this.conNumero = conNumero;
		this.mensaje = mensaje;
	}

	public String getConNumero() {
		return conNumero;
	}

	public void setConNumero(String conNumero) {
		this.conNumero = conNumero;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getPerCodigo() {
		return perCodigo;
	}

	public void setPerCodigo(String perCodigo) {
		this.perCodigo = perCodigo;
	}

	public RhRolTO getRhRolTO() {
		return rhRolTO;
	}

	public void setRhRolTO(RhRolTO rhRolTO) {
		this.rhRolTO = rhRolTO;
	}

	public String getTipCodigo() {
		return tipCodigo;
	}

	public void setTipCodigo(String tipCodigo) {
		this.tipCodigo = tipCodigo;
	}

	public List<String> getListaEmpleadoTO() {
		return listaEmpleadoTO;
	}

	public void setListaEmpleadoTO(List<String> listaEmpleadoTO) {
		this.listaEmpleadoTO = listaEmpleadoTO;
	}
}
