/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvClienteCategoriaTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "cc_empresa")
    private String ccEmpresa;
    @Id
    @Column(name = "cc_codigo")
    private String ccCodigo;

    @Column(name = "cc_detalle")
    private String ccDetalle;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    @Column(name = "cc_retiene")
    private boolean ccRetiene;

    public InvClienteCategoriaTO() {
    }

    public InvClienteCategoriaTO(String ccEmpresa, String ccCodigo, String ccDetalle, String usrEmpresa,
            String usrCodigo, String usrFechaInserta) {
        this.ccEmpresa = ccEmpresa;
        this.ccCodigo = ccCodigo;
        this.ccDetalle = ccDetalle;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getCcCodigo() {
        return ccCodigo;
    }

    public void setCcCodigo(String ccCodigo) {
        this.ccCodigo = ccCodigo;
    }

    public String getCcDetalle() {
        return ccDetalle;
    }

    public void setCcDetalle(String ccDetalle) {
        this.ccDetalle = ccDetalle;
    }

    public String getCcEmpresa() {
        return ccEmpresa;
    }

    public void setCcEmpresa(String ccEmpresa) {
        this.ccEmpresa = ccEmpresa;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public boolean isCcRetiene() {
        return ccRetiene;
    }

    public void setCcRetiene(boolean ccRetiene) {
        this.ccRetiene = ccRetiene;
    }

}
