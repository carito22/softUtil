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
public class InvVentaMotivoTablaTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "vm_codigo")
	private String vmCodigo;

	@Column(name = "vm_detalle")
	private String vmDetalle;

	@Column(name = "tip_detalle")
	private String tipNombre;

	public InvVentaMotivoTablaTO() {
	}

	public InvVentaMotivoTablaTO(String vmCodigo, String vmDetalle, String tipNombre) {
		this.vmCodigo = vmCodigo;
		this.vmDetalle = vmDetalle;
		this.tipNombre = tipNombre;
	}

	public String getTipNombre() {
		return tipNombre;
	}

	public void setTipNombre(String tipNombre) {
		this.tipNombre = tipNombre;
	}

	public String getVmCodigo() {
		return vmCodigo;
	}

	public void setVmCodigo(String vmCodigo) {
		this.vmCodigo = vmCodigo;
	}

	public String getVmDetalle() {
		return vmDetalle;
	}

	public void setVmDetalle(String vmDetalle) {
		this.vmDetalle = vmDetalle;
	}
}
