package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrdPresupuestoPescaNumeracionPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "num_empresa")
	private String numEmpresa;
	@Column(name = "num_motivo")
	private String numMotivo;

	public PrdPresupuestoPescaNumeracionPK() {
	}

	public PrdPresupuestoPescaNumeracionPK(String numEmpresa, String numMotivo) {
		this.numEmpresa = numEmpresa;
		this.numMotivo = numMotivo;
	}

	public String getNumEmpresa() {
		return numEmpresa;
	}

	public void setNumEmpresa(String numEmpresa) {
		this.numEmpresa = numEmpresa;
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
		hash += (numMotivo != null ? numMotivo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdPresupuestoPescaNumeracionPK)) {
			return false;
		}
		PrdPresupuestoPescaNumeracionPK other = (PrdPresupuestoPescaNumeracionPK) object;
		if ((this.numEmpresa == null && other.numEmpresa != null)
				|| (this.numEmpresa != null && !this.numEmpresa.equals(other.numEmpresa))) {
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
		return "produccion.entity.PrdLiquidacionNumeracionPK[ numEmpresa=" + numEmpresa + ", numMotivo=" + numMotivo
				+ " ]";
	}

}
