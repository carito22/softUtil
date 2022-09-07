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
public class ConFlujoCajaCuentasPorPagarProveedoresTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cxpd_proveedor_id")
    private String cxpdProveedorId;
    @Column(name = "cxpd_proveedor_razon_social")
    private String cxpdProveedorRazonSocial;
    @Column(name = "cxpd_saldo")
    private BigDecimal cxpdSaldo;
    
    public ConFlujoCajaCuentasPorPagarProveedoresTO() {
    }

    public String getCxpdProveedorId() {
        return cxpdProveedorId;
    }

    public void setCxpdProveedorId(String cxpdProveedorId) {
        this.cxpdProveedorId = cxpdProveedorId;
    }

    public String getCxpdProveedorRazonSocial() {
        return cxpdProveedorRazonSocial;
    }

    public void setCxpdProveedorRazonSocial(String cxpdProveedorRazonSocial) {
        this.cxpdProveedorRazonSocial = cxpdProveedorRazonSocial;
    }

    public BigDecimal getCxpdSaldo() {
        return cxpdSaldo;
    }

    public void setCxpdSaldo(BigDecimal cxpdSaldo) {
        this.cxpdSaldo = cxpdSaldo;
    }

    
}
