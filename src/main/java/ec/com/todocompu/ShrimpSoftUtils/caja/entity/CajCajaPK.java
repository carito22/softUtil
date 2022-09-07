package ec.com.todocompu.ShrimpSoftUtils.caja.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CajCajaPK implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "caja_empresa")
	private String cajaEmpresa;
	@Column(name = "caja_usuario_responsable")
	private String cajaUsuarioResponsable;

	public CajCajaPK() {
	}

        public CajCajaPK(String cajaEmpresa, String cajaUsuarioResponsable) {
            this.cajaEmpresa = cajaEmpresa;
            this.cajaUsuarioResponsable = cajaUsuarioResponsable;
        }

        public String getCajaEmpresa() {
            return cajaEmpresa;
        }

        public void setCajaEmpresa(String cajaEmpresa) {
            this.cajaEmpresa = cajaEmpresa;
        }

        public String getCajaUsuarioResponsable() {
            return cajaUsuarioResponsable;
        }

        public void setCajaUsuarioResponsable(String cajaUsuarioResponsable) {
            this.cajaUsuarioResponsable = cajaUsuarioResponsable;
        }
	
        @Override
	public int hashCode() {
		int hash = 0;
		hash += (cajaEmpresa != null ? cajaEmpresa.hashCode() : 0);
		hash += (cajaUsuarioResponsable != null ? cajaUsuarioResponsable.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof CajCajaPK)) {
			return false;
		}
		CajCajaPK other = (CajCajaPK) object;
		if ((this.cajaEmpresa == null && other.cajaEmpresa != null)
				|| (this.cajaEmpresa != null && !this.cajaEmpresa.equals(other.cajaEmpresa))) {
			return false;
		}
		if ((this.cajaUsuarioResponsable == null && other.cajaUsuarioResponsable != null)
				|| (this.cajaUsuarioResponsable != null && !this.cajaUsuarioResponsable.equals(other.cajaUsuarioResponsable))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "caja.entity.CajCajaPK[ cajaEmpresa=" + cajaEmpresa + ", cajaCodigo=" + cajaUsuarioResponsable + " ]";
	}

}
