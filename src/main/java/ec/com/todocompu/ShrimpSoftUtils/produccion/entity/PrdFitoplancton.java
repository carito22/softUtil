/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
@Table(name = "prd_fitoplancton", schema = "produccion")
public class PrdFitoplancton implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdFitoplanctonPK prdFitoplanctonPK;
    @Column(name = "fit_porcentaje_salinidad")
    private BigDecimal fitPorcentajeSalinidad;
    @Column(name = "fit_diatomeas")
    private BigDecimal fitDiatomeas;
    @Column(name = "fit_clorophytas")
    private BigDecimal fitClorophytas;
    @Column(name = "fit_cyanofitas")
    private BigDecimal fitCyanofitas;
    @Column(name = "fit_euglenales")
    private BigDecimal fitEuglenales;
    @Column(name = "fit_dinoflagelados")
    private BigDecimal fitDinoflagelados;

    @JoinColumns({
        @JoinColumn(name = "pis_empresa", referencedColumnName = "pis_empresa")
        ,@JoinColumn(name = "pis_sector", referencedColumnName = "pis_sector")
        ,@JoinColumn(name = "pis_numero", referencedColumnName = "pis_numero")})
    @ManyToOne(optional = false)
    private PrdPiscina prdPiscina;

    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;

    public PrdFitoplancton() {
    }

    public PrdFitoplanctonPK getPrdFitoplanctonPK() {
        return prdFitoplanctonPK;
    }

    public void setPrdFitoplanctonPK(PrdFitoplanctonPK prdFitoplanctonPK) {
        this.prdFitoplanctonPK = prdFitoplanctonPK;
    }

    public BigDecimal getFitPorcentajeSalinidad() {
        return fitPorcentajeSalinidad;
    }

    public void setFitPorcentajeSalinidad(BigDecimal fitPorcentajeSalinidad) {
        this.fitPorcentajeSalinidad = fitPorcentajeSalinidad;
    }

    public BigDecimal getFitDiatomeas() {
        return fitDiatomeas;
    }

    public void setFitDiatomeas(BigDecimal fitDiatomeas) {
        this.fitDiatomeas = fitDiatomeas;
    }

    public BigDecimal getFitClorophytas() {
        return fitClorophytas;
    }

    public void setFitClorophytas(BigDecimal fitClorophytas) {
        this.fitClorophytas = fitClorophytas;
    }

    public BigDecimal getFitCyanofitas() {
        return fitCyanofitas;
    }

    public void setFitCyanofitas(BigDecimal fitCyanofitas) {
        this.fitCyanofitas = fitCyanofitas;
    }

    public BigDecimal getFitEuglenales() {
        return fitEuglenales;
    }

    public void setFitEuglenales(BigDecimal fitEuglenales) {
        this.fitEuglenales = fitEuglenales;
    }

    public BigDecimal getFitDinoflagelados() {
        return fitDinoflagelados;
    }

    public void setFitDinoflagelados(BigDecimal fitDinoflagelados) {
        this.fitDinoflagelados = fitDinoflagelados;
    }

    public PrdPiscina getPrdPiscina() {
        return prdPiscina;
    }

    public void setPrdPiscina(PrdPiscina prdPiscina) {
        this.prdPiscina = prdPiscina;
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

}
