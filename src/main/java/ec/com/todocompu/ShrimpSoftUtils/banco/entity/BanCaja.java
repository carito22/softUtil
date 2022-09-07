package ec.com.todocompu.ShrimpSoftUtils.banco.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ban_caja", schema = "banco")
public class BanCaja implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected BanCajaPK banCajaPK;
	@Column(name = "caja_nombre")
	private String cajaNombre;
	@Column(name = "cta_empresa")
	private String ctaEmpresa;
	@Column(name = "cta_cuenta_contable")
	private String ctaCuentaContable;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInserta;

	public BanCaja() {
	}

	public BanCaja(BanCajaPK banCajaPK) {
		this.banCajaPK = banCajaPK;
	}

	public BanCaja(BanCajaPK banCajaPK, String cajaNombre, String ctaEmpresa, String ctaCuentaContable,
			String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
		this.banCajaPK = banCajaPK;
		this.cajaNombre = cajaNombre;
		this.ctaEmpresa = ctaEmpresa;
		this.ctaCuentaContable = ctaCuentaContable;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public BanCaja(String cajaEmpresa, String cajaCodigo) {
		this.banCajaPK = new BanCajaPK(cajaEmpresa, cajaCodigo);
	}

	public BanCajaPK getBanCajaPK() {
		return banCajaPK;
	}

	public void setBanCajaPK(BanCajaPK banCajaPK) {
		this.banCajaPK = banCajaPK;
	}

	public String getCajaNombre() {
		return cajaNombre;
	}

	public void setCajaNombre(String cajaNombre) {
		this.cajaNombre = cajaNombre;
	}

	public String getCtaEmpresa() {
		return ctaEmpresa;
	}

	public void setCtaEmpresa(String ctaEmpresa) {
		this.ctaEmpresa = ctaEmpresa;
	}

	public String getCtaCuentaContable() {
		return ctaCuentaContable;
	}

	public void setCtaCuentaContable(String ctaCuentaContable) {
		this.ctaCuentaContable = ctaCuentaContable;
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
		hash += (banCajaPK != null ? banCajaPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof BanCaja)) {
			return false;
		}
		BanCaja other = (BanCaja) object;
		if ((this.banCajaPK == null && other.banCajaPK != null)
				|| (this.banCajaPK != null && !this.banCajaPK.equals(other.banCajaPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "banco.entity.BanCaja[ banCajaPK=" + banCajaPK + " ]";
	}

}
