/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class PrdLiquidacionTallaComboTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "talla_empresa")
	private String tallaCodigo;

	@Column(name = "talla_detalle")
	private String tallaDetalle;

	public PrdLiquidacionTallaComboTO() {
	}

	public PrdLiquidacionTallaComboTO(String tallaCodigo, String tallaDetalle) {
		this.tallaCodigo = tallaCodigo;
		this.tallaDetalle = tallaDetalle;
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

}
