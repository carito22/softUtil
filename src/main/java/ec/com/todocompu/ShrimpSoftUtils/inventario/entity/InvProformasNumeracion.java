package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "inv_proformas_numeracion", schema = "inventario")
public class InvProformasNumeracion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected InvProformasNumeracionPK invProformasNumeracionPK;
	@Column(name = "num_secuencia", insertable = false, updatable = false)
	private String numSecuencia;

	public InvProformasNumeracion() {
	}

	public InvProformasNumeracion(InvProformasNumeracionPK invProformasNumeracionPK) {
		this.invProformasNumeracionPK = invProformasNumeracionPK;
	}

	public InvProformasNumeracion(InvProformasNumeracionPK invProformasNumeracionPK, String numSecuencia) {
		this.invProformasNumeracionPK = invProformasNumeracionPK;
		this.numSecuencia = numSecuencia;
	}

	public InvProformasNumeracion(String numEmpresa, String numPeriodo, String numMotivo) {
		this.invProformasNumeracionPK = new InvProformasNumeracionPK(numEmpresa, numPeriodo, numMotivo);
	}

	public InvProformasNumeracionPK getInvProformasNumeracionPK() {
		return invProformasNumeracionPK;
	}

	public void setInvProformasNumeracionPK(InvProformasNumeracionPK invProformasNumeracionPK) {
		this.invProformasNumeracionPK = invProformasNumeracionPK;
	}

	public String getNumSecuencia() {
		return numSecuencia;
	}

	public void setNumSecuencia(String numSecuencia) {
		this.numSecuencia = numSecuencia;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (invProformasNumeracionPK != null ? invProformasNumeracionPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvProformasNumeracion)) {
			return false;
		}
		InvProformasNumeracion other = (InvProformasNumeracion) object;
		if ((this.invProformasNumeracionPK == null && other.invProformasNumeracionPK != null)
				|| (this.invProformasNumeracionPK != null
						&& !this.invProformasNumeracionPK.equals(other.invProformasNumeracionPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvProformasNumeracion[ invProformasNumeracionPK=" + invProformasNumeracionPK + " ]";
	}

}
