package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "anx_tipoidentificacion", schema = "anexo")
@XmlRootElement
public class AnxTipoidentificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "ti_codigo")
	private Character tiCodigo;
	@Column(name = "ti_detalle")
	private String tiDetalle;

	public AnxTipoidentificacion() {
	}

	public AnxTipoidentificacion(Character tiCodigo) {
		this.tiCodigo = tiCodigo;
	}

	public AnxTipoidentificacion(Character tiCodigo, String tiDetalle) {
		this.tiCodigo = tiCodigo;
		this.tiDetalle = tiDetalle;
	}

	public Character getTiCodigo() {
		return tiCodigo;
	}

	public void setTiCodigo(Character tiCodigo) {
		this.tiCodigo = tiCodigo;
	}

	public String getTiDetalle() {
		return tiDetalle;
	}

	public void setTiDetalle(String tiDetalle) {
		this.tiDetalle = tiDetalle;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (tiCodigo != null ? tiCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof AnxTipoidentificacion)) {
			return false;
		}
		AnxTipoidentificacion other = (AnxTipoidentificacion) object;
		if ((this.tiCodigo == null && other.tiCodigo != null)
				|| (this.tiCodigo != null && !this.tiCodigo.equals(other.tiCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "anexos.entity.AnxTipoidentificacion[ tiCodigo=" + tiCodigo + " ]";
	}

}
