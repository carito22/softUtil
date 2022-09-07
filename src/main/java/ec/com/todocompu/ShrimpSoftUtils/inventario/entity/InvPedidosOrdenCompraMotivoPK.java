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
public class InvPedidosOrdenCompraMotivoPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ocm_empresa")
    private String ocmEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ocm_sector")
    private String ocmSector;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ocm_codigo")
    private String ocmCodigo;

    public InvPedidosOrdenCompraMotivoPK() {
    }

    public InvPedidosOrdenCompraMotivoPK(String ocmEmpresa, String ocmSector, String ocmCodigo) {
        this.ocmEmpresa = ocmEmpresa;
        this.ocmSector = ocmSector;
        this.ocmCodigo = ocmCodigo;
    }

    public String getOcmEmpresa() {
        return ocmEmpresa;
    }

    public void setOcmEmpresa(String ocmEmpresa) {
        this.ocmEmpresa = ocmEmpresa;
    }

    public String getOcmSector() {
        return ocmSector;
    }

    public void setOcmSector(String ocmSector) {
        this.ocmSector = ocmSector;
    }

    public String getOcmCodigo() {
        return ocmCodigo;
    }

    public void setOcmCodigo(String ocmCodigo) {
        this.ocmCodigo = ocmCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocmEmpresa != null ? ocmEmpresa.hashCode() : 0);
        hash += (ocmSector != null ? ocmSector.hashCode() : 0);
        hash += (ocmCodigo != null ? ocmCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvPedidosOrdenCompraMotivoPK)) {
            return false;
        }
        InvPedidosOrdenCompraMotivoPK other = (InvPedidosOrdenCompraMotivoPK) object;
        if ((this.ocmEmpresa == null && other.ocmEmpresa != null) || (this.ocmEmpresa != null && !this.ocmEmpresa.equals(other.ocmEmpresa))) {
            return false;
        }
        if ((this.ocmSector == null && other.ocmSector != null) || (this.ocmSector != null && !this.ocmSector.equals(other.ocmSector))) {
            return false;
        }
        if ((this.ocmCodigo == null && other.ocmCodigo != null) || (this.ocmCodigo != null && !this.ocmCodigo.equals(other.ocmCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosOrdenCompraMotivoPK[ ocmEmpresa=" + ocmEmpresa + ", ocmSector=" + ocmSector + ", ocmCodigo=" + ocmCodigo + " ]";
    }
    
}
