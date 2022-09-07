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
 * @author canastacio
 */
public class MenuTO {
    private String label;
    private String id;
    private int orden;
    private List<SubMenuTO> submenus;

    public MenuTO() {
        this.submenus=new ArrayList<SubMenuTO>();
    }

    public MenuTO(String label, String id, int orden) {
        this.label = label;
        this.id = id;
        this.orden = orden;
        this.submenus=new ArrayList<SubMenuTO>();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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

    public List<SubMenuTO> getSubmenus() {
        return submenus;
    }

    public void setSubmenus(List<SubMenuTO> submenus) {
        this.submenus = submenus;
    }
    
}
