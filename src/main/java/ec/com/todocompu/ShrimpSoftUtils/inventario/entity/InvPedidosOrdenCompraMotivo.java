/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import ec.com.todocompu.ShrimpSoftUtils.sistema.entity.SisEmpresaNotificaciones;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Developer0
 */
@Entity
@Table(name = "inv_pedidos_orden_compra_motivo", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvPedidosOrdenCompraMotivo.findAll", query = "SELECT i FROM InvPedidosOrdenCompraMotivo i")})
public class InvPedidosOrdenCompraMotivo implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvPedidosOrdenCompraMotivoPK invPedidosOrdenCompraMotivoPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ocm_detalle")
    private String ocmDetalle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ocm_costo_fijo")
    private boolean ocmCostoFijo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ocm_aprobacion_automatica")
    private boolean ocmAprobacionAutomatica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ocm_notificar_aprobador")
    private boolean ocmNotificarAprobador;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ocm_notificar_proveedor")
    private boolean ocmNotificarProveedor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usr_fecha_inserta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ocm_inactivo")
    private boolean ocmInactivo;
    @JoinColumn(name = "id_notificaciones", referencedColumnName = "id")
    @ManyToOne(optional = true)
    private SisEmpresaNotificaciones idNotificaciones;

    public InvPedidosOrdenCompraMotivo() {
    }

    public InvPedidosOrdenCompraMotivo(InvPedidosOrdenCompraMotivoPK invPedidosOrdenCompraMotivoPK) {
        this.invPedidosOrdenCompraMotivoPK = invPedidosOrdenCompraMotivoPK;
    }

    public InvPedidosOrdenCompraMotivo(InvPedidosOrdenCompraMotivoPK invPedidosOrdenCompraMotivoPK, String ocmDetalle, String usrCodigo, Date usrFechaInserta) {
        this.invPedidosOrdenCompraMotivoPK = invPedidosOrdenCompraMotivoPK;
        this.ocmDetalle = ocmDetalle;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public InvPedidosOrdenCompraMotivo(String ocmEmpresa, String ocmSector, String ocmCodigo) {
        this.invPedidosOrdenCompraMotivoPK = new InvPedidosOrdenCompraMotivoPK(ocmEmpresa, ocmSector, ocmCodigo);
    }

    public InvPedidosOrdenCompraMotivoPK getInvPedidosOrdenCompraMotivoPK() {
        return invPedidosOrdenCompraMotivoPK;
    }

    public void setInvPedidosOrdenCompraMotivoPK(InvPedidosOrdenCompraMotivoPK invPedidosOrdenCompraMotivoPK) {
        this.invPedidosOrdenCompraMotivoPK = invPedidosOrdenCompraMotivoPK;
    }

    public String getOcmDetalle() {
        return ocmDetalle;
    }

    public void setOcmDetalle(String ocmDetalle) {
        this.ocmDetalle = ocmDetalle;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invPedidosOrdenCompraMotivoPK != null ? invPedidosOrdenCompraMotivoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvPedidosOrdenCompraMotivo)) {
            return false;
        }
        InvPedidosOrdenCompraMotivo other = (InvPedidosOrdenCompraMotivo) object;
        if ((this.invPedidosOrdenCompraMotivoPK == null && other.invPedidosOrdenCompraMotivoPK != null) || (this.invPedidosOrdenCompraMotivoPK != null && !this.invPedidosOrdenCompraMotivoPK.equals(other.invPedidosOrdenCompraMotivoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosOrdenCompraMotivo[ invPedidosOrdenCompraMotivoPK=" + invPedidosOrdenCompraMotivoPK + " ]";
    }

    public boolean getOcmNotificarProveedor() {
        return ocmNotificarProveedor;
    }

    public void setOcmNotificarProveedor(boolean ocmNotificarProveedor) {
        this.ocmNotificarProveedor = ocmNotificarProveedor;
    }

    public boolean getOcmAprobacionAutomatica() {
        return ocmAprobacionAutomatica;
    }

    public void setOcmAprobacionAutomatica(boolean ocmAprobacionAutomatica) {
        this.ocmAprobacionAutomatica = ocmAprobacionAutomatica;
    }

    public boolean getOcmCostoFijo() {
        return ocmCostoFijo;
    }

    public void setOcmCostoFijo(boolean ocmCostoFijo) {
        this.ocmCostoFijo = ocmCostoFijo;
    }

    public boolean isOcmNotificarAprobador() {
        return ocmNotificarAprobador;
    }

    public void setOcmNotificarAprobador(boolean ocmNotificarAprobador) {
        this.ocmNotificarAprobador = ocmNotificarAprobador;
    }

    public boolean isOcmInactivo() {
        return ocmInactivo;
    }

    public void setOcmInactivo(boolean ocmInactivo) {
        this.ocmInactivo = ocmInactivo;
    }

    public SisEmpresaNotificaciones getIdNotificaciones() {
        return idNotificaciones;
    }

    public void setIdNotificaciones(SisEmpresaNotificaciones idNotificaciones) {
        this.idNotificaciones = idNotificaciones;
    }

}
