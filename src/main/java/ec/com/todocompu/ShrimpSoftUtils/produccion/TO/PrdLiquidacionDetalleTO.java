/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author javier tj
 */
@Entity
public class PrdLiquidacionDetalleTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "det_secuencial")
	private Integer detSecuencial;

	@Column(name = "det_orden")
	private Integer detOrden;

	@Column(name = "det_libras")
	private BigDecimal detLibras;

	@Column(name = "det_precio")
	private BigDecimal detPrecio;

	@Column(name = "prod_empresa")
	private String prodEmpresa;

	@Column(name = "prod_codigo")
	private String prodCodigo;

	@Column(name = "talla_empresa")
	private String tallaEmpresa;

	@Column(name = "talla_codigo")
	private String tallaCodigo;

	@Column(name = "liq_empresa")
	private String liqEmpresa;

	@Column(name = "liq_motivo")
	private String liqMotivo;

	@Column(name = "liq_numero")
	private String liqNumero;

	public PrdLiquidacionDetalleTO() {
	}

	public PrdLiquidacionDetalleTO(Integer detSecuencial, Integer detOrden, BigDecimal detLibras, BigDecimal detPrecio,
			String prodEmpresa, String prodCodigo, String tallaEmpres, String tallaCodigo, String liqEmpresa,
			String liqMotivo, String liqNumero) {
		this.detSecuencial = detSecuencial;
		this.detOrden = detOrden;
		this.detLibras = detLibras;
		this.detPrecio = detPrecio;
		this.prodEmpresa = prodEmpresa;
		this.prodCodigo = prodCodigo;
		this.tallaEmpresa = tallaEmpres;
		this.tallaCodigo = tallaCodigo;
		this.liqEmpresa = liqEmpresa;
		this.liqMotivo = liqMotivo;
		this.liqNumero = liqNumero;
	}

	public BigDecimal getDetLibras() {
		return detLibras;
	}

	public void setDetLibras(BigDecimal detLibras) {
		this.detLibras = detLibras;
	}

	public BigDecimal getDetPrecio() {
		return detPrecio;
	}

	public void setDetPrecio(BigDecimal detPrecio) {
		this.detPrecio = detPrecio;
	}

	public Integer getDetSecuencial() {
		return detSecuencial;
	}

	public void setDetSecuencial(Integer detSecuencial) {
		this.detSecuencial = detSecuencial;
	}

	public String getLiqEmpresa() {
		return liqEmpresa;
	}

	public void setLiqEmpresa(String liqEmpresa) {
		this.liqEmpresa = liqEmpresa;
	}

	public String getLiqMotivo() {
		return liqMotivo;
	}

	public void setLiqMotivo(String liqMotivo) {
		this.liqMotivo = liqMotivo;
	}

	public String getLiqNumero() {
		return liqNumero;
	}

	public void setLiqNumero(String liqNumero) {
		this.liqNumero = liqNumero;
	}

	public String getProdCodigo() {
		return prodCodigo;
	}

	public void setProdCodigo(String prodCodigo) {
		this.prodCodigo = prodCodigo;
	}

	public String getProdEmpresa() {
		return prodEmpresa;
	}

	public void setProdEmpresa(String prodEmpresa) {
		this.prodEmpresa = prodEmpresa;
	}

	public String getTallaCodigo() {
		return tallaCodigo;
	}

	public void setTallaCodigo(String tallaCodigo) {
		this.tallaCodigo = tallaCodigo;
	}

	public String getTallaEmpresa() {
		return tallaEmpresa;
	}

	public void setTallaEmpresa(String tallaEmpresa) {
		this.tallaEmpresa = tallaEmpresa;
	}

	public Integer getDetOrden() {
		return detOrden;
	}

	public void setDetOrden(Integer detOrden) {
		this.detOrden = detOrden;
	}

}
