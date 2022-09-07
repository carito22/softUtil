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
 * @author Andres Guachisaca
 */
@Entity
public class InvFunUltimasComprasTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "comp_proveedor_codigo")
	private String compProveedorCodigo;

	@Column(name = "comp_proveedor_nombre")
	private String compProveedorNombre;

	@Column(name = "comp_fecha")
	private String compFecha;

	@Column(name = "comp_documento_numero")
	private String compDocumentoNumero;

	@Column(name = "comp_costo_unidad")
	private java.math.BigDecimal compCostoUnidad;

	@Column(name = "comp_costo_caja")
	private java.math.BigDecimal compCostoCaja;

	@Column(name = "comp_cantidad_unidades")
	private java.math.BigDecimal compCantidadUnidades;

	@Column(name = "comp_cantidad_cajas")
	private java.math.BigDecimal compCantidadCajas;

	@Column(name = "comp_periodo")
	private String compPeriodo;

	@Column(name = "comp_motivo")
	private String compMotivo;

	@Column(name = "comp_numero")
	private String compNumero;

	public InvFunUltimasComprasTO() {
	}

	public InvFunUltimasComprasTO(String compProveedorCodigo, String compProveedorNombre, String compFecha,
			String compDocumentoNumero, BigDecimal compCostoUnidad, BigDecimal compCostoCaja,
			BigDecimal compCantidadUnidades, BigDecimal compCantidadCajas, String compPeriodo, String compMotivo,
			String compNumero, Integer id) {
		this.compProveedorCodigo = compProveedorCodigo;
		this.compProveedorNombre = compProveedorNombre;
		this.compFecha = compFecha;
		this.compDocumentoNumero = compDocumentoNumero;
		this.compCostoUnidad = compCostoUnidad;
		this.compCostoCaja = compCostoCaja;
		this.compCantidadUnidades = compCantidadUnidades;
		this.compCantidadCajas = compCantidadCajas;
		this.compPeriodo = compPeriodo;
		this.compMotivo = compMotivo;
		this.compNumero = compNumero;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getCompCantidadCajas() {
		return compCantidadCajas;
	}

	public void setCompCantidadCajas(BigDecimal compCantidadCajas) {
		this.compCantidadCajas = compCantidadCajas;
	}

	public BigDecimal getCompCantidadUnidades() {
		return compCantidadUnidades;
	}

	public void setCompCantidadUnidades(BigDecimal compCantidadUnidades) {
		this.compCantidadUnidades = compCantidadUnidades;
	}

	public BigDecimal getCompCostoCaja() {
		return compCostoCaja;
	}

	public void setCompCostoCaja(BigDecimal compCostoCaja) {
		this.compCostoCaja = compCostoCaja;
	}

	public BigDecimal getCompCostoUnidad() {
		return compCostoUnidad;
	}

	public void setCompCostoUnidad(BigDecimal compCostoUnidad) {
		this.compCostoUnidad = compCostoUnidad;
	}

	public String getCompDocumentoNumero() {
		return compDocumentoNumero;
	}

	public void setCompDocumentoNumero(String compDocumentoNumero) {
		this.compDocumentoNumero = compDocumentoNumero;
	}

	public String getCompFecha() {
		return compFecha;
	}

	public void setCompFecha(String compFecha) {
		this.compFecha = compFecha;
	}

	public String getCompMotivo() {
		return compMotivo;
	}

	public void setCompMotivo(String compMotivo) {
		this.compMotivo = compMotivo;
	}

	public String getCompNumero() {
		return compNumero;
	}

	public void setCompNumero(String compNumero) {
		this.compNumero = compNumero;
	}

	public String getCompPeriodo() {
		return compPeriodo;
	}

	public void setCompPeriodo(String compPeriodo) {
		this.compPeriodo = compPeriodo;
	}

	public String getCompProveedorCodigo() {
		return compProveedorCodigo;
	}

	public void setCompProveedorCodigo(String compProveedorCodigo) {
		this.compProveedorCodigo = compProveedorCodigo;
	}

	public String getCompProveedorNombre() {
		return compProveedorNombre;
	}

	public void setCompProveedorNombre(String compProveedorNombre) {
		this.compProveedorNombre = compProveedorNombre;
	}
}
