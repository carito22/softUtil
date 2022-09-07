/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConContable;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConDetalle;

/**
 * @author Carlos Ajila
 */
@Entity
public class ConContableConDetalle implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "con_contable")
	private ConContable conContable;
	@Column(name = "con_detalle")
	private ConDetalle conDetalle;

	public ConContableConDetalle() {
	}

	public ConContableConDetalle(ConContable conContable, ConDetalle conDetalle) {
		this.conContable = conContable;
		this.conDetalle = conDetalle;
	}

	public ConContable getConContable() {
		return conContable;
	}

	public void setConContable(ConContable conContable) {
		this.conContable = conContable;
	}

	public ConDetalle getConDetalle() {
		return conDetalle;
	}

	public void setConDetalle(ConDetalle conDetalle) {
		this.conDetalle = conDetalle;
	}

}
