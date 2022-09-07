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
public class RhVacacionesGozadasPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "vac_empresa")
    private String vacEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "vac_numero")
    private String vacNumero;

    public RhVacacionesGozadasPK() {
    }

    public RhVacacionesGozadasPK(String vacEmpresa, String vacNumero) {
        this.vacEmpresa = vacEmpresa;
        this.vacNumero = vacNumero;
    }

    public String getVacEmpresa() {
        return vacEmpresa;
    }

    public void setVacEmpresa(String vacEmpresa) {
        this.vacEmpresa = vacEmpresa;
    }

    public String getVacNumero() {
        return vacNumero;
    }

    public void setVacNumero(String vacNumero) {
        this.vacNumero = vacNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vacEmpresa != null ? vacEmpresa.hashCode() : 0);
        hash += (vacNumero != null ? vacNumero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RhVacacionesGozadasPK)) {
            return false;
        }
        RhVacacionesGozadasPK other = (RhVacacionesGozadasPK) object;
        if ((this.vacEmpresa == null && other.vacEmpresa != null) || (this.vacEmpresa != null && !this.vacEmpresa.equals(other.vacEmpresa))) {
            return false;
        }
        if ((this.vacNumero == null && other.vacNumero != null) || (this.vacNumero != null && !this.vacNumero.equals(other.vacNumero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhVacacionesGozadasPK[ vacEmpresa=" + vacEmpresa + ", vacNumero=" + vacNumero + " ]";
    }
    
}
