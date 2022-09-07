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
public class ConFlujoCajaCuentasPorCobrarClientesTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cxcd_cliente_id")
    private String cxcdClienteId;
    @Column(name = "cxcd_cliente_razon_social")
    private String cxcdClienteRazonSocial;
    @Column(name = "cxcd_saldo")
    private BigDecimal cxcdSaldo;
    
    public ConFlujoCajaCuentasPorCobrarClientesTO() {
    }

    public String getCxcdClienteId() {
        return cxcdClienteId;
    }

    public void setCxcdClienteId(String cxcdClienteId) {
        this.cxcdClienteId = cxcdClienteId;
    }

    public String getCxcdClienteRazonSocial() {
        return cxcdClienteRazonSocial;
    }

    public void setCxcdClienteRazonSocial(String cxcdClienteRazonSocial) {
        this.cxcdClienteRazonSocial = cxcdClienteRazonSocial;
    }

    public BigDecimal getCxcdSaldo() {
        return cxcdSaldo;
    }

    public void setCxcdSaldo(BigDecimal cxcdSaldo) {
        this.cxcdSaldo = cxcdSaldo;
    }

}
