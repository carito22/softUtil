package ec.com.todocompu.ShrimpSoftUtils.caja.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CajCajaComboTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "caja_codigo")
	private String cajaCodigo;

	@Column(name = "caja_nombre")
	private String cajaNombre;

	public CajCajaComboTO() {
	}

	public CajCajaComboTO(String cajaCodigo, String cajaNombre) {
		this.cajaCodigo = cajaCodigo;
		this.cajaNombre = cajaNombre;
	}

	public String getCajaCodigo() {
		return cajaCodigo;
	}

	public void setCajaCodigo(String cajaCodigo) {
		this.cajaCodigo = cajaCodigo;
	}

	public String getCajaNombre() {
		return cajaNombre;
	}

	public void setCajaNombre(String cajaNombre) {
		this.cajaNombre = cajaNombre;
	}

	@Override
	public String toString() {
		return this.cajaCodigo + " | " + this.cajaNombre;
	}
}
