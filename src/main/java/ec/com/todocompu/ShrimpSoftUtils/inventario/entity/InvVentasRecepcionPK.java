package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class InvVentasRecepcionPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "recep_empresa")
	private String recepEmpresa;
	@Column(name = "recep_periodo")
	private String recepPeriodo;
	@Column(name = "recep_motivo")
	private String recepMotivo;
	@Column(name = "recep_numero")
	private String recepNumero;

	public InvVentasRecepcionPK() {
	}

	public InvVentasRecepcionPK(String recepEmpresa, String recepPeriodo, String recepMotivo, String recepNumero) {
		this.recepEmpresa = recepEmpresa;
		this.recepPeriodo = recepPeriodo;
		this.recepMotivo = recepMotivo;
		this.recepNumero = recepNumero;
	}

	public String getRecepEmpresa() {
		return recepEmpresa;
	}

	public void setRecepEmpresa(String recepEmpresa) {
		this.recepEmpresa = recepEmpresa;
	}

	public String getRecepPeriodo() {
		return recepPeriodo;
	}

	public void setRecepPeriodo(String recepPeriodo) {
		this.recepPeriodo = recepPeriodo;
	}

	public String getRecepMotivo() {
		return recepMotivo;
	}

	public void setRecepMotivo(String recepMotivo) {
		this.recepMotivo = recepMotivo;
	}

	public String getRecepNumero() {
		return recepNumero;
	}

	public void setRecepNumero(String recepNumero) {
		this.recepNumero = recepNumero;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (recepEmpresa != null ? recepEmpresa.hashCode() : 0);
		hash += (recepPeriodo != null ? recepPeriodo.hashCode() : 0);
		hash += (recepMotivo != null ? recepMotivo.hashCode() : 0);
		hash += (recepNumero != null ? recepNumero.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof InvVentasRecepcionPK)) {
			return false;
		}
		InvVentasRecepcionPK other = (InvVentasRecepcionPK) object;
		if ((this.recepEmpresa == null && other.recepEmpresa != null)
				|| (this.recepEmpresa != null && !this.recepEmpresa.equals(other.recepEmpresa))) {
			return false;
		}
		if ((this.recepPeriodo == null && other.recepPeriodo != null)
				|| (this.recepPeriodo != null && !this.recepPeriodo.equals(other.recepPeriodo))) {
			return false;
		}
		if ((this.recepMotivo == null && other.recepMotivo != null)
				|| (this.recepMotivo != null && !this.recepMotivo.equals(other.recepMotivo))) {
			return false;
		}
		if ((this.recepNumero == null && other.recepNumero != null)
				|| (this.recepNumero != null && !this.recepNumero.equals(other.recepNumero))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "inventario.entity.InvVentasRecepcionPK[ recepEmpresa=" + recepEmpresa + ", recepPeriodo=" + recepPeriodo
				+ ", recepMotivo=" + recepMotivo + ", recepNumero=" + recepNumero + " ]";
	}

}
