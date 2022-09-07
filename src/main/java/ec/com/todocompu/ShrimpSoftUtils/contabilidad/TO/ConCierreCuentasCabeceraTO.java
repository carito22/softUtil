/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class ConCierreCuentasCabeceraTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "emp_codigo")
	private String empCodigo;
	@Column(name = "con_cuenta_contable")
	private String conCuentaContable;
	@Column(name = "con_tipo_contable")
	private String conTipoContable;
	@Column(name = "con_concepto")
	private String conConcepto;
	@Column(name = "con_fecha")
	private String conFecha;
	@Column(name = "usr_inserta_contable")
	private String usrInsertaContable;
	@Column(name = "usr_fecha_inserta_contable")
	private String usrFechaInsertaContable;

	public ConCierreCuentasCabeceraTO() {
	}

	public ConCierreCuentasCabeceraTO(String empCodigo, String conCuentaContable, String conTipoContable,
			String conConcepto, String conFecha, String usrInsertaContable, String usrFechaInsertaContable) {
		this.empCodigo = empCodigo;
		this.conCuentaContable = conCuentaContable;
		this.conTipoContable = conTipoContable;
		this.conConcepto = conConcepto;
		this.conFecha = conFecha;
		this.usrInsertaContable = usrInsertaContable;
		this.usrFechaInsertaContable = usrFechaInsertaContable;
	}

	public String getConFecha() {
		return conFecha;
	}

	public void setConFecha(String conFecha) {
		this.conFecha = conFecha;
	}

	public String getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	public String getConCuentaContable() {
		return conCuentaContable;
	}

	public void setConCuentaContable(String conCuentaContable) {
		this.conCuentaContable = conCuentaContable;
	}

	public String getConTipoContable() {
		return conTipoContable;
	}

	public void setConTipoContable(String conTipoContable) {
		this.conTipoContable = conTipoContable;
	}

	public String getConConcepto() {
		return conConcepto;
	}

	public void setConConcepto(String conConcepto) {
		this.conConcepto = conConcepto;
	}

	public String getUsrInsertaContable() {
		return usrInsertaContable;
	}

	public void setUsrInsertaContable(String usrInsertaContable) {
		this.usrInsertaContable = usrInsertaContable;
	}

	public String getUsrFechaInsertaContable() {
		return usrFechaInsertaContable;
	}

	public void setUsrFechaInsertaContable(String usrFechaInsertaContable) {
		this.usrFechaInsertaContable = usrFechaInsertaContable;
	}

}
