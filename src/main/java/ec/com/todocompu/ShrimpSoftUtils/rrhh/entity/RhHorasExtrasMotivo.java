/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConTipo;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author MarioRamos
 */
@Entity
@Table(name = "rh_horas_extras_motivo", schema = "recursoshumanos")
public class RhHorasExtrasMotivo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RhHorasExtrasMotivoPK rhHorasExtrasMotivoPK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "mot_inactivo")
    private boolean motInactivo;
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
        @JoinColumn(name = "tip_empresa", referencedColumnName = "tip_empresa")
        , @JoinColumn(name = "tip_codigo", referencedColumnName = "tip_codigo")})
    @ManyToOne(optional = false)
    private ConTipo conTipo;

    public RhHorasExtrasMotivo() {
    }

    public RhHorasExtrasMotivo(RhHorasExtrasMotivoPK rhHorasExtrasMotivoPK) {
        this.rhHorasExtrasMotivoPK = rhHorasExtrasMotivoPK;
    }

    public RhHorasExtrasMotivo(String motEmpresa, String motDetalle) {
        this.rhHorasExtrasMotivoPK = new RhHorasExtrasMotivoPK(motEmpresa, motDetalle);
    }

    public RhHorasExtrasMotivoPK getRhHorasExtrasMotivoPK() {
        return rhHorasExtrasMotivoPK;
    }

    public void setRhHorasExtrasMotivoPK(RhHorasExtrasMotivoPK rhHorasExtrasMotivoPK) {
        this.rhHorasExtrasMotivoPK = rhHorasExtrasMotivoPK;
    }

    public boolean getMotInactivo() {
        return motInactivo;
    }

    public void setMotInactivo(boolean motInactivo) {
        this.motInactivo = motInactivo;
    }

    public ConTipo getConTipo() {
        return conTipo;
    }

    public void setConTipo(ConTipo conTipo) {
        this.conTipo = conTipo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rhHorasExtrasMotivoPK != null ? rhHorasExtrasMotivoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RhHorasExtrasMotivo)) {
            return false;
        }
        RhHorasExtrasMotivo other = (RhHorasExtrasMotivo) object;
        if ((this.rhHorasExtrasMotivoPK == null && other.rhHorasExtrasMotivoPK != null) || (this.rhHorasExtrasMotivoPK != null && !this.rhHorasExtrasMotivoPK.equals(other.rhHorasExtrasMotivoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhHorasExtrasMotivo[ rhHorasExtrasMotivoPK=" + rhHorasExtrasMotivoPK + " ]";
    }

}
