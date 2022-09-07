/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class RhBonoTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "emp_empresa")
	private String empEmpresa;

	@Id
	@Column(name = "bono_secuencial")
	private Integer bonoSecuencial;

	@Column(name = "bono_concepto")
	private String bonoConcepto;

	@Column(name = "bono_cantidad")
	private Integer bonoCantidad;

	@Column(name = "bono_precio")
	private BigDecimal bonoPrecio;

	@Column(name = "bono_valor")
	private BigDecimal bonoValor;

	@Column(name = "bono_deducible")
	private Boolean bonoDeducible;

	@Column(name = "bono_observacion")
	private String bonoObservacion;

	@Column(name = "bono_reversado")
	private Boolean reversar;

	@Column(name = "emp_id")
	private String empId;

	@Column(name = "sec_codigo")
	private String secCodigo;

	@Column(name = "pis_numero")
	private String pisNumero;

	public RhBonoTO() {
	}

	public RhBonoTO(String empEmpresa, Integer bonoSecuencial, String bonoConcepto, Integer bonoCantidad,
			BigDecimal bonoPrecio, BigDecimal bonoValor, Boolean bonoDeducible, String bonoObservacion,
			Boolean reversar, String empId, String secCodigo, String pisNumero) {
		super();
		this.empEmpresa = empEmpresa;
		this.bonoSecuencial = bonoSecuencial;
		this.bonoConcepto = bonoConcepto;
		this.bonoCantidad = bonoCantidad;
		this.bonoPrecio = bonoPrecio;
		this.bonoValor = bonoValor;
		this.bonoDeducible = bonoDeducible;
		this.bonoObservacion = bonoObservacion;
		this.reversar = reversar;
		this.empId = empId;
		this.secCodigo = secCodigo;
		this.pisNumero = pisNumero;
	}

	public String getEmpEmpresa() {
		return empEmpresa;
	}

	public void setEmpEmpresa(String empEmpresa) {
		this.empEmpresa = empEmpresa;
	}

	public Integer getBonoSecuencial() {
		return bonoSecuencial;
	}

	public void setBonoSecuencial(Integer bonoSecuencial) {
		this.bonoSecuencial = bonoSecuencial;
	}

	public String getBonoConcepto() {
		return bonoConcepto;
	}

	public void setBonoConcepto(String bonoConcepto) {
		this.bonoConcepto = bonoConcepto;
	}

	public Integer getBonoCantidad() {
		return bonoCantidad;
	}

	public void setBonoCantidad(Integer bonoCantidad) {
		this.bonoCantidad = bonoCantidad;
	}

	public BigDecimal getBonoPrecio() {
		return bonoPrecio;
	}

	public void setBonoPrecio(BigDecimal bonoPrecio) {
		this.bonoPrecio = bonoPrecio;
	}

	public BigDecimal getBonoValor() {
		return bonoValor;
	}

	public void setBonoValor(BigDecimal bonoValor) {
		this.bonoValor = bonoValor;
	}

	public Boolean getBonoDeducible() {
		return bonoDeducible;
	}

	public void setBonoDeducible(Boolean bonoDeducible) {
		this.bonoDeducible = bonoDeducible;
	}

	public String getBonoObservacion() {
		return bonoObservacion;
	}

	public void setBonoObservacion(String bonoObservacion) {
		this.bonoObservacion = bonoObservacion;
	}

	public Boolean getReversar() {
		return reversar;
	}

	public void setReversar(Boolean reversar) {
		this.reversar = reversar;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	public String getPisNumero() {
		return pisNumero;
	}

	public void setPisNumero(String pisNumero) {
		this.pisNumero = pisNumero;
	}

}