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
public class InvCategoriaProveedorComboTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "pc_codigo")
	private String pcCodigo;

	@Column(name = "pc_detalle")
	private String pcDetalle;

	public InvCategoriaProveedorComboTO() {
	}

	public InvCategoriaProveedorComboTO(String pcCodigo, String pcDetalle) {
		this.pcCodigo = pcCodigo;
		this.pcDetalle = pcDetalle;
	}

	public String getPcCodigo() {
		return pcCodigo;
	}

	public void setPcCodigo(String pcCodigo) {
		this.pcCodigo = pcCodigo;
	}

	public String getPcDetalle() {
		return pcDetalle;
	}

	public void setPcDetalle(String pcDetalle) {
		this.pcDetalle = pcDetalle;
	}

	@Override
	public String toString() {
		return this.pcDetalle;
	}
}
