/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.activoFijo.TO;

import ec.com.todocompu.ShrimpSoftUtils.activoFijo.entity.AfDepreciacionesMotivos;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO.ConTipoTO;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author developer3
 */
public class AfDepreciacionMotivoTO implements Serializable {

    private Integer motSecuencial;
    private String conTipoDescripcion;
    private ConTipoTO conTipo;
    private String usrEmpresa;
    private String usrCodigo;
    private Date usrFechaInserta;
    private AfUbicacionesTO afUbicaciones;
    private String afUbicacionDescripcion;

    public AfDepreciacionMotivoTO() {
        conTipo = new ConTipoTO();
        afUbicaciones = new AfUbicacionesTO();
        motSecuencial = 0;
    }

    public String getConTipoDescripcion() {
        return conTipoDescripcion;
    }

    public void setConTipoDescripcion(String conTipoDescripcion) {
        this.conTipoDescripcion = conTipoDescripcion;
    }

    public String getAfUbicacionDescripcion() {
        return afUbicacionDescripcion;
    }

    public void setAfUbicacionDescripcion(String afUbicacionDescripcion) {
        this.afUbicacionDescripcion = afUbicacionDescripcion;
    }

    public Integer getMotSecuencial() {
        return motSecuencial;
    }

    public void setMotSecuencial(Integer motSecuencial) {
        this.motSecuencial = motSecuencial;
    }

    public ConTipoTO getConTipo() {
        return conTipo;
    }

    public void setConTipo(ConTipoTO conTipo) {
        this.conTipo = conTipo;
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

    public AfUbicacionesTO getAfUbicaciones() {
        return afUbicaciones;
    }

    public void setAfUbicaciones(AfUbicacionesTO afUbicaciones) {
        this.afUbicaciones = afUbicaciones;
    }

    public void convertirObjeto(AfDepreciacionesMotivos afDepreciacionesMotivos) {
        if (afDepreciacionesMotivos != null) {
            this.motSecuencial = afDepreciacionesMotivos.getMotSecuencial();
            this.afUbicacionDescripcion = afDepreciacionesMotivos.getAfUbicaciones().getUbiDescripcion();
            this.conTipoDescripcion = afDepreciacionesMotivos.getConTipo().getTipDetalle();
            this.afUbicaciones.convertirObjeto(afDepreciacionesMotivos.getAfUbicaciones());
            this.conTipo = new ConTipoTO(afDepreciacionesMotivos.getConTipo().getConTipoPK().getTipEmpresa(),
                    afDepreciacionesMotivos.getConTipo().getConTipoPK().getTipCodigo(),
                    afDepreciacionesMotivos.getConTipo().getTipDetalle(),
                    afDepreciacionesMotivos.getConTipo().getTipInactivo(), null, null, null, "DIARIO");
            this.usrCodigo = afDepreciacionesMotivos.getUsrCodigo();
            this.usrEmpresa = afDepreciacionesMotivos.getUsrEmpresa();
            this.usrFechaInserta = afDepreciacionesMotivos.getUsrFechaInserta();
        }
    }
}
