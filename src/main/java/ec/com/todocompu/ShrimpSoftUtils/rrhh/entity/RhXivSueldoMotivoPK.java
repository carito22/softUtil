package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RhXivSueldoMotivoPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private String motEmpresa;
	private String motDetalle;

	public RhXivSueldoMotivoPK() {
	}

	public RhXivSueldoMotivoPK(String motEmpresa, String motDetalle) {
		this.motEmpresa = motEmpresa;
		this.motDetalle = motDetalle;
	}

	@Column(name = "mot_empresa")
	public String getMotEmpresa() {
		return motEmpresa;
	}

	public void setMotEmpresa(String motEmpresa) {
		this.motEmpresa = motEmpresa;
	}

	@Column(name = "mot_detalle")
	public String getMotDetalle() {
		return motDetalle;
	}

	public void setMotDetalle(String motDetalle) {
		this.motDetalle = motDetalle;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (motEmpresa != null ? motEmpresa.hashCode() : 0);
		hash += (motDetalle != null ? motDetalle.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RhXivSueldoMotivoPK)) {
			return false;
		}
		RhXivSueldoMotivoPK other = (RhXivSueldoMotivoPK) object;
		if ((this.motEmpresa == null && other.motEmpresa != null)
				|| (this.motEmpresa != null && !this.motEmpresa.equals(other.motEmpresa))) {
			return false;
		}
		if ((this.motDetalle == null && other.motDetalle != null)
				|| (this.motDetalle != null && !this.motDetalle.equals(other.motDetalle))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhAnticipoMotivoPK[ motEmpresa=" + motEmpresa + ", motDetalle=" + motDetalle + " ]";
	}
}
