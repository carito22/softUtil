package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "prd_liquidacion_numeracion", schema = "produccion")
public class PrdPresupuestoPescaNumeracion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected PrdPresupuestoPescaNumeracionPK prdPresupuestoPescaNumeracionPK;
	@Column(name = "num_secuencia")
	private String numSecuencia;

	public PrdPresupuestoPescaNumeracion() {
	}

	public PrdPresupuestoPescaNumeracion(PrdPresupuestoPescaNumeracionPK prdPresupuestoPescaNumeracionPK) {
		this.prdPresupuestoPescaNumeracionPK = prdPresupuestoPescaNumeracionPK;
	}

	public PrdPresupuestoPescaNumeracion(PrdPresupuestoPescaNumeracionPK prdPresupuestoPescaNumeracionPK,
			String numSecuencia) {
		this.prdPresupuestoPescaNumeracionPK = prdPresupuestoPescaNumeracionPK;
		this.numSecuencia = numSecuencia;
	}

	public PrdPresupuestoPescaNumeracion(String numEmpresa, String numMotivo) {
		this.prdPresupuestoPescaNumeracionPK = new PrdPresupuestoPescaNumeracionPK(numEmpresa, numMotivo);
	}

	public PrdPresupuestoPescaNumeracionPK getPrdPresupuestoPescaNumeracionPK() {
		return prdPresupuestoPescaNumeracionPK;
	}

	public void setPrdPresupuestoPescaNumeracionPK(PrdPresupuestoPescaNumeracionPK prdPresupuestoPescaNumeracionPK) {
		this.prdPresupuestoPescaNumeracionPK = prdPresupuestoPescaNumeracionPK;
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
		hash += (prdPresupuestoPescaNumeracionPK != null ? prdPresupuestoPescaNumeracionPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdPresupuestoPescaNumeracion)) {
			return false;
		}
		PrdPresupuestoPescaNumeracion other = (PrdPresupuestoPescaNumeracion) object;
		if ((this.prdPresupuestoPescaNumeracionPK == null && other.prdPresupuestoPescaNumeracionPK != null)
				|| (this.prdPresupuestoPescaNumeracionPK != null
						&& !this.prdPresupuestoPescaNumeracionPK.equals(other.prdPresupuestoPescaNumeracionPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "produccion.entity.PrdLiquidacionNumeracion[ prdPresupuestoPescaNumeracionPK="
				+ prdPresupuestoPescaNumeracionPK + " ]";
	}

}
