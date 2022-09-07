package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrdLiquidacionMotivoPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private String lmEmpresa;
	private String lmCodigo;

	public PrdLiquidacionMotivoPK() {
	}

	public PrdLiquidacionMotivoPK(String lmEmpresa, String lmCodigo) {
		this.lmEmpresa = lmEmpresa;
		this.lmCodigo = lmCodigo;
	}

	@Column(name = "lm_empresa")
	public String getLmEmpresa() {
		return lmEmpresa;
	}

	public void setLmEmpresa(String lmEmpresa) {
		this.lmEmpresa = lmEmpresa;
	}

	@Column(name = "lm_codigo")
	public String getLmCodigo() {
		return lmCodigo;
	}

	public void setLmCodigo(String lmCodigo) {
		this.lmCodigo = lmCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (lmEmpresa != null ? lmEmpresa.hashCode() : 0);
		hash += (lmCodigo != null ? lmCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdLiquidacionMotivoPK)) {
			return false;
		}
		PrdLiquidacionMotivoPK other = (PrdLiquidacionMotivoPK) object;
		if ((this.lmEmpresa == null && other.lmEmpresa != null)
				|| (this.lmEmpresa != null && !this.lmEmpresa.equals(other.lmEmpresa))) {
			return false;
		}
		if ((this.lmCodigo == null && other.lmCodigo != null)
				|| (this.lmCodigo != null && !this.lmCodigo.equals(other.lmCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "produccion.entity.PrdLiquidacionMotivoPK[ lmEmpresa=" + lmEmpresa + ", lmCodigo=" + lmCodigo + " ]";
	}

}
