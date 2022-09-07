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
public class ConMayorGeneralTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "mg_cuenta")
	private String bgCuenta;
	@Column(name = "mg_detalle")
	private String bgDetalle;
	@Column(name = "mg_saldo6")
	private java.math.BigDecimal bgSaldo6;
	@Column(name = "mg_saldo5")
	private java.math.BigDecimal bgSaldo5;
	@Column(name = "mg_saldo4")
	private java.math.BigDecimal bgSaldo4;
	@Column(name = "mg_saldo3")
	private java.math.BigDecimal bgSaldo3;
	@Column(name = "mg_saldo2")
	private java.math.BigDecimal bgSaldo2;
	@Column(name = "mg_saldo1")
	private java.math.BigDecimal bgSaldo1;

	public ConMayorGeneralTO() {
	}

	public ConMayorGeneralTO(String bgCuenta, String bgDetalle, BigDecimal bgSaldo6, BigDecimal bgSaldo5,
			BigDecimal bgSaldo4, BigDecimal bgSaldo3, BigDecimal bgSaldo2, BigDecimal bgSaldo1) {
		this.bgCuenta = bgCuenta;
		this.bgDetalle = bgDetalle;
		this.bgSaldo6 = bgSaldo6;
		this.bgSaldo5 = bgSaldo5;
		this.bgSaldo4 = bgSaldo4;
		this.bgSaldo3 = bgSaldo3;
		this.bgSaldo2 = bgSaldo2;
		this.bgSaldo1 = bgSaldo1;
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

	public BigDecimal getBgSaldo2() {
		return bgSaldo2;
	}

	public void setBgSaldo2(BigDecimal bgSaldo2) {
		this.bgSaldo2 = bgSaldo2;
	}

	public BigDecimal getBgSaldo3() {
		return bgSaldo3;
	}

	public void setBgSaldo3(BigDecimal bgSaldo3) {
		this.bgSaldo3 = bgSaldo3;
	}

	public BigDecimal getBgSaldo4() {
		return bgSaldo4;
	}

	public void setBgSaldo4(BigDecimal bgSaldo4) {
		this.bgSaldo4 = bgSaldo4;
	}

	public BigDecimal getBgSaldo5() {
		return bgSaldo5;
	}

	public void setBgSaldo5(BigDecimal bgSaldo5) {
		this.bgSaldo5 = bgSaldo5;
	}

	public BigDecimal getBgSaldo6() {
		return bgSaldo6;
	}

	public void setBgSaldo6(BigDecimal bgSaldo6) {
		this.bgSaldo6 = bgSaldo6;
	}

}
