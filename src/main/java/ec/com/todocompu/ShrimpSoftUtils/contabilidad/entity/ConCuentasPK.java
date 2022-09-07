package ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ConCuentasPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "cta_empresa")
	private String ctaEmpresa;

	@Column(name = "cta_codigo")
	private String ctaCodigo;

	public ConCuentasPK() {
	}

	public ConCuentasPK(String ctaEmpresa, String ctaCodigo) {
		this.ctaEmpresa = ctaEmpresa;
		this.ctaCodigo = ctaCodigo;
	}

	public String getCtaEmpresa() {
		return ctaEmpresa;
	}

	public void setCtaEmpresa(String ctaEmpresa) {
		this.ctaEmpresa = ctaEmpresa;
	}

	public String getCtaCodigo() {
		return ctaCodigo;
	}

	public void setCtaCodigo(String ctaCodigo) {
		this.ctaCodigo = ctaCodigo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (ctaEmpresa != null ? ctaEmpresa.hashCode() : 0);
		hash += (ctaCodigo != null ? ctaCodigo.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof ConCuentasPK)) {
			return false;
		}
		ConCuentasPK other = (ConCuentasPK) object;
		if ((this.ctaEmpresa == null && other.ctaEmpresa != null)
				|| (this.ctaEmpresa != null && !this.ctaEmpresa.equals(other.ctaEmpresa))) {
			return false;
		}
		if ((this.ctaCodigo == null && other.ctaCodigo != null)
				|| (this.ctaCodigo != null && !this.ctaCodigo.equals(other.ctaCodigo))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "contabilidad.entity.ConCuentasPK[ ctaEmpresa=" + ctaEmpresa + ", ctaCodigo=" + ctaCodigo + " ]";
	}

}
