/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author DEVELOPER
 */
@Entity
@Table(name = "inv_producto_detalle_cuenta_contable", schema = "inventario")
public class InvProductoDetalleCuentaContable implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "det_secuencial")
    private Integer detSecuencial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "det_cuenta")
    private String detCuenta;
    @JoinColumns({
        @JoinColumn(name = "det_empresa", referencedColumnName = "pro_empresa")
        , @JoinColumn(name = "det_producto", referencedColumnName = "pro_codigo_principal")})
    @OneToOne(optional = false)
    private InvProducto invProducto;

    public InvProductoDetalleCuentaContable() {
    }

    public InvProductoDetalleCuentaContable(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public InvProductoDetalleCuentaContable(Integer detSecuencial, String detCuenta) {
        this.detSecuencial = detSecuencial;
        this.detCuenta = detCuenta;
    }

    public Integer getDetSecuencial() {
        return detSecuencial;
    }

    public void setDetSecuencial(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public String getDetCuenta() {
        return detCuenta;
    }

    public void setDetCuenta(String detCuenta) {
        this.detCuenta = detCuenta;
    }

    public InvProducto getInvProducto() {
        return invProducto;
    }

    public void setInvProducto(InvProducto invProducto) {
        this.invProducto = invProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detSecuencial != null ? detSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvProductoDetalleCuentaContable)) {
            return false;
        }
        InvProductoDetalleCuentaContable other = (InvProductoDetalleCuentaContable) object;
        if ((this.detSecuencial == null && other.detSecuencial != null) || (this.detSecuencial != null && !this.detSecuencial.equals(other.detSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvProductoDetalleCuentaContable[ detSecuencial=" + detSecuencial + " ]";
    }
    
}
