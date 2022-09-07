/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosOrdenCompraMotivo;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosOrdenCompraMotivoDetalleAprobadores;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisListaUsuarioTO;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author developer3
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvOrdenCompraMotivoDetalleAprobadoresTO implements Serializable {

    private Integer detSecuencial;
    private InvPedidosOrdenCompraMotivo invPedidosOrdenCompraMotivo;
    private SisListaUsuarioTO usuario;
    private boolean activo;
    private BigDecimal ocmTotalAprobar;

    public InvOrdenCompraMotivoDetalleAprobadoresTO() {
        detSecuencial = 0;
        this.invPedidosOrdenCompraMotivo = new InvPedidosOrdenCompraMotivo();
        usuario = new SisListaUsuarioTO();
        activo = true;
    }

    public InvOrdenCompraMotivoDetalleAprobadoresTO(InvPedidosOrdenCompraMotivo invPedidosOrdenCompraMotivo) {
        detSecuencial = 0;
        this.invPedidosOrdenCompraMotivo = invPedidosOrdenCompraMotivo;
        usuario = new SisListaUsuarioTO();
        activo = true;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Integer getDetSecuencial() {
        return detSecuencial;
    }

    public void setDetSecuencial(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public InvPedidosOrdenCompraMotivo getInvPedidosOrdenCompraMotivo() {
        return invPedidosOrdenCompraMotivo;
    }

    public void setInvPedidosOrdenCompraMotivo(InvPedidosOrdenCompraMotivo invPedidosOrdenCompraMotivo) {
        this.invPedidosOrdenCompraMotivo = invPedidosOrdenCompraMotivo;
    }

    public SisListaUsuarioTO getUsuario() {
        return usuario;
    }

    public void setUsuario(SisListaUsuarioTO usuario) {
        this.usuario = usuario;
    }

    public BigDecimal getOcmTotalAprobar() {
        return ocmTotalAprobar;
    }

    public void setOcmTotalAprobar(BigDecimal ocmTotalAprobar) {
        this.ocmTotalAprobar = ocmTotalAprobar;
    }

    public void convertirObjeto(InvPedidosOrdenCompraMotivoDetalleAprobadores invPedidosOrdenCompraMotivoDetalleAprobadores) {
        if (invPedidosOrdenCompraMotivoDetalleAprobadores != null) {
            this.ocmTotalAprobar = invPedidosOrdenCompraMotivoDetalleAprobadores.getOcmTotalAprobar();
            this.detSecuencial = invPedidosOrdenCompraMotivoDetalleAprobadores.getDetSecuencial();
            this.invPedidosOrdenCompraMotivo = invPedidosOrdenCompraMotivoDetalleAprobadores.getInvPedidosOrdenCompraMotivo();
            this.usuario = new SisListaUsuarioTO(invPedidosOrdenCompraMotivoDetalleAprobadores.getSisUsuario().getUsrCodigo(), invPedidosOrdenCompraMotivoDetalleAprobadores.getSisUsuario().getUsrNombre(),
                    invPedidosOrdenCompraMotivoDetalleAprobadores.getSisUsuario().getUsrApellido(), invPedidosOrdenCompraMotivoDetalleAprobadores.getSisUsuario().getUsrEmail());
        }
    }
}
