package ec.com.todocompu.ShrimpSoftUtils.caja.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CajValesPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "vale_empresa")
	private String valeEmpresa;
	@Column(name = "vale_periodo")
	private String valePeriodo;
	@Column(name = "vale_motivo")
	private String valeMotivo;
	@Column(name = "vale_numero")
	private String valeNumero;

	public CajValesPK() {
	}

	public CajValesPK(String valeEmpresa, String valePeriodo, String valeMotivo, String valeNumero) {
		this.valeEmpresa = valeEmpresa;
		this.valePeriodo = valePeriodo;
		this.valeMotivo = valeMotivo;
		this.valeNumero = valeNumero;
	}

	public String getValeEmpresa() {
		return valeEmpresa;
	}

	public void setValeEmpresa(String valeEmpresa) {
		this.valeEmpresa = valeEmpresa;
	}

	public String getValePeriodo() {
		return valePeriodo;
	}

	public void setValePeriodo(String valePeriodo) {
		this.valePeriodo = valePeriodo;
	}

	public String getValeMotivo() {
		return valeMotivo;
	}

	public void setValeMotivo(String valeMotivo) {
		this.valeMotivo = valeMotivo;
	}

	public String getValeNumero() {
		return valeNumero;
	}

	public void setValeNumero(String valeNumero) {
		this.valeNumero = valeNumero;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (valeEmpresa != null ? valeEmpresa.hashCode() : 0);
		hash += (valePeriodo != null ? valePeriodo.hashCode() : 0);
		hash += (valeMotivo != null ? valeMotivo.hashCode() : 0);
		hash += (valeNumero != null ? valeNumero.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof CajValesPK)) {
			return false;
		}
		CajValesPK other = (CajValesPK) object;
		if ((this.valeEmpresa == null && other.valeEmpresa != null)
				|| (this.valeEmpresa != null && !this.valeEmpresa.equals(other.valeEmpresa))) {
			return false;
		}
		if ((this.valePeriodo == null && other.valePeriodo != null)
				|| (this.valePeriodo != null && !this.valePeriodo.equals(other.valePeriodo))) {
			return false;
		}
		if ((this.valeMotivo == null && other.valeMotivo != null)
				|| (this.valeMotivo != null && !this.valeMotivo.equals(other.valeMotivo))) {
			return false;
		}
		if ((this.valeNumero == null && other.valeNumero != null)
				|| (this.valeNumero != null && !this.valeNumero.equals(other.valeNumero))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "caja.entity.CajValesPK[ valeEmpresa=" + valeEmpresa + ", valePeriodo=" + valePeriodo + ", valeMotivo="
				+ valeMotivo + ", valeNumero=" + valeNumero + " ]";
	}

}
