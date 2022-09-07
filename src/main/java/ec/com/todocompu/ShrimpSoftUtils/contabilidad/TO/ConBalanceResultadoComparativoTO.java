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
public class ConBalanceResultadoComparativoTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "brc_id")
	private Integer id;
	@Column(name = "brc_cuenta")
	private String brcCuenta;
	@Column(name = "brc_detalle")
	private String brcDetalle;
	@Column(name = "brc_saldo")
	private java.math.BigDecimal brcSaldo;
	@Column(name = "brc_saldo2")
	private java.math.BigDecimal brcSaldo2;

    public ConBalanceResultadoComparativoTO() {
    }

    public ConBalanceResultadoComparativoTO(Integer id, String brcCuenta, String brcDetalle, BigDecimal brcSaldo, BigDecimal brcSaldo2) {
        this.id = id;
        this.brcCuenta = brcCuenta;
        this.brcDetalle = brcDetalle;
        this.brcSaldo = brcSaldo;
        this.brcSaldo2 = brcSaldo2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrcCuenta() {
        return brcCuenta;
    }

    public void setBrcCuenta(String brcCuenta) {
        this.brcCuenta = brcCuenta;
    }

    public String getBrcDetalle() {
        return brcDetalle;
    }

    public void setBrcDetalle(String brcDetalle) {
        this.brcDetalle = brcDetalle;
    }

    public BigDecimal getBrcSaldo() {
        return brcSaldo;
    }

    public void setBrcSaldo(BigDecimal brcSaldo) {
        this.brcSaldo = brcSaldo;
    }

    public BigDecimal getBrcSaldo2() {
        return brcSaldo2;
    }

    public void setBrcSaldo2(BigDecimal brcSaldo2) {
        this.brcSaldo2 = brcSaldo2;
    }

    @Override
    public String toString() {
        return "ConBalanceResultadoComparativoTO{" + "id=" + id + ", brcCuenta=" + brcCuenta + ", brcDetalle=" + brcDetalle + ", brcSaldo=" + brcSaldo + ", brcSaldo2=" + brcSaldo2 + '}';
    }

	

}
