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
public class InvVentaMotivoComboTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "vm_codigo")
	private String vmCodigo;

	@Column(name = "vm_detalle")
	private String vmDetalle;

	@Column(name = "tip_codigo")
	private String vmTipo;

	@Column(name = "vm_forma_contabilizar")
	private String vmFormaContabilizar;

	@Column(name = "vm_forma_imprimir")
	private String vmFormaImprimir;

	public InvVentaMotivoComboTO() {
	}

	public InvVentaMotivoComboTO(String vmCodigo, String vmDetalle, String vmTipo, String vmFormaContabilizar,
			String vmFormaImprimir) {
		this.vmCodigo = vmCodigo;
		this.vmDetalle = vmDetalle;
		this.vmTipo = vmTipo;
		this.vmFormaContabilizar = vmFormaContabilizar;
		this.vmFormaImprimir = vmFormaImprimir;
	}

	public String getVmFormaContabilizar() {
		return vmFormaContabilizar;
	}

	public void setVmFormaContabilizar(String vmFormaContabilizar) {
		this.vmFormaContabilizar = vmFormaContabilizar;
	}

	public String getVmFormaImprimir() {
		return vmFormaImprimir;
	}

	public void setVmFormaImprimir(String vmFormaImprimir) {
		this.vmFormaImprimir = vmFormaImprimir;
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

	public String getVmTipo() {
		return vmTipo;
	}

	public void setVmTipo(String vmTipo) {
		this.vmTipo = vmTipo;
	}

	@Override
	public String toString() {
		return this.vmDetalle;
	}
}
