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
public class ConBalanceComprobacionTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "bc_id")
	private Integer id;
	@Column(name = "bc_cuenta")
	private String bcCuenta;
	@Column(name = "bc_detalle")
	private String bcDetalle;
	@Column(name = "bc_saldo_anterior")
	private java.math.BigDecimal bcSaldoAnterior;
	@Column(name = "bc_total_debitos")
	private java.math.BigDecimal bcTotalDebito;
	@Column(name = "bc_total_creditos")
	private java.math.BigDecimal bcTotalCredito;
	@Column(name = "bc_saldo_final")
	private java.math.BigDecimal bcSaldoFinal;

	public ConBalanceComprobacionTO() {
	}

	public ConBalanceComprobacionTO(String bcCuenta, String bcDetalle, BigDecimal bcSaldoAnterior,
			BigDecimal bcTotalDebito, BigDecimal bcTotalCredito, BigDecimal bcSaldoFinal, Integer id) {
		this.bcCuenta = bcCuenta;
		this.bcDetalle = bcDetalle;
		this.bcSaldoAnterior = bcSaldoAnterior;
		this.bcTotalDebito = bcTotalDebito;
		this.bcTotalCredito = bcTotalCredito;
		this.bcSaldoFinal = bcSaldoFinal;
		this.id = id;
	}

	public String getBcCuenta() {
		return bcCuenta;
	}

	public void setBcCuenta(String bcCuenta) {
		this.bcCuenta = bcCuenta;
	}

	public String getBcDetalle() {
		return bcDetalle;
	}

	public void setBcDetalle(String bcDetalle) {
		this.bcDetalle = bcDetalle;
	}

	public BigDecimal getBcSaldoAnterior() {
		return bcSaldoAnterior;
	}

	public void setBcSaldoAnterior(BigDecimal bcSaldoAnterior) {
		this.bcSaldoAnterior = bcSaldoAnterior;
	}

	public BigDecimal getBcSaldoFinal() {
		return bcSaldoFinal;
	}

	public void setBcSaldoFinal(BigDecimal bcSaldoFinal) {
		this.bcSaldoFinal = bcSaldoFinal;
	}

	public BigDecimal getBcTotalCredito() {
		return bcTotalCredito;
	}

	public void setBcTotalCredito(BigDecimal bcTotalCredito) {
		this.bcTotalCredito = bcTotalCredito;
	}

	public BigDecimal getBcTotalDebito() {
		return bcTotalDebito;
	}

	public void setBcTotalDebito(BigDecimal bcTotalDebito) {
		this.bcTotalDebito = bcTotalDebito;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
