package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RhListaProvisionesTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "prov_categoria")
    private String provCategoria;
    @Column(name = "prov_id")
    private String provId;
    @Column(name = "prov_nombres")
    private String provNombres;
    @Column(name = "prov_sueldo")
    private BigDecimal provSueldo;
    @Column(name = "prov_dias_pagados")
    private BigDecimal provDiasPagados;
    @Column(name = "prov_aporte_individual")
    private BigDecimal provAporteIndividual;
    @Column(name = "prov_aporte_patronal")
    private BigDecimal provAportePatronal;
    @Column(name = "prov_iece")
    private BigDecimal provIece;
    @Column(name = "prov_secap")
    private BigDecimal provSecap;
    @Column(name = "prov_xiii")
    private BigDecimal provXiii;
    @Column(name = "prov_xiv")
    private BigDecimal provXiv;
    @Column(name = "prov_fondo_reserva")
    private BigDecimal provFondoReserva;
    @Column(name = "prov_vacaciones")
    private BigDecimal provVacaciones;
    @Column(name = "prov_desahucio")
    private BigDecimal provDesahucio;
    @Column(name = "prov_secuencial")
    private Integer provSecuencial;
    @Column(name = "prov_contable_rol")
    private String provContableRol;
    @Column(name = "prov_contable_provision")
    private String provContableProvision;

    public RhListaProvisionesTO() {
    }

    public RhListaProvisionesTO(String provCategoria, String provId, String provNombres, BigDecimal provSueldo,
            BigDecimal provDiasPagados, BigDecimal provAporteIndividual, BigDecimal provAportePatronal,
            BigDecimal provIece, BigDecimal provSecap, BigDecimal provXiii, BigDecimal provXiv,
            BigDecimal provFondoReserva, BigDecimal provVacaciones, BigDecimal provDesahucio, Integer provSecuencial,
			String provContableRol, String provContableProvision, Integer id) {
        this.provCategoria = provCategoria;
        this.provId = provId;
        this.provNombres = provNombres;
        this.provSueldo = provSueldo;
        this.provDiasPagados = provDiasPagados;
        this.provAporteIndividual = provAporteIndividual;
        this.provAportePatronal = provAportePatronal;
        this.provIece = provIece;
        this.provSecap = provSecap;
        this.provXiii = provXiii;
        this.provXiv = provXiv;
        this.provFondoReserva = provFondoReserva;
        this.provVacaciones = provVacaciones;
        this.provDesahucio = provDesahucio;
        this.provSecuencial = provSecuencial;
        this.provContableRol = provContableRol;
        this.provContableProvision = provContableProvision;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getProvAporteIndividual() {
        return provAporteIndividual;
    }

    public void setProvAporteIndividual(BigDecimal provAporteIndividual) {
        this.provAporteIndividual = provAporteIndividual;
    }

    public BigDecimal getProvAportePatronal() {
        return provAportePatronal;
    }

    public void setProvAportePatronal(BigDecimal provAportePatronal) {
        this.provAportePatronal = provAportePatronal;
    }

    public String getProvCategoria() {
        return provCategoria;
    }

    public void setProvCategoria(String provCategoria) {
        this.provCategoria = provCategoria;
    }

    public String getProvContableProvision() {
        return provContableProvision;
    }

    public void setProvContableProvision(String provContableProvision) {
        this.provContableProvision = provContableProvision;
    }

    public String getProvContableRol() {
        return provContableRol;
    }

    public void setProvContableRol(String provContableRol) {
        this.provContableRol = provContableRol;
    }

    public BigDecimal getProvDesahucio() {
        return provDesahucio;
    }

    public void setProvDesahucio(BigDecimal provDesahucio) {
        this.provDesahucio = provDesahucio;
    }

    public BigDecimal getProvDiasPagados() {
        return provDiasPagados;
    }

    public void setProvDiasPagados(BigDecimal provDiasPagados) {
        this.provDiasPagados = provDiasPagados;
    }

    public BigDecimal getProvFondoReserva() {
        return provFondoReserva;
    }

    public void setProvFondoReserva(BigDecimal provFondoReserva) {
        this.provFondoReserva = provFondoReserva;
    }

    public String getProvId() {
        return provId;
    }

    public void setProvId(String provId) {
        this.provId = provId;
    }

    public BigDecimal getProvIece() {
        return provIece;
    }

    public void setProvIece(BigDecimal provIece) {
        this.provIece = provIece;
    }

    public String getProvNombres() {
        return provNombres;
    }

    public void setProvNombres(String provNombres) {
        this.provNombres = provNombres;
    }

    public BigDecimal getProvSecap() {
        return provSecap;
    }

    public void setProvSecap(BigDecimal provSecap) {
        this.provSecap = provSecap;
    }

    public Integer getProvSecuencial() {
        return provSecuencial;
    }

    public void setProvSecuencial(Integer provSecuencial) {
        this.provSecuencial = provSecuencial;
    }

    public BigDecimal getProvSueldo() {
        return provSueldo;
    }

    public void setProvSueldo(BigDecimal provSueldo) {
        this.provSueldo = provSueldo;
    }

    public BigDecimal getProvVacaciones() {
        return provVacaciones;
    }

    public void setProvVacaciones(BigDecimal provVacaciones) {
        this.provVacaciones = provVacaciones;
    }

    public BigDecimal getProvXiii() {
        return provXiii;
    }

    public void setProvXiii(BigDecimal provXiii) {
        this.provXiii = provXiii;
    }

    public BigDecimal getProvXiv() {
        return provXiv;
    }

    public void setProvXiv(BigDecimal provXiv) {
        this.provXiv = provXiv;
    }
}
