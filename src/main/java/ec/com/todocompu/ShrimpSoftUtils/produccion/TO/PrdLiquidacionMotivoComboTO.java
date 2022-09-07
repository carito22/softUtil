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
public class PrdLiquidacionMotivoComboTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "lm_codigo")
	private String lmCodigo;

	@Column(name = "lm_detalle")
	private String lmDetalle;

	public PrdLiquidacionMotivoComboTO() {
	}

	public PrdLiquidacionMotivoComboTO(String lmCodigo, String lmDetalle) {
		this.lmCodigo = lmCodigo;
		this.lmDetalle = lmDetalle;
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

	@Override
	public String toString() {
		return lmDetalle;
	}

}
