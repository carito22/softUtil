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
public class InvTransferenciaMotivoComboTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "tm_codigo")
	private String tmCodigo;

	@Column(name = "tm_detalle")
	private String tmDetalle;

	public InvTransferenciaMotivoComboTO() {
	}

	public InvTransferenciaMotivoComboTO(String tmCodigo, String tmDetalle) {
		this.tmCodigo = tmCodigo;
		this.tmDetalle = tmDetalle;
	}

	public String getTmCodigo() {
		return tmCodigo;
	}

	public void setTmCodigo(String tmCodigo) {
		this.tmCodigo = tmCodigo;
	}

	public String getTmDetalle() {
		return tmDetalle;
	}

	public void setTmDetalle(String tmDetalle) {
		this.tmDetalle = tmDetalle;
	}

	@Override
	public String toString() {
		return this.tmDetalle;
	}
}
