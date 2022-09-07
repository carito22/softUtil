package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InvProductoTipoPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "tip_empresa")
	private String tipEmpresa;
	@Column(name = "tip_codigo")
	private String tipCodigo;

	public InvProductoTipoPK() {
	}

	public InvProductoTipoPK(String tipEmpresa, String tipCodigo) {
		this.tipEmpresa = tipEmpresa;
		this.tipCodigo = tipCodigo;
	}

	public String getTipEmpresa() {
		return tipEmpresa;
	}

	public void setTipEmpresa(String tipEmpresa) {
		this.tipEmpresa = tipEmpresa;
	}

	public String getTipCodigo() {
		return tipCodigo;
	}

	public void setTipCodigo(String tipCodigo) {
		this.tipCodigo = tipCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (tipEmpresa != null ? tipEmpresa.hashCode() : 0);
		hash += (tipCodigo != null ? tipCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvProductoTipoPK)) {
			return false;
		}
		InvProductoTipoPK other = (InvProductoTipoPK) object;
		if ((this.tipEmpresa == null && other.tipEmpresa != null)
				|| (this.tipEmpresa != null && !this.tipEmpresa.equals(other.tipEmpresa))) {
			return false;
		}
		if ((this.tipCodigo == null && other.tipCodigo != null)
				|| (this.tipCodigo != null && !this.tipCodigo.equals(other.tipCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvProductoTipoPK[ tipEmpresa=" + tipEmpresa + ", tipCodigo=" + tipCodigo + " ]";
	}

}
