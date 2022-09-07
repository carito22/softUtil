/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

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
@Table(name = "sis_scanner_configuracion", schema = "sistemaweb")
public class SisScannerConfiguracion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "sc_empresa")
    private String scEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "sc_licencia")
    private String scLicencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sc_estado")
    private boolean scEstado;

    public SisScannerConfiguracion() {
    }

    public SisScannerConfiguracion(String scEmpresa) {
        this.scEmpresa = scEmpresa;
    }

    public SisScannerConfiguracion(String scEmpresa, String scLicencia, boolean scEstado) {
        this.scEmpresa = scEmpresa;
        this.scLicencia = scLicencia;
        this.scEstado = scEstado;
    }

    public String getScEmpresa() {
        return scEmpresa;
    }

    public void setScEmpresa(String scEmpresa) {
        this.scEmpresa = scEmpresa;
    }

    public String getScLicencia() {
        return scLicencia;
    }

    public void setScLicencia(String scLicencia) {
        this.scLicencia = scLicencia;
    }

    public boolean getScEstado() {
        return scEstado;
    }

    public void setScEstado(boolean scEstado) {
        this.scEstado = scEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (scEmpresa != null ? scEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SisScannerConfiguracion)) {
            return false;
        }
        SisScannerConfiguracion other = (SisScannerConfiguracion) object;
        if ((this.scEmpresa == null && other.scEmpresa != null) || (this.scEmpresa != null && !this.scEmpresa.equals(other.scEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.sistema.entity.Scannerconfiguracion[ scEmpresa=" + scEmpresa + " ]";
    }
    
}
