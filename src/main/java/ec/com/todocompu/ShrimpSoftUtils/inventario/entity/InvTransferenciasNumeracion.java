package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "inv_transferencias_numeracion", schema = "inventario")
public class InvTransferenciasNumeracion implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected InvTransferenciasNumeracionPK invTransferenciasNumeracionPK;
	@Column(name = "num_secuencia", insertable = false, updatable = false)
	private String numSecuencia;

	public InvTransferenciasNumeracion() {
	}

	public InvTransferenciasNumeracion(InvTransferenciasNumeracionPK invTransferenciasNumeracionPK) {
		this.invTransferenciasNumeracionPK = invTransferenciasNumeracionPK;
	}

	public InvTransferenciasNumeracion(InvTransferenciasNumeracionPK invTransferenciasNumeracionPK,
			String numSecuencia) {
		this.invTransferenciasNumeracionPK = invTransferenciasNumeracionPK;
		this.numSecuencia = numSecuencia;
	}

	public InvTransferenciasNumeracion(String numEmpresa, String numPeriodo, String numMotivo) {
		this.invTransferenciasNumeracionPK = new InvTransferenciasNumeracionPK(numEmpresa, numPeriodo, numMotivo);
	}

	public InvTransferenciasNumeracionPK getInvTransferenciasNumeracionPK() {
		return invTransferenciasNumeracionPK;
	}

	public void setInvTransferenciasNumeracionPK(InvTransferenciasNumeracionPK invTransferenciasNumeracionPK) {
		this.invTransferenciasNumeracionPK = invTransferenciasNumeracionPK;
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
		hash += (invTransferenciasNumeracionPK != null ? invTransferenciasNumeracionPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvTransferenciasNumeracion)) {
			return false;
		}
		InvTransferenciasNumeracion other = (InvTransferenciasNumeracion) object;
		if ((this.invTransferenciasNumeracionPK == null && other.invTransferenciasNumeracionPK != null)
				|| (this.invTransferenciasNumeracionPK != null
						&& !this.invTransferenciasNumeracionPK.equals(other.invTransferenciasNumeracionPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvTransferenciasNumeracion[ invTransferenciasNumeracionPK="
				+ invTransferenciasNumeracionPK + " ]";
	}

}
