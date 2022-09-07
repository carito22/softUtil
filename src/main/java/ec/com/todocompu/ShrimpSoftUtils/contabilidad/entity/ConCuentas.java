package ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "con_cuentas", schema = "contabilidad")
public class ConCuentas implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected ConCuentasPK conCuentasPK;
	@Column(name = "cta_detalle")
	private String ctaDetalle;
	@Column(name = "cta_activo")
	private Boolean ctaActivo;
	@Column(name = "cta_bloqueada")
	private Boolean ctaBloqueada;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInserta;
        
        @Column(name = "cta_relacionada")
	private Boolean ctaRelacionada;
	@Column(name = "cta_grupo_comparativo")
	private String ctaGrupoComparativo;
	@Column(name = "cta_detalle_comparativo")
	private String ctaDetalleComparativo;

	public ConCuentas() {
	}

	public ConCuentas(ConCuentasPK conCuentasPK) {
		this.conCuentasPK = conCuentasPK;
	}

	public ConCuentas(ConCuentasPK conCuentasPK, String ctaDetalle, String usrEmpresa) {
		this.conCuentasPK = conCuentasPK;
		this.ctaDetalle = ctaDetalle;
		this.usrEmpresa = usrEmpresa;
	}

	public ConCuentas(String ctaEmpresa, String ctaCodigo) {
		this.conCuentasPK = new ConCuentasPK(ctaEmpresa, ctaCodigo);
	}

	public ConCuentasPK getConCuentasPK() {
		return conCuentasPK;
	}

	public void setConCuentasPK(ConCuentasPK conCuentasPK) {
		this.conCuentasPK = conCuentasPK;
	}

	public String getCtaDetalle() {
		return ctaDetalle;
	}

	public void setCtaDetalle(String ctaDetalle) {
		this.ctaDetalle = ctaDetalle;
	}

	public Boolean getCtaActivo() {
		return ctaActivo;
	}

	public void setCtaActivo(Boolean ctaActivo) {
		this.ctaActivo = ctaActivo;
	}

	public String getUsrEmpresa() {
		return usrEmpresa;
	}

	public void setUsrEmpresa(String usrEmpresa) {
		this.usrEmpresa = usrEmpresa;
	}

	public String getUsrCodigo() {
		return usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public Date getUsrFechaInserta() {
		return usrFechaInserta;
	}

	public void setUsrFechaInserta(Date usrFechaInserta) {
		this.usrFechaInserta = usrFechaInserta;
	}

        public Boolean getCtaBloqueada() {
            return ctaBloqueada;
        }

        public void setCtaBloqueada(Boolean ctaBloqueada) {
            this.ctaBloqueada = ctaBloqueada;
        }

        public Boolean getCtaRelacionada() {
            return ctaRelacionada;
        }

        public void setCtaRelacionada(Boolean ctaRelacionada) {
            this.ctaRelacionada = ctaRelacionada;
        }

        public String getCtaGrupoComparativo() {
            return ctaGrupoComparativo;
        }

        public void setCtaGrupoComparativo(String ctaGrupoComparativo) {
            this.ctaGrupoComparativo = ctaGrupoComparativo;
        }

        public String getCtaDetalleComparativo() {
            return ctaDetalleComparativo;
        }

        public void setCtaDetalleComparativo(String ctaDetalleComparativo) {
            this.ctaDetalleComparativo = ctaDetalleComparativo;
        }

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (conCuentasPK != null ? conCuentasPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof ConCuentas)) {
			return false;
		}
		ConCuentas other = (ConCuentas) object;
		if ((this.conCuentasPK == null && other.conCuentasPK != null)
				|| (this.conCuentasPK != null && !this.conCuentasPK.equals(other.conCuentasPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "contabilidad.entity.ConCuentas[ conCuentasPK=" + conCuentasPK + " ]";
	}

}
