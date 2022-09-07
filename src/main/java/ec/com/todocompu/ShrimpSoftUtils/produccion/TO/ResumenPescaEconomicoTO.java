/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.util.Date;

/**
 *
 * @author tabango94
 */
public class ResumenPescaEconomicoTO {

    private String empresa;
    private String sector;
    private Date desde;
    private Date hasta;

    public ResumenPescaEconomicoTO() {
    }

    public ResumenPescaEconomicoTO(String empresa, String sector, Date desde, Date hasta) {
        this.empresa = empresa;
        this.sector = sector;
        this.desde = desde;
        this.hasta = hasta;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Date getDesde() {
        return desde;
    }

    public void setDesde(Date desde) {
        this.desde = desde;
    }

    public Date getHasta() {
        return hasta;
    }

    public void setHasta(Date hasta) {
        this.hasta = hasta;
    }
}
