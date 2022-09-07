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
@Table(name = "anx_compra_electronica_notificaciones", schema = "anexo")
@NamedQueries({
    @NamedQuery(name = "AnxCompraElectronicaNotificaciones.findAll", query = "SELECT a FROM AnxCompraElectronicaNotificaciones a")})
public class AnxCompraElectronicaNotificaciones implements Serializable {

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
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "e_fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eFecha;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "e_tipo")
    private String eTipo;
    
    @Size(min = 1, max = 2147483647)
    @Column(name = "e_observacion")
    private String eObservacion;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "e_informe")
    private String eInforme;
    /*+**************************************************/
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "comp_empresa")
    private String compEmpresa;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "comp_periodo")
    private String compPeriodo;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "comp_motivo")
    private String compMotivo;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "comp_numero")
    private String compNumero;

    public AnxCompraElectronicaNotificaciones() {
    }

    public AnxCompraElectronicaNotificaciones(Integer eSecuencial) {
        this.eSecuencial = eSecuencial;
    }

    public AnxCompraElectronicaNotificaciones(Integer eSecuencial, String eDestinatario, Date eFecha, String eTipo, String eObservacion, String eInforme, String compEmpresa, String compPeriodo, String compMotivo, String compNumero) {
        this.eSecuencial = eSecuencial;
        this.eDestinatario = eDestinatario;
        this.eFecha = eFecha;
        this.eTipo = eTipo;
        this.eObservacion = eObservacion;
        this.eInforme = eInforme;
        this.compEmpresa = compEmpresa;
        this.compPeriodo = compPeriodo;
        this.compMotivo = compMotivo;
        this.compNumero = compNumero;
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

    public String getCompEmpresa() {
        return compEmpresa;
    }

    public void setCompEmpresa(String compEmpresa) {
        this.compEmpresa = compEmpresa;
    }

    public String getCompPeriodo() {
        return compPeriodo;
    }

    public void setCompPeriodo(String compPeriodo) {
        this.compPeriodo = compPeriodo;
    }

    public String getCompMotivo() {
        return compMotivo;
    }

    public void setCompMotivo(String compMotivo) {
        this.compMotivo = compMotivo;
    }

    public String getCompNumero() {
        return compNumero;
    }

    public void setCompNumero(String compNumero) {
        this.compNumero = compNumero;
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
        if (!(object instanceof AnxCompraElectronicaNotificaciones)) {
            return false;
        }
        AnxCompraElectronicaNotificaciones other = (AnxCompraElectronicaNotificaciones) object;
        if ((this.eSecuencial == null && other.eSecuencial != null) || (this.eSecuencial != null && !this.eSecuencial.equals(other.eSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.anexos.entity.AnxCompraElectronicaNotificaciones[ eSecuencial=" + eSecuencial + " ]";
    }
    
}
