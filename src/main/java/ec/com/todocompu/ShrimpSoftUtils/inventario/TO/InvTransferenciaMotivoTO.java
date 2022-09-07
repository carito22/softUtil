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
public class InvTransferenciaMotivoTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "tm_codigo")
    private String tmCodigo;

    @Column(name = "tm_empresa")
    private String tmEmpresa;

    @Column(name = "tm_detalle")
    private String tmDetalle;

    @Column(name = "tm_inactivo")
    private Boolean tmInactivo;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    public InvTransferenciaMotivoTO() {
    }

    public InvTransferenciaMotivoTO(String tmEmpresa, String tmCodigo, String tmDetalle, Boolean tmInactivo,
            String usrEmpresa, String usrCodigo, String usrFechaInserta) {
        this.tmEmpresa = tmEmpresa;
        this.tmCodigo = tmCodigo;
        this.tmDetalle = tmDetalle;
        this.tmInactivo = tmInactivo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getTmEmpresa() {
        return tmEmpresa;
    }

    public void setTmEmpresa(String tmEmpresa) {
        this.tmEmpresa = tmEmpresa;
    }

    public String getTmCodigo() {
        return tmCodigo;
    }

    public void setTmCodigo(String tmCodigo) {
        this.tmCodigo = tmCodigo;
    }

    public String getTmDetalle() {
        return tmDetalle;
    }

    public void setTmDetalle(String tmDetalle) {
        this.tmDetalle = tmDetalle;
    }

    public Boolean getTmInactivo() {
        return tmInactivo;
    }

    public void setTmInactivo(Boolean tmInactivo) {
        this.tmInactivo = tmInactivo;
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
}
