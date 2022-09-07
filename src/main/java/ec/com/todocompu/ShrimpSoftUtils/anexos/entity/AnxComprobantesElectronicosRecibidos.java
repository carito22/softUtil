/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import java.math.BigDecimal;
import javax.persistence.EmbeddedId;

/**
 *
 * @author Usuario1
 */
@Entity
@Table(name = "anx_comprobantes_electronicos_recibidos", schema = "anexo")
public class AnxComprobantesElectronicosRecibidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AnxComprobantesElectronicosRecibidosPk anxComprobantesElectronicosRecibidosPk;
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
    @Temporal(TemporalType.TIMESTAMP)
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

    public AnxComprobantesElectronicosRecibidos() {
    }

    public AnxComprobantesElectronicosRecibidos(AnxComprobantesElectronicosRecibidosPk anxComprobantesElectronicosRecibidosPk) {
        this.anxComprobantesElectronicosRecibidosPk = anxComprobantesElectronicosRecibidosPk;
    }

    public AnxComprobantesElectronicosRecibidos(String comproEmpresa, String comproPeriodo, String comproClaveAcceso) {
        this.anxComprobantesElectronicosRecibidosPk = new AnxComprobantesElectronicosRecibidosPk(comproEmpresa, comproPeriodo, comproClaveAcceso);
    }

    public AnxComprobantesElectronicosRecibidosPk getAnxComprobantesElectronicosRecibidosPk() {
        return anxComprobantesElectronicosRecibidosPk;
    }

    public void setAnxComprobantesElectronicosRecibidosPk(AnxComprobantesElectronicosRecibidosPk anxComprobantesElectronicosRecibidosPk) {
        this.anxComprobantesElectronicosRecibidosPk = anxComprobantesElectronicosRecibidosPk;
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

    public Boolean getComproCancelado() {
        return comproCancelado;
    }

    public void setComproCancelado(Boolean comproCancelado) {
        this.comproCancelado = comproCancelado;
    }

    public Boolean getComproImportado() {
        return comproImportado;
    }

    public void setComproImportado(Boolean comproImportado) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (anxComprobantesElectronicosRecibidosPk != null ? anxComprobantesElectronicosRecibidosPk.hashCode() : 0);
        return hash;
    }

    public boolean equals(Object object) {
        if (!(object instanceof AnxComprobantesElectronicosRecibidos)) {
            return false;
        }
        AnxComprobantesElectronicosRecibidos other = (AnxComprobantesElectronicosRecibidos) object;
        if ((this.anxComprobantesElectronicosRecibidosPk == null && other.anxComprobantesElectronicosRecibidosPk != null)
                || (this.anxComprobantesElectronicosRecibidosPk != null && !this.anxComprobantesElectronicosRecibidosPk.equals(other.anxComprobantesElectronicosRecibidosPk))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "anexos.entity.anx_comprobantes_electronicos_recibidos[ anxComprobantesElectronicosRecibidosPk= " + anxComprobantesElectronicosRecibidosPk + "]";
    }

}
