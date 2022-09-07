/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author charly
 */
@Entity
public class InvFunListaProductosImpresionPlacasTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "lpsp_codigo_principal")
	private String lpspCodigoPrincipal;

	@Column(name = "lpsp_codigo_barra")
	private String lpspCodigoBarra;

	@Column(name = "lpsp_nombre")
	private String lpspNombre;

	@Column(name = "pro_empaque")
	private String proEmpaque;

	@Column(name = "lpsp_precio1")
	private BigDecimal lpspPrecio1;

	@Column(name = "lpsp_precio2")
	private BigDecimal lpspPrecio2;

	@Column(name = "lpsp_precio3")
	private BigDecimal lpspPrecio3;

	public InvFunListaProductosImpresionPlacasTO() {
	}

	public InvFunListaProductosImpresionPlacasTO(String lpspCodigoPrincipal, String lpspCodigoBarra, String lpspNombre,
			String proEmpaque, BigDecimal lpspPrecio1, BigDecimal lpspPrecio2, BigDecimal lpspPrecio3, Integer id) {
		this.lpspCodigoPrincipal = lpspCodigoPrincipal;
		this.lpspCodigoBarra = lpspCodigoBarra;
		this.lpspNombre = lpspNombre;
		this.proEmpaque = proEmpaque;
		this.lpspPrecio1 = lpspPrecio1;
		this.lpspPrecio2 = lpspPrecio2;
		this.lpspPrecio3 = lpspPrecio3;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLpspCodigoBarra() {
		return lpspCodigoBarra;
	}

	public void setLpspCodigoBarra(String lpspCodigoBarra) {
		this.lpspCodigoBarra = lpspCodigoBarra;
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

	public BigDecimal getLpspPrecio1() {
		return lpspPrecio1;
	}

	public void setLpspPrecio1(BigDecimal lpspPrecio1) {
		this.lpspPrecio1 = lpspPrecio1;
	}

	public BigDecimal getLpspPrecio2() {
		return lpspPrecio2;
	}

	public void setLpspPrecio2(BigDecimal lpspPrecio2) {
		this.lpspPrecio2 = lpspPrecio2;
	}

	public BigDecimal getLpspPrecio3() {
		return lpspPrecio3;
	}

	public void setLpspPrecio3(BigDecimal lpspPrecio3) {
		this.lpspPrecio3 = lpspPrecio3;
	}

	public String getProEmpaque() {
		return proEmpaque;
	}

	public void setProEmpaque(String proEmpaque) {
		this.proEmpaque = proEmpaque;
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
