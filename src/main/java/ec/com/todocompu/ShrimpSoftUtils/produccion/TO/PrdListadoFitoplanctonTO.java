/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
public class PrdListadoFitoplanctonTO implements Serializable {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "fit_piscina_codigo")
    private String fitPiscinaCodigo;
    @Column(name = "fit_piscina_nombre")
    private String fitPiscinaNombre;
    @Column(name = "fit_fecha")
    private Date fitFecha;
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

    public PrdListadoFitoplanctonTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFitFecha() {
        return fitFecha;
    }

    public void setFitFecha(Date fitFecha) {
        this.fitFecha = fitFecha;
    }

    public String getFitPiscinaCodigo() {
        return fitPiscinaCodigo;
    }

    public void setFitPiscinaCodigo(String fitPiscinaCodigo) {
        this.fitPiscinaCodigo = fitPiscinaCodigo;
    }

    public String getFitPiscinaNombre() {
        return fitPiscinaNombre;
    }

    public void setFitPiscinaNombre(String fitPiscinaNombre) {
        this.fitPiscinaNombre = fitPiscinaNombre;
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

}
