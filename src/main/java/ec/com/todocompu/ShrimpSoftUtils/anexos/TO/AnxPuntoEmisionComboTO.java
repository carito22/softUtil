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
public class AnxPuntoEmisionComboTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "fun_puntos_de_emision")
	private String puntoEmision;

	public AnxPuntoEmisionComboTO() {
	}

	public AnxPuntoEmisionComboTO(String puntoEmision) {
		this.puntoEmision = puntoEmision;
	}

	public String getPuntoEmision() {
		return puntoEmision;
	}

	public void setPuntoEmision(String puntoEmision) {
		this.puntoEmision = puntoEmision;
	}

	@Override
	public String toString() {
		return this.puntoEmision;
	}

}