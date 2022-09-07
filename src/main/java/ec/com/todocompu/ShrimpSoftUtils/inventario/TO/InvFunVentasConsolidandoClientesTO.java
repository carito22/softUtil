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
public class InvFunVentasConsolidandoClientesTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "vta_identificacion")
	private String vtaIdentificacion;

	@Column(name = "vta_nombre_cliente")
	private String vtaNombreCliente;

	@Column(name = "vta_numero_comprobantes")
	private java.math.BigDecimal vtaNumeroComprobantes;

	@Column(name = "vta_base0")
	private java.math.BigDecimal vtaBase0;

	@Column(name = "vta_baseimponible")
	private java.math.BigDecimal vtaBaseimponible;

	@Column(name = "vta_montoiva")
	private java.math.BigDecimal vtaMontoiva;

	@Column(name = "vta_total")
	private java.math.BigDecimal vtaTotal;

	public InvFunVentasConsolidandoClientesTO() {
	}

	public InvFunVentasConsolidandoClientesTO(Integer id, String vtaIdentificacion, String vtaNombreCliente,
			BigDecimal vtaNumeroComprobantes, BigDecimal vtaBase0, BigDecimal vtaBaseimponible, BigDecimal vtaMontoiva,
			BigDecimal vtaTotal) {

		this.id = id;
		this.vtaIdentificacion = vtaIdentificacion;
		this.vtaNombreCliente = vtaNombreCliente;
		this.vtaNumeroComprobantes = vtaNumeroComprobantes;
		this.vtaBase0 = vtaBase0;
		this.vtaBaseimponible = vtaBaseimponible;
		this.vtaMontoiva = vtaMontoiva;
		this.vtaTotal = vtaTotal;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVtaIdentificacion() {
		return vtaIdentificacion;
	}

	public void setVtaIdentificacion(String vtaIdentificacion) {
		this.vtaIdentificacion = vtaIdentificacion;
	}

	public String getVtaNombreCliente() {
		return vtaNombreCliente;
	}

	public void setVtaNombreCliente(String vtaNombreCliente) {
		this.vtaNombreCliente = vtaNombreCliente;
	}

	public java.math.BigDecimal getVtaNumeroComprobantes() {
		return vtaNumeroComprobantes;
	}

	public void setVtaNumeroComprobantes(java.math.BigDecimal vtaNumeroComprobantes) {
		this.vtaNumeroComprobantes = vtaNumeroComprobantes;
	}

	public java.math.BigDecimal getVtaBase0() {
		return vtaBase0;
	}

	public void setVtaBase0(java.math.BigDecimal vtaBase0) {
		this.vtaBase0 = vtaBase0;
	}

	public java.math.BigDecimal getVtaBaseimponible() {
		return vtaBaseimponible;
	}

	public void setVtaBaseimponible(java.math.BigDecimal vtaBaseimponible) {
		this.vtaBaseimponible = vtaBaseimponible;
	}

	public java.math.BigDecimal getVtaMontoiva() {
		return vtaMontoiva;
	}

	public void setVtaMontoiva(java.math.BigDecimal vtaMontoiva) {
		this.vtaMontoiva = vtaMontoiva;
	}

	public java.math.BigDecimal getVtaTotal() {
		return vtaTotal;
	}

	public void setVtaTotal(java.math.BigDecimal vtaTotal) {
		this.vtaTotal = vtaTotal;
	}

}
