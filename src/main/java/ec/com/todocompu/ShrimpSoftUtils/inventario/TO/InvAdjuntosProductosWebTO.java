/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvProductoDatosAdjuntos;

/**
 *
 * @author DEVELOPER3
 */
public class InvAdjuntosProductosWebTO extends InvProductoDatosAdjuntos {

    String imagenString;

    public InvAdjuntosProductosWebTO() {
    }

    public String getImagenString() {
        return imagenString;
    }

    public void setImagenString(String imagenString) {
        this.imagenString = imagenString;
    }

    public InvAdjuntosProductosWebTO(String imagenString) {
        this.imagenString = imagenString;
    }

}
