/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author Trabajo
 */
@Entity
@Table(name = "prd_reproceso_motivo", schema = "produccion")
public class PrdReprocesoMotivo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdReprocesoMotivoPK prdReprocesoMotivoPK;
    @Column(name = "prd_detalle")
    private String prdDetalle;
    @Column(name = "prd_inactivo")
    private boolean prdInactivo;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta")
    private Timestamp usrFechaInserta;

    public PrdReprocesoMotivo() {
    }

    public PrdReprocesoMotivoPK getPrdReprocesoMotivoPK() {
        return prdReprocesoMotivoPK;
    }

    public void setPrdReprocesoMotivoPK(PrdReprocesoMotivoPK prdReprocesoMotivoPK) {
        this.prdReprocesoMotivoPK = prdReprocesoMotivoPK;
    }

    public String getPrdDetalle() {
        return prdDetalle;
    }

    public void setPrdDetalle(String prdDetalle) {
        this.prdDetalle = prdDetalle;
    }

    public boolean isPrdInactivo() {
        return prdInactivo;
    }

    public void setPrdInactivo(boolean prdInactivo) {
        this.prdInactivo = prdInactivo;
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

    public Timestamp getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Timestamp usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

}
