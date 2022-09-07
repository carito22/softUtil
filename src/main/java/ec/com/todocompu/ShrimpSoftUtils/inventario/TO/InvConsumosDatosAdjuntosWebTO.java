/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvConsumosDatosAdjuntos;

/**
 *
 * @author Mario Ramos Duque
 */
public class InvConsumosDatosAdjuntosWebTO extends InvConsumosDatosAdjuntos {

    String imagenString;

    public String getImagenString() {
        return imagenString;
    }

    public void setImagenString(String imagenString) {
        this.imagenString = imagenString;
    }

    public InvConsumosDatosAdjuntosWebTO(String imagenString) {
        this.imagenString = imagenString;
    }

    public InvConsumosDatosAdjuntosWebTO() {
    }

}
