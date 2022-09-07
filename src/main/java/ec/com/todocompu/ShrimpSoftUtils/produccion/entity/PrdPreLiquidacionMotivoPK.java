package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrdPreLiquidacionMotivoPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private String plmEmpresa;
	private String plmCodigo;

	public PrdPreLiquidacionMotivoPK() {
	}

	public PrdPreLiquidacionMotivoPK(String plmEmpresa, String plmCodigo) {
		this.plmEmpresa = plmEmpresa;
		this.plmCodigo = plmCodigo;
	}

	@Column(name = "plm_empresa")
	public String getPlmEmpresa() {
		return plmEmpresa;
	}

	public void setPlmEmpresa(String plmEmpresa) {
		this.plmEmpresa = plmEmpresa;
	}

	@Column(name = "plm_codigo")
	public String getPlmCodigo() {
		return plmCodigo;
	}

	public void setPlmCodigo(String plmCodigo) {
		this.plmCodigo = plmCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (plmEmpresa != null ? plmEmpresa.hashCode() : 0);
		hash += (plmCodigo != null ? plmCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdPreLiquidacionMotivoPK)) {
			return false;
		}
		PrdPreLiquidacionMotivoPK other = (PrdPreLiquidacionMotivoPK) object;
		if ((this.plmEmpresa == null && other.plmEmpresa != null)
				|| (this.plmEmpresa != null && !this.plmEmpresa.equals(other.plmEmpresa))) {
			return false;
		}
		if ((this.plmCodigo == null && other.plmCodigo != null)
				|| (this.plmCodigo != null && !this.plmCodigo.equals(other.plmCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "produccion.entity.PrdLiquidacionMotivoPK[ plmEmpresa=" + plmEmpresa + ", plmCodigo=" + plmCodigo + " ]";
	}

}
