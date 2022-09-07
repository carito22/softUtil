/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.banco.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class BanComboCuentaTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cta_cuenta_contable")
	private String ctaCuentaContable;

	@Column(name = "cta_cuenta_bancaria")
	private String ctaCuentaBancaria;

	public BanComboCuentaTO() {
	}

	public BanComboCuentaTO(String ctaCuentaContable, String ctaCuentaBancaria) {
		this.ctaCuentaContable = ctaCuentaContable;
		this.ctaCuentaBancaria = ctaCuentaBancaria;
	}

	public String getCtaCuentaBancaria() {
		return ctaCuentaBancaria;
	}

	public void setCtaCuentaBancaria(String ctaCuentaBancaria) {
		this.ctaCuentaBancaria = ctaCuentaBancaria;
	}

	public String getCtaCuentaContable() {
		return ctaCuentaContable;
	}

	public void setCtaCuentaContable(String ctaCuentaContable) {
		this.ctaCuentaContable = ctaCuentaContable;
	}

	@Override
	public String toString() {
		return this.ctaCuentaBancaria;
	}
}
