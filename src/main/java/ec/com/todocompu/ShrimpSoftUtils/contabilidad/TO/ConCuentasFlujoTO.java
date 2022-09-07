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
public class ConCuentasFlujoTO implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "flu_empresa")
	private String fluCodigo;
	@Id
	@Column(name = "flu_codigo")
	private String cuentaCodigo;
	@Column(name = "flu_detalle")
	private String cuentaDetalle;
	@Column(name = "flu_activo")
	private Boolean cuentaActivo;
	@Column(name = "usr_codigo")
	private String usrInsertaCuenta;
	@Column(name = "usr_fecha_inserta")
	private String usrFechaInsertaCuenta;

	public ConCuentasFlujoTO() {
	}

	public ConCuentasFlujoTO(String fluCodigo, String cuentaCodigo, String cuentaDetalle, Boolean cuentaActivo,
			String usrInsertaCuenta, String usrFechaInsertaCuenta) {
		this.fluCodigo = fluCodigo;
		this.cuentaCodigo = cuentaCodigo;
		this.cuentaDetalle = cuentaDetalle;
		this.cuentaActivo = cuentaActivo;
		this.usrInsertaCuenta = usrInsertaCuenta;
		this.usrFechaInsertaCuenta = usrFechaInsertaCuenta;
	}

	public String getFluCodigo() {
		return fluCodigo;
	}

	public void setFluCodigo(String fluCodigo) {
		this.fluCodigo = fluCodigo;
	}

	public String getCuentaCodigo() {
		return cuentaCodigo;
	}

	public void setCuentaCodigo(String cuentaCodigo) {
		this.cuentaCodigo = cuentaCodigo;
	}

	public String getCuentaDetalle() {
		return cuentaDetalle;
	}

	public void setCuentaDetalle(String cuentaDetalle) {
		this.cuentaDetalle = cuentaDetalle;
	}

	public Boolean getCuentaActivo() {
		return cuentaActivo;
	}

	public void setCuentaActivo(Boolean cuentaActivo) {
		this.cuentaActivo = cuentaActivo;
	}

	public String getUsrInsertaCuenta() {
		return usrInsertaCuenta;
	}

	public void setUsrInsertaCuenta(String usrInsertaCuenta) {
		this.usrInsertaCuenta = usrInsertaCuenta;
	}

	public String getUsrFechaInsertaCuenta() {
		return usrFechaInsertaCuenta;
	}

	public void setUsrFechaInsertaCuenta(String usrFechaInsertaCuenta) {
		this.usrFechaInsertaCuenta = usrFechaInsertaCuenta;
	}

	@Override
	public String toString() {
		return this.fluCodigo;
	}
}
