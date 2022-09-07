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
public class ListaBanCajaTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "caja_codigo")
	private String cajaCodigo;

	@Column(name = "caja_nombre")
	private String cajaNombre;

	@Column(name = "cta_cuenta_contable")
	private String cajaCuenta;

	public ListaBanCajaTO() {
	}

	public ListaBanCajaTO(String cajaCodigo, String cajaNombre, String cajaCuenta) {
		this.cajaCodigo = cajaCodigo;
		this.cajaNombre = cajaNombre;
		this.cajaCuenta = cajaCuenta;
	}

	public String getCajaCodigo() {
		return cajaCodigo;
	}

	public void setCajaCodigo(String cajaCodigo) {
		this.cajaCodigo = cajaCodigo;
	}

	public String getCajaCuenta() {
		return cajaCuenta;
	}

	public void setCajaCuenta(String cajaCuenta) {
		this.cajaCuenta = cajaCuenta;
	}

	public String getCajaNombre() {
		return cajaNombre;
	}

	public void setCajaNombre(String cajaNombre) {
		this.cajaNombre = cajaNombre;
	}
}
