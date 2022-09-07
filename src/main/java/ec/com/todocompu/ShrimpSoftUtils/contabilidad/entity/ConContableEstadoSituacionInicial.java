/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
@Table(name = "con_contable_estado_situacion_inicial", schema = "contabilidad")
@NamedQueries({
    @NamedQuery(name = "ConContableEstadoSituacionInicial.findAll", query = "SELECT c FROM ConContableEstadoSituacionInicial c")})
public class ConContableEstadoSituacionInicial implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ap_secuencial")
    private Integer apSecuencial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ap_fecha_hasta")
    @Temporal(TemporalType.DATE)
    private Date apFechaHasta;
    @Basic(optional = true)
    @Size(min = 1, max = 2147483647)
    @Column(name = "sec_codigo")
    private String secCodigo;
    @Basic(optional = true)
    @Size(min = 1, max = 2147483647)
    @Column(name = "sec_empresa")
    private String secEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "cta_codigo")
    private String ctaCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "cta_empresa")
    private String ctaEmpresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usr_fecha_inserta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @JoinColumns({
        @JoinColumn(name = "con_empresa", referencedColumnName = "con_empresa")
        , @JoinColumn(name = "con_periodo", referencedColumnName = "con_periodo")
        , @JoinColumn(name = "con_tipo", referencedColumnName = "con_tipo")
        , @JoinColumn(name = "con_numero", referencedColumnName = "con_numero")})
    @ManyToOne(optional = false)
    private ConContable conContable;

    public ConContableEstadoSituacionInicial() {
    }

    public ConContableEstadoSituacionInicial(Integer apSecuencial) {
        this.apSecuencial = apSecuencial;
    }

    public ConContableEstadoSituacionInicial(Integer apSecuencial, Date apFechaHasta, String secCodigo, String secEmpresa, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.apSecuencial = apSecuencial;
        this.apFechaHasta = apFechaHasta;
        this.secCodigo = secCodigo;
        this.secEmpresa = secEmpresa;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public Integer getApSecuencial() {
        return apSecuencial;
    }

    public void setApSecuencial(Integer apSecuencial) {
        this.apSecuencial = apSecuencial;
    }

    public Date getApFechaHasta() {
        return apFechaHasta;
    }

    public void setApFechaHasta(Date apFechaHasta) {
        this.apFechaHasta = apFechaHasta;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getSecEmpresa() {
        return secEmpresa;
    }

    public void setSecEmpresa(String secEmpresa) {
        this.secEmpresa = secEmpresa;
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

    public String getCtaCodigo() {
        return ctaCodigo;
    }

    public void setCtaCodigo(String ctaCodigo) {
        this.ctaCodigo = ctaCodigo;
    }

    public String getCtaEmpresa() {
        return ctaEmpresa;
    }

    public void setCtaEmpresa(String ctaEmpresa) {
        this.ctaEmpresa = ctaEmpresa;
    }

    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public ConContable getConContable() {
        return conContable;
    }

    public void setConContable(ConContable conContable) {
        this.conContable = conContable;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (apSecuencial != null ? apSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConContableEstadoSituacionInicial)) {
            return false;
        }
        ConContableEstadoSituacionInicial other = (ConContableEstadoSituacionInicial) object;
        return !((this.apSecuencial == null && other.apSecuencial != null) || (this.apSecuencial != null && !this.apSecuencial.equals(other.apSecuencial)));
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConAperturaSaldoInicial[ apSecuencial=" + apSecuencial + " ]";
    }

}
