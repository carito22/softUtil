/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author MarioRamos
 */
@Entity
@Table(name = "rh_vacaciones_gozadas_numeracion", schema = "recursoshumanos")
public class RhVacacionesGozadasNumeracion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
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

    public RhVacacionesGozadasNumeracion() {
    }

    public RhVacacionesGozadasNumeracion(String vacEmpresa) {
        this.vacEmpresa = vacEmpresa;
    }

    public RhVacacionesGozadasNumeracion(String vacEmpresa, String vacNumero) {
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
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RhVacacionesGozadasNumeracion)) {
            return false;
        }
        RhVacacionesGozadasNumeracion other = (RhVacacionesGozadasNumeracion) object;
        if ((this.vacEmpresa == null && other.vacEmpresa != null) || (this.vacEmpresa != null && !this.vacEmpresa.equals(other.vacEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhVacacionesGozadasNumeracion[ vacEmpresa=" + vacEmpresa + " ]";
    }
    
}
