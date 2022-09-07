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
public class InvProductoPresentacionUnidadesComboListadoTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "presu_codigo")
	private String presuCodigo;

	@Column(name = "presu_detalle")
	private String presuDetalle;

	@Column(name = "presu_abreviado")
	private String presuAbreviado;

	public InvProductoPresentacionUnidadesComboListadoTO() {
	}

	public InvProductoPresentacionUnidadesComboListadoTO(String presuCodigo, String presuDetalle,
			String presuAbreviado) {
		this.presuCodigo = presuCodigo;
		this.presuDetalle = presuDetalle;
		this.presuAbreviado = presuAbreviado;
	}

	public String getPresuAbreviado() {
		return presuAbreviado;
	}

	public void setPresuAbreviado(String presuAbreviado) {
		this.presuAbreviado = presuAbreviado;
	}

	public String getPresuCodigo() {
		return presuCodigo;
	}

	public void setPresuCodigo(String presuCodigo) {
		this.presuCodigo = presuCodigo;
	}

	public String getPresuDetalle() {
		return presuDetalle;
	}

	public void setPresuDetalle(String presuDetalle) {
		this.presuDetalle = presuDetalle;
	}

	@Override
	public String toString() {
		return this.presuDetalle;
	}
}
