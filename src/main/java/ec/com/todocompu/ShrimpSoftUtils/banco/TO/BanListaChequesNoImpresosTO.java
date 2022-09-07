/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.banco.TO;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */

@Entity
public class BanListaChequesNoImpresosTO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "chq_secuencia")
	private Integer chqSecuencia;

	@Column(name = "chq_cuenta_codigo")
	private String chqCuentaCodigo;

	@Column(name = "chq_cuenta_detalle")
	private String chqCuentaDetalle;

	@Column(name = "chq_beneficiario")
	private String chqBeneficiario;

	@Column(name = "chq_numero")
	private String chqNumero;

	@Column(name = "chq_valor")
	private java.math.BigDecimal chqValor;

	@Column(name = "chq_fecha_emision")
	private String chqFechaEmision;

	@Column(name = "chq_fecha_vencimiento")
	private String chqFechaVencimiento;

	@Column(name = "chq_contable_periodo")
	private String chqContablePeriodo;

	@Column(name = "chq_contable_tipo")
	private String chqContableTipo;

	@Column(name = "chq_contable_numero")
	private String chqContableNumero;

	@Column(name = "chq_contable_referencia")
	private String chqContableReferencia;

	@Column(name = "chq_orden")
	private Integer chqOrden;

	public BanListaChequesNoImpresosTO() {
	}

	public BanListaChequesNoImpresosTO(String chqCuentaCodigo, String chqCuentaDetalle, String chqBeneficiario,
			String chqNumero, BigDecimal chqValor, String chqFechaEmision, String chqFechaVencimiento,
			String chqContablePeriodo, String chqContableTipo, String chqContableNumero, Integer chqSecuencia,
			Integer chqOrden, Integer id) {
		this.chqCuentaCodigo = chqCuentaCodigo;
		this.chqCuentaDetalle = chqCuentaDetalle;
		this.chqBeneficiario = chqBeneficiario;
		this.chqNumero = chqNumero;
		this.chqValor = chqValor;
		this.chqFechaEmision = chqFechaEmision;
		this.chqFechaVencimiento = chqFechaVencimiento;
		this.chqContablePeriodo = chqContablePeriodo;
		this.chqContableTipo = chqContableTipo;
		this.chqContableNumero = chqContableNumero;
		this.chqContableReferencia = chqContableReferencia;
		this.chqSecuencia = chqSecuencia;
		this.chqOrden = chqOrden;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getChqBeneficiario() {
		return chqBeneficiario;
	}

	public void setChqBeneficiario(String chqBeneficiario) {
		this.chqBeneficiario = chqBeneficiario;
	}

	public String getChqContableNumero() {
		return chqContableNumero;
	}

	public void setChqContableNumero(String chqContableNumero) {
		this.chqContableNumero = chqContableNumero;
	}

	public String getChqContablePeriodo() {
		return chqContablePeriodo;
	}

	public void setChqContablePeriodo(String chqContablePeriodo) {
		this.chqContablePeriodo = chqContablePeriodo;
	}

	public String getChqContableTipo() {
		return chqContableTipo;
	}

	public void setChqContableTipo(String chqContableTipo) {
		this.chqContableTipo = chqContableTipo;
	}

	public String getChqCuentaCodigo() {
		return chqCuentaCodigo;
	}

	public void setChqCuentaCodigo(String chqCuentaCodigo) {
		this.chqCuentaCodigo = chqCuentaCodigo;
	}

	public String getChqCuentaDetalle() {
		return chqCuentaDetalle;
	}

	public void setChqCuentaDetalle(String chqCuentaDetalle) {
		this.chqCuentaDetalle = chqCuentaDetalle;
	}

	public String getChqFechaEmision() {
		return chqFechaEmision;
	}

	public void setChqFechaEmision(String chqFechaEmision) {
		this.chqFechaEmision = chqFechaEmision;
	}

	public String getChqFechaVencimiento() {
		return chqFechaVencimiento;
	}

	public void setChqFechaVencimiento(String chqFechaVencimiento) {
		this.chqFechaVencimiento = chqFechaVencimiento;
	}

	public String getChqNumero() {
		return chqNumero;
	}

	public void setChqNumero(String chqNumero) {
		this.chqNumero = chqNumero;
	}

        public String getChqContableReferencia() {
            return chqContableReferencia;
        }

        public void setChqContableReferencia(String chqContableReferencia) {
            this.chqContableReferencia = chqContableReferencia;
        }

        public Integer getChqOrden() {
		return chqOrden;
	}

	public void setChqOrden(Integer chqOrden) {
		this.chqOrden = chqOrden;
	}

	public Integer getChqSecuencia() {
		return chqSecuencia;
	}

	public void setChqSecuencia(Integer chqSecuencia) {
		this.chqSecuencia = chqSecuencia;
	}

	public BigDecimal getChqValor() {
		return chqValor;
	}

	public void setChqValor(BigDecimal chqValor) {
		this.chqValor = chqValor;
	}

	// @Override
	// public String toString(){
	// return this.perCodigo + " " + this.tipCodigo + " " + this.conNumero + " "
	// +
	// this.conFechaEmision + " " + this.conConcepto + " " +
	// this.detSecuencia + " " + this.ctaCodigo + " " + this.detDocumento + " "
	// + this.detValor;
	// }
}
