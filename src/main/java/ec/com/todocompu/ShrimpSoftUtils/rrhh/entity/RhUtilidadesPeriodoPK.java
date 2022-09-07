package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class RhUtilidadesPeriodoPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "uti_empresa")
	private String utiEmpresa;
	@Column(name = "uti_descripcion")
	private String utiDescripcion;

	public RhUtilidadesPeriodoPK() {
	}

	public RhUtilidadesPeriodoPK(String utiEmpresa, String utiDescripcion) {
		this.utiEmpresa = utiEmpresa;
		this.utiDescripcion = utiDescripcion;
	}

	public String getUtiEmpresa() {
		return utiEmpresa;
	}

	public void setUtiEmpresa(String utiEmpresa) {
		this.utiEmpresa = utiEmpresa;
	}

	public String getUtiDescripcion() {
		return utiDescripcion;
	}

	public void setUtiDescripcion(String utiDescripcion) {
		this.utiDescripcion = utiDescripcion;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (utiEmpresa != null ? utiEmpresa.hashCode() : 0);
		hash += (utiDescripcion != null ? utiDescripcion.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		if (!(object instanceof RhUtilidadesPeriodoPK)) {
			return false;
		}
		RhUtilidadesPeriodoPK other = (RhUtilidadesPeriodoPK) object;
		if ((this.utiEmpresa == null && other.utiEmpresa != null)
				|| (this.utiEmpresa != null && !this.utiEmpresa.equals(other.utiEmpresa))) {
			return false;
		}
		if ((this.utiDescripcion == null && other.utiDescripcion != null)
				|| (this.utiDescripcion != null && !this.utiDescripcion.equals(other.utiDescripcion))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhUtilidadesPeriodoPK[ utiEmpresa=" + utiEmpresa + ", utiDescripcion=" + utiDescripcion
				+ " ]";
	}
}
