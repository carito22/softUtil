package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "anx_provincias", schema = "anexo")
@XmlRootElement
public class AnxProvincias implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected AnxProvinciasPK anxProvinciasPK;
	@Column(name = "provincia_nombre")
	private String provinciaNombre;
	@Column(name = "canton_nombre")
	private String cantonNombre;

	public AnxProvincias() {
	}

	public AnxProvincias(AnxProvinciasPK anxProvinciasPK) {
		this.anxProvinciasPK = anxProvinciasPK;
	}

	public AnxProvincias(AnxProvinciasPK anxProvinciasPK, String provinciaNombre, String cantonNombre) {
		this.anxProvinciasPK = anxProvinciasPK;
		this.provinciaNombre = provinciaNombre;
		this.cantonNombre = cantonNombre;
	}

	public AnxProvincias(String provinciaCodigo, String cantonCodigo) {
		this.anxProvinciasPK = new AnxProvinciasPK(provinciaCodigo, cantonCodigo);
	}

	public AnxProvinciasPK getAnxProvinciasPK() {
		return anxProvinciasPK;
	}

	public void setAnxProvinciasPK(AnxProvinciasPK anxProvinciasPK) {
		this.anxProvinciasPK = anxProvinciasPK;
	}

	public String getProvinciaNombre() {
		return provinciaNombre;
	}

	public void setProvinciaNombre(String provinciaNombre) {
		this.provinciaNombre = provinciaNombre;
	}

	public String getCantonNombre() {
		return cantonNombre;
	}

	public void setCantonNombre(String cantonNombre) {
		this.cantonNombre = cantonNombre;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (anxProvinciasPK != null ? anxProvinciasPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof AnxProvincias)) {
			return false;
		}
		AnxProvincias other = (AnxProvincias) object;
		if ((this.anxProvinciasPK == null && other.anxProvinciasPK != null)
				|| (this.anxProvinciasPK != null && !this.anxProvinciasPK.equals(other.anxProvinciasPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "anexos.entity.AnxProvincias[ anxProvinciasPK=" + anxProvinciasPK + " ]";
	}

}
