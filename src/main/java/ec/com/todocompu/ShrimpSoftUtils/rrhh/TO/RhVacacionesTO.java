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
public class RhVacacionesTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "emp_empresa")
	private String empEmpresa;

	@Column(name = "emp_id")
	private String empId;

	@Column(name = "emp_apellidos_nombres")
	private String empApellidosNombres;///////////////////////

	@Column(name = "sec_codigo")
	private String secCodigo;

	@Column(name = "vac_desde")
	private String vacDesde;

	@Column(name = "vac_hasta")
	private String vacHasta;

	@Column(name = "vac_gozadas")
	private Boolean vacGozadas;

	@Column(name = "vac_gozadas_desde")
	private String vacGozadasDesde;

	@Column(name = "vac_gozadas_hasta")
	private String vacGozadasHasta;

	@Column(name = "vac_valor")
	private BigDecimal vacValor;

	@Column(name = "vac_forma_pago")
	private String vacFormaPago;

	@Column(name = "con_fecha")
	private String conFecha;

	@Column(name = "con_det_documento")
	private String conDetDocumento;

	@Column(name = "vac_Observaciones")
	private String conObservaciones;

	@Column(name = "con_periodo")
	private String conPeriodo;

	@Column(name = "con_tipo")
	private String conTipo;

	@Column(name = "con_numero")
	private String conNumero;

	@Column(name = "vac_auxiliar")
	private Boolean reversar;

	@Column(name = "usr_codigo")
	private String usrCodigo;

	@Column(name = "vac_secuencial")
	private Integer vacSecuencial;

	public RhVacacionesTO() {
	}

	public RhVacacionesTO(String empEmpresa, String empId, String empApellidosNombres, String secCodigo,
			String vacDesde, String vacHasta, Boolean vacGozadas, String vacGozadasDesde, String vacGozadasHasta,
			BigDecimal vacValor, String vacFormaPago, String conFecha, String conDetDocumento, String conObservaciones,
			String conPeriodo, String conTipo, String conNumero, Boolean reversar, String usrCodigo,
			Integer vacSecuencial) {
		this.empEmpresa = empEmpresa;
		this.empId = empId;
		this.empApellidosNombres = empApellidosNombres;
		this.secCodigo = secCodigo;
		this.vacDesde = vacDesde;
		this.vacHasta = vacHasta;
		this.vacGozadas = vacGozadas;
		this.vacGozadasDesde = vacGozadasDesde;
		this.vacGozadasHasta = vacGozadasHasta;
		this.vacValor = vacValor;
		this.vacFormaPago = vacFormaPago;
		this.conFecha = conFecha;
		this.conDetDocumento = conDetDocumento;
		this.conObservaciones = conObservaciones;
		this.conPeriodo = conPeriodo;
		this.conTipo = conTipo;
		this.conNumero = conNumero;
		this.reversar = reversar;
		this.usrCodigo = usrCodigo;
		this.vacSecuencial = vacSecuencial;
	}

	public String getConDetDocumento() {
		return conDetDocumento;
	}

	public void setConDetDocumento(String conDetDocumento) {
		this.conDetDocumento = conDetDocumento;
	}

	public String getConFecha() {
		return conFecha;
	}

	public void setConFecha(String conFecha) {
		this.conFecha = conFecha;
	}

	public String getConNumero() {
		return conNumero;
	}

	public void setConNumero(String conNumero) {
		this.conNumero = conNumero;
	}

	public String getConObservaciones() {
		return conObservaciones;
	}

	public void setConObservaciones(String conObservaciones) {
		this.conObservaciones = conObservaciones;
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

	public String getEmpApellidosNombres() {
		return empApellidosNombres;
	}

	public void setEmpApellidosNombres(String empApellidosNombres) {
		this.empApellidosNombres = empApellidosNombres;
	}

	public String getEmpEmpresa() {
		return empEmpresa;
	}

	public void setEmpEmpresa(String empEmpresa) {
		this.empEmpresa = empEmpresa;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	public String getUsrCodigo() {
		return usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public String getVacDesde() {
		return vacDesde;
	}

	public void setVacDesde(String vacDesde) {
		this.vacDesde = vacDesde;
	}

	public String getVacFormaPago() {
		return vacFormaPago;
	}

	public void setVacFormaPago(String vacFormaPago) {
		this.vacFormaPago = vacFormaPago;
	}

	public String getVacHasta() {
		return vacHasta;
	}

	public void setVacHasta(String vacHasta) {
		this.vacHasta = vacHasta;
	}

	public Integer getVacSecuencial() {
		return vacSecuencial;
	}

	public void setVacSecuencial(Integer vacSecuencial) {
		this.vacSecuencial = vacSecuencial;
	}

	public BigDecimal getVacValor() {
		return vacValor;
	}

	public void setVacValor(BigDecimal vacValor) {
		this.vacValor = vacValor;
	}

	public Boolean getReversar() {
		return reversar;
	}

	public void setReversar(Boolean reversar) {
		this.reversar = reversar;
	}

	public Boolean getVacGozadas() {
		return vacGozadas;
	}

	public void setVacGozadas(Boolean vacGozadas) {
		this.vacGozadas = vacGozadas;
	}

	public String getVacGozadasDesde() {
		return vacGozadasDesde;
	}

	public void setVacGozadasDesde(String vacGozadasDesde) {
		this.vacGozadasDesde = vacGozadasDesde;
	}

	public String getVacGozadasHasta() {
		return vacGozadasHasta;
	}

	public void setVacGozadasHasta(String vacGozadasHasta) {
		this.vacGozadasHasta = vacGozadasHasta;
	}

}