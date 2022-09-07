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
public class ConsultaDatosBancoCuentaTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cta_numero")
	private String ctaNumero;

	@Column(name = "cta_titular")
	private String ctaTitular;

	@Column(name = "ban_nombre")
	private String banNombre;

	// Aqui podria dar error...
	@Column(name = "cta_formato_cheque") // cta_formato_cheque
	private String rutaBanco;

	public ConsultaDatosBancoCuentaTO() {
	}

	public ConsultaDatosBancoCuentaTO(String ctaNumero, String ctaTitular, String banNombre, String rutaBanco) {
		this.ctaNumero = ctaNumero;
		this.ctaTitular = ctaTitular;
		this.banNombre = banNombre;
		this.rutaBanco = rutaBanco;
	}

	public String getBanNombre() {
		return banNombre;
	}

	public void setBanNombre(String banNombre) {
		this.banNombre = banNombre;
	}

	public String getCtaNumero() {
		return ctaNumero;
	}

	public void setCtaNumero(String ctaNumero) {
		this.ctaNumero = ctaNumero;
	}

	public String getCtaTitular() {
		return ctaTitular;
	}

	public void setCtaTitular(String ctaTitular) {
		this.ctaTitular = ctaTitular;
	}

	public String getRutaBanco() {
		return rutaBanco;
	}

	public void setRutaBanco(String rutaBanco) {
		this.rutaBanco = rutaBanco;
	}

	@Override
	public String toString() {
		return this.ctaNumero + " " + this.ctaTitular + " " + this.banNombre + " " + this.rutaBanco;
	}
}
