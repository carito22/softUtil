package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrdSectorPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private String secEmpresa;
	private String secCodigo;

	public PrdSectorPK() {
	}

	public PrdSectorPK(String secEmpresa, String secCodigo) {
		this.secEmpresa = secEmpresa;
		this.secCodigo = secCodigo;
	}

	@Column(name = "sec_empresa")
	public String getSecEmpresa() {
		return secEmpresa;
	}

	public void setSecEmpresa(String secEmpresa) {
		this.secEmpresa = secEmpresa;
	}

	@Column(name = "sec_codigo")
	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (secEmpresa != null ? secEmpresa.hashCode() : 0);
		hash += (secCodigo != null ? secCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdSectorPK)) {
			return false;
		}
		PrdSectorPK other = (PrdSectorPK) object;
		if ((this.secEmpresa == null && other.secEmpresa != null)
				|| (this.secEmpresa != null && !this.secEmpresa.equals(other.secEmpresa))) {
			return false;
		}
		if ((this.secCodigo == null && other.secCodigo != null)
				|| (this.secCodigo != null && !this.secCodigo.equals(other.secCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "produccion.entity.PrdSectorPK[ secEmpresa=" + secEmpresa + ", secCodigo=" + secCodigo + " ]";
	}

}
