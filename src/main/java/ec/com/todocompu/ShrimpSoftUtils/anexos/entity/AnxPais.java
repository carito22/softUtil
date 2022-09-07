package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "anx_pais", schema = "anexo")
@XmlRootElement
public class AnxPais implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "pais_codigo")
	private String paisCodigo;
	@Column(name = "pais_nombre")
	private String paisNombre;

	public AnxPais() {
	}

	public AnxPais(String paisCodigo) {
		this.paisCodigo = paisCodigo;
	}

	public AnxPais(String paisCodigo, String paisNombre) {
		this.paisCodigo = paisCodigo;
		this.paisNombre = paisNombre;
	}

	public String getPaisCodigo() {
		return paisCodigo;
	}

	public void setPaisCodigo(String paisCodigo) {
		this.paisCodigo = paisCodigo;
	}

	public String getPaisNombre() {
		return paisNombre;
	}

	public void setPaisNombre(String paisNombre) {
		this.paisNombre = paisNombre;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (paisCodigo != null ? paisCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof AnxPais)) {
			return false;
		}
		AnxPais other = (AnxPais) object;
		if ((this.paisCodigo == null && other.paisCodigo != null)
				|| (this.paisCodigo != null && !this.paisCodigo.equals(other.paisCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "anexos.entity.AnxPais[ paisCodigo=" + paisCodigo + " ]";
	}

}
