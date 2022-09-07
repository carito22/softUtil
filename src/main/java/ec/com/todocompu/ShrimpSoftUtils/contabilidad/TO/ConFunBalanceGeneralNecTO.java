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
public class ConFunBalanceGeneralNecTO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "bg_id")
	private Integer id;
	@Column(name = "bg_cuenta")
	private String bgCuenta;
	@Column(name = "bg_detalle")
	private String bgDetalle;
	@Column(name = "bg_saldo")
	private java.math.BigDecimal bgSaldo1;

	public ConFunBalanceGeneralNecTO() {
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

	public BigDecimal getBgSaldo1() {
		return bgSaldo1;
	}

	public void setBgSaldo1(BigDecimal bgSaldo1) {
		this.bgSaldo1 = bgSaldo1;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
