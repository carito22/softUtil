package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrdProductoPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private String prodEmpresa;
	private String prodCodigo;

	public PrdProductoPK() {
	}

	public PrdProductoPK(String prodEmpresa, String prodCodigo) {
		this.prodEmpresa = prodEmpresa;
		this.prodCodigo = prodCodigo;
	}

	@Column(name = "prod_empresa")
	public String getProdEmpresa() {
		return prodEmpresa;
	}

	public void setProdEmpresa(String prodEmpresa) {
		this.prodEmpresa = prodEmpresa;
	}

	@Column(name = "prod_codigo")
	public String getProdCodigo() {
		return prodCodigo;
	}

	public void setProdCodigo(String prodCodigo) {
		this.prodCodigo = prodCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (prodEmpresa != null ? prodEmpresa.hashCode() : 0);
		hash += (prodCodigo != null ? prodCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdProductoPK)) {
			return false;
		}
		PrdProductoPK other = (PrdProductoPK) object;
		if ((this.prodEmpresa == null && other.prodEmpresa != null)
				|| (this.prodEmpresa != null && !this.prodEmpresa.equals(other.prodEmpresa))) {
			return false;
		}
		if ((this.prodCodigo == null && other.prodCodigo != null)
				|| (this.prodCodigo != null && !this.prodCodigo.equals(other.prodCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "produccion.entity.PrdLiquidacionProductoPK[ prodEmpresa=" + prodEmpresa + ", prodCodigo=" + prodCodigo
				+ " ]";
	}

}
