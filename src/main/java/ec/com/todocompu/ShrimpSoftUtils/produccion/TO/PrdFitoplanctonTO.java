/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
public class PrdFitoplanctonTO implements Serializable {

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "fit_piscina_codigo")
    private String fitPiscinaCodigo;
    @Column(name = "fit_piscina_nombre")
    private String fitPiscinaNombre;
    @Column(name = "fit_porcentaje_salinidad_anterior")
    private BigDecimal fitPorcentajeSalinidadAnterior;
    @Column(name = "fit_diatomeas_anterior")
    private BigDecimal fitDiatomeasAnterior;
    @Column(name = "fit_clorophytas_anterior")
    private BigDecimal fitClorophytasAnterior;
    @Column(name = "fit_cyanofitas_anterior")
    private BigDecimal fitCyanofitasAnterior;
    @Column(name = "fit_euglenales_anterior")
    private BigDecimal fitEuglenalesAnterior;
    @Column(name = "fit_dinoflagelados_anterior")
    private BigDecimal fitDinoflageladosAnterior;
    @Column(name = "fit_porcentaje_salinidad_actual")
    private BigDecimal fitPorcentajeSalinidadActual;
    @Column(name = "fit_diatomeas_actual")
    private BigDecimal fitDiatomeasActual;
    @Column(name = "fit_clorophytas_actual")
    private BigDecimal fitClorophytasActual;
    @Column(name = "fit_cyanofitas_actual")
    private BigDecimal fitCyanofitasActual;
    @Column(name = "fit_euglenales_actual")
    private BigDecimal fitEuglenalesActual;
    @Column(name = "fit_dinoflagelados_actual")
    private BigDecimal fitDinoflageladosActual;

    public PrdFitoplanctonTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public BigDecimal getFitPorcentajeSalinidadAnterior() {
        return fitPorcentajeSalinidadAnterior;
    }

    public void setFitPorcentajeSalinidadAnterior(BigDecimal fitPorcentajeSalinidadAnterior) {
        this.fitPorcentajeSalinidadAnterior = fitPorcentajeSalinidadAnterior;
    }

    public BigDecimal getFitDiatomeasAnterior() {
        return fitDiatomeasAnterior;
    }

    public void setFitDiatomeasAnterior(BigDecimal fitDiatomeasAnterior) {
        this.fitDiatomeasAnterior = fitDiatomeasAnterior;
    }

    public BigDecimal getFitClorophytasAnterior() {
        return fitClorophytasAnterior;
    }

    public void setFitClorophytasAnterior(BigDecimal fitClorophytasAnterior) {
        this.fitClorophytasAnterior = fitClorophytasAnterior;
    }

    public BigDecimal getFitCyanofitasAnterior() {
        return fitCyanofitasAnterior;
    }

    public void setFitCyanofitasAnterior(BigDecimal fitCyanofitasAnterior) {
        this.fitCyanofitasAnterior = fitCyanofitasAnterior;
    }

    public BigDecimal getFitEuglenalesAnterior() {
        return fitEuglenalesAnterior;
    }

    public void setFitEuglenalesAnterior(BigDecimal fitEuglenalesAnterior) {
        this.fitEuglenalesAnterior = fitEuglenalesAnterior;
    }

    public BigDecimal getFitDinoflageladosAnterior() {
        return fitDinoflageladosAnterior;
    }

    public void setFitDinoflageladosAnterior(BigDecimal fitDinoflageladosAnterior) {
        this.fitDinoflageladosAnterior = fitDinoflageladosAnterior;
    }

    public BigDecimal getFitPorcentajeSalinidadActual() {
        return fitPorcentajeSalinidadActual;
    }

    public void setFitPorcentajeSalinidadActual(BigDecimal fitPorcentajeSalinidadActual) {
        this.fitPorcentajeSalinidadActual = fitPorcentajeSalinidadActual;
    }

    public BigDecimal getFitDiatomeasActual() {
        return fitDiatomeasActual;
    }

    public void setFitDiatomeasActual(BigDecimal fitDiatomeasActual) {
        this.fitDiatomeasActual = fitDiatomeasActual;
    }

    public BigDecimal getFitClorophytasActual() {
        return fitClorophytasActual;
    }

    public void setFitClorophytasActual(BigDecimal fitClorophytasActual) {
        this.fitClorophytasActual = fitClorophytasActual;
    }

    public BigDecimal getFitCyanofitasActual() {
        return fitCyanofitasActual;
    }

    public void setFitCyanofitasActual(BigDecimal fitCyanofitasActual) {
        this.fitCyanofitasActual = fitCyanofitasActual;
    }

    public BigDecimal getFitEuglenalesActual() {
        return fitEuglenalesActual;
    }

    public void setFitEuglenalesActual(BigDecimal fitEuglenalesActual) {
        this.fitEuglenalesActual = fitEuglenalesActual;
    }

    public BigDecimal getFitDinoflageladosActual() {
        return fitDinoflageladosActual;
    }

    public void setFitDinoflageladosActual(BigDecimal fitDinoflageladosActual) {
        this.fitDinoflageladosActual = fitDinoflageladosActual;
    }

}
