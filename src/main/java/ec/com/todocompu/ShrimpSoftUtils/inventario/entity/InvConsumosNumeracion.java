package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "inv_consumos_numeracion", schema = "inventario")
public class InvConsumosNumeracion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected InvConsumosNumeracionPK invConsumosNumeracionPK;
	@Column(name = "num_secuencia", insertable = false, updatable = false)
	private String numSecuencia;

	public InvConsumosNumeracion() {
	}

	public InvConsumosNumeracion(InvConsumosNumeracionPK invConsumosNumeracionPK) {
		this.invConsumosNumeracionPK = invConsumosNumeracionPK;
	}

	public InvConsumosNumeracion(InvConsumosNumeracionPK invConsumosNumeracionPK, String numSecuencia) {
		this.invConsumosNumeracionPK = invConsumosNumeracionPK;
		this.numSecuencia = numSecuencia;
	}

	public InvConsumosNumeracion(String numEmpresa, String numPeriodo, String numMotivo) {
		this.invConsumosNumeracionPK = new InvConsumosNumeracionPK(numEmpresa, numPeriodo, numMotivo);
	}

	public InvConsumosNumeracionPK getInvConsumosNumeracionPK() {
		return invConsumosNumeracionPK;
	}

	public void setInvConsumosNumeracionPK(InvConsumosNumeracionPK invConsumosNumeracionPK) {
		this.invConsumosNumeracionPK = invConsumosNumeracionPK;
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
		hash += (invConsumosNumeracionPK != null ? invConsumosNumeracionPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvConsumosNumeracion)) {
			return false;
		}
		InvConsumosNumeracion other = (InvConsumosNumeracion) object;
		if ((this.invConsumosNumeracionPK == null && other.invConsumosNumeracionPK != null)
				|| (this.invConsumosNumeracionPK != null
						&& !this.invConsumosNumeracionPK.equals(other.invConsumosNumeracionPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvConsumosNumeracion[ invConsumosNumeracionPK=" + invConsumosNumeracionPK + " ]";
	}

}
