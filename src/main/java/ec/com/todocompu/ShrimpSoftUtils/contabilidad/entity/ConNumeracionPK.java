package ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ConNumeracionPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "num_empresa", insertable = false, updatable = false)
	private String numEmpresa;
	@Column(name = "num_periodo", insertable = false, updatable = false)
	private String numPeriodo;
	@Column(name = "num_tipo", insertable = false, updatable = false)
	private String numTipo;

	public ConNumeracionPK() {
	}

	public ConNumeracionPK(String numEmpresa, String numPeriodo, String numTipo) {
		this.numEmpresa = numEmpresa;
		this.numPeriodo = numPeriodo;
		this.numTipo = numTipo;
	}

	public String getNumEmpresa() {
		return numEmpresa;
	}

	public void setNumEmpresa(String numEmpresa) {
		this.numEmpresa = numEmpresa;
	}

	public String getNumPeriodo() {
		return numPeriodo;
	}

	public void setNumPeriodo(String numPeriodo) {
		this.numPeriodo = numPeriodo;
	}

	public String getNumTipo() {
		return numTipo;
	}

	public void setNumTipo(String numTipo) {
		this.numTipo = numTipo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (numEmpresa != null ? numEmpresa.hashCode() : 0);
		hash += (numPeriodo != null ? numPeriodo.hashCode() : 0);
		hash += (numTipo != null ? numTipo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof ConNumeracionPK)) {
			return false;
		}
		ConNumeracionPK other = (ConNumeracionPK) object;
		if ((this.numEmpresa == null && other.numEmpresa != null)
				|| (this.numEmpresa != null && !this.numEmpresa.equals(other.numEmpresa))) {
			return false;
		}
		if ((this.numPeriodo == null && other.numPeriodo != null)
				|| (this.numPeriodo != null && !this.numPeriodo.equals(other.numPeriodo))) {
			return false;
		}
		if ((this.numTipo == null && other.numTipo != null)
				|| (this.numTipo != null && !this.numTipo.equals(other.numTipo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "contabilidad.entity.ConNumeracionPK[ numEmpresa=" + numEmpresa + ", numPeriodo=" + numPeriodo
				+ ", numTipo=" + numTipo + " ]";
	}

}
