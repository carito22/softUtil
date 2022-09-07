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
public class PrdNumeracionLiquidacionTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "num_empresa")
	private String numEmpresa;

	@Column(name = "num_motivo")
	private String numMotivo;

	@Column(name = "num_secuencia")
	private String numSecuencia;

	public PrdNumeracionLiquidacionTO() {
	}

	public PrdNumeracionLiquidacionTO(String numEmpresa, String numMotivo, String numSecuencia) {
		this.numEmpresa = numEmpresa;
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

	public String getNumSecuencia() {
		return numSecuencia;
	}

	public void setNumSecuencia(String numSecuencia) {
		this.numSecuencia = numSecuencia;
	}

}
