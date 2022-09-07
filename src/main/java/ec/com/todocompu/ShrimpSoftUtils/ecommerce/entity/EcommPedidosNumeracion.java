/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.ecommerce.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "ecomm_pedidos_numeracion", schema = "ecommerce")
@NamedQueries({
    @NamedQuery(name = "EcommPedidosNumeracion.findAll", query = "SELECT e FROM EcommPedidosNumeracion e")})
public class EcommPedidosNumeracion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "num_empresa")
    private String numEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "num_secuencia")
    private String numSecuencia;

    public EcommPedidosNumeracion() {
    }

    public EcommPedidosNumeracion(String numEmpresa) {
        this.numEmpresa = numEmpresa;
    }

    public EcommPedidosNumeracion(String numEmpresa, String numSecuencia) {
        this.numEmpresa = numEmpresa;
        this.numSecuencia = numSecuencia;
    }

    public String getNumEmpresa() {
        return numEmpresa;
    }

    public void setNumEmpresa(String numEmpresa) {
        this.numEmpresa = numEmpresa;
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
        hash += (numEmpresa != null ? numEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcommPedidosNumeracion)) {
            return false;
        }
        EcommPedidosNumeracion other = (EcommPedidosNumeracion) object;
        if ((this.numEmpresa == null && other.numEmpresa != null) || (this.numEmpresa != null && !this.numEmpresa.equals(other.numEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.ecommerce.entity.EcommPedidosNumeracion[ numEmpresa=" + numEmpresa + " ]";
    }
    
}
