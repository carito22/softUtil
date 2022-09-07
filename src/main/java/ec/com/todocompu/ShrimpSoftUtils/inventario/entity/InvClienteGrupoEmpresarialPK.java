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
public class InvClienteGrupoEmpresarialPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ge_empresa")
    private String geEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ge_codigo")
    private String geCodigo;

    public InvClienteGrupoEmpresarialPK() {
    }

    public InvClienteGrupoEmpresarialPK(String geEmpresa, String geCodigo) {
        this.geEmpresa = geEmpresa;
        this.geCodigo = geCodigo;
    }

    public String getGeEmpresa() {
        return geEmpresa;
    }

    public void setGeEmpresa(String geEmpresa) {
        this.geEmpresa = geEmpresa;
    }

    public String getGeCodigo() {
        return geCodigo;
    }

    public void setGeCodigo(String geCodigo) {
        this.geCodigo = geCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (geEmpresa != null ? geEmpresa.hashCode() : 0);
        hash += (geCodigo != null ? geCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvClienteGrupoEmpresarialPK)) {
            return false;
        }
        InvClienteGrupoEmpresarialPK other = (InvClienteGrupoEmpresarialPK) object;
        if ((this.geEmpresa == null && other.geEmpresa != null) || (this.geEmpresa != null && !this.geEmpresa.equals(other.geEmpresa))) {
            return false;
        }
        if ((this.geCodigo == null && other.geCodigo != null) || (this.geCodigo != null && !this.geCodigo.equals(other.geCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvClienteGrupoEmpresarialPK[ geEmpresa=" + geEmpresa + ", geCodigo=" + geCodigo + " ]";
    }
    
}
