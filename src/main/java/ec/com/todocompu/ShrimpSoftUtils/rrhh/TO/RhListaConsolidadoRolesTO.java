/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class RhListaConsolidadoRolesTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "crp_categoria")
    private String crpCategoria;

    @Column(name = "crp_id")
    private String crpId;

    @Column(name = "crp_nombres")
    private String crpNombres;

    @Column(name = "crp_dl")
    private BigDecimal crpDl;

    @Column(name = "crp_df")
    private BigDecimal crpDf;

    @Column(name = "crp_de")
    private BigDecimal crpDe;

    @Column(name = "crp_dd")
    private BigDecimal crpDd;

    @Column(name = "crp_dpm")
    private BigDecimal crpDpm;

    @Column(name = "crp_dvac")
    private BigDecimal crpDvac;

    @Column(name = "crp_dp")
    private BigDecimal crpDp;

    @Column(name = "crp_sueldo")
    private BigDecimal crpSueldo;

    @Column(name = "crp_horas_extras")
    private BigDecimal crpHorasExtras;

    @Column(name = "crp_horas_extras_100")
    private BigDecimal crpHorasExtras100;

    @Column(name = "crp_horas_extras_extraordinarias_100")
    private BigDecimal crpHorasExtrasExtraordinarias100;

    @Column(name = "crp_saldo_horas_extras_50")
    private BigDecimal crpSaldoHorasExtras50;

    @Column(name = "crp_saldo_horas_extras_100")
    private BigDecimal crpSaldoHorasExtras100;

    @Column(name = "crp_saldo_horas_extras_extraordinarias_100")
    private BigDecimal crpSaldoHorasExtrasExtraordinarias100;

    @Column(name = "crp_bonos")
    private BigDecimal crpBonos;

    @Column(name = "crp_bonosnd")
    private BigDecimal crpBonosnd;

    @Column(name = "crp_bono_fijo")
    private BigDecimal crpBonoFijo;

    @Column(name = "crp_bono_fijo_nd")
    private BigDecimal crpBonoFijoNd;

    @Column(name = "crp_otros_ingresos")
    private BigDecimal crpOtrosIngresos;

    @Column(name = "crp_otros_ingresos_nd")
    private BigDecimal crpOtrosIngresosNd;

    @Column(name = "crp_subtotal_bonos")
    private BigDecimal crpSubtotalBonos;

    @Column(name = "crp_subtotal_ingresos")
    private BigDecimal crpSubtotalIngresos;

    @Column(name = "crp_fondo_reserva")
    private BigDecimal crpFondoReserva;

    @Column(name = "crp_liquidacion")
    private BigDecimal crpLiquidacion;

    @Column(name = "crp_ingresos")
    private BigDecimal crpIngresos;

    @Column(name = "crp_anticipos")
    private BigDecimal crpAnticipos;

    @Column(name = "crp_prestamos")
    private BigDecimal crpPrestamos;

    @Column(name = "crp_iess")
    private BigDecimal crpIess;

    @Column(name = "crp_iess_extension")
    private BigDecimal crpIessExtension;

    @Column(name = "crp_prestamo_quirografario")
    private BigDecimal crpPrestamoQuirografario;

    @Column(name = "crp_prestamo_hipotecario")
    private BigDecimal crpPrestamoHipotecario;

    @Column(name = "crp_retencion")
    private BigDecimal crpRetencion;

    //crp_permiso_medico
    @Column(name = "crp_permiso_medico")
    private BigDecimal crpPermisoMedico;
    
    @Column(name = "crp_vacaciones")
    private BigDecimal crpVacaciones;

    @Column(name = "crp_descuento_fondo_reserva")
    private BigDecimal crpDescuentosFondoReserva;

    @Column(name = "crp_descuentos")
    private BigDecimal crpDescuentos;

    @Column(name = "crp_total")
    private BigDecimal crpTotal;

    public RhListaConsolidadoRolesTO() {
    }

    public BigDecimal getCrpPermisoMedico() {
        return crpPermisoMedico;
    }

    public void setCrpPermisoMedico(BigDecimal crpPermisoMedico) {
        this.crpPermisoMedico = crpPermisoMedico;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getCrpAnticipos() {
        return crpAnticipos;
    }

    public void setCrpAnticipos(BigDecimal crpAnticipos) {
        this.crpAnticipos = crpAnticipos;
    }

    public BigDecimal getCrpBonoFijo() {
        return crpBonoFijo;
    }

    public void setCrpBonoFijo(BigDecimal crpBonoFijo) {
        this.crpBonoFijo = crpBonoFijo;
    }

    public BigDecimal getCrpBonoFijoNd() {
        return crpBonoFijoNd;
    }

    public void setCrpBonoFijoNd(BigDecimal crpBonoFijoNd) {
        this.crpBonoFijoNd = crpBonoFijoNd;
    }

    public BigDecimal getCrpBonos() {
        return crpBonos;
    }

    public void setCrpBonos(BigDecimal crpBonos) {
        this.crpBonos = crpBonos;
    }

    public BigDecimal getCrpBonosnd() {
        return crpBonosnd;
    }

    public void setCrpBonosnd(BigDecimal crpBonosnd) {
        this.crpBonosnd = crpBonosnd;
    }

    public String getCrpCategoria() {
        return crpCategoria;
    }

    public void setCrpCategoria(String crpCategoria) {
        this.crpCategoria = crpCategoria;
    }

    public BigDecimal getCrpDd() {
        return crpDd;
    }

    public void setCrpDd(BigDecimal crpDd) {
        this.crpDd = crpDd;
    }

    public BigDecimal getCrpDe() {
        return crpDe;
    }

    public void setCrpDe(BigDecimal crpDe) {
        this.crpDe = crpDe;
    }

    public BigDecimal getCrpDescuentos() {
        return crpDescuentos;
    }

    public void setCrpDescuentos(BigDecimal crpDescuentos) {
        this.crpDescuentos = crpDescuentos;
    }

    public BigDecimal getCrpDescuentosFondoReserva() {
        return crpDescuentosFondoReserva;
    }

    public void setCrpDescuentosFondoReserva(BigDecimal crpDescuentosFondoReserva) {
        this.crpDescuentosFondoReserva = crpDescuentosFondoReserva;
    }

    public BigDecimal getCrpDf() {
        return crpDf;
    }

    public void setCrpDf(BigDecimal crpDf) {
        this.crpDf = crpDf;
    }

    public BigDecimal getCrpDl() {
        return crpDl;
    }

    public void setCrpDl(BigDecimal crpDl) {
        this.crpDl = crpDl;
    }

    public BigDecimal getCrpDp() {
        return crpDp;
    }

    public void setCrpDp(BigDecimal crpDp) {
        this.crpDp = crpDp;
    }

    public BigDecimal getCrpFondoReserva() {
        return crpFondoReserva;
    }

    public void setCrpFondoReserva(BigDecimal crpFondoReserva) {
        this.crpFondoReserva = crpFondoReserva;
    }

    public String getCrpId() {
        return crpId;
    }

    public void setCrpId(String crpId) {
        this.crpId = crpId;
    }

    public BigDecimal getCrpIess() {
        return crpIess;
    }

    public void setCrpIess(BigDecimal crpIess) {
        this.crpIess = crpIess;
    }

    public BigDecimal getCrpIngresos() {
        return crpIngresos;
    }

    public void setCrpIngresos(BigDecimal crpIngresos) {
        this.crpIngresos = crpIngresos;
    }

    public BigDecimal getCrpLiquidacion() {
        return crpLiquidacion;
    }

    public void setCrpLiquidacion(BigDecimal crpLiquidacion) {
        this.crpLiquidacion = crpLiquidacion;
    }

    public String getCrpNombres() {
        return crpNombres;
    }

    public void setCrpNombres(String crpNombres) {
        this.crpNombres = crpNombres;
    }

    public BigDecimal getCrpOtrosIngresos() {
        return crpOtrosIngresos;
    }

    public void setCrpOtrosIngresos(BigDecimal crpOtrosIngresos) {
        this.crpOtrosIngresos = crpOtrosIngresos;
    }

    public BigDecimal getCrpOtrosIngresosNd() {
        return crpOtrosIngresosNd;
    }

    public void setCrpOtrosIngresosNd(BigDecimal crpOtrosIngresosNd) {
        this.crpOtrosIngresosNd = crpOtrosIngresosNd;
    }

    public BigDecimal getCrpPrestamos() {
        return crpPrestamos;
    }

    public void setCrpPrestamos(BigDecimal crpPrestamos) {
        this.crpPrestamos = crpPrestamos;
    }

    public BigDecimal getCrpRetencion() {
        return crpRetencion;
    }

    public void setCrpRetencion(BigDecimal crpRetencion) {
        this.crpRetencion = crpRetencion;
    }

    public BigDecimal getCrpSubtotalBonos() {
        return crpSubtotalBonos;
    }

    public void setCrpSubtotalBonos(BigDecimal crpSubtotalBonos) {
        this.crpSubtotalBonos = crpSubtotalBonos;
    }

    public BigDecimal getCrpSubtotalIngresos() {
        return crpSubtotalIngresos;
    }

    public void setCrpSubtotalIngresos(BigDecimal crpSubtotalIngresos) {
        this.crpSubtotalIngresos = crpSubtotalIngresos;
    }

    public BigDecimal getCrpSueldo() {
        return crpSueldo;
    }

    public void setCrpSueldo(BigDecimal crpSueldo) {
        this.crpSueldo = crpSueldo;
    }

    public BigDecimal getCrpTotal() {
        return crpTotal;
    }

    public void setCrpTotal(BigDecimal crpTotal) {
        this.crpTotal = crpTotal;
    }

    public BigDecimal getCrpHorasExtras() {
        return crpHorasExtras;
    }

    public void setCrpHorasExtras(BigDecimal crpHorasExtras) {
        this.crpHorasExtras = crpHorasExtras;
    }

    public BigDecimal getCrpHorasExtras100() {
        return crpHorasExtras100;
    }

    public void setCrpHorasExtras100(BigDecimal crpHorasExtras100) {
        this.crpHorasExtras100 = crpHorasExtras100;
    }

    public BigDecimal getCrpIessExtension() {
        return crpIessExtension;
    }

    public void setCrpIessExtension(BigDecimal crpIessExtension) {
        this.crpIessExtension = crpIessExtension;
    }

    public BigDecimal getCrpPrestamoQuirografario() {
        return crpPrestamoQuirografario;
    }

    public void setCrpPrestamoQuirografario(BigDecimal crpPrestamoQuirografario) {
        this.crpPrestamoQuirografario = crpPrestamoQuirografario;
    }

    public BigDecimal getCrpPrestamoHipotecario() {
        return crpPrestamoHipotecario;
    }

    public void setCrpPrestamoHipotecario(BigDecimal crpPrestamoHipotecario) {
        this.crpPrestamoHipotecario = crpPrestamoHipotecario;
    }

    public BigDecimal getCrpHorasExtrasExtraordinarias100() {
        return crpHorasExtrasExtraordinarias100;
    }

    public void setCrpHorasExtrasExtraordinarias100(BigDecimal crpHorasExtrasExtraordinarias100) {
        this.crpHorasExtrasExtraordinarias100 = crpHorasExtrasExtraordinarias100;
    }

    public BigDecimal getCrpSaldoHorasExtras50() {
        return crpSaldoHorasExtras50;
    }

    public void setCrpSaldoHorasExtras50(BigDecimal crpSaldoHorasExtras50) {
        this.crpSaldoHorasExtras50 = crpSaldoHorasExtras50;
    }

    public BigDecimal getCrpSaldoHorasExtras100() {
        return crpSaldoHorasExtras100;
    }

    public void setCrpSaldoHorasExtras100(BigDecimal crpSaldoHorasExtras100) {
        this.crpSaldoHorasExtras100 = crpSaldoHorasExtras100;
    }

    public BigDecimal getCrpSaldoHorasExtrasExtraordinarias100() {
        return crpSaldoHorasExtrasExtraordinarias100;
    }

    public void setCrpSaldoHorasExtrasExtraordinarias100(BigDecimal crpSaldoHorasExtrasExtraordinarias100) {
        this.crpSaldoHorasExtrasExtraordinarias100 = crpSaldoHorasExtrasExtraordinarias100;
    }

    public BigDecimal getCrpDpm() {
        return crpDpm;
    }

    public void setCrpDpm(BigDecimal crpDpm) {
        this.crpDpm = crpDpm;
    }

    public BigDecimal getCrpDvac() {
        return crpDvac;
    }

    public void setCrpDvac(BigDecimal crpDvac) {
        this.crpDvac = crpDvac;
    }

    public BigDecimal getCrpVacaciones() {
        return crpVacaciones;
    }

    public void setCrpVacaciones(BigDecimal crpVacaciones) {
        this.crpVacaciones = crpVacaciones;
    }

}
