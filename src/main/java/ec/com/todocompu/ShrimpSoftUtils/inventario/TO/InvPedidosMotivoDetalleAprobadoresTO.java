/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosMotivoDetalleAprobadores;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisListaUsuarioTO;
import java.io.Serializable;

/**
 *
 * @author developer3
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvPedidosMotivoDetalleAprobadoresTO implements Serializable {

    private Integer detSecuencial;
    private InvPedidosMotivoTO invPedidosMotivoTO;
    private SisListaUsuarioTO usuario;
    private boolean activo;

    public InvPedidosMotivoDetalleAprobadoresTO() {
        detSecuencial = 0;
        this.invPedidosMotivoTO = new InvPedidosMotivoTO();
        usuario = new SisListaUsuarioTO();
        activo = true;
    }

    public InvPedidosMotivoDetalleAprobadoresTO(InvPedidosMotivoTO invPedidosMotivoTO) {
        detSecuencial = 0;
        this.invPedidosMotivoTO = invPedidosMotivoTO;
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

    public InvPedidosMotivoTO getInvPedidosMotivoTO() {
        return invPedidosMotivoTO;
    }

    public void setInvPedidosMotivoTO(InvPedidosMotivoTO invPedidosMotivoTO) {
        this.invPedidosMotivoTO = invPedidosMotivoTO;
    }

    public SisListaUsuarioTO getUsuario() {
        return usuario;
    }

    public void setUsuario(SisListaUsuarioTO usuario) {
        this.usuario = usuario;
    }

    public void convertirObjeto(InvPedidosMotivoDetalleAprobadores invPedidosMotivoDetalleAprobadores) {
        if (invPedidosMotivoDetalleAprobadores != null) {
            this.detSecuencial = invPedidosMotivoDetalleAprobadores.getDetSecuencial();
            this.invPedidosMotivoTO.convertirObjeto(invPedidosMotivoDetalleAprobadores.getInvPedidosMotivo());
            this.usuario = new SisListaUsuarioTO(invPedidosMotivoDetalleAprobadores.getSisUsuario().getUsrCodigo(), invPedidosMotivoDetalleAprobadores.getSisUsuario().getUsrNombre(), 
                    invPedidosMotivoDetalleAprobadores.getSisUsuario().getUsrApellido(),invPedidosMotivoDetalleAprobadores.getSisUsuario().getUsrEmail());
        }
    }
}
