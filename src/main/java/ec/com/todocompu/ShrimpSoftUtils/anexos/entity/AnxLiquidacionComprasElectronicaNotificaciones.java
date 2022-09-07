/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

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
@Table(name = "anx_liquidacion_compras_electronica_notificaciones", schema = "anexo")
@NamedQueries({
    @NamedQuery(name = "AnxLiquidacionComprasElectronicaNotificaciones.findAll", query = "SELECT a FROM AnxLiquidacionComprasElectronicaNotificaciones a")})
public class AnxLiquidacionComprasElectronicaNotificaciones {

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

    public AnxLiquidacionComprasElectronicaNotificaciones() {
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

}
