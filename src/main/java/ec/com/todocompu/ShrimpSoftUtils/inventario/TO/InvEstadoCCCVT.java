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
public class InvEstadoCCCVT implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "comp_pendiente")
	private Boolean estPendiente;

	@Column(name = "comp_anulado")
	private Boolean estAnulado;

	@Column(name = "est_bloqueado")
	private Boolean estBloqueado;

	@Column(name = "est_generado")
	private Boolean estGenerado;

	@Column(name = "con_reversado")
	private Boolean conReversado;

	public InvEstadoCCCVT() {
	}

	public InvEstadoCCCVT(Boolean estPendiente, Boolean estAnulado, Boolean estBloqueado, Boolean estGenerado,
			Boolean conReversado) {
		this.estPendiente = estPendiente;
		this.estAnulado = estAnulado;
		this.estBloqueado = estBloqueado;
		this.estGenerado = estGenerado;
		this.conReversado = conReversado;
	}

	public Boolean getEstAnulado() {
		return estAnulado;
	}

	public void setEstAnulado(Boolean estAnulado) {
		this.estAnulado = estAnulado;
	}

	public Boolean getEstBloqueado() {
		return estBloqueado;
	}

	public void setEstBloqueado(Boolean estBloqueado) {
		this.estBloqueado = estBloqueado;
	}

	public Boolean getEstGenerado() {
		return estGenerado;
	}

	public void setEstGenerado(Boolean estGenerado) {
		this.estGenerado = estGenerado;
	}

	public Boolean getEstPendiente() {
		return estPendiente;
	}

	public void setEstPendiente(Boolean estPendiente) {
		this.estPendiente = estPendiente;
	}

	public Boolean getConReversado() {
		return conReversado;
	}

	public void setConReversado(Boolean conReversado) {
		this.conReversado = conReversado;
	}

	@Override
	public String toString() {
		return this.estPendiente + " " + this.estAnulado;
	}
}
