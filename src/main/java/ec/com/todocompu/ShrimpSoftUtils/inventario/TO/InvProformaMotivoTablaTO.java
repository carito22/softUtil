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
public class InvProformaMotivoTablaTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "pm_codigo")
	private String pmCodigo;

	@Column(name = "pm_detalle")
	private String pmDetalle;

	public InvProformaMotivoTablaTO() {
	}

	public InvProformaMotivoTablaTO(String pmCodigo, String pmDetalle, String tipNombre) {
		this.pmCodigo = pmCodigo;
		this.pmDetalle = pmDetalle;
	}

	public String getpmCodigo() {
		return pmCodigo;
	}

	public void setpmCodigo(String pmCodigo) {
		this.pmCodigo = pmCodigo;
	}

	public String getpmDetalle() {
		return pmDetalle;
	}

	public void setpmDetalle(String pmDetalle) {
		this.pmDetalle = pmDetalle;
	}
}
