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
public class InvEstadoCCVT implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "est_pendiente")
	private Boolean estPendiente;

	@Column(name = "est_anulado")
	private Boolean estAnulado;

	public InvEstadoCCVT() {
	}

	public InvEstadoCCVT(Boolean estPendiente, Boolean estAnulado) {
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
