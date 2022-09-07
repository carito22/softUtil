/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author VALDIVIEZO
 */
@Entity
@Table(name = "anx_retenciones_venta", schema = "anexo")
public class AnxRetencionesVenta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "ret_secuencial")
    private Integer retSecuencial;
    @Column(name = "ret_empresa")
    private String retEmpresa;

    @Column(name = "cli_razon_social")
    private String cliRazonSocial;
    @Column(name = "cli_identificacion")
    private String cliIdentificacion;

    @Column(name = "ret_numero_documento")
    private String retNumeroDocumento;

    @Column(name = "ret_doc_sustento")
    private String retDocSustento;
    @Column(name = "ret_num_doc_sustento")
    private String retNumDocSustento;

    @Column(name = "ret_clave_acceso")
    private String retClaveAcceso;
    @Column(name = "ret_valor_retencion_ir")
    private BigDecimal retValorRetencionIr;
    @Column(name = "ret_valor_retencion_iva")
    private BigDecimal retValorRetencionIva;

    @Column(name = "ret_anulado")
    private boolean retAnulado;

    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;

    public AnxRetencionesVenta() {
    }

    public AnxRetencionesVenta(Integer retSecuencial, String retEmpresa, String cliRazonSocial, String cliIdentificacion, String retNumeroDocumento, String retClaveAcceso, BigDecimal retValorRetencionIr, BigDecimal retValorRetencionIva, boolean retAnulado, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.retSecuencial = retSecuencial;
        this.retEmpresa = retEmpresa;
        this.cliRazonSocial = cliRazonSocial;
        this.cliIdentificacion = cliIdentificacion;
        this.retNumeroDocumento = retNumeroDocumento;
        this.retClaveAcceso = retClaveAcceso;
        this.retValorRetencionIr = retValorRetencionIr;
        this.retValorRetencionIva = retValorRetencionIva;
        this.retAnulado = retAnulado;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public Integer getRetSecuencial() {
        return retSecuencial;
    }

    public void setRetSecuencial(Integer retSecuencial) {
        this.retSecuencial = retSecuencial;
    }

    public String getRetEmpresa() {
        return retEmpresa;
    }

    public void setRetEmpresa(String retEmpresa) {
        this.retEmpresa = retEmpresa;
    }

    public String getCliRazonSocial() {
        return cliRazonSocial;
    }

    public void setCliRazonSocial(String cliRazonSocial) {
        this.cliRazonSocial = cliRazonSocial;
    }

    public String getCliIdentificacion() {
        return cliIdentificacion;
    }

    public void setCliIdentificacion(String cliIdentificacion) {
        this.cliIdentificacion = cliIdentificacion;
    }

    public String getRetNumeroDocumento() {
        return retNumeroDocumento;
    }

    public void setRetNumeroDocumento(String retNumeroDocumento) {
        this.retNumeroDocumento = retNumeroDocumento;
    }

    public String getRetClaveAcceso() {
        return retClaveAcceso;
    }

    public void setRetClaveAcceso(String retClaveAcceso) {
        this.retClaveAcceso = retClaveAcceso;
    }

    public BigDecimal getRetValorRetencionIr() {
        return retValorRetencionIr;
    }

    public void setRetValorRetencionIr(BigDecimal retValorRetencionIr) {
        this.retValorRetencionIr = retValorRetencionIr;
    }

    public BigDecimal getRetValorRetencionIva() {
        return retValorRetencionIva;
    }

    public void setRetValorRetencionIva(BigDecimal retValorRetencionIva) {
        this.retValorRetencionIva = retValorRetencionIva;
    }

    public boolean isRetAnulado() {
        return retAnulado;
    }

    public void setRetAnulado(boolean retAnulado) {
        this.retAnulado = retAnulado;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getRetNumDocSustento() {
        return retNumDocSustento;
    }

    public void setRetNumDocSustento(String retNumDocSustento) {
        this.retNumDocSustento = retNumDocSustento;
    }

    public String getRetDocSustento() {
        return retDocSustento;
    }

    public void setRetDocSustento(String retDocSustento) {
        this.retDocSustento = retDocSustento;
    }

}
