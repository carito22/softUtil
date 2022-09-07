/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

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
 * @author DEVELOPER
 */
@Entity
@Table(name = "anx_venta_electronica_notificaciones", schema = "anexo")
@NamedQueries({
    @NamedQuery(name = "AnxVentaElectronicaNotificaciones.findAll", query = "SELECT a FROM AnxVentaElectronicaNotificaciones a")})
public class AnxVentaElectronicaNotificaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "e_secuencial")
    private Integer eSecuencial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "e_destinatario")
    private String eDestinatario;
    
    @Basic(optional = true)
    @Column(name = "e_fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eFecha;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "e_tipo")
    private String eTipo;
    
    @Basic(optional = true)
    @Size(min = 1, max = 2147483647)
    @Column(name = "e_observacion")
    private String eObservacion;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "e_informe")
    private String eInforme;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "vta_empresa")
    private String vtaEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "vta_periodo")
    private String vtaPeriodo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "vta_motivo")
    private String vtaMotivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "vta_numero")
    private String vtaNumero;

    public AnxVentaElectronicaNotificaciones() {
    }

    public AnxVentaElectronicaNotificaciones(Integer eSecuencial) {
        this.eSecuencial = eSecuencial;
    }

    public AnxVentaElectronicaNotificaciones(Integer eSecuencial, String eDestinatario, Date eFecha, String eTipo, String eObservacion, String eInforme, String vtaEmpresa, String vtaPeriodo, String vtaMotivo, String vtaNumero) {
        this.eSecuencial = eSecuencial;
        this.eDestinatario = eDestinatario;
        this.eFecha = eFecha;
        this.eTipo = eTipo;
        this.eObservacion = eObservacion;
        this.eInforme = eInforme;
        this.vtaEmpresa = vtaEmpresa;
        this.vtaPeriodo = vtaPeriodo;
        this.vtaMotivo = vtaMotivo;
        this.vtaNumero = vtaNumero;
    }

    public Integer getESecuencial() {
        return eSecuencial;
    }

    public void setESecuencial(Integer eSecuencial) {
        this.eSecuencial = eSecuencial;
    }

    public String getEDestinatario() {
        return eDestinatario;
    }

    public void setEDestinatario(String eDestinatario) {
        this.eDestinatario = eDestinatario;
    }

    public Date getEFecha() {
        return eFecha;
    }

    public void setEFecha(Date eFecha) {
        this.eFecha = eFecha;
    }

    public String getETipo() {
        return eTipo;
    }

    public void setETipo(String eTipo) {
        this.eTipo = eTipo;
    }

    public String getEObservacion() {
        return eObservacion;
    }

    public void setEObservacion(String eObservacion) {
        this.eObservacion = eObservacion;
    }

    public String getEInforme() {
        return eInforme;
    }

    public void setEInforme(String eInforme) {
        this.eInforme = eInforme;
    }

    public String getVtaEmpresa() {
        return vtaEmpresa;
    }

    public void setVtaEmpresa(String vtaEmpresa) {
        this.vtaEmpresa = vtaEmpresa;
    }

    public String getVtaPeriodo() {
        return vtaPeriodo;
    }

    public void setVtaPeriodo(String vtaPeriodo) {
        this.vtaPeriodo = vtaPeriodo;
    }

    public String getVtaMotivo() {
        return vtaMotivo;
    }

    public void setVtaMotivo(String vtaMotivo) {
        this.vtaMotivo = vtaMotivo;
    }

    public String getVtaNumero() {
        return vtaNumero;
    }

    public void setVtaNumero(String vtaNumero) {
        this.vtaNumero = vtaNumero;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eSecuencial != null ? eSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnxVentaElectronicaNotificaciones)) {
            return false;
        }
        AnxVentaElectronicaNotificaciones other = (AnxVentaElectronicaNotificaciones) object;
        if ((this.eSecuencial == null && other.eSecuencial != null) || (this.eSecuencial != null && !this.eSecuencial.equals(other.eSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.anexos.entity.AnxVentaElectronicaNotificaciones[ eSecuencial=" + eSecuencial + " ]";
    }
    
}
