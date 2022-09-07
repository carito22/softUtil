package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "rh_forma_pago_beneficios_sociales", schema = "recursoshumanos")
public class RhFormaPagoBeneficiosSociales implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "fp_secuencial")
	private Integer fpSecuencial;
	@Column(name = "fp_detalle")
	private String fpDetalle;
	@Column(name = "fp_codigo_ministerial")
	private String fpCodigoMinisterial;
	@Column(name = "fp_inactivo")
	private boolean fpInactivo;
	@Column(name = "sec_empresa")
	private String secEmpresa;
	@Column(name = "sec_codigo")
	private String secCodigo;
	@Column(name = "cta_empresa")
	private String ctaEmpresa;
	@Column(name = "cta_codigo")
	private String ctaCodigo;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInserta;

	public RhFormaPagoBeneficiosSociales() {
	}

	public RhFormaPagoBeneficiosSociales(Integer fpSecuencial) {
		this.fpSecuencial = fpSecuencial;
	}

	public RhFormaPagoBeneficiosSociales(Integer fpSecuencial, String fpDetalle, String fpCodigoMinisterial,
			boolean fpInactivo, String secEmpresa, String secCodigo, String ctaEmpresa, String ctaCodigo,
			String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
		this.fpSecuencial = fpSecuencial;
		this.fpDetalle = fpDetalle;
		this.fpCodigoMinisterial = fpCodigoMinisterial;
		this.fpInactivo = fpInactivo;
		this.secEmpresa = secEmpresa;
		this.secCodigo = secCodigo;
		this.ctaEmpresa = ctaEmpresa;
		this.ctaCodigo = ctaCodigo;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public Integer getFpSecuencial() {
		return fpSecuencial;
	}

	public void setFpSecuencial(Integer fpSecuencial) {
		this.fpSecuencial = fpSecuencial;
	}

	public String getFpDetalle() {
		return fpDetalle;
	}

	public void setFpDetalle(String fpDetalle) {
		this.fpDetalle = fpDetalle;
	}

	public String getFpCodigoMinisterial() {
		return fpCodigoMinisterial;
	}

	public void setFpCodigoMinisterial(String fpCodigoMinisterial) {
		this.fpCodigoMinisterial = fpCodigoMinisterial;
	}

	public boolean getFpInactivo() {
		return fpInactivo;
	}

	public void setFpInactivo(boolean fpInactivo) {
		this.fpInactivo = fpInactivo;
	}

	public String getSecEmpresa() {
		return secEmpresa;
	}

	public void setSecEmpresa(String secEmpresa) {
		this.secEmpresa = secEmpresa;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
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

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (fpSecuencial != null ? fpSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof RhFormaPagoBeneficiosSociales)) {
			return false;
		}
		RhFormaPagoBeneficiosSociales other = (RhFormaPagoBeneficiosSociales) object;
		if ((this.fpSecuencial == null && other.fpSecuencial != null)
				|| (this.fpSecuencial != null && !this.fpSecuencial.equals(other.fpSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "rrhh.entity.RhFormaPagoBeneficiosSociales[ fpSecuencial=" + fpSecuencial + " ]";
	}
}
