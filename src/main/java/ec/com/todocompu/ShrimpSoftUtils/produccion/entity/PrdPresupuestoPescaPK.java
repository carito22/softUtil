package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrdPresupuestoPescaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private String presuEmpresa;
	private String presuMotivo;
	private String presuNumero;

	public PrdPresupuestoPescaPK() {
	}

	public PrdPresupuestoPescaPK(String presuEmpresa, String presuMotivo, String presuNumero) {
		this.presuEmpresa = presuEmpresa;
		this.presuMotivo = presuMotivo;
		this.presuNumero = presuNumero;
	}

	@Column(name = "presu_empresa")
	public String getPresuEmpresa() {
		return presuEmpresa;
	}

	public void setPresuEmpresa(String presuEmpresa) {
		this.presuEmpresa = presuEmpresa;
	}

	@Column(name = "presu_motivo")
	public String getPresuMotivo() {
		return presuMotivo;
	}

	public void setPresuMotivo(String presuMotivo) {
		this.presuMotivo = presuMotivo;
	}

	@Column(name = "presu_numero")
	public String getPresuNumero() {
		return presuNumero;
	}

	public void setPresuNumero(String presuNumero) {
		this.presuNumero = presuNumero;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((presuEmpresa == null) ? 0 : presuEmpresa.hashCode());
		result = prime * result + ((presuMotivo == null) ? 0 : presuMotivo.hashCode());
		result = prime * result + ((presuNumero == null) ? 0 : presuNumero.hashCode());
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
		PrdPresupuestoPescaPK other = (PrdPresupuestoPescaPK) obj;
		if (presuEmpresa == null) {
			if (other.presuEmpresa != null)
				return false;
		} else if (!presuEmpresa.equals(other.presuEmpresa))
			return false;
		if (presuMotivo == null) {
			if (other.presuMotivo != null)
				return false;
		} else if (!presuMotivo.equals(other.presuMotivo))
			return false;
		if (presuNumero == null) {
			if (other.presuNumero != null)
				return false;
		} else if (!presuNumero.equals(other.presuNumero))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PrdPresupuestoPescaPK [presuEmpresa=" + presuEmpresa + ", presuMotivo=" + presuMotivo + ", presuNumero="
				+ presuNumero + "]";
	}

}
