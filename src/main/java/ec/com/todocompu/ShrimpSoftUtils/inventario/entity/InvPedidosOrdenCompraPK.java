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
public class InvPedidosOrdenCompraPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "oc_empresa")
    private String ocEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "oc_sector")
    private String ocSector;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "oc_motivo")
    private String ocMotivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "oc_numero")
    private String ocNumero;

    public InvPedidosOrdenCompraPK() {
    }

    public InvPedidosOrdenCompraPK(String ocEmpresa, String ocSector, String ocMotivo, String ocNumero) {
        this.ocEmpresa = ocEmpresa;
        this.ocSector = ocSector;
        this.ocMotivo = ocMotivo;
        this.ocNumero = ocNumero;
    }

    public String getOcEmpresa() {
        return ocEmpresa;
    }

    public void setOcEmpresa(String ocEmpresa) {
        this.ocEmpresa = ocEmpresa;
    }

    public String getOcSector() {
        return ocSector;
    }

    public void setOcSector(String ocSector) {
        this.ocSector = ocSector;
    }

    public String getOcMotivo() {
        return ocMotivo;
    }

    public void setOcMotivo(String ocMotivo) {
        this.ocMotivo = ocMotivo;
    }

    public String getOcNumero() {
        return ocNumero;
    }

    public void setOcNumero(String ocNumero) {
        this.ocNumero = ocNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ocEmpresa != null ? ocEmpresa.hashCode() : 0);
        hash += (ocSector != null ? ocSector.hashCode() : 0);
        hash += (ocMotivo != null ? ocMotivo.hashCode() : 0);
        hash += (ocNumero != null ? ocNumero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvPedidosOrdenCompraPK)) {
            return false;
        }
        InvPedidosOrdenCompraPK other = (InvPedidosOrdenCompraPK) object;
        if ((this.ocEmpresa == null && other.ocEmpresa != null) || (this.ocEmpresa != null && !this.ocEmpresa.equals(other.ocEmpresa))) {
            return false;
        }
        if ((this.ocSector == null && other.ocSector != null) || (this.ocSector != null && !this.ocSector.equals(other.ocSector))) {
            return false;
        }
        if ((this.ocMotivo == null && other.ocMotivo != null) || (this.ocMotivo != null && !this.ocMotivo.equals(other.ocMotivo))) {
            return false;
        }
        if ((this.ocNumero == null && other.ocNumero != null) || (this.ocNumero != null && !this.ocNumero.equals(other.ocNumero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosOrdenCompraPK[ ocEmpresa=" + ocEmpresa + ", ocSector=" + ocSector + ", ocMotivo=" + ocMotivo + ", ocNumero=" + ocNumero + " ]";
    }

}
