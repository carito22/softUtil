/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class ConBalanceResultadoCierreTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "br_cuenta")
	private String bgCuenta;
	@Column(name = "br_debito_credito")
	private Character bgCredito;
	@Column(name = "br_saldo")
	private java.math.BigDecimal bgSaldo;
	@Column(name = "br_secuencial")
	private Integer bgSecuencial;

	public ConBalanceResultadoCierreTO() {
	}

	public ConBalanceResultadoCierreTO(String bgCuenta, Character bgCredito, BigDecimal bgSaldo, Integer bgSecuencial) {
		this.bgCuenta = bgCuenta;
		this.bgCredito = bgCredito;
		this.bgSaldo = bgSaldo;
		this.bgSecuencial = bgSecuencial;
	}

	public String getBgCuenta() {
		return bgCuenta;
	}

	public void setBgCuenta(String bgCuenta) {
		this.bgCuenta = bgCuenta;
	}

	public Character getBgCredito() {
		return bgCredito;
	}

	public void setBgCredito(Character bgCredito) {
		this.bgCredito = bgCredito;
	}

	public BigDecimal getBgSaldo() {
		return bgSaldo;
	}

	public void setBgSaldo(BigDecimal bgSaldo) {
		this.bgSaldo = bgSaldo;
	}

	public Integer getBgSecuencial() {
		return bgSecuencial;
	}

	public void setBgSecuencial(Integer bgSecuencial) {
		this.bgSecuencial = bgSecuencial;
	}

}
