package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InvProductoMedidaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "med_empresa")
	private String medEmpresa;
	@Column(name = "med_codigo")
	private String medCodigo;

	public InvProductoMedidaPK() {
	}

	public InvProductoMedidaPK(String medEmpresa, String medCodigo) {
		this.medEmpresa = medEmpresa;
		this.medCodigo = medCodigo;
	}

	public String getMedEmpresa() {
		return medEmpresa;
	}

	public void setMedEmpresa(String medEmpresa) {
		this.medEmpresa = medEmpresa;
	}

	public String getMedCodigo() {
		return medCodigo;
	}

	public void setMedCodigo(String medCodigo) {
		this.medCodigo = medCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (medEmpresa != null ? medEmpresa.hashCode() : 0);
		hash += (medCodigo != null ? medCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvProductoMedidaPK)) {
			return false;
		}
		InvProductoMedidaPK other = (InvProductoMedidaPK) object;
		if ((this.medEmpresa == null && other.medEmpresa != null)
				|| (this.medEmpresa != null && !this.medEmpresa.equals(other.medEmpresa))) {
			return false;
		}
		if ((this.medCodigo == null && other.medCodigo != null)
				|| (this.medCodigo != null && !this.medCodigo.equals(other.medCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvProductoMedidaPK[ medEmpresa=" + medEmpresa + ", medCodigo=" + medCodigo + " ]";
	}

}
