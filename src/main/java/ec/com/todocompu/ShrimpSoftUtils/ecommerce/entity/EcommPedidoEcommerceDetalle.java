/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.ecommerce.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "ecomm_pedido_ecommerce_detalle", schema = "ecommerce")
@NamedQueries({
    @NamedQuery(name = "EcommPedidoEcommerceDetalle.findAll", query = "SELECT e FROM EcommPedidoEcommerceDetalle e")})
public class EcommPedidoEcommerceDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "edet_secuencial")
    private Integer edetSecuencial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "pro_codigo_principal")
    private String proCodigoPrincipal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "pro_empresa")
    private String proEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "pro_nombre")
    private String proNombre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "edet_precio")
    private BigDecimal edetPrecio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "edet_cantidad")
    private BigDecimal edetCantidad;
    @JoinColumns({
        @JoinColumn(name = "e_codigo_pedido", referencedColumnName = "e_codigo_pedido")
        , @JoinColumn(name = "e_empresa", referencedColumnName = "e_empresa")})
    @ManyToOne(optional = false)
    private EcommPedidoEcommerce ecommPedidoEcommerce;

    public EcommPedidoEcommerceDetalle() {
    }

    public EcommPedidoEcommerceDetalle(Integer edetSecuencial) {
        this.edetSecuencial = edetSecuencial;
    }

    public EcommPedidoEcommerceDetalle(Integer edetSecuencial, String proCodigoPrincipal, String proEmpresa, BigDecimal edetPrecio, BigDecimal edetCantidad) {
        this.edetSecuencial = edetSecuencial;
        this.proCodigoPrincipal = proCodigoPrincipal;
        this.proEmpresa = proEmpresa;
        this.edetPrecio = edetPrecio;
        this.edetCantidad = edetCantidad;
    }

    public Integer getEdetSecuencial() {
        return edetSecuencial;
    }

    public void setEdetSecuencial(Integer edetSecuencial) {
        this.edetSecuencial = edetSecuencial;
    }

    public String getProCodigoPrincipal() {
        return proCodigoPrincipal;
    }

    public void setProCodigoPrincipal(String proCodigoPrincipal) {
        this.proCodigoPrincipal = proCodigoPrincipal;
    }

    public String getProEmpresa() {
        return proEmpresa;
    }

    public void setProEmpresa(String proEmpresa) {
        this.proEmpresa = proEmpresa;
    }

    public BigDecimal getEdetPrecio() {
        return edetPrecio;
    }

    public void setEdetPrecio(BigDecimal edetPrecio) {
        this.edetPrecio = edetPrecio;
    }

    public BigDecimal getEdetCantidad() {
        return edetCantidad;
    }

    public void setEdetCantidad(BigDecimal edetCantidad) {
        this.edetCantidad = edetCantidad;
    }

    public EcommPedidoEcommerce getEcommPedidoEcommerce() {
        return ecommPedidoEcommerce;
    }

    public void setEcommPedidoEcommerce(EcommPedidoEcommerce ecommPedidoEcommerce) {
        this.ecommPedidoEcommerce = ecommPedidoEcommerce;
    }

    public String getProNombre() {
        return proNombre;
    }

    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (edetSecuencial != null ? edetSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EcommPedidoEcommerceDetalle)) {
            return false;
        }
        EcommPedidoEcommerceDetalle other = (EcommPedidoEcommerceDetalle) object;
        if ((this.edetSecuencial == null && other.edetSecuencial != null) || (this.edetSecuencial != null && !this.edetSecuencial.equals(other.edetSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.ecommerce.entity.EcommPedidoEcommerceDetalle[ edetSecuencial=" + edetSecuencial + " ]";
    }
    
}
