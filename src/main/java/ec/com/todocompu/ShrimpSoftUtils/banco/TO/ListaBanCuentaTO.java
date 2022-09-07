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
public class ListaBanCuentaTO implements java.io.Serializable {
	/**
	 * 
	 */
	// private Integer cuenSecuencia;
	// private String banCodigo;
	private static final long serialVersionUID = 1L;
	@Id
	private Integer id;
	
	@Column(name = "ban_codigo")
	private String banBanco;

	@Column(name = "cta_numero")
	private String ctaNumero;

	@Column(name = "cta_titular")
	private String ctaTitular;

	@Column(name = "cta_oficial")
	private String ctaOficial;

	@Column(name = "cta_formato_cheque")
	private String ctaFormatoCheque;

	@Column(name = "cta_cuenta_contable")
	private String ctaCuentaContable;

	@Column(name = "cta_codigo_bancario")
	private String ctaCodigoBancario;

	@Column(name = "cta_prefijo_bancario")
	private String ctaPrefijoBancario;
        
	@Column(name = "cta_numeracion")
	private String ctaNumeracion;

	public ListaBanCuentaTO() {
	}

	public ListaBanCuentaTO(String banBanco, String ctaNumero, String ctaTitular, String ctaOficial,
			String ctaFormatoCheque, String ctaCuentaContable, String ctaCodigoBancario, String ctaPrefijoBancario) {
		this.banBanco = banBanco;
		this.ctaNumero = ctaNumero;
		this.ctaTitular = ctaTitular;
		this.ctaOficial = ctaOficial;
		this.ctaFormatoCheque = ctaFormatoCheque;
		this.ctaCuentaContable = ctaCuentaContable;
		this.ctaCodigoBancario = ctaCodigoBancario;
		this.ctaPrefijoBancario = ctaPrefijoBancario;
	}
	
	public ListaBanCuentaTO(String banBanco, String ctaNumero, String ctaTitular, String ctaOficial,
			String ctaFormatoCheque, String ctaCuentaContable, String ctaCodigoBancario, String ctaPrefijoBancario, Integer id) {
		this.banBanco = banBanco;
		this.ctaNumero = ctaNumero;
		this.ctaTitular = ctaTitular;
		this.ctaOficial = ctaOficial;
		this.ctaFormatoCheque = ctaFormatoCheque;
		this.ctaCuentaContable = ctaCuentaContable;
		this.ctaCodigoBancario = ctaCodigoBancario;
		this.ctaPrefijoBancario = ctaPrefijoBancario;
		this.id = id;
	}
	
	

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBanBanco() {
		return banBanco;
	}

	public void setBanBanco(String banBanco) {
		this.banBanco = banBanco;
	}

	public String getCtaCodigoBancario() {
		return ctaCodigoBancario;
	}

	public void setCtaCodigoBancario(String ctaCodigoBancario) {
		this.ctaCodigoBancario = ctaCodigoBancario;
	}

	public String getCtaCuentaContable() {
		return ctaCuentaContable;
	}

	public void setCtaCuentaContable(String ctaCuentaContable) {
		this.ctaCuentaContable = ctaCuentaContable;
	}

	public String getCtaFormatoCheque() {
		return ctaFormatoCheque;
	}

	public void setCtaFormatoCheque(String ctaFormatoCheque) {
		this.ctaFormatoCheque = ctaFormatoCheque;
	}

	public String getCtaNumero() {
		return ctaNumero;
	}

	public void setCtaNumero(String ctaNumero) {
		this.ctaNumero = ctaNumero;
	}

	public String getCtaOficial() {
		return ctaOficial;
	}

	public void setCtaOficial(String ctaOficial) {
		this.ctaOficial = ctaOficial;
	}

	public String getCtaPrefijoBancario() {
		return ctaPrefijoBancario;
	}

	public void setCtaPrefijoBancario(String ctaPrefijoBancario) {
		this.ctaPrefijoBancario = ctaPrefijoBancario;
	}

	public String getCtaTitular() {
		return ctaTitular;
	}

	public void setCtaTitular(String ctaTitular) {
		this.ctaTitular = ctaTitular;
	}

        public String getCtaNumeracion() {
            return ctaNumeracion;
        }

        public void setCtaNumeracion(String ctaNumeracion) {
            this.ctaNumeracion = ctaNumeracion;
        }

	@Override
	public String toString() {
		return this.banBanco + " " + this.ctaNumero + " " + this.ctaTitular + " " + this.ctaOficial + " "
				+ this.ctaFormatoCheque + " " + this.ctaCuentaContable + " " + this.ctaCodigoBancario + " "
				+ this.ctaPrefijoBancario;
	}
}
