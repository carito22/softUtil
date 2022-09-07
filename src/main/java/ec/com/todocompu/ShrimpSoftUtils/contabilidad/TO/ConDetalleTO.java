/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos ajila
 */
@Entity
public class ConDetalleTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;
	@Column(name = "det_secuencia")
	private Integer detSecuencia;

	@Column(name = "det_orden")
	private Integer detOrden;
	@Column(name = "con_empresa")
	private String empCodigo;
	@Column(name = "con_periodo")
	private String perCodigo;
	@Column(name = "con_tipo")
	private String tipCodigo;
	@Column(name = "con_numero")
	private String conNumero;

	@Column(name = "cta_codigo")
	private String conCtaCodigo;
	@Column(name = "sec_codigo")
	private String secCodigo;
	@Column(name = "pis_sector")
	private String pisSector;
	@Column(name = "pis_numero")
	private String pisNumero;
	@Column(name = "det_documento")
	private String detDocumento;
	@Column(name = "det_debito_credito")
	private Character detDebitoCredito;
	@Column(name = "det_valor")
	private BigDecimal detValor;
	@Column(name = "det_generado")
	private Boolean detGenerado;
	@Column(name = "det_referencia")
	private String detReferencia;
	@Column(name = "det_observaciones")
	private String detObservaciones;

	public ConDetalleTO() {
	}

	public ConDetalleTO(String empCodigo, String perCodigo, String tipCodigo, String conNumero, Integer detSecuencia,
			String conCtaCodigo, String secCodigo, String pisSector, String pisNumero, String detDocumento,
			Character detDebitoCredito, BigDecimal detValor, Boolean detGenerado, String detReferencia,
			String detObservaciones, Integer detOrden) {
		this.empCodigo = empCodigo;
		this.perCodigo = perCodigo;
		this.tipCodigo = tipCodigo;
		this.conNumero = conNumero;
		this.detSecuencia = detSecuencia;
		this.conCtaCodigo = conCtaCodigo;
		this.secCodigo = secCodigo;
		this.pisSector = pisSector;
		this.pisNumero = pisNumero;
		this.detDocumento = detDocumento;
		this.detDebitoCredito = detDebitoCredito;
		this.detValor = detValor;
		this.detGenerado = detGenerado;
		this.detReferencia = detReferencia;
		this.detObservaciones = detObservaciones;
		this.detOrden = detOrden;
		// this.detSaldo = detSaldo;
	}

	public String getPisSector() {
		return pisSector;
	}

	public void setPisSector(String pisSector) {
		this.pisSector = pisSector;
	}

	public BigDecimal getDetSaldo() {
		return new BigDecimal(0);
	}

	public void setDetSaldo(BigDecimal detSaldo) {
		// this.detSaldo = detSaldo;
	}

	public String getConCtaCodigo() {
		return conCtaCodigo;
	}

	public void setConCtaCodigo(String conCtaCodigo) {
		this.conCtaCodigo = conCtaCodigo;
	}

	public String getConNumero() {
		return conNumero;
	}

	public void setConNumero(String conNumero) {
		this.conNumero = conNumero;
	}

	public Character getDetDebitoCredito() {
		return detDebitoCredito;
	}

	public void setDetDebitoCredito(Character detDebitoCredito) {
		this.detDebitoCredito = detDebitoCredito;
	}

	public String getDetDocumento() {
		return detDocumento;
	}

	public void setDetDocumento(String detDocumento) {
		this.detDocumento = detDocumento;
	}

	public Boolean getDetGenerado() {
		return detGenerado;
	}

	public void setDetGenerado(Boolean detGenerado) {
		this.detGenerado = detGenerado;
	}

	public String getDetObservaciones() {
		return detObservaciones;
	}

	public void setDetObservaciones(String detObservaciones) {
		this.detObservaciones = detObservaciones;
	}

	public Integer getDetOrden() {
		return detOrden;
	}

	public void setDetOrden(Integer detOrden) {
		this.detOrden = detOrden;
	}

	public String getDetReferencia() {
		return detReferencia;
	}

	public void setDetReferencia(String detReferencia) {
		this.detReferencia = detReferencia;
	}

	public Integer getDetSecuencia() {
		return detSecuencia;
	}

	public void setDetSecuencia(Integer detSecuencia) {
		this.detSecuencia = detSecuencia;
	}

	public BigDecimal getDetValor() {
		return detValor;
	}

	public void setDetValor(BigDecimal detValor) {
		this.detValor = detValor;
	}

	public String getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	public String getPerCodigo() {
		return perCodigo;
	}

	public void setPerCodigo(String perCodigo) {
		this.perCodigo = perCodigo;
	}

	public String getTipCodigo() {
		return tipCodigo;
	}

	public void setTipCodigo(String tipCodigo) {
		this.tipCodigo = tipCodigo;
	}

	public String getPisNumero() {
		return pisNumero;
	}

	public void setPisNumero(String pisNumero) {
		this.pisNumero = pisNumero;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	@Override
	public String toString() {
		return this.empCodigo + " " + this.perCodigo + " " + this.tipCodigo + " " + this.conNumero + " "
				+ this.detSecuencia + " " + this.conCtaCodigo + " " + this.secCodigo + " " + this.pisNumero + " "
				+ this.detDocumento + " " + this.detDebitoCredito + " " + this.detValor + " " + this.detGenerado + " "
				+ this.detOrden;
	}

}
