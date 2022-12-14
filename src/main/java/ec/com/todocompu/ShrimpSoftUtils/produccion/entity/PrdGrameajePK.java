package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrdGrameajePK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "gra_empresa")
	private String graEmpresa;
	@Column(name = "gra_sector")
	private String graSector;
	@Column(name = "gra_piscina")
	private String graPiscina;
	@Column(name = "gra_fecha")
	private Date graFecha;

	public PrdGrameajePK() {
	}

	public PrdGrameajePK(String graEmpresa, String graSector, String graPiscina, Date graFecha) {
		this.graEmpresa = graEmpresa;
		this.graSector = graSector;
		this.graPiscina = graPiscina;
		this.graFecha = graFecha;
	}

	public String getGraEmpresa() {
		return graEmpresa;
	}

	public void setGraEmpresa(String graEmpresa) {
		this.graEmpresa = graEmpresa;
	}

	public String getGraSector() {
		return graSector;
	}

	public void setGraSector(String graSector) {
		this.graSector = graSector;
	}

	public String getGraPiscina() {
		return graPiscina;
	}

	public void setGraPiscina(String graPiscina) {
		this.graPiscina = graPiscina;
	}

	public Date getGraFecha() {
		return graFecha;
	}

	public void setGraFecha(Date graFecha) {
		this.graFecha = graFecha;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (graEmpresa != null ? graEmpresa.hashCode() : 0);
		hash += (graSector != null ? graSector.hashCode() : 0);
		hash += (graPiscina != null ? graPiscina.hashCode() : 0);
		hash += (graFecha != null ? graFecha.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdGrameajePK)) {
			return false;
		}
		PrdGrameajePK other = (PrdGrameajePK) object;
		if ((this.graEmpresa == null && other.graEmpresa != null)
				|| (this.graEmpresa != null && !this.graEmpresa.equals(other.graEmpresa))) {
			return false;
		}
		if ((this.graSector == null && other.graSector != null)
				|| (this.graSector != null && !this.graSector.equals(other.graSector))) {
			return false;
		}
		if ((this.graPiscina == null && other.graPiscina != null)
				|| (this.graPiscina != null && !this.graPiscina.equals(other.graPiscina))) {
			return false;
		}
		if ((this.graFecha == null && other.graFecha != null)
				|| (this.graFecha != null && !this.graFecha.equals(other.graFecha))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "produccion.entity.PrdGrameajePK[ graEmpresa=" + graEmpresa + ", graSector=" + graSector
				+ ", graPiscina=" + graPiscina + ", graFecha=" + graFecha + " ]";
	}

}
