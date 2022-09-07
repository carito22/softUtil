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
public class CarPagosDetalleFormaTO implements Serializable {

	// private Integer detSecuencial;
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "det_valor")
	private BigDecimal detValor;

	@Column(name = "det_referencia")
	private String detReferencia;

	@Column(name = "det_observaciones")
	private String detObservaciones;

	@Column(name = "pag_empresa")
	private String pagEmpresa;

	@Column(name = "pag_periodo")
	private String pagPeriodo;

	@Column(name = "pag_tipo")
	private String pagMotivo;

	@Column(name = "pag_numero")
	private String pagNumero;

	@Column(name = "fp_secuencial")
	private Integer fpSecuencial;

	@Column(name = "sec_codigo")
	private String SecCodigo;

	// private String conDetDocumento;

	public CarPagosDetalleFormaTO() {
	}

	public CarPagosDetalleFormaTO(BigDecimal detValor, String detReferencia, String detObservaciones, String pagEmpresa,
			String pagPeriodo, String pagMotivo, String pagNumero, Integer fpSecuencial, String SecCodigo) {
		this.detValor = detValor;
		this.detReferencia = detReferencia;
		this.detObservaciones = detObservaciones;
		this.pagEmpresa = pagEmpresa;
		this.pagPeriodo = pagPeriodo;
		this.pagMotivo = pagMotivo;
		this.pagNumero = pagNumero;
		this.fpSecuencial = fpSecuencial;
		this.SecCodigo = SecCodigo;
	}

	public String getSecCodigo() {
		return SecCodigo;
	}

	public void setSecCodigo(String SecCodigo) {
		this.SecCodigo = SecCodigo;
	}

	public String getDetObservaciones() {
		return detObservaciones;
	}

	public void setDetObservaciones(String detObservaciones) {
		this.detObservaciones = detObservaciones;
	}

	public String getDetReferencia() {
		return detReferencia;
	}

	public void setDetReferencia(String detReferencia) {
		this.detReferencia = detReferencia;
	}

	public BigDecimal getDetValor() {
		return detValor;
	}

	public void setDetValor(BigDecimal detValor) {
		this.detValor = detValor;
	}

	public Integer getFpSecuencial() {
		return fpSecuencial;
	}

	public void setFpSecuencial(Integer fpSecuencial) {
		this.fpSecuencial = fpSecuencial;
	}

	public String getPagEmpresa() {
		return pagEmpresa;
	}

	public void setPagEmpresa(String pagEmpresa) {
		this.pagEmpresa = pagEmpresa;
	}

	public String getPagMotivo() {
		return pagMotivo;
	}

	public void setPagMotivo(String pagMotivo) {
		this.pagMotivo = pagMotivo;
	}

	public String getPagNumero() {
		return pagNumero;
	}

	public void setPagNumero(String pagNumero) {
		this.pagNumero = pagNumero;
	}

	public String getPagPeriodo() {
		return pagPeriodo;
	}

	public void setPagPeriodo(String pagPeriodo) {
		this.pagPeriodo = pagPeriodo;
	}
}
