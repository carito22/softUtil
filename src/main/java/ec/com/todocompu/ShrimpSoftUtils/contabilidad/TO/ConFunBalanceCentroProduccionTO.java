/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ConFunBalanceCentroProduccionTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "brc_id")
    private Integer id;
    @Column(name = "brc_cuenta")
    private String brcCuenta;
    @Column(name = "brc_detalle")
    private String brcDetalle;
    @Column(name = "brc_centro_produccion")
    private String brcCentroProduccion;
    @Column(name = "brc_saldo")
    private java.math.BigDecimal brcSaldo;

    public ConFunBalanceCentroProduccionTO() {
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

    public String getBrcCentroProduccion() {
        return brcCentroProduccion;
    }

    public void setBrcCentroProduccion(String brcCentroProduccion) {
        this.brcCentroProduccion = brcCentroProduccion;
    }

    public BigDecimal getBrcSaldo() {
        return brcSaldo;
    }

    public void setBrcSaldo(BigDecimal brcSaldo) {
        this.brcSaldo = brcSaldo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
