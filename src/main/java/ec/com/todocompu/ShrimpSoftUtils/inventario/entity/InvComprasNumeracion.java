package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "inv_compras_numeracion", schema = "inventario")
public class InvComprasNumeracion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected InvComprasNumeracionPK invComprasNumeracionPK;
	@Column(name = "num_secuencia", insertable = false, updatable = false)
	private String numSecuencia;

	public InvComprasNumeracion() {
	}

	public InvComprasNumeracion(InvComprasNumeracionPK invComprasNumeracionPK) {
		this.invComprasNumeracionPK = invComprasNumeracionPK;
	}

	public InvComprasNumeracion(InvComprasNumeracionPK invComprasNumeracionPK, String numSecuencia) {
		this.invComprasNumeracionPK = invComprasNumeracionPK;
		this.numSecuencia = numSecuencia;
	}

	public InvComprasNumeracion(String numEmpresa, String numPeriodo, String numMotivo) {
		this.invComprasNumeracionPK = new InvComprasNumeracionPK(numEmpresa, numPeriodo, numMotivo);
	}

	public InvComprasNumeracionPK getInvComprasNumeracionPK() {
		return invComprasNumeracionPK;
	}

	public void setInvComprasNumeracionPK(InvComprasNumeracionPK invComprasNumeracionPK) {
		this.invComprasNumeracionPK = invComprasNumeracionPK;
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
		hash += (invComprasNumeracionPK != null ? invComprasNumeracionPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvComprasNumeracion)) {
			return false;
		}
		InvComprasNumeracion other = (InvComprasNumeracion) object;
		if ((this.invComprasNumeracionPK == null && other.invComprasNumeracionPK != null)
				|| (this.invComprasNumeracionPK != null
						&& !this.invComprasNumeracionPK.equals(other.invComprasNumeracionPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvComprasNumeracion[ invComprasNumeracionPK=" + invComprasNumeracionPK + " ]";
	}

}
