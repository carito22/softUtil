package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InvConsumosPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "cons_empresa")
	private String consEmpresa;
	@Column(name = "cons_periodo")
	private String consPeriodo;
	@Column(name = "cons_motivo")
	private String consMotivo;
	@Column(name = "cons_numero")
	private String consNumero;

	public InvConsumosPK() {
	}

	public InvConsumosPK(String consEmpresa, String consPeriodo, String consMotivo, String consNumero) {
		this.consEmpresa = consEmpresa;
		this.consPeriodo = consPeriodo;
		this.consMotivo = consMotivo;
		this.consNumero = consNumero;
	}

	public String getConsEmpresa() {
		return consEmpresa;
	}

	public void setConsEmpresa(String consEmpresa) {
		this.consEmpresa = consEmpresa;
	}

	public String getConsPeriodo() {
		return consPeriodo;
	}

	public void setConsPeriodo(String consPeriodo) {
		this.consPeriodo = consPeriodo;
	}

	public String getConsMotivo() {
		return consMotivo;
	}

	public void setConsMotivo(String consMotivo) {
		this.consMotivo = consMotivo;
	}

	public String getConsNumero() {
		return consNumero;
	}

	public void setConsNumero(String consNumero) {
		this.consNumero = consNumero;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (consEmpresa != null ? consEmpresa.hashCode() : 0);
		hash += (consPeriodo != null ? consPeriodo.hashCode() : 0);
		hash += (consMotivo != null ? consMotivo.hashCode() : 0);
		hash += (consNumero != null ? consNumero.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvConsumosPK)) {
			return false;
		}
		InvConsumosPK other = (InvConsumosPK) object;
		if ((this.consEmpresa == null && other.consEmpresa != null)
				|| (this.consEmpresa != null && !this.consEmpresa.equals(other.consEmpresa))) {
			return false;
		}
		if ((this.consPeriodo == null && other.consPeriodo != null)
				|| (this.consPeriodo != null && !this.consPeriodo.equals(other.consPeriodo))) {
			return false;
		}
		if ((this.consMotivo == null && other.consMotivo != null)
				|| (this.consMotivo != null && !this.consMotivo.equals(other.consMotivo))) {
			return false;
		}
		if ((this.consNumero == null && other.consNumero != null)
				|| (this.consNumero != null && !this.consNumero.equals(other.consNumero))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvConsumosPK[ consEmpresa=" + consEmpresa + ", consPeriodo=" + consPeriodo
				+ ", consMotivo=" + consMotivo + ", consNumero=" + consNumero + " ]";
	}

}
