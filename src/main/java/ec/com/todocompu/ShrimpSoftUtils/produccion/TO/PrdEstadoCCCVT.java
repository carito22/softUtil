/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdEstadoCCCVT implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "liq_pendiente")
	private Boolean estPendiente;

	@Column(name = "liq_anulado")
	private Boolean estAnulado;

	public PrdEstadoCCCVT() {
	}

	public PrdEstadoCCCVT(Boolean estPendiente, Boolean estAnulado) {
		this.estPendiente = estPendiente;
		this.estAnulado = estAnulado;
	}

	public Boolean getEstAnulado() {
		return estAnulado;
	}

	public void setEstAnulado(Boolean estAnulado) {
		this.estAnulado = estAnulado;
	}

	public Boolean getEstPendiente() {
		return estPendiente;
	}

	public void setEstPendiente(Boolean estPendiente) {
		this.estPendiente = estPendiente;
	}

	@Override
	public String toString() {
		return this.estPendiente + " " + this.estAnulado;
	}
}
