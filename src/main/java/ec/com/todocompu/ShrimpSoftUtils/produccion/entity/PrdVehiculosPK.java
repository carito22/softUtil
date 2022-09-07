package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrdVehiculosPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "veh_empresa")
	private String vehEmpresa;
	@Column(name = "veh_establecimiento")
	private String vehEstablecimiento;
	@Column(name = "veh_placa")
	private String vehPlaca;

	public PrdVehiculosPK() {
	}

	public PrdVehiculosPK(String vehEmpresa, String vehEstablecimiento, String vehPlaca) {
		this.vehEmpresa = vehEmpresa;
		this.vehEstablecimiento = vehEstablecimiento;
		this.vehPlaca = vehPlaca;
	}

	public String getVehEmpresa() {
		return vehEmpresa;
	}

	public void setVehEmpresa(String vehEmpresa) {
		this.vehEmpresa = vehEmpresa;
	}

	public String getVehEstablecimiento() {
		return vehEstablecimiento;
	}

	public void setVehEstablecimiento(String vehEstablecimiento) {
		this.vehEstablecimiento = vehEstablecimiento;
	}

	public String getVehPlaca() {
		return vehPlaca;
	}

	public void setVehPlaca(String vehPlaca) {
		this.vehPlaca = vehPlaca;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (vehEmpresa != null ? vehEmpresa.hashCode() : 0);
		hash += (vehEstablecimiento != null ? vehEstablecimiento.hashCode() : 0);
		hash += (vehPlaca != null ? vehPlaca.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof PrdVehiculosPK)) {
			return false;
		}
		PrdVehiculosPK other = (PrdVehiculosPK) object;
		if ((this.vehEmpresa == null && other.vehEmpresa != null)
				|| (this.vehEmpresa != null && !this.vehEmpresa.equals(other.vehEmpresa))) {
			return false;
		}
		if ((this.vehEstablecimiento == null && other.vehEstablecimiento != null)
				|| (this.vehEstablecimiento != null && !this.vehEstablecimiento.equals(other.vehEstablecimiento))) {
			return false;
		}
		if ((this.vehPlaca == null && other.vehPlaca != null)
				|| (this.vehPlaca != null && !this.vehPlaca.equals(other.vehPlaca))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "produccion.entity.PrdVehiculosPK[ vehEmpresa=" + vehEmpresa + ", vehEstablecimiento="
				+ vehEstablecimiento + ", vehPlaca=" + vehPlaca + " ]";
	}

}
