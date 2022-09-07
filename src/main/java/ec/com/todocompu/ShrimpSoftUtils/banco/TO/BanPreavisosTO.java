/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.banco.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class BanPreavisosTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "pre_empresa")
	private String preEmpresa;

	@Column(name = "pre_cuenta_contable")
	private String preCuentaContable;

	@Column(name = "pre_nombre_archivo_generado")
	private String preNombreArchivoGenerado;

	@Column(name = "pre_fecha_revision_ultimo_cheque")
	private String preFechaRevisionUltimoCheque;

	@Column(name = "usr_empresa")
	private String usrEmpresa;

	@Column(name = "usr_codigo")
	private String usrCodigo;

	@Column(name = "usr_fecha_inserta")
	private String usrFechaInserta;

	public BanPreavisosTO() {
	}

	public BanPreavisosTO(String preEmpresa, String preCuentaContable, String preNombreArchivoGenerado,
			String preFechaRevisionUltimoCheque, String usrEmpresa, String usrCodigo, String usrFechaInserta) {
		this.preEmpresa = preEmpresa;
		this.preCuentaContable = preCuentaContable;
		this.preNombreArchivoGenerado = preNombreArchivoGenerado;
		this.preFechaRevisionUltimoCheque = preFechaRevisionUltimoCheque;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public String getPreCuentaContable() {
		return preCuentaContable;
	}

	public void setPreCuentaContable(String preCuentaContable) {
		this.preCuentaContable = preCuentaContable;
	}

	public String getPreEmpresa() {
		return preEmpresa;
	}

	public void setPreEmpresa(String preEmpresa) {
		this.preEmpresa = preEmpresa;
	}

	public String getPreFechaRevisionUltimoCheque() {
		return preFechaRevisionUltimoCheque;
	}

	public void setPreFechaRevisionUltimoCheque(String preFechaRevisionUltimoCheque) {
		this.preFechaRevisionUltimoCheque = preFechaRevisionUltimoCheque;
	}

	public String getPreNombreArchivoGenerado() {
		return preNombreArchivoGenerado;
	}

	public void setPreNombreArchivoGenerado(String preNombreArchivoGenerado) {
		this.preNombreArchivoGenerado = preNombreArchivoGenerado;
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
