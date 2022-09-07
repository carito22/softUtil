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
public class InvProformaCabeceraTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
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
	private java.math.BigDecimal profBaseimponible;

	@Column(name = "prof_descuento_base0")
	private java.math.BigDecimal profDescuentoBase0;

	@Column(name = "prof_descuento_baseimponible")
	private java.math.BigDecimal profDescuentoBaseImponible;

	@Column(name = "prof_subtotal_base0")
	private java.math.BigDecimal profSubtotalBase0;

	@Column(name = "prof_subtotal_baseimponible")
	private java.math.BigDecimal profSubtotalBaseImponible;

	@Column(name = "prof_montoiva")
	private java.math.BigDecimal profMontoiva;

	@Column(name = "prof_total")
	private java.math.BigDecimal profTotal;

	@Column(name = "cli_empresa")
	private String cliEmpresa;

	@Column(name = "cli_codigo")
	private String cliCodigo;

	@Column(name = "usr_empresa")
	private String userEmpresa;

	@Column(name = "usr_codigo")
	private String usuarioInserto;

	@Column(name = "usr_fecha_inserta")
	private String fechaUsuarioInserto;

	public InvProformaCabeceraTO() {
	}

	public InvProformaCabeceraTO(String profFecha, BigDecimal profIvaVigente, String profObservaciones,
			Boolean profPendiente, Boolean profAnulado, BigDecimal profBase0, BigDecimal profBaseimponible,
			BigDecimal profDescuentoBase0, BigDecimal profDescuentoBaseImponible, BigDecimal profSubtotalBase0,
			BigDecimal profSubtotalBaseImponible, BigDecimal profMontoiva, BigDecimal profTotal, String cliEmpresa,
			String cliCodigo, String userEmpresa, String usuarioInserto, String fechaUsuarioInserto) {
		this.profFecha = profFecha;
		this.profIvaVigente = profIvaVigente;
		this.profObservaciones = profObservaciones;
		this.profPendiente = profPendiente;
		this.profAnulado = profAnulado;
		this.profBase0 = profBase0;
		this.profBaseimponible = profBaseimponible;
		this.profDescuentoBase0 = profDescuentoBase0;
		this.profDescuentoBaseImponible = profDescuentoBaseImponible;
		this.profSubtotalBase0 = profSubtotalBase0;
		this.profSubtotalBaseImponible = profSubtotalBaseImponible;
		this.profMontoiva = profMontoiva;
		this.profTotal = profTotal;
		this.cliEmpresa = cliEmpresa;
		this.cliCodigo = cliCodigo;
		this.userEmpresa = userEmpresa;
		this.usuarioInserto = usuarioInserto;
		this.fechaUsuarioInserto = fechaUsuarioInserto;
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

	public String getFechaUsuarioInserto() {
		return fechaUsuarioInserto;
	}

	public void setFechaUsuarioInserto(String fechaUsuarioInserto) {
		this.fechaUsuarioInserto = fechaUsuarioInserto;
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

	public BigDecimal getProfBaseimponible() {
		return profBaseimponible;
	}

	public void setProfBaseimponible(BigDecimal profBaseimponible) {
		this.profBaseimponible = profBaseimponible;
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

	public BigDecimal getProfMontoiva() {
		return profMontoiva;
	}

	public void setProfMontoiva(BigDecimal profMontoiva) {
		this.profMontoiva = profMontoiva;
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

	public String getUserEmpresa() {
		return userEmpresa;
	}

	public void setUserEmpresa(String userEmpresa) {
		this.userEmpresa = userEmpresa;
	}

	public String getUsuarioInserto() {
		return usuarioInserto;
	}

	public void setUsuarioInserto(String usuarioInserto) {
		this.usuarioInserto = usuarioInserto;
	}
}
