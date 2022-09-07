/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.activoFijo.TO;

import ec.com.todocompu.ShrimpSoftUtils.activoFijo.entity.AfUbicaciones;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author developer3
 */
public class AfUbicacionesTO implements Serializable {

    private String ubiEmpresa;
    private String ubiSector;
    private String ubiCodigo;
    private String ubiDescripcion;
    private String usrEmpresa;
    private String usrCodigo;
    private Date usrFechaInserta;

    public AfUbicacionesTO() {
    }

    public String getUbiEmpresa() {
        return ubiEmpresa;
    }

    public void setUbiEmpresa(String ubiEmpresa) {
        this.ubiEmpresa = ubiEmpresa;
    }

    public String getUbiSector() {
        return ubiSector;
    }

    public void setUbiSector(String ubiSector) {
        this.ubiSector = ubiSector;
    }

    public String getUbiCodigo() {
        return ubiCodigo;
    }

    public void setUbiCodigo(String ubiCodigo) {
        this.ubiCodigo = ubiCodigo;
    }

    public String getUbiDescripcion() {
        return ubiDescripcion;
    }

    public void setUbiDescripcion(String ubiDescripcion) {
        this.ubiDescripcion = ubiDescripcion;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public void convertirObjeto(AfUbicaciones afUbicaciones) {
        if (afUbicaciones != null) {
            this.ubiCodigo = afUbicaciones.getAfUbicacionesPK().getUbiCodigo();
            this.ubiEmpresa = afUbicaciones.getAfUbicacionesPK().getUbiEmpresa();
            this.ubiSector = afUbicaciones.getAfUbicacionesPK().getUbiSector();
            this.ubiDescripcion = afUbicaciones.getUbiDescripcion();
            this.usrCodigo = afUbicaciones.getUsrCodigo();
            this.usrEmpresa = afUbicaciones.getUsrEmpresa();
            this.usrFechaInserta = afUbicaciones.getUsrFechaInserta();
        }
    }
}
