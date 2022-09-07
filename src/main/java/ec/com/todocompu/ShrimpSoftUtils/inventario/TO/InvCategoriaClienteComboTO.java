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
public class InvCategoriaClienteComboTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cc_codigo")
	private String pcCodigo;

	@Column(name = "cc_detalle")
	private String pcDetalle;

	public InvCategoriaClienteComboTO() {
	}

	public InvCategoriaClienteComboTO(String pcCodigo, String pcDetalle) {
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
