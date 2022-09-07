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
 * @author DEVELOPER
 */
@Embeddable
public class InvProductoSubcategoriaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "scat_empresa")
    private String scatEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "scat_codigo")
    private String scatCodigo;

    public InvProductoSubcategoriaPK() {
    }

    public InvProductoSubcategoriaPK(String scatEmpresa, String scatCodigo) {
        this.scatEmpresa = scatEmpresa;
        this.scatCodigo = scatCodigo;
    }

    public String getScatEmpresa() {
        return scatEmpresa;
    }

    public void setScatEmpresa(String scatEmpresa) {
        this.scatEmpresa = scatEmpresa;
    }

    public String getScatCodigo() {
        return scatCodigo;
    }

    public void setScatCodigo(String scatCodigo) {
        this.scatCodigo = scatCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (scatEmpresa != null ? scatEmpresa.hashCode() : 0);
        hash += (scatCodigo != null ? scatCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvProductoSubcategoriaPK)) {
            return false;
        }
        InvProductoSubcategoriaPK other = (InvProductoSubcategoriaPK) object;
        if ((this.scatEmpresa == null && other.scatEmpresa != null) || (this.scatEmpresa != null && !this.scatEmpresa.equals(other.scatEmpresa))) {
            return false;
        }
        if ((this.scatCodigo == null && other.scatCodigo != null) || (this.scatCodigo != null && !this.scatCodigo.equals(other.scatCodigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvProductoSubcategoriaPK[ scatEmpresa=" + scatEmpresa + ", scatCodigo=" + scatCodigo + " ]";
    }
    
}
