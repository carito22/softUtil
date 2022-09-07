/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class RhCategoriaTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Column(name = "cat_empresa")
    private String empCodigo;
    @Id
    @Column(name = "cat_nombre")
    private String catNombre;
    // CUENTAS DE SUELDOS

    @Column(name = "cta_anticipos")
    private String ctaAnticipos;

    @Column(name = "cta_prestamos")
    private String ctaPrestamos;

    @Column(name = "cta_por_pagar_bonos")
    private String ctaPorPagarBonos;

    @Column(name = "cta_por_pagar_sueldo")
    private String ctaPorPagarSueldo;

    @Column(name = "cta_por_pagar_impuesto_renta")
    private String ctaPorPagarImpuestoRenta;

    @Column(name = "cta_por_pagar_utilidades")
    private String ctaPorPagarUtilidades;

    @Column(name = "cta_gasto_horas_extras")
    private String ctaGastoHorasExtras;

    @Column(name = "cta_gasto_horas_extras_100")
    private String ctaGastoHorasExtras100;

    @Column(name = "cta_gasto_horas_extras_extraordinarias_100")
    private String ctaGastoHorasExtrasExtraordinarias100;

    @Column(name = "cta_saldo_horas_extras_50")
    private String ctaSaldoHorasExtras50;

    @Column(name = "cta_saldo_horas_extras_100")
    private String ctaSaldoHorasExtras100;

    @Column(name = "cta_saldo_horas_extras_extraordinarias_100")
    private String ctaSaldoHorasExtrasExtraordinarias100;

    @Column(name = "cta_gasto_bonos")
    private String ctaGastoBonos;

    @Column(name = "cta_gasto_bonos_nd")
    private String ctaGastoBonosNd;

    @Column(name = "cta_gasto_bono_fijo")
    private String ctaGastoBonoFijo;

    @Column(name = "cta_gasto_bono_fijo_nd")
    private String ctaGastoBonoFijoNd;

    @Column(name = "cta_gasto_otros_ingresos")
    private String ctaGastoOtrosIngresos;

    @Column(name = "cta_gasto_otros_ingresos_nd")
    private String ctaGastoOtrosIngresosNd;

    @Column(name = "cta_permiso_medico")
    private String ctaPermisoMedico;

    @Column(name = "cta_gasto_sueldos")
    private String ctaGastoSueldos;

    @Column(name = "cta_prestamo_quirografario")
    private String ctaPrestamoQuirografario;

    @Column(name = "cta_prestamo_hipotecario")
    private String ctaPrestamoHipotecario;

    @Column(name = "cta_aportepersonal")
    private String ctaAportepersonal;

    @Column(name = "cta_aporte_extension")
    private String ctaAporteExtension;
    // CUENTAS PROVISIONES POR PAGAR
    @Column(name = "cta_aportepatronal")
    private String ctaAportepatronal;

    @Column(name = "cta_iece")
    private String ctaIece;

    @Column(name = "cta_secap")
    private String ctaSecap;

    @Column(name = "cta_xiii")
    private String ctaXiii;

    @Column(name = "cta_xiv")
    private String ctaXiv;

    @Column(name = "cta_fondoreserva")
    private String ctaFondoreserva;

    @Column(name = "cta_vacaciones")
    private String ctaVacaciones;

    @Column(name = "cta_desahucio")
    private String ctaDesahucio;
    // CUENTAS GASTO PROVISIONES
    @Column(name = "cta_gasto_aporteindividual")
    private String ctaGastoAporteindividual;

    @Column(name = "cta_gasto_aportepatronal")
    private String ctaGastoAportepatronal;

    @Column(name = "cta_gasto_iece")
    private String ctaGastoIece;

    @Column(name = "cta_gasto_secap")
    private String ctaGastoSecap;

    @Column(name = "cta_gasto_xiii")
    private String ctaGastoXiii;

    @Column(name = "cta_gasto_xiv")
    private String ctaGastoXiv;

    @Column(name = "cta_gasto_fondoreserva")
    private String ctaGastoFondoreserva;

    @Column(name = "cta_gasto_vacaciones")
    private String ctaGastoVacaciones;

    @Column(name = "cta_gasto_salario_digno")
    private String ctaGastoSalarioDigno;

    @Column(name = "cta_gasto_desahucio")
    private String ctaGastoDesahucio;

    @Column(name = "cta_gasto_desahucio_intempestivo")
    private String ctaGastoDesahucioIntempestivo;

    @Column(name = "cta_gasto_liquidacion_bono") // cta_gasto_bono_liquidacion
    private String ctaGastoBonoLiquidacion;//////////////////////////////////////////////////////////////

    @Column(name = "cta_descuento_vacaciones")
    private String ctaDescuentoVacaciones;

    @Column(name = "cta_recargo_jornada_nocturna")
    private String ctaRecargoJornadaNocturna;

    @Column(name = "tip_codigo")
    private String tipCodigo;

    @Column(name = "usr_codigo") // usr_inserta_categoria
    private String usrInsertaCategoria;

    @Column(name = "usr_fecha_inserta") // usr_fecha_inserta_categoria
    private String usrFechaInsertaCategoria;

    public RhCategoriaTO() {
    }

    public String getCatNombre() {
        return catNombre;
    }

    public void setCatNombre(String catNombre) {
        this.catNombre = catNombre;
    }

    public String getCtaAnticipos() {
        return ctaAnticipos;
    }

    public void setCtaAnticipos(String ctaAnticipos) {
        this.ctaAnticipos = ctaAnticipos;
    }

    public String getCtaAportepatronal() {
        return ctaAportepatronal;
    }

    public void setCtaAportepatronal(String ctaAportepatronal) {
        this.ctaAportepatronal = ctaAportepatronal;
    }

    public String getCtaAportepersonal() {
        return ctaAportepersonal;
    }

    public void setCtaAportepersonal(String ctaAportepersonal) {
        this.ctaAportepersonal = ctaAportepersonal;
    }

    public String getCtaAporteExtension() {
        return ctaAporteExtension;
    }

    public void setCtaAporteExtension(String ctaAporteExtension) {
        this.ctaAporteExtension = ctaAporteExtension;
    }

    public String getCtaDesahucio() {
        return ctaDesahucio;
    }

    public void setCtaDesahucio(String ctaDesahucio) {
        this.ctaDesahucio = ctaDesahucio;
    }

    public String getCtaFondoreserva() {
        return ctaFondoreserva;
    }

    public void setCtaFondoreserva(String ctaFondoreserva) {
        this.ctaFondoreserva = ctaFondoreserva;
    }

    public String getCtaGastoAporteindividual() {
        return ctaGastoAporteindividual;
    }

    public void setCtaGastoAporteindividual(String ctaGastoAporteindividual) {
        this.ctaGastoAporteindividual = ctaGastoAporteindividual;
    }

    public String getCtaGastoAportepatronal() {
        return ctaGastoAportepatronal;
    }

    public void setCtaGastoAportepatronal(String ctaGastoAportepatronal) {
        this.ctaGastoAportepatronal = ctaGastoAportepatronal;
    }

    public String getCtaGastoBonoFijo() {
        return ctaGastoBonoFijo;
    }

    public void setCtaGastoBonoFijo(String ctaGastoBonoFijo) {
        this.ctaGastoBonoFijo = ctaGastoBonoFijo;
    }

    public String getCtaGastoBonoFijoNd() {
        return ctaGastoBonoFijoNd;
    }

    public void setCtaGastoBonoFijoNd(String ctaGastoBonoFijoNd) {
        this.ctaGastoBonoFijoNd = ctaGastoBonoFijoNd;
    }

    public String getCtaGastoBonoLiquidacion() {
        return ctaGastoBonoLiquidacion;
    }

    public void setCtaGastoBonoLiquidacion(String ctaGastoBonoLiquidacion) {
        this.ctaGastoBonoLiquidacion = ctaGastoBonoLiquidacion;
    }

    public String getCtaGastoHorasExtras() {
        return ctaGastoHorasExtras;
    }

    public void setCtaGastoHorasExtras(String ctaGastoHorasExtras) {
        this.ctaGastoHorasExtras = ctaGastoHorasExtras;
    }

    public String getCtaGastoHorasExtras100() {
        return ctaGastoHorasExtras100;
    }

    public void setCtaGastoHorasExtras100(String ctaGastoHorasExtras100) {
        this.ctaGastoHorasExtras100 = ctaGastoHorasExtras100;
    }

    public String getCtaGastoBonos() {
        return ctaGastoBonos;
    }

    public void setCtaGastoBonos(String ctaGastoBonos) {
        this.ctaGastoBonos = ctaGastoBonos;
    }

    public String getCtaGastoBonosNd() {
        return ctaGastoBonosNd;
    }

    public void setCtaGastoBonosNd(String ctaGastoBonosNd) {
        this.ctaGastoBonosNd = ctaGastoBonosNd;
    }

    public String getCtaGastoDesahucio() {
        return ctaGastoDesahucio;
    }

    public void setCtaGastoDesahucio(String ctaGastoDesahucio) {
        this.ctaGastoDesahucio = ctaGastoDesahucio;
    }

    public String getCtaGastoDesahucioIntempestivo() {
        return ctaGastoDesahucioIntempestivo;
    }

    public void setCtaGastoDesahucioIntempestivo(String ctaGastoDesahucioIntempestivo) {
        this.ctaGastoDesahucioIntempestivo = ctaGastoDesahucioIntempestivo;
    }

    public String getCtaGastoFondoreserva() {
        return ctaGastoFondoreserva;
    }

    public void setCtaGastoFondoreserva(String ctaGastoFondoreserva) {
        this.ctaGastoFondoreserva = ctaGastoFondoreserva;
    }

    public String getCtaGastoIece() {
        return ctaGastoIece;
    }

    public void setCtaGastoIece(String ctaGastoIece) {
        this.ctaGastoIece = ctaGastoIece;
    }

    public String getCtaGastoOtrosIngresos() {
        return ctaGastoOtrosIngresos;
    }

    public void setCtaGastoOtrosIngresos(String ctaGastoOtrosIngresos) {
        this.ctaGastoOtrosIngresos = ctaGastoOtrosIngresos;
    }

    public String getCtaGastoOtrosIngresosNd() {
        return ctaGastoOtrosIngresosNd;
    }

    public void setCtaGastoOtrosIngresosNd(String ctaGastoOtrosIngresosNd) {
        this.ctaGastoOtrosIngresosNd = ctaGastoOtrosIngresosNd;
    }

    public String getCtaGastoSalarioDigno() {
        return ctaGastoSalarioDigno;
    }

    public void setCtaGastoSalarioDigno(String ctaGastoSalarioDigno) {
        this.ctaGastoSalarioDigno = ctaGastoSalarioDigno;
    }

    public String getCtaGastoSecap() {
        return ctaGastoSecap;
    }

    public void setCtaGastoSecap(String ctaGastoSecap) {
        this.ctaGastoSecap = ctaGastoSecap;
    }

    public String getCtaPermisoMedico() {
        return ctaPermisoMedico;
    }

    public void setCtaPermisoMedico(String ctaPermisoMedico) {
        this.ctaPermisoMedico = ctaPermisoMedico;
    }

    public String getCtaPrestamoQuirografario() {
        return ctaPrestamoQuirografario;
    }

    public void setCtaPrestamoQuirografario(String ctaPrestamoQuirografario) {
        this.ctaPrestamoQuirografario = ctaPrestamoQuirografario;
    }

    public String getCtaPrestamoHipotecario() {
        return ctaPrestamoHipotecario;
    }

    public void setCtaPrestamoHipotecario(String ctaPrestamoHipotecario) {
        this.ctaPrestamoHipotecario = ctaPrestamoHipotecario;
    }

    public String getCtaGastoSueldos() {
        return ctaGastoSueldos;
    }

    public void setCtaGastoSueldos(String ctaGastoSueldos) {
        this.ctaGastoSueldos = ctaGastoSueldos;
    }

    public String getCtaGastoVacaciones() {
        return ctaGastoVacaciones;
    }

    public void setCtaGastoVacaciones(String ctaGastoVacaciones) {
        this.ctaGastoVacaciones = ctaGastoVacaciones;
    }

    public String getCtaGastoXiii() {
        return ctaGastoXiii;
    }

    public void setCtaGastoXiii(String ctaGastoXiii) {
        this.ctaGastoXiii = ctaGastoXiii;
    }

    public String getCtaGastoXiv() {
        return ctaGastoXiv;
    }

    public void setCtaGastoXiv(String ctaGastoXiv) {
        this.ctaGastoXiv = ctaGastoXiv;
    }

    public String getCtaIece() {
        return ctaIece;
    }

    public void setCtaIece(String ctaIece) {
        this.ctaIece = ctaIece;
    }

    public String getCtaPorPagarBonos() {
        return ctaPorPagarBonos;
    }

    public void setCtaPorPagarBonos(String ctaPorPagarBonos) {
        this.ctaPorPagarBonos = ctaPorPagarBonos;
    }

    public String getCtaPorPagarImpuestoRenta() {
        return ctaPorPagarImpuestoRenta;
    }

    public void setCtaPorPagarImpuestoRenta(String ctaPorPagarImpuestoRenta) {
        this.ctaPorPagarImpuestoRenta = ctaPorPagarImpuestoRenta;
    }

    public String getCtaPorPagarSueldo() {
        return ctaPorPagarSueldo;
    }

    public void setCtaPorPagarSueldo(String ctaPorPagarSueldo) {
        this.ctaPorPagarSueldo = ctaPorPagarSueldo;
    }

    public String getCtaPorPagarUtilidades() {
        return ctaPorPagarUtilidades;
    }

    public void setCtaPorPagarUtilidades(String ctaPorPagarUtilidades) {
        this.ctaPorPagarUtilidades = ctaPorPagarUtilidades;
    }

    public String getCtaPrestamos() {
        return ctaPrestamos;
    }

    public void setCtaPrestamos(String ctaPrestamos) {
        this.ctaPrestamos = ctaPrestamos;
    }

    public String getCtaSecap() {
        return ctaSecap;
    }

    public void setCtaSecap(String ctaSecap) {
        this.ctaSecap = ctaSecap;
    }

    public String getCtaVacaciones() {
        return ctaVacaciones;
    }

    public void setCtaVacaciones(String ctaVacaciones) {
        this.ctaVacaciones = ctaVacaciones;
    }

    public String getCtaXiii() {
        return ctaXiii;
    }

    public void setCtaXiii(String ctaXiii) {
        this.ctaXiii = ctaXiii;
    }

    public String getCtaXiv() {
        return ctaXiv;
    }

    public void setCtaXiv(String ctaXiv) {
        this.ctaXiv = ctaXiv;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getTipCodigo() {
        return tipCodigo;
    }

    public void setTipCodigo(String tipCodigo) {
        this.tipCodigo = tipCodigo;
    }

    public String getUsrFechaInsertaCategoria() {
        return usrFechaInsertaCategoria;
    }

    public void setUsrFechaInsertaCategoria(String usrFechaInsertaCategoria) {
        this.usrFechaInsertaCategoria = usrFechaInsertaCategoria;
    }

    public String getUsrInsertaCategoria() {
        return usrInsertaCategoria;
    }

    public void setUsrInsertaCategoria(String usrInsertaCategoria) {
        this.usrInsertaCategoria = usrInsertaCategoria;
    }

    public String getCtaSaldoHorasExtras50() {
        return ctaSaldoHorasExtras50;
    }

    public void setCtaSaldoHorasExtras50(String ctaSaldoHorasExtras50) {
        this.ctaSaldoHorasExtras50 = ctaSaldoHorasExtras50;
    }

    public String getCtaSaldoHorasExtras100() {
        return ctaSaldoHorasExtras100;
    }

    public void setCtaSaldoHorasExtras100(String ctaSaldoHorasExtras100) {
        this.ctaSaldoHorasExtras100 = ctaSaldoHorasExtras100;
    }

    public String getCtaGastoHorasExtrasExtraordinarias100() {
        return ctaGastoHorasExtrasExtraordinarias100;
    }

    public void setCtaGastoHorasExtrasExtraordinarias100(String ctaGastoHorasExtrasExtraordinarias100) {
        this.ctaGastoHorasExtrasExtraordinarias100 = ctaGastoHorasExtrasExtraordinarias100;
    }

    public String getCtaSaldoHorasExtrasExtraordinarias100() {
        return ctaSaldoHorasExtrasExtraordinarias100;
    }

    public void setCtaSaldoHorasExtrasExtraordinarias100(String ctaSaldoHorasExtrasExtraordinarias100) {
        this.ctaSaldoHorasExtrasExtraordinarias100 = ctaSaldoHorasExtrasExtraordinarias100;
    }

    public String getCtaDescuentoVacaciones() {
        return ctaDescuentoVacaciones;
    }

    public void setCtaDescuentoVacaciones(String ctaDescuentoVacaciones) {
        this.ctaDescuentoVacaciones = ctaDescuentoVacaciones;
    }

    public String getCtaRecargoJornadaNocturna() {
        return ctaRecargoJornadaNocturna;
    }

    public void setCtaRecargoJornadaNocturna(String ctaRecargoJornadaNocturna) {
        this.ctaRecargoJornadaNocturna = ctaRecargoJornadaNocturna;
    }

}
