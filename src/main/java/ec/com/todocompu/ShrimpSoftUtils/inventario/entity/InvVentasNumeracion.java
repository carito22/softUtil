package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "inv_ventas_numeracion", schema = "inventario")
public class InvVentasNumeracion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected InvVentasNumeracionPK invVentasNumeracionPK;
	@Column(name = "num_secuencia", insertable = false, updatable = false)
	private String numSecuencia;

	public InvVentasNumeracion() {
	}

	public InvVentasNumeracion(InvVentasNumeracionPK invVentasNumeracionPK) {
		this.invVentasNumeracionPK = invVentasNumeracionPK;
	}

	public InvVentasNumeracion(InvVentasNumeracionPK invVentasNumeracionPK, String numSecuencia) {
		this.invVentasNumeracionPK = invVentasNumeracionPK;
		this.numSecuencia = numSecuencia;
	}

	public InvVentasNumeracion(String numEmpresa, String numPeriodo, String numMotivo) {
		this.invVentasNumeracionPK = new InvVentasNumeracionPK(numEmpresa, numPeriodo, numMotivo);
	}

	public InvVentasNumeracionPK getInvVentasNumeracionPK() {
		return invVentasNumeracionPK;
	}

	public void setInvVentasNumeracionPK(InvVentasNumeracionPK invVentasNumeracionPK) {
		this.invVentasNumeracionPK = invVentasNumeracionPK;
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
		hash += (invVentasNumeracionPK != null ? invVentasNumeracionPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvVentasNumeracion)) {
			return false;
		}
		InvVentasNumeracion other = (InvVentasNumeracion) object;
		if ((this.invVentasNumeracionPK == null && other.invVentasNumeracionPK != null)
				|| (this.invVentasNumeracionPK != null
						&& !this.invVentasNumeracionPK.equals(other.invVentasNumeracionPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvVentasNumeracion[ invVentasNumeracionPK=" + invVentasNumeracionPK + " ]";
	}

}
