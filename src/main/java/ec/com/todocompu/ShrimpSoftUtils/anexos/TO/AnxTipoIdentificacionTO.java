/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */

@Entity
public class AnxTipoIdentificacionTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ti_codigo")
	private Character tiCodigo;
	@Column(name = "ti_detalle")
	private String tiDetalle;

	public AnxTipoIdentificacionTO() {
	}

	public AnxTipoIdentificacionTO(Character tiCodigo, String tiDetalle) {
		this.tiCodigo = tiCodigo;
		this.tiDetalle = tiDetalle;
	}

	public Character getTiCodigo() {
		return tiCodigo;
	}

	public void setTiCodigo(Character tiCodigo) {
		this.tiCodigo = tiCodigo;
	}

	public String getTiDetalle() {
		return tiDetalle;
	}

	public void setTiDetalle(String tiDetalle) {
		this.tiDetalle = tiDetalle;
	}

	@Override
	public String toString() {
		return this.tiDetalle;
	}
}
