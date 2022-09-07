/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.activoFijo.entity;

import ec.com.todocompu.ShrimpSoftUtils.activoFijo.TO.AfDepreciacionMotivoTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConTipo;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
@Table(name = "af_depreciaciones_motivos", schema = "activosfijos")
@NamedQueries({
    @NamedQuery(name = "AfDepreciacionesMotivos.findAll", query = "SELECT a FROM AfDepreciacionesMotivos a")})
public class AfDepreciacionesMotivos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "mot_secuencial")
    private Integer motSecuencial;
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
    @JoinColumns({
        @JoinColumn(name = "ubi_empresa", referencedColumnName = "ubi_empresa")
        , @JoinColumn(name = "ubi_sector", referencedColumnName = "ubi_sector")
        , @JoinColumn(name = "ubi_codigo", referencedColumnName = "ubi_codigo")})
    @ManyToOne(optional = false)
    private AfUbicaciones afUbicaciones;
    @JoinColumns({
    @JoinColumn(name = "tip_empresa", referencedColumnName = "tip_empresa"),
        @JoinColumn(name = "tip_codigo", referencedColumnName = "tip_codigo")})
    @OneToOne
    private ConTipo conTipo;

    public AfDepreciacionesMotivos() {
    }

    public AfDepreciacionesMotivos(Integer motSecuencial) {
        this.motSecuencial = motSecuencial;
    }

    public AfDepreciacionesMotivos(Integer motSecuencial, String tipEmpresa, String tipCodigo, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.motSecuencial = motSecuencial;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public Integer getMotSecuencial() {
        return motSecuencial;
    }

    public void setMotSecuencial(Integer motSecuencial) {
        this.motSecuencial = motSecuencial;
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

    public AfUbicaciones getAfUbicaciones() {
        return afUbicaciones;
    }

    public void setAfUbicaciones(AfUbicaciones afUbicaciones) {
        this.afUbicaciones = afUbicaciones;
    }

    public ConTipo getConTipo() {
        return conTipo;
    }

    public void setConTipo(ConTipo conTipo) {
        this.conTipo = conTipo;
    }

     public void convertirObjeto(AfDepreciacionMotivoTO afDepreciacionMotivoTO) {
        this.afUbicaciones = new AfUbicaciones(afDepreciacionMotivoTO.getAfUbicaciones().getUbiEmpresa(), afDepreciacionMotivoTO.getAfUbicaciones().getUbiSector(), afDepreciacionMotivoTO.getAfUbicaciones().getUbiCodigo());
        this.conTipo = new ConTipo(afDepreciacionMotivoTO.getConTipo().getEmpCodigo(), afDepreciacionMotivoTO.getConTipo().getTipCodigo());
        this.motSecuencial = afDepreciacionMotivoTO.getMotSecuencial();
        this.usrCodigo = afDepreciacionMotivoTO.getUsrCodigo();
        this.usrEmpresa = afDepreciacionMotivoTO.getUsrEmpresa();
        this.usrFechaInserta = afDepreciacionMotivoTO.getUsrFechaInserta();
    }
     
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (motSecuencial != null ? motSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AfDepreciacionesMotivos)) {
            return false;
        }
        AfDepreciacionesMotivos other = (AfDepreciacionesMotivos) object;
        if ((this.motSecuencial == null && other.motSecuencial != null) || (this.motSecuencial != null && !this.motSecuencial.equals(other.motSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.activoFijo.entity.AfDepreciacionesMotivos[ motSecuencial=" + motSecuencial + " ]";
    }
    
}
