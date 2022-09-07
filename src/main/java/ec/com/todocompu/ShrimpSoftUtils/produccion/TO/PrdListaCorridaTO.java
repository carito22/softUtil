package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdListaCorridaTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cor_numero")
    private String corNumero;

    @Column(name = "cor_fecha_desde")
    private String corFechaDesde;

    @Column(name = "cor_hectareas")
    private BigDecimal corHectareas;

    @Column(name = "cor_numero_larvas")
    private Integer corNumeroLarvas;

    @Column(name = "cor_laboratorio")
    private String corLaboratorio;

    @Column(name = "cor_nauplio")
    private String corNauplio;

    @Column(name = "cor_pellet")
    private BigDecimal corPellet;

    @Column(name = "cor_fecha_siembra")
    private String corFechaSiembra;
    @Column(name = "cor_fecha_siembra_madre")
    private String corFechaSiembraMadre;
    @Column(name = "cor_tipo_siembra")
    private String corTipoSiembra;

    @Column(name = "cor_biomasa")
    private BigDecimal corBiomasa;

    @Column(name = "cor_valor_venta")
    private BigDecimal corValorVenta;

    @Column(name = "cor_observaciones")
    private String corObservaciones;

    @Column(name = "cor_fecha_pesca")
    private String corFechaPesca;

    @Column(name = "cor_fecha_hasta")
    private String corFechaHasta;

    @Column(name = "cor_activa")
    private Boolean corActiva;

    @Column(name = "cor_numero_larvas_plus")
    private BigDecimal corNumeroLarvasPlus;

    @Column(name = "cv_empresa")
    private String cvEmpresa;
    @Column(name = "cv_periodo")
    private String cvPeriodo;
    @Column(name = "cv_tipo")
    private String cvTipo;
    @Column(name = "cv_numero")
    private String cvNumero;

    public PrdListaCorridaTO() {

    }

    public PrdListaCorridaTO(String corNumero, String corFechaDesde, BigDecimal corHectareas, Integer corNumeroLarvas,
            String corLaboratorio, String corNauplio, BigDecimal corPellet, String corFechaSiembra, BigDecimal corBiomasa,
            BigDecimal corValorVenta, String corObservaciones, String corFechaPesca, String corFechaHasta,
            Boolean corActiva) {
        this.corNumero = corNumero;
        this.corFechaDesde = corFechaDesde;
        this.corHectareas = corHectareas;
        this.corNumeroLarvas = corNumeroLarvas;
        this.corLaboratorio = corLaboratorio;
        this.corNauplio = corNauplio;
        this.corPellet = corPellet;
        this.corFechaSiembra = corFechaSiembra;
        this.corBiomasa = corBiomasa;
        this.corValorVenta = corValorVenta;
        this.corObservaciones = corObservaciones;
        this.corFechaPesca = corFechaPesca;
        this.corFechaHasta = corFechaHasta;
        this.corActiva = corActiva;
    }

    public PrdListaCorridaTO(String corNumero, String corFechaDesde, BigDecimal corHectareas, Integer corNumeroLarvas,
            String corLaboratorio, String corNauplio, BigDecimal corPellet, String corFechaSiembra, String corTipoSiembra,
            BigDecimal corBiomasa, BigDecimal corValorVenta, String corObservaciones, String corFechaPesca,
            String corFechaHasta, Boolean corActiva) {
        this.corNumero = corNumero;
        this.corFechaDesde = corFechaDesde;
        this.corHectareas = corHectareas;
        this.corNumeroLarvas = corNumeroLarvas;
        this.corLaboratorio = corLaboratorio;
        this.corNauplio = corNauplio;
        this.corPellet = corPellet;
        this.corFechaSiembra = corFechaSiembra;
        this.corTipoSiembra = corTipoSiembra;
        this.corBiomasa = corBiomasa;
        this.corValorVenta = corValorVenta;
        this.corObservaciones = corObservaciones;
        this.corFechaPesca = corFechaPesca;
        this.corFechaHasta = corFechaHasta;
        this.corActiva = corActiva;
    }

    public String getCorTipoSiembra() {
        return corTipoSiembra;
    }

    public void setCorTipoSiembra(String corTipoSiembra) {
        this.corTipoSiembra = corTipoSiembra;
    }

    public Boolean getCorActiva() {
        return corActiva;
    }

    public void setCorActiva(Boolean corActiva) {
        this.corActiva = corActiva;
    }

    public BigDecimal getCorBiomasa() {
        return corBiomasa;
    }

    public void setCorBiomasa(BigDecimal corBiomasa) {
        this.corBiomasa = corBiomasa;
    }

    public String getCorFechaDesde() {
        return corFechaDesde;
    }

    public void setCorFechaDesde(String corFechaDesde) {
        this.corFechaDesde = corFechaDesde;
    }

    public String getCorFechaHasta() {
        return corFechaHasta;
    }

    public void setCorFechaHasta(String corFechaHasta) {
        this.corFechaHasta = corFechaHasta;
    }

    public String getCorFechaPesca() {
        return corFechaPesca;
    }

    public void setCorFechaPesca(String corFechaPesca) {
        this.corFechaPesca = corFechaPesca;
    }

    public String getCorFechaSiembra() {
        return corFechaSiembra;
    }

    public void setCorFechaSiembra(String corFechaSiembra) {
        this.corFechaSiembra = corFechaSiembra;
    }

    public String getCorFechaSiembraMadre() {
        return corFechaSiembraMadre;
    }

    public void setCorFechaSiembraMadre(String corFechaSiembraMadre) {
        this.corFechaSiembraMadre = corFechaSiembraMadre;
    }

    public BigDecimal getCorHectareas() {
        return corHectareas;
    }

    public void setCorHectareas(BigDecimal corHectareas) {
        this.corHectareas = corHectareas;
    }

    public String getCorLaboratorio() {
        return corLaboratorio;
    }

    public void setCorLaboratorio(String corLaboratorio) {
        this.corLaboratorio = corLaboratorio;
    }

    public String getCorNauplio() {
        return corNauplio;
    }

    public void setCorNauplio(String corNauplio) {
        this.corNauplio = corNauplio;
    }

    public String getCorNumero() {
        return corNumero;
    }

    public void setCorNumero(String corNumero) {
        this.corNumero = corNumero;
    }

    public Integer getCorNumeroLarvas() {
        return corNumeroLarvas;
    }

    public void setCorNumeroLarvas(Integer corNumeroLarvas) {
        this.corNumeroLarvas = corNumeroLarvas;
    }

    public String getCorObservaciones() {
        return corObservaciones;
    }

    public void setCorObservaciones(String corObservaciones) {
        this.corObservaciones = corObservaciones;
    }

    public BigDecimal getCorPellet() {
        return corPellet;
    }

    public void setCorPellet(BigDecimal corPellet) {
        this.corPellet = corPellet;
    }

    public BigDecimal getCorValorVenta() {
        return corValorVenta;
    }

    public void setCorValorVenta(BigDecimal corValorVenta) {
        this.corValorVenta = corValorVenta;
    }

    public BigDecimal getCorNumeroLarvasPlus() {
        return corNumeroLarvasPlus;
    }

    public void setCorNumeroLarvasPlus(BigDecimal corNumeroLarvasPlus) {
        this.corNumeroLarvasPlus = corNumeroLarvasPlus;
    }

    public String getCvEmpresa() {
        return cvEmpresa;
    }

    public void setCvEmpresa(String cvEmpresa) {
        this.cvEmpresa = cvEmpresa;
    }

    public String getCvPeriodo() {
        return cvPeriodo;
    }

    public void setCvPeriodo(String cvPeriodo) {
        this.cvPeriodo = cvPeriodo;
    }

    public String getCvTipo() {
        return cvTipo;
    }

    public void setCvTipo(String cvTipo) {
        this.cvTipo = cvTipo;
    }

    public String getCvNumero() {
        return cvNumero;
    }

    public void setCvNumero(String cvNumero) {
        this.cvNumero = cvNumero;
    }

}
