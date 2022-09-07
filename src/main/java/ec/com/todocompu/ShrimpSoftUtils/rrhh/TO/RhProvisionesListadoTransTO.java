/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.util.Date;

/**
 *
 * @author tabango94
 */
public class RhProvisionesListadoTransTO {
    private String empresa;
    private String sector;
    private String periodo;
    private String estado;
    private Date datePeriodoHasta;

    public RhProvisionesListadoTransTO() {
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

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getDatePeriodoHasta() {
        return datePeriodoHasta;
    }

    public void setDatePeriodoHasta(Date datePeriodoHasta) {
        this.datePeriodoHasta = datePeriodoHasta;
    }
}
