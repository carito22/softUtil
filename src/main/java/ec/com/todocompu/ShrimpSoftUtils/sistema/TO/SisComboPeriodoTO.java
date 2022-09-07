/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.sistema.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
public class SisComboPeriodoTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "per_codigo")
	private String perCodigo;
	@Column(name = "per_detalle")
	private String perDetalle;

	public SisComboPeriodoTO() {
	}

	public SisComboPeriodoTO(String perCodigo, String perDetalle) {
		this.perCodigo = perCodigo;
		this.perDetalle = perDetalle;
	}

	public String getPerCodigo() {
		return perCodigo;
	}

	public void setPerCodigo(String perCodigo) {
		this.perCodigo = perCodigo;
	}

	public String getPerDetalle() {
		return perDetalle;
	}

	public void setPerDetalle(String perDetalle) {
		this.perDetalle = perDetalle;
	}

	@Override
	public String toString() {
		return this.perDetalle;
	}
}
