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
public class RhProvisionesTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "emp_codigo")
	private String empCodigo;

	@Column(name = "emp_id")
	private String empId;

	@Column(name = "per_codigo")
	private String perCodigo;

	@Column(name = "per_hasta")
	private String perHasta;

	@Column(name = "prov_aporte_patronal")
	private BigDecimal provAportePatronal;

	@Column(name = "prov_iece")
	private BigDecimal provIece;

	@Column(name = "prov_secap")
	private BigDecimal provSecap;

	@Column(name = "prov_xiii")
	private BigDecimal provXiii;

	@Column(name = "prov_xiv")
	private BigDecimal provXiv;

	@Column(name = "prov_fondo_reserva")
	private BigDecimal provFondoReserva;

	@Column(name = "prov_vacaciones")
	private BigDecimal provVacaciones;

	@Column(name = "prov_desahucio")
	private BigDecimal provDesahucio;

	@Column(name = "prov_sector")
	private String provSector;

	@Column(name = "prov_contable_rol")
	private String provContableRol;

	@Column(name = "prov_contable_provisioon")
	private String provContableProvision;

	@Column(name = "usr_inserta_prestamp")
	private String usrInsertaPrestamo;

	public RhProvisionesTO() {
	}

	public RhProvisionesTO(String empCodigo, String empId, String perCodigo, String perHasta,
			BigDecimal provAportePatronal, BigDecimal provIece, BigDecimal provSecap, BigDecimal provXiii,
			BigDecimal provXiv, BigDecimal provFondoReserva, BigDecimal provVacaciones, BigDecimal provDesahucio,
			String provSector, String provContableRol, String provContableProvision, String usrInsertaPrestamo) {
		this.empCodigo = empCodigo;
		this.empId = empId;
		this.perCodigo = perCodigo;
		this.perHasta = perHasta;
		this.provAportePatronal = provAportePatronal;
		this.provIece = provIece;
		this.provSecap = provSecap;
		this.provXiii = provXiii;
		this.provXiv = provXiv;
		this.provFondoReserva = provFondoReserva;
		this.provVacaciones = provVacaciones;
		this.provDesahucio = provDesahucio;
		this.provSector = provSector;
		this.provContableRol = provContableRol;
		this.provContableProvision = provContableProvision;
		this.usrInsertaPrestamo = usrInsertaPrestamo;
	}

	public String getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getPerCodigo() {
		return perCodigo;
	}

	public void setPerCodigo(String perCodigo) {
		this.perCodigo = perCodigo;
	}

	public String getPerHasta() {
		return perHasta;
	}

	public void setPerHasta(String perHasta) {
		this.perHasta = perHasta;
	}

	public BigDecimal getProvAportePatronal() {
		return provAportePatronal;
	}

	public void setProvAportePatronal(BigDecimal provAportePatronal) {
		this.provAportePatronal = provAportePatronal;
	}

	public String getProvContableProvision() {
		return provContableProvision;
	}

	public void setProvContableProvision(String provContableProvision) {
		this.provContableProvision = provContableProvision;
	}

	public String getProvContableRol() {
		return provContableRol;
	}

	public void setProvContableRol(String provContableRol) {
		this.provContableRol = provContableRol;
	}

	public BigDecimal getProvDesahucio() {
		return provDesahucio;
	}

	public void setProvDesahucio(BigDecimal provDesahucio) {
		this.provDesahucio = provDesahucio;
	}

	public BigDecimal getProvFondoReserva() {
		return provFondoReserva;
	}

	public void setProvFondoReserva(BigDecimal provFondoReserva) {
		this.provFondoReserva = provFondoReserva;
	}

	public BigDecimal getProvIece() {
		return provIece;
	}

	public void setProvIece(BigDecimal provIece) {
		this.provIece = provIece;
	}

	public BigDecimal getProvSecap() {
		return provSecap;
	}

	public void setProvSecap(BigDecimal provSecap) {
		this.provSecap = provSecap;
	}

	public String getProvSector() {
		return provSector;
	}

	public void setProvSector(String provSector) {
		this.provSector = provSector;
	}

	public BigDecimal getProvVacaciones() {
		return provVacaciones;
	}

	public void setProvVacaciones(BigDecimal provVacaciones) {
		this.provVacaciones = provVacaciones;
	}

	public BigDecimal getProvXiii() {
		return provXiii;
	}

	public void setProvXiii(BigDecimal provXiii) {
		this.provXiii = provXiii;
	}

	public BigDecimal getProvXiv() {
		return provXiv;
	}

	public void setProvXiv(BigDecimal provXiv) {
		this.provXiv = provXiv;
	}

	public String getUsrInsertaPrestamo() {
		return usrInsertaPrestamo;
	}

	public void setUsrInsertaPrestamo(String usrInsertaPrestamo) {
		this.usrInsertaPrestamo = usrInsertaPrestamo;
	}

}
