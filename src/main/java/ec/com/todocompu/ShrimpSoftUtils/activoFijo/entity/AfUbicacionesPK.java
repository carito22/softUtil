/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.activoFijo.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author User
 */
@Embeddable
public class AfUbicacionesPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ubi_empresa")
    private String ubiEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ubi_sector")
    private String ubiSector;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ubi_codigo")
    private String ubiCodigo;

    public AfUbicacionesPK() {
    }

    public AfUbicacionesPK(String ubiEmpresa, String ubiSector, String ubiCodigo) {
        this.ubiEmpresa = ubiEmpresa;
        this.ubiSector = ubiSector;
        this.ubiCodigo = ubiCodigo;
    }

    public String getUbiEmpresa() {
        return ubiEmpresa;
    }

    public void setUbiEmpresa(String ubiEmpresa) {
        this.ubiEmpresa = ubiEmpresa;
    }

    public String getUbiSector() {
        return ubiSector;
    }

    public void setUbiSector(String ubiSector) {
        this.ubiSector = ubiSector;
    }

    public String getUbiCodigo() {
        return ubiCodigo;
    }

    public void setUbiCodigo(String ubiCodigo) {
        this.ubiCodigo = ubiCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ubiEmpresa != null ? ubiEmpresa.hashCode() : 0);
        hash += (ubiSector != null ? ubiSector.hashCode() : 0);
        hash += (ubiCodigo != null ? ubiCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AfUbicacionesPK)) {
            return false;
        }
        AfUbicacionesPK other = (AfUbicacionesPK) object;
        if ((this.ubiEmpresa == null && other.ubiEmpresa != null) || (this.ubiEmpresa != null && !this.ubiEmpresa.equals(other.ubiEmpresa))) {
            return false;
        }
        if ((this.ubiSector == null && other.ubiSector != null) || (this.ubiSector != null && !this.ubiSector.equals(other.ubiSector))) {
            return false;
        }
        if ((this.ubiCodigo == null && other.ubiCodigo != null) || (this.ubiCodigo != null && !this.ubiCodigo.equals(other.ubiCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.activoFijo.entity.AfUbicacionesPK[ ubiEmpresa=" + ubiEmpresa + ", ubiSector=" + ubiSector + ", ubiCodigo=" + ubiCodigo + " ]";
    }
    
}
