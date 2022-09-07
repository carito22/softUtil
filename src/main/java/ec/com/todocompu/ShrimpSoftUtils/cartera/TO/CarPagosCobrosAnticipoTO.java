/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author misayo
 */
@Entity
public class CarPagosCobrosAnticipoTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ant_valor")
	private java.math.BigDecimal antValor;
	@Column(name = "fp_secuencial")
	private Integer fpSecuencial;
	@Column(name = "sec_codigo")
	private String secCodigo;

	public CarPagosCobrosAnticipoTO() {
	}

	public CarPagosCobrosAnticipoTO(BigDecimal antValor, Integer fpSecuencial, String secCodigo) {
		this.antValor = antValor;
		this.fpSecuencial = fpSecuencial;
		this.secCodigo = secCodigo;
	}

	public BigDecimal getAntValor() {
		return antValor;
	}

	public void setAntValor(BigDecimal antValor) {
		this.antValor = antValor;
	}

	public Integer getFpSecuencial() {
		return fpSecuencial;
	}

	public void setFpSecuencial(Integer fpSecuencial) {
		this.fpSecuencial = fpSecuencial;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

}
