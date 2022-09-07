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
public class InvCompraMotivoTablaTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cm_codigo")
	private String cmCodigo;

	@Column(name = "cm_detalle")
	private String cmDetalle;

	@Column(name = "tip_detalle")
	private String tipNombre;

	public InvCompraMotivoTablaTO() {
	}

	public InvCompraMotivoTablaTO(String cmCodigo, String cmDetalle, String tipNombre) {
		this.cmCodigo = cmCodigo;
		this.cmDetalle = cmDetalle;
		this.tipNombre = tipNombre;
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

	public String getTipNombre() {
		return tipNombre;
	}

	public void setTipNombre(String tipNombre) {
		this.tipNombre = tipNombre;
	}
}
