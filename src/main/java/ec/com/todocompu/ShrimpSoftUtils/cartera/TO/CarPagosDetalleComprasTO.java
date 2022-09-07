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
public class CarPagosDetalleComprasTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "det_secuencial")
	private Integer detSecuencial;

	@Column(name = "det_valor")
	private BigDecimal detValor;

	@Column(name = "pag_empresa")
	private String pagEmpresa;

	@Column(name = "pag_periodo")
	private String pagPeriodo;

	@Column(name = "pag_tipo")
	private String pagTipo;

	@Column(name = "pag_numero")
	private String pagNumero;

	@Column(name = "comp_empresa")
	private String compEmpresa;

	@Column(name = "comp_periodo")
	private String compPeriodo;

	@Column(name = "comp_motivo")
	private String compMotivo;

	@Column(name = "comp_numero")
	private String compNumero;

	@Column(name = "prov_codigo")
	private String provCodigo;

	private String compDocumento;
	private String compSecCodigo;

	public CarPagosDetalleComprasTO() {
	}

	public CarPagosDetalleComprasTO(BigDecimal detValor, String compEmpresa, String compPeriodo, String compMotivo,
			String compNumero, String provCodigo, String compDocumento, String compSecCodigo) {
		this.detValor = detValor;
		this.compEmpresa = compEmpresa;
		this.compPeriodo = compPeriodo;
		this.compMotivo = compMotivo;
		this.compNumero = compNumero;
		this.provCodigo = provCodigo;
		this.compDocumento = compDocumento;
		this.compSecCodigo = compSecCodigo;
	}

	public String getCompDocumento() {
		return compDocumento;
	}

	public void setCompDocumento(String compDocumento) {
		this.compDocumento = compDocumento;
	}

	public String getCompEmpresa() {
		return compEmpresa;
	}

	public void setCompEmpresa(String compEmpresa) {
		this.compEmpresa = compEmpresa;
	}

	public String getCompMotivo() {
		return compMotivo;
	}

	public void setCompMotivo(String compMotivo) {
		this.compMotivo = compMotivo;
	}

	public String getCompNumero() {
		return compNumero;
	}

	public void setCompNumero(String compNumero) {
		this.compNumero = compNumero;
	}

	public String getCompPeriodo() {
		return compPeriodo;
	}

	public void setCompPeriodo(String compPeriodo) {
		this.compPeriodo = compPeriodo;
	}

	public String getCompSecCodigo() {
		return compSecCodigo;
	}

	public void setCompSecCodigo(String compSecCodigo) {
		this.compSecCodigo = compSecCodigo;
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

	public String getPagEmpresa() {
		return pagEmpresa;
	}

	public void setPagEmpresa(String pagEmpresa) {
		this.pagEmpresa = pagEmpresa;
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

	public String getPagTipo() {
		return pagTipo;
	}

	public void setPagTipo(String pagTipo) {
		this.pagTipo = pagTipo;
	}

	public String getProvCodigo() {
		return provCodigo;
	}

	public void setProvCodigo(String provCodigo) {
		this.provCodigo = provCodigo;
	}
}
