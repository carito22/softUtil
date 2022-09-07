package ec.com.todocompu.ShrimpSoftUtils.banco.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BanListaConciliacionTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "conc_cuenta_contable")
	private String concCuentaContable;

	@Column(name = "cta_detalle")
	private String conCtaDetalle;

	@Column(name = "conc_codigo")
	private String concCodigo;

	@Column(name = "conc_hasta")
	private String concHasta;

	@Column(name = "conc_saldo_estado_cuenta")
	private java.math.BigDecimal concSaldoEstadoCuenta;

	@Column(name = "conc_cheques_girados_y_no_cobrados")
	private java.math.BigDecimal concChequesGiradosYNoCobrados;

	@Column(name = "conc_depositos_en_transito")
	private java.math.BigDecimal concDepositosEnTransito;

	@Column(name = "conc_pendiente")
	private boolean concPendiente;

	public BanListaConciliacionTO() {
	}

	public BanListaConciliacionTO(String concCuentaContable, String conCtaDetalle, String concCodigo, String concHasta,
			BigDecimal concSaldoEstadoCuenta, BigDecimal concChequesGiradosYNoCobrados,
			BigDecimal concDepositosEnTransito, boolean concPendiente) {
		this.concCuentaContable = concCuentaContable;
		this.conCtaDetalle = conCtaDetalle;
		this.concCodigo = concCodigo;
		this.concHasta = concHasta;
		this.concSaldoEstadoCuenta = concSaldoEstadoCuenta;
		this.concChequesGiradosYNoCobrados = concChequesGiradosYNoCobrados;
		this.concDepositosEnTransito = concDepositosEnTransito;
		this.concPendiente = concPendiente;
	}

	public String getConCtaDetalle() {
		return conCtaDetalle;
	}

	public void setConCtaDetalle(String conCtaDetalle) {
		this.conCtaDetalle = conCtaDetalle;
	}

	public BigDecimal getConcChequesGiradosYNoCobrados() {
		return concChequesGiradosYNoCobrados;
	}

	public void setConcChequesGiradosYNoCobrados(BigDecimal concChequesGiradosYNoCobrados) {
		this.concChequesGiradosYNoCobrados = concChequesGiradosYNoCobrados;
	}

	public String getConcCodigo() {
		return concCodigo;
	}

	public void setConcCodigo(String concCodigo) {
		this.concCodigo = concCodigo;
	}

	public String getConcCuentaContable() {
		return concCuentaContable;
	}

	public void setConcCuentaContable(String concCuentaContable) {
		this.concCuentaContable = concCuentaContable;
	}

	public BigDecimal getConcDepositosEnTransito() {
		return concDepositosEnTransito;
	}

	public void setConcDepositosEnTransito(BigDecimal concDepositosEnTransito) {
		this.concDepositosEnTransito = concDepositosEnTransito;
	}

	public String getConcHasta() {
		return concHasta;
	}

	public void setConcHasta(String concHasta) {
		this.concHasta = concHasta;
	}

	public boolean isConcPendiente() {
		return concPendiente;
	}

	public void setConcPendiente(boolean concPendiente) {
		this.concPendiente = concPendiente;
	}

	public BigDecimal getConcSaldoEstadoCuenta() {
		return concSaldoEstadoCuenta;
	}

	public void setConcSaldoEstadoCuenta(BigDecimal concSaldoEstadoCuenta) {
		this.concSaldoEstadoCuenta = concSaldoEstadoCuenta;
	}

}
