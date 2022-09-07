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
 * @author VALDIVIEZO
 */
@Entity
@Table(name = "prd_piscina_grupos", schema = "produccion")
public class PrdPiscinaGrupo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdPiscinaGrupoPK prdPiscinaGrupoPK;
    @Column(name = "grupo_descripcion")
    private String grupoDescripcion;
    @Column(name = "grupo_activo")
    private boolean grupoActivo;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    private Timestamp usrFechaInserta;

    public PrdPiscinaGrupo() {
    }

    public PrdPiscinaGrupo(PrdPiscinaGrupoPK prdPiscinaGrupoPK, String grupoDescripcion, boolean grupoActivo, String usrEmpresa, String usrCodigo, Timestamp usrFechaInserta) {
        this.prdPiscinaGrupoPK = prdPiscinaGrupoPK;
        this.grupoDescripcion = grupoDescripcion;
        this.grupoActivo = grupoActivo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public PrdPiscinaGrupoPK getPrdPiscinaGrupoPK() {
        return prdPiscinaGrupoPK;
    }

    public void setPrdPiscinaGrupoPK(PrdPiscinaGrupoPK prdPiscinaGrupoPK) {
        this.prdPiscinaGrupoPK = prdPiscinaGrupoPK;
    }

    public String getGrupoDescripcion() {
        return grupoDescripcion;
    }

    public void setGrupoDescripcion(String grupoDescripcion) {
        this.grupoDescripcion = grupoDescripcion;
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

    public boolean isGrupoActivo() {
        return grupoActivo;
    }

    public void setGrupoActivo(boolean grupoActivo) {
        this.grupoActivo = grupoActivo;
    }

}
