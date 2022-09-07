/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import ec.com.todocompu.ShrimpSoftUtils.activoFijo.entity.AfActivos;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvProducto;

/**
 *
 * @author Carol
 */
public class ImportarProductos {

    InvProducto producto;
    AfActivos activoFijo;

    public ImportarProductos() {
    }

    public InvProducto getProducto() {
        return producto;
    }

    public void setProducto(InvProducto producto) {
        this.producto = producto;
    }

    public AfActivos getActivoFijo() {
        return activoFijo;
    }

    public void setActivoFijo(AfActivos activoFijo) {
        this.activoFijo = activoFijo;
    }

}
