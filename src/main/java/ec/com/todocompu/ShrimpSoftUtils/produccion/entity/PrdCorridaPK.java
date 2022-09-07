package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrdCorridaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private String corEmpresa;
	private String corSector;
	private String corPiscina;
	private String corNumero;

	public PrdCorridaPK() {
	}

	public PrdCorridaPK(String corEmpresa, String corSector, String corPiscina, String corNumero) {
		this.corEmpresa = corEmpresa;
		this.corSector = corSector;
		this.corPiscina = corPiscina;
		this.corNumero = corNumero;
	}

	@Column(name = "cor_empresa")
	public String getCorEmpresa() {
		return corEmpresa;
	}

	public void setCorEmpresa(String corEmpresa) {
		this.corEmpresa = corEmpresa;
	}

	@Column(name = "cor_sector")
	public String getCorSector() {
		return corSector;
	}

	public void setCorSector(String corSector) {
		this.corSector = corSector;
	}

	@Column(name = "cor_piscina")
	public String getCorPiscina() {
		return corPiscina;
	}

	public void setCorPiscina(String corPiscina) {
		this.corPiscina = corPiscina;
	}

	@Column(name = "cor_numero")
	public String getCorNumero() {
		return corNumero;
	}

	public void setCorNumero(String corNumero) {
		this.corNumero = corNumero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((corEmpresa == null) ? 0 : corEmpresa.hashCode());
		result = prime * result + ((corNumero == null) ? 0 : corNumero.hashCode());
		result = prime * result + ((corPiscina == null) ? 0 : corPiscina.hashCode());
		result = prime * result + ((corSector == null) ? 0 : corSector.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PrdCorridaPK other = (PrdCorridaPK) obj;
		if (corEmpresa == null) {
			if (other.corEmpresa != null)
				return false;
		} else if (!corEmpresa.equals(other.corEmpresa))
			return false;
		if (corNumero == null) {
			if (other.corNumero != null)
				return false;
		} else if (!corNumero.equals(other.corNumero))
			return false;
		if (corPiscina == null) {
			if (other.corPiscina != null)
				return false;
		} else if (!corPiscina.equals(other.corPiscina))
			return false;
		if (corSector == null) {
			if (other.corSector != null)
				return false;
		} else if (!corSector.equals(other.corSector))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "produccion.entity.PrdCorridaPK[ corEmpresa=" + corEmpresa + ", corSector=" + corSector + ", corPiscina="
				+ corPiscina + ", corNumero=" + corNumero + " ]";
	}

}
