package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InvProductoCategoriaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "cat_empresa")
	private String catEmpresa;
	@Column(name = "cat_codigo")
	private String catCodigo;

	public InvProductoCategoriaPK() {
	}

	public InvProductoCategoriaPK(String catEmpresa, String catCodigo) {
		this.catEmpresa = catEmpresa;
		this.catCodigo = catCodigo;
	}

	public String getCatEmpresa() {
		return catEmpresa;
	}

	public void setCatEmpresa(String catEmpresa) {
		this.catEmpresa = catEmpresa;
	}

	public String getCatCodigo() {
		return catCodigo;
	}

	public void setCatCodigo(String catCodigo) {
		this.catCodigo = catCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (catEmpresa != null ? catEmpresa.hashCode() : 0);
		hash += (catCodigo != null ? catCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof InvProductoCategoriaPK)) {
			return false;
		}
		InvProductoCategoriaPK other = (InvProductoCategoriaPK) object;
		if ((this.catEmpresa == null && other.catEmpresa != null)
				|| (this.catEmpresa != null && !this.catEmpresa.equals(other.catEmpresa))) {
			return false;
		}
		if ((this.catCodigo == null && other.catCodigo != null)
				|| (this.catCodigo != null && !this.catCodigo.equals(other.catCodigo))) {
			return false;
		}
		return true;
	}

	// @Override
	// public String toString() {
	// return "inventario.entity.InvProductoCategoriaPK[ catEmpresa=" +
	// catEmpresa + ", catCodigo=" + catCodigo + " ]";
	// }

}
