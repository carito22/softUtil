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
public class RhFunPlantillaSueldosLotePreliminarTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "emp_categoria")
	private String prCategoria;

	@Column(name = "emp_id")
	private String prId;

	@Column(name = "emp_nombres")
	private String prNombres;

	@Column(name = "emp_cargo")
	private String prCargo;

	@Column(name = "sec_codigo")
	private String prSector;

	@Column(name = "rol_desde")
	private String prDesde;

	@Column(name = "rol_hasta")
	private String prHasta;

	@Column(name = "rol_fecha_ultimo_sueldo")
	private String prFechaUltimoSueldo;

	@Column(name = "rol_dias_laborados_reales")
	private int prDiasLaboradosReales;

	@Column(name = "rol_dias_faltas_reales")
	private int prDiasFaltasReales;

	@Column(name = "rol_dias_extras_reales")
	private int prDiasExtrasReales;

	@Column(name = "rol_dias_descanso_reales")
	private int prDiasDescansoReales;

	@Column(name = "rol_dias_pagados_reales")
	private int prDiasPagadosReales;

	@Column(name = "rol_dias_permiso_medico")
	private int prDiasPermisoMedico;

	@Column(name = "rol_saldo_anterior")
	private BigDecimal rolSaldoAnterior;

	@Column(name = "rol_ingresos")
	private BigDecimal rolIngresos;

	@Column(name = "rol_bonos")
	private BigDecimal rolBonos;

	@Column(name = "rol_bonosnd")
	private BigDecimal rolBonosNd;

	@Column(name = "rol_bono_fijo")
	private BigDecimal rolBonoFijo;

	@Column(name = "rol_bono_fijo_nd")
	private BigDecimal rolBonoFijoNd;

	@Column(name = "rol_otros_ingresos")
	private BigDecimal rolOtrosIngresos;

	@Column(name = "rol_otros_ingresos_nd")
	private BigDecimal rolOtrosIngresosNd;

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
	private Boolean prReversado;

	@Column(name = "emp_sueldo_iess")
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
	private int empDiasLaborados;

	@Column(name = "emp_dias_descanso")
	private int empDiasDescanso;

	@Column(name = "emp_cancelar_xiii_sueldo_mensualmente")
	private Boolean empCancelarXiiiSueldoMensualmente;

	@Column(name = "emp_cancelar_xiv_sueldo_mensualmente")
	private Boolean empCancelarXivSueldoMensualmente;

	@Column(name = "emp_cancelar_fondo_reserva_mensualmente")
	private Boolean empCancelarFondoReservaMensualmente;

	@Column(name = "rol_forma_pago")
	private String prFormaPago;

	public RhFunPlantillaSueldosLotePreliminarTO() {
	}

	public RhFunPlantillaSueldosLotePreliminarTO(String prCategoria, String prId, String prNombres, String prCargo,
			String prSector, String prDesde, String prHasta, String prFechaUltimoSueldo, int prDiasLaboradosReales,
			int prDiasFaltasReales, int prDiasExtrasReales, int prDiasDescansoReales, int prDiasPagadosReales,
			int prDiasPermisoMedico, BigDecimal rolSaldoAnterior, BigDecimal rolIngresos, BigDecimal rolBonos,
			BigDecimal rolBonosNd, BigDecimal rolBonoFijo, BigDecimal rolBonoFijoNd, BigDecimal rolOtrosIngresos,
			BigDecimal rolOtrosIngresosNd, BigDecimal rolAnticipos, BigDecimal rolPrestamos, BigDecimal rolIess,
			BigDecimal rolRetencionFuente, BigDecimal rolDescuentoPermisoMedico, BigDecimal rolTotal,
			BigDecimal rolAportePatronal, BigDecimal rolIece, BigDecimal rolSecap, BigDecimal rolXiii,
			BigDecimal rolXiv, BigDecimal rolFondoReserva, BigDecimal rolVacaciones, BigDecimal rolDesahucio,
			Boolean prReversado, BigDecimal empSueldo, BigDecimal empBonoFijo, BigDecimal empBonoFijoNd,
			BigDecimal empOtrosIngresos, BigDecimal empOtrosIngresosNd, int empDiasLaborados, int empDiasDescanso,
			Boolean empCancelarXiiiSueldoMensualmente, Boolean empCancelarXivSueldoMensualmente,
			Boolean empCancelarFondoReservaMensualmente, String prFormaPago, Integer id) {
		this.prCategoria = prCategoria;
		this.prId = prId;
		this.prNombres = prNombres;
		this.prCargo = prCargo;
		this.prSector = prSector;
		this.prDesde = prDesde;
		this.prHasta = prHasta;
		this.prFechaUltimoSueldo = prFechaUltimoSueldo;
		this.prDiasLaboradosReales = prDiasLaboradosReales;
		this.prDiasFaltasReales = prDiasFaltasReales;
		this.prDiasExtrasReales = prDiasExtrasReales;
		this.prDiasDescansoReales = prDiasDescansoReales;
		this.prDiasPagadosReales = prDiasPagadosReales;
		this.prDiasPermisoMedico = prDiasPermisoMedico;
		this.rolSaldoAnterior = rolSaldoAnterior;
		this.rolIngresos = rolIngresos;
		this.rolBonos = rolBonos;
		this.rolBonosNd = rolBonosNd;
		this.rolBonoFijo = rolBonoFijo;
		this.rolBonoFijoNd = rolBonoFijoNd;
		this.rolOtrosIngresos = rolOtrosIngresos;
		this.rolOtrosIngresosNd = rolOtrosIngresosNd;
		this.rolAnticipos = rolAnticipos;
		this.rolPrestamos = rolPrestamos;
		this.rolIess = rolIess;
		this.rolRetencionFuente = rolRetencionFuente;
		this.rolDescuentoPermisoMedico = rolDescuentoPermisoMedico;
		this.rolTotal = rolTotal;
		this.rolAportePatronal = rolAportePatronal;
		this.rolIece = rolIece;
		this.rolSecap = rolSecap;
		this.rolXiii = rolXiii;
		this.rolXiv = rolXiv;
		this.rolFondoReserva = rolFondoReserva;
		this.rolVacaciones = rolVacaciones;
		this.rolDesahucio = rolDesahucio;
		this.prReversado = prReversado;
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
		this.prFormaPago = prFormaPago;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public int getEmpDiasDescanso() {
		return empDiasDescanso;
	}

	public void setEmpDiasDescanso(int empDiasDescanso) {
		this.empDiasDescanso = empDiasDescanso;
	}

	public int getEmpDiasLaborados() {
		return empDiasLaborados;
	}

	public void setEmpDiasLaborados(int empDiasLaborados) {
		this.empDiasLaborados = empDiasLaborados;
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

	public String getPrCargo() {
		return prCargo;
	}

	public void setPrCargo(String prCargo) {
		this.prCargo = prCargo;
	}

	public String getPrCategoria() {
		return prCategoria;
	}

	public void setPrCategoria(String prCategoria) {
		this.prCategoria = prCategoria;
	}

	public String getPrDesde() {
		return prDesde;
	}

	public void setPrDesde(String prDesde) {
		this.prDesde = prDesde;
	}

	public int getPrDiasDescansoReales() {
		return prDiasDescansoReales;
	}

	public void setPrDiasDescansoReales(int prDiasDescansoReales) {
		this.prDiasDescansoReales = prDiasDescansoReales;
	}

	public int getPrDiasExtrasReales() {
		return prDiasExtrasReales;
	}

	public void setPrDiasExtrasReales(int prDiasExtrasReales) {
		this.prDiasExtrasReales = prDiasExtrasReales;
	}

	public int getPrDiasFaltasReales() {
		return prDiasFaltasReales;
	}

	public void setPrDiasFaltasReales(int prDiasFaltasReales) {
		this.prDiasFaltasReales = prDiasFaltasReales;
	}

	public int getPrDiasLaboradosReales() {
		return prDiasLaboradosReales;
	}

	public void setPrDiasLaboradosReales(int prDiasLaboradosReales) {
		this.prDiasLaboradosReales = prDiasLaboradosReales;
	}

	public int getPrDiasPagadosReales() {
		return prDiasPagadosReales;
	}

	public void setPrDiasPagadosReales(int prDiasPagadosReales) {
		this.prDiasPagadosReales = prDiasPagadosReales;
	}

	public int getPrDiasPermisoMedico() {
		return prDiasPermisoMedico;
	}

	public void setPrDiasPermisoMedico(int prDiasPermisoMedico) {
		this.prDiasPermisoMedico = prDiasPermisoMedico;
	}

	public String getPrFechaUltimoSueldo() {
		return prFechaUltimoSueldo;
	}

	public void setPrFechaUltimoSueldo(String prFechaUltimoSueldo) {
		this.prFechaUltimoSueldo = prFechaUltimoSueldo;
	}

	public String getPrFormaPago() {
		return prFormaPago;
	}

	public void setPrFormaPago(String prFormaPago) {
		this.prFormaPago = prFormaPago;
	}

	public String getPrHasta() {
		return prHasta;
	}

	public void setPrHasta(String prHasta) {
		this.prHasta = prHasta;
	}

	public String getPrId() {
		return prId;
	}

	public void setPrId(String prId) {
		this.prId = prId;
	}

	public String getPrNombres() {
		return prNombres;
	}

	public void setPrNombres(String prNombres) {
		this.prNombres = prNombres;
	}

	public Boolean getPrReversado() {
		return prReversado;
	}

	public void setPrReversado(Boolean prReversado) {
		this.prReversado = prReversado;
	}

	public String getPrSector() {
		return prSector;
	}

	public void setPrSector(String prSector) {
		this.prSector = prSector;
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

	public BigDecimal getRolBonosNd() {
		return rolBonosNd;
	}

	public void setRolBonosNd(BigDecimal rolBonosNd) {
		this.rolBonosNd = rolBonosNd;
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

	public BigDecimal getRolFondoReserva() {
		return rolFondoReserva;
	}

	public void setRolFondoReserva(BigDecimal rolFondoReserva) {
		this.rolFondoReserva = rolFondoReserva;
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
}
