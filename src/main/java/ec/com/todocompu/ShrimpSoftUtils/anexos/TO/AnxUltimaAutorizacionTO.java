/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class AnxUltimaAutorizacionTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "comp_autorizacion")
	private String compAutorizacion;

	@Column(name = "comp_fecha_emision")
	private String compEmision;

	@Column(name = "comp_fecha_caduca")
	private String compCaduca;

	public AnxUltimaAutorizacionTO() {
	}

	public AnxUltimaAutorizacionTO(String compAutorizacion, String compEmision, String compCaduca) {
		this.compAutorizacion = compAutorizacion;
		this.compEmision = compEmision;
		this.compCaduca = compCaduca;
	}

	public String getCompAutorizacion() {
		return compAutorizacion;
	}

	public void setCompAutorizacion(String compAutorizacion) {
		this.compAutorizacion = compAutorizacion;
	}

	public String getCompCaduca() {
		return compCaduca;
	}

	public void setCompCaduca(String compCaduca) {
		this.compCaduca = compCaduca;
	}

	public String getCompEmision() {
		return compEmision;
	}

	public void setCompEmision(String compEmision) {
		this.compEmision = compEmision;
	}

}