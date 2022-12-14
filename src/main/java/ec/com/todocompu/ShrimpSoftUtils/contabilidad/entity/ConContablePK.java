package ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ConContablePK implements Serializable {
	private static final long serialVersionUID = 1L;

        @Column(name = "con_empresa")
	private String conEmpresa;
        @Column(name = "con_periodo")
	private String conPeriodo;
        @Column(name = "con_tipo")
	private String conTipo;
        @Column(name = "con_numero")
	private String conNumero;

	public ConContablePK() {
	}

	public ConContablePK(String conEmpresa, String conPeriodo, String conTipo, String conNumero) {
		this.conEmpresa = conEmpresa;
		this.conPeriodo = conPeriodo;
		this.conTipo = conTipo;
		this.conNumero = conNumero;
	}

	public String getConEmpresa() {
		return conEmpresa;
	}

	public void setConEmpresa(String conEmpresa) {
		this.conEmpresa = conEmpresa;
	}

	public String getConPeriodo() {
		return conPeriodo;
	}

	public void setConPeriodo(String conPeriodo) {
		this.conPeriodo = conPeriodo;
	}

	public String getConTipo() {
		return conTipo;
	}

	public void setConTipo(String conTipo) {
		this.conTipo = conTipo;
	}

	public String getConNumero() {
		return conNumero;
	}

	public void setConNumero(String conNumero) {
		this.conNumero = conNumero;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (conEmpresa != null ? conEmpresa.hashCode() : 0);
		hash += (conPeriodo != null ? conPeriodo.hashCode() : 0);
		hash += (conTipo != null ? conTipo.hashCode() : 0);
		hash += (conNumero != null ? conNumero.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof ConContablePK)) {
			return false;
		}
		ConContablePK other = (ConContablePK) object;
		if ((this.conEmpresa == null && other.conEmpresa != null)
				|| (this.conEmpresa != null && !this.conEmpresa.equals(other.conEmpresa))) {
			return false;
		}
		if ((this.conPeriodo == null && other.conPeriodo != null)
				|| (this.conPeriodo != null && !this.conPeriodo.equals(other.conPeriodo))) {
			return false;
		}
		if ((this.conTipo == null && other.conTipo != null)
				|| (this.conTipo != null && !this.conTipo.equals(other.conTipo))) {
			return false;
		}
		if ((this.conNumero == null && other.conNumero != null)
				|| (this.conNumero != null && !this.conNumero.equals(other.conNumero))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "contabilidad.entity.ConContablePK[ conEmpresa=" + conEmpresa + ", conPeriodo=" + conPeriodo
				+ ", conTipo=" + conTipo + ", conNumero=" + conNumero + " ]";
	}

	public String mensaje() {
		return "[Empresa=" + conEmpresa + ", Periodo=" + conPeriodo + ", Tipo=" + conTipo + ", Numero=" + conNumero
				+ "]";
	}

}
