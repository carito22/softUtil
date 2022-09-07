/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author mario
 */
@Entity
@Table(name = "con_verificacion_errores_notificaciones", schema = "contabilidad")
@NamedQueries({
    @NamedQuery(name = "ConVerificacionErroresNotificaciones.findAll", query = "SELECT c FROM ConVerificacionErroresNotificaciones c")})
public class ConVerificacionErroresNotificaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ven_secuencial")
    private Integer venSecuencial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ven_destinatario")
    private String venDestinatario;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ven_empresa")
    private String venEmpresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ven_fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date venFecha;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ven_tipo")
    private String venTipo;
    @Size(max = 2147483647)
    @Column(name = "ven_observacion")
    private String venObservacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ven_informe")
    private String venInforme;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ve_secuencial")
    private int veSecuencial;

    public ConVerificacionErroresNotificaciones() {
    }

    public ConVerificacionErroresNotificaciones(Integer venSecuencial) {
        this.venSecuencial = venSecuencial;
    }

    public ConVerificacionErroresNotificaciones(Integer venSecuencial, String venDestinatario, Date venFecha, String venTipo, String venInforme, int veSecuencial) {
        this.venSecuencial = venSecuencial;
        this.venDestinatario = venDestinatario;
        this.venFecha = venFecha;
        this.venTipo = venTipo;
        this.venInforme = venInforme;
        this.veSecuencial = veSecuencial;
    }

    public Integer getVenSecuencial() {
        return venSecuencial;
    }

    public void setVenSecuencial(Integer venSecuencial) {
        this.venSecuencial = venSecuencial;
    }

    public String getVenDestinatario() {
        return venDestinatario;
    }

    public void setVenDestinatario(String venDestinatario) {
        this.venDestinatario = venDestinatario;
    }

    public Date getVenFecha() {
        return venFecha;
    }

    public void setVenFecha(Date venFecha) {
        this.venFecha = venFecha;
    }

    public String getVenTipo() {
        return venTipo;
    }

    public void setVenTipo(String venTipo) {
        this.venTipo = venTipo;
    }

    public String getVenObservacion() {
        return venObservacion;
    }

    public void setVenObservacion(String venObservacion) {
        this.venObservacion = venObservacion;
    }

    public String getVenInforme() {
        return venInforme;
    }

    public void setVenInforme(String venInforme) {
        this.venInforme = venInforme;
    }

    public int getVeSecuencial() {
        return veSecuencial;
    }

    public void setVeSecuencial(int veSecuencial) {
        this.veSecuencial = veSecuencial;
    }

    public String getVenEmpresa() {
        return venEmpresa;
    }

    public void setVenEmpresa(String venEmpresa) {
        this.venEmpresa = venEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (venSecuencial != null ? venSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConVerificacionErroresNotificaciones)) {
            return false;
        }
        ConVerificacionErroresNotificaciones other = (ConVerificacionErroresNotificaciones) object;
        if ((this.venSecuencial == null && other.venSecuencial != null) || (this.venSecuencial != null && !this.venSecuencial.equals(other.venSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConVerificacionErroresNotificaciones[ venSecuencial=" + venSecuencial + " ]";
    }
    
}
