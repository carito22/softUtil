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
 * @author User
 */
@Embeddable
public class InvPedidosOrdenCompraNumeracionPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "num_empresa")
    private String numEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "num_sector")
    private String numSector;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "num_motivo")
    private String numMotivo;

    public InvPedidosOrdenCompraNumeracionPK() {
    }

    public InvPedidosOrdenCompraNumeracionPK(String numEmpresa, String numSector, String numMotivo) {
        this.numEmpresa = numEmpresa;
        this.numSector = numSector;
        this.numMotivo = numMotivo;
    }

    public String getNumEmpresa() {
        return numEmpresa;
    }

    public void setNumEmpresa(String numEmpresa) {
        this.numEmpresa = numEmpresa;
    }

    public String getNumSector() {
        return numSector;
    }

    public void setNumSector(String numSector) {
        this.numSector = numSector;
    }

    public String getNumMotivo() {
        return numMotivo;
    }

    public void setNumMotivo(String numMotivo) {
        this.numMotivo = numMotivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numEmpresa != null ? numEmpresa.hashCode() : 0);
        hash += (numSector != null ? numSector.hashCode() : 0);
        hash += (numMotivo != null ? numMotivo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvPedidosOrdenCompraNumeracionPK)) {
            return false;
        }
        InvPedidosOrdenCompraNumeracionPK other = (InvPedidosOrdenCompraNumeracionPK) object;
        if ((this.numEmpresa == null && other.numEmpresa != null) || (this.numEmpresa != null && !this.numEmpresa.equals(other.numEmpresa))) {
            return false;
        }
        if ((this.numSector == null && other.numSector != null) || (this.numSector != null && !this.numSector.equals(other.numSector))) {
            return false;
        }
        if ((this.numMotivo == null && other.numMotivo != null) || (this.numMotivo != null && !this.numMotivo.equals(other.numMotivo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosOrdenCompraNumeracionPK[ numEmpresa=" + numEmpresa + ", numSector=" + numSector + ", numMotivo=" + numMotivo + " ]";
    }
    
}
