/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdLiquidacionProductoTablaTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "prod_codigo")
	private String prodCodigo;

	@Column(name = "prod_detalle")
	private String prodDetalle;

	@Column(name = "prod_tipo")
	private String prodTipo;

	@Column(name = "prod_clase")
	private char prodClase;

	@Column(name = "prod_inactivo")
	private Boolean prodInactivo;

	public PrdLiquidacionProductoTablaTO() {
	}

	public PrdLiquidacionProductoTablaTO(String prdCodigo, String prdDetalle, String prdTipo, char prodClase,
			Boolean prodInactivo) {
		this.prodCodigo = prdCodigo;
		this.prodDetalle = prdDetalle;
		this.prodTipo = prdTipo;
		this.prodClase = prodClase;
		this.prodInactivo = prodInactivo;
	}

	public String getProdCodigo() {
		return prodCodigo;
	}

	public void setProdCodigo(String prdCodigo) {
		this.prodCodigo = prdCodigo;
	}

	public String getProdDetalle() {
		return prodDetalle;
	}

	public void setProdDetalle(String prdDetalle) {
		this.prodDetalle = prdDetalle;
	}

	public String getProdTipo() {
		return prodTipo;
	}

	public void setProdTipo(String prdTipo) {
		this.prodTipo = prdTipo;
	}

	public char getProdClase() {
		return prodClase;
	}

	public void setProdClase(char prodClase) {
		this.prodClase = prodClase;
	}

	public Boolean getProdInactivo() {
		return prodInactivo;
	}

	public void setProdInactivo(Boolean prodInactivo) {
		this.prodInactivo = prodInactivo;
	}

}