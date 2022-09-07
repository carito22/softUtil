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
 * @author CarolValdiviezo
 */
@Entity
@Table(name = "anx_guia_remision_electronica_notificaciones", schema = "anexo")
@NamedQueries({
    @NamedQuery(name = "AnxGuiaRemisionElectronicaNotificaciones.findAll", query = "SELECT a FROM AnxGuiaRemisionElectronicaNotificaciones a")})
public class AnxGuiaRemisionElectronicaNotificaciones implements Serializable {

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
    @Column(name = "guia_empresa")
    private String guiaEmpresa;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "guia_periodo")
    private String guiaPeriodo;

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "guia_numero")
    private String guiaNumero;

    public AnxGuiaRemisionElectronicaNotificaciones() {
    }

    public Integer geteSecuencial() {
        return eSecuencial;
    }

    public void seteSecuencial(Integer eSecuencial) {
        this.eSecuencial = eSecuencial;
    }

    public String geteDestinatario() {
        return eDestinatario;
    }

    public void seteDestinatario(String eDestinatario) {
        this.eDestinatario = eDestinatario;
    }

    public Date geteFecha() {
        return eFecha;
    }

    public void seteFecha(Date eFecha) {
        this.eFecha = eFecha;
    }

    public String geteTipo() {
        return eTipo;
    }

    public void seteTipo(String eTipo) {
        this.eTipo = eTipo;
    }

    public String geteObservacion() {
        return eObservacion;
    }

    public void seteObservacion(String eObservacion) {
        this.eObservacion = eObservacion;
    }

    public String geteInforme() {
        return eInforme;
    }

    public void seteInforme(String eInforme) {
        this.eInforme = eInforme;
    }

    public String getGuiaEmpresa() {
        return guiaEmpresa;
    }

    public void setGuiaEmpresa(String guiaEmpresa) {
        this.guiaEmpresa = guiaEmpresa;
    }

    public String getGuiaPeriodo() {
        return guiaPeriodo;
    }

    public void setGuiaPeriodo(String guiaPeriodo) {
        this.guiaPeriodo = guiaPeriodo;
    }

    public String getGuiaNumero() {
        return guiaNumero;
    }

    public void setGuiaNumero(String guiaNumero) {
        this.guiaNumero = guiaNumero;
    }

}
