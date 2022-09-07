/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class CarCobrosDetalleVentasTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "det_secuencial")
	private Integer detSecuencial;

	@Column(name = "det_valor")
	private BigDecimal detValor;

	@Column(name = "cob_empresa")
	private String cobEmpresa;

	@Column(name = "cob_periodo")
	private String cobPeriodo;

	@Column(name = "cob_tipo")
	private String cobTipo;

	@Column(name = "cob_numero")
	private String cobNumero;

	@Column(name = "vta_empresa")
	private String vtaEmpresa;

	@Column(name = "vta_periodo")
	private String vtaPeriodo;

	@Column(name = "vta_motivo")
	private String vtaMotivo;

	@Column(name = "vta_numero")
	private String vtaNumero;

	@Column(name = "cli_codigo")
	private String cliCodigo;

	@Column(name = "vta_documento")
	private String vtaDocumento;

	// @Column(name = "vta_seccodigo")
	private String vtaSecCodigo;

	public CarCobrosDetalleVentasTO() {
	}

	public CarCobrosDetalleVentasTO(BigDecimal detValor, String vtaEmpresa, String vtaPeriodo, String vtaMotivo,
			String vtaNumero, String cliCodigo, String vtaDocumento, String vtaSecCodigo) {
		this.detValor = detValor;
		this.vtaEmpresa = vtaEmpresa;
		this.vtaPeriodo = vtaPeriodo;
		this.vtaMotivo = vtaMotivo;
		this.vtaNumero = vtaNumero;
		this.cliCodigo = cliCodigo;
		this.vtaDocumento = vtaDocumento;
		this.vtaSecCodigo = vtaSecCodigo;
	}

	public String getCliCodigo() {
		return cliCodigo;
	}

	public void setCliCodigo(String cliCodigo) {
		this.cliCodigo = cliCodigo;
	}

	public String getCobEmpresa() {
		return cobEmpresa;
	}

	public void setCobEmpresa(String cobEmpresa) {
		this.cobEmpresa = cobEmpresa;
	}

	public String getCobNumero() {
		return cobNumero;
	}

	public void setCobNumero(String cobNumero) {
		this.cobNumero = cobNumero;
	}

	public String getCobPeriodo() {
		return cobPeriodo;
	}

	public void setCobPeriodo(String cobPeriodo) {
		this.cobPeriodo = cobPeriodo;
	}

	public String getCobTipo() {
		return cobTipo;
	}

	public void setCobTipo(String cobTipo) {
		this.cobTipo = cobTipo;
	}

	public Integer getDetSecuencial() {
		return detSecuencial;
	}

	public void setDetSecuencial(Integer detSecuencial) {
		this.detSecuencial = detSecuencial;
	}

	public BigDecimal getDetValor() {
		return detValor;
	}

	public void setDetValor(BigDecimal detValor) {
		this.detValor = detValor;
	}

	public String getVtaDocumento() {
		return vtaDocumento;
	}

	public void setVtaDocumento(String vtaDocumento) {
		this.vtaDocumento = vtaDocumento;
	}

	public String getVtaEmpresa() {
		return vtaEmpresa;
	}

	public void setVtaEmpresa(String vtaEmpresa) {
		this.vtaEmpresa = vtaEmpresa;
	}

	public String getVtaMotivo() {
		return vtaMotivo;
	}

	public void setVtaMotivo(String vtaMotivo) {
		this.vtaMotivo = vtaMotivo;
	}

	public String getVtaNumero() {
		return vtaNumero;
	}

	public void setVtaNumero(String vtaNumero) {
		this.vtaNumero = vtaNumero;
	}

	public String getVtaPeriodo() {
		return vtaPeriodo;
	}

	public void setVtaPeriodo(String vtaPeriodo) {
		this.vtaPeriodo = vtaPeriodo;
	}

	public String getVtaSecCodigo() {
		return vtaSecCodigo;
	}

	public void setVtaSecCodigo(String vtaSecCodigo) {
		this.vtaSecCodigo = vtaSecCodigo;
	}
}
