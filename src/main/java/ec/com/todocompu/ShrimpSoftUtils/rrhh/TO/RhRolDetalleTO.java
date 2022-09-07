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
public class RhRolDetalleTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "emp_id")
	private String empId;

	@Column(name = "emp_apellidos_nombres")
	private String empApellidosNombres;

	@Column(name = "rol_cargo")
	private String rolCargo;

	@Column(name = "rol_fecha_ultimo_sueldo")
	private String rolFechaUltimoSueldo;

	@Column(name = "emp_forma_pago")
	private String empFormaPago;

	@Column(name = "rol_dias_faltas_reales")
	private Integer rolDiasFaltasReales;

	@Column(name = "rol_dias_extra_reales")
	private Integer rolDiasExtrasReales;

	@Column(name = "rol_dias_permiso_medico")
	private Integer rolDiasPermisoMedico;

	@Column(name = "rol_sueldo")
	private BigDecimal rolSueldo;

	@Column(name = "rol_liq_fondo_reserva")
	private BigDecimal rolLiqFondoReserva;

	@Column(name = "rol_liq_xiii")
	private BigDecimal rolLiqXiii;

	@Column(name = "rol_liq_xiv")
	private BigDecimal rolLiqXiv;

	@Column(name = "rol_liq_vacaciones")
	private BigDecimal rolLiqVacaciones;

	@Column(name = "rol_liq_desahucio")
	private BigDecimal rolLiqDesahucio;

	@Column(name = "rol_prestamos")
	private BigDecimal rolPrestamos;

	// consulta
	@Column(name = "pr_retencion")
	private Boolean prRetencion;

	@Column(name = "pr_fondo_reserva")
	private Boolean prFondoReserva;

	@Column(name = "pr_fecha_afiliacion_iess")
	private String prFechaAfiliacionIess;

	@Column(name = "pr_primer_ingreso")
	private String prPrimerIngreso;

	@Column(name = "pr_primera_salida")
	private String prPrimeraSalida;

	@Column(name = "pr_ultimo_ingreso")
	private String prUltimoIngreso;

	@Column(name = "pr_ultima_salida")
	private String prUltimaSalida;

	public RhRolDetalleTO() {
	}

	public RhRolDetalleTO(String empId, String empApellidosNombres, String rolCargo, String rolFechaUltimoSueldo,
			String empFormaPago, Integer rolDiasFaltasReales, Integer rolDiasExtrasReales, Integer rolDiasPermisoMedico,
			BigDecimal rolSueldo, BigDecimal rolLiqFondoReserva, BigDecimal rolLiqXiii, BigDecimal rolLiqXiv,
			BigDecimal rolLiqVacaciones, BigDecimal rolLiqDesahucio, BigDecimal rolPrestamos) {
		this.empId = empId;
		this.empApellidosNombres = empApellidosNombres;
		this.rolCargo = rolCargo;
		this.rolFechaUltimoSueldo = rolFechaUltimoSueldo;
		this.empFormaPago = empFormaPago;
		this.rolDiasFaltasReales = rolDiasFaltasReales;
		this.rolDiasExtrasReales = rolDiasExtrasReales;
		this.rolDiasPermisoMedico = rolDiasPermisoMedico;
		this.rolSueldo = rolSueldo;
		this.rolLiqFondoReserva = rolLiqFondoReserva;
		this.rolLiqXiii = rolLiqXiii;
		this.rolLiqXiv = rolLiqXiv;
		this.rolLiqVacaciones = rolLiqVacaciones;
		this.rolLiqDesahucio = rolLiqDesahucio;
		this.rolPrestamos = rolPrestamos;
	}

	public String getEmpApellidosNombres() {
		return empApellidosNombres;
	}

	public void setEmpApellidosNombres(String empApellidosNombres) {
		this.empApellidosNombres = empApellidosNombres;
	}

	public String getEmpFormaPago() {
		return empFormaPago;
	}

	public void setEmpFormaPago(String empFormaPago) {
		this.empFormaPago = empFormaPago;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getRolCargo() {
		return rolCargo;
	}

	public void setRolCargo(String rolCargo) {
		this.rolCargo = rolCargo;
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

	public BigDecimal getRolLiqDesahucio() {
		return rolLiqDesahucio;
	}

	public void setRolLiqDesahucio(BigDecimal rolLiqDesahucio) {
		this.rolLiqDesahucio = rolLiqDesahucio;
	}

	public BigDecimal getRolLiqFondoReserva() {
		return rolLiqFondoReserva;
	}

	public void setRolLiqFondoReserva(BigDecimal rolLiqFondoReserva) {
		this.rolLiqFondoReserva = rolLiqFondoReserva;
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

	public BigDecimal getRolPrestamos() {
		return rolPrestamos;
	}

	public void setRolPrestamos(BigDecimal rolPrestamos) {
		this.rolPrestamos = rolPrestamos;
	}

	public BigDecimal getRolSueldo() {
		return rolSueldo;
	}

	public void setRolSueldo(BigDecimal rolSueldo) {
		this.rolSueldo = rolSueldo;
	}

	public String getPrFechaAfiliacionIess() {
		return prFechaAfiliacionIess;
	}

	public void setPrFechaAfiliacionIess(String prFechaAfiliacionIess) {
		this.prFechaAfiliacionIess = prFechaAfiliacionIess;
	}

	public Boolean getPrFondoReserva() {
		return prFondoReserva;
	}

	public void setPrFondoReserva(Boolean prFondoReserva) {
		this.prFondoReserva = prFondoReserva;
	}

	public String getPrPrimerIngreso() {
		return prPrimerIngreso;
	}

	public void setPrPrimerIngreso(String prPrimerIngreso) {
		this.prPrimerIngreso = prPrimerIngreso;
	}

	public String getPrPrimeraSalida() {
		return prPrimeraSalida;
	}

	public void setPrPrimeraSalida(String prPrimeraSalida) {
		this.prPrimeraSalida = prPrimeraSalida;
	}

	public Boolean getPrRetencion() {
		return prRetencion;
	}

	public void setPrRetencion(Boolean prRetencion) {
		this.prRetencion = prRetencion;
	}

	public String getPrUltimaSalida() {
		return prUltimaSalida;
	}

	public void setPrUltimaSalida(String prUltimaSalida) {
		this.prUltimaSalida = prUltimaSalida;
	}

	public String getPrUltimoIngreso() {
		return prUltimoIngreso;
	}

	public void setPrUltimoIngreso(String prUltimoIngreso) {
		this.prUltimoIngreso = prUltimoIngreso;
	}

}
