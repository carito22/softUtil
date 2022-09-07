/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Mario Ramos
 */
@Entity
public class ConFlujoCajaTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "fc_id")
    private Integer fcId;
    @Column(name = "fc_cuenta")
    private String fcCuenta;
    @Column(name = "fc_detalle")
    private String fcDetalle;
    @Column(name = "fc_saldo")
    private BigDecimal fcSaldo;
    
    public ConFlujoCajaTO() {
    }

    public Integer getFcId() {
        return fcId;
    }

    public void setFcId(Integer fcId) {
        this.fcId = fcId;
    }

    public String getFcCuenta() {
        return fcCuenta;
    }

    public void setFcCuenta(String fcCuenta) {
        this.fcCuenta = fcCuenta;
    }

    public String getFcDetalle() {
        return fcDetalle;
    }

    public void setFcDetalle(String fcDetalle) {
        this.fcDetalle = fcDetalle;
    }

    public BigDecimal getFcSaldo() {
        return fcSaldo;
    }

    public void setFcSaldo(BigDecimal fcSaldo) {
        this.fcSaldo = fcSaldo;
    }
    
}
