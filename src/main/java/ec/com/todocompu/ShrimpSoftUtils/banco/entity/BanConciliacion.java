package ec.com.todocompu.ShrimpSoftUtils.banco.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ban_conciliacion", schema = "banco")
public class BanConciliacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected BanConciliacionPK banConciliacionPK;
	@Column(name = "conc_hasta")
	@Temporal(TemporalType.DATE)
	private Date concHasta;
	@Column(name = "conc_saldo_estado_cuenta")
	private BigDecimal concSaldoEstadoCuenta;
	@Column(name = "conc_cheques_girados_y_no_cobrados")
	private BigDecimal concChequesGiradosYNoCobrados;
	@Column(name = "conc_depositos_en_transito")
	private BigDecimal concDepositosEnTransito;
	@Column(name = "conc_pendiente")
	private boolean concPendiente;
	@Column(name = "usr_empresa")
	private String usrEmpresa;
	@Column(name = "usr_codigo")
	private String usrCodigo;
	@Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date usrFechaInserta;
	@JoinColumns({ @JoinColumn(name = "cta_empresa", referencedColumnName = "cta_empresa"),
			@JoinColumn(name = "cta_cuenta_contable", referencedColumnName = "cta_cuenta_contable") })
	@ManyToOne(optional = false)
	private BanCuenta banCuenta;

	public BanConciliacion() {
	}

	public BanConciliacion(BanConciliacionPK banConciliacionPK) {
		this.banConciliacionPK = banConciliacionPK;
	}

	public BanConciliacion(BanConciliacionPK banConciliacionPK, Date concHasta, BigDecimal concSaldoEstadoCuenta,
			BigDecimal concChequesGiradosYNoCobrados, BigDecimal concDepositosEnTransito, boolean concPendiente,
			String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
		this.banConciliacionPK = banConciliacionPK;
		this.concHasta = concHasta;
		this.concSaldoEstadoCuenta = concSaldoEstadoCuenta;
		this.concChequesGiradosYNoCobrados = concChequesGiradosYNoCobrados;
		this.concDepositosEnTransito = concDepositosEnTransito;
		this.concPendiente = concPendiente;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public BanConciliacion(String concEmpresa, String concCuentaContable, String concCodigo) {
		this.banConciliacionPK = new BanConciliacionPK(concEmpresa, concCuentaContable, concCodigo);
	}

	public BanConciliacionPK getBanConciliacionPK() {
		return banConciliacionPK;
	}

	public void setBanConciliacionPK(BanConciliacionPK banConciliacionPK) {
		this.banConciliacionPK = banConciliacionPK;
	}

	public Date getConcHasta() {
		return concHasta;
	}

	public void setConcHasta(Date concHasta) {
		this.concHasta = concHasta;
	}

	public BigDecimal getConcSaldoEstadoCuenta() {
		return concSaldoEstadoCuenta;
	}

	public void setConcSaldoEstadoCuenta(BigDecimal concSaldoEstadoCuenta) {
		this.concSaldoEstadoCuenta = concSaldoEstadoCuenta;
	}

	public BigDecimal getConcChequesGiradosYNoCobrados() {
		return concChequesGiradosYNoCobrados;
	}

	public void setConcChequesGiradosYNoCobrados(BigDecimal concChequesGiradosYNoCobrados) {
		this.concChequesGiradosYNoCobrados = concChequesGiradosYNoCobrados;
	}

	public BigDecimal getConcDepositosEnTransito() {
		return concDepositosEnTransito;
	}

	public void setConcDepositosEnTransito(BigDecimal concDepositosEnTransito) {
		this.concDepositosEnTransito = concDepositosEnTransito;
	}

	public boolean getConcPendiente() {
		return concPendiente;
	}

	public void setConcPendiente(boolean concPendiente) {
		this.concPendiente = concPendiente;
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

	public BanCuenta getBanCuenta() {
		return banCuenta;
	}

	public void setBanCuenta(BanCuenta banCuenta) {
		this.banCuenta = banCuenta;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (banConciliacionPK != null ? banConciliacionPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof BanConciliacion)) {
			return false;
		}
		BanConciliacion other = (BanConciliacion) object;
		if ((this.banConciliacionPK == null && other.banConciliacionPK != null)
				|| (this.banConciliacionPK != null && !this.banConciliacionPK.equals(other.banConciliacionPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "banco.entity.BanConciliacion[ banConciliacionPK=" + banConciliacionPK + " ]";
	}

}
