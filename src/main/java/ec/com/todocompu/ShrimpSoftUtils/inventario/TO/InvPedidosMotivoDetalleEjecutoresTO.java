/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosMotivoDetalleEjecutores;
import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisListaUsuarioTO;
import java.io.Serializable;

/**
 *
 * @author developer3
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class InvPedidosMotivoDetalleEjecutoresTO implements Serializable {

    private Integer detSecuencial;
    private InvPedidosMotivoTO invPedidosMotivoTO;
    private SisListaUsuarioTO usuario;
    private boolean activo;

    public InvPedidosMotivoDetalleEjecutoresTO() {
        detSecuencial = 0;
        this.invPedidosMotivoTO = new InvPedidosMotivoTO();
        usuario = new SisListaUsuarioTO();
        activo = true;
    }

    public InvPedidosMotivoDetalleEjecutoresTO(InvPedidosMotivoTO invPedidosMotivoTO) {
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

    public void convertirObjeto(InvPedidosMotivoDetalleEjecutores invPedidosMotivoDetalleEjecutores) {
        if (invPedidosMotivoDetalleEjecutores != null) {
            this.detSecuencial = invPedidosMotivoDetalleEjecutores.getDetSecuencial();
            this.invPedidosMotivoTO.convertirObjeto(invPedidosMotivoDetalleEjecutores.getInvPedidosMotivo());
            this.usuario = new SisListaUsuarioTO(invPedidosMotivoDetalleEjecutores.getSisUsuario().getUsrCodigo(), invPedidosMotivoDetalleEjecutores.getSisUsuario().getUsrNombre(), 
                    invPedidosMotivoDetalleEjecutores.getSisUsuario().getUsrApellido(),invPedidosMotivoDetalleEjecutores.getSisUsuario().getUsrEmail());
        }
    }
}
