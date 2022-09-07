package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrdPiscinaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private String pisEmpresa;
	private String pisSector;
	private String pisNumero;

	public PrdPiscinaPK() {
	}

	public PrdPiscinaPK(String pisEmpresa, String pisSector, String pisNumero) {
		this.pisEmpresa = pisEmpresa;
		this.pisSector = pisSector;
		this.pisNumero = pisNumero;
	}

	@Column(name = "pis_empresa")
	public String getPisEmpresa() {
		return pisEmpresa;
	}

	public void setPisEmpresa(String pisEmpresa) {
		this.pisEmpresa = pisEmpresa;
	}

	@Column(name = "pis_sector")
	public String getPisSector() {
		return pisSector;
	}

	public void setPisSector(String pisSector) {
		this.pisSector = pisSector;
	}

	@Column(name = "pis_numero")
	public String getPisNumero() {
		return pisNumero;
	}

	public void setPisNumero(String pisNumero) {
		this.pisNumero = pisNumero;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (pisEmpresa != null ? pisEmpresa.hashCode() : 0);
		hash += (pisSector != null ? pisSector.hashCode() : 0);
		hash += (pisNumero != null ? pisNumero.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdPiscinaPK)) {
			return false;
		}
		PrdPiscinaPK other = (PrdPiscinaPK) object;
		if ((this.pisEmpresa == null && other.pisEmpresa != null)
				|| (this.pisEmpresa != null && !this.pisEmpresa.equals(other.pisEmpresa))) {
			return false;
		}
		if ((this.pisSector == null && other.pisSector != null)
				|| (this.pisSector != null && !this.pisSector.equals(other.pisSector))) {
			return false;
		}
		if ((this.pisNumero == null && other.pisNumero != null)
				|| (this.pisNumero != null && !this.pisNumero.equals(other.pisNumero))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "produccion.entity.PrdPiscinaPK[ pisEmpresa=" + pisEmpresa + ", pisSector=" + pisSector + ", pisNumero="
				+ pisNumero + " ]";
	}

}
