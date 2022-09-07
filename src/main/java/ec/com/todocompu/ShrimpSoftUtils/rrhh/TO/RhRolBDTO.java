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
public class RhRolBDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "rol_secuencial")
	private Integer rolSecuencial;

	@Column(name = "rol_desde")
	private String rolDesde;

	@Column(name = "rol_hasta")
	private String rolHasta;

	@Column(name = "rol_fecha_ultimo_sueldo")
	private String rolFechaUltimoSueldo;

	@Column(name = "rol_dias_laborados_reales")
	private Integer rolDiasLaboradosReales;

	@Column(name = "rol_dias_faltas_reales")
	private Integer rolDiasFaltasReales;

	@Column(name = "rol_dias_extras_reales")
	private Integer rolDiasExtrasReales;

	@Column(name = "rol_dias_descanso_reales")
	private Integer rolDiasDescansoReales;

	@Column(name = "rol_dias_pagados_reales")
	private Integer rolDiasPagadosReales;

	@Column(name = "rol_dias_permiso_medico")
	private Integer rolDiasPermisoMedico;

	@Column(name = "rol_saldo_anterior")
	private BigDecimal rolSaldoAnterior;

	@Column(name = "rol_ingresos")
	private BigDecimal rolIngresos;

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

	@Column(name = "rol_iess")
	private BigDecimal rolIess;

	@Column(name = "rol_retencion_fuente")
	private BigDecimal rolRetencionFuente;

	@Column(name = "rol_descuento_permiso_medico")
	private BigDecimal rolDescuentoPermisoMedico;

	@Column(name = "rol_total")
	private BigDecimal rolTotal;

	@Column(name = "rol_forma_pago")
	private String rolFormaPago;

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

	@Column(name = "rol_reversado")
	private Boolean rolReversado;

	@Column(name = "emp_id")
	private String empId;

	@Column(name = "emp_cargo")
	private String empCargo;

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
	private Integer empDiasLaborados;

	@Column(name = "emp_dias_descanso")
	private Integer empDiasDescanso;

	@Column(name = "emp_cancelar_xiii_sueldo_mensualmente")
	private Boolean empCancelarXiiiSueldoMensualmente;

	@Column(name = "emp_cancelar_xiv_sueldo_mensualmente")
	private Boolean empCancelarXivSueldoMensualmente;

	@Column(name = "emp_cancelar_fondo_reserva_mensualmente")
	private Boolean empCancelarFondoReservaMensualmente;

	@Column(name = "sec_codigo")
	private String secCodigo;

	@Column(name = "con_provision_periodo")
	private String conProvisionPeriodo;

	@Column(name = "con_provision_tipo")
	private String conProvisionTipo;

	@Column(name = "con_provision_numero")
	private String conProvisionNumero;

	public RhRolBDTO() {
	}

	public RhRolBDTO(Integer rolSecuencial, String rolDesde, String rolHasta, String rolFechaUltimoSueldo,
			Integer rolDiasLaboradosReales, Integer rolDiasFaltasReales, Integer rolDiasExtrasReales,
			Integer rolDiasDescansoReales, Integer rolDiasPagadosReales, Integer rolDiasPermisoMedico,
			BigDecimal rolSaldoAnterior, BigDecimal rolIngresos, BigDecimal rolBonos, BigDecimal rolBonosnd,
			BigDecimal rolBonoFijo, BigDecimal rolBonoFijoNd, BigDecimal rolOtrosIngresos,
			BigDecimal rolOtrosIngresosNd, BigDecimal rolLiqFondoReserva, BigDecimal rolLiqXiii, BigDecimal rolLiqXiv,
			BigDecimal rolLiqVacaciones, BigDecimal rolLiqSalarioDigno, BigDecimal rolLiqDesahucio,
			BigDecimal rolLiqDesahucioIntempestivo, BigDecimal rolLiqBonificacion, BigDecimal rolAnticipos,
			BigDecimal rolPrestamos, BigDecimal rolIess, BigDecimal rolRetencionFuente,
			BigDecimal rolDescuentoPermisoMedico, BigDecimal rolTotal, String rolFormaPago,
			BigDecimal rolAportePatronal, BigDecimal rolIece, BigDecimal rolSecap, BigDecimal rolXiii,
			BigDecimal rolXiv, BigDecimal rolFondoReserva, BigDecimal rolVacaciones, BigDecimal rolDesahucio,
			Boolean rolReversado, String empId, String empCargo, BigDecimal empSueldo, BigDecimal empBonoFijo,
			BigDecimal empBonoFijoNd, BigDecimal empOtrosIngresos, BigDecimal empOtrosIngresosNd,
			Integer empDiasLaborados, Integer empDiasDescanso, Boolean empCancelarXiiiSueldoMensualmente,
			Boolean empCancelarXivSueldoMensualmente, Boolean empCancelarFondoReservaMensualmente, String secCodigo,
			String conProvisionPeriodo, String conProvisionTipo, String conProvisionNumero) {
		this.rolSecuencial = rolSecuencial;
		this.rolDesde = rolDesde;
		this.rolHasta = rolHasta;
		this.rolFechaUltimoSueldo = rolFechaUltimoSueldo;
		this.rolDiasLaboradosReales = rolDiasLaboradosReales;
		this.rolDiasFaltasReales = rolDiasFaltasReales;
		this.rolDiasExtrasReales = rolDiasExtrasReales;
		this.rolDiasDescansoReales = rolDiasDescansoReales;
		this.rolDiasPagadosReales = rolDiasPagadosReales;
		this.rolDiasPermisoMedico = rolDiasPermisoMedico;
		this.rolSaldoAnterior = rolSaldoAnterior;
		this.rolIngresos = rolIngresos;
		this.rolBonos = rolBonos;
		this.rolBonosnd = rolBonosnd;
		this.rolBonoFijo = rolBonoFijo;
		this.rolBonoFijoNd = rolBonoFijoNd;
		this.rolOtrosIngresos = rolOtrosIngresos;
		this.rolOtrosIngresosNd = rolOtrosIngresosNd;
		this.rolLiqFondoReserva = rolLiqFondoReserva;
		this.rolLiqXiii = rolLiqXiii;
		this.rolLiqXiv = rolLiqXiv;
		this.rolLiqVacaciones = rolLiqVacaciones;
		this.rolLiqSalarioDigno = rolLiqSalarioDigno;
		this.rolLiqDesahucio = rolLiqDesahucio;
		this.rolLiqDesahucioIntempestivo = rolLiqDesahucioIntempestivo;
		this.rolLiqBonificacion = rolLiqBonificacion;
		this.rolAnticipos = rolAnticipos;
		this.rolPrestamos = rolPrestamos;
		this.rolIess = rolIess;
		this.rolRetencionFuente = rolRetencionFuente;
		this.rolDescuentoPermisoMedico = rolDescuentoPermisoMedico;
		this.rolTotal = rolTotal;
		this.rolFormaPago = rolFormaPago;
		this.rolAportePatronal = rolAportePatronal;
		this.rolIece = rolIece;
		this.rolSecap = rolSecap;
		this.rolXiii = rolXiii;
		this.rolXiv = rolXiv;
		this.rolFondoReserva = rolFondoReserva;
		this.rolVacaciones = rolVacaciones;
		this.rolDesahucio = rolDesahucio;
		this.rolReversado = rolReversado;
		this.empId = empId;
		this.empCargo = empCargo;
		this.empSueldo = empSueldo;
		this.empBonoFijo = empBonoFijo;
		this.empBonoFijoNd = empBonoFijoNd;
		this.empOtrosIngresos = empOtrosIngresos;
		this.empOtrosIngresosNd = empOtrosIngresosNd;
		this.empDiasLaborados = empDiasLaborados;
		this.empDiasDescanso = empDiasDescanso;
		this.empCancelarXiiiSueldoMensualmente = empCancelarXiiiSueldoMensualmente;
		this.empCancelarXivSueldoMensualmente = empCancelarXivSueldoMensualmente;
		this.empCancelarFondoReservaMensualmente = empCancelarFondoReservaMensualmente;
		this.secCodigo = secCodigo;
		this.conProvisionPeriodo = conProvisionPeriodo;
		this.conProvisionTipo = conProvisionTipo;
		this.conProvisionNumero = conProvisionNumero;
	}

	public String getConProvisionNumero() {
		return conProvisionNumero;
	}

	public void setConProvisionNumero(String conProvisionNumero) {
		this.conProvisionNumero = conProvisionNumero;
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

	public Boolean getEmpCancelarFondoReservaMensualmente() {
		return empCancelarFondoReservaMensualmente;
	}

	public void setEmpCancelarFondoReservaMensualmente(Boolean empCancelarFondoReservaMensualmente) {
		this.empCancelarFondoReservaMensualmente = empCancelarFondoReservaMensualmente;
	}

	public Boolean getEmpCancelarXiiiSueldoMensualmente() {
		return empCancelarXiiiSueldoMensualmente;
	}

	public void setEmpCancelarXiiiSueldoMensualmente(Boolean empCancelarXiiiSueldoMensualmente) {
		this.empCancelarXiiiSueldoMensualmente = empCancelarXiiiSueldoMensualmente;
	}

	public Boolean getEmpCancelarXivSueldoMensualmente() {
		return empCancelarXivSueldoMensualmente;
	}

	public void setEmpCancelarXivSueldoMensualmente(Boolean empCancelarXivSueldoMensualmente) {
		this.empCancelarXivSueldoMensualmente = empCancelarXivSueldoMensualmente;
	}

	public String getEmpCargo() {
		return empCargo;
	}

	public void setEmpCargo(String empCargo) {
		this.empCargo = empCargo;
	}

	public Integer getEmpDiasDescanso() {
		return empDiasDescanso;
	}

	public void setEmpDiasDescanso(Integer empDiasDescanso) {
		this.empDiasDescanso = empDiasDescanso;
	}

	public Integer getEmpDiasLaborados() {
		return empDiasLaborados;
	}

	public void setEmpDiasLaborados(Integer empDiasLaborados) {
		this.empDiasLaborados = empDiasLaborados;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
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

	public BigDecimal getEmpSueldo() {
		return empSueldo;
	}

	public void setEmpSueldo(BigDecimal empSueldo) {
		this.empSueldo = empSueldo;
	}

	public BigDecimal getRolAnticipos() {
		return rolAnticipos;
	}

	public void setRolAnticipos(BigDecimal rolAnticipos) {
		this.rolAnticipos = rolAnticipos;
	}

	public BigDecimal getRolAportePatronal() {
		return rolAportePatronal;
	}

	public void setRolAportePatronal(BigDecimal rolAportePatronal) {
		this.rolAportePatronal = rolAportePatronal;
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

	public BigDecimal getRolDesahucio() {
		return rolDesahucio;
	}

	public void setRolDesahucio(BigDecimal rolDesahucio) {
		this.rolDesahucio = rolDesahucio;
	}

	public BigDecimal getRolDescuentoPermisoMedico() {
		return rolDescuentoPermisoMedico;
	}

	public void setRolDescuentoPermisoMedico(BigDecimal rolDescuentoPermisoMedico) {
		this.rolDescuentoPermisoMedico = rolDescuentoPermisoMedico;
	}

	public String getRolDesde() {
		return rolDesde;
	}

	public void setRolDesde(String rolDesde) {
		this.rolDesde = rolDesde;
	}

	public Integer getRolDiasDescansoReales() {
		return rolDiasDescansoReales;
	}

	public void setRolDiasDescansoReales(Integer rolDiasDescansoReales) {
		this.rolDiasDescansoReales = rolDiasDescansoReales;
	}

	public Integer getRolDiasExtrasReales() {
		return rolDiasExtrasReales;
	}

	public void setRolDiasExtrasReales(Integer rolDiasExtrasReales) {
		this.rolDiasExtrasReales = rolDiasExtrasReales;
	}

	public Integer getRolDiasFaltasReales() {
		return rolDiasFaltasReales;
	}

	public void setRolDiasFaltasReales(Integer rolDiasFaltasReales) {
		this.rolDiasFaltasReales = rolDiasFaltasReales;
	}

	public Integer getRolDiasLaboradosReales() {
		return rolDiasLaboradosReales;
	}

	public void setRolDiasLaboradosReales(Integer rolDiasLaboradosReales) {
		this.rolDiasLaboradosReales = rolDiasLaboradosReales;
	}

	public Integer getRolDiasPagadosReales() {
		return rolDiasPagadosReales;
	}

	public void setRolDiasPagadosReales(Integer rolDiasPagadosReales) {
		this.rolDiasPagadosReales = rolDiasPagadosReales;
	}

	public Integer getRolDiasPermisoMedico() {
		return rolDiasPermisoMedico;
	}

	public void setRolDiasPermisoMedico(Integer rolDiasPermisoMedico) {
		this.rolDiasPermisoMedico = rolDiasPermisoMedico;
	}

	public String getRolFechaUltimoSueldo() {
		return rolFechaUltimoSueldo;
	}

	public void setRolFechaUltimoSueldo(String rolFechaUltimoSueldo) {
		this.rolFechaUltimoSueldo = rolFechaUltimoSueldo;
	}

	public BigDecimal getRolFondoReserva() {
		return rolFondoReserva;
	}

	public void setRolFondoReserva(BigDecimal rolFondoReserva) {
		this.rolFondoReserva = rolFondoReserva;
	}

	public String getRolFormaPago() {
		return rolFormaPago;
	}

	public void setRolFormaPago(String rolFormaPago) {
		this.rolFormaPago = rolFormaPago;
	}

	public String getRolHasta() {
		return rolHasta;
	}

	public void setRolHasta(String rolHasta) {
		this.rolHasta = rolHasta;
	}

	public BigDecimal getRolIece() {
		return rolIece;
	}

	public void setRolIece(BigDecimal rolIece) {
		this.rolIece = rolIece;
	}

	public BigDecimal getRolIess() {
		return rolIess;
	}

	public void setRolIess(BigDecimal rolIess) {
		this.rolIess = rolIess;
	}

	public BigDecimal getRolIngresos() {
		return rolIngresos;
	}

	public void setRolIngresos(BigDecimal rolIngresos) {
		this.rolIngresos = rolIngresos;
	}

	public BigDecimal getRolLiqBonificacion() {
		return rolLiqBonificacion;
	}

	public void setRolLiqBonificacion(BigDecimal rolLiqBonificacion) {
		this.rolLiqBonificacion = rolLiqBonificacion;
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

	public BigDecimal getRolLiqFondoReserva() {
		return rolLiqFondoReserva;
	}

	public void setRolLiqFondoReserva(BigDecimal rolLiqFondoReserva) {
		this.rolLiqFondoReserva = rolLiqFondoReserva;
	}

	public BigDecimal getRolLiqSalarioDigno() {
		return rolLiqSalarioDigno;
	}

	public void setRolLiqSalarioDigno(BigDecimal rolLiqSalarioDigno) {
		this.rolLiqSalarioDigno = rolLiqSalarioDigno;
	}

	public BigDecimal getRolLiqVacaciones() {
		return rolLiqVacaciones;
	}

	public void setRolLiqVacaciones(BigDecimal rolLiqVacaciones) {
		this.rolLiqVacaciones = rolLiqVacaciones;
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

	public BigDecimal getRolPrestamos() {
		return rolPrestamos;
	}

	public void setRolPrestamos(BigDecimal rolPrestamos) {
		this.rolPrestamos = rolPrestamos;
	}

	public BigDecimal getRolRetencionFuente() {
		return rolRetencionFuente;
	}

	public void setRolRetencionFuente(BigDecimal rolRetencionFuente) {
		this.rolRetencionFuente = rolRetencionFuente;
	}

	public Boolean getRolReversado() {
		return rolReversado;
	}

	public void setRolReversado(Boolean rolReversado) {
		this.rolReversado = rolReversado;
	}

	public BigDecimal getRolSaldoAnterior() {
		return rolSaldoAnterior;
	}

	public void setRolSaldoAnterior(BigDecimal rolSaldoAnterior) {
		this.rolSaldoAnterior = rolSaldoAnterior;
	}

	public BigDecimal getRolSecap() {
		return rolSecap;
	}

	public void setRolSecap(BigDecimal rolSecap) {
		this.rolSecap = rolSecap;
	}

	public Integer getRolSecuencial() {
		return rolSecuencial;
	}

	public void setRolSecuencial(Integer rolSecuencial) {
		this.rolSecuencial = rolSecuencial;
	}

	public BigDecimal getRolTotal() {
		return rolTotal;
	}

	public void setRolTotal(BigDecimal rolTotal) {
		this.rolTotal = rolTotal;
	}

	public BigDecimal getRolVacaciones() {
		return rolVacaciones;
	}

	public void setRolVacaciones(BigDecimal rolVacaciones) {
		this.rolVacaciones = rolVacaciones;
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

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}
}