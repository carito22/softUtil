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
public class InvProductoPresentacionUnidadesTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "presu_empresa")
	String presuEmpresa;

	@Column(name = "presu_codigo")
	String presuCodigo;

	@Column(name = "presu_detalle")
	String presuDetalle;

	@Column(name = "presu_abreviado")
	String presuAbreviado;

	@Column(name = "usr_empresa")
	String usrEmpresa;

	@Column(name = "usr_codigo")
	String usrCodigo;

	@Column(name = "usr_fecha_inserta")
	String usrFechaInserta;

	public InvProductoPresentacionUnidadesTO() {
	}

	public InvProductoPresentacionUnidadesTO(String presuEmpresa, String presuCodigo, String presuDetalle,
			String presuAbreviado, String usrEmpresa, String usrCodigo, String usrFechaInserta) {
		this.presuEmpresa = presuEmpresa;
		this.presuCodigo = presuCodigo;
		this.presuDetalle = presuDetalle;
		this.presuAbreviado = presuAbreviado;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public String getPresuAbreviado() {
		return presuAbreviado;
	}

	public void setPresuAbreviado(String presuAbreviado) {
		this.presuAbreviado = presuAbreviado;
	}

	public String getPresuCodigo() {
		return presuCodigo;
	}

	public void setPresuCodigo(String presuCodigo) {
		this.presuCodigo = presuCodigo;
	}

	public String getPresuDetalle() {
		return presuDetalle;
	}

	public void setPresuDetalle(String presuDetalle) {
		this.presuDetalle = presuDetalle;
	}

	public String getPresuEmpresa() {
		return presuEmpresa;
	}

	public void setPresuEmpresa(String presuEmpresa) {
		this.presuEmpresa = presuEmpresa;
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
