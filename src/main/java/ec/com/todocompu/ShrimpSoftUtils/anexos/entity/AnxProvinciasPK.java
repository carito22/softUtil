package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AnxProvinciasPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "provincia_codigo")
	private String provinciaCodigo;
	@Column(name = "canton_codigo")
	private String cantonCodigo;

	public AnxProvinciasPK() {
	}

	public AnxProvinciasPK(String provinciaCodigo, String cantonCodigo) {
		this.provinciaCodigo = provinciaCodigo;
		this.cantonCodigo = cantonCodigo;
	}

	public String getProvinciaCodigo() {
		return provinciaCodigo;
	}

	public void setProvinciaCodigo(String provinciaCodigo) {
		this.provinciaCodigo = provinciaCodigo;
	}

	public String getCantonCodigo() {
		return cantonCodigo;
	}

	public void setCantonCodigo(String cantonCodigo) {
		this.cantonCodigo = cantonCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (provinciaCodigo != null ? provinciaCodigo.hashCode() : 0);
		hash += (cantonCodigo != null ? cantonCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof AnxProvinciasPK)) {
			return false;
		}
		AnxProvinciasPK other = (AnxProvinciasPK) object;
		if ((this.provinciaCodigo == null && other.provinciaCodigo != null)
				|| (this.provinciaCodigo != null && !this.provinciaCodigo.equals(other.provinciaCodigo))) {
			return false;
		}
		if ((this.cantonCodigo == null && other.cantonCodigo != null)
				|| (this.cantonCodigo != null && !this.cantonCodigo.equals(other.cantonCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "anexos.entity.AnxProvinciasPK[ provinciaCodigo=" + provinciaCodigo + ", cantonCodigo=" + cantonCodigo
				+ " ]";
	}

}
