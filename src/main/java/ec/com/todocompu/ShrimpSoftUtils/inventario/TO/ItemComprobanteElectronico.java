/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

public class ItemComprobanteElectronico {

    private ItemResultadoBusquedaElectronico itemBusqueda;
    private InvProveedorDatosXMLTO invProveedorDatosXMLTO;

    public ItemComprobanteElectronico() {
    }

    public ItemResultadoBusquedaElectronico getItemBusqueda() {
        return itemBusqueda;
    }

    public void setItemBusqueda(ItemResultadoBusquedaElectronico itemBusqueda) {
        this.itemBusqueda = itemBusqueda;
    }

    public InvProveedorDatosXMLTO getInvProveedorDatosXMLTO() {
        return invProveedorDatosXMLTO;
    }

    public void setInvProveedorDatosXMLTO(InvProveedorDatosXMLTO invProveedorDatosXMLTO) {
        this.invProveedorDatosXMLTO = invProveedorDatosXMLTO;
    }
}
