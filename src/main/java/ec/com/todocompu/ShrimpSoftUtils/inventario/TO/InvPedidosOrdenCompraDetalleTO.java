/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosOrdenCompra;
import javax.persistence.Transient;

/**
 *
 * @author Developer4
 */
public class InvPedidosOrdenCompraDetalleTO {

    private InvPedidosOrdenCompra invPedidosOrdenCompra;
    @Transient
    private boolean proGrava;

    public InvPedidosOrdenCompraDetalleTO() {
        invPedidosOrdenCompra = new InvPedidosOrdenCompra();
    }

    public InvPedidosOrdenCompra getInvPedidosOrdenCompra() {
        return invPedidosOrdenCompra;
    }

    public void setInvPedidosOrdenCompra(InvPedidosOrdenCompra invPedidosOrdenCompra) {
        this.invPedidosOrdenCompra = invPedidosOrdenCompra;
    }

    public boolean isProGrava() {
        return proGrava;
    }

    public void setProGrava(boolean proGrava) {
        this.proGrava = proGrava;
    }

}
