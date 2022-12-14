package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrdResumenCorridaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "rc_empresa")
	private String rcEmpresa;
	@Column(name = "rc_sector")
	private String rcSector;
	@Column(name = "rc_piscina")
	private String rcPiscina;
	@Column(name = "rc_corrida")
	private String rcCorrida;

	public PrdResumenCorridaPK() {
	}

	public PrdResumenCorridaPK(String rcEmpresa, String rcSector, String rcPiscina, String rcCorrida) {
		this.rcEmpresa = rcEmpresa;
		this.rcSector = rcSector;
		this.rcPiscina = rcPiscina;
		this.rcCorrida = rcCorrida;
	}

	public String getRcEmpresa() {
		return rcEmpresa;
	}

	public void setRcEmpresa(String rcEmpresa) {
		this.rcEmpresa = rcEmpresa;
	}

	public String getRcSector() {
		return rcSector;
	}

	public void setRcSector(String rcSector) {
		this.rcSector = rcSector;
	}

	public String getRcPiscina() {
		return rcPiscina;
	}

	public void setRcPiscina(String rcPiscina) {
		this.rcPiscina = rcPiscina;
	}

	public String getRcCorrida() {
		return rcCorrida;
	}

	public void setRcCorrida(String rcCorrida) {
		this.rcCorrida = rcCorrida;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (rcEmpresa != null ? rcEmpresa.hashCode() : 0);
		hash += (rcSector != null ? rcSector.hashCode() : 0);
		hash += (rcPiscina != null ? rcPiscina.hashCode() : 0);
		hash += (rcCorrida != null ? rcCorrida.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdResumenCorridaPK)) {
			return false;
		}
		PrdResumenCorridaPK other = (PrdResumenCorridaPK) object;
		if ((this.rcEmpresa == null && other.rcEmpresa != null)
				|| (this.rcEmpresa != null && !this.rcEmpresa.equals(other.rcEmpresa))) {
			return false;
		}
		if ((this.rcSector == null && other.rcSector != null)
				|| (this.rcSector != null && !this.rcSector.equals(other.rcSector))) {
			return false;
		}
		if ((this.rcPiscina == null && other.rcPiscina != null)
				|| (this.rcPiscina != null && !this.rcPiscina.equals(other.rcPiscina))) {
			return false;
		}
		if ((this.rcCorrida == null && other.rcCorrida != null)
				|| (this.rcCorrida != null && !this.rcCorrida.equals(other.rcCorrida))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "produccion.entity.PrdResumenCorridaPK[ rcEmpresa=" + rcEmpresa + ", rcSector=" + rcSector
				+ ", rcPiscina=" + rcPiscina + ", rcCorrida=" + rcCorrida + " ]";
	}

}
