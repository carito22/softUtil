/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhVacacionesGozadasDatosAdjuntos;

/**
 *
 * @author CarolValdiviezo
 */
public class RhVacacionesGozadasDatosAdjuntosWebTO extends RhVacacionesGozadasDatosAdjuntos {

    String imagenString;

    public String getImagenString() {
        return imagenString;
    }

    public void setImagenString(String imagenString) {
        this.imagenString = imagenString;
    }

    public RhVacacionesGozadasDatosAdjuntosWebTO(String imagenString) {
        this.imagenString = imagenString;
    }

    public RhVacacionesGozadasDatosAdjuntosWebTO() {
    }

}
