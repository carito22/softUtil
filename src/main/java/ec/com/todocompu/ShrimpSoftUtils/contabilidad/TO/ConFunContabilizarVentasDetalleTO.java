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
 * @author Carlos Ajila
 */
@Entity
public class ConFunContabilizarVentasDetalleTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "det_orden")
	private Integer detOrden;
	
	@Column(name = "det_secuencia")
	private Long detSecuencia;
	
	@Column(name = "det_documento")
	private String detDocumento;
	@Column(name = "det_debito_credito")
	private Character detDebitoCredito;
	@Column(name = "det_valor")
	private BigDecimal detValor;
	@Column(name = "det_saldo")
	private BigDecimal detSaldo;
	@Column(name = "det_generado")
	private Boolean detGenerado;
	@Column(name = "det_referencia")
	private String detReferencia;
	@Column(name = "det_observaciones")
	private String detObservaciones;
	
	@Column(name = "sec_empresa")
	private String secEmpresa;
	@Column(name = "sec_codigo")
	private String secCodigo;
	@Column(name = "pis_empresa")
	private String pisEmpresa;
	@Column(name = "pis_sector")
	private String pisSector;
	@Column(name = "pis_numero")
	private String pisNumero;
	@Column(name = "con_empresa")
	private String conEmpresa;
	@Column(name = "con_periodo")
	private String conPeriodo;
	@Column(name = "con_tipo")
	private String conTipo;
	@Column(name = "con_numero")
	private String conNumero;
	@Column(name = "cta_empresa")
	private String ctaEmpresa;
	@Column(name = "cta_codigo")
	private String ctaCodigo;

	public ConFunContabilizarVentasDetalleTO() {
	}

	public ConFunContabilizarVentasDetalleTO(Long detSecuencia, String detDocumento, Character detDebitoCredito,
			BigDecimal detValor, BigDecimal detSaldo, Boolean detGenerado, String detReferencia,
			String detObservaciones, Integer detOrden, String secEmpresa, String secCodigo, String pisEmpresa,
			String pisSector, String pisNumero, String conEmpresa, String conPeriodo, String conTipo, String conNumero,
			String ctaEmpresa, String ctaCodigo) {
		this.detSecuencia = detSecuencia;
		this.detDocumento = detDocumento;
		this.detDebitoCredito = detDebitoCredito;
		this.detValor = detValor;
		this.detSaldo = detSaldo;
		this.detGenerado = detGenerado;
		this.detReferencia = detReferencia;
		this.detObservaciones = detObservaciones;
		this.detOrden = detOrden;
		this.secEmpresa = secEmpresa;
		this.secCodigo = secCodigo;
		this.pisEmpresa = pisEmpresa;
		this.pisSector = pisSector;
		this.pisNumero = pisNumero;
		this.conEmpresa = conEmpresa;
		this.conPeriodo = conPeriodo;
		this.conTipo = conTipo;
		this.conNumero = conNumero;
		this.ctaEmpresa = ctaEmpresa;
		this.ctaCodigo = ctaCodigo;
	}

	public String getConEmpresa() {
		return conEmpresa;
	}

	public void setConEmpresa(String conEmpresa) {
		this.conEmpresa = conEmpresa;
	}

	public String getConNumero() {
		return conNumero;
	}

	public void setConNumero(String conNumero) {
		this.conNumero = conNumero;
	}

	public String getConPeriodo() {
		return conPeriodo;
	}

	public void setConPeriodo(String conPeriodo) {
		this.conPeriodo = conPeriodo;
	}

	public String getConTipo() {
		return conTipo;
	}

	public void setConTipo(String conTipo) {
		this.conTipo = conTipo;
	}

	public String getCtaCodigo() {
		return ctaCodigo;
	}

	public void setCtaCodigo(String ctaCodigo) {
		this.ctaCodigo = ctaCodigo;
	}

	public String getCtaEmpresa() {
		return ctaEmpresa;
	}

	public void setCtaEmpresa(String ctaEmpresa) {
		this.ctaEmpresa = ctaEmpresa;
	}

	public String getDetDocumento() {
		return detDocumento;
	}

	public void setDetDocumento(String detDocumento) {
		this.detDocumento = detDocumento;
	}

	public Character getDetDebitoCredito() {
		return detDebitoCredito;
	}

	public void setDetDebitoCredito(Character detDebitoCredito) {
		this.detDebitoCredito = detDebitoCredito;
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

	public BigDecimal getDetSaldo() {
		return detSaldo;
	}

	public void setDetSaldo(BigDecimal detSaldo) {
		this.detSaldo = detSaldo;
	}

	public Long getDetSecuencia() {
		return detSecuencia;
	}

	public void setDetSecuencia(Long detSecuencia) {
		this.detSecuencia = detSecuencia;
	}

	public BigDecimal getDetValor() {
		return detValor;
	}

	public void setDetValor(BigDecimal detValor) {
		this.detValor = detValor;
	}

	public String getPisEmpresa() {
		return pisEmpresa;
	}

	public void setPisEmpresa(String pisEmpresa) {
		this.pisEmpresa = pisEmpresa;
	}

	public String getPisNumero() {
		return pisNumero;
	}

	public void setPisNumero(String pisNumero) {
		this.pisNumero = pisNumero;
	}

	public String getPisSector() {
		return pisSector;
	}

	public void setPisSector(String pisSector) {
		this.pisSector = pisSector;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	public String getSecEmpresa() {
		return secEmpresa;
	}

	public void setSecEmpresa(String secEmpresa) {
		this.secEmpresa = secEmpresa;
	}

}
