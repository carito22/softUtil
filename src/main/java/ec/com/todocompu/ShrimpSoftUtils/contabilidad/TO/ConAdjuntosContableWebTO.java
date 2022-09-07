/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConAdjuntosContable;

/**
 *
 * @author CarolValdiviezo
 */
public class ConAdjuntosContableWebTO extends ConAdjuntosContable {

    String imagenString;

    public String getImagenString() {
        return imagenString;
    }

    public void setImagenString(String imagenString) {
        this.imagenString = imagenString;
    }

    public ConAdjuntosContableWebTO(String imagenString) {
        this.imagenString = imagenString;
    }

    public ConAdjuntosContableWebTO() {
    }

}
