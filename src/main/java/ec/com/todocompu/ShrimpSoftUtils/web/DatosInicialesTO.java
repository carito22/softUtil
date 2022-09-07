/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.web;

import ec.com.todocompu.ShrimpSoftUtils.sistema.TO.SisInfoTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author canastacio
 */
public class DatosInicialesTO {

    private SisInfoTO usuario;
    private List<ModuloTO> modulos;
    private List<MenuTO> menu;
    private String mac;
    private String ImagenString;
    private boolean cambiarContrasenia;
  
    public DatosInicialesTO() {
        this.modulos = new ArrayList<ModuloTO>();
    }

    public boolean isCambiarContrasenia() {
        return cambiarContrasenia;
    }

    public void setCambiarContrasenia(boolean cambiarContrasenia) {
        this.cambiarContrasenia = cambiarContrasenia;
    }

    public String getImagenString() {
        return ImagenString;
    }

    public void setImagenString(String ImagenString) {
        this.ImagenString = ImagenString;
    }


    public SisInfoTO getUsuario() {
        return usuario;
    }

    public void setUsuario(SisInfoTO usuario) {
        this.usuario = usuario;
    }

    public List<MenuTO> getMenu() {
        return menu;
    }

    public void setMenu(List<MenuTO> menu) {
        this.menu = menu;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public List<ModuloTO> getModulos() {
        return modulos;
    }

    public void setModulos(List<ModuloTO> modulos) {
        this.modulos = modulos;
    }

}
