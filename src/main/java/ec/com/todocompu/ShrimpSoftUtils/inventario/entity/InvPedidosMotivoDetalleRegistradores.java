/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import ec.com.todocompu.ShrimpSoftUtils.inventario.TO.InvPedidosMotivoDetalleRegistradoresTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.entity.SisUsuario;
import java.io.Serializable;
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

/**
 *
 * @author Developer0
 */
@Entity
@Table(name = "inv_pedidos_motivo_detalle_registradores", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvPedidosMotivoDetalleRegistradores.findAll", query = "SELECT i FROM InvPedidosMotivoDetalleRegistradores i")})
public class InvPedidosMotivoDetalleRegistradores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "det_secuencial")
    private Integer detSecuencial;
    @JoinColumns({
        @JoinColumn(name = "pm_empresa", referencedColumnName = "pm_empresa")
        , @JoinColumn(name = "pm_sector", referencedColumnName = "pm_sector")
        , @JoinColumn(name = "pm_codigo", referencedColumnName = "pm_codigo")})
    @ManyToOne(optional = false)
    private InvPedidosMotivo invPedidosMotivo;
    @JoinColumns({
        @JoinColumn(name = "usr_codigo", referencedColumnName = "usr_codigo")})
    @ManyToOne
    private SisUsuario sisUsuario;

    public InvPedidosMotivoDetalleRegistradores() {
    }

    public InvPedidosMotivoDetalleRegistradores(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public InvPedidosMotivoDetalleRegistradores(Integer detSecuencial, SisUsuario sisUsuario) {
        this.detSecuencial = detSecuencial;
        this.sisUsuario = sisUsuario;
    }

    public Integer getDetSecuencial() {
        return detSecuencial;
    }

    public void setDetSecuencial(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public InvPedidosMotivo getInvPedidosMotivo() {
        return invPedidosMotivo;
    }

    public void setInvPedidosMotivo(InvPedidosMotivo invPedidosMotivo) {
        this.invPedidosMotivo = invPedidosMotivo;
    }

    public SisUsuario getSisUsuario() {
        return sisUsuario;
    }

    public void setSisUsuario(SisUsuario sisUsuario) {
        this.sisUsuario = sisUsuario;
    }

    public void convertirObjeto(InvPedidosMotivoDetalleRegistradoresTO invPedidosMotivoDetalleRegistradoresTO) {
        this.detSecuencial = invPedidosMotivoDetalleRegistradoresTO.getDetSecuencial();
        this.invPedidosMotivo = new InvPedidosMotivo(invPedidosMotivoDetalleRegistradoresTO.getInvPedidosMotivoTO().getPmEmpresa(), invPedidosMotivoDetalleRegistradoresTO.getInvPedidosMotivoTO().getPmSector(), invPedidosMotivoDetalleRegistradoresTO.getInvPedidosMotivoTO().getPmCodigo());
        this.sisUsuario = new SisUsuario(invPedidosMotivoDetalleRegistradoresTO.getUsuario().getUsrCodigo());
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
        if (!(object instanceof InvPedidosMotivoDetalleRegistradores)) {
            return false;
        }
        InvPedidosMotivoDetalleRegistradores other = (InvPedidosMotivoDetalleRegistradores) object;
        if ((this.detSecuencial == null && other.detSecuencial != null) || (this.detSecuencial != null && !this.detSecuencial.equals(other.detSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosMotivoDetalleRegistradores[ detSecuencial=" + detSecuencial + " ]";
    }
    
}
