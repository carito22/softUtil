package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrdPresupuestoPescaMotivoPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private String presuEmpresa;
	private String presuCodigo;

	public PrdPresupuestoPescaMotivoPK() {
	}

	public PrdPresupuestoPescaMotivoPK(String presuEmpresa, String presuCodigo) {
		this.presuEmpresa = presuEmpresa;
		this.presuCodigo = presuCodigo;
	}

	@Column(name = "presu_empresa")
	public String getPresuEmpresa() {
		return presuEmpresa;
	}

	public void setPresuEmpresa(String presuEmpresa) {
		this.presuEmpresa = presuEmpresa;
	}

	@Column(name = "presu_codigo")
	public String getPresuCodigo() {
		return presuCodigo;
	}

	public void setPresuCodigo(String presuCodigo) {
		this.presuCodigo = presuCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (presuEmpresa != null ? presuEmpresa.hashCode() : 0);
		hash += (presuCodigo != null ? presuCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdPresupuestoPescaMotivoPK)) {
			return false;
		}
		PrdPresupuestoPescaMotivoPK other = (PrdPresupuestoPescaMotivoPK) object;
		if ((this.presuEmpresa == null && other.presuEmpresa != null)
				|| (this.presuEmpresa != null && !this.presuEmpresa.equals(other.presuEmpresa))) {
			return false;
		}
		if ((this.presuCodigo == null && other.presuCodigo != null)
				|| (this.presuCodigo != null && !this.presuCodigo.equals(other.presuCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "produccion.entity.PrdLiquidacionMotivoPK[ presuEmpresa=" + presuEmpresa + ", presuCodigo=" + presuCodigo
				+ " ]";
	}

}
