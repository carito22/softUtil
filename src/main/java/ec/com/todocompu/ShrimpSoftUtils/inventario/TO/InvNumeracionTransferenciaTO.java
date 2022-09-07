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
public class InvNumeracionTransferenciaTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "num_empresa")
	private String numEmpresa;

	@Column(name = "num_periodo")
	private String numPeriodo;

	@Column(name = "num_motivo")
	private String numMotivo;

	@Column(name = "num_secuencia")
	private String numSecuencia;

	public InvNumeracionTransferenciaTO() {
	}

	public InvNumeracionTransferenciaTO(String numEmpresa, String numPeriodo, String numMotivo, String numSecuencia) {
		this.numEmpresa = numEmpresa;
		this.numPeriodo = numPeriodo;
		this.numMotivo = numMotivo;
		this.numSecuencia = numSecuencia;
	}

	public String getNumEmpresa() {
		return numEmpresa;
	}

	public void setNumEmpresa(String numEmpresa) {
		this.numEmpresa = numEmpresa;
	}

	public String getNumMotivo() {
		return numMotivo;
	}

	public void setNumMotivo(String numMotivo) {
		this.numMotivo = numMotivo;
	}

	public String getNumPeriodo() {
		return numPeriodo;
	}

	public void setNumPeriodo(String numPeriodo) {
		this.numPeriodo = numPeriodo;
	}

	public String getNumSecuencia() {
		return numSecuencia;
	}

	public void setNumSecuencia(String numSecuencia) {
		this.numSecuencia = numSecuencia;
	}
}
