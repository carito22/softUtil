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
 * @author Andres Guachisaca
 */
@Entity
public class InvCompraMotivoComboTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cm_codigo")
	private String cmCodigo;

	@Column(name = "cm_detalle")
	private String cmDetalle;

	@Column(name = "tip_codigo")
	private String cmTipo;

	@Column(name = "cm_forma_contabilizar")
	private String cmFormaContabilizar;

	@Column(name = "cm_forma_imprimir")
	private String cmFormaImprimir;

	public InvCompraMotivoComboTO() {
	}

	public InvCompraMotivoComboTO(String cmCodigo, String cmDetalle, String cmTipo, String cmFormaContabilizar,
			String cmFormaImprimir) {
		this.cmCodigo = cmCodigo;
		this.cmDetalle = cmDetalle;
		this.cmTipo = cmTipo;
		this.cmFormaContabilizar = cmFormaContabilizar;
		this.cmFormaImprimir = cmFormaImprimir;
	}

	public String getCmFormaContabilizar() {
		return cmFormaContabilizar;
	}

	public void setCmFormaContabilizar(String cmFormaContabilizar) {
		this.cmFormaContabilizar = cmFormaContabilizar;
	}

	public String getCmFormaImprimir() {
		return cmFormaImprimir;
	}

	public void setCmFormaImprimir(String cmFormaImprimir) {
		this.cmFormaImprimir = cmFormaImprimir;
	}

	public String getCmCodigo() {
		return cmCodigo;
	}

	public void setCmCodigo(String cmCodigo) {
		this.cmCodigo = cmCodigo;
	}

	public String getCmDetalle() {
		return cmDetalle;
	}

	public void setCmDetalle(String cmDetalle) {
		this.cmDetalle = cmDetalle;
	}

	public String getCmTipo() {
		return cmTipo;
	}

	public void setCmTipo(String cmTipo) {
		this.cmTipo = cmTipo;
	}

	@Override
	public String toString() {
		return this.cmDetalle;
	}
}
