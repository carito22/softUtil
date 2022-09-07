/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;

/**
 *
 * @author developer3
 */
public class RhCabeceraReporteRolColectivoTO implements Serializable{
    private String usuarioRegistro;
    private String fechaDesde;
    private String fechaHasta;

    public RhCabeceraReporteRolColectivoTO() {
    }

    public RhCabeceraReporteRolColectivoTO(String usuarioRegistro, String fechaDesde, String fechaHasta) {
        this.usuarioRegistro = usuarioRegistro;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public String getUsuarioRegistro() {
        return usuarioRegistro;
    }

    public void setUsuarioRegistro(String usuarioRegistro) {
        this.usuarioRegistro = usuarioRegistro;
    }

    public String getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(String fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }
    
}
