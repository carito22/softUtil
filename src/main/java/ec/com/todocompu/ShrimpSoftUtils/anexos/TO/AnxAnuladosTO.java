
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class AnxAnuladosTO implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "anu_secuencial")
    private Integer anuSecuencial;

    @Column(name = "anu_comprobante_establecimiento")
    private String anuComprobanteEstablecimiento;

    @Column(name = "anu_comprobante_punto_emision")
    private String anuComprobantePuntoEmision;

    @Column(name = "anu_secuencial_inicio")
    private String anuSecuencialInicio;

    @Column(name = "anu_secuencial_fin")
    private String anuSecuencialFin;

    @Column(name = "anu_autorizacion")
    private String anuAutorizacion;

    @Column(name = "anu_fecha")
    private String anuFecha;

    @Column(name = "tc_codigo")
    private String tcCodigo;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    @Transient
    private boolean actualizarFechaSri;

    public AnxAnuladosTO() {
    }

    public AnxAnuladosTO(Integer anuSecuencial, String anuComprobanteEstablecimiento, String anuComprobantePuntoEmision,
            String anuSecuencialInicio, String anuSecuencialFin, String anuAutorizacion, String anuFecha,
            String tcCodigo, String usrEmpresa, String usrCodigo, String usrFechaInserta) {
        this.anuSecuencial = anuSecuencial;
        this.anuComprobanteEstablecimiento = anuComprobanteEstablecimiento;
        this.anuComprobantePuntoEmision = anuComprobantePuntoEmision;
        this.anuSecuencialInicio = anuSecuencialInicio;
        this.anuSecuencialFin = anuSecuencialFin;
        this.anuAutorizacion = anuAutorizacion;
        this.anuFecha = anuFecha;
        this.tcCodigo = tcCodigo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getAnuAutorizacion() {
        return anuAutorizacion;
    }

    public void setAnuAutorizacion(String anuAutorizacion) {
        this.anuAutorizacion = anuAutorizacion;
    }

    public String getAnuComprobanteEstablecimiento() {
        return anuComprobanteEstablecimiento;
    }

    public void setAnuComprobanteEstablecimiento(String anuComprobanteEstablecimiento) {
        this.anuComprobanteEstablecimiento = anuComprobanteEstablecimiento;
    }

    public String getAnuComprobantePuntoEmision() {
        return anuComprobantePuntoEmision;
    }

    public void setAnuComprobantePuntoEmision(String anuComprobantePuntoEmision) {
        this.anuComprobantePuntoEmision = anuComprobantePuntoEmision;
    }

    public String getAnuFecha() {
        return anuFecha;
    }

    public void setAnuFecha(String anuFecha) {
        this.anuFecha = anuFecha;
    }

    public Integer getAnuSecuencial() {
        return anuSecuencial;
    }

    public void setAnuSecuencial(Integer anuSecuencial) {
        this.anuSecuencial = anuSecuencial;
    }

    public String getAnuSecuencialFin() {
        return anuSecuencialFin;
    }

    public void setAnuSecuencialFin(String anuSecuencialFin) {
        this.anuSecuencialFin = anuSecuencialFin;
    }

    public String getAnuSecuencialInicio() {
        return anuSecuencialInicio;
    }

    public void setAnuSecuencialInicio(String anuSecuencialInicio) {
        this.anuSecuencialInicio = anuSecuencialInicio;
    }

    public String getTcCodigo() {
        return tcCodigo;
    }

    public void setTcCodigo(String tcCodigo) {
        this.tcCodigo = tcCodigo;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public boolean isActualizarFechaSri() {
        return actualizarFechaSri;
    }

    public void setActualizarFechaSri(boolean actualizarFechaSri) {
        this.actualizarFechaSri = actualizarFechaSri;
    }

}
