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
 * @author mario
 */
@Embeddable
public class InvGuiaRemisionInpPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "inp_empresa")
    private String inpEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "inp_codigo")
    private String inpCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "inp_cli_codigo")
    private String inpCliCodigo;

    public InvGuiaRemisionInpPK() {
    }

    public InvGuiaRemisionInpPK(String inpEmpresa, String inpCodigo, String inpCliCodigo) {
        this.inpEmpresa = inpEmpresa;
        this.inpCodigo = inpCodigo;
        this.inpCliCodigo = inpCliCodigo;
    }

    public String getInpEmpresa() {
        return inpEmpresa;
    }

    public void setInpEmpresa(String inpEmpresa) {
        this.inpEmpresa = inpEmpresa;
    }

    public String getInpCodigo() {
        return inpCodigo;
    }

    public void setInpCodigo(String inpCodigo) {
        this.inpCodigo = inpCodigo;
    }

    public String getInpCliCodigo() {
        return inpCliCodigo;
    }

    public void setInpCliCodigo(String inpCliCodigo) {
        this.inpCliCodigo = inpCliCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (inpEmpresa != null ? inpEmpresa.hashCode() : 0);
        hash += (inpCodigo != null ? inpCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvGuiaRemisionInpPK)) {
            return false;
        }
        InvGuiaRemisionInpPK other = (InvGuiaRemisionInpPK) object;
        if ((this.inpEmpresa == null && other.inpEmpresa != null) || (this.inpEmpresa != null && !this.inpEmpresa.equals(other.inpEmpresa))) {
            return false;
        }
        if ((this.inpCodigo == null && other.inpCodigo != null) || (this.inpCodigo != null && !this.inpCodigo.equals(other.inpCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvGuiaRemisionInpPK[ inpEmpresa=" + inpEmpresa + ", inpCodigo=" + inpCodigo + " ]";
    }
    
}
