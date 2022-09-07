/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhEmpleado;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
public class RhRolEmpTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "rol_secuencial")
    private Integer rolSecuencial;
    @Column(name = "rol_desde")
    private Date rolDesde;
    @Column(name = "rol_hasta")
    private Date rolHasta;
    @Column(name = "rol_fecha_ultimo_sueldo")
    private Date rolFechaUltimoSueldo;
    @Column(name = "rol_dias_laborados_reales")
    private short rolDiasLaboradosReales;
    @Column(name = "rol_dias_faltas_reales")
    private short rolDiasFaltasReales;
    @Column(name = "rol_dias_extras_reales")
    private short rolDiasExtrasReales;
    @Column(name = "rol_dias_descanso_reales")
    private short rolDiasDescansoReales;
    @Column(name = "rol_dias_pagados_reales")
    private short rolDiasPagadosReales;
    @Column(name = "rol_dias_permiso_medico")
    private short rolDiasPermisoMedico;
    @Column(name = "rol_dias_vacaciones")
    private Integer rolDiasVacaciones;
    @Column(name = "rol_saldo_anterior")
    private BigDecimal rolSaldoAnterior;
    @Column(name = "rol_ingresos")
    private BigDecimal rolIngresos;
    @Column(name = "rol_horas_extras")
    private BigDecimal rolHorasExtras;
    @Column(name = "rol_horas_extras_100")
    private BigDecimal rolHorasExtras100;
    @Column(name = "rol_horas_extras_extraordinarias_100")
    private BigDecimal rolHorasExtrasExtraordinarias100;
    @Column(name = "rol_saldo_horas_extras_50")
    private BigDecimal rolSaldoHorasExtras50;
    @Column(name = "rol_saldo_horas_extras_100")
    private BigDecimal rolSaldoHorasExtras100;
    @Column(name = "rol_saldo_horas_extras_extraordinarias_100")
    private BigDecimal rolSaldoHorasExtrasExtraordinarias100;
    @Column(name = "rol_bonos")
    private BigDecimal rolBonos;
    @Column(name = "rol_bonosnd")
    private BigDecimal rolBonosnd;
    @Column(name = "rol_bono_fijo")
    private BigDecimal rolBonoFijo;
    @Column(name = "rol_bono_fijo_nd")
    private BigDecimal rolBonoFijoNd;
    @Column(name = "rol_otros_ingresos")
    private BigDecimal rolOtrosIngresos;
    @Column(name = "rol_otros_ingresos_nd")
    private BigDecimal rolOtrosIngresosNd;
    @Column(name = "rol_liq_fondo_reserva")
    private BigDecimal rolLiqFondoReserva;
    @Column(name = "rol_liq_xiii")
    private BigDecimal rolLiqXiii;
    @Column(name = "rol_liq_xiv")
    private BigDecimal rolLiqXiv;
    @Column(name = "rol_liq_vacaciones")
    private BigDecimal rolLiqVacaciones;
    @Column(name = "rol_liq_salario_digno")
    private BigDecimal rolLiqSalarioDigno;
    @Column(name = "rol_liq_desahucio")
    private BigDecimal rolLiqDesahucio;
    @Column(name = "rol_liq_desahucio_intempestivo")
    private BigDecimal rolLiqDesahucioIntempestivo;
    @Column(name = "rol_liq_bonificacion")
    private BigDecimal rolLiqBonificacion;
    @Column(name = "rol_anticipos")
    private BigDecimal rolAnticipos;
    @Column(name = "rol_prestamos")
    private BigDecimal rolPrestamos;
    @Column(name = "rol_prestamo_quirografario")
    private BigDecimal rolPrestamoQuirografario;
    @Column(name = "rol_prestamo_hipotecario")
    private BigDecimal rolPrestamoHipotecario;
    @Column(name = "rol_iess")
    private BigDecimal rolIess;
    @Column(name = "rol_iess_extension")
    private BigDecimal rolIessExtension;
    @Column(name = "rol_retencion_fuente")
    private BigDecimal rolRetencionFuente;
    @Column(name = "rol_descuento_permiso_medico")
    private BigDecimal rolDescuentoPermisoMedico;
    @Column(name = "rol_descuento_vacaciones")
    private BigDecimal rolDescuentoVacaciones;
    @Column(name = "rol_total")
    private BigDecimal rolTotal;
    @Column(name = "rol_forma_pago")
    private String rolFormaPago;
    @Column(name = "rol_documento")
    private String rolDocumento;
    @Column(name = "rol_observaciones")
    private String rolObservaciones;
    @Column(name = "rol_aporte_patronal")
    private BigDecimal rolAportePatronal;
    @Column(name = "rol_iece")
    private BigDecimal rolIece;
    @Column(name = "rol_secap")
    private BigDecimal rolSecap;
    @Column(name = "rol_xiii")
    private BigDecimal rolXiii;
    @Column(name = "rol_xiv")
    private BigDecimal rolXiv;
    @Column(name = "rol_fondo_reserva")
    private BigDecimal rolFondoReserva;
    @Column(name = "rol_vacaciones")
    private BigDecimal rolVacaciones;
    @Column(name = "rol_desahucio")
    private BigDecimal rolDesahucio;
    @Column(name = "rol_auxiliar")
    private boolean rolAuxiliar;
    @Column(name = "emp_cargo")
    private String empCargo;
    @Column(name = "cat_empresa")
    private String catEmpresa;
    @Column(name = "cat_nombre")
    private String catNombre;
    @Column(name = "emp_sueldo")
    private BigDecimal empSueldo;
    @Column(name = "emp_bono_fijo")
    private BigDecimal empBonoFijo;
    @Column(name = "emp_bono_fijo_nd")
    private BigDecimal empBonoFijoNd;
    @Column(name = "emp_otros_ingresos")
    private BigDecimal empOtrosIngresos;
    @Column(name = "emp_otros_ingresos_nd")
    private BigDecimal empOtrosIngresosNd;
    @Column(name = "emp_dias_laborados")
    private short empDiasLaborados;
    @Column(name = "emp_dias_descanso")
    private short empDiasDescanso;
    @Column(name = "emp_cancelar_xiii_sueldo_mensualmente")
    private boolean empCancelarXiiiSueldoMensualmente;
    @Column(name = "emp_cancelar_xiv_sueldo_mensualmente")
    private boolean empCancelarXivSueldoMensualmente;
    @Column(name = "emp_cancelar_fondo_reserva_mensualmente")
    private boolean empCancelarFondoReservaMensualmente;
    @Column(name = "emp_salario_neto")
    private boolean empSalarioNeto;

    @Column(name = "sec_empresa")
    private String secEmpresa;
    @Column(name = "sec_codigo")
    private String secCodigo;

    @Column(name = "cta_empresa")
    private String ctaEmpresa;
    @Column(name = "cta_codigo")
    private String ctaCodigo;

    @Column(name = "con_empresa")
    private String conEmpresa;
    @Column(name = "con_periodo")
    private String conPeriodo;
    @Column(name = "con_tipo")
    private String conTipo;
    @Column(name = "con_numero")
    private String conNumero;

    @Column(name = "con_provision_empresa")
    private String conProvisionEmpresa;
    @Column(name = "con_provision_periodo")
    private String conProvisionPeriodo;
    @Column(name = "con_provision_tipo")
    private String conProvisionTipo;
    @Column(name = "con_provision_numero")
    private String conProvisionNumero;

    @JoinColumns({
        @JoinColumn(name = "emp_empresa", referencedColumnName = "emp_empresa")
        , @JoinColumn(name = "emp_id", referencedColumnName = "emp_id")})
    @ManyToOne(optional = false)
    private RhEmpleado rhEmpleado;

    @Column(name = "emp_actualizar")
    private boolean empActualizar;
    @Column(name = "rol_impuesto_renta_modificado")
    private boolean rolImpuestoRentaModificado;
    @Column(name = "rol_relacion_trabajo")
    private String rolRelacionTrabajo;

    public RhRolEmpTO() {
    }

    public Integer getRolSecuencial() {
        return rolSecuencial;
    }

    public void setRolSecuencial(Integer rolSecuencial) {
        this.rolSecuencial = rolSecuencial;
    }

    public Date getRolDesde() {
        return rolDesde;
    }

    public void setRolDesde(Date rolDesde) {
        this.rolDesde = rolDesde;
    }

    public Date getRolHasta() {
        return rolHasta;
    }

    public void setRolHasta(Date rolHasta) {
        this.rolHasta = rolHasta;
    }

    public Date getRolFechaUltimoSueldo() {
        return rolFechaUltimoSueldo;
    }

    public void setRolFechaUltimoSueldo(Date rolFechaUltimoSueldo) {
        this.rolFechaUltimoSueldo = rolFechaUltimoSueldo;
    }

    public short getRolDiasLaboradosReales() {
        return rolDiasLaboradosReales;
    }

    public void setRolDiasLaboradosReales(short rolDiasLaboradosReales) {
        this.rolDiasLaboradosReales = rolDiasLaboradosReales;
    }

    public short getRolDiasFaltasReales() {
        return rolDiasFaltasReales;
    }

    public void setRolDiasFaltasReales(short rolDiasFaltasReales) {
        this.rolDiasFaltasReales = rolDiasFaltasReales;
    }

    public short getRolDiasExtrasReales() {
        return rolDiasExtrasReales;
    }

    public void setRolDiasExtrasReales(short rolDiasExtrasReales) {
        this.rolDiasExtrasReales = rolDiasExtrasReales;
    }

    public short getRolDiasDescansoReales() {
        return rolDiasDescansoReales;
    }

    public void setRolDiasDescansoReales(short rolDiasDescansoReales) {
        this.rolDiasDescansoReales = rolDiasDescansoReales;
    }

    public short getRolDiasPagadosReales() {
        return rolDiasPagadosReales;
    }

    public void setRolDiasPagadosReales(short rolDiasPagadosReales) {
        this.rolDiasPagadosReales = rolDiasPagadosReales;
    }

    public short getRolDiasPermisoMedico() {
        return rolDiasPermisoMedico;
    }

    public void setRolDiasPermisoMedico(short rolDiasPermisoMedico) {
        this.rolDiasPermisoMedico = rolDiasPermisoMedico;
    }

    public Integer getRolDiasVacaciones() {
        return rolDiasVacaciones;
    }

    public void setRolDiasVacaciones(Integer rolDiasVacaciones) {
        this.rolDiasVacaciones = rolDiasVacaciones;
    }

    public BigDecimal getRolSaldoAnterior() {
        return rolSaldoAnterior;
    }

    public void setRolSaldoAnterior(BigDecimal rolSaldoAnterior) {
        this.rolSaldoAnterior = rolSaldoAnterior;
    }

    public BigDecimal getRolIngresos() {
        return rolIngresos;
    }

    public void setRolIngresos(BigDecimal rolIngresos) {
        this.rolIngresos = rolIngresos;
    }

    public BigDecimal getRolHorasExtras() {
        return rolHorasExtras;
    }

    public void setRolHorasExtras(BigDecimal rolHorasExtras) {
        this.rolHorasExtras = rolHorasExtras;
    }

    public BigDecimal getRolHorasExtras100() {
        return rolHorasExtras100;
    }

    public void setRolHorasExtras100(BigDecimal rolHorasExtras100) {
        this.rolHorasExtras100 = rolHorasExtras100;
    }

    public BigDecimal getRolHorasExtrasExtraordinarias100() {
        return rolHorasExtrasExtraordinarias100;
    }

    public void setRolHorasExtrasExtraordinarias100(BigDecimal rolHorasExtrasExtraordinarias100) {
        this.rolHorasExtrasExtraordinarias100 = rolHorasExtrasExtraordinarias100;
    }

    public BigDecimal getRolSaldoHorasExtras50() {
        return rolSaldoHorasExtras50;
    }

    public void setRolSaldoHorasExtras50(BigDecimal rolSaldoHorasExtras50) {
        this.rolSaldoHorasExtras50 = rolSaldoHorasExtras50;
    }

    public BigDecimal getRolSaldoHorasExtras100() {
        return rolSaldoHorasExtras100;
    }

    public void setRolSaldoHorasExtras100(BigDecimal rolSaldoHorasExtras100) {
        this.rolSaldoHorasExtras100 = rolSaldoHorasExtras100;
    }

    public BigDecimal getRolSaldoHorasExtrasExtraordinarias100() {
        return rolSaldoHorasExtrasExtraordinarias100;
    }

    public void setRolSaldoHorasExtrasExtraordinarias100(BigDecimal rolSaldoHorasExtrasExtraordinarias100) {
        this.rolSaldoHorasExtrasExtraordinarias100 = rolSaldoHorasExtrasExtraordinarias100;
    }

    public BigDecimal getRolBonos() {
        return rolBonos;
    }

    public void setRolBonos(BigDecimal rolBonos) {
        this.rolBonos = rolBonos;
    }

    public BigDecimal getRolBonosnd() {
        return rolBonosnd;
    }

    public void setRolBonosnd(BigDecimal rolBonosnd) {
        this.rolBonosnd = rolBonosnd;
    }

    public BigDecimal getRolBonoFijo() {
        return rolBonoFijo;
    }

    public void setRolBonoFijo(BigDecimal rolBonoFijo) {
        this.rolBonoFijo = rolBonoFijo;
    }

    public BigDecimal getRolBonoFijoNd() {
        return rolBonoFijoNd;
    }

    public void setRolBonoFijoNd(BigDecimal rolBonoFijoNd) {
        this.rolBonoFijoNd = rolBonoFijoNd;
    }

    public BigDecimal getRolOtrosIngresos() {
        return rolOtrosIngresos;
    }

    public void setRolOtrosIngresos(BigDecimal rolOtrosIngresos) {
        this.rolOtrosIngresos = rolOtrosIngresos;
    }

    public BigDecimal getRolOtrosIngresosNd() {
        return rolOtrosIngresosNd;
    }

    public void setRolOtrosIngresosNd(BigDecimal rolOtrosIngresosNd) {
        this.rolOtrosIngresosNd = rolOtrosIngresosNd;
    }

    public BigDecimal getRolLiqFondoReserva() {
        return rolLiqFondoReserva;
    }

    public void setRolLiqFondoReserva(BigDecimal rolLiqFondoReserva) {
        this.rolLiqFondoReserva = rolLiqFondoReserva;
    }

    public BigDecimal getRolLiqXiii() {
        return rolLiqXiii;
    }

    public void setRolLiqXiii(BigDecimal rolLiqXiii) {
        this.rolLiqXiii = rolLiqXiii;
    }

    public BigDecimal getRolLiqXiv() {
        return rolLiqXiv;
    }

    public void setRolLiqXiv(BigDecimal rolLiqXiv) {
        this.rolLiqXiv = rolLiqXiv;
    }

    public BigDecimal getRolLiqVacaciones() {
        return rolLiqVacaciones;
    }

    public void setRolLiqVacaciones(BigDecimal rolLiqVacaciones) {
        this.rolLiqVacaciones = rolLiqVacaciones;
    }

    public BigDecimal getRolLiqSalarioDigno() {
        return rolLiqSalarioDigno;
    }

    public void setRolLiqSalarioDigno(BigDecimal rolLiqSalarioDigno) {
        this.rolLiqSalarioDigno = rolLiqSalarioDigno;
    }

    public BigDecimal getRolLiqDesahucio() {
        return rolLiqDesahucio;
    }

    public void setRolLiqDesahucio(BigDecimal rolLiqDesahucio) {
        this.rolLiqDesahucio = rolLiqDesahucio;
    }

    public BigDecimal getRolLiqDesahucioIntempestivo() {
        return rolLiqDesahucioIntempestivo;
    }

    public void setRolLiqDesahucioIntempestivo(BigDecimal rolLiqDesahucioIntempestivo) {
        this.rolLiqDesahucioIntempestivo = rolLiqDesahucioIntempestivo;
    }

    public BigDecimal getRolLiqBonificacion() {
        return rolLiqBonificacion;
    }

    public void setRolLiqBonificacion(BigDecimal rolLiqBonificacion) {
        this.rolLiqBonificacion = rolLiqBonificacion;
    }

    public BigDecimal getRolAnticipos() {
        return rolAnticipos;
    }

    public void setRolAnticipos(BigDecimal rolAnticipos) {
        this.rolAnticipos = rolAnticipos;
    }

    public BigDecimal getRolPrestamos() {
        return rolPrestamos;
    }

    public void setRolPrestamos(BigDecimal rolPrestamos) {
        this.rolPrestamos = rolPrestamos;
    }

    public BigDecimal getRolPrestamoQuirografario() {
        return rolPrestamoQuirografario;
    }

    public void setRolPrestamoQuirografario(BigDecimal rolPrestamoQuirografario) {
        this.rolPrestamoQuirografario = rolPrestamoQuirografario;
    }

    public BigDecimal getRolPrestamoHipotecario() {
        return rolPrestamoHipotecario;
    }

    public void setRolPrestamoHipotecario(BigDecimal rolPrestamoHipotecario) {
        this.rolPrestamoHipotecario = rolPrestamoHipotecario;
    }

    public BigDecimal getRolIess() {
        return rolIess;
    }

    public void setRolIess(BigDecimal rolIess) {
        this.rolIess = rolIess;
    }

    public BigDecimal getRolIessExtension() {
        return rolIessExtension;
    }

    public void setRolIessExtension(BigDecimal rolIessExtension) {
        this.rolIessExtension = rolIessExtension;
    }

    public BigDecimal getRolRetencionFuente() {
        return rolRetencionFuente;
    }

    public void setRolRetencionFuente(BigDecimal rolRetencionFuente) {
        this.rolRetencionFuente = rolRetencionFuente;
    }

    public BigDecimal getRolDescuentoPermisoMedico() {
        return rolDescuentoPermisoMedico;
    }

    public void setRolDescuentoPermisoMedico(BigDecimal rolDescuentoPermisoMedico) {
        this.rolDescuentoPermisoMedico = rolDescuentoPermisoMedico;
    }

    public BigDecimal getRolDescuentoVacaciones() {
        return rolDescuentoVacaciones;
    }

    public void setRolDescuentoVacaciones(BigDecimal rolDescuentoVacaciones) {
        this.rolDescuentoVacaciones = rolDescuentoVacaciones;
    }

    public BigDecimal getRolTotal() {
        return rolTotal;
    }

    public void setRolTotal(BigDecimal rolTotal) {
        this.rolTotal = rolTotal;
    }

    public String getRolFormaPago() {
        return rolFormaPago;
    }

    public void setRolFormaPago(String rolFormaPago) {
        this.rolFormaPago = rolFormaPago;
    }

    public String getRolDocumento() {
        return rolDocumento;
    }

    public void setRolDocumento(String rolDocumento) {
        this.rolDocumento = rolDocumento;
    }

    public String getRolObservaciones() {
        return rolObservaciones;
    }

    public void setRolObservaciones(String rolObservaciones) {
        this.rolObservaciones = rolObservaciones;
    }

    public BigDecimal getRolAportePatronal() {
        return rolAportePatronal;
    }

    public void setRolAportePatronal(BigDecimal rolAportePatronal) {
        this.rolAportePatronal = rolAportePatronal;
    }

    public BigDecimal getRolIece() {
        return rolIece;
    }

    public void setRolIece(BigDecimal rolIece) {
        this.rolIece = rolIece;
    }

    public BigDecimal getRolSecap() {
        return rolSecap;
    }

    public void setRolSecap(BigDecimal rolSecap) {
        this.rolSecap = rolSecap;
    }

    public BigDecimal getRolXiii() {
        return rolXiii;
    }

    public void setRolXiii(BigDecimal rolXiii) {
        this.rolXiii = rolXiii;
    }

    public BigDecimal getRolXiv() {
        return rolXiv;
    }

    public void setRolXiv(BigDecimal rolXiv) {
        this.rolXiv = rolXiv;
    }

    public BigDecimal getRolFondoReserva() {
        return rolFondoReserva;
    }

    public void setRolFondoReserva(BigDecimal rolFondoReserva) {
        this.rolFondoReserva = rolFondoReserva;
    }

    public BigDecimal getRolVacaciones() {
        return rolVacaciones;
    }

    public void setRolVacaciones(BigDecimal rolVacaciones) {
        this.rolVacaciones = rolVacaciones;
    }

    public BigDecimal getRolDesahucio() {
        return rolDesahucio;
    }

    public void setRolDesahucio(BigDecimal rolDesahucio) {
        this.rolDesahucio = rolDesahucio;
    }

    public boolean isRolAuxiliar() {
        return rolAuxiliar;
    }

    public void setRolAuxiliar(boolean rolAuxiliar) {
        this.rolAuxiliar = rolAuxiliar;
    }

    public String getEmpCargo() {
        return empCargo;
    }

    public void setEmpCargo(String empCargo) {
        this.empCargo = empCargo;
    }

    public String getCatEmpresa() {
        return catEmpresa;
    }

    public void setCatEmpresa(String catEmpresa) {
        this.catEmpresa = catEmpresa;
    }

    public String getCatNombre() {
        return catNombre;
    }

    public void setCatNombre(String catNombre) {
        this.catNombre = catNombre;
    }

    public BigDecimal getEmpSueldo() {
        return empSueldo;
    }

    public void setEmpSueldo(BigDecimal empSueldo) {
        this.empSueldo = empSueldo;
    }

    public BigDecimal getEmpBonoFijo() {
        return empBonoFijo;
    }

    public void setEmpBonoFijo(BigDecimal empBonoFijo) {
        this.empBonoFijo = empBonoFijo;
    }

    public BigDecimal getEmpBonoFijoNd() {
        return empBonoFijoNd;
    }

    public void setEmpBonoFijoNd(BigDecimal empBonoFijoNd) {
        this.empBonoFijoNd = empBonoFijoNd;
    }

    public BigDecimal getEmpOtrosIngresos() {
        return empOtrosIngresos;
    }

    public void setEmpOtrosIngresos(BigDecimal empOtrosIngresos) {
        this.empOtrosIngresos = empOtrosIngresos;
    }

    public BigDecimal getEmpOtrosIngresosNd() {
        return empOtrosIngresosNd;
    }

    public void setEmpOtrosIngresosNd(BigDecimal empOtrosIngresosNd) {
        this.empOtrosIngresosNd = empOtrosIngresosNd;
    }

    public short getEmpDiasLaborados() {
        return empDiasLaborados;
    }

    public void setEmpDiasLaborados(short empDiasLaborados) {
        this.empDiasLaborados = empDiasLaborados;
    }

    public short getEmpDiasDescanso() {
        return empDiasDescanso;
    }

    public void setEmpDiasDescanso(short empDiasDescanso) {
        this.empDiasDescanso = empDiasDescanso;
    }

    public boolean isEmpCancelarXiiiSueldoMensualmente() {
        return empCancelarXiiiSueldoMensualmente;
    }

    public void setEmpCancelarXiiiSueldoMensualmente(boolean empCancelarXiiiSueldoMensualmente) {
        this.empCancelarXiiiSueldoMensualmente = empCancelarXiiiSueldoMensualmente;
    }

    public boolean isEmpCancelarXivSueldoMensualmente() {
        return empCancelarXivSueldoMensualmente;
    }

    public void setEmpCancelarXivSueldoMensualmente(boolean empCancelarXivSueldoMensualmente) {
        this.empCancelarXivSueldoMensualmente = empCancelarXivSueldoMensualmente;
    }

    public boolean isEmpCancelarFondoReservaMensualmente() {
        return empCancelarFondoReservaMensualmente;
    }

    public void setEmpCancelarFondoReservaMensualmente(boolean empCancelarFondoReservaMensualmente) {
        this.empCancelarFondoReservaMensualmente = empCancelarFondoReservaMensualmente;
    }

    public boolean isEmpSalarioNeto() {
        return empSalarioNeto;
    }

    public void setEmpSalarioNeto(boolean empSalarioNeto) {
        this.empSalarioNeto = empSalarioNeto;
    }

    public String getSecEmpresa() {
        return secEmpresa;
    }

    public void setSecEmpresa(String secEmpresa) {
        this.secEmpresa = secEmpresa;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getCtaEmpresa() {
        return ctaEmpresa;
    }

    public void setCtaEmpresa(String ctaEmpresa) {
        this.ctaEmpresa = ctaEmpresa;
    }

    public String getCtaCodigo() {
        return ctaCodigo;
    }

    public void setCtaCodigo(String ctaCodigo) {
        this.ctaCodigo = ctaCodigo;
    }

    public String getConEmpresa() {
        return conEmpresa;
    }

    public void setConEmpresa(String conEmpresa) {
        this.conEmpresa = conEmpresa;
    }

    public String getConPeriodo() {
        return conPeriodo;
    }

    public void setConPeriodo(String conPeriodo) {
        this.conPeriodo = conPeriodo;
    }

    public String getConTipo() {
        return conTipo;
    }

    public void setConTipo(String conTipo) {
        this.conTipo = conTipo;
    }

    public String getConNumero() {
        return conNumero;
    }

    public void setConNumero(String conNumero) {
        this.conNumero = conNumero;
    }

    public String getConProvisionEmpresa() {
        return conProvisionEmpresa;
    }

    public void setConProvisionEmpresa(String conProvisionEmpresa) {
        this.conProvisionEmpresa = conProvisionEmpresa;
    }

    public String getConProvisionPeriodo() {
        return conProvisionPeriodo;
    }

    public void setConProvisionPeriodo(String conProvisionPeriodo) {
        this.conProvisionPeriodo = conProvisionPeriodo;
    }

    public String getConProvisionTipo() {
        return conProvisionTipo;
    }

    public void setConProvisionTipo(String conProvisionTipo) {
        this.conProvisionTipo = conProvisionTipo;
    }

    public String getConProvisionNumero() {
        return conProvisionNumero;
    }

    public void setConProvisionNumero(String conProvisionNumero) {
        this.conProvisionNumero = conProvisionNumero;
    }

    public RhEmpleado getRhEmpleado() {
        return rhEmpleado;
    }

    public void setRhEmpleado(RhEmpleado rhEmpleado) {
        this.rhEmpleado = rhEmpleado;
    }

    public boolean isEmpActualizar() {
        return empActualizar;
    }

    public void setEmpActualizar(boolean empActualizar) {
        this.empActualizar = empActualizar;
    }

    public boolean isRolImpuestoRentaModificado() {
        return rolImpuestoRentaModificado;
    }

    public void setRolImpuestoRentaModificado(boolean rolImpuestoRentaModificado) {
        this.rolImpuestoRentaModificado = rolImpuestoRentaModificado;
    }

    public String getRolRelacionTrabajo() {
        return rolRelacionTrabajo;
    }

    public void setRolRelacionTrabajo(String rolRelacionTrabajo) {
        this.rolRelacionTrabajo = rolRelacionTrabajo;
    }

}
