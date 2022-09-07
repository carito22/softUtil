/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.pedidos.TO;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author developer3
 */
public class InvNotificacionesOrdenCompraTO implements Serializable{

    private String ocEmpresa;
    private String ocSector;
    private String ocMotivo;
    private String ocNumero;
    private String tipoNotificacion;
    private List<InvEmailNotificacionesTO> correos;

    public InvNotificacionesOrdenCompraTO() {
    }

    public InvNotificacionesOrdenCompraTO(String ocEmpresa, String ocSector, String ocMotivo, String ocNumero, String tipoNotificacion, List<InvEmailNotificacionesTO> correos) {
        this.ocEmpresa = ocEmpresa;
        this.ocSector = ocSector;
        this.ocMotivo = ocMotivo;
        this.ocNumero = ocNumero;
        this.tipoNotificacion = tipoNotificacion;
        this.correos = correos;
    }

    public InvNotificacionesOrdenCompraTO(String ocEmpresa, String ocSector, String ocMotivo, String ocNumero, String tipoNotificacion) {
        this.ocEmpresa = ocEmpresa;
        this.ocSector = ocSector;
        this.ocMotivo = ocMotivo;
        this.ocNumero = ocNumero;
        this.tipoNotificacion = tipoNotificacion;
    }

    public String getOcEmpresa() {
        return ocEmpresa;
    }

    public void setOcEmpresa(String ocEmpresa) {
        this.ocEmpresa = ocEmpresa;
    }

    public String getOcSector() {
        return ocSector;
    }

    public void setOcSector(String ocSector) {
        this.ocSector = ocSector;
    }

    public String getOcMotivo() {
        return ocMotivo;
    }

    public void setOcMotivo(String ocMotivo) {
        this.ocMotivo = ocMotivo;
    }

    public String getOcNumero() {
        return ocNumero;
    }

    public void setOcNumero(String ocNumero) {
        this.ocNumero = ocNumero;
    }

    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(String tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    public List<InvEmailNotificacionesTO> getCorreos() {
        return correos;
    }

    public void setCorreos(List<InvEmailNotificacionesTO> correos) {
        this.correos = correos;
    }

}
