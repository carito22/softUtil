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
public class InvFunListaProductosSaldosGeneralTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "lpsp_codigo_principal")
	private String lpspCodigoPrincipal;

	@Column(name = "lpsp_nombre")
	private String lpspNombre;

	@Column(name = "lpsp_bodega")
	private String lpspBodega;

	@Column(name = "lpsp_saldo")
	private String lpspSaldo;

	// @Column(name = "lpsp_iva")
	// private Boolean lpspIva;

	public InvFunListaProductosSaldosGeneralTO() {
	}

	public InvFunListaProductosSaldosGeneralTO(String lpspCodigoPrincipal, String lpspNombre, String lpspBodega,
			String lpspSaldo, Integer id) {
		this.lpspCodigoPrincipal = lpspCodigoPrincipal;
		this.lpspNombre = lpspNombre;
		this.lpspBodega = lpspBodega;
		this.lpspSaldo = lpspSaldo;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLpspBodega() {
		return lpspBodega;
	}

	public void setLpspBodega(String lpspBodega) {
		this.lpspBodega = lpspBodega;
	}

	public String getLpspCodigoPrincipal() {
		return lpspCodigoPrincipal;
	}

	public void setLpspCodigoPrincipal(String lpspCodigoPrincipal) {
		this.lpspCodigoPrincipal = lpspCodigoPrincipal;
	}

	public String getLpspNombre() {
		return lpspNombre;
	}

	public void setLpspNombre(String lpspNombre) {
		this.lpspNombre = lpspNombre;
	}

	public String getLpspSaldo() {
		return lpspSaldo;
	}

	public void setLpspSaldo(String lpspSaldo) {
		this.lpspSaldo = lpspSaldo;
	}

	/*
	 * @Override public String toString(){ return this.empCodigo + " " +
	 * this.cliCodigo + " " + this.cliTipoId + " " + this.cliId + " " +
	 * this.cliNombre + " " + this.cliRazonSocial + " " + this.cliProvincia +
	 * " " + this.cliCiudad + " " + this.cliZona + " " + this.cliDireccion + " "
	 * + this.cliTelefono + " " + this.cliCelular + this.cliEmail + " " +
	 * this.cliPrecio + " " + this.cliDiasCredito + " " + this.cliCupoCredito +
	 * " " + this.cliObservaciones + " " + this.cliInactivo + " " + " " +
	 * this.cliSecuencia + " " + this.usrInsertaCliente + " " +
	 * this.usrFechaInsertaCliente; }
	 */

}
