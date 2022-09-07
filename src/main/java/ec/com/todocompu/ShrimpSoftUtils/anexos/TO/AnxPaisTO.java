package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnxPaisTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private String paisCodigo;
	private String paisNombre;

	public AnxPaisTO() {
	}

	public AnxPaisTO(String paisCodigo, String paisNombre) {
		this.paisCodigo = paisCodigo;
		this.paisNombre = paisNombre;
	}

	@Id
	@Column(name = "pais_codigo")
	public String getPaisCodigo() {
		return paisCodigo;
	}

	public void setPaisCodigo(String paisCodigo) {
		this.paisCodigo = paisCodigo;
	}

	@Column(name = "pais_nombre")
	public String getPaisNombre() {
		return paisNombre;
	}

	public void setPaisNombre(String paisNombre) {
		this.paisNombre = paisNombre;
	}

	@Override
	public String toString() {
		return this.paisNombre.trim();
	}
}