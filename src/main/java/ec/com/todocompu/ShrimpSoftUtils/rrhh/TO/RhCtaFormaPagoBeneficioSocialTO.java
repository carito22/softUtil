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
public class RhCtaFormaPagoBeneficioSocialTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cta_codigo")
	private String ctaCodigo;

	@Column(name = "sec_codigo")
	private String secCodigo;

	@Column(name = "fp_codigo_ministerial")
	private String fpCodigoMinisterial;

	public RhCtaFormaPagoBeneficioSocialTO() {
	}

	public RhCtaFormaPagoBeneficioSocialTO(String ctaCodigo, String secCodigo, String fpCodigoMinisterial) {
		this.ctaCodigo = ctaCodigo;
		this.secCodigo = secCodigo;
		this.fpCodigoMinisterial = fpCodigoMinisterial;
	}

	public String getCtaCodigo() {
		return ctaCodigo;
	}

	public void setCtaCodigo(String ctaCodigo) {
		this.ctaCodigo = ctaCodigo;
	}

	public String getFpCodigoMinisterial() {
		return fpCodigoMinisterial;
	}

	public void setFpCodigoMinisterial(String fpCodigoMinisterial) {
		this.fpCodigoMinisterial = fpCodigoMinisterial;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}
}
