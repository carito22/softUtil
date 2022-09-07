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
public class CarCobrosDetalleFormaTO implements Serializable {

	// private Integer detSecuencial;

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "det_banco")
	private String detBanco;

	@Column(name = "det_cuenta")
	private String detCuenta;

	@Column(name = "det_fecha_vencimiento")
	private String detFechaPst;

	@Column(name = "det_referencia")
	private String detReferencia;

	@Column(name = "det_valor")
	private BigDecimal detValor;

	@Column(name = "det_observaciones")
	private String detObservaciones;

	@Column(name = "ban_empresa")
	private String banEmpresa;

	@Column(name = "ban_codigo")
	private String banCodigo;

	@Column(name = "cob_empresa")
	private String cobEmpresa;

	@Column(name = "cob_periodo")
	private String cobPeriodo;

	@Column(name = "cob_tipo")
	private String cobMotivo;

	@Column(name = "cob_numero")
	private String cobNumero;

	@Column(name = "sec_codigo")
	private String secCodigo;

	@Column(name = "fp_secuencial")
	private Integer fpSecuencial;

	// private String conDetDocumento;

	public CarCobrosDetalleFormaTO() {
	}

	public CarCobrosDetalleFormaTO(BigDecimal detValor, String detReferencia, String detObservaciones,
			String cobEmpresa, String cobPeriodo, String cobMotivo, String cobNumero, Integer fpSecuencial,
			String secCodigo) {
		this.detValor = detValor;
		this.detReferencia = detReferencia;
		this.detObservaciones = detObservaciones;
		this.cobEmpresa = cobEmpresa;
		this.cobPeriodo = cobPeriodo;
		this.cobMotivo = cobMotivo;
		this.cobNumero = cobNumero;
		this.fpSecuencial = fpSecuencial;
		this.secCodigo = secCodigo;
	}

	public String getCobEmpresa() {
		return cobEmpresa;
	}

	public void setCobEmpresa(String cobEmpresa) {
		this.cobEmpresa = cobEmpresa;
	}

	public String getCobMotivo() {
		return cobMotivo;
	}

	public void setCobMotivo(String cobMotivo) {
		this.cobMotivo = cobMotivo;
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

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	public String getDetBanco() {
		return detBanco;
	}

	public void setDetBanco(String detBanco) {
		this.detBanco = detBanco;
	}

	public String getDetCuenta() {
		return detCuenta;
	}

	public void setDetCuenta(String detCuenta) {
		this.detCuenta = detCuenta;
	}

	public String getDetFechaPst() {
		return detFechaPst;
	}

	public void setDetFechaPst(String detFechaPst) {
		this.detFechaPst = detFechaPst;
	}

	public String getBanCodigo() {
		return banCodigo;
	}

	public void setBanCodigo(String banCodigo) {
		this.banCodigo = banCodigo;
	}

	public String getBanEmpresa() {
		return banEmpresa;
	}

	public void setBanEmpresa(String banEmpresa) {
		this.banEmpresa = banEmpresa;
	}

}
