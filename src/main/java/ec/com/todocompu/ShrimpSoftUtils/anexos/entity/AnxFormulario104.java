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
import javax.persistence.Transient;

/**
 *
 * @author VALDIVIEZO
 */
@Entity
@Table(name = "anx_formulario_104", schema = "anexo")
public class AnxFormulario104 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "frm104_secuencial")
    private Integer frm104Secuencial;
    @Column(name = "frm104_empresa")
    private String frm104Empresa;
    @Column(name = "frm104_fecha_desde")
    @Temporal(TemporalType.DATE)
    private Date frm104FechaDesde;
    @Column(name = "frm104_fecha_hasta")
    @Temporal(TemporalType.DATE)
    private Date frm104FechaHasta;

    @Column(name = "frm104_valor_605")
    private BigDecimal frm104Valor605;
    @Column(name = "frm104_valor_606")
    private BigDecimal frm104Valor606;

    @Transient
    private BigDecimal frm104Valor609;

    @Column(name = "frm104_valor_615")
    private BigDecimal frm104Valor615;
    @Column(name = "frm104_valor_617")
    private BigDecimal frm104Valor617;
    @Column(name = "frm104_valor_620")
    private BigDecimal frm104Valor620;

    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @Column(name = "frm104_contenido")
    private String frm104Contenido;

    public AnxFormulario104() {
    }

    public AnxFormulario104(Integer frm104Secuencial, String frm104Empresa, Date frm104FechaDesde, Date frm104FechaHasta, BigDecimal frm104Valor605, BigDecimal frm104Valor606, BigDecimal frm104Valor609, BigDecimal frm104Valor615, BigDecimal frm104Valor617, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.frm104Secuencial = frm104Secuencial;
        this.frm104Empresa = frm104Empresa;
        this.frm104FechaDesde = frm104FechaDesde;
        this.frm104FechaHasta = frm104FechaHasta;
        this.frm104Valor605 = frm104Valor605;
        this.frm104Valor606 = frm104Valor606;
        this.frm104Valor609 = frm104Valor609;
        this.frm104Valor615 = frm104Valor615;
        this.frm104Valor617 = frm104Valor617;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public Integer getFrm104Secuencial() {
        return frm104Secuencial;
    }

    public void setFrm104Secuencial(Integer frm104Secuencial) {
        this.frm104Secuencial = frm104Secuencial;
    }

    public String getFrm104Empresa() {
        return frm104Empresa;
    }

    public void setFrm104Empresa(String frm104Empresa) {
        this.frm104Empresa = frm104Empresa;
    }

    public Date getFrm104FechaDesde() {
        return frm104FechaDesde;
    }

    public void setFrm104FechaDesde(Date frm104FechaDesde) {
        this.frm104FechaDesde = frm104FechaDesde;
    }

    public Date getFrm104FechaHasta() {
        return frm104FechaHasta;
    }

    public void setFrm104FechaHasta(Date frm104FechaHasta) {
        this.frm104FechaHasta = frm104FechaHasta;
    }

    public BigDecimal getFrm104Valor605() {
        return frm104Valor605;
    }

    public void setFrm104Valor605(BigDecimal frm104Valor605) {
        this.frm104Valor605 = frm104Valor605;
    }

    public BigDecimal getFrm104Valor606() {
        return frm104Valor606;
    }

    public void setFrm104Valor606(BigDecimal frm104Valor606) {
        this.frm104Valor606 = frm104Valor606;
    }

    public BigDecimal getFrm104Valor609() {
        return frm104Valor609;
    }

    public void setFrm104Valor609(BigDecimal frm104Valor609) {
        this.frm104Valor609 = frm104Valor609;
    }

    public BigDecimal getFrm104Valor615() {
        return frm104Valor615;
    }

    public void setFrm104Valor615(BigDecimal frm104Valor615) {
        this.frm104Valor615 = frm104Valor615;
    }

    public BigDecimal getFrm104Valor617() {
        return frm104Valor617;
    }

    public void setFrm104Valor617(BigDecimal frm104Valor617) {
        this.frm104Valor617 = frm104Valor617;
    }

    public BigDecimal getFrm104Valor620() {
        return frm104Valor620;
    }

    public void setFrm104Valor620(BigDecimal frm104Valor620) {
        this.frm104Valor620 = frm104Valor620;
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

    public String getFrm104Contenido() {
        return frm104Contenido;
    }

    public void setFrm104Contenido(String frm104Contenido) {
        this.frm104Contenido = frm104Contenido;
    }

}
