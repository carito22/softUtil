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
public class ConBalanceResultadoTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "fe_id")
	private Integer id;
	@Column(name = "fe_cuenta")
	private String bgCuenta;
	@Column(name = "fe_detalle")
	private String bgDetalle;
	@Column(name = "fe_saldo")
	private java.math.BigDecimal bgSaldo;

	public ConBalanceResultadoTO() {
	}

	public ConBalanceResultadoTO(String bgCuenta, String bgDetalle, BigDecimal bgSaldo, Integer id) {
		this.bgCuenta = bgCuenta;
		this.bgDetalle = bgDetalle;
		this.bgSaldo = bgSaldo;
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

	public BigDecimal getBgSaldo() {
		return bgSaldo;
	}

	public void setBgSaldo(BigDecimal bgSaldo) {
		this.bgSaldo = bgSaldo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
