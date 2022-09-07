/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

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
 * @author User
 */
@Entity
@Table(name = "inv_pedidos_orden_compra_detalle", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvPedidosOrdenCompraDetalle.findAll", query = "SELECT i FROM InvPedidosOrdenCompraDetalle i")})
public class InvPedidosOrdenCompraDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "det_secuencial_orden_compra")
    private Integer detSecuencialOrdenCompra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "det_orden")
    private int detOrden;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "det_cantidad")
    private BigDecimal detCantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "det_precio_referencial")
    private BigDecimal detPrecioReferencial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "det_precio_real")
    private BigDecimal detPrecioReal;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "det_observaciones")
    private String detObservaciones;
    @JoinColumn(name = "det_secuencial_pedido", referencedColumnName = "det_secuencial")
    @ManyToOne(optional = false)
    private InvPedidosDetalle invPedidosDetalle;
    @JoinColumns({
        @JoinColumn(name = "oc_empresa", referencedColumnName = "oc_empresa")
        , @JoinColumn(name = "oc_sector", referencedColumnName = "oc_sector")
        , @JoinColumn(name = "oc_motivo", referencedColumnName = "oc_motivo")
        , @JoinColumn(name = "oc_numero", referencedColumnName = "oc_numero")})
    @ManyToOne(optional = false)
    private InvPedidosOrdenCompra invPedidosOrdenCompra;

    public InvPedidosOrdenCompraDetalle() {
    }

    public InvPedidosOrdenCompraDetalle(Integer detSecuencialOrdenCompra) {
        this.detSecuencialOrdenCompra = detSecuencialOrdenCompra;
    }

    public InvPedidosOrdenCompraDetalle(Integer detSecuencialOrdenCompra, int detOrden, BigDecimal detCantidad, BigDecimal detPrecioReferencial, BigDecimal detPrecioReal, String detObservaciones) {
        this.detSecuencialOrdenCompra = detSecuencialOrdenCompra;
        this.detOrden = detOrden;
        this.detCantidad = detCantidad;
        this.detPrecioReferencial = detPrecioReferencial;
        this.detPrecioReal = detPrecioReal;
        this.detObservaciones = detObservaciones;
    }

    public Integer getDetSecuencialOrdenCompra() {
        return detSecuencialOrdenCompra;
    }

    public void setDetSecuencialOrdenCompra(Integer detSecuencialOrdenCompra) {
        this.detSecuencialOrdenCompra = detSecuencialOrdenCompra;
    }

    public int getDetOrden() {
        return detOrden;
    }

    public void setDetOrden(int detOrden) {
        this.detOrden = detOrden;
    }

    public BigDecimal getDetCantidad() {
        return detCantidad;
    }

    public void setDetCantidad(BigDecimal detCantidad) {
        this.detCantidad = detCantidad;
    }

    public BigDecimal getDetPrecioReferencial() {
        return detPrecioReferencial;
    }

    public void setDetPrecioReferencial(BigDecimal detPrecioReferencial) {
        this.detPrecioReferencial = detPrecioReferencial;
    }

    public BigDecimal getDetPrecioReal() {
        return detPrecioReal;
    }

    public void setDetPrecioReal(BigDecimal detPrecioReal) {
        this.detPrecioReal = detPrecioReal;
    }

    public String getDetObservaciones() {
        return detObservaciones;
    }

    public void setDetObservaciones(String detObservaciones) {
        this.detObservaciones = detObservaciones;
    }

    public InvPedidosDetalle getInvPedidosDetalle() {
        return invPedidosDetalle;
    }

    public void setInvPedidosDetalle(InvPedidosDetalle invPedidosDetalle) {
        this.invPedidosDetalle = invPedidosDetalle;
    }

    public InvPedidosOrdenCompra getInvPedidosOrdenCompra() {
        return invPedidosOrdenCompra;
    }

    public void setInvPedidosOrdenCompra(InvPedidosOrdenCompra invPedidosOrdenCompra) {
        this.invPedidosOrdenCompra = invPedidosOrdenCompra;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detSecuencialOrdenCompra != null ? detSecuencialOrdenCompra.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvPedidosOrdenCompraDetalle)) {
            return false;
        }
        InvPedidosOrdenCompraDetalle other = (InvPedidosOrdenCompraDetalle) object;
        if ((this.detSecuencialOrdenCompra == null && other.detSecuencialOrdenCompra != null) || (this.detSecuencialOrdenCompra != null && !this.detSecuencialOrdenCompra.equals(other.detSecuencialOrdenCompra))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosOrdenCompraDetalle[ detSecuencialOrdenCompra=" + detSecuencialOrdenCompra + " ]";
    }
    
}
