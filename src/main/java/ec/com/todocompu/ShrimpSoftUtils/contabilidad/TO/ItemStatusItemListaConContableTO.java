/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

/**
 *
 * @author DEVELOPER3
 */
public class ItemStatusItemListaConContableTO extends ListaConContableTO {

    private String conStatus;

    public ItemStatusItemListaConContableTO() {

    }

    public String getConStatus() {
        return conStatus;
    }

    public void setConStatus(String conStatus) {
        this.conStatus = conStatus;
    }

    @Override
    public String toString() {
        return "ItemStatusItemListaConContableTO{" + "conStatus=" + conStatus + '}';
    }

}
