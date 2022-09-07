/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class CarPagosCobrosFormaTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "fp_secuencial")
	private Integer fpSecuencial;

	@Column(name = "fp_detalle")
	private String fpDetalle;

	@Column(name = "fp_inactivo")
	private Boolean fpInactivo;
	// private String secEmpresa;

	@Column(name = "sec_codigo")
	private String secCodigo;
	// private String ctaEmpresa;

	@Column(name = "cta_codigo")
	private String ctaCodigo;

	@Column(name = "usr_empresa")
	private String usrEmpresa;

	@Column(name = "usr_codigo")
	private String usrCodigo;

	@Column(name = "usr_fecha_inserta")
	private String usrFechaInserta;

	public CarPagosCobrosFormaTO() {
	}

	public CarPagosCobrosFormaTO(Integer fpSecuencial, String fpDetalle, Boolean fpInactivo, String secCodigo,
			String ctaCodigo, String usrEmpresa, String usrCodigo, String usrFechaInserta) {
		this.fpSecuencial = fpSecuencial;
		this.fpDetalle = fpDetalle;
		this.fpInactivo = fpInactivo;
		this.secCodigo = secCodigo;
		this.ctaCodigo = ctaCodigo;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public String getCtaCodigo() {
		return ctaCodigo;
	}

	public void setCtaCodigo(String ctaCodigo) {
		this.ctaCodigo = ctaCodigo;
	}

	public String getFpDetalle() {
		return fpDetalle;
	}

	public void setFpDetalle(String fpDetalle) {
		this.fpDetalle = fpDetalle;
	}

	public Boolean getFpInactivo() {
		return fpInactivo;
	}

	public void setFpInactivo(Boolean fpInactivo) {
		this.fpInactivo = fpInactivo;
	}

	public Integer getFpSecuencial() {
		return fpSecuencial;
	}

	public void setFpSecuencial(Integer fpSecuencial) {
		this.fpSecuencial = fpSecuencial;
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

	public String getUsrEmpresa() {
		return usrEmpresa;
	}

	public void setUsrEmpresa(String usrEmpresa) {
		this.usrEmpresa = usrEmpresa;
	}

	public String getUsrFechaInserta() {
		return usrFechaInserta;
	}

	public void setUsrFechaInserta(String usrFechaInserta) {
		this.usrFechaInserta = usrFechaInserta;
	}
}
