package ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ConContableMotivoAnulacionPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "anu_empresa")
	private String anuEmpresa;
	@Column(name = "anu_periodo")
	private String anuPeriodo;
	@Column(name = "anu_tipo")
	private String anuTipo;
	@Column(name = "anu_numero")
	private String anuNumero;

	public ConContableMotivoAnulacionPK() {
	}

	public ConContableMotivoAnulacionPK(String anuEmpresa, String anuPeriodo, String anuTipo, String anuNumero) {
		this.anuEmpresa = anuEmpresa;
		this.anuPeriodo = anuPeriodo;
		this.anuTipo = anuTipo;
		this.anuNumero = anuNumero;
	}

	public String getAnuEmpresa() {
		return anuEmpresa;
	}

	public void setAnuEmpresa(String anuEmpresa) {
		this.anuEmpresa = anuEmpresa;
	}

	public String getAnuPeriodo() {
		return anuPeriodo;
	}

	public void setAnuPeriodo(String anuPeriodo) {
		this.anuPeriodo = anuPeriodo;
	}

	public String getAnuTipo() {
		return anuTipo;
	}

	public void setAnuTipo(String anuTipo) {
		this.anuTipo = anuTipo;
	}

	public String getAnuNumero() {
		return anuNumero;
	}

	public void setAnuNumero(String anuNumero) {
		this.anuNumero = anuNumero;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (anuEmpresa != null ? anuEmpresa.hashCode() : 0);
		hash += (anuPeriodo != null ? anuPeriodo.hashCode() : 0);
		hash += (anuTipo != null ? anuTipo.hashCode() : 0);
		hash += (anuNumero != null ? anuNumero.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof ConContableMotivoAnulacionPK)) {
			return false;
		}
		ConContableMotivoAnulacionPK other = (ConContableMotivoAnulacionPK) object;
		if ((this.anuEmpresa == null && other.anuEmpresa != null)
				|| (this.anuEmpresa != null && !this.anuEmpresa.equals(other.anuEmpresa))) {
			return false;
		}
		if ((this.anuPeriodo == null && other.anuPeriodo != null)
				|| (this.anuPeriodo != null && !this.anuPeriodo.equals(other.anuPeriodo))) {
			return false;
		}
		if ((this.anuTipo == null && other.anuTipo != null)
				|| (this.anuTipo != null && !this.anuTipo.equals(other.anuTipo))) {
			return false;
		}
		if ((this.anuNumero == null && other.anuNumero != null)
				|| (this.anuNumero != null && !this.anuNumero.equals(other.anuNumero))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "contabilidad.entity.ConContableMotivoAnulacionPK[ anuEmpresa=" + anuEmpresa + ", anuPeriodo="
				+ anuPeriodo + ", anuTipo=" + anuTipo + ", anuNumero=" + anuNumero + " ]";
	}

}
