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
 * @author mario
 */
@Entity
@Table(name = "inv_guia_remision_inp", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvGuiaRemisionInp.findAll", query = "SELECT i FROM InvGuiaRemisionInp i")})
public class InvGuiaRemisionInp implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvGuiaRemisionInpPK invGuiaRemisionInpPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "inp_descripcion")
    private String inpDescripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "inp_inactivo")
    private boolean inpInactivo;

    public InvGuiaRemisionInp() {
    }

    public InvGuiaRemisionInp(InvGuiaRemisionInpPK invGuiaRemisionInpPK) {
        this.invGuiaRemisionInpPK = invGuiaRemisionInpPK;
    }

    public InvGuiaRemisionInp(InvGuiaRemisionInpPK invGuiaRemisionInpPK, String inpDescripcion, boolean inpInactivo) {
        this.invGuiaRemisionInpPK = invGuiaRemisionInpPK;
        this.inpDescripcion = inpDescripcion;
        this.inpInactivo = inpInactivo;
    }

    public InvGuiaRemisionInpPK getInvGuiaRemisionInpPK() {
        return invGuiaRemisionInpPK;
    }

    public void setInvGuiaRemisionInpPK(InvGuiaRemisionInpPK invGuiaRemisionInpPK) {
        this.invGuiaRemisionInpPK = invGuiaRemisionInpPK;
    }

    public String getInpDescripcion() {
        return inpDescripcion;
    }

    public void setInpDescripcion(String inpDescripcion) {
        this.inpDescripcion = inpDescripcion;
    }

    public boolean getInpInactivo() {
        return inpInactivo;
    }

    public void setInpInactivo(boolean inpInactivo) {
        this.inpInactivo = inpInactivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invGuiaRemisionInpPK != null ? invGuiaRemisionInpPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvGuiaRemisionInp)) {
            return false;
        }
        InvGuiaRemisionInp other = (InvGuiaRemisionInp) object;
        if ((this.invGuiaRemisionInpPK == null && other.invGuiaRemisionInpPK != null) || (this.invGuiaRemisionInpPK != null && !this.invGuiaRemisionInpPK.equals(other.invGuiaRemisionInpPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvGuiaRemisionInp[ invGuiaRemisionInpPK=" + invGuiaRemisionInpPK + " ]";
    }
    
}
