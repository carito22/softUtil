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
public class RhCtaIessTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cta_aportepersonal")
	private String ctaAportepersonal;

	@Column(name = "emp_fecha_afiliacion_iess")
	private String empFechaAfiliacionIess;

	@Column(name = "emp_fecha_primer_ingreso")
	private String empFechaPrimerIngreso;

	@Column(name = "emp_fecha_primera_salida")
	private String empFechaPrimerSalida;

	@Column(name = "emp_fecha_ultimo_ingreso")
	private String empFechaUltimoIngreso;

	@Column(name = "emp_fecha_ultima_salida")
	private String empFechaUltimoSalida;

	@Column(name = "emp_extension_cobertura_iess")
	private Boolean empExtensionCoberturaIess;

	public RhCtaIessTO() {
	}

	public RhCtaIessTO(String ctaAportepersonal, String empFechaAfiliacionIess, String empFechaPrimerIngreso,
			String empFechaPrimerSalida, String empFechaUltimoIngreso, String empFechaUltimoSalida,
			Boolean empExtensionCoberturaIess) {
		this.ctaAportepersonal = ctaAportepersonal;
		this.empFechaAfiliacionIess = empFechaAfiliacionIess;
		this.empFechaPrimerIngreso = empFechaPrimerIngreso;
		this.empFechaPrimerSalida = empFechaPrimerSalida;
		this.empFechaUltimoIngreso = empFechaUltimoIngreso;
		this.empFechaUltimoSalida = empFechaUltimoSalida;
		this.empExtensionCoberturaIess = empExtensionCoberturaIess;
	}

	public String getCtaAportepersonal() {
		return ctaAportepersonal;
	}

	public void setCtaAportepersonal(String ctaAportepersonal) {
		this.ctaAportepersonal = ctaAportepersonal;
	}

	public Boolean getEmpExtensionCoberturaIess() {
		return empExtensionCoberturaIess;
	}

	public void setEmpExtensionCoberturaIess(Boolean empExtensionCoberturaIess) {
		this.empExtensionCoberturaIess = empExtensionCoberturaIess;
	}

	public String getEmpFechaAfiliacionIess() {
		return empFechaAfiliacionIess;
	}

	public void setEmpFechaAfiliacionIess(String empFechaAfiliacionIess) {
		this.empFechaAfiliacionIess = empFechaAfiliacionIess;
	}

	public String getEmpFechaPrimerIngreso() {
		return empFechaPrimerIngreso;
	}

	public void setEmpFechaPrimerIngreso(String empFechaPrimerIngreso) {
		this.empFechaPrimerIngreso = empFechaPrimerIngreso;
	}

	public String getEmpFechaPrimerSalida() {
		return empFechaPrimerSalida;
	}

	public void setEmpFechaPrimerSalida(String empFechaPrimerSalida) {
		this.empFechaPrimerSalida = empFechaPrimerSalida;
	}

	public String getEmpFechaUltimoIngreso() {
		return empFechaUltimoIngreso;
	}

	public void setEmpFechaUltimoIngreso(String empFechaUltimoIngreso) {
		this.empFechaUltimoIngreso = empFechaUltimoIngreso;
	}

	public String getEmpFechaUltimoSalida() {
		return empFechaUltimoSalida;
	}

	public void setEmpFechaUltimoSalida(String empFechaUltimoSalida) {
		this.empFechaUltimoSalida = empFechaUltimoSalida;
	}
}