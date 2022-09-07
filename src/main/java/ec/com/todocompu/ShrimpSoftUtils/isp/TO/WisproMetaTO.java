/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.isp.TO;

import java.io.Serializable;

/**
 *
 * @author Trabajo
 */
public class WisproMetaTO implements Serializable {

    private WisproPaginationTO pagination;
    private String object;

    public WisproMetaTO() {
    }

    public WisproPaginationTO getPagination() {
        return pagination;
    }

    public void setPagination(WisproPaginationTO pagination) {
        this.pagination = pagination;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

}
