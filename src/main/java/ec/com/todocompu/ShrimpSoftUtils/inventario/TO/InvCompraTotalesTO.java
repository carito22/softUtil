/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */

public class InvCompraTotalesTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private java.math.BigDecimal compBase0;
	private java.math.BigDecimal compBaseImponible;
	private java.math.BigDecimal compIce;

	public InvCompraTotalesTO() {
	}
	

	public InvCompraTotalesTO(BigDecimal compBase0, BigDecimal compBaseImponible, BigDecimal compIce) {
		this.compBase0 = compBase0;
		this.compBaseImponible = compBaseImponible;
		this.compIce = compIce;
	}


	public java.math.BigDecimal getCompBase0() {
		return compBase0;
	}

	public void setCompBase0(java.math.BigDecimal compBase0) {
		this.compBase0 = compBase0;
	}

	public java.math.BigDecimal getCompBaseImponible() {
		return compBaseImponible;
	}

	public void setCompBaseImponible(java.math.BigDecimal compBaseImponible) {
		this.compBaseImponible = compBaseImponible;
	}

	public java.math.BigDecimal getCompIce() {
		return compIce;
	}

	public void setCompIce(java.math.BigDecimal compIce) {
		this.compIce = compIce;
	}
	
	

	
	
	

}
