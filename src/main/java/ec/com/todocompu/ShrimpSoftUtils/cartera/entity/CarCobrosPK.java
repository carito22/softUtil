package ec.com.todocompu.ShrimpSoftUtils.cartera.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CarCobrosPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "cob_empresa")
	private String cobEmpresa;
	@Column(name = "cob_periodo")
	private String cobPeriodo;
	@Column(name = "cob_tipo")
	private String cobTipo;
	@Column(name = "cob_numero")
	private String cobNumero;

	public CarCobrosPK() {
	}

	public CarCobrosPK(String cobEmpresa, String cobPeriodo, String cobTipo, String cobNumero) {
		this.cobEmpresa = cobEmpresa;
		this.cobPeriodo = cobPeriodo;
		this.cobTipo = cobTipo;
		this.cobNumero = cobNumero;
	}

	public String getCobEmpresa() {
		return cobEmpresa;
	}

	public void setCobEmpresa(String cobEmpresa) {
		this.cobEmpresa = cobEmpresa;
	}

	public String getCobPeriodo() {
		return cobPeriodo;
	}

	public void setCobPeriodo(String cobPeriodo) {
		this.cobPeriodo = cobPeriodo;
	}

	public String getCobTipo() {
		return cobTipo;
	}

	public void setCobTipo(String cobTipo) {
		this.cobTipo = cobTipo;
	}

	public String getCobNumero() {
		return cobNumero;
	}

	public void setCobNumero(String cobNumero) {
		this.cobNumero = cobNumero;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (cobEmpresa != null ? cobEmpresa.hashCode() : 0);
		hash += (cobPeriodo != null ? cobPeriodo.hashCode() : 0);
		hash += (cobTipo != null ? cobTipo.hashCode() : 0);
		hash += (cobNumero != null ? cobNumero.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof CarCobrosPK)) {
			return false;
		}
		CarCobrosPK other = (CarCobrosPK) object;
		if ((this.cobEmpresa == null && other.cobEmpresa != null)
				|| (this.cobEmpresa != null && !this.cobEmpresa.equals(other.cobEmpresa))) {
			return false;
		}
		if ((this.cobPeriodo == null && other.cobPeriodo != null)
				|| (this.cobPeriodo != null && !this.cobPeriodo.equals(other.cobPeriodo))) {
			return false;
		}
		if ((this.cobTipo == null && other.cobTipo != null)
				|| (this.cobTipo != null && !this.cobTipo.equals(other.cobTipo))) {
			return false;
		}
		if ((this.cobNumero == null && other.cobNumero != null)
				|| (this.cobNumero != null && !this.cobNumero.equals(other.cobNumero))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "cartera.entity.CarCobrosPK[ cobEmpresa=" + cobEmpresa + ", cobPeriodo=" + cobPeriodo + ", cobTipo="
				+ cobTipo + ", cobNumero=" + cobNumero + " ]";
	}

}
