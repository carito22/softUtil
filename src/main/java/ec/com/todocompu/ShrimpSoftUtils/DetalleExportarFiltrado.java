/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils;

/**
 *
 * @author User
 */
public class DetalleExportarFiltrado {

    private String headerName;
    private String field;
    private boolean check;

    public DetalleExportarFiltrado() {
    }

    public DetalleExportarFiltrado(String headerName, String field, boolean check) {
        this.headerName = headerName;
        this.field = field;
        this.check = check;
    }

    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

}
