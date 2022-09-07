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
public class RhCategoriaProvisionesTO implements Serializable {
	// CUENTAS PROVISIONES POR PAGAR
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cat_nombre")
	private String catNombre;
	
	@Column(name = "cta_aportepatronal")
	private String ctaAportepatronal;

	@Column(name = "cta_iece")
	private String ctaIece;

	@Column(name = "cta_secap")
	private String ctaSecap;

	@Column(name = "cta_xiii")
	private String ctaXiii;

	@Column(name = "cta_xiv")
	private String ctaXiv;

	@Column(name = "cta_fondoreserva")
	private String ctaFondoreserva;

	@Column(name = "cta_vacaciones")
	private String ctaVacaciones;

	@Column(name = "cta_desahucio")
	private String ctaDesahucio;

	// CUENTAS GASTO PROVISIONES
	@Column(name = "cta_gasto_aportepatronal")
	private String ctaGastoAportepatronal;

	@Column(name = "cta_gasto_iece")
	private String ctaGastoIece;

	@Column(name = "cta_gasto_secap")
	private String ctaGastoSecap;

	@Column(name = "cta_gasto_xiii")
	private String ctaGastoXiii;

	@Column(name = "cta_gasto_xiv")
	private String ctaGastoXiv;

	@Column(name = "cta_gasto_fondoreserva")
	private String ctaGastoFondoreserva;

	@Column(name = "cta_gasto_vacaciones")
	private String ctaGastoVacaciones;

	@Column(name = "cta_gasto_desahucio")
	private String ctaGastoDesahucio;

	public RhCategoriaProvisionesTO() {
	}



	public RhCategoriaProvisionesTO(String catNombre, String ctaAportepatronal, String ctaIece, String ctaSecap,
			String ctaXiii, String ctaXiv, String ctaFondoreserva, String ctaVacaciones, String ctaDesahucio,
			String ctaGastoAportepatronal, String ctaGastoIece, String ctaGastoSecap, String ctaGastoXiii,
			String ctaGastoXiv, String ctaGastoFondoreserva, String ctaGastoVacaciones, String ctaGastoDesahucio) {
	
		this.catNombre = catNombre;
		this.ctaAportepatronal = ctaAportepatronal;
		this.ctaIece = ctaIece;
		this.ctaSecap = ctaSecap;
		this.ctaXiii = ctaXiii;
		this.ctaXiv = ctaXiv;
		this.ctaFondoreserva = ctaFondoreserva;
		this.ctaVacaciones = ctaVacaciones;
		this.ctaDesahucio = ctaDesahucio;
		this.ctaGastoAportepatronal = ctaGastoAportepatronal;
		this.ctaGastoIece = ctaGastoIece;
		this.ctaGastoSecap = ctaGastoSecap;
		this.ctaGastoXiii = ctaGastoXiii;
		this.ctaGastoXiv = ctaGastoXiv;
		this.ctaGastoFondoreserva = ctaGastoFondoreserva;
		this.ctaGastoVacaciones = ctaGastoVacaciones;
		this.ctaGastoDesahucio = ctaGastoDesahucio;
	}



	public String getCatNombre() {
		return catNombre;
	}



	public void setCatNombre(String catNombre) {
		this.catNombre = catNombre;
	}



	public String getCtaAportepatronal() {
		return ctaAportepatronal;
	}

	public void setCtaAportepatronal(String ctaAportepatronal) {
		this.ctaAportepatronal = ctaAportepatronal;
	}

	public String getCtaDesahucio() {
		return ctaDesahucio;
	}

	public void setCtaDesahucio(String ctaDesahucio) {
		this.ctaDesahucio = ctaDesahucio;
	}

	public String getCtaFondoreserva() {
		return ctaFondoreserva;
	}

	public void setCtaFondoreserva(String ctaFondoreserva) {
		this.ctaFondoreserva = ctaFondoreserva;
	}

	public String getCtaGastoAportepatronal() {
		return ctaGastoAportepatronal;
	}

	public void setCtaGastoAportepatronal(String ctaGastoAportepatronal) {
		this.ctaGastoAportepatronal = ctaGastoAportepatronal;
	}

	public String getCtaGastoDesahucio() {
		return ctaGastoDesahucio;
	}

	public void setCtaGastoDesahucio(String ctaGastoDesahucio) {
		this.ctaGastoDesahucio = ctaGastoDesahucio;
	}

	public String getCtaGastoFondoreserva() {
		return ctaGastoFondoreserva;
	}

	public void setCtaGastoFondoreserva(String ctaGastoFondoreserva) {
		this.ctaGastoFondoreserva = ctaGastoFondoreserva;
	}

	public String getCtaGastoIece() {
		return ctaGastoIece;
	}

	public void setCtaGastoIece(String ctaGastoIece) {
		this.ctaGastoIece = ctaGastoIece;
	}

	public String getCtaGastoSecap() {
		return ctaGastoSecap;
	}

	public void setCtaGastoSecap(String ctaGastoSecap) {
		this.ctaGastoSecap = ctaGastoSecap;
	}

	public String getCtaGastoVacaciones() {
		return ctaGastoVacaciones;
	}

	public void setCtaGastoVacaciones(String ctaGastoVacaciones) {
		this.ctaGastoVacaciones = ctaGastoVacaciones;
	}

	public String getCtaGastoXiii() {
		return ctaGastoXiii;
	}

	public void setCtaGastoXiii(String ctaGastoXiii) {
		this.ctaGastoXiii = ctaGastoXiii;
	}

	public String getCtaGastoXiv() {
		return ctaGastoXiv;
	}

	public void setCtaGastoXiv(String ctaGastoXiv) {
		this.ctaGastoXiv = ctaGastoXiv;
	}

	public String getCtaIece() {
		return ctaIece;
	}

	public void setCtaIece(String ctaIece) {
		this.ctaIece = ctaIece;
	}

	public String getCtaSecap() {
		return ctaSecap;
	}

	public void setCtaSecap(String ctaSecap) {
		this.ctaSecap = ctaSecap;
	}

	public String getCtaVacaciones() {
		return ctaVacaciones;
	}

	public void setCtaVacaciones(String ctaVacaciones) {
		this.ctaVacaciones = ctaVacaciones;
	}

	public String getCtaXiii() {
		return ctaXiii;
	}

	public void setCtaXiii(String ctaXiii) {
		this.ctaXiii = ctaXiii;
	}

	public String getCtaXiv() {
		return ctaXiv;
	}

	public void setCtaXiv(String ctaXiv) {
		this.ctaXiv = ctaXiv;
	}
}