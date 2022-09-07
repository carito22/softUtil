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
public class CarPagosDetalleAnticiposTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private BigDecimal detValor;
	private String detObservaciones;

	@Column(name = "ant_empresa")
	private String antEmpresa;

	@Column(name = "ant_periodo")
	private String antPeriodo;

	@Column(name = "ant_tipo")
	private String antTipo;

	@Column(name = "ant_numero")
	private String antNumero;

	@Column(name = "ant_sector")
	private String antSector;

	public CarPagosDetalleAnticiposTO() {
	}

	public CarPagosDetalleAnticiposTO(BigDecimal detValor, String detObservaciones, String antEmpresa,
			String antPeriodo, String antTipo, String antNumero, String antSector) {
		this.detValor = detValor;
		this.detObservaciones = detObservaciones;
		this.antEmpresa = antEmpresa;
		this.antPeriodo = antPeriodo;
		this.antTipo = antTipo;
		this.antNumero = antNumero;
		this.antSector = antSector;
	}

	public String getAntEmpresa() {
		return antEmpresa;
	}

	public void setAntEmpresa(String antEmpresa) {
		this.antEmpresa = antEmpresa;
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

	public String getAntSector() {
		return antSector;
	}

	public void setAntSector(String antSector) {
		this.antSector = antSector;
	}

	public String getAntTipo() {
		return antTipo;
	}

	public void setAntTipo(String antTipo) {
		this.antTipo = antTipo;
	}

	public String getDetObservaciones() {
		return detObservaciones;
	}

	public void setDetObservaciones(String detObservaciones) {
		this.detObservaciones = detObservaciones;
	}

	public BigDecimal getDetValor() {
		return detValor;
	}

	public void setDetValor(BigDecimal detValor) {
		this.detValor = detValor;
	}

}