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
public class InvComboBodegaTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "bod_codigo")
	private String bodCodigo;

	@Column(name = "bod_nombre")
	private String bodNombre;

	@Column(name = "sec_codigo")
	private String secCodigo;

	public InvComboBodegaTO() {
	}

	public InvComboBodegaTO(String bodCodigo, String bodNombre) {
		this.bodCodigo = bodCodigo;
		this.bodNombre = bodNombre;
	}

	public String getBodCodigo() {
		return bodCodigo;
	}

	public void setBodCodigo(String bodCodigo) {
		this.bodCodigo = bodCodigo;
	}

	public String getBodNombre() {
		return bodNombre;
	}

	public void setBodNombre(String bodNombre) {
		this.bodNombre = bodNombre;
	}

	@Override
	public String toString() {
		return this.bodCodigo + " | " + this.bodNombre;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	public InvComboBodegaTO(String bodCodigo, String bodNombre, String secCodigo) {
		this.bodCodigo = bodCodigo;
		this.bodNombre = bodNombre;
		this.secCodigo = secCodigo;
	}

}
