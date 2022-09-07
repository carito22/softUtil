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
public class RhFunPlantillaSueldosLoteTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "emp_categoria")
	private String prCategoria;

	@Column(name = "emp_id")
	private String prId;// presentar

	@Column(name = "emp_nombres")
	private String prNombres;// presentar

	@Column(name = "emp_cargo")
	private String prCargo;// presentar

	@Column(name = "sec_codigo")
	private String prSector;

	@Column(name = "rol_desde")
	private String prDesde;

	@Column(name = "rol_hasta")
	private String prHasta;

	@Column(name = "rol_fecha_ultimo_sueldo")
	private String rolFechaUltimoSueldo;

	@Column(name = "rol_dias_laborados_reales")
	private int rolDiasLaboradosReales;// Calcular

	@Column(name = "rol_dias_faltas_reales")
	private int rolDiasFaltasReales;// Ingresar

	@Column(name = "rol_dias_extras_reales")
	private int rolDiasExtrasReales;// Ingresar

	@Column(name = "rol_dias_descanso_reales")
	private int rolDiasDescansoReales;// Calcular

	@Column(name = "rol_dias_pagados_reales")
	private int rolDiasPagadosReales;// Calcular

	@Column(name = "rol_dias_permiso_medico")
	private int rolDiasPermisoMedico;// Ingresar

	@Column(name = "rol_saldo_anterior")
	private java.math.BigDecimal rolSaldoAnterior;// presentar Ingresos

	@Column(name = "rol_ingresos")
	private java.math.BigDecimal rolIngresos;// presentar Ingresos

	@Column(name = "rol_bonos")
	private java.math.BigDecimal rolBonos;// presentar Ingresos

	@Column(name = "rol_bonosnd")
	private java.math.BigDecimal rolBonosnd;// presentar Ingresos

	@Column(name = "rol_bono_fijo")
	private java.math.BigDecimal rolBonoFijo;// presentar Ingresos

	@Column(name = "rol_bono_fijo_nd")
	private java.math.BigDecimal rolBonoFijoNd;// presentar Ingresos

	@Column(name = "rol_otros_ingresos")
	private java.math.BigDecimal rolOtrosIngresos;// presentar Ingresos

	@Column(name = "rol_otros_ingresos_nd")
	private java.math.BigDecimal rolOtrosIngresosNd;// presentar Ingresos

	private java.math.BigDecimal rolViaticos;// presentar Ingresos

	@Column(name = "rol_liq_fondo_reserva")
	private java.math.BigDecimal rolLiqFondoReserva;

	@Column(name = "rol_liq_xiii")
	private java.math.BigDecimal rolLiqXiii;

	@Column(name = "rol_liq_xiv")
	private java.math.BigDecimal rolLiqXiv;

	@Column(name = "rol_liq_vacaciones")
	private java.math.BigDecimal rolLiqVacaciones;

	@Column(name = "rol_salario_digno")
	private java.math.BigDecimal rolLiqSalarioDigno;

	@Column(name = "rol_liq_desahucio")
	private java.math.BigDecimal rolLiqDesahucio;

	@Column(name = "rol_desahucio_intempestivos")
	private java.math.BigDecimal rolLiqDesahucioIntempestivo;

	@Column(name = "rol_anticipos")
	private java.math.BigDecimal rolAnticipos;// presentar Descuentos

	@Column(name = "rol_prestamos")
	private java.math.BigDecimal rolPrestamos;// presentar Descuentos

	@Column(name = "rol_iess")
	private java.math.BigDecimal rolIess;// presentar Descuentos

	@Column(name = "rol_retencion_fuente")
	private java.math.BigDecimal rolRetencionFuente;// presentar Descuentos

	@Column(name = "rol_descuento_permiso_medico")
	private java.math.BigDecimal rolDescuentoPermisoMedico;// presentar
															// Descuentos

	@Column(name = "rol_total")
	private java.math.BigDecimal rolTotal;

	@Column(name = "rol_aporte_patronal")
	private java.math.BigDecimal rolAportePatronal;

	@Column(name = "rol_iece")
	private java.math.BigDecimal rolIece;

	@Column(name = "rol_secap")
	private java.math.BigDecimal rolSecap;

	@Column(name = "rol_xiii")
	private java.math.BigDecimal rolXiii;

	@Column(name = "rol_xiv")
	private java.math.BigDecimal rolXiv;

	@Column(name = "rol_fondo_reserva")
	private java.math.BigDecimal rolFondoReserva;// presentar Ingres/Descuentos
													// valor bool
	@Column(name = "rol_vacaciones")
	private java.math.BigDecimal rolVacaciones;

	@Column(name = "rol_desahucio")
	private java.math.BigDecimal rolDesahucio;

	@Column(name = "rol_reversado")
	private boolean rolReversado;

	@Column(name = "emp_sueldo_iess")
	private java.math.BigDecimal empSueldo;

	@Column(name = "emp_bono_fijo")
	private java.math.BigDecimal empBonoFijo;

	@Column(name = "emp_bono_fijo_nd")
	private java.math.BigDecimal empBonoFijoNd;

	@Column(name = "emp_otros_ingresos")
	private java.math.BigDecimal empOtrosIngresos;

	@Column(name = "emp_otros_ingresos_nd")
	private java.math.BigDecimal empOtrosIngresosNd;

	@Column(name = "emp_dias_laborados")
	private int empDiasLaborados;

	@Column(name = "emp_dias_descanso")
	private int empDiasDescanso;

	@Column(name = "emp_cancelar_xiii_sueldo_mensualmente")
	private boolean empCancelarXiiiSueldoMensualmente;

	@Column(name = "emp_cancelar_xiv_sueldo_mensualmente")
	private boolean empCancelarXivSueldoMensualmente;

	@Column(name = "emp_cancelar_fondo_reserva_mensualmente")
	private boolean empCancelarFondoReservaMensualmente;

	@Column(name = "rol_forma_pago")
	private String rolFormaPago;

	private RhRolesLoteValoresTO rhRolesLoteValoresTO;

	public RhFunPlantillaSueldosLoteTO() {
	}

	public RhFunPlantillaSueldosLoteTO(String prCategoria, String prId, String prNombres, String prCargo,
			String prSector, String prDesde, String prHasta, String rolFechaUltimoSueldo, int rolDiasLaboradosReales,
			int rolDiasFaltasReales, int rolDiasExtrasReales, int rolDiasDescansoReales, int rolDiasPagadosReales,
			int rolDiasPermisoMedico, BigDecimal rolSaldoAnterior, BigDecimal rolIngresos, BigDecimal rolBonos,
			BigDecimal rolBonosnd, BigDecimal rolBonoFijo, BigDecimal rolBonoFijoNd, BigDecimal rolOtrosIngresos,
			BigDecimal rolOtrosIngresosNd, BigDecimal rolViaticos, BigDecimal rolLiqFondoReserva, BigDecimal rolLiqXiii,
			BigDecimal rolLiqXiv, BigDecimal rolLiqVacaciones, BigDecimal rolLiqSalarioDigno,
			BigDecimal rolLiqDesahucio, BigDecimal rolLiqDesahucioIntempestivo, BigDecimal rolAnticipos,
			BigDecimal rolPrestamos, BigDecimal rolIess, BigDecimal rolRetencionFuente,
			BigDecimal rolDescuentoPermisoMedico, BigDecimal rolTotal, BigDecimal rolAportePatronal, BigDecimal rolIece,
			BigDecimal rolSecap, BigDecimal rolXiii, BigDecimal rolXiv, BigDecimal rolFondoReserva,
			BigDecimal rolVacaciones, BigDecimal rolDesahucio, boolean rolReversado, BigDecimal empSueldo,
			BigDecimal empBonoFijo, BigDecimal empBonoFijoNd, BigDecimal empOtrosIngresos,
			BigDecimal empOtrosIngresosNd, int empDiasLaborados, int empDiasDescanso,
			boolean empCancelarXiiiSueldoMensualmente, boolean empCancelarXivSueldoMensualmente,
			boolean empCancelarFondoReservaMensualmente, String rolFormaPago, RhRolesLoteValoresTO rhRolesLoteValoresTO,
			Integer id) {
		this.prCategoria = prCategoria;
		this.prId = prId;
		this.prNombres = prNombres;
		this.prCargo = prCargo;
		this.prSector = prSector;
		this.prDesde = prDesde;
		this.prHasta = prHasta;
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
		this.rolViaticos = rolViaticos;
		this.rolLiqFondoReserva = rolLiqFondoReserva;
		this.rolLiqXiii = rolLiqXiii;
		this.rolLiqXiv = rolLiqXiv;
		this.rolLiqVacaciones = rolLiqVacaciones;
		this.rolLiqSalarioDigno = rolLiqSalarioDigno;
		this.rolLiqDesahucio = rolLiqDesahucio;
		this.rolLiqDesahucioIntempestivo = rolLiqDesahucioIntempestivo;
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
		this.rolReversado = rolReversado;
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
		this.rolFormaPago = rolFormaPago;
		this.rhRolesLoteValoresTO = rhRolesLoteValoresTO;
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

	public boolean isEmpCancelarFondoReservaMensualmente() {
		return empCancelarFondoReservaMensualmente;
	}

	public void setEmpCancelarFondoReservaMensualmente(boolean empCancelarFondoReservaMensualmente) {
		this.empCancelarFondoReservaMensualmente = empCancelarFondoReservaMensualmente;
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

	public int getRolDiasDescansoReales() {
		return rolDiasDescansoReales;
	}

	public void setRolDiasDescansoReales(int rolDiasDescansoReales) {
		this.rolDiasDescansoReales = rolDiasDescansoReales;
	}

	public int getRolDiasExtrasReales() {
		return rolDiasExtrasReales;
	}

	public void setRolDiasExtrasReales(int rolDiasExtrasReales) {
		this.rolDiasExtrasReales = rolDiasExtrasReales;
	}

	public int getRolDiasFaltasReales() {
		return rolDiasFaltasReales;
	}

	public void setRolDiasFaltasReales(int rolDiasFaltasReales) {
		this.rolDiasFaltasReales = rolDiasFaltasReales;
	}

	public int getRolDiasLaboradosReales() {
		return rolDiasLaboradosReales;
	}

	public void setRolDiasLaboradosReales(int rolDiasLaboradosReales) {
		this.rolDiasLaboradosReales = rolDiasLaboradosReales;
	}

	public int getRolDiasPagadosReales() {
		return rolDiasPagadosReales;
	}

	public void setRolDiasPagadosReales(int rolDiasPagadosReales) {
		this.rolDiasPagadosReales = rolDiasPagadosReales;
	}

	public int getRolDiasPermisoMedico() {
		return rolDiasPermisoMedico;
	}

	public void setRolDiasPermisoMedico(int rolDiasPermisoMedico) {
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

	public boolean isRolReversado() {
		return rolReversado;
	}

	public void setRolReversado(boolean rolReversado) {
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

	public BigDecimal getRolViaticos() {
		return rolViaticos;
	}

	public void setRolViaticos(BigDecimal rolViaticos) {
		this.rolViaticos = rolViaticos;
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

	public RhRolesLoteValoresTO getRhRolesLoteValoresTO() {
		return rhRolesLoteValoresTO;
	}

	public void setRhRolesLoteValoresTO(RhRolesLoteValoresTO rhRolesLoteValoresTO) {
		this.rhRolesLoteValoresTO = rhRolesLoteValoresTO;
	}
}
