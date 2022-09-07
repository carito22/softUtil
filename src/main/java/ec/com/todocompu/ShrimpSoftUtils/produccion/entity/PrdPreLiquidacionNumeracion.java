package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "prd_preliquidacion_numeracion", schema = "produccion")
public class PrdPreLiquidacionNumeracion implements Serializable {
	private static final long serialVersionUID = 1L;

	protected PrdPreLiquidacionNumeracionPK prdPreLiquidacionNumeracionPK;
	private String numSecuencia;

	public PrdPreLiquidacionNumeracion() {
	}

	public PrdPreLiquidacionNumeracion(PrdPreLiquidacionNumeracionPK prdPreLiquidacionNumeracionPK) {
		this.prdPreLiquidacionNumeracionPK = prdPreLiquidacionNumeracionPK;
	}

	public PrdPreLiquidacionNumeracion(PrdPreLiquidacionNumeracionPK prdPreLiquidacionNumeracionPK,
			String numSecuencia) {
		this.prdPreLiquidacionNumeracionPK = prdPreLiquidacionNumeracionPK;
		this.numSecuencia = numSecuencia;
	}

	public PrdPreLiquidacionNumeracion(String numEmpresa, String numMotivo) {
		this.prdPreLiquidacionNumeracionPK = new PrdPreLiquidacionNumeracionPK(numEmpresa, numMotivo);
	}

	@EmbeddedId
	public PrdPreLiquidacionNumeracionPK getPrdPreLiquidacionNumeracionPK() {
		return prdPreLiquidacionNumeracionPK;
	}

	public void setPrdPreLiquidacionNumeracionPK(PrdPreLiquidacionNumeracionPK prdPreLiquidacionNumeracionPK) {
		this.prdPreLiquidacionNumeracionPK = prdPreLiquidacionNumeracionPK;
	}

	@Column(name = "num_secuencia")
	public String getNumSecuencia() {
		return numSecuencia;
	}

	public void setNumSecuencia(String numSecuencia) {
		this.numSecuencia = numSecuencia;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (prdPreLiquidacionNumeracionPK != null ? prdPreLiquidacionNumeracionPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdPreLiquidacionNumeracion)) {
			return false;
		}
		PrdPreLiquidacionNumeracion other = (PrdPreLiquidacionNumeracion) object;
		if ((this.prdPreLiquidacionNumeracionPK == null && other.prdPreLiquidacionNumeracionPK != null)
				|| (this.prdPreLiquidacionNumeracionPK != null
						&& !this.prdPreLiquidacionNumeracionPK.equals(other.prdPreLiquidacionNumeracionPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "produccion.entity.PrdLiquidacionNumeracion[ prdPreLiquidacionNumeracionPK="
				+ prdPreLiquidacionNumeracionPK + " ]";
	}

}
