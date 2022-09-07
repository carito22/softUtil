/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvCategoriaComboProductoTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cat_codigo")
	private String catCodigo;

	@Column(name = "cat_detalle")
	private String catDetalle;

	@Column(name = "cta_codigo")
	private String ctaCodigo;

	public InvCategoriaComboProductoTO() {
	}

	public InvCategoriaComboProductoTO(String catCodigo, String catDetalle, String ctaCodigo) {
		this.catCodigo = catCodigo;
		this.catDetalle = catDetalle;
		this.ctaCodigo = ctaCodigo;
	}

	public String getCatCodigo() {
		return catCodigo;
	}

	public void setCatCodigo(String catCodigo) {
		this.catCodigo = catCodigo;
	}

	public String getCatDetalle() {
		return catDetalle;
	}

	public void setCatDetalle(String catDetalle) {
		this.catDetalle = catDetalle;
	}

	public String getCtaCodigo() {
		return ctaCodigo;
	}

	public void setCtaCodigo(String ctaCodigo) {
		this.ctaCodigo = ctaCodigo;
	}

	@Override
	public String toString() {
		return this.catDetalle;
	}
}
