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
public class InvProductoSincronizarTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "sp_codigo")
	private String spCodigo;

	@Column(name = "sp_nombre")
	private String spNombre;

	@Column(name = "sp_status")
	private String spStatus;

	public InvProductoSincronizarTO() {
	}

	public InvProductoSincronizarTO(String spCodigo, String spNombre, String spStatus, Integer id) {
		this.spCodigo = spCodigo;
		this.spNombre = spNombre;
		this.spStatus = spStatus;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSpCodigo() {
		return spCodigo;
	}

	public void setSpCodigo(String spCodigo) {
		this.spCodigo = spCodigo;
	}

	public String getSpNombre() {
		return spNombre;
	}

	public void setSpNombre(String spNombre) {
		this.spNombre = spNombre;
	}

	public String getSpStatus() {
		return spStatus;
	}

	public void setSpStatus(String spStatus) {
		this.spStatus = spStatus;
	}
}
