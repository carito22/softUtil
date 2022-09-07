/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class ConNumeracionTO implements java.io.Serializable {
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "num_empresa")
	private String numEmpresa;
	@Column(name = "num_periodo")
	private String numPeriodo;
	@Column(name = "num_tipo")
	private String numTipo;
	@Column(name = "num_secuencia")
	private Integer numSecuencia;

	public ConNumeracionTO() {
	}

	public ConNumeracionTO(String numEmpresa, String numPeriodo, String numTipo, Integer numSecuencia) {
		this.numEmpresa = numEmpresa;
		this.numPeriodo = numPeriodo;
		this.numTipo = numTipo;
		this.numSecuencia = numSecuencia;
	}

	public String getNumEmpresa() {
		return numEmpresa;
	}

	public void setNumEmpresa(String numEmpresa) {
		this.numEmpresa = numEmpresa;
	}

	public String getNumPeriodo() {
		return numPeriodo;
	}

	public void setNumPeriodo(String numPeriodo) {
		this.numPeriodo = numPeriodo;
	}

	public Integer getNumSecuencia() {
		return numSecuencia;
	}

	public void setNumSecuencia(Integer numSecuencia) {
		this.numSecuencia = numSecuencia;
	}

	public String getNumTipo() {
		return numTipo;
	}

	public void setNumTipo(String numTipo) {
		this.numTipo = numTipo;
	}

}
