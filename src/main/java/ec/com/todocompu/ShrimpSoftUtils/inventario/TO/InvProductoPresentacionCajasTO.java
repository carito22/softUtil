/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author developer2
 */
@Entity
public class InvProductoPresentacionCajasTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "presu_empresa")
	String prescEmpresa;

	@Column(name = "presu_codigo")
	String prescCodigo;

	@Column(name = "presu_detalle")
	String prescDetalle;

	@Column(name = "presu_abreviado")
	String prescAbreviado;

	@Column(name = "usr_empresa")
	String usrEmpresa;

	@Column(name = "usr_codigo")
	String usrCodigo;

	@Column(name = "usr_fecha_inserta")
	String usrFechaInserta;

	public InvProductoPresentacionCajasTO() {
	}

	public InvProductoPresentacionCajasTO(String prescEmpresa, String prescCodigo, String prescDetalle,
			String prescAbreviado, String usrEmpresa, String usrCodigo, String usrFechaInserta) {
		this.prescEmpresa = prescEmpresa;
		this.prescCodigo = prescCodigo;
		this.prescDetalle = prescDetalle;
		this.prescAbreviado = prescAbreviado;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public String getPrescAbreviado() {
		return prescAbreviado;
	}

	public void setPrescAbreviado(String prescAbreviado) {
		this.prescAbreviado = prescAbreviado;
	}

	public String getPrescCodigo() {
		return prescCodigo;
	}

	public void setPrescCodigo(String prescCodigo) {
		this.prescCodigo = prescCodigo;
	}

	public String getPrescDetalle() {
		return prescDetalle;
	}

	public void setPrescDetalle(String prescDetalle) {
		this.prescDetalle = prescDetalle;
	}

	public String getPrescEmpresa() {
		return prescEmpresa;
	}

	public void setPrescEmpresa(String prescEmpresa) {
		this.prescEmpresa = prescEmpresa;
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
