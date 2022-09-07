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
public class PrdLiquidacionMotivoTablaTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "lm_codigo")
	private String lmCodigo;

	@Column(name = "lm_detalle")
	private String lmDetalle;

	@Column(name = "lm_inactivo")
	private Boolean lmInactivo;

	public PrdLiquidacionMotivoTablaTO() {
	}

	public PrdLiquidacionMotivoTablaTO(String lmCodigo, String lmDetalle, Boolean lmInactivo) {
		this.lmCodigo = lmCodigo;
		this.lmDetalle = lmDetalle;
		this.lmInactivo = lmInactivo;
	}

	public String getLmCodigo() {
		return lmCodigo;
	}

	public void setLmCodigo(String lmCodigo) {
		this.lmCodigo = lmCodigo;
	}

	public String getLmDetalle() {
		return lmDetalle;
	}

	public void setLmDetalle(String lmDetalle) {
		this.lmDetalle = lmDetalle;
	}

	public Boolean getLmInactivo() {
		return lmInactivo;
	}

	public void setLmInactivo(Boolean lmInactivo) {
		this.lmInactivo = lmInactivo;
	}

}
