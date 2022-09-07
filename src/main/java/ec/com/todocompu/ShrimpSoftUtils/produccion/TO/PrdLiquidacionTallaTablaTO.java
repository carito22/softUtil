/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdLiquidacionTallaTablaTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "talla_codigo")
	private String tallaCodigo;

	@Column(name = "talla_detalle")
	private String tallaDetalle;

	@Column(name = "talla_inactivo")
	private Boolean tallaInactivo;

	public PrdLiquidacionTallaTablaTO() {
	}

	public PrdLiquidacionTallaTablaTO(String tallaCodigo, String tallaDetalle, Boolean tallaInactivo) {
		this.tallaCodigo = tallaCodigo;
		this.tallaDetalle = tallaDetalle;
		this.tallaInactivo = tallaInactivo;
	}

	public String getTallaCodigo() {
		return tallaCodigo;
	}

	public void setTallaCodigo(String tallaCodigo) {
		this.tallaCodigo = tallaCodigo;
	}

	public String getTallaDetalle() {
		return tallaDetalle;
	}

	public void setTallaDetalle(String tallaDetalle) {
		this.tallaDetalle = tallaDetalle;
	}

	public Boolean getTallaInactivo() {
		return tallaInactivo;
	}

	public void setTallaInactivo(Boolean tallaInactivo) {
		this.tallaInactivo = tallaInactivo;
	}

}
