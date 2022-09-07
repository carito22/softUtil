package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AnxCompraPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "comp_empresa")
	private String compEmpresa;
	@Column(name = "comp_periodo")
	private String compPeriodo;
	@Column(name = "comp_motivo")
	private String compMotivo;
	@Column(name = "comp_numero")
	private String compNumero;

	public AnxCompraPK() {
	}

	public AnxCompraPK(String compEmpresa, String compPeriodo, String compMotivo, String compNumero) {
		this.compEmpresa = compEmpresa;
		this.compPeriodo = compPeriodo;
		this.compMotivo = compMotivo;
		this.compNumero = compNumero;
	}

	public String getCompEmpresa() {
		return compEmpresa;
	}

	public void setCompEmpresa(String compEmpresa) {
		this.compEmpresa = compEmpresa;
	}

	public String getCompPeriodo() {
		return compPeriodo;
	}

	public void setCompPeriodo(String compPeriodo) {
		this.compPeriodo = compPeriodo;
	}

	public String getCompMotivo() {
		return compMotivo;
	}

	public void setCompMotivo(String compMotivo) {
		this.compMotivo = compMotivo;
	}

	public String getCompNumero() {
		return compNumero;
	}

	public void setCompNumero(String compNumero) {
		this.compNumero = compNumero;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (compEmpresa != null ? compEmpresa.hashCode() : 0);
		hash += (compPeriodo != null ? compPeriodo.hashCode() : 0);
		hash += (compMotivo != null ? compMotivo.hashCode() : 0);
		hash += (compNumero != null ? compNumero.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof AnxCompraPK)) {
			return false;
		}
		AnxCompraPK other = (AnxCompraPK) object;
		if ((this.compEmpresa == null && other.compEmpresa != null)
				|| (this.compEmpresa != null && !this.compEmpresa.equals(other.compEmpresa))) {
			return false;
		}
		if ((this.compPeriodo == null && other.compPeriodo != null)
				|| (this.compPeriodo != null && !this.compPeriodo.equals(other.compPeriodo))) {
			return false;
		}
		if ((this.compMotivo == null && other.compMotivo != null)
				|| (this.compMotivo != null && !this.compMotivo.equals(other.compMotivo))) {
			return false;
		}
		if ((this.compNumero == null && other.compNumero != null)
				|| (this.compNumero != null && !this.compNumero.equals(other.compNumero))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "anexos.entity.AnxCompraPK[ compEmpresa=" + compEmpresa + ", compPeriodo=" + compPeriodo
				+ ", compMotivo=" + compMotivo + ", compNumero=" + compNumero + " ]";
	}

}
