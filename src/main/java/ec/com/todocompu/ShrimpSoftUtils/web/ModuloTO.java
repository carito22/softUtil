/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.web;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Developer4
 */
public class ModuloTO {

    private String label;
    private String id;
    private int orden;
    private String icono;
    private String url;
    private List<MenuTO> menus;

    public ModuloTO() {
        this.menus = new ArrayList<MenuTO>();
    }

    public ModuloTO(String label, String id, int orden, String icono, String url) {
        this.label = label;
        this.id = id;
        this.orden = orden;
        this.icono = icono;
        this.armarUlsModulo(this.label);
        this.menus = new ArrayList<MenuTO>();
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
        this.armarUlsModulo(label);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public List<MenuTO> getMenus() {
        return menus;
    }

    public void setMenus(List<MenuTO> menus) {
        this.menus = menus;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.armarUlsModulo(label);
    }

    private void armarUlsModulo(String label) {
        switch (label) {
            case "WEB TALENTO HUMANO":
            case "WEB RECURSOS HUMANOS":
                this.url = "talentoHumano";
                break;
            case "WEB ACTIVO FIJO":
                this.url = "activo";
                break;
            case "WEB BANCOS":
                this.url = "bancos";
                break;
            case "WEB SISTEMA":
                this.url = "sistema";
                break;
            case "WEB TRIBUTACION":
                this.url = "tributacion";
                break;
            case "WEB INVENTARIO":
                this.url = "inventario";
                break;
            case "WEB CONTABILIDAD":
                this.url = "contabilidad";
                break;
            case "WEB CARTERA":
                this.url = "cartera";
                break;
            case "WEB PRODUCCION":
                this.url = "produccion";
                break;
            case "WEB":
                this.url = "web";
                break;
            case "WEB PEDIDOS":
                this.url = "pedidos";
                break;
            case "WEB CAJA":
                this.url = "caja";
                break;
            case "WEB SOPORTE":
                this.url = "soporte";
                break;
            case "WEB ISP":
                this.url = "isp";
                break;
        }
    }

}
