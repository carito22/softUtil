package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InvProformasMotivoPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "pm_empresa")
	private String pmEmpresa;
	@Column(name = "pm_codigo")
	private String pmCodigo;

	public InvProformasMotivoPK() {
	}

	public InvProformasMotivoPK(String pmEmpresa, String pmCodigo) {
		this.pmEmpresa = pmEmpresa;
		this.pmCodigo = pmCodigo;
	}

	public String getPmEmpresa() {
		return pmEmpresa;
	}

	public void setPmEmpresa(String pmEmpresa) {
		this.pmEmpresa = pmEmpresa;
	}

	public String getPmCodigo() {
		return pmCodigo;
	}

	public void setPmCodigo(String pmCodigo) {
		this.pmCodigo = pmCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (pmEmpresa != null ? pmEmpresa.hashCode() : 0);
		hash += (pmCodigo != null ? pmCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvProformasMotivoPK)) {
			return false;
		}
		InvProformasMotivoPK other = (InvProformasMotivoPK) object;
		if ((this.pmEmpresa == null && other.pmEmpresa != null)
				|| (this.pmEmpresa != null && !this.pmEmpresa.equals(other.pmEmpresa))) {
			return false;
		}
		if ((this.pmCodigo == null && other.pmCodigo != null)
				|| (this.pmCodigo != null && !this.pmCodigo.equals(other.pmCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvProformasMotivoPK[ pmEmpresa=" + pmEmpresa + ", pmCodigo=" + pmCodigo + " ]";
	}

}
