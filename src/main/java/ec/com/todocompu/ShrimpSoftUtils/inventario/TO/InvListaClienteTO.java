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
public class InvListaClienteTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cli_codigo")
	private String codCliente;

	@Column(name = "cli_id_numero")
	private String idCliente;

	@Column(name = "cli_razon_social")
	private String idNombreApellido;

	@Column(name = "cli_direccion")
	private String direccion;

	public InvListaClienteTO() {
	}

	public InvListaClienteTO(String codCliente, String idCliente, String idNombreApellido, String direccion) {
		this.codCliente = codCliente;
		this.idCliente = idCliente;
		this.idNombreApellido = idNombreApellido;
		this.direccion = direccion;
	}

	public String getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public String getIdNombreApellido() {
		return idNombreApellido;
	}

	public void setIdNombreApellido(String idNombreApellido) {
		this.idNombreApellido = idNombreApellido;
	}
}
