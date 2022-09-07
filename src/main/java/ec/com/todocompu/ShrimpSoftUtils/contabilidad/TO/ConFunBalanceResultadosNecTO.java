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
public class ConFunBalanceResultadosNecTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "br_id")
	private Integer id;
	@Column(name = "br_cuenta")
	private String brCuenta;
	@Column(name = "br_detalle")
	private String brDetalle;
	@Column(name = "br_saldo")
	private java.math.BigDecimal brSaldo1;

	public ConFunBalanceResultadosNecTO() {
	}

	public String getBrCuenta() {
		return brCuenta;
	}

	public void setBrCuenta(String brCuenta) {
		this.brCuenta = brCuenta;
	}

	public String getBrDetalle() {
		return brDetalle;
	}

	public void setBrDetalle(String brDetalle) {
		this.brDetalle = brDetalle;
	}

	public BigDecimal getBrSaldo1() {
		return brSaldo1;
	}

	public void setBrSaldo1(BigDecimal brSaldo1) {
		this.brSaldo1 = brSaldo1;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
