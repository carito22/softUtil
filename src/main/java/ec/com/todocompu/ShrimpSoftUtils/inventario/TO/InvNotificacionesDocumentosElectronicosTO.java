/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import ec.com.todocompu.ShrimpSoftUtils.pedidos.TO.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Mario Ramos Duque
 */
public class InvNotificacionesDocumentosElectronicosTO implements Serializable {

    private String empresa;
    private String periodo;
    private String motivo;
    private String numero;
    private String tipoNotificacion;
    private List<InvEmailNotificacionesTO> correos;

    public InvNotificacionesDocumentosElectronicosTO() {
    }

    public InvNotificacionesDocumentosElectronicosTO(String empresa, String periodo, String motivo, String numero, String tipoNotificacion) {
        this.empresa = empresa;
        this.periodo = periodo;
        this.motivo = motivo;
        this.numero = numero;
        this.tipoNotificacion = tipoNotificacion;
    }

    public InvNotificacionesDocumentosElectronicosTO(String empresa, String periodo, String motivo, String numero, String tipoNotificacion, List<InvEmailNotificacionesTO> correos) {
        this.empresa = empresa;
        this.periodo = periodo;
        this.motivo = motivo;
        this.numero = numero;
        this.tipoNotificacion = tipoNotificacion;
        this.correos = correos;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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
