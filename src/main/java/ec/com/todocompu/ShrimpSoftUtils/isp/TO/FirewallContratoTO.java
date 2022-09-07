/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.isp.TO;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Trabajo
 */
public class FirewallContratoTO implements Serializable {

    private int id;
    private String cliCodigo;
    private String cliId;
    private String cliNombre;
    private String address;
    private String nombreList;
    private String comment;
    private boolean disabled;
    private Date cliFechaCorte;

    public FirewallContratoTO() {
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getCliId() {
        return cliId;
    }

    public void setCliId(String cliId) {
        this.cliId = cliId;
    }

    public String getCliNombre() {
        return cliNombre;
    }

    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNombreList() {
        return nombreList;
    }

    public void setNombreList(String nombreList) {
        this.nombreList = nombreList;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isDisabled() {
        return disabled;
    }

    public void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCliFechaCorte() {
        return cliFechaCorte;
    }

    public void setCliFechaCorte(Date cliFechaCorte) {
        this.cliFechaCorte = cliFechaCorte;
    }

}
