package ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "con_numeracion", schema = "contabilidad")
public class ConNumeracion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected ConNumeracionPK conNumeracionPK;
	@Column(name = "num_secuencia", insertable = false, updatable = false)
	private int numSecuencia;

	public ConNumeracion() {
	}

	public ConNumeracion(ConNumeracionPK conNumeracionPK) {
		this.conNumeracionPK = conNumeracionPK;
	}

	public ConNumeracion(ConNumeracionPK conNumeracionPK, int numSecuencia) {
		this.conNumeracionPK = conNumeracionPK;
		this.numSecuencia = numSecuencia;
	}

	public ConNumeracion(String numEmpresa, String numPeriodo, String numTipo) {
		this.conNumeracionPK = new ConNumeracionPK(numEmpresa, numPeriodo, numTipo);
	}

	public ConNumeracionPK getConNumeracionPK() {
		return conNumeracionPK;
	}

	public void setConNumeracionPK(ConNumeracionPK conNumeracionPK) {
		this.conNumeracionPK = conNumeracionPK;
	}

	public int getNumSecuencia() {
		return numSecuencia;
	}

	public void setNumSecuencia(int numSecuencia) {
		this.numSecuencia = numSecuencia;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (conNumeracionPK != null ? conNumeracionPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof ConNumeracion)) {
			return false;
		}
		ConNumeracion other = (ConNumeracion) object;
		if ((this.conNumeracionPK == null && other.conNumeracionPK != null)
				|| (this.conNumeracionPK != null && !this.conNumeracionPK.equals(other.conNumeracionPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "contabilidad.entity.ConNumeracion[ conNumeracionPK=" + conNumeracionPK + " numeracion=" + numSecuencia
				+ " ]";
	}

}
