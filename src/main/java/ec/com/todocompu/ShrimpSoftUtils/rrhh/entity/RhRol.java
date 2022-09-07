package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ec.com.todocompu.ShrimpSoftUtils.UtilsJSON;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConContable;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConCuentas;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdSector;

@Entity
@Table(name = "rh_rol", schema = "recursoshumanos")
public class RhRol implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer rolSecuencial;
    private Date rolDesde;
    private Date rolHasta;
    private Date rolFechaUltimoSueldo;
    private short rolDiasLaboradosReales;
    private short rolDiasFaltasReales;
    private short rolDiasExtrasReales;
    private short rolDiasDescansoReales;
    private short rolDiasPagadosReales;
    private short rolDiasPermisoMedico;
    private Integer rolDiasVacaciones;
    private BigDecimal rolSaldoAnterior;
    private BigDecimal rolIngresos;
    private BigDecimal rolHorasExtras;
    private BigDecimal rolHorasExtras100;
    private BigDecimal rolHorasExtrasExtraordinarias100;
    private BigDecimal rolSaldoHorasExtras50;
    private BigDecimal rolSaldoHorasExtras100;
    private BigDecimal rolSaldoHorasExtrasExtraordinarias100;
    private BigDecimal rolBonos;
    private BigDecimal rolBonosnd;
    private BigDecimal rolBonoFijo;
    private BigDecimal rolBonoFijoNd;
    private BigDecimal rolOtrosIngresos;
    private BigDecimal rolOtrosIngresosNd;
    private BigDecimal rolLiqFondoReserva;
    private BigDecimal rolLiqXiii;
    private BigDecimal rolLiqXiv;
    private BigDecimal rolLiqVacaciones;
    private BigDecimal rolLiqSalarioDigno;
    private BigDecimal rolLiqDesahucio;
    private BigDecimal rolLiqDesahucioIntempestivo;
    private BigDecimal rolLiqBonificacion;
    private BigDecimal rolAnticipos;
    private BigDecimal rolPrestamos;
    private BigDecimal rolPrestamoQuirografario;
    private BigDecimal rolPrestamoHipotecario;
    private BigDecimal rolIess;
    private BigDecimal rolIessExtension;
    private BigDecimal rolRetencionFuente;
    private BigDecimal rolDescuentoPermisoMedico;
    private BigDecimal rolDescuentoVacaciones;
    private BigDecimal rolTotal;
    private String rolFormaPago;
    private String rolDocumento;
    private String rolObservaciones;
    private BigDecimal rolAportePatronal;
    private BigDecimal rolIece;
    private BigDecimal rolSecap;
    private BigDecimal rolXiii;
    private BigDecimal rolXiv;
    private BigDecimal rolFondoReserva;
    private BigDecimal rolVacaciones;
    private BigDecimal rolDesahucio;
    private boolean rolAuxiliar;
    private String empCargo;
    private String catEmpresa;
    private String catNombre;
    private BigDecimal empSueldo;
    private BigDecimal empBonoFijo;
    private BigDecimal empBonoFijoNd;
    private BigDecimal empOtrosIngresos;
    private BigDecimal empOtrosIngresosNd;
    private BigDecimal rolIngresoVacaciones;
    private short empDiasLaborados;
    private short empDiasDescanso;
    private boolean empCancelarXiiiSueldoMensualmente;
    private boolean empCancelarXivSueldoMensualmente;
    private boolean empCancelarFondoReservaMensualmente;
    private boolean empSalarioNeto;
    private PrdSector prdSector;
    private ConCuentas conCuentas;
    private ConContable conContable;
    private ConContable conContableProvision;
    private RhEmpleado rhEmpleado;
    private boolean empActualizar;
    private boolean rolImpuestoRentaModificado;
    private String rolRelacionTrabajo;
    private BigDecimal rolRecargoJornadaNocturna;
    private Date rolPeriodoVacDesde;
    private Date rolPeriodoVacHasta;

    public RhRol() {
        BigDecimal cero = new BigDecimal("0.00");
        this.rolLiqFondoReserva = cero;
        this.rolLiqXiii = cero;
        this.rolLiqXiv = cero;
        this.rolLiqVacaciones = cero;
        this.rolLiqSalarioDigno = cero;
        this.rolLiqDesahucio = cero;
        this.rolLiqDesahucioIntempestivo = cero;
        this.rolLiqBonificacion = cero;
        this.rolHorasExtras = cero;
        this.rolPrestamos = cero;
    }

    public RhRol(Integer rolSecuencial) {
        this.rolSecuencial = rolSecuencial;
        BigDecimal cero = new BigDecimal("0.00");
        this.rolLiqFondoReserva = cero;
        this.rolLiqXiii = cero;
        this.rolLiqXiv = cero;
        this.rolLiqVacaciones = cero;
        this.rolLiqSalarioDigno = cero;
        this.rolLiqDesahucio = cero;
        this.rolLiqDesahucioIntempestivo = cero;
        this.rolLiqBonificacion = cero;
        this.rolHorasExtras = cero;
        this.rolPrestamos = cero;
    }

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "rol_secuencial")
    public Integer getRolSecuencial() {
        return rolSecuencial;
    }

    public void setRolSecuencial(Integer rolSecuencial) {
        this.rolSecuencial = rolSecuencial;
    }

    @Column(name = "emp_actualizar", insertable = false, updatable = false)
    public boolean isEmpActualizar() {
        return empActualizar;
    }

    public void setEmpActualizar(boolean empActualizar) {
        this.empActualizar = empActualizar;
    }

    @Column(name = "rol_desde")
    public Date getRolDesde() {
        return rolDesde;
    }

    public void setRolDesde(Date rolDesde) {
        this.rolDesde = rolDesde;
    }

    @Column(name = "rol_hasta")
    public Date getRolHasta() {
        return rolHasta;
    }

    public void setRolHasta(Date rolHasta) {
        this.rolHasta = rolHasta;
    }

    @Column(name = "rol_fecha_ultimo_sueldo")
    public Date getRolFechaUltimoSueldo() {
        return rolFechaUltimoSueldo;
    }

    public void setRolFechaUltimoSueldo(Date rolFechaUltimoSueldo) {
        this.rolFechaUltimoSueldo = rolFechaUltimoSueldo;
    }

    @Column(name = "rol_dias_laborados_reales")
    public short getRolDiasLaboradosReales() {
        return rolDiasLaboradosReales;
    }

    public void setRolDiasLaboradosReales(short rolDiasLaboradosReales) {
        this.rolDiasLaboradosReales = rolDiasLaboradosReales;
    }

    @Column(name = "rol_dias_faltas_reales")
    public short getRolDiasFaltasReales() {
        return rolDiasFaltasReales;
    }

    public void setRolDiasFaltasReales(short rolDiasFaltasReales) {
        this.rolDiasFaltasReales = rolDiasFaltasReales;
    }

    @Column(name = "rol_dias_extras_reales")
    public short getRolDiasExtrasReales() {
        return rolDiasExtrasReales;
    }

    public void setRolDiasExtrasReales(short rolDiasExtrasReales) {
        this.rolDiasExtrasReales = rolDiasExtrasReales;
    }

    @Column(name = "rol_dias_descanso_reales")
    public short getRolDiasDescansoReales() {
        return rolDiasDescansoReales;
    }

    public void setRolDiasDescansoReales(short rolDiasDescansoReales) {
        this.rolDiasDescansoReales = rolDiasDescansoReales;
    }

    @Column(name = "rol_dias_pagados_reales")
    public short getRolDiasPagadosReales() {
        return rolDiasPagadosReales;
    }

    public void setRolDiasPagadosReales(short rolDiasPagadosReales) {
        this.rolDiasPagadosReales = rolDiasPagadosReales;
    }

    @Column(name = "rol_dias_permiso_medico")
    public short getRolDiasPermisoMedico() {
        return rolDiasPermisoMedico;
    }

    public void setRolDiasPermisoMedico(short rolDiasPermisoMedico) {
        this.rolDiasPermisoMedico = rolDiasPermisoMedico;
    }

    @Column(name = "rol_saldo_anterior")
    public BigDecimal getRolSaldoAnterior() {
        return rolSaldoAnterior;
    }

    public void setRolSaldoAnterior(BigDecimal rolSaldoAnterior) {
        this.rolSaldoAnterior = rolSaldoAnterior;
    }

    @Column(name = "rol_ingresos")
    public BigDecimal getRolIngresos() {
        return rolIngresos;
    }

    public void setRolIngresos(BigDecimal rolIngresos) {
        this.rolIngresos = rolIngresos;
    }

    @Column(name = "rol_horas_extras")
    public BigDecimal getRolHorasExtras() {
        return rolHorasExtras;
    }

    public void setRolHorasExtras(BigDecimal rolHorasExtras) {
        this.rolHorasExtras = rolHorasExtras;
    }

    @Column(name = "rol_horas_extras_100")
    public BigDecimal getRolHorasExtras100() {
        return rolHorasExtras100;
    }

    public void setRolHorasExtras100(BigDecimal rolHorasExtras100) {
        this.rolHorasExtras100 = rolHorasExtras100;
    }

    @Column(name = "rol_saldo_horas_extras_50")
    public BigDecimal getRolSaldoHorasExtras50() {
        return rolSaldoHorasExtras50;
    }

    public void setRolSaldoHorasExtras50(BigDecimal rolSaldoHorasExtras50) {
        this.rolSaldoHorasExtras50 = rolSaldoHorasExtras50;
    }

    @Column(name = "rol_saldo_horas_extras_100")
    public BigDecimal getRolSaldoHorasExtras100() {
        return rolSaldoHorasExtras100;
    }

    public void setRolSaldoHorasExtras100(BigDecimal rolSaldoHorasExtras100) {
        this.rolSaldoHorasExtras100 = rolSaldoHorasExtras100;
    }

    @Column(name = "rol_horas_extras_extraordinarias_100")
    public BigDecimal getRolHorasExtrasExtraordinarias100() {
        return rolHorasExtrasExtraordinarias100;
    }

    public void setRolHorasExtrasExtraordinarias100(BigDecimal rolHorasExtrasExtraordinarias100) {
        this.rolHorasExtrasExtraordinarias100 = rolHorasExtrasExtraordinarias100;
    }

    @Column(name = "rol_saldo_horas_extras_extraordinarias_100")
    public BigDecimal getRolSaldoHorasExtrasExtraordinarias100() {
        return rolSaldoHorasExtrasExtraordinarias100;
    }

    public void setRolSaldoHorasExtrasExtraordinarias100(BigDecimal rolSaldoHorasExtrasExtraordinarias100) {
        this.rolSaldoHorasExtrasExtraordinarias100 = rolSaldoHorasExtrasExtraordinarias100;
    }

    @Column(name = "rol_bonos")
    public BigDecimal getRolBonos() {
        return rolBonos;
    }

    public void setRolBonos(BigDecimal rolBonos) {
        this.rolBonos = rolBonos;
    }

    @Column(name = "rol_bonosnd")
    public BigDecimal getRolBonosnd() {
        return rolBonosnd;
    }

    public void setRolBonosnd(BigDecimal rolBonosnd) {
        this.rolBonosnd = rolBonosnd;
    }

    @Column(name = "rol_bono_fijo")
    public BigDecimal getRolBonoFijo() {
        return rolBonoFijo;
    }

    public void setRolBonoFijo(BigDecimal rolBonoFijo) {
        this.rolBonoFijo = rolBonoFijo;
    }

    @Column(name = "rol_bono_fijo_nd")
    public BigDecimal getRolBonoFijoNd() {
        return rolBonoFijoNd;
    }

    public void setRolBonoFijoNd(BigDecimal rolBonoFijoNd) {
        this.rolBonoFijoNd = rolBonoFijoNd;
    }

    @Column(name = "rol_otros_ingresos")
    public BigDecimal getRolOtrosIngresos() {
        return rolOtrosIngresos;
    }

    public void setRolOtrosIngresos(BigDecimal rolOtrosIngresos) {
        this.rolOtrosIngresos = rolOtrosIngresos;
    }

    @Column(name = "rol_otros_ingresos_nd")
    public BigDecimal getRolOtrosIngresosNd() {
        return rolOtrosIngresosNd;
    }

    public void setRolOtrosIngresosNd(BigDecimal rolOtrosIngresosNd) {
        this.rolOtrosIngresosNd = rolOtrosIngresosNd;
    }

    @Column(name = "rol_liq_fondo_reserva")
    public BigDecimal getRolLiqFondoReserva() {
        return rolLiqFondoReserva;
    }

    public void setRolLiqFondoReserva(BigDecimal rolLiqFondoReserva) {
        this.rolLiqFondoReserva = rolLiqFondoReserva;
    }

    @Column(name = "rol_liq_xiii")
    public BigDecimal getRolLiqXiii() {
        return rolLiqXiii;
    }

    public void setRolLiqXiii(BigDecimal rolLiqXiii) {
        this.rolLiqXiii = rolLiqXiii;
    }

    @Column(name = "rol_liq_xiv")
    public BigDecimal getRolLiqXiv() {
        return rolLiqXiv;
    }

    public void setRolLiqXiv(BigDecimal rolLiqXiv) {
        this.rolLiqXiv = rolLiqXiv;
    }

    @Column(name = "rol_liq_vacaciones")
    public BigDecimal getRolLiqVacaciones() {
        return rolLiqVacaciones;
    }

    public void setRolLiqVacaciones(BigDecimal rolLiqVacaciones) {
        this.rolLiqVacaciones = rolLiqVacaciones;
    }

    @Column(name = "rol_liq_salario_digno")
    public BigDecimal getRolLiqSalarioDigno() {
        return rolLiqSalarioDigno;
    }

    public void setRolLiqSalarioDigno(BigDecimal rolLiqSalarioDigno) {
        this.rolLiqSalarioDigno = rolLiqSalarioDigno;
    }

    @Column(name = "rol_liq_desahucio")
    public BigDecimal getRolLiqDesahucio() {
        return rolLiqDesahucio;
    }

    public void setRolLiqDesahucio(BigDecimal rolLiqDesahucio) {
        this.rolLiqDesahucio = rolLiqDesahucio;
    }

    @Column(name = "rol_liq_desahucio_intempestivo")
    public BigDecimal getRolLiqDesahucioIntempestivo() {
        return rolLiqDesahucioIntempestivo;
    }

    public void setRolLiqDesahucioIntempestivo(BigDecimal rolLiqDesahucioIntempestivo) {
        this.rolLiqDesahucioIntempestivo = rolLiqDesahucioIntempestivo;
    }

    @Column(name = "rol_liq_bonificacion")
    public BigDecimal getRolLiqBonificacion() {
        return rolLiqBonificacion;
    }

    public void setRolLiqBonificacion(BigDecimal rolLiqBonificacion) {
        this.rolLiqBonificacion = rolLiqBonificacion;
    }

    @Column(name = "rol_anticipos")
    public BigDecimal getRolAnticipos() {
        return rolAnticipos;
    }

    public void setRolAnticipos(BigDecimal rolAnticipos) {
        this.rolAnticipos = rolAnticipos;
    }

    @Column(name = "rol_prestamos")
    public BigDecimal getRolPrestamos() {
        return rolPrestamos;
    }

    public void setRolPrestamos(BigDecimal rolPrestamos) {
        this.rolPrestamos = rolPrestamos;
    }

    @Column(name = "rol_prestamo_quirografario")
    public BigDecimal getRolPrestamoQuirografario() {
        return rolPrestamoQuirografario;
    }

    public void setRolPrestamoQuirografario(BigDecimal rolPrestamoQuirografario) {
        this.rolPrestamoQuirografario = rolPrestamoQuirografario;
    }

    @Column(name = "rol_prestamo_hipotecario")
    public BigDecimal getRolPrestamoHipotecario() {
        return rolPrestamoHipotecario;
    }

    public void setRolPrestamoHipotecario(BigDecimal rolPrestamoHipotecario) {
        this.rolPrestamoHipotecario = rolPrestamoHipotecario;
    }

    @Column(name = "rol_iess")
    public BigDecimal getRolIess() {
        return rolIess;
    }

    public void setRolIess(BigDecimal rolIess) {
        this.rolIess = rolIess;
    }

    @Column(name = "rol_iess_extension")
    public BigDecimal getRolIessExtension() {
        return rolIessExtension;
    }

    public void setRolIessExtension(BigDecimal rolIessExtension) {
        this.rolIessExtension = rolIessExtension;
    }

    @Column(name = "rol_retencion_fuente")
    public BigDecimal getRolRetencionFuente() {
        return rolRetencionFuente;
    }

    public void setRolRetencionFuente(BigDecimal rolRetencionFuente) {
        this.rolRetencionFuente = rolRetencionFuente;
    }

    @Column(name = "rol_descuento_permiso_medico")
    public BigDecimal getRolDescuentoPermisoMedico() {
        return rolDescuentoPermisoMedico;
    }

    public void setRolDescuentoPermisoMedico(BigDecimal rolDescuentoPermisoMedico) {
        this.rolDescuentoPermisoMedico = rolDescuentoPermisoMedico;
    }

    @Column(name = "rol_total")
    public BigDecimal getRolTotal() {
        return rolTotal;
    }

    public void setRolTotal(BigDecimal rolTotal) {
        this.rolTotal = rolTotal;
    }

    @Column(name = "rol_forma_pago")
    public String getRolFormaPago() {
        return rolFormaPago;
    }

    public void setRolFormaPago(String rolFormaPago) {
        this.rolFormaPago = rolFormaPago;
    }

    @Column(name = "rol_documento")
    public String getRolDocumento() {
        return rolDocumento;
    }

    public void setRolDocumento(String rolDocumento) {
        this.rolDocumento = rolDocumento;
    }

    @Column(name = "rol_observaciones")
    public String getRolObservaciones() {
        return rolObservaciones;
    }

    public void setRolObservaciones(String rolObservaciones) {
        this.rolObservaciones = rolObservaciones;
    }

    @Column(name = "rol_aporte_patronal")
    public BigDecimal getRolAportePatronal() {
        return rolAportePatronal;
    }

    public void setRolAportePatronal(BigDecimal rolAportePatronal) {
        this.rolAportePatronal = rolAportePatronal;
    }

    @Column(name = "rol_iece")
    public BigDecimal getRolIece() {
        return rolIece;
    }

    public void setRolIece(BigDecimal rolIece) {
        this.rolIece = rolIece;
    }

    @Column(name = "rol_secap")
    public BigDecimal getRolSecap() {
        return rolSecap;
    }

    public void setRolSecap(BigDecimal rolSecap) {
        this.rolSecap = rolSecap;
    }

    @Column(name = "rol_xiii")
    public BigDecimal getRolXiii() {
        return rolXiii;
    }

    public void setRolXiii(BigDecimal rolXiii) {
        this.rolXiii = rolXiii;
    }

    @Column(name = "rol_xiv")
    public BigDecimal getRolXiv() {
        return rolXiv;
    }

    public void setRolXiv(BigDecimal rolXiv) {
        this.rolXiv = rolXiv;
    }

    @Column(name = "rol_fondo_reserva")
    public BigDecimal getRolFondoReserva() {
        return rolFondoReserva;
    }

    public void setRolFondoReserva(BigDecimal rolFondoReserva) {
        this.rolFondoReserva = rolFondoReserva;
    }

    @Column(name = "rol_vacaciones")
    public BigDecimal getRolVacaciones() {
        return rolVacaciones;
    }

    public void setRolVacaciones(BigDecimal rolVacaciones) {
        this.rolVacaciones = rolVacaciones;
    }

    @Column(name = "rol_desahucio")
    public BigDecimal getRolDesahucio() {
        return rolDesahucio;
    }

    public void setRolDesahucio(BigDecimal rolDesahucio) {
        this.rolDesahucio = rolDesahucio;
    }

    @Column(name = "rol_auxiliar")
    public boolean isRolAuxiliar() {
        return rolAuxiliar;
    }

    public void setRolAuxiliar(boolean rolAuxiliar) {
        this.rolAuxiliar = rolAuxiliar;
    }

    @Column(name = "emp_cargo")
    public String getEmpCargo() {
        return empCargo;
    }

    public void setEmpCargo(String empCargo) {
        this.empCargo = empCargo;
    }

    @Column(name = "cat_empresa")
    public String getCatEmpresa() {
        return catEmpresa;
    }

    public void setCatEmpresa(String catEmpresa) {
        this.catEmpresa = catEmpresa;
    }

    @Column(name = "cat_nombre")
    public String getCatNombre() {
        return catNombre;
    }

    public void setCatNombre(String catNombre) {
        this.catNombre = catNombre;
    }

    @Column(name = "emp_sueldo")
    public BigDecimal getEmpSueldo() {
        return empSueldo;
    }

    public void setEmpSueldo(BigDecimal empSueldo) {
        this.empSueldo = empSueldo;
    }

    @Column(name = "emp_bono_fijo")
    public BigDecimal getEmpBonoFijo() {
        return empBonoFijo;
    }

    public void setEmpBonoFijo(BigDecimal empBonoFijo) {
        this.empBonoFijo = empBonoFijo;
    }

    @Column(name = "emp_bono_fijo_nd")
    public BigDecimal getEmpBonoFijoNd() {
        return empBonoFijoNd;
    }

    public void setEmpBonoFijoNd(BigDecimal empBonoFijoNd) {
        this.empBonoFijoNd = empBonoFijoNd;
    }

    @Column(name = "emp_otros_ingresos")
    public BigDecimal getEmpOtrosIngresos() {
        return empOtrosIngresos;
    }

    public void setEmpOtrosIngresos(BigDecimal empOtrosIngresos) {
        this.empOtrosIngresos = empOtrosIngresos;
    }

    @Column(name = "emp_otros_ingresos_nd")
    public BigDecimal getEmpOtrosIngresosNd() {
        return empOtrosIngresosNd;
    }

    public void setEmpOtrosIngresosNd(BigDecimal empOtrosIngresosNd) {
        this.empOtrosIngresosNd = empOtrosIngresosNd;
    }

    @Column(name = "emp_dias_laborados")
    public short getEmpDiasLaborados() {
        return empDiasLaborados;
    }

    public void setEmpDiasLaborados(short empDiasLaborados) {
        this.empDiasLaborados = empDiasLaborados;
    }

    @Column(name = "emp_dias_descanso")
    public short getEmpDiasDescanso() {
        return empDiasDescanso;
    }

    public void setEmpDiasDescanso(short empDiasDescanso) {
        this.empDiasDescanso = empDiasDescanso;
    }

    @Column(name = "emp_cancelar_xiii_sueldo_mensualmente")
    public boolean isEmpCancelarXiiiSueldoMensualmente() {
        return empCancelarXiiiSueldoMensualmente;
    }

    public void setEmpCancelarXiiiSueldoMensualmente(boolean empCancelarXiiiSueldoMensualmente) {
        this.empCancelarXiiiSueldoMensualmente = empCancelarXiiiSueldoMensualmente;
    }

    @Column(name = "emp_cancelar_xiv_sueldo_mensualmente")
    public boolean isEmpCancelarXivSueldoMensualmente() {
        return empCancelarXivSueldoMensualmente;
    }

    public void setEmpCancelarXivSueldoMensualmente(boolean empCancelarXivSueldoMensualmente) {
        this.empCancelarXivSueldoMensualmente = empCancelarXivSueldoMensualmente;
    }

    @Column(name = "emp_cancelar_fondo_reserva_mensualmente")
    public boolean isEmpCancelarFondoReservaMensualmente() {
        return empCancelarFondoReservaMensualmente;
    }

    public void setEmpCancelarFondoReservaMensualmente(boolean empCancelarFondoReservaMensualmente) {
        this.empCancelarFondoReservaMensualmente = empCancelarFondoReservaMensualmente;
    }

    @Column(name = "emp_salario_neto")
    public boolean isEmpSalarioNeto() {
        return empSalarioNeto;
    }

    public void setEmpSalarioNeto(boolean empSalarioNeto) {
        this.empSalarioNeto = empSalarioNeto;
    }

    @Column(name = "rol_dias_vacaciones")
    public Integer getRolDiasVacaciones() {
        return rolDiasVacaciones;
    }

    public void setRolDiasVacaciones(Integer rolDiasVacaciones) {
        this.rolDiasVacaciones = rolDiasVacaciones;
    }

    @Column(name = "rol_descuento_vacaciones", nullable = true)
    public BigDecimal getRolDescuentoVacaciones() {
        return rolDescuentoVacaciones;
    }

    public void setRolDescuentoVacaciones(BigDecimal rolDescuentoVacaciones) {
        this.rolDescuentoVacaciones = rolDescuentoVacaciones;
    }

    @JoinColumns({
        @JoinColumn(name = "sec_empresa", referencedColumnName = "sec_empresa")
        , @JoinColumn(name = "sec_codigo", referencedColumnName = "sec_codigo")})
    @ManyToOne(optional = false)
    public PrdSector getPrdSector() {
        return prdSector;
    }

    public void setPrdSector(PrdSector prdSector) {
        this.prdSector = prdSector;
    }

    @JoinColumns({
        @JoinColumn(name = "cta_empresa", referencedColumnName = "cta_empresa")
        , @JoinColumn(name = "cta_codigo", referencedColumnName = "cta_codigo")})
    @ManyToOne(optional = false)
    public ConCuentas getConCuentas() {
        return conCuentas;
    }

    public void setConCuentas(ConCuentas conCuentas) {
        this.conCuentas = conCuentas;
    }

    @JoinColumns({
        @JoinColumn(name = "con_empresa", referencedColumnName = "con_empresa")
        , @JoinColumn(name = "con_periodo", referencedColumnName = "con_periodo")
        , @JoinColumn(name = "con_tipo", referencedColumnName = "con_tipo")
        , @JoinColumn(name = "con_numero", referencedColumnName = "con_numero")})
    @ManyToOne(optional = false)
    @JsonIgnore
    public ConContable getConContable() {
        return conContable;
    }

    public void setConContable(ConContable conContable) {
        this.conContable = conContable;
    }

    @JoinColumns({
        @JoinColumn(name = "con_provision_empresa", referencedColumnName = "con_empresa")
        , @JoinColumn(name = "con_provision_periodo", referencedColumnName = "con_periodo")
        , @JoinColumn(name = "con_provision_tipo", referencedColumnName = "con_tipo")
        , @JoinColumn(name = "con_provision_numero", referencedColumnName = "con_numero")})
    @ManyToOne(optional = false)
    public ConContable getConContableProvision() {
        return conContableProvision;
    }

    public void setConContableProvision(ConContable conContableProvision) {
        this.conContableProvision = conContableProvision;
    }

    @JoinColumns({
        @JoinColumn(name = "emp_empresa", referencedColumnName = "emp_empresa")
        , @JoinColumn(name = "emp_id", referencedColumnName = "emp_id")})
    @ManyToOne(optional = false)
    public RhEmpleado getRhEmpleado() {
        return rhEmpleado;
    }

    public void setRhEmpleado(RhEmpleado rhEmpleado) {
        this.rhEmpleado = rhEmpleado;
    }

    @Column(name = "rol_impuesto_renta_modificado")
    public boolean isRolImpuestoRentaModificado() {
        return rolImpuestoRentaModificado;
    }

    public void setRolImpuestoRentaModificado(boolean rolImpuestoRentaModificado) {
        this.rolImpuestoRentaModificado = rolImpuestoRentaModificado;
    }

    @Column(name = "rol_relacion_trabajo")
    public String getRolRelacionTrabajo() {
        return rolRelacionTrabajo;
    }

    public void setRolRelacionTrabajo(String rolRelacionTrabajo) {
        this.rolRelacionTrabajo = rolRelacionTrabajo;
    }

    @Column(name = "rol_ingreso_vacaciones")
    public BigDecimal getRolIngresoVacaciones() {
        return rolIngresoVacaciones;
    }

    public void setRolIngresoVacaciones(BigDecimal rolIngresoVacaciones) {
        this.rolIngresoVacaciones = rolIngresoVacaciones;
    }

    @Column(name = "rol_recargo_jornada_nocturna")
    public BigDecimal getRolRecargoJornadaNocturna() {
        return rolRecargoJornadaNocturna;
    }

    public void setRolRecargoJornadaNocturna(BigDecimal rolRecargoJornadaNocturna) {
        this.rolRecargoJornadaNocturna = rolRecargoJornadaNocturna;
    }

    @Column(name = "rol_periodo_vac_desde")
    public Date getRolPeriodoVacDesde() {
        return rolPeriodoVacDesde;
    }

    public void setRolPeriodoVacDesde(Date rolPeriodoVacDesde) {
        this.rolPeriodoVacDesde = rolPeriodoVacDesde;
    }

    @Column(name = "rol_periodo_vac_hasta")
    public Date getRolPeriodoVacHasta() {
        return rolPeriodoVacHasta;
    }

    public void setRolPeriodoVacHasta(Date rolPeriodoVacHasta) {
        this.rolPeriodoVacHasta = rolPeriodoVacHasta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rolSecuencial != null ? rolSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof RhRol)) {
            return false;
        }
        RhRol other = (RhRol) object;
        if ((this.rolSecuencial == null && other.rolSecuencial != null)
                || (this.rolSecuencial != null && !this.rolSecuencial.equals(other.rolSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rrhh.entity.RhRol[ rolSecuencial=" + rolSecuencial + " ]";
    }

    public String string() {
        return "rhEmpleadoNombre=" + rhEmpleado.getEmpApellidos() + " " + rhEmpleado.getEmpNombres()
                + "\nrolSecuencial=" + rolSecuencial + ",\nrolDesde=" + rolDesde + ",\nrolHasta=" + rolHasta
                + ",\nrolFechaUltimoSueldo=" + rolFechaUltimoSueldo + ",\nrolDiasLaboradosReales="
                + rolDiasLaboradosReales + ",\nrolDiasFaltasReales=" + rolDiasFaltasReales + ",\nrolDiasExtrasReales="
                + rolDiasExtrasReales + ",\nrolDiasDescansoReales=" + rolDiasDescansoReales + ",\nrolDiasPagadosReales="
                + rolDiasPagadosReales + ",\nrolDiasPermisoMedico=" + rolDiasPermisoMedico + ",\nrolSaldoAnterior="
                + rolSaldoAnterior + ",\nrolIngresos=" + rolIngresos + ",\nrolHorasExtras=" + rolHorasExtras
                + ",\nrolBonos=" + rolBonos + ",\nrolBonosnd=" + rolBonosnd + ",\nrolBonoFijo=" + rolBonoFijo
                + ",\nrolBonoFijoNd=" + rolBonoFijoNd + ",\nrolOtrosIngresos=" + rolOtrosIngresos
                + ",\nrolOtrosIngresosNd=" + rolOtrosIngresosNd + ",\nrolLiqFondoReserva=" + rolLiqFondoReserva
                + ",\nrolLiqXiii=" + rolLiqXiii + ",\nrolLiqXiv=" + rolLiqXiv + ",\nrolLiqVacaciones="
                + rolLiqVacaciones + ",\nrolLiqSalarioDigno=" + rolLiqSalarioDigno + ",\nrolLiqDesahucio="
                + rolLiqDesahucio + ",\nrolLiqDesahucioIntempestivo=" + rolLiqDesahucioIntempestivo
                + ",\nrolLiqBonificacion=" + rolLiqBonificacion + ",\nrolAnticipos=" + rolAnticipos + ",\nrolPrestamos="
                + rolPrestamos + ",\nrolIess=" + rolIess + ",\nrolRetencionFuente=" + rolRetencionFuente
                + ",\nrolDescuentoPermisoMedico=" + rolDescuentoPermisoMedico + ",\nrolTotal=" + rolTotal
                + ",\nrolFormaPago=" + rolFormaPago + ",\nrolDocumento=" + rolDocumento + ",\nrolObservaciones="
                + rolObservaciones + ",\nrolAportePatronal=" + rolAportePatronal + ",\nrolIece=" + rolIece
                + ",\nrolSecap=" + rolSecap + ",\nrolXiii=" + rolXiii + ",\nrolXiv=" + rolXiv + ",\nrolFondoReserva="
                + rolFondoReserva + ",\nrolVacaciones=" + rolVacaciones + ",\nrolDesahucio=" + rolDesahucio
                + ",\nrolAuxiliar=" + rolAuxiliar + ",\nempCargo=" + empCargo + ",\nempSueldo=" + empSueldo
                + ",\nempBonoFijo=" + empBonoFijo + ",\nempBonoFijoNd=" + empBonoFijoNd + ",\nempOtrosIngresos="
                + empOtrosIngresos + ",\nempOtrosIngresosNd=" + empOtrosIngresosNd + ",\nempDiasLaborados="
                + empDiasLaborados + ",\nempDiasDescanso=" + empDiasDescanso + ",\nempCancelarXiiiSueldoMensualmente="
                + empCancelarXiiiSueldoMensualmente + ",\nempCancelarXivSueldoMensualmente="
                + empCancelarXivSueldoMensualmente + ",\nempCancelarFondoReservaMensualmente="
                + empCancelarFondoReservaMensualmente + ",\nempSalarioNeto=" + empSalarioNeto + ",\nprdSector="
                + prdSector + ",\nconCuentas=" + conCuentas + ",\nconContable=" + conContable
                + ",\nconContableProvisiones=" + conContableProvision + ",\nrhEmpleado=" + rhEmpleado;
    }

    public String toJSON() {
        return UtilsJSON.objetoToJson(this);
    }

}
