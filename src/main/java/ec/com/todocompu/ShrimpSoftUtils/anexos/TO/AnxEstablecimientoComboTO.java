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
public class AnxEstablecimientoComboTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "fun_establecimientos")
	private String establecimiento;

	public AnxEstablecimientoComboTO() {
	}

	public AnxEstablecimientoComboTO(String establecimiento) {
		this.establecimiento = establecimiento;
	}

	public String getEstablecimiento() {
		return establecimiento;
	}

	public void setEstablecimiento(String establecimiento) {
		this.establecimiento = establecimiento;
	}

	@Override
	public String toString() {
		return this.establecimiento;
	}

}