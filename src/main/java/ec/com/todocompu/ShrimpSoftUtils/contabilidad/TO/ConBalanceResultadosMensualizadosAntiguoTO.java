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
public class ConBalanceResultadosMensualizadosAntiguoTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "br_id")
    private Integer id;
    @Column(name = "br_cuenta")
    private String brCuenta;
    @Column(name = "br_detalle")
    private String brDetalle;
    @Column(name = "br_saldo")
    private BigDecimal brSaldo;
    @Column(name = "br_mes")
    private String brMes;

    public ConBalanceResultadosMensualizadosAntiguoTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public BigDecimal getBrSaldo() {
        return brSaldo;
    }

    public void setBrSaldo(BigDecimal brSaldo) {
        this.brSaldo = brSaldo;
    }

    public String getBrMes() {
        return brMes;
    }

    public void setBrMes(String brMes) {
        this.brMes = brMes;
    }

}
