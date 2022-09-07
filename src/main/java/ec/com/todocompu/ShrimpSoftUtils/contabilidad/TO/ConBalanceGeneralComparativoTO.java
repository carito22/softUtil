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
public class ConBalanceGeneralComparativoTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "bg_id")
	private Integer id;
	@Column(name = "bg_cuenta")
	private String bgCuenta;
	@Column(name = "bg_detalle")
	private String bgDetalle;
	@Column(name = "bg_saldo_anterior")
	private java.math.BigDecimal bgSaldoAnterior;
	@Column(name = "bg_saldo_actual")
	private java.math.BigDecimal bgSaldoActual;

	public ConBalanceGeneralComparativoTO() {
	}

	public ConBalanceGeneralComparativoTO(String bgCuenta, String bgDetalle, BigDecimal bgSaldoAnterior,
			BigDecimal bgSaldoActual, Integer id) {
		this.bgCuenta = bgCuenta;
		this.bgDetalle = bgDetalle;
		this.bgSaldoAnterior = bgSaldoAnterior;
		this.bgSaldoActual = bgSaldoActual;
		this.id = id;
	}

	public String getBgCuenta() {
		return bgCuenta;
	}

	public void setBgCuenta(String bgCuenta) {
		this.bgCuenta = bgCuenta;
	}

	public String getBgDetalle() {
		return bgDetalle;
	}

	public void setBgDetalle(String bgDetalle) {
		this.bgDetalle = bgDetalle;
	}

	public BigDecimal getBgSaldoActual() {
		return bgSaldoActual;
	}

	public void setBgSaldoActual(BigDecimal bgSaldoActual) {
		this.bgSaldoActual = bgSaldoActual;
	}

	public BigDecimal getBgSaldoAnterior() {
		return bgSaldoAnterior;
	}

	public void setBgSaldoAnterior(BigDecimal bgSaldoAnterior) {
		this.bgSaldoAnterior = bgSaldoAnterior;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
