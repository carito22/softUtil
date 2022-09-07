package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InvConsumosMotivoPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "cm_empresa")
	private String cmEmpresa;
	@Column(name = "cm_codigo")
	private String cmCodigo;

	public InvConsumosMotivoPK() {
	}

	public InvConsumosMotivoPK(String cmEmpresa, String cmCodigo) {
		this.cmEmpresa = cmEmpresa;
		this.cmCodigo = cmCodigo;
	}

	public String getCmEmpresa() {
		return cmEmpresa;
	}

	public void setCmEmpresa(String cmEmpresa) {
		this.cmEmpresa = cmEmpresa;
	}

	public String getCmCodigo() {
		return cmCodigo;
	}

	public void setCmCodigo(String cmCodigo) {
		this.cmCodigo = cmCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (cmEmpresa != null ? cmEmpresa.hashCode() : 0);
		hash += (cmCodigo != null ? cmCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvConsumosMotivoPK)) {
			return false;
		}
		InvConsumosMotivoPK other = (InvConsumosMotivoPK) object;
		if ((this.cmEmpresa == null && other.cmEmpresa != null)
				|| (this.cmEmpresa != null && !this.cmEmpresa.equals(other.cmEmpresa))) {
			return false;
		}
		if ((this.cmCodigo == null && other.cmCodigo != null)
				|| (this.cmCodigo != null && !this.cmCodigo.equals(other.cmCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvConsumosMotivoPK[ cmEmpresa=" + cmEmpresa + ", cmCodigo=" + cmCodigo + " ]";
	}

}
