/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

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
public class CarListaPagosDetalleFormaTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "fp_forma")
	private String fpForma;

	@Column(name = "fp_referencia")
	private String fpReferencia;

	@Column(name = "fp_valor")
	private BigDecimal fpValor;

	@Column(name = "fp_observaciones")
	private String fpObservaciones;

	public CarListaPagosDetalleFormaTO() {
	}

	public CarListaPagosDetalleFormaTO(String fpForma, String fpReferencia, BigDecimal fpValor,
			String fpObservaciones) {
		this.fpForma = fpForma;
		this.fpReferencia = fpReferencia;
		this.fpValor = fpValor;
		this.fpObservaciones = fpObservaciones;
	}

	public String getFpForma() {
		return fpForma;
	}

	public void setFpForma(String fpForma) {
		this.fpForma = fpForma;
	}

	public String getFpObservaciones() {
		return fpObservaciones;
	}

	public void setFpObservaciones(String fpObservaciones) {
		this.fpObservaciones = fpObservaciones;
	}

	public String getFpReferencia() {
		return fpReferencia;
	}

	public void setFpReferencia(String fpReferencia) {
		this.fpReferencia = fpReferencia;
	}

	public BigDecimal getFpValor() {
		return fpValor;
	}

	public void setFpValor(BigDecimal fpValor) {
		this.fpValor = fpValor;
	}

}