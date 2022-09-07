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
@Table(name = "prd_piscina_tipo", schema = "produccion")
public class PrdPiscinaTipo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdPiscinaTipoPK prdPiscinaTipoPK;

    @Column(name = "tipo_descripcion")
    private String tipoDescripcion;

    @Column(name = "tipo_activo")
    private boolean tipoActivo;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    private Timestamp usrFechaInserta;

    public PrdPiscinaTipo() {
    }

    public PrdPiscinaTipo(PrdPiscinaTipoPK prdPiscinaTipoPK, String tipoDescripcion, boolean tipoActivo, String usrEmpresa, String usrCodigo, Timestamp usrFechaInserta) {
        this.prdPiscinaTipoPK = prdPiscinaTipoPK;
        this.tipoDescripcion = tipoDescripcion;
        this.tipoActivo = tipoActivo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public PrdPiscinaTipoPK getPrdPiscinaTipoPK() {
        return prdPiscinaTipoPK;
    }

    public void setPrdPiscinaTipoPK(PrdPiscinaTipoPK prdPiscinaTipoPK) {
        this.prdPiscinaTipoPK = prdPiscinaTipoPK;
    }

    public String getTipoDescripcion() {
        return tipoDescripcion;
    }

    public void setTipoDescripcion(String tipoDescripcion) {
        this.tipoDescripcion = tipoDescripcion;
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

    public boolean isTipoActivo() {
        return tipoActivo;
    }

    public void setTipoActivo(boolean tipoActivo) {
        this.tipoActivo = tipoActivo;
    }

}
