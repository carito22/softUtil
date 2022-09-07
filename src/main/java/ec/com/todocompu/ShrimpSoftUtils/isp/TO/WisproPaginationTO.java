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
public class WisproPaginationTO implements Serializable {

    double per_page = 0;
    double total_records = 0;
    double total_pages = 0;
    double current_page = 0;

    public WisproPaginationTO() {
    }

    public double getPer_page() {
        return per_page;
    }

    public void setPer_page(double per_page) {
        this.per_page = per_page;
    }

    public double getTotal_records() {
        return total_records;
    }

    public void setTotal_records(double total_records) {
        this.total_records = total_records;
    }

    public double getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(double total_pages) {
        this.total_pages = total_pages;
    }

    public double getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(double current_page) {
        this.current_page = current_page;
    }

}
