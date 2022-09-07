/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.web;

/**
 *
 * @author User
 */
public class ArchivoSoporteTO {

    private String nombre;
    private String base64;

    public ArchivoSoporteTO() {
    }

    public ArchivoSoporteTO(String nombre, String base64) {
        this.nombre = nombre;
        this.base64 = base64;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBase64() {
        return base64;
    }

    public void setBase64(String base64) {
        this.base64 = base64;
    }

}
