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
 * @author Andres Guachisaca
 */
@Entity
public class CarCuentasPorPagarGeneralTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cxpg_codigo")
	private String cxpgCodigo;

	@Column(name = "cxpg_nombre")
	private String cxpgNombre;

	@Column(name = "cxpg_slado")
	private java.math.BigDecimal cxpgSaldo;

	public CarCuentasPorPagarGeneralTO() {
	}

	public CarCuentasPorPagarGeneralTO(String cxpgCodigo, String cxpgNombre, BigDecimal cxpgSaldo) {
		this.cxpgCodigo = cxpgCodigo;
		this.cxpgNombre = cxpgNombre;
		this.cxpgSaldo = cxpgSaldo;
	}

	public String getCxpgCodigo() {
		return cxpgCodigo;
	}

	public void setCxpgCodigo(String cxpgCodigo) {
		this.cxpgCodigo = cxpgCodigo;
	}

	public String getCxpgNombre() {
		return cxpgNombre;
	}

	public void setCxpgNombre(String cxpgNombre) {
		this.cxpgNombre = cxpgNombre;
	}

	public BigDecimal getCxpgSaldo() {
		return cxpgSaldo;
	}

	public void setCxpgSaldo(BigDecimal cxpgSaldo) {
		this.cxpgSaldo = cxpgSaldo;
	}
}
