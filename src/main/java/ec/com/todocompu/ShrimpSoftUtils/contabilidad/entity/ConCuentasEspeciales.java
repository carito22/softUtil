package ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "con_cuentas_especiales", schema = "contabilidad")
public class ConCuentasEspeciales implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "cta_empresa")
	private String ctaEmpresa;
	@Column(name = "cta_activo_biologico")
	private String ctaActivoBiologico;

	public ConCuentasEspeciales() {
	}

	public ConCuentasEspeciales(String ctaEmpresa) {
		this.ctaEmpresa = ctaEmpresa;
	}

	public ConCuentasEspeciales(String ctaEmpresa, String ctaActivoBiologico) {
		this.ctaEmpresa = ctaEmpresa;
		this.ctaActivoBiologico = ctaActivoBiologico;
	}

	public String getCtaEmpresa() {
		return ctaEmpresa;
	}

	public void setCtaEmpresa(String ctaEmpresa) {
		this.ctaEmpresa = ctaEmpresa;
	}

	public String getCtaActivoBiologico() {
		return ctaActivoBiologico;
	}

	public void setCtaActivoBiologico(String ctaActivoBiologico) {
		this.ctaActivoBiologico = ctaActivoBiologico;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (ctaEmpresa != null ? ctaEmpresa.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof ConCuentasEspeciales)) {
			return false;
		}
		ConCuentasEspeciales other = (ConCuentasEspeciales) object;
		if ((this.ctaEmpresa == null && other.ctaEmpresa != null)
				|| (this.ctaEmpresa != null && !this.ctaEmpresa.equals(other.ctaEmpresa))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "contabilidad.entity.ConCuentasEspeciales[ ctaEmpresa=" + ctaEmpresa + " ]";
	}

}
