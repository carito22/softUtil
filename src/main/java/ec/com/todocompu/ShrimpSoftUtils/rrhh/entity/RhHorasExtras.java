/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConContable;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdPiscina;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdSector;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author MarioRamos
 */
@Entity
@Table(name = "rh_horas_extras", schema = "recursoshumanos")
public class RhHorasExtras implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "he_secuencial")
    private Integer heSecuencial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "he_concepto")
    private String heConcepto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "he_valor_50")
    private BigDecimal heValor50;
    @Basic(optional = false)
    @NotNull
    @Column(name = "he_valor_100")
    private BigDecimal heValor100;
    @Basic(optional = false)
    @NotNull
    @Column(name = "he_valor_extraordinaria_100")
    private BigDecimal heValorExtraordinaria100;
    @Size(max = 2147483647)
    @Column(name = "he_observacion")
    private String heObservacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "he_auxiliar")
    private boolean heAuxiliar;
    @JoinColumns({
        @JoinColumn(name = "emp_empresa", referencedColumnName = "emp_empresa")
        , @JoinColumn(name = "emp_id", referencedColumnName = "emp_id")})
    @ManyToOne(optional = false)
    private RhEmpleado rhEmpleado;
    @JoinColumns({
        @JoinColumn(name = "sec_empresa", referencedColumnName = "sec_empresa")
        , @JoinColumn(name = "sec_codigo", referencedColumnName = "sec_codigo")})
    @ManyToOne(optional = false)
    private PrdSector prdSector;
    @JoinColumns({
        @JoinColumn(name = "pis_empresa", referencedColumnName = "pis_empresa")
        , @JoinColumn(name = "pis_sector", referencedColumnName = "pis_sector")
        , @JoinColumn(name = "pis_numero", referencedColumnName = "pis_numero")})
    @ManyToOne
    private PrdPiscina prdPiscina;
    @JoinColumns({
        @JoinColumn(name = "con_empresa", referencedColumnName = "con_empresa")
        , @JoinColumn(name = "con_periodo", referencedColumnName = "con_periodo")
        , @JoinColumn(name = "con_tipo", referencedColumnName = "con_tipo")
        , @JoinColumn(name = "con_numero", referencedColumnName = "con_numero")})
    @ManyToOne(optional = false)
    @JsonIgnore
    private ConContable conContable;

    public RhHorasExtras() {
    }

    public Integer getHeSecuencial() {
        return heSecuencial;
    }

    public void setHeSecuencial(Integer heSecuencial) {
        this.heSecuencial = heSecuencial;
    }

    public String getHeConcepto() {
        return heConcepto;
    }

    public void setHeConcepto(String heConcepto) {
        this.heConcepto = heConcepto;
    }

    public BigDecimal getHeValor50() {
        return heValor50;
    }

    public void setHeValor50(BigDecimal heValor50) {
        this.heValor50 = heValor50;
    }

    public BigDecimal getHeValor100() {
        return heValor100;
    }

    public void setHeValor100(BigDecimal heValor100) {
        this.heValor100 = heValor100;
    }

    public BigDecimal getHeValorExtraordinaria100() {
        return heValorExtraordinaria100;
    }

    public void setHeValorExtraordinaria100(BigDecimal heValorExtraordinaria100) {
        this.heValorExtraordinaria100 = heValorExtraordinaria100;
    }

    public String getHeObservacion() {
        return heObservacion;
    }

    public void setHeObservacion(String heObservacion) {
        this.heObservacion = heObservacion;
    }

    public boolean isHeAuxiliar() {
        return heAuxiliar;
    }

    public void setHeAuxiliar(boolean heAuxiliar) {
        this.heAuxiliar = heAuxiliar;
    }

    public RhEmpleado getRhEmpleado() {
        return rhEmpleado;
    }

    public void setRhEmpleado(RhEmpleado rhEmpleado) {
        this.rhEmpleado = rhEmpleado;
    }

    public PrdSector getPrdSector() {
        return prdSector;
    }

    public void setPrdSector(PrdSector prdSector) {
        this.prdSector = prdSector;
    }

    public PrdPiscina getPrdPiscina() {
        return prdPiscina;
    }

    public void setPrdPiscina(PrdPiscina prdPiscina) {
        this.prdPiscina = prdPiscina;
    }

    public ConContable getConContable() {
        return conContable;
    }

    public void setConContable(ConContable conContable) {
        this.conContable = conContable;
    }

}
