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
public class InvListaConsultaProformaTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "prof_periodo")
	private String profPeriodo;

	@Column(name = "prof_motivo")
	private String profMotivo;

	@Column(name = "prof_numero")
	private String profNumero;

	@Column(name = "prof_fecha")
	private String profFecha;

	@Column(name = "prof_cliente_codigo")
	private String cliCodigo;

	@Column(name = "prof_cliente_nombre")
	private String cliNombre;

	@Column(name = "prof_subtotal_base0")
	private java.math.BigDecimal profBase0;

	@Column(name = "prof_subtotal_baseimponible")
	private java.math.BigDecimal profBaseImponible;

	@Column(name = "prof_montoiva")
	private java.math.BigDecimal profMontoIva;

	@Column(name = "prof_total")
	private java.math.BigDecimal profTotal;

	@Column(name = "prof_observaciones")
	private String profObservaciones;

	@Column(name = "prof_anulado")
	private String profAnulado;

	@Column(name = "prof_pendiente")
	private String profPendiente;

	public InvListaConsultaProformaTO() {
	}

	public InvListaConsultaProformaTO(String profPeriodo, String profMotivo, String profNumero, String profFecha,
			String cliCodigo, String cliNombre, BigDecimal profBase0, BigDecimal profBaseImponible,
			BigDecimal profMontoIva, BigDecimal profTotal, String profObservaciones, String profAnulado,
			String profPendiente, Integer id) {
		this.profPeriodo = profPeriodo;
		this.profMotivo = profMotivo;
		this.profNumero = profNumero;
		this.profFecha = profFecha;
		this.cliCodigo = cliCodigo;
		this.cliNombre = cliNombre;
		this.profBase0 = profBase0;
		this.profBaseImponible = profBaseImponible;
		this.profMontoIva = profMontoIva;
		this.profTotal = profTotal;
		this.profObservaciones = profObservaciones;
		this.profAnulado = profAnulado;
		this.profPendiente = profPendiente;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProfPeriodo() {
		return profPeriodo;
	}

	public void setProfPeriodo(String profPeriodo) {
		this.profPeriodo = profPeriodo;
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

	public String getProfFecha() {
		return profFecha;
	}

	public void setProfFecha(String profFecha) {
		this.profFecha = profFecha;
	}

	public String getCliCodigo() {
		return cliCodigo;
	}

	public void setCliCodigo(String cliCodigo) {
		this.cliCodigo = cliCodigo;
	}

	public String getCliNombre() {
		return cliNombre;
	}

	public void setCliNombre(String cliNombre) {
		this.cliNombre = cliNombre;
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

	public BigDecimal getProfMontoIva() {
		return profMontoIva;
	}

	public void setProfMontoIva(BigDecimal profMontoIva) {
		this.profMontoIva = profMontoIva;
	}

	public BigDecimal getProfTotal() {
		return profTotal;
	}

	public void setProfTotal(BigDecimal profTotal) {
		this.profTotal = profTotal;
	}

	public String getProfObservaciones() {
		return profObservaciones;
	}

	public void setProfObservaciones(String profObservaciones) {
		this.profObservaciones = profObservaciones;
	}

	public String getProfAnulado() {
		return profAnulado;
	}

	public void setProfAnulado(String profAnulado) {
		this.profAnulado = profAnulado;
	}

	public String getProfPendiente() {
		return profPendiente;
	}

	public void setProfPendiente(String profPendiente) {
		this.profPendiente = profPendiente;
	}

}
