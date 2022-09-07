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
public class InvProductoPresentacionCajasComboListadoTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "presc_codigo")
	private String prescCodigo;

	@Column(name = "presc_detalle")
	private String prescDetalle;

	@Column(name = "presc_abreviado")
	private String prescAbreviado;

	public InvProductoPresentacionCajasComboListadoTO() {
	}

	public InvProductoPresentacionCajasComboListadoTO(String prescCodigo, String prescDetalle, String prescAbreviado) {
		this.prescCodigo = prescCodigo;
		this.prescDetalle = prescDetalle;
		this.prescAbreviado = prescAbreviado;
	}

	public String getPrescAbreviado() {
		return prescAbreviado;
	}

	public void setPrescAbreviado(String prescAbreviado) {
		this.prescAbreviado = prescAbreviado;
	}

	public String getPrescCodigo() {
		return prescCodigo;
	}

	public void setPrescCodigo(String prescCodigo) {
		this.prescCodigo = prescCodigo;
	}

	public String getPrescDetalle() {
		return prescDetalle;
	}

	public void setPrescDetalle(String prescDetalle) {
		this.prescDetalle = prescDetalle;
	}

	@Override
	public String toString() {
		return this.prescDetalle;
	}

}
