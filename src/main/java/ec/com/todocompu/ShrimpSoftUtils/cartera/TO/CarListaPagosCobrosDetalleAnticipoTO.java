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
public class CarListaPagosCobrosDetalleAnticipoTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "ant_periodo")
	private String antPeriodo;

	@Column(name = "ant_tipo")
	private String antTipo;

	@Column(name = "ant_numero")
	private String antNumero;

	@Column(name = "ant_fecha")
	private String antFecha;

	// @Column(name = "valor")
	private BigDecimal valor;

	public CarListaPagosCobrosDetalleAnticipoTO() {
	}



	public CarListaPagosCobrosDetalleAnticipoTO(String id, String antPeriodo, String antTipo, String antNumero,
			String antFecha, BigDecimal valor) {
		
		this.id = id;
		this.antPeriodo = antPeriodo;
		this.antTipo = antTipo;
		this.antNumero = antNumero;
		this.antFecha = antFecha;
		this.valor = valor;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getAntFecha() {
		return antFecha;
	}

	public void setAntFecha(String antFecha) {
		this.antFecha = antFecha;
	}

	public String getAntNumero() {
		return antNumero;
	}

	public void setAntNumero(String antNumero) {
		this.antNumero = antNumero;
	}

	public String getAntPeriodo() {
		return antPeriodo;
	}

	public void setAntPeriodo(String antPeriodo) {
		this.antPeriodo = antPeriodo;
	}

	public String getAntTipo() {
		return antTipo;
	}

	public void setAntTipo(String antTipo) {
		this.antTipo = antTipo;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}