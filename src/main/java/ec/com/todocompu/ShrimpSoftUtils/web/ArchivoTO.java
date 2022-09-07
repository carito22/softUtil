/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.web;

import java.io.*;


public class ArchivoTO {

    private File contenido;
    private String nombre;
  
    public ArchivoTO() {
    }

    public ArchivoTO(File contenido, String nombre) {
        this.contenido = contenido;
        this.nombre = nombre;
    }

    public File getContenido() {
        return contenido;
    }

    public void setContenido(File contenido) {
        this.contenido = contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
