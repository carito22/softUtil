/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvProformasTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "prof_empresa")
	private String profEmpresa;

	@Column(name = "prof_periodo")
	private String profPeriodo;

	@Column(name = "prof_motivo")
	private String profMotivo;

	@Column(name = "prof_numero")
	private String profNumero;

	@Column(name = "prof_fecha")
	private String profFecha;

	@Column(name = "prof_iva_vigente")
	private java.math.BigDecimal profIvaVigente;

	@Column(name = "prof_observaciones")
	private String profObservaciones;

	@Column(name = "prof_pendiente")
	private Boolean profPendiente;

	@Column(name = "prof_anulado")
	private Boolean profAnulado;

	@Column(name = "prof_base0")
	private java.math.BigDecimal profBase0;

	@Column(name = "prof_baseimponible")
	private java.math.BigDecimal profBaseImponible;

	// @Column(name = "")
	private java.math.BigDecimal profRecargoBase0;

	// @Column(name = "")
	private java.math.BigDecimal profRecargoBaseImponible;

	@Column(name = "prof_descuento_base0")
	private java.math.BigDecimal profDescuentoBase0;

	@Column(name = "prof_descuento_baseimponible")
	private java.math.BigDecimal profDescuentoBaseImponible;

	@Column(name = "prof_subtotal_base0")
	private java.math.BigDecimal profSubtotalBase0;

	@Column(name = "prof_subtotal_baseimponible")
	private java.math.BigDecimal profSubtotalBaseImponible;

	@Column(name = "prof_montoiva")
	private java.math.BigDecimal profMontoIva;

	@Column(name = "prof_total")
	private java.math.BigDecimal profTotal;

	@Column(name = "cli_empresa")
	private String cliEmpresa;

	@Column(name = "cli_codigo")
	private String cliCodigo;

	@Column(name = "usr_empresa")
	private String usrEmpresa;

	@Column(name = "usr_codigo")
	private String usrCodigo;

	@Column(name = "usr_fecha_inserta")
	private String usrFechaInserta;

	public InvProformasTO() {
	}

	public InvProformasTO(String profEmpresa, String profPeriodo, String profMotivo, String profNumero,
			String profFecha, BigDecimal profIvaVigente, String profObservaciones, Boolean profPendiente,
			Boolean profAnulado, BigDecimal profBase0, BigDecimal profBaseImponible, BigDecimal profRecargoBase0,
			BigDecimal profRecargoBaseImponible, BigDecimal profDescuentoBase0, BigDecimal profDescuentoBaseImponible,
			BigDecimal profSubtotalBase0, BigDecimal profSubtotalBaseImponible, BigDecimal profMontoIva,
			BigDecimal profTotal, String cliEmpresa, String cliCodigo, String usrEmpresa, String usrCodigo,
			String usrFechaInserta) {
		this.profEmpresa = profEmpresa;
		this.profPeriodo = profPeriodo;
		this.profMotivo = profMotivo;
		this.profNumero = profNumero;
		this.profFecha = profFecha;
		this.profIvaVigente = profIvaVigente;
		this.profObservaciones = profObservaciones;
		this.profPendiente = profPendiente;
		this.profAnulado = profAnulado;
		this.profBase0 = profBase0;
		this.profBaseImponible = profBaseImponible;
		this.profRecargoBase0 = profRecargoBase0;
		this.profRecargoBaseImponible = profRecargoBaseImponible;
		this.profDescuentoBase0 = profDescuentoBase0;
		this.profDescuentoBaseImponible = profDescuentoBaseImponible;
		this.profSubtotalBase0 = profSubtotalBase0;
		this.profSubtotalBaseImponible = profSubtotalBaseImponible;
		this.profMontoIva = profMontoIva;
		this.profTotal = profTotal;
		this.cliEmpresa = cliEmpresa;
		this.cliCodigo = cliCodigo;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public BigDecimal getProfRecargoBase0() {
		return profRecargoBase0;
	}

	public void setProfRecargoBase0(BigDecimal profRecargoBase0) {
		this.profRecargoBase0 = profRecargoBase0;
	}

	public BigDecimal getProfRecargoBaseImponible() {
		return profRecargoBaseImponible;
	}

	public void setProfRecargoBaseImponible(BigDecimal profRecargoBaseImponible) {
		this.profRecargoBaseImponible = profRecargoBaseImponible;
	}

	public String getCliCodigo() {
		return cliCodigo;
	}

	public void setCliCodigo(String cliCodigo) {
		this.cliCodigo = cliCodigo;
	}

	public String getCliEmpresa() {
		return cliEmpresa;
	}

	public void setCliEmpresa(String cliEmpresa) {
		this.cliEmpresa = cliEmpresa;
	}

	public Boolean getProfAnulado() {
		return profAnulado;
	}

	public void setProfAnulado(Boolean profAnulado) {
		this.profAnulado = profAnulado;
	}

	public BigDecimal getProfBase0() {
		return profBase0;
	}

	public void setProfBase0(BigDecimal profBase0) {
		this.profBase0 = profBase0;
	}

	public BigDecimal getProfBaseImponible() {
		return profBaseImponible;
	}

	public void setProfBaseImponible(BigDecimal profBaseImponible) {
		this.profBaseImponible = profBaseImponible;
	}

	public BigDecimal getProfDescuentoBase0() {
		return profDescuentoBase0;
	}

	public void setProfDescuentoBase0(BigDecimal profDescuentoBase0) {
		this.profDescuentoBase0 = profDescuentoBase0;
	}

	public BigDecimal getProfDescuentoBaseImponible() {
		return profDescuentoBaseImponible;
	}

	public void setProfDescuentoBaseImponible(BigDecimal profDescuentoBaseImponible) {
		this.profDescuentoBaseImponible = profDescuentoBaseImponible;
	}

	public String getProfEmpresa() {
		return profEmpresa;
	}

	public void setProfEmpresa(String profEmpresa) {
		this.profEmpresa = profEmpresa;
	}

	public String getProfFecha() {
		return profFecha;
	}

	public void setProfFecha(String profFecha) {
		this.profFecha = profFecha;
	}

	public BigDecimal getProfIvaVigente() {
		return profIvaVigente;
	}

	public void setProfIvaVigente(BigDecimal profIvaVigente) {
		this.profIvaVigente = profIvaVigente;
	}

	public BigDecimal getProfMontoIva() {
		return profMontoIva;
	}

	public void setProfMontoIva(BigDecimal profMontoIva) {
		this.profMontoIva = profMontoIva;
	}

	public String getProfMotivo() {
		return profMotivo;
	}

	public void setProfMotivo(String profMotivo) {
		this.profMotivo = profMotivo;
	}

	public String getProfNumero() {
		return profNumero;
	}

	public void setProfNumero(String profNumero) {
		this.profNumero = profNumero;
	}

	public String getProfObservaciones() {
		return profObservaciones;
	}

	public void setProfObservaciones(String profObservaciones) {
		this.profObservaciones = profObservaciones;
	}

	public Boolean getProfPendiente() {
		return profPendiente;
	}

	public void setProfPendiente(Boolean profPendiente) {
		this.profPendiente = profPendiente;
	}

	public String getProfPeriodo() {
		return profPeriodo;
	}

	public void setProfPeriodo(String profPeriodo) {
		this.profPeriodo = profPeriodo;
	}

	public BigDecimal getProfSubtotalBase0() {
		return profSubtotalBase0;
	}

	public void setProfSubtotalBase0(BigDecimal profSubtotalBase0) {
		this.profSubtotalBase0 = profSubtotalBase0;
	}

	public BigDecimal getProfSubtotalBaseImponible() {
		return profSubtotalBaseImponible;
	}

	public void setProfSubtotalBaseImponible(BigDecimal profSubtotalBaseImponible) {
		this.profSubtotalBaseImponible = profSubtotalBaseImponible;
	}

	public BigDecimal getProfTotal() {
		return profTotal;
	}

	public void setProfTotal(BigDecimal profTotal) {
		this.profTotal = profTotal;
	}

	public String getUsrCodigo() {
		return usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public String getUsrEmpresa() {
		return usrEmpresa;
	}

	public void setUsrEmpresa(String usrEmpresa) {
		this.usrEmpresa = usrEmpresa;
	}

	public String getUsrFechaInserta() {
		return usrFechaInserta;
	}

	public void setUsrFechaInserta(String usrFechaInserta) {
		this.usrFechaInserta = usrFechaInserta;
	}
}
