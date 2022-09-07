/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity;

import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdSector;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Trabajo
 */
@Entity
@Table(name = "con_contable_planilla_aportes", schema = "contabilidad")
public class ConContablePlanillaAportes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "planilla_secuencial")
    private Integer planillaSecuencial;
    @Column(name = "planilla_aporte_individual")
    private BigDecimal planillaAporteIndividual;
    @Column(name = "planilla_aporte_patronal")
    private BigDecimal planillaAportePatronal;
    @Column(name = "planilla_aporte_iece")
    private BigDecimal planillaAporteIece;
    @Column(name = "planilla_aporte_secap")
    private BigDecimal planillaAporteSecap;
    @Column(name = "planilla_actualizar_contable")
    private boolean planillaActualizarContable;
    @Column(name = "planilla_observacion")
    private String planillaObservacion;
    @JoinColumns({
        @JoinColumn(name = "sec_empresa", referencedColumnName = "sec_empresa")
        ,@JoinColumn(name = "sec_codigo", referencedColumnName = "sec_codigo")})
    @ManyToOne(optional = false)
    private PrdSector prdSector;
    @JoinColumns({
        @JoinColumn(name = "cta_empresa", referencedColumnName = "cta_empresa")
        ,@JoinColumn(name = "cta_codigo", referencedColumnName = "cta_codigo")})
    @ManyToOne(optional = false)
    private ConCuentas conCuentas;
    @JoinColumns({
        @JoinColumn(name = "con_empresa", referencedColumnName = "con_empresa")
        ,@JoinColumn(name = "con_periodo", referencedColumnName = "con_periodo")
        ,@JoinColumn(name = "con_tipo", referencedColumnName = "con_tipo")
        ,@JoinColumn(name = "con_numero", referencedColumnName = "con_numero")})
    @ManyToOne(optional = true)
    private ConContable conContable;
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
    @Column(name = "usr_fecha_inserta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;

    public ConContablePlanillaAportes() {
    }

    public Integer getPlanillaSecuencial() {
        return planillaSecuencial;
    }

    public void setPlanillaSecuencial(Integer planillaSecuencial) {
        this.planillaSecuencial = planillaSecuencial;
    }

    public BigDecimal getPlanillaAporteIndividual() {
        return planillaAporteIndividual;
    }

    public void setPlanillaAporteIndividual(BigDecimal planillaAporteIndividual) {
        this.planillaAporteIndividual = planillaAporteIndividual;
    }

    public BigDecimal getPlanillaAportePatronal() {
        return planillaAportePatronal;
    }

    public void setPlanillaAportePatronal(BigDecimal planillaAportePatronal) {
        this.planillaAportePatronal = planillaAportePatronal;
    }

    public BigDecimal getPlanillaAporteIece() {
        return planillaAporteIece;
    }

    public void setPlanillaAporteIece(BigDecimal planillaAporteIece) {
        this.planillaAporteIece = planillaAporteIece;
    }

    public BigDecimal getPlanillaAporteSecap() {
        return planillaAporteSecap;
    }

    public void setPlanillaAporteSecap(BigDecimal planillaAporteSecap) {
        this.planillaAporteSecap = planillaAporteSecap;
    }

    public boolean isPlanillaActualizarContable() {
        return planillaActualizarContable;
    }

    public void setPlanillaActualizarContable(boolean planillaActualizarContable) {
        this.planillaActualizarContable = planillaActualizarContable;
    }

    public PrdSector getPrdSector() {
        return prdSector;
    }

    public void setPrdSector(PrdSector prdSector) {
        this.prdSector = prdSector;
    }

    public ConCuentas getConCuentas() {
        return conCuentas;
    }

    public void setConCuentas(ConCuentas conCuentas) {
        this.conCuentas = conCuentas;
    }

    public ConContable getConContable() {
        return conContable;
    }

    public void setConContable(ConContable conContable) {
        this.conContable = conContable;
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

    public String getPlanillaObservacion() {
        return planillaObservacion;
    }

    public void setPlanillaObservacion(String planillaObservacion) {
        this.planillaObservacion = planillaObservacion;
    }

}
