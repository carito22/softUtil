/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.*;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author developer3
 */
@Entity
public class InvPedidosDetalleTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "det_secuencial")
    private Integer detSecuencial;
    @Column(name = "det_orden")
    private int detOrden;
    @Column(name = "det_cantidad_solicitada")
    private BigDecimal detCantidadSolicitada;
    @Column(name = "det_cantidad_aprobada")
    private BigDecimal detCantidadAprobada;
    @Column(name = "det_cantidad_adquirida")
    private BigDecimal detCantidadAdquirida;
    @Column(name = "det_precio_referencial")
    private BigDecimal detPrecioReferencial;
    @Column(name = "det_precio_real")
    private BigDecimal detPrecioReal;
    @Column(name = "det_observaciones_registra")
    private String detObservacionesRegistra;
    @Column(name = "det_observaciones_aprueba")
    private String detObservacionesAprueba;
    @Column(name = "det_observaciones_ejecuta")
    private String detObservacionesEjecuta;

    private InvPedidosPK invPedidosPK;
    private InvProductoTO invProductoTO;
    private InvProveedorPK invProveedorPK;

    public InvPedidosDetalleTO() {
    }

    public InvPedidosDetalleTO(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public InvPedidosDetalleTO(Integer detSecuencial, int detOrden, BigDecimal detCantidadSolicitada, BigDecimal detCantidadAprobada, BigDecimal detCantidadAdquirida, BigDecimal detPrecioReferencial, BigDecimal detPrecioReal, String detObservacionesRegistra, String detObservacionesAprueba, String detObservacionesEjecuta, InvPedidosPK invPedidosPK, InvProductoTO invProductoTO, InvProveedorPK invProveedorPK) {
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
        this.invPedidosPK = invPedidosPK;
        this.invProductoTO = invProductoTO;
        this.invProveedorPK = invProveedorPK;
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

    public InvPedidosPK getInvPedidosPK() {
        return invPedidosPK;
    }

    public void setInvPedidosPK(InvPedidosPK invPedidosPK) {
        this.invPedidosPK = invPedidosPK;
    }

    public InvProductoTO getInvProductoTO() {
        return invProductoTO;
    }

    public void setInvProductoTO(InvProductoTO invProductoTO) {
        this.invProductoTO = invProductoTO;
    }

    public InvProveedorPK getInvProveedorPK() {
        return invProveedorPK;
    }

    public void setInvProveedorPK(InvProveedorPK invProveedorPK) {
        this.invProveedorPK = invProveedorPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detSecuencial != null ? detSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof InvPedidosDetalleTO)) {
            return false;
        }
        InvPedidosDetalleTO other = (InvPedidosDetalleTO) object;
        return !((this.detSecuencial == null && other.detSecuencial != null) || (this.detSecuencial != null && !this.detSecuencial.equals(other.detSecuencial)));
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosDetalle[ detSecuencial=" + detSecuencial + " ]";
    }

}
