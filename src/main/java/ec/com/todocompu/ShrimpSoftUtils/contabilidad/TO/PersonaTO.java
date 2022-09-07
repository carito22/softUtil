/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */

@Entity
public class PersonaTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "fun_personas")
	private String nombrePersona;

	public PersonaTO() {
	}

	public PersonaTO(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

}
