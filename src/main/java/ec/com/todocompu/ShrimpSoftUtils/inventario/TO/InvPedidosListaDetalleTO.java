/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosDetalle;
import ec.com.todocompu.ShrimpSoftUtils.pedidos.TO.InvPedidoTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Developer4
 */
public class InvPedidosListaDetalleTO {

    private InvPedidoTO invPedidosTO;
    private List<InvPedidosDetalle> listaInvPedidosDetalle;

    public InvPedidosListaDetalleTO() {
        invPedidosTO = new InvPedidoTO();
        listaInvPedidosDetalle = new ArrayList<>();
    }

    public InvPedidoTO getInvPedidosTO() {
        return invPedidosTO;
    }

    public void setInvPedidosTO(InvPedidoTO invPedidosTO) {
        this.invPedidosTO = invPedidosTO;
    }

    public List<InvPedidosDetalle> getListaInvPedidosDetalle() {
        return listaInvPedidosDetalle;
    }

    public void setListaInvPedidosDetalle(List<InvPedidosDetalle> listaInvPedidosDetalle) {
        this.listaInvPedidosDetalle = listaInvPedidosDetalle;
    }

}
