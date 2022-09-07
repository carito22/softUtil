/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
@Table(name = "inv_transportista", schema = "inventario")
public class InvTransportista implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvTransportistaPK invTransportistaPK;
    @Column(name = "trans_id_tipo")
    private Character transIdTipo;
    @Column(name = "trans_id_numero")
    private String transIdNumero;
    @NotNull
    @Column(name = "trans_nombres")
    private String transNombres; //antes era el nombre
    @Column(name = "trans_email")
    private String transEmail;
    @Column(name = "trans_placa")
    private String transPlaca;
    @Column(name = "trans_inactivo")
    private Boolean transInactivo;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;

    public InvTransportista() {
    }

    public InvTransportista(InvTransportistaPK invTransportistaPK, Character transIdTipo, String transIdNumero, String transNombres, String transEmail, String transPlaca, Boolean transInactivo, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.invTransportistaPK = invTransportistaPK;
        this.transIdTipo = transIdTipo;
        this.transIdNumero = transIdNumero;
        this.transNombres = transNombres;
        this.transEmail = transEmail;
        this.transPlaca = transPlaca;
        this.transInactivo = transInactivo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public InvTransportistaPK getInvTransportistaPK() {
        return invTransportistaPK;
    }

    public void setInvTransportistaPK(InvTransportistaPK invTransportistaPK) {
        this.invTransportistaPK = invTransportistaPK;
    }

    public Character getTransIdTipo() {
        return transIdTipo;
    }

    public void setTransIdTipo(Character transIdTipo) {
        this.transIdTipo = transIdTipo;
    }

    public String getTransIdNumero() {
        return transIdNumero;
    }

    public void setTransIdNumero(String transIdNumero) {
        this.transIdNumero = transIdNumero;
    }

    public String getTransNombres() {
        return transNombres;
    }

    public void setTransNombres(String transNombres) {
        this.transNombres = transNombres;
    }

    public String getTransEmail() {
        return transEmail;
    }

    public void setTransEmail(String transEmail) {
        this.transEmail = transEmail;
    }

    public String getTransPlaca() {
        return transPlaca;
    }

    public void setTransPlaca(String transPlaca) {
        this.transPlaca = transPlaca;
    }

    public Boolean getTransInactivo() {
        return transInactivo;
    }

    public void setTransInactivo(Boolean transInactivo) {
        this.transInactivo = transInactivo;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

}
