package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InvTransferenciasMotivoPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "tm_empresa")
	private String tmEmpresa;
	@Column(name = "tm_codigo")
	private String tmCodigo;

	public InvTransferenciasMotivoPK() {
	}

	public InvTransferenciasMotivoPK(String tmEmpresa, String tmCodigo) {
		this.tmEmpresa = tmEmpresa;
		this.tmCodigo = tmCodigo;
	}

	public String getTmEmpresa() {
		return tmEmpresa;
	}

	public void setTmEmpresa(String tmEmpresa) {
		this.tmEmpresa = tmEmpresa;
	}

	public String getTmCodigo() {
		return tmCodigo;
	}

	public void setTmCodigo(String tmCodigo) {
		this.tmCodigo = tmCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (tmEmpresa != null ? tmEmpresa.hashCode() : 0);
		hash += (tmCodigo != null ? tmCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof InvTransferenciasMotivoPK)) {
			return false;
		}
		InvTransferenciasMotivoPK other = (InvTransferenciasMotivoPK) object;
		if ((this.tmEmpresa == null && other.tmEmpresa != null)
				|| (this.tmEmpresa != null && !this.tmEmpresa.equals(other.tmEmpresa))) {
			return false;
		}
		if ((this.tmCodigo == null && other.tmCodigo != null)
				|| (this.tmCodigo != null && !this.tmCodigo.equals(other.tmCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvTransferenciasMotivoPK[ tmEmpresa=" + tmEmpresa + ", tmCodigo=" + tmCodigo + " ]";
	}

}
