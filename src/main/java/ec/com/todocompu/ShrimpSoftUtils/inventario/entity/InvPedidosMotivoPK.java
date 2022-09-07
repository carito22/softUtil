/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Developer0
 */
@Embeddable
public class InvPedidosMotivoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "pm_empresa")
    private String pmEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "pm_sector")
    private String pmSector;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "pm_codigo")
    private String pmCodigo;

    public InvPedidosMotivoPK() {
    }

    public InvPedidosMotivoPK(String pmEmpresa, String pmSector, String pmCodigo) {
        this.pmEmpresa = pmEmpresa;
        this.pmSector = pmSector;
        this.pmCodigo = pmCodigo;
    }

    public String getPmEmpresa() {
        return pmEmpresa;
    }

    public void setPmEmpresa(String pmEmpresa) {
        this.pmEmpresa = pmEmpresa;
    }

    public String getPmSector() {
        return pmSector;
    }

    public void setPmSector(String pmSector) {
        this.pmSector = pmSector;
    }

    public String getPmCodigo() {
        return pmCodigo;
    }

    public void setPmCodigo(String pmCodigo) {
        this.pmCodigo = pmCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pmEmpresa != null ? pmEmpresa.hashCode() : 0);
        hash += (pmSector != null ? pmSector.hashCode() : 0);
        hash += (pmCodigo != null ? pmCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvPedidosMotivoPK)) {
            return false;
        }
        InvPedidosMotivoPK other = (InvPedidosMotivoPK) object;
        if ((this.pmEmpresa == null && other.pmEmpresa != null) || (this.pmEmpresa != null && !this.pmEmpresa.equals(other.pmEmpresa))) {
            return false;
        }
        if ((this.pmSector == null && other.pmSector != null) || (this.pmSector != null && !this.pmSector.equals(other.pmSector))) {
            return false;
        }
        if ((this.pmCodigo == null && other.pmCodigo != null) || (this.pmCodigo != null && !this.pmCodigo.equals(other.pmCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosMotivoPK[ pmEmpresa=" + pmEmpresa + ", pmSector=" + pmSector + ", pmCodigo=" + pmCodigo + " ]";
    }
    
}
