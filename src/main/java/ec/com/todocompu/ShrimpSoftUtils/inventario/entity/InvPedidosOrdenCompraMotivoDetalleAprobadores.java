/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import ec.com.todocompu.ShrimpSoftUtils.inventario.TO.InvOrdenCompraMotivoDetalleAprobadoresTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.entity.SisUsuario;
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

/**
 *
 * @author DEVELOPER
 */
@Entity
@Table(name = "inv_pedidos_orden_compra_motivo_detalle_aprobadores", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvPedidosOrdenCompraMotivoDetalleAprobadores.findAll", query = "SELECT i FROM InvPedidosOrdenCompraMotivoDetalleAprobadores i")})
public class InvPedidosOrdenCompraMotivoDetalleAprobadores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "det_secuencial")
    private Integer detSecuencial;
    @JoinColumns({
        @JoinColumn(name = "usr_codigo", referencedColumnName = "usr_codigo")})
    @ManyToOne
    private SisUsuario sisUsuario;
    @JoinColumns({
        @JoinColumn(name = "ocm_empresa", referencedColumnName = "ocm_empresa")
        , @JoinColumn(name = "ocm_sector", referencedColumnName = "ocm_sector")
        , @JoinColumn(name = "ocm_codigo", referencedColumnName = "ocm_codigo")})
    @ManyToOne(optional = false)
    private InvPedidosOrdenCompraMotivo invPedidosOrdenCompraMotivo;
    @Column(name = "ocm_total_aprobar")
    private BigDecimal ocmTotalAprobar;

    public InvPedidosOrdenCompraMotivoDetalleAprobadores() {
    }

    public InvPedidosOrdenCompraMotivoDetalleAprobadores(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public InvPedidosOrdenCompraMotivoDetalleAprobadores(Integer detSecuencial, SisUsuario sisUsuario) {
        this.detSecuencial = detSecuencial;
        this.sisUsuario = sisUsuario;
    }

    public Integer getDetSecuencial() {
        return detSecuencial;
    }

    public void setDetSecuencial(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public SisUsuario getSisUsuario() {
        return sisUsuario;
    }

    public void setSisUsuario(SisUsuario sisUsuario) {
        this.sisUsuario = sisUsuario;
    }

    public InvPedidosOrdenCompraMotivo getInvPedidosOrdenCompraMotivo() {
        return invPedidosOrdenCompraMotivo;
    }

    public void setInvPedidosOrdenCompraMotivo(InvPedidosOrdenCompraMotivo invPedidosOrdenCompraMotivo) {
        this.invPedidosOrdenCompraMotivo = invPedidosOrdenCompraMotivo;
    }

    public BigDecimal getOcmTotalAprobar() {
        return ocmTotalAprobar;
    }

    public void setOcmTotalAprobar(BigDecimal ocmTotalAprobar) {
        this.ocmTotalAprobar = ocmTotalAprobar;
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
        if (!(object instanceof InvPedidosOrdenCompraMotivoDetalleAprobadores)) {
            return false;
        }
        InvPedidosOrdenCompraMotivoDetalleAprobadores other = (InvPedidosOrdenCompraMotivoDetalleAprobadores) object;
        if ((this.detSecuencial == null && other.detSecuencial != null) || (this.detSecuencial != null && !this.detSecuencial.equals(other.detSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosOrdenCompraMotivoDetalleAprobadores[ detSecuencial=" + detSecuencial + " ]";
    }

    public void convertirObjeto(InvOrdenCompraMotivoDetalleAprobadoresTO aprobador) {
        this.detSecuencial = aprobador.getDetSecuencial();
        this.invPedidosOrdenCompraMotivo = aprobador.getInvPedidosOrdenCompraMotivo();
        this.sisUsuario = new SisUsuario(aprobador.getUsuario().getUsrCodigo());
        this.ocmTotalAprobar = aprobador.getOcmTotalAprobar();
    }

}
