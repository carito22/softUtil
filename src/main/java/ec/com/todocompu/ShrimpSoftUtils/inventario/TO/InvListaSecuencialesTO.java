/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

/**
 *
 * @author CarolValdiviezo
 */
public class InvListaSecuencialesTO {

    String secuencial;
    String numAutorizacion;
    String numObservacion;
    boolean seleccionado;

    public InvListaSecuencialesTO() {
    }

    public String getSecuencial() {
        return secuencial;
    }

    public void setSecuencial(String secuencial) {
        this.secuencial = secuencial;
    }

    public boolean isSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado = seleccionado;
    }

    public String getNumAutorizacion() {
        return numAutorizacion;
    }

    public void setNumAutorizacion(String numAutorizacion) {
        this.numAutorizacion = numAutorizacion;
    }

    public String getNumObservacion() {
        return numObservacion;
    }

    public void setNumObservacion(String numObservacion) {
        this.numObservacion = numObservacion;
    }

    
}
