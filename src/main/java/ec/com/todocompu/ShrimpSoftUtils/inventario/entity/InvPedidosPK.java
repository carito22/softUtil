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
public class InvPedidosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ped_empresa")
    private String pedEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ped_sector")
    private String pedSector;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ped_motivo")
    private String pedMotivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ped_numero")
    private String pedNumero;

    public InvPedidosPK() {
    }

    public InvPedidosPK(String pedEmpresa, String pedSector, String pedMotivo, String pedNumero) {
        this.pedEmpresa = pedEmpresa;
        this.pedSector = pedSector;
        this.pedMotivo = pedMotivo;
        this.pedNumero = pedNumero;
    }

    public String getPedEmpresa() {
        return pedEmpresa;
    }

    public void setPedEmpresa(String pedEmpresa) {
        this.pedEmpresa = pedEmpresa;
    }

    public String getPedSector() {
        return pedSector;
    }

    public void setPedSector(String pedSector) {
        this.pedSector = pedSector;
    }

    public String getPedMotivo() {
        return pedMotivo;
    }

    public void setPedMotivo(String pedMotivo) {
        this.pedMotivo = pedMotivo;
    }

    public String getPedNumero() {
        return pedNumero;
    }

    public void setPedNumero(String pedNumero) {
        this.pedNumero = pedNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pedEmpresa != null ? pedEmpresa.hashCode() : 0);
        hash += (pedSector != null ? pedSector.hashCode() : 0);
        hash += (pedMotivo != null ? pedMotivo.hashCode() : 0);
        hash += (pedNumero != null ? pedNumero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvPedidosPK)) {
            return false;
        }
        InvPedidosPK other = (InvPedidosPK) object;
        if ((this.pedEmpresa == null && other.pedEmpresa != null) || (this.pedEmpresa != null && !this.pedEmpresa.equals(other.pedEmpresa))) {
            return false;
        }
        if ((this.pedSector == null && other.pedSector != null) || (this.pedSector != null && !this.pedSector.equals(other.pedSector))) {
            return false;
        }
        if ((this.pedMotivo == null && other.pedMotivo != null) || (this.pedMotivo != null && !this.pedMotivo.equals(other.pedMotivo))) {
            return false;
        }
        if ((this.pedNumero == null && other.pedNumero != null) || (this.pedNumero != null && !this.pedNumero.equals(other.pedNumero))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosPK[ pedEmpresa=" + pedEmpresa + ", pedSector=" + pedSector + ", pedMotivo=" + pedMotivo + ", pedNumero=" + pedNumero + " ]";
    }
    
}
