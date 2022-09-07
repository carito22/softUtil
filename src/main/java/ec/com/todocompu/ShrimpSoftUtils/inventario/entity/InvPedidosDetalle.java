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
 * @author Developer0
 */
@Entity
@Table(name = "inv_pedidos_detalle", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvPedidosDetalle.findAll", query = "SELECT i FROM InvPedidosDetalle i")})
public class InvPedidosDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "det_secuencial")
    private Integer detSecuencial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "det_orden")
    private int detOrden;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "det_cantidad_solicitada")
    private BigDecimal detCantidadSolicitada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "det_cantidad_aprobada")
    private BigDecimal detCantidadAprobada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "det_cantidad_adquirida")
    private BigDecimal detCantidadAdquirida;
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
    @Column(name = "det_observaciones_registra")
    private String detObservacionesRegistra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "det_observaciones_aprueba")
    private String detObservacionesAprueba;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "det_observaciones_ejecuta")
    private String detObservacionesEjecuta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "det_completado")
    private boolean detCompletado;
    @JoinColumns({
        @JoinColumn(name = "ped_empresa", referencedColumnName = "ped_empresa")
        , @JoinColumn(name = "ped_sector", referencedColumnName = "ped_sector")
        , @JoinColumn(name = "ped_motivo", referencedColumnName = "ped_motivo")
        , @JoinColumn(name = "ped_numero", referencedColumnName = "ped_numero")})
    @ManyToOne(optional = false)
    private InvPedidos invPedidos;
    @JoinColumns({
        @JoinColumn(name = "pro_empresa", referencedColumnName = "pro_empresa")
        , @JoinColumn(name = "pro_codigo_principal", referencedColumnName = "pro_codigo_principal")})
    @ManyToOne(optional = false)
    private InvProducto invProducto;

    public InvPedidosDetalle() {
    }

    public InvPedidosDetalle(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public InvPedidosDetalle(Integer detSecuencial, int detOrden, BigDecimal detCantidadSolicitada, BigDecimal detCantidadAprobada, BigDecimal detCantidadAdquirida, BigDecimal detPrecioReferencial, BigDecimal detPrecioReal, String detObservacionesRegistra, String detObservacionesAprueba, String detObservacionesEjecuta) {
        this.detSecuencial = detSecuencial;
        this.detOrden = detOrden;
        this.detCantidadSolicitada = detCantidadSolicitada;
        this.detCantidadAprobada = detCantidadAprobada;
        this.detCantidadAdquirida = detCantidadAdquirida;
        this.detPrecioReferencial = detPrecioReferencial;
        this.detPrecioReal = detPrecioReal;
        this.detObservacionesRegistra = detObservacionesRegistra;
        this.detObservacionesAprueba = detObservacionesAprueba;
        this.detObservacionesEjecuta = detObservacionesEjecuta;
    }

    public Integer getDetSecuencial() {
        return detSecuencial;
    }

    public void setDetSecuencial(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public int getDetOrden() {
        return detOrden;
    }

    public void setDetOrden(int detOrden) {
        this.detOrden = detOrden;
    }

    public BigDecimal getDetCantidadSolicitada() {
        return detCantidadSolicitada;
    }

    public void setDetCantidadSolicitada(BigDecimal detCantidadSolicitada) {
        this.detCantidadSolicitada = detCantidadSolicitada;
    }

    public BigDecimal getDetCantidadAprobada() {
        return detCantidadAprobada;
    }

    public void setDetCantidadAprobada(BigDecimal detCantidadAprobada) {
        this.detCantidadAprobada = detCantidadAprobada;
    }

    public BigDecimal getDetCantidadAdquirida() {
        return detCantidadAdquirida;
    }

    public void setDetCantidadAdquirida(BigDecimal detCantidadAdquirida) {
        this.detCantidadAdquirida = detCantidadAdquirida;
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

    public String getDetObservacionesRegistra() {
        return detObservacionesRegistra;
    }

    public void setDetObservacionesRegistra(String detObservacionesRegistra) {
        this.detObservacionesRegistra = detObservacionesRegistra;
    }

    public String getDetObservacionesAprueba() {
        return detObservacionesAprueba;
    }

    public void setDetObservacionesAprueba(String detObservacionesAprueba) {
        this.detObservacionesAprueba = detObservacionesAprueba;
    }

    public String getDetObservacionesEjecuta() {
        return detObservacionesEjecuta;
    }

    public void setDetObservacionesEjecuta(String detObservacionesEjecuta) {
        this.detObservacionesEjecuta = detObservacionesEjecuta;
    }

    public InvPedidos getInvPedidos() {
        return invPedidos;
    }

    public void setInvPedidos(InvPedidos invPedidos) {
        this.invPedidos = invPedidos;
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
        if (!(object instanceof InvPedidosDetalle)) {
            return false;
        }
        InvPedidosDetalle other = (InvPedidosDetalle) object;
        if ((this.detSecuencial == null && other.detSecuencial != null) || (this.detSecuencial != null && !this.detSecuencial.equals(other.detSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosDetalle[ detSecuencial=" + detSecuencial + " ]";
    }

    public boolean getDetCompletado() {
        return detCompletado;
    }

    public void setDetCompletado(boolean detCompletado) {
        this.detCompletado = detCompletado;
    }

}
