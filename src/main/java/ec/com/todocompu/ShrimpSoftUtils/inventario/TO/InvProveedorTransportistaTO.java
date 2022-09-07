/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author mario
 */
@Entity
public class InvProveedorTransportistaTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "pt_secuencial")
    private Integer ptSecuencial;
    @Column(name = "pt_transportista_ruc")
    private String ptTransportistaRuc;
    @Column(name = "pt_transportista_razon_social")
    private String ptTransportistaRazonSocial;

    public InvProveedorTransportistaTO() {
    }

    public InvProveedorTransportistaTO(Integer ptSecuencial) {
        this.ptSecuencial = ptSecuencial;
    }

    public Integer getPtSecuencial() {
        return ptSecuencial;
    }

    public void setPtSecuencial(Integer ptSecuencial) {
        this.ptSecuencial = ptSecuencial;
    }

    public String getPtTransportistaRuc() {
        return ptTransportistaRuc;
    }

    public void setPtTransportistaRuc(String ptTransportistaRuc) {
        this.ptTransportistaRuc = ptTransportistaRuc;
    }

    public String getPtTransportistaRazonSocial() {
        return ptTransportistaRazonSocial;
    }

    public void setPtTransportistaRazonSocial(String ptTransportistaRazonSocial) {
        this.ptTransportistaRazonSocial = ptTransportistaRazonSocial;
    }

}
