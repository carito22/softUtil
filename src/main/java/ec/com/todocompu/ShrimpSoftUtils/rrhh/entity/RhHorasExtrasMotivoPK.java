/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author MarioRamos
 */
@Embeddable
public class RhHorasExtrasMotivoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "mot_empresa")
    private String motEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "mot_detalle")
    private String motDetalle;

    public RhHorasExtrasMotivoPK() {
    }

    public RhHorasExtrasMotivoPK(String motEmpresa, String motDetalle) {
        this.motEmpresa = motEmpresa;
        this.motDetalle = motDetalle;
    }

    public String getMotEmpresa() {
        return motEmpresa;
    }

    public void setMotEmpresa(String motEmpresa) {
        this.motEmpresa = motEmpresa;
    }

    public String getMotDetalle() {
        return motDetalle;
    }

    public void setMotDetalle(String motDetalle) {
        this.motDetalle = motDetalle;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (motEmpresa != null ? motEmpresa.hashCode() : 0);
        hash += (motDetalle != null ? motDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RhHorasExtrasMotivoPK)) {
            return false;
        }
        RhHorasExtrasMotivoPK other = (RhHorasExtrasMotivoPK) object;
        if ((this.motEmpresa == null && other.motEmpresa != null) || (this.motEmpresa != null && !this.motEmpresa.equals(other.motEmpresa))) {
            return false;
        }
        if ((this.motDetalle == null && other.motDetalle != null) || (this.motDetalle != null && !this.motDetalle.equals(other.motDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhHorasExtrasMotivoPK[ motEmpresa=" + motEmpresa + ", motDetalle=" + motDetalle + " ]";
    }
    
}
