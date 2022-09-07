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
 * @author Developer0
 */
@Entity
@Table(name = "inv_pedidos_numeracion", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvPedidosNumeracion.findAll", query = "SELECT i FROM InvPedidosNumeracion i")})
public class InvPedidosNumeracion implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvPedidosNumeracionPK invPedidosNumeracionPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "num_secuencia")
    private String numSecuencia;

    public InvPedidosNumeracion() {
    }

    public InvPedidosNumeracion(InvPedidosNumeracionPK invPedidosNumeracionPK) {
        this.invPedidosNumeracionPK = invPedidosNumeracionPK;
    }

    public InvPedidosNumeracion(InvPedidosNumeracionPK invPedidosNumeracionPK, String numSecuencia) {
        this.invPedidosNumeracionPK = invPedidosNumeracionPK;
        this.numSecuencia = numSecuencia;
    }

    public InvPedidosNumeracion(String numEmpresa, String numMotivo) {
        this.invPedidosNumeracionPK = new InvPedidosNumeracionPK(numEmpresa, numMotivo);
    }

    public InvPedidosNumeracionPK getInvPedidosNumeracionPK() {
        return invPedidosNumeracionPK;
    }

    public void setInvPedidosNumeracionPK(InvPedidosNumeracionPK invPedidosNumeracionPK) {
        this.invPedidosNumeracionPK = invPedidosNumeracionPK;
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
        hash += (invPedidosNumeracionPK != null ? invPedidosNumeracionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvPedidosNumeracion)) {
            return false;
        }
        InvPedidosNumeracion other = (InvPedidosNumeracion) object;
        if ((this.invPedidosNumeracionPK == null && other.invPedidosNumeracionPK != null) || (this.invPedidosNumeracionPK != null && !this.invPedidosNumeracionPK.equals(other.invPedidosNumeracionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosNumeracion[ invPedidosNumeracionPK=" + invPedidosNumeracionPK + " ]";
    }
    
}
