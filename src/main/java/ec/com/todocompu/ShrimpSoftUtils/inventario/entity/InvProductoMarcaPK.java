package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InvProductoMarcaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "mar_empresa")
	private String marEmpresa;
	@Column(name = "mar_codigo")
	private String marCodigo;

	public InvProductoMarcaPK() {
	}

	public InvProductoMarcaPK(String marEmpresa, String marCodigo) {
		this.marEmpresa = marEmpresa;
		this.marCodigo = marCodigo;
	}

	public String getMarEmpresa() {
		return marEmpresa;
	}

	public void setMarEmpresa(String marEmpresa) {
		this.marEmpresa = marEmpresa;
	}

	public String getMarCodigo() {
		return marCodigo;
	}

	public void setMarCodigo(String marCodigo) {
		this.marCodigo = marCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (marEmpresa != null ? marEmpresa.hashCode() : 0);
		hash += (marCodigo != null ? marCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvProductoMarcaPK)) {
			return false;
		}
		InvProductoMarcaPK other = (InvProductoMarcaPK) object;
		if ((this.marEmpresa == null && other.marEmpresa != null)
				|| (this.marEmpresa != null && !this.marEmpresa.equals(other.marEmpresa))) {
			return false;
		}
		if ((this.marCodigo == null && other.marCodigo != null)
				|| (this.marCodigo != null && !this.marCodigo.equals(other.marCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvProductoMarcaPK[ marEmpresa=" + marEmpresa + ", marCodigo=" + marCodigo + " ]";
	}

}
