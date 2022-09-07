/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.web;

/**
 *
 * @author canastacio
 */
public class SubMenuTO {
    private String label;
    private String id;
    private int orden;
    private String labelMenuSuperior;

    public SubMenuTO() {
    }

    public SubMenuTO(String label, String id, int orden,String labelMenuSuperior) {
        this.label = label;
        this.id = id;
        this.orden = orden;
        this.labelMenuSuperior=labelMenuSuperior;
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

    public String getLabelMenuSuperior() {
        return labelMenuSuperior;
    }

    public void setLabelMenuSuperior(String labelMenuSuperior) {
        this.labelMenuSuperior = labelMenuSuperior;
    }
    
}
