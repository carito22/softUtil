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
public class AfActivosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "af_empresa")
    private String afEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "af_codigo")
    private String afCodigo;

    public AfActivosPK() {
    }

    public AfActivosPK(String afEmpresa, String afCodigo) {
        this.afEmpresa = afEmpresa;
        this.afCodigo = afCodigo;
    }

    public String getAfEmpresa() {
        return afEmpresa;
    }

    public void setAfEmpresa(String afEmpresa) {
        this.afEmpresa = afEmpresa;
    }

    public String getAfCodigo() {
        return afCodigo;
    }

    public void setAfCodigo(String afCodigo) {
        this.afCodigo = afCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (afEmpresa != null ? afEmpresa.hashCode() : 0);
        hash += (afCodigo != null ? afCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AfActivosPK)) {
            return false;
        }
        AfActivosPK other = (AfActivosPK) object;
        if ((this.afEmpresa == null && other.afEmpresa != null) || (this.afEmpresa != null && !this.afEmpresa.equals(other.afEmpresa))) {
            return false;
        }
        if ((this.afCodigo == null && other.afCodigo != null) || (this.afCodigo != null && !this.afCodigo.equals(other.afCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.activoFijo.entity.AfActivosPK[ afEmpresa=" + afEmpresa + ", afCodigo=" + afCodigo + " ]";
    }
    
}
