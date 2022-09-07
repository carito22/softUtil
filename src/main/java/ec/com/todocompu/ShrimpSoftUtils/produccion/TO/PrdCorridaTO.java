/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdCorridaTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cor_empresa")
    private String corEmpresa;

    @Column(name = "cor_sector")
    private String corSector;

    @Column(name = "cor_piscina")
    private String corPiscina;

    @Column(name = "cor_numero")
    private String corNumero;

    @Column(name = "cor_hectareas")
    private BigDecimal corHectareas;

    @Column(name = "cor_fecha_desde")
    private String corFechaDesde;

    @Column(name = "cor_fecha_siembra")
    private String corFechaSiembra;

    @Column(name = "cor_tipo_siembra")
    private String corTipoSiembra;

    @Column(name = "cor_fecha_pesca")
    private String corFechaPesca;

    @Column(name = "cor_fecha_hasta")
    private String corFechaHasta;

    @Column(name = "cor_numero_larvas")
    private Integer corNumeroLarvas;

    @Column(name = "cor_laboratorio")
    private String corLaboratorio;

    @Column(name = "cor_nauplio")
    private String corNauplio;

    @Column(name = "cor_pellet")
    private BigDecimal corPellet;

    @Column(name = "cor_biomasa")
    private BigDecimal corBiomasa;

    @Column(name = "cor_valor_venta")
    private BigDecimal corValorVenta;

    @Column(name = "cor_observaciones")
    private String corObservaciones;

    @Column(name = "cor_activa")
    private Boolean corActiva;

    @Column(name = "pis_empresa")
    private String pisEmpresa;

    @Column(name = "pis_sector")
    private String pisSector;

    @Column(name = "pis_numero")
    private String pisNumero;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInsertaCorrida;

    @Column(name = "cv_empresa")
    private String cvEmpresa;
    @Column(name = "cv_periodo")
    private String cvPeriodo;
    @Column(name = "cv_tipo")
    private String cvTipo;
    @Column(name = "cv_numero")
    private String cvNumero;

    public PrdCorridaTO() {
    }

    public PrdCorridaTO(String corEmpresa, String corSector, String corPiscina, String corNumero,
            BigDecimal corHectareas, String corFechaDesde, String corFechaSiembra, String corFechaPesca,
            String corFechaHasta, Integer corNumeroLarvas, String corLaboratorio, String corNauplio, BigDecimal corPellet,
            BigDecimal corBiomasa, BigDecimal corValorVenta, String corObservaciones, Boolean corActiva,
            String pisEmpresa, String pisSector, String pisNumero, String usrEmpresa, String usrCodigo,
            String usrFechaInsertaCorrida) {
        this.corEmpresa = corEmpresa;
        this.corSector = corSector;
        this.corPiscina = corPiscina;
        this.corNumero = corNumero;
        this.corHectareas = corHectareas;
        this.corFechaDesde = corFechaDesde;
        this.corFechaSiembra = corFechaSiembra;
        this.corFechaPesca = corFechaPesca;
        this.corFechaHasta = corFechaHasta;
        this.corNumeroLarvas = corNumeroLarvas;
        this.corLaboratorio = corLaboratorio;
        this.corNauplio = corNauplio;
        this.corPellet = corPellet;
        this.corBiomasa = corBiomasa;
        this.corValorVenta = corValorVenta;
        this.corObservaciones = corObservaciones;
        this.corActiva = corActiva;
        this.pisEmpresa = pisEmpresa;
        this.pisSector = pisSector;
        this.pisNumero = pisNumero;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInsertaCorrida = usrFechaInsertaCorrida;
    }

    public PrdCorridaTO(String corEmpresa, String corSector, String corPiscina, String corNumero,
            BigDecimal corHectareas, String corFechaDesde, String corFechaSiembra, String corTipoSiembra,
            String corFechaPesca, String corFechaHasta, Integer corNumeroLarvas, String corLaboratorio,
            String corNauplio, BigDecimal corPellet, BigDecimal corBiomasa, BigDecimal corValorVenta,
            String corObservaciones, Boolean corActiva, String pisEmpresa, String pisSector, String pisNumero,
            String usrEmpresa, String usrCodigo, String usrFechaInsertaCorrida) {
        this.corEmpresa = corEmpresa;
        this.corSector = corSector;
        this.corPiscina = corPiscina;
        this.corNumero = corNumero;
        this.corHectareas = corHectareas;
        this.corFechaDesde = corFechaDesde;
        this.corFechaSiembra = corFechaSiembra;
        this.corTipoSiembra = corTipoSiembra;
        this.corFechaPesca = corFechaPesca;
        this.corFechaHasta = corFechaHasta;
        this.corNumeroLarvas = corNumeroLarvas;
        this.corLaboratorio = corLaboratorio;
        this.corNauplio = corNauplio;
        this.corPellet = corPellet;
        this.corBiomasa = corBiomasa;
        this.corValorVenta = corValorVenta;
        this.corObservaciones = corObservaciones;
        this.corActiva = corActiva;
        this.pisEmpresa = pisEmpresa;
        this.pisSector = pisSector;
        this.pisNumero = pisNumero;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInsertaCorrida = usrFechaInsertaCorrida;
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

    public String getCorEmpresa() {
        return corEmpresa;
    }

    public void setCorEmpresa(String corEmpresa) {
        this.corEmpresa = corEmpresa;
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

    public String getCorPiscina() {
        return corPiscina;
    }

    public void setCorPiscina(String corPiscina) {
        this.corPiscina = corPiscina;
    }

    public String getCorSector() {
        return corSector;
    }

    public void setCorSector(String corSector) {
        this.corSector = corSector;
    }

    public BigDecimal getCorValorVenta() {
        return corValorVenta;
    }

    public void setCorValorVenta(BigDecimal corValorVenta) {
        this.corValorVenta = corValorVenta;
    }

    public String getPisEmpresa() {
        return pisEmpresa;
    }

    public void setPisEmpresa(String pisEmpresa) {
        this.pisEmpresa = pisEmpresa;
    }

    public String getPisNumero() {
        return pisNumero;
    }

    public void setPisNumero(String pisNumero) {
        this.pisNumero = pisNumero;
    }

    public String getPisSector() {
        return pisSector;
    }

    public void setPisSector(String pisSector) {
        this.pisSector = pisSector;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrFechaInsertaCorrida() {
        return usrFechaInsertaCorrida;
    }

    public void setUsrFechaInsertaCorrida(String usrFechaInsertaCorrida) {
        this.usrFechaInsertaCorrida = usrFechaInsertaCorrida;
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
