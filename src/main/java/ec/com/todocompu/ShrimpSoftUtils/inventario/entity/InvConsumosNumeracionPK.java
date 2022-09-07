package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InvConsumosNumeracionPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "num_empresa", insertable = false, updatable = false)
	private String numEmpresa;
	@Column(name = "num_periodo", insertable = false, updatable = false)
	private String numPeriodo;
	@Column(name = "num_motivo", insertable = false, updatable = false)
	private String numMotivo;

	public InvConsumosNumeracionPK() {
	}

	public InvConsumosNumeracionPK(String numEmpresa, String numPeriodo, String numMotivo) {
		this.numEmpresa = numEmpresa;
		this.numPeriodo = numPeriodo;
		this.numMotivo = numMotivo;
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

	public String getNumMotivo() {
		return numMotivo;
	}

	public void setNumMotivo(String numMotivo) {
		this.numMotivo = numMotivo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (numEmpresa != null ? numEmpresa.hashCode() : 0);
		hash += (numPeriodo != null ? numPeriodo.hashCode() : 0);
		hash += (numMotivo != null ? numMotivo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvConsumosNumeracionPK)) {
			return false;
		}
		InvConsumosNumeracionPK other = (InvConsumosNumeracionPK) object;
		if ((this.numEmpresa == null && other.numEmpresa != null)
				|| (this.numEmpresa != null && !this.numEmpresa.equals(other.numEmpresa))) {
			return false;
		}
		if ((this.numPeriodo == null && other.numPeriodo != null)
				|| (this.numPeriodo != null && !this.numPeriodo.equals(other.numPeriodo))) {
			return false;
		}
		if ((this.numMotivo == null && other.numMotivo != null)
				|| (this.numMotivo != null && !this.numMotivo.equals(other.numMotivo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvConsumosNumeracionPK[ numEmpresa=" + numEmpresa + ", numPeriodo=" + numPeriodo
				+ ", numMotivo=" + numMotivo + " ]";
	}

}
