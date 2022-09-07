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

@Entity
public class PrdListaDetalleLiquidacionTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "lvd_secuencial")
	private Integer detSecuencial;

	@Column(name = "lvd_orden")
	private Integer detOrden;

	@Column(name = "lvd_libras")
	private BigDecimal detLibras;

	@Column(name = "lvd_producto_codigo")
	private String prodCodigo;

	@Column(name = "lvd_producto_clase")
	private char prodClase;

	@Column(name = "lvd_producto_talla")
	private String tallaCodigo;

	@Column(name = "lvd_precio")
	private BigDecimal detPrecio;

	@Column(name = "lvd_parcial")
	private BigDecimal detParcial;

	public PrdListaDetalleLiquidacionTO() {
	}

	public PrdListaDetalleLiquidacionTO(Integer detSecuencial, Integer detOrden, BigDecimal detLibras,
			String prodCodigo, char prodClase, String tallaCodigo, BigDecimal detPrecio, BigDecimal detParcial,
			Integer id) {
		this.detSecuencial = detSecuencial;
		this.detOrden = detOrden;
		this.detLibras = detLibras;
		this.prodCodigo = prodCodigo;
		this.prodClase = prodClase;
		this.tallaCodigo = tallaCodigo;
		this.detPrecio = detPrecio;
		this.detParcial = detParcial;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getDetLibras() {
		return detLibras;
	}

	public void setDetLibras(BigDecimal detLibras) {
		this.detLibras = detLibras;
	}

	public BigDecimal getDetParcial() {
		return detParcial;
	}

	public void setDetParcial(BigDecimal detParcial) {
		this.detParcial = detParcial;
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

	public char getProdClase() {
		return prodClase;
	}

	public void setProdClase(char prodClase) {
		this.prodClase = prodClase;
	}

	public String getProdCodigo() {
		return prodCodigo;
	}

	public void setProdCodigo(String prodCodigo) {
		this.prodCodigo = prodCodigo;
	}

	public String getTallaCodigo() {
		return tallaCodigo;
	}

	public void setTallaCodigo(String tallaCodigo) {
		this.tallaCodigo = tallaCodigo;
	}

	public Integer getDetOrden() {
		return detOrden;
	}

	public void setDetOrden(Integer detOrden) {
		this.detOrden = detOrden;
	}

}
