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
public class InvCategoriaSincronizarTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "sc_codigo")
	private String scCodigo;

	@Column(name = "sc_nombre")
	private String scNombre;

	@Column(name = "sc_status")
	private String scStatus;

	public InvCategoriaSincronizarTO() {
	}

	public InvCategoriaSincronizarTO(String scCodigo, String scNombre, String scStatus, Integer id) {
		this.scCodigo = scCodigo;
		this.scNombre = scNombre;
		this.scStatus = scStatus;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getScCodigo() {
		return scCodigo;
	}

	public void setScCodigo(String scCodigo) {
		this.scCodigo = scCodigo;
	}

	public String getScNombre() {
		return scNombre;
	}

	public void setScNombre(String scNombre) {
		this.scNombre = scNombre;
	}

	public String getScStatus() {
		return scStatus;
	}

	public void setScStatus(String scStatus) {
		this.scStatus = scStatus;
	}
}