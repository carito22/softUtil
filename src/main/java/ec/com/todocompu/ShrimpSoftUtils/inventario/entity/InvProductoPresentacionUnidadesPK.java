package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InvProductoPresentacionUnidadesPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "presu_empresa")
	private String presuEmpresa;
	@Column(name = "presu_codigo")
	private String presuCodigo;

	public InvProductoPresentacionUnidadesPK() {
	}

	public InvProductoPresentacionUnidadesPK(String presuEmpresa, String presuCodigo) {
		this.presuEmpresa = presuEmpresa;
		this.presuCodigo = presuCodigo;
	}

	public String getPresuEmpresa() {
		return presuEmpresa;
	}

	public void setPresuEmpresa(String presuEmpresa) {
		this.presuEmpresa = presuEmpresa;
	}

	public String getPresuCodigo() {
		return presuCodigo;
	}

	public void setPresuCodigo(String presuCodigo) {
		this.presuCodigo = presuCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (presuEmpresa != null ? presuEmpresa.hashCode() : 0);
		hash += (presuCodigo != null ? presuCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvProductoPresentacionUnidadesPK)) {
			return false;
		}
		InvProductoPresentacionUnidadesPK other = (InvProductoPresentacionUnidadesPK) object;
		if ((this.presuEmpresa == null && other.presuEmpresa != null)
				|| (this.presuEmpresa != null && !this.presuEmpresa.equals(other.presuEmpresa))) {
			return false;
		}
		if ((this.presuCodigo == null && other.presuCodigo != null)
				|| (this.presuCodigo != null && !this.presuCodigo.equals(other.presuCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvProductoPresentacionUnidadesPK[ presuEmpresa=" + presuEmpresa + ", presuCodigo="
				+ presuCodigo + " ]";
	}

}
