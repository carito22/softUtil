package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "prd_liquidacion_numeracion", schema = "produccion")
public class PrdLiquidacionNumeracion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected PrdLiquidacionNumeracionPK prdLiquidacionNumeracionPK;
	@Column(name = "num_secuencia")
	private String numSecuencia;

	public PrdLiquidacionNumeracion() {
	}

	public PrdLiquidacionNumeracion(PrdLiquidacionNumeracionPK prdLiquidacionNumeracionPK) {
		this.prdLiquidacionNumeracionPK = prdLiquidacionNumeracionPK;
	}

	public PrdLiquidacionNumeracion(PrdLiquidacionNumeracionPK prdLiquidacionNumeracionPK, String numSecuencia) {
		this.prdLiquidacionNumeracionPK = prdLiquidacionNumeracionPK;
		this.numSecuencia = numSecuencia;
	}

	public PrdLiquidacionNumeracion(String numEmpresa, String numMotivo) {
		this.prdLiquidacionNumeracionPK = new PrdLiquidacionNumeracionPK(numEmpresa, numMotivo);
	}

	public PrdLiquidacionNumeracionPK getPrdLiquidacionNumeracionPK() {
		return prdLiquidacionNumeracionPK;
	}

	public void setPrdLiquidacionNumeracionPK(PrdLiquidacionNumeracionPK prdLiquidacionNumeracionPK) {
		this.prdLiquidacionNumeracionPK = prdLiquidacionNumeracionPK;
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
		hash += (prdLiquidacionNumeracionPK != null ? prdLiquidacionNumeracionPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdLiquidacionNumeracion)) {
			return false;
		}
		PrdLiquidacionNumeracion other = (PrdLiquidacionNumeracion) object;
		if ((this.prdLiquidacionNumeracionPK == null && other.prdLiquidacionNumeracionPK != null)
				|| (this.prdLiquidacionNumeracionPK != null
						&& !this.prdLiquidacionNumeracionPK.equals(other.prdLiquidacionNumeracionPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "produccion.entity.PrdLiquidacionNumeracion[ prdLiquidacionNumeracionPK=" + prdLiquidacionNumeracionPK
				+ " ]";
	}

}
