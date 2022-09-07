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
public class InvProformaMotivoTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "pm_codigo")
    private String pmCodigo;

    @Column(name = "pm_empresa")
    private String pmEmpresa;

    @Column(name = "pm_detalle")
    private String pmDetalle;

    @Column(name = "pm_inactivo")
    private Boolean pmInactivo;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    public InvProformaMotivoTO() {
    }

    public InvProformaMotivoTO(String pmEmpresa, String pmCodigo, String pmDetalle, Boolean pmInactivo,
            String usrCodigo, String usrFechaInserta) {
        this.pmEmpresa = pmEmpresa;
        this.pmCodigo = pmCodigo;
        this.pmDetalle = pmDetalle;
        this.pmInactivo = pmInactivo;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getpmEmpresa() {
        return pmEmpresa;
    }

    public void setpmEmpresa(String pmEmpresa) {
        this.pmEmpresa = pmEmpresa;
    }

    public String getpmCodigo() {
        return pmCodigo;
    }

    public void setpmCodigo(String pmCodigo) {
        this.pmCodigo = pmCodigo;
    }

    public String getpmDetalle() {
        return pmDetalle;
    }

    public void setpmDetalle(String pmDetalle) {
        this.pmDetalle = pmDetalle;
    }

    public Boolean getpmInactivo() {
        return pmInactivo;
    }

    public void setpmInactivo(Boolean pmInactivo) {
        this.pmInactivo = pmInactivo;
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
