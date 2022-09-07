package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InvBodegaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "bod_empresa")
	private String bodEmpresa;
	@Column(name = "bod_codigo")
	private String bodCodigo;

	public InvBodegaPK() {
	}

	public InvBodegaPK(String bodEmpresa, String bodCodigo) {
		this.bodEmpresa = bodEmpresa;
		this.bodCodigo = bodCodigo;
	}

	public String getBodEmpresa() {
		return bodEmpresa;
	}

	public void setBodEmpresa(String bodEmpresa) {
		this.bodEmpresa = bodEmpresa;
	}

	public String getBodCodigo() {
		return bodCodigo;
	}

	public void setBodCodigo(String bodCodigo) {
		this.bodCodigo = bodCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (bodEmpresa != null ? bodEmpresa.hashCode() : 0);
		hash += (bodCodigo != null ? bodCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof InvBodegaPK)) {
			return false;
		}
		InvBodegaPK other = (InvBodegaPK) object;
		if ((this.bodEmpresa == null && other.bodEmpresa != null)
				|| (this.bodEmpresa != null && !this.bodEmpresa.equals(other.bodEmpresa))) {
			return false;
		}
		if ((this.bodCodigo == null && other.bodCodigo != null)
				|| (this.bodCodigo != null && !this.bodCodigo.equals(other.bodCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvBodegaPK[ bodEmpresa=" + bodEmpresa + ", bodCodigo=" + bodCodigo + " ]";
	}

}
