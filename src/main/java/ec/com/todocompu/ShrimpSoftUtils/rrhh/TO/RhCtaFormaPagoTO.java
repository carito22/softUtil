/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class RhCtaFormaPagoTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cta_codigo")
	private String ctaCodigo;

	@Column(name = "sec_codigo")
	private String secCodigo;

	public RhCtaFormaPagoTO() {
	}

	public RhCtaFormaPagoTO(String ctaCodigo, String secCodigo) {
		this.ctaCodigo = ctaCodigo;
		this.secCodigo = secCodigo;
	}

	public String getCtaCodigo() {
		return ctaCodigo;
	}

	public void setCtaCodigo(String ctaCodigo) {
		this.ctaCodigo = ctaCodigo;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

}
