package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrdTallaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private String tallaEmpresa;
	private String tallaCodigo;

	public PrdTallaPK() {
	}

	public PrdTallaPK(String tallaEmpresa, String tallaCodigo) {
		this.tallaEmpresa = tallaEmpresa;
		this.tallaCodigo = tallaCodigo;
	}

	@Column(name = "talla_empresa")
	public String getTallaEmpresa() {
		return tallaEmpresa;
	}

	public void setTallaEmpresa(String tallaEmpresa) {
		this.tallaEmpresa = tallaEmpresa;
	}

	@Column(name = "talla_codigo")
	public String getTallaCodigo() {
		return tallaCodigo;
	}

	public void setTallaCodigo(String tallaCodigo) {
		this.tallaCodigo = tallaCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (tallaEmpresa != null ? tallaEmpresa.hashCode() : 0);
		hash += (tallaCodigo != null ? tallaCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdTallaPK)) {
			return false;
		}
		PrdTallaPK other = (PrdTallaPK) object;
		if ((this.tallaEmpresa == null && other.tallaEmpresa != null)
				|| (this.tallaEmpresa != null && !this.tallaEmpresa.equals(other.tallaEmpresa))) {
			return false;
		}
		if ((this.tallaCodigo == null && other.tallaCodigo != null)
				|| (this.tallaCodigo != null && !this.tallaCodigo.equals(other.tallaCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "produccion.entity.PrdLiquidacionTallaPK[ tallaEmpresa=" + tallaEmpresa + ", tallaCodigo=" + tallaCodigo
				+ " ]";
	}

}
