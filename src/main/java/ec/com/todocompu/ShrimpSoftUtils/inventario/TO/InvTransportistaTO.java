/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
public class InvTransportistaTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "trans_codigo")
    private String transCodigo;
    
    @Column(name = "trans_empresa")
    private String transEmpresa;

    @Column(name = "trans_id_tipo")
    private Character transIdTipo;

    @Column(name = "trans_id_numero")
    private String transIdNumero;

    @Column(name = "trans_nombres")
    private String transNombres;

    @Column(name = "trans_email")
    private String transEmail;

    @Column(name = "trans_inactivo")
    private Boolean transInactivo;

    @Column(name = "trans_placa")
    private String transPlaca;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    public InvTransportistaTO() {
    }

    public InvTransportistaTO(String transEmpresa, String transCodigo, Character transIdTipo, String transIdNumero, String transNombres, String transEmail, Boolean transInactivo, String transPlaca, String usrEmpresa, String usrCodigo, String usrFechaInserta) {
        this.transEmpresa = transEmpresa;
        this.transCodigo = transCodigo;
        this.transIdTipo = transIdTipo;
        this.transIdNumero = transIdNumero;
        this.transNombres = transNombres;
        this.transEmail = transEmail;
        this.transInactivo = transInactivo;
        this.transPlaca = transPlaca;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getTransEmpresa() {
        return transEmpresa;
    }

    public void setTransEmpresa(String transEmpresa) {
        this.transEmpresa = transEmpresa;
    }

    public String getTransCodigo() {
        return transCodigo;
    }

    public void setTransCodigo(String transCodigo) {
        this.transCodigo = transCodigo;
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

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getTransPlaca() {
        return transPlaca;
    }

    public void setTransPlaca(String transPlaca) {
        this.transPlaca = transPlaca;
    }

}
