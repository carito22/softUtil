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
public class ListaBanChequesNumeracionTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "chq_secuencial")
	private Integer banSecuencial;

	@Column(name = "chq_desde")
	private Integer banDesde;

	@Column(name = "chq_hasta")
	private Integer banHasta;

	@Column(name = "cta_empresa")
	private String banCtaEmpresa;

	@Column(name = "cta_cuenta_contable")
	private String banCtaContable;

	public ListaBanChequesNumeracionTO() {
	}

	public ListaBanChequesNumeracionTO(Integer banSecuencial, Integer banDesde, Integer banHasta, String banCtaEmpresa,
			String banCtaContable) {
		this.banSecuencial = banSecuencial;
		this.banDesde = banDesde;
		this.banHasta = banHasta;
		this.banCtaEmpresa = banCtaEmpresa;
		this.banCtaContable = banCtaContable;
	}

	public String getBanCtaContable() {
		return banCtaContable;
	}

	public void setBanCtaContable(String banCtaContable) {
		this.banCtaContable = banCtaContable;
	}

	public String getBanCtaEmpresa() {
		return banCtaEmpresa;
	}

	public void setBanCtaEmpresa(String banCtaEmpresa) {
		this.banCtaEmpresa = banCtaEmpresa;
	}

	public Integer getBanDesde() {
		return banDesde;
	}

	public void setBanDesde(Integer banDesde) {
		this.banDesde = banDesde;
	}

	public Integer getBanHasta() {
		return banHasta;
	}

	public void setBanHasta(Integer banHasta) {
		this.banHasta = banHasta;
	}

	public Integer getBanSecuencial() {
		return banSecuencial;
	}

	public void setBanSecuencial(Integer banSecuencial) {
		this.banSecuencial = banSecuencial;
	}
}
