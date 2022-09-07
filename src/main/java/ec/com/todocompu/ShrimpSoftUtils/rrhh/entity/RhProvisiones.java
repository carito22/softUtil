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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author DEVELOPER
 */
@Entity
@Table(name = "rh_provisiones", schema = "recursoshumanos")
@NamedQueries({
    @NamedQuery(name = "RhProvisiones.findAll", query = "SELECT r FROM RhProvisiones r")})
public class RhProvisiones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "prov_empresa")
    private String provEmpresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prov_excluir_aporte_patronal")
    private boolean provExcluirAportePatronal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prov_excluir_iece")
    private boolean provExcluirIece;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prov_excluir_secap")
    private boolean provExcluirSecap;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prov_excluir_xiii_sueldo")
    private boolean provExcluirXiiiSueldo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prov_excluir_xiv_sueldo")
    private boolean provExcluirXivSueldo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prov_excluir_fondo_reserva")
    private boolean provExcluirFondoReserva;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prov_excluir_vacaciones")
    private boolean provExcluirVacaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prov_excluir_desahucio")
    private boolean provExcluirDesahucio;

    public RhProvisiones() {
    }

    public RhProvisiones(String provEmpresa) {
        this.provEmpresa = provEmpresa;
    }

    public RhProvisiones(String provEmpresa, boolean provExcluirAportePatronal, boolean provExcluirIece, boolean provExcluirSecap, boolean provExcluirXiiiSueldo, boolean provExcluirXivSueldo, boolean provExcluirFondoReserva, boolean provExcluirVacaciones, boolean provExcluirDesahucio) {
        this.provEmpresa = provEmpresa;
        this.provExcluirAportePatronal = provExcluirAportePatronal;
        this.provExcluirIece = provExcluirIece;
        this.provExcluirSecap = provExcluirSecap;
        this.provExcluirXiiiSueldo = provExcluirXiiiSueldo;
        this.provExcluirXivSueldo = provExcluirXivSueldo;
        this.provExcluirFondoReserva = provExcluirFondoReserva;
        this.provExcluirVacaciones = provExcluirVacaciones;
        this.provExcluirDesahucio = provExcluirDesahucio;
    }

    public String getProvEmpresa() {
        return provEmpresa;
    }

    public void setProvEmpresa(String provEmpresa) {
        this.provEmpresa = provEmpresa;
    }

    public boolean getProvExcluirAportePatronal() {
        return provExcluirAportePatronal;
    }

    public void setProvExcluirAportePatronal(boolean provExcluirAportePatronal) {
        this.provExcluirAportePatronal = provExcluirAportePatronal;
    }

    public boolean getProvExcluirIece() {
        return provExcluirIece;
    }

    public void setProvExcluirIece(boolean provExcluirIece) {
        this.provExcluirIece = provExcluirIece;
    }

    public boolean getProvExcluirSecap() {
        return provExcluirSecap;
    }

    public void setProvExcluirSecap(boolean provExcluirSecap) {
        this.provExcluirSecap = provExcluirSecap;
    }

    public boolean getProvExcluirXiiiSueldo() {
        return provExcluirXiiiSueldo;
    }

    public void setProvExcluirXiiiSueldo(boolean provExcluirXiiiSueldo) {
        this.provExcluirXiiiSueldo = provExcluirXiiiSueldo;
    }

    public boolean getProvExcluirXivSueldo() {
        return provExcluirXivSueldo;
    }

    public void setProvExcluirXivSueldo(boolean provExcluirXivSueldo) {
        this.provExcluirXivSueldo = provExcluirXivSueldo;
    }

    public boolean getProvExcluirFondoReserva() {
        return provExcluirFondoReserva;
    }

    public void setProvExcluirFondoReserva(boolean provExcluirFondoReserva) {
        this.provExcluirFondoReserva = provExcluirFondoReserva;
    }

    public boolean getProvExcluirVacaciones() {
        return provExcluirVacaciones;
    }

    public void setProvExcluirVacaciones(boolean provExcluirVacaciones) {
        this.provExcluirVacaciones = provExcluirVacaciones;
    }

    public boolean getProvExcluirDesahucio() {
        return provExcluirDesahucio;
    }

    public void setProvExcluirDesahucio(boolean provExcluirDesahucio) {
        this.provExcluirDesahucio = provExcluirDesahucio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (provEmpresa != null ? provEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RhProvisiones)) {
            return false;
        }
        RhProvisiones other = (RhProvisiones) object;
        if ((this.provEmpresa == null && other.provEmpresa != null) || (this.provEmpresa != null && !this.provEmpresa.equals(other.provEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhProvisiones[ provEmpresa=" + provEmpresa + " ]";
    }
    
}
