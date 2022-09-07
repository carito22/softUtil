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
public class InvProformaMotivoComboTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "pm_codigo")
	private String pmCodigo;

	@Column(name = "pm_detalle")
	private String pmDetalle;

	public InvProformaMotivoComboTO() {
	}

	public InvProformaMotivoComboTO(String pmCodigo, String pmDetalle) {
		this.pmCodigo = pmCodigo;
		this.pmDetalle = pmDetalle;
	}

	public String getPmCodigo() {
		return pmCodigo;
	}

	public void setPmCodigo(String pmCodigo) {
		this.pmCodigo = pmCodigo;
	}

	public String getPmDetalle() {
		return pmDetalle;
	}

	public void setPmDetalle(String pmDetalle) {
		this.pmDetalle = pmDetalle;
	}

	@Override
	public String toString() {
		return this.pmDetalle;
	}
}
