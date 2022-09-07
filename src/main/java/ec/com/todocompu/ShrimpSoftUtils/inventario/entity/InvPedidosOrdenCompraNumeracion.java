/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author User
 */
@Entity
@Table(name = "inv_pedidos_orden_compra_numeracion", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvPedidosOrdenCompraNumeracion.findAll", query = "SELECT i FROM InvPedidosOrdenCompraNumeracion i")})
public class InvPedidosOrdenCompraNumeracion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvPedidosOrdenCompraNumeracionPK invPedidosOrdenCompraNumeracionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "num_secuencia")
    private String numSecuencia;

    public InvPedidosOrdenCompraNumeracion() {
    }

    public InvPedidosOrdenCompraNumeracion(InvPedidosOrdenCompraNumeracionPK invPedidosOrdenCompraNumeracionPK) {
        this.invPedidosOrdenCompraNumeracionPK = invPedidosOrdenCompraNumeracionPK;
    }

    public InvPedidosOrdenCompraNumeracion(InvPedidosOrdenCompraNumeracionPK invPedidosOrdenCompraNumeracionPK, String numSecuencia) {
        this.invPedidosOrdenCompraNumeracionPK = invPedidosOrdenCompraNumeracionPK;
        this.numSecuencia = numSecuencia;
    }

    public InvPedidosOrdenCompraNumeracion(String numEmpresa, String numSector, String numMotivo) {
        this.invPedidosOrdenCompraNumeracionPK = new InvPedidosOrdenCompraNumeracionPK(numEmpresa, numSector, numMotivo);
    }

    public InvPedidosOrdenCompraNumeracionPK getInvPedidosOrdenCompraNumeracionPK() {
        return invPedidosOrdenCompraNumeracionPK;
    }

    public void setInvPedidosOrdenCompraNumeracionPK(InvPedidosOrdenCompraNumeracionPK invPedidosOrdenCompraNumeracionPK) {
        this.invPedidosOrdenCompraNumeracionPK = invPedidosOrdenCompraNumeracionPK;
    }

    public String getNumSecuencia() {
        return numSecuencia;
    }

    public void setNumSecuencia(String numSecuencia) {
        this.numSecuencia = numSecuencia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invPedidosOrdenCompraNumeracionPK != null ? invPedidosOrdenCompraNumeracionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvPedidosOrdenCompraNumeracion)) {
            return false;
        }
        InvPedidosOrdenCompraNumeracion other = (InvPedidosOrdenCompraNumeracion) object;
        if ((this.invPedidosOrdenCompraNumeracionPK == null && other.invPedidosOrdenCompraNumeracionPK != null) || (this.invPedidosOrdenCompraNumeracionPK != null && !this.invPedidosOrdenCompraNumeracionPK.equals(other.invPedidosOrdenCompraNumeracionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosOrdenCompraNumeracion[ invPedidosOrdenCompraNumeracionPK=" + invPedidosOrdenCompraNumeracionPK + " ]";
    }
    
}
