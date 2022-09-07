package ec.com.todocompu.ShrimpSoftUtils.banco.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class BanCajaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "caja_empresa")
	private String cajaEmpresa;
	@Column(name = "caja_codigo")
	private String cajaCodigo;

	public BanCajaPK() {
	}

	public BanCajaPK(String cajaEmpresa, String cajaCodigo) {
		this.cajaEmpresa = cajaEmpresa;
		this.cajaCodigo = cajaCodigo;
	}

	public String getCajaEmpresa() {
		return cajaEmpresa;
	}

	public void setCajaEmpresa(String cajaEmpresa) {
		this.cajaEmpresa = cajaEmpresa;
	}

	public String getCajaCodigo() {
		return cajaCodigo;
	}

	public void setCajaCodigo(String cajaCodigo) {
		this.cajaCodigo = cajaCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (cajaEmpresa != null ? cajaEmpresa.hashCode() : 0);
		hash += (cajaCodigo != null ? cajaCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof BanCajaPK)) {
			return false;
		}
		BanCajaPK other = (BanCajaPK) object;
		if ((this.cajaEmpresa == null && other.cajaEmpresa != null)
				|| (this.cajaEmpresa != null && !this.cajaEmpresa.equals(other.cajaEmpresa))) {
			return false;
		}
		if ((this.cajaCodigo == null && other.cajaCodigo != null)
				|| (this.cajaCodigo != null && !this.cajaCodigo.equals(other.cajaCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "banco.entity.BanCajaPK[ cajaEmpresa=" + cajaEmpresa + ", cajaCodigo=" + cajaCodigo + " ]";
	}

}
