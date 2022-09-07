/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author javier tj
 */
@Entity
public class AnxCompraFormaPagoTO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "det_secuencial")
	private Integer detSecuencial;

	@Column(name = "fp_codigo")
	private String fpCodigo;

	@Column(name = "comp_empresa")
	private String compEmpresa;

	@Column(name = "comp_periodo")
	private String compPeriodo;

	@Column(name = "comp_motivo")
	private String compMotivo;

	@Column(name = "comp_numero")
	private String compNumero;

	public AnxCompraFormaPagoTO() {
	}

	public AnxCompraFormaPagoTO(Integer detSecuencial, String fpCodigo, String compEmpresa, String compPeriodo,
			String compMotivo, String compNumero) {
		this.detSecuencial = detSecuencial;
		this.fpCodigo = fpCodigo;
		this.compEmpresa = compEmpresa;
		this.compPeriodo = compPeriodo;
		this.compMotivo = compMotivo;
		this.compNumero = compNumero;
	}

	public String getCompEmpresa() {
		return compEmpresa;
	}

	public void setCompEmpresa(String compEmpresa) {
		this.compEmpresa = compEmpresa;
	}

	public String getCompMotivo() {
		return compMotivo;
	}

	public void setCompMotivo(String compMotivo) {
		this.compMotivo = compMotivo;
	}

	public String getCompNumero() {
		return compNumero;
	}

	public void setCompNumero(String compNumero) {
		this.compNumero = compNumero;
	}

	public String getCompPeriodo() {
		return compPeriodo;
	}

	public void setCompPeriodo(String compPeriodo) {
		this.compPeriodo = compPeriodo;
	}

	public Integer getDetSecuencial() {
		return detSecuencial;
	}

	public void setDetSecuencial(Integer detSecuencial) {
		this.detSecuencial = detSecuencial;
	}

	public String getFpCodigo() {
		return fpCodigo;
	}

	public void setFpCodigo(String fpCodigo) {
		this.fpCodigo = fpCodigo;
	}

}
