/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.activoFijo.entity;

import ec.com.todocompu.ShrimpSoftUtils.activoFijo.TO.AfUbicacionesTO;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author User
 */
@Entity
@Table(name = "af_ubicaciones", schema = "activosfijos")
@NamedQueries({
    @NamedQuery(name = "AfUbicaciones.findAll", query = "SELECT a FROM AfUbicaciones a")})
public class AfUbicaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AfUbicacionesPK afUbicacionesPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ubi_descripcion")
    private String ubiDescripcion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usr_fecha_inserta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;

    public AfUbicaciones() {
    }

    public AfUbicaciones(AfUbicacionesPK afUbicacionesPK) {
        this.afUbicacionesPK = afUbicacionesPK;
    }

    public AfUbicaciones(AfUbicacionesPK afUbicacionesPK, String ubiDescripcion, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.afUbicacionesPK = afUbicacionesPK;
        this.ubiDescripcion = ubiDescripcion;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public AfUbicaciones(String ubiEmpresa, String ubiSector, String ubiCodigo) {
        this.afUbicacionesPK = new AfUbicacionesPK(ubiEmpresa, ubiSector, ubiCodigo);
    }

    public AfUbicacionesPK getAfUbicacionesPK() {
        return afUbicacionesPK;
    }

    public void setAfUbicacionesPK(AfUbicacionesPK afUbicacionesPK) {
        this.afUbicacionesPK = afUbicacionesPK;
    }

    public String getUbiDescripcion() {
        return ubiDescripcion;
    }

    public void setUbiDescripcion(String ubiDescripcion) {
        this.ubiDescripcion = ubiDescripcion;
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

    public void convertirObjeto(AfUbicacionesTO afUbicacionesTO) {
        this.afUbicacionesPK = new AfUbicacionesPK(afUbicacionesTO.getUbiEmpresa(), afUbicacionesTO.getUbiSector(), afUbicacionesTO.getUbiCodigo());
        this.ubiDescripcion = afUbicacionesTO.getUbiDescripcion();
        this.usrCodigo = afUbicacionesTO.getUsrCodigo();
        this.usrEmpresa = afUbicacionesTO.getUsrEmpresa();
        this.usrFechaInserta = afUbicacionesTO.getUsrFechaInserta();
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (afUbicacionesPK != null ? afUbicacionesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AfUbicaciones)) {
            return false;
        }
        AfUbicaciones other = (AfUbicaciones) object;
        if ((this.afUbicacionesPK == null && other.afUbicacionesPK != null) || (this.afUbicacionesPK != null && !this.afUbicacionesPK.equals(other.afUbicacionesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.activoFijo.entity.AfUbicaciones[ afUbicacionesPK=" + afUbicacionesPK + " ]";
    }
    
}
