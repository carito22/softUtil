package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InvProductoPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "pro_empresa")
	private String proEmpresa;
	@Column(name = "pro_codigo_principal")
	private String proCodigoPrincipal;

	public InvProductoPK() {
	}

	public InvProductoPK(String proEmpresa, String proCodigoPrincipal) {
		this.proEmpresa = proEmpresa;
		this.proCodigoPrincipal = proCodigoPrincipal;
	}

	public String getProEmpresa() {
		return proEmpresa;
	}

	public void setProEmpresa(String proEmpresa) {
		this.proEmpresa = proEmpresa;
	}

	public String getProCodigoPrincipal() {
		return proCodigoPrincipal;
	}

	public void setProCodigoPrincipal(String proCodigoPrincipal) {
		this.proCodigoPrincipal = proCodigoPrincipal;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (proEmpresa != null ? proEmpresa.hashCode() : 0);
		hash += (proCodigoPrincipal != null ? proCodigoPrincipal.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvProductoPK)) {
			return false;
		}
		InvProductoPK other = (InvProductoPK) object;
		if ((this.proEmpresa == null && other.proEmpresa != null)
				|| (this.proEmpresa != null && !this.proEmpresa.equals(other.proEmpresa))) {
			return false;
		}
		if ((this.proCodigoPrincipal == null && other.proCodigoPrincipal != null)
				|| (this.proCodigoPrincipal != null && !this.proCodigoPrincipal.equals(other.proCodigoPrincipal))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvProductoPK[ proEmpresa=" + proEmpresa + ", proCodigoPrincipal="
				+ proCodigoPrincipal + " ]";
	}

}
