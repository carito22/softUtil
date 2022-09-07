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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author VALDIVIEZO
 */
@Entity
@Table(name = "anx_comprobantes_electronicos_emitidos", schema = "anexo")
public class AnxComprobantesElectronicosEmitidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    private AnxComprobantesElectronicosEmitidosPk anxComprobantesElectronicosEmitidosPk;
    @Column(name = "compro_comprobante")
    private String comproComprobante;
    @Column(name = "compro_serie_comprobante")
    private String comproSerieComprobante;
    @Column(name = "compro_ruc_emisor")
    private String comproRucEmisor;
    @Column(name = "compro_razon_social_emisor")
    private String comproRazonSocialEmisor;
    @Column(name = "compro_fecha_emision")
    private Date comproFechaEmision;
    @Column(name = "compro_fecha_autorizacion")
    private Date comproFechaAutorizacion;
    @Column(name = "compro_tipo_emision")
    private String comproTipoEmision;
    @Column(name = "compro_identificacion_receptor")
    private String comproIdentificacionReceptor;
    @Column(name = "compro_numero_autorizacion")
    private String comproNumeroAutorizacion;
    @Column(name = "compro_importe_total")
    private BigDecimal comproImporteTotal;
    @Column(name = "compro_cancelado")
    private boolean comproCancelado;
    @Column(name = "compro_importado")
    private boolean comproImportado;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @Column(name = "compro_complemento")
    private String comproComplemento;
    @Column(name = "compro_xml")
    private byte[] comproXml;

    @Transient
    private String comproRazonSocialReceptor;

    @Transient
    private String codigoClienteEnSistema;

    public AnxComprobantesElectronicosEmitidos() {
    }

    public AnxComprobantesElectronicosEmitidos(AnxComprobantesElectronicosEmitidosPk anxComprobantesElectronicosEmitidosPk, String comproComprobante, String comproSerieComprobante, String comproRucEmisor, String comproRazonSocialEmisor, Date comproFechaEmision, Date comproFechaAutorizacion, String comproTipoEmision, String comproIdentificacionReceptor, String comproNumeroAutorizacion, BigDecimal comproImporteTotal, boolean comproCancelado, boolean comproImportado, String usrEmpresa, String usrCodigo, Date usrFechaInserta, String comproComplemento, byte[] comproXml) {
        this.anxComprobantesElectronicosEmitidosPk = anxComprobantesElectronicosEmitidosPk;
        this.comproComprobante = comproComprobante;
        this.comproSerieComprobante = comproSerieComprobante;
        this.comproRucEmisor = comproRucEmisor;
        this.comproRazonSocialEmisor = comproRazonSocialEmisor;
        this.comproFechaEmision = comproFechaEmision;
        this.comproFechaAutorizacion = comproFechaAutorizacion;
        this.comproTipoEmision = comproTipoEmision;
        this.comproIdentificacionReceptor = comproIdentificacionReceptor;
        this.comproNumeroAutorizacion = comproNumeroAutorizacion;
        this.comproImporteTotal = comproImporteTotal;
        this.comproCancelado = comproCancelado;
        this.comproImportado = comproImportado;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.comproComplemento = comproComplemento;
        this.comproXml = comproXml;
    }

    public AnxComprobantesElectronicosEmitidosPk getAnxComprobantesElectronicosEmitidosPk() {
        return anxComprobantesElectronicosEmitidosPk;
    }

    public void setAnxComprobantesElectronicosEmitidosPk(AnxComprobantesElectronicosEmitidosPk anxComprobantesElectronicosEmitidosPk) {
        this.anxComprobantesElectronicosEmitidosPk = anxComprobantesElectronicosEmitidosPk;
    }

    public String getComproComprobante() {
        return comproComprobante;
    }

    public void setComproComprobante(String comproComprobante) {
        this.comproComprobante = comproComprobante;
    }

    public String getComproSerieComprobante() {
        return comproSerieComprobante;
    }

    public void setComproSerieComprobante(String comproSerieComprobante) {
        this.comproSerieComprobante = comproSerieComprobante;
    }

    public String getComproRucEmisor() {
        return comproRucEmisor;
    }

    public void setComproRucEmisor(String comproRucEmisor) {
        this.comproRucEmisor = comproRucEmisor;
    }

    public String getComproRazonSocialEmisor() {
        return comproRazonSocialEmisor;
    }

    public void setComproRazonSocialEmisor(String comproRazonSocialEmisor) {
        this.comproRazonSocialEmisor = comproRazonSocialEmisor;
    }

    public Date getComproFechaEmision() {
        return comproFechaEmision;
    }

    public void setComproFechaEmision(Date comproFechaEmision) {
        this.comproFechaEmision = comproFechaEmision;
    }

    public Date getComproFechaAutorizacion() {
        return comproFechaAutorizacion;
    }

    public void setComproFechaAutorizacion(Date comproFechaAutorizacion) {
        this.comproFechaAutorizacion = comproFechaAutorizacion;
    }

    public String getComproTipoEmision() {
        return comproTipoEmision;
    }

    public void setComproTipoEmision(String comproTipoEmision) {
        this.comproTipoEmision = comproTipoEmision;
    }

    public String getComproIdentificacionReceptor() {
        return comproIdentificacionReceptor;
    }

    public void setComproIdentificacionReceptor(String comproIdentificacionReceptor) {
        this.comproIdentificacionReceptor = comproIdentificacionReceptor;
    }

    public String getComproNumeroAutorizacion() {
        return comproNumeroAutorizacion;
    }

    public void setComproNumeroAutorizacion(String comproNumeroAutorizacion) {
        this.comproNumeroAutorizacion = comproNumeroAutorizacion;
    }

    public BigDecimal getComproImporteTotal() {
        return comproImporteTotal;
    }

    public void setComproImporteTotal(BigDecimal comproImporteTotal) {
        this.comproImporteTotal = comproImporteTotal;
    }

    public boolean isComproCancelado() {
        return comproCancelado;
    }

    public void setComproCancelado(boolean comproCancelado) {
        this.comproCancelado = comproCancelado;
    }

    public boolean isComproImportado() {
        return comproImportado;
    }

    public void setComproImportado(boolean comproImportado) {
        this.comproImportado = comproImportado;
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

    public String getComproComplemento() {
        return comproComplemento;
    }

    public void setComproComplemento(String comproComplemento) {
        this.comproComplemento = comproComplemento;
    }

    public byte[] getComproXml() {
        return comproXml;
    }

    public void setComproXml(byte[] comproXml) {
        this.comproXml = comproXml;
    }

    public String getCodigoClienteEnSistema() {
        return codigoClienteEnSistema;
    }

    public void setCodigoClienteEnSistema(String codigoClienteEnSistema) {
        this.codigoClienteEnSistema = codigoClienteEnSistema;
    }

    public String getComproRazonSocialReceptor() {
        return comproRazonSocialReceptor;
    }

    public void setComproRazonSocialReceptor(String comproRazonSocialReceptor) {
        this.comproRazonSocialReceptor = comproRazonSocialReceptor;
    }

}
