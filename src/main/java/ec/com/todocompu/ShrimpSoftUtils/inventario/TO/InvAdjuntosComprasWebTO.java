/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvAdjuntosCompras;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvCompras;

/**
 *
 * @author Desarrollador1
 */
public class InvAdjuntosComprasWebTO extends InvAdjuntosCompras {

    String imagenString;

    public InvAdjuntosComprasWebTO() {
    }

    public String getImagenString() {
        return imagenString;
    }

    public void setImagenString(String imagenString) {
        this.imagenString = imagenString;
    }

    public InvAdjuntosComprasWebTO(String imagenString) {
        this.imagenString = imagenString;
    }

    public InvAdjuntosComprasWebTO(String imagenString, Integer adjSecuencial, String adjTipo, byte[] adjArchivo, InvCompras invCompras) {
        super(adjSecuencial, adjTipo, null, invCompras);
        this.imagenString = imagenString;
    }

}
