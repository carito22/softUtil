/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author mario
 */
@Entity
@Table(name = "anx_catastro_fantasma", schema = "anexo")
@NamedQueries({
    @NamedQuery(name = "AnxCatastroFantasma.findAll", query = "SELECT a FROM AnxCatastroFantasma a")})
public class AnxCatastroFantasma implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cf_secuencial")
    private Integer cfSecuencial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "cf_numero")
    private String cfNumero;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "cf_ruc")
    private String cfRuc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "cf_razon_social")
    private String cfRazonSocial;
    @Size(max = 2147483647)
    @Column(name = "cf_tipo_contribuyente")
    private String cfTipoContribuyente;
    @Size(max = 2147483647)
    @Column(name = "cf_zona")
    private String cfZona;
    @Size(max = 2147483647)
    @Column(name = "cf_provincia")
    private String cfProvincia;
    @Size(max = 2147483647)
    @Column(name = "cf_oficio")
    private String cfOficio;
    @Size(max = 2147483647)
    @Column(name = "cf_fecha_notificacion_oficio")
    private String cfFechaNotificacionOficio;
    @Size(max = 2147483647)
    @Column(name = "cf_numero_resolucion")
    private String cfNumeroResolucion;
    @Size(max = 2147483647)
    @Column(name = "cf_fecha_notificacion_resolucion")
    private String cfFechaNotificacionResolucion;
    @Size(max = 2147483647)
    @Column(name = "cf_estado_ruc")
    private String cfEstadoRuc;
    @Size(max = 2147483647)
    @Column(name = "cf_oficio_reactivacion")
    private String cfOficioReactivacion;
    @Size(max = 2147483647)
    @Column(name = "cf_fecha_notificacion_oficio_reactivacion")
    private String cfFechaNotificacionOficioReactivacion;
    @Size(max = 2147483647)
    @Column(name = "cf_resultado_solicitud")
    private String cfResultadoSolicitud;
    @Size(max = 2147483647)
    @Column(name = "cf_fecha_reactivacion")
    private String cfFechaReactivacion;

    public AnxCatastroFantasma() {
    }

    public AnxCatastroFantasma(Integer cfSecuencial) {
        this.cfSecuencial = cfSecuencial;
    }

    public AnxCatastroFantasma(Integer cfSecuencial, String cfNumero, String cfRuc, String cfRazonSocial) {
        this.cfSecuencial = cfSecuencial;
        this.cfNumero = cfNumero;
        this.cfRuc = cfRuc;
        this.cfRazonSocial = cfRazonSocial;
    }

    public Integer getCfSecuencial() {
        return cfSecuencial;
    }

    public void setCfSecuencial(Integer cfSecuencial) {
        this.cfSecuencial = cfSecuencial;
    }

    public String getCfNumero() {
        return cfNumero;
    }

    public void setCfNumero(String cfNumero) {
        this.cfNumero = cfNumero;
    }

    public String getCfRuc() {
        return cfRuc;
    }

    public void setCfRuc(String cfRuc) {
        this.cfRuc = cfRuc;
    }

    public String getCfRazonSocial() {
        return cfRazonSocial;
    }

    public void setCfRazonSocial(String cfRazonSocial) {
        this.cfRazonSocial = cfRazonSocial;
    }

    public String getCfTipoContribuyente() {
        return cfTipoContribuyente;
    }

    public void setCfTipoContribuyente(String cfTipoContribuyente) {
        this.cfTipoContribuyente = cfTipoContribuyente;
    }

    public String getCfZona() {
        return cfZona;
    }

    public void setCfZona(String cfZona) {
        this.cfZona = cfZona;
    }

    public String getCfProvincia() {
        return cfProvincia;
    }

    public void setCfProvincia(String cfProvincia) {
        this.cfProvincia = cfProvincia;
    }

    public String getCfOficio() {
        return cfOficio;
    }

    public void setCfOficio(String cfOficio) {
        this.cfOficio = cfOficio;
    }

    public String getCfFechaNotificacionOficio() {
        return cfFechaNotificacionOficio;
    }

    public void setCfFechaNotificacionOficio(String cfFechaNotificacionOficio) {
        this.cfFechaNotificacionOficio = cfFechaNotificacionOficio;
    }

    public String getCfNumeroResolucion() {
        return cfNumeroResolucion;
    }

    public void setCfNumeroResolucion(String cfNumeroResolucion) {
        this.cfNumeroResolucion = cfNumeroResolucion;
    }

    public String getCfFechaNotificacionResolucion() {
        return cfFechaNotificacionResolucion;
    }

    public void setCfFechaNotificacionResolucion(String cfFechaNotificacionResolucion) {
        this.cfFechaNotificacionResolucion = cfFechaNotificacionResolucion;
    }

    public String getCfEstadoRuc() {
        return cfEstadoRuc;
    }

    public void setCfEstadoRuc(String cfEstadoRuc) {
        this.cfEstadoRuc = cfEstadoRuc;
    }

    public String getCfOficioReactivacion() {
        return cfOficioReactivacion;
    }

    public void setCfOficioReactivacion(String cfOficioReactivacion) {
        this.cfOficioReactivacion = cfOficioReactivacion;
    }

    public String getCfFechaNotificacionOficioReactivacion() {
        return cfFechaNotificacionOficioReactivacion;
    }

    public void setCfFechaNotificacionOficioReactivacion(String cfFechaNotificacionOficioReactivacion) {
        this.cfFechaNotificacionOficioReactivacion = cfFechaNotificacionOficioReactivacion;
    }

    public String getCfResultadoSolicitud() {
        return cfResultadoSolicitud;
    }

    public void setCfResultadoSolicitud(String cfResultadoSolicitud) {
        this.cfResultadoSolicitud = cfResultadoSolicitud;
    }

    public String getCfFechaReactivacion() {
        return cfFechaReactivacion;
    }

    public void setCfFechaReactivacion(String cfFechaReactivacion) {
        this.cfFechaReactivacion = cfFechaReactivacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cfSecuencial != null ? cfSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnxCatastroFantasma)) {
            return false;
        }
        AnxCatastroFantasma other = (AnxCatastroFantasma) object;
        if ((this.cfSecuencial == null && other.cfSecuencial != null) || (this.cfSecuencial != null && !this.cfSecuencial.equals(other.cfSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.anexos.entity.AnxCatastroFantasma[ cfSecuencial=" + cfSecuencial + " ]";
    }
    
}
