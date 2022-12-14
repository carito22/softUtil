package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InvProformasPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "prof_empresa")
	private String profEmpresa;
	@Column(name = "prof_periodo")
	private String profPeriodo;
	@Column(name = "prof_motivo")
	private String profMotivo;
	@Column(name = "prof_numero")
	private String profNumero;

	public InvProformasPK() {
	}

	public InvProformasPK(String profEmpresa, String profPeriodo, String profMotivo, String profNumero) {
		this.profEmpresa = profEmpresa;
		this.profPeriodo = profPeriodo;
		this.profMotivo = profMotivo;
		this.profNumero = profNumero;
	}

	public String getProfEmpresa() {
		return profEmpresa;
	}

	public void setProfEmpresa(String profEmpresa) {
		this.profEmpresa = profEmpresa;
	}

	public String getProfPeriodo() {
		return profPeriodo;
	}

	public void setProfPeriodo(String profPeriodo) {
		this.profPeriodo = profPeriodo;
	}

	public String getProfMotivo() {
		return profMotivo;
	}

	public void setProfMotivo(String profMotivo) {
		this.profMotivo = profMotivo;
	}

	public String getProfNumero() {
		return profNumero;
	}

	public void setProfNumero(String profNumero) {
		this.profNumero = profNumero;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (profEmpresa != null ? profEmpresa.hashCode() : 0);
		hash += (profPeriodo != null ? profPeriodo.hashCode() : 0);
		hash += (profMotivo != null ? profMotivo.hashCode() : 0);
		hash += (profNumero != null ? profNumero.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvProformasPK)) {
			return false;
		}
		InvProformasPK other = (InvProformasPK) object;
		if ((this.profEmpresa == null && other.profEmpresa != null)
				|| (this.profEmpresa != null && !this.profEmpresa.equals(other.profEmpresa))) {
			return false;
		}
		if ((this.profPeriodo == null && other.profPeriodo != null)
				|| (this.profPeriodo != null && !this.profPeriodo.equals(other.profPeriodo))) {
			return false;
		}
		if ((this.profMotivo == null && other.profMotivo != null)
				|| (this.profMotivo != null && !this.profMotivo.equals(other.profMotivo))) {
			return false;
		}
		if ((this.profNumero == null && other.profNumero != null)
				|| (this.profNumero != null && !this.profNumero.equals(other.profNumero))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvProformasPK[ profEmpresa=" + profEmpresa + ", profPeriodo=" + profPeriodo
				+ ", profMotivo=" + profMotivo + ", profNumero=" + profNumero + " ]";
	}

}
