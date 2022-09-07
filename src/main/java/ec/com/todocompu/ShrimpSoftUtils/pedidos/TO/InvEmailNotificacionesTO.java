/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.pedidos.TO;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author developer3
 */
public class InvEmailNotificacionesTO implements Serializable{

    private String tipoNotificacion;
    private String emailNotificacion;
    private Date fechaNotificacion;

    public InvEmailNotificacionesTO() {
    }

    public InvEmailNotificacionesTO(String tipoNotificacion, String emailNotificacion, Date fechaNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
        this.emailNotificacion = emailNotificacion;
        this.fechaNotificacion = fechaNotificacion;
    }

    public String getTipoNotificacion() {
        return tipoNotificacion;
    }

    public void setTipoNotificacion(String tipoNotificacion) {
        this.tipoNotificacion = tipoNotificacion;
    }

    public String getEmailNotificacion() {
        return emailNotificacion;
    }

    public void setEmailNotificacion(String emailNotificacion) {
        this.emailNotificacion = emailNotificacion;
    }

    public Date getFechaNotificacion() {
        return fechaNotificacion;
    }

    public void setFechaNotificacion(Date fechaNotificacion) {
        this.fechaNotificacion = fechaNotificacion;
    }

}
