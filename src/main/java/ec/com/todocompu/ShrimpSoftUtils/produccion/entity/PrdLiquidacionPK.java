package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrdLiquidacionPK implements Serializable {
	private static final long serialVersionUID = 1L;

        @Column(name = "liq_empresa")
	private String liqEmpresa;
        @Column(name = "liq_motivo")
	private String liqMotivo;
        @Column(name = "liq_numero")
	private String liqNumero;

	public PrdLiquidacionPK() {
	}

	public PrdLiquidacionPK(String liqEmpresa, String liqMotivo, String liqNumero) {
		this.liqEmpresa = liqEmpresa;
		this.liqMotivo = liqMotivo;
		this.liqNumero = liqNumero;
	}

	public String getLiqEmpresa() {
		return liqEmpresa;
	}

	public void setLiqEmpresa(String liqEmpresa) {
		this.liqEmpresa = liqEmpresa;
	}

	public String getLiqMotivo() {
		return liqMotivo;
	}

	public void setLiqMotivo(String liqMotivo) {
		this.liqMotivo = liqMotivo;
	}

	public String getLiqNumero() {
		return liqNumero;
	}

	public void setLiqNumero(String liqNumero) {
		this.liqNumero = liqNumero;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (liqEmpresa != null ? liqEmpresa.hashCode() : 0);
		hash += (liqMotivo != null ? liqMotivo.hashCode() : 0);
		hash += (liqNumero != null ? liqNumero.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdLiquidacionPK)) {
			return false;
		}
		PrdLiquidacionPK other = (PrdLiquidacionPK) object;
		if ((this.liqEmpresa == null && other.liqEmpresa != null)
				|| (this.liqEmpresa != null && !this.liqEmpresa.equals(other.liqEmpresa))) {
			return false;
		}
		if ((this.liqMotivo == null && other.liqMotivo != null)
				|| (this.liqMotivo != null && !this.liqMotivo.equals(other.liqMotivo))) {
			return false;
		}
		if ((this.liqNumero == null && other.liqNumero != null)
				|| (this.liqNumero != null && !this.liqNumero.equals(other.liqNumero))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "produccion.entity.PrdLiquidacionPK[ liqEmpresa=" + liqEmpresa + ", liqMotivo=" + liqMotivo
				+ ", liqNumero=" + liqNumero + " ]";
	}

}
