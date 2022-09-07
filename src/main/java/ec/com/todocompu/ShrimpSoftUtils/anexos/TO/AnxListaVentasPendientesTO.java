/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class AnxListaVentasPendientesTO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "vta_periodo")
	private String vtaPeriodo;
	@Column(name = "vta_motivo")
	private String vtaMotivo;
	@Column(name = "vta_numero")
	private String vtaNumero;
	@Column(name = "vta_documento_tipo")
	private String vtaDocumentoTipo;
	@Column(name = "vta_documento_numero")
	private String vtaDocumentoNumero;
	@Column(name = "vta_fecha")
	private String vtaFecha;
	@Column(name = "vta_cliente_codigo")
	private String cliCodigo;
	@Column(name = "vta_cliente_nombre")
	private String cliNombre;
	@Column(name = "vta_subtotal_base0")
	private java.math.BigDecimal vtaBase0;
	@Column(name = "vta_subtotal_baseimponible")
	private java.math.BigDecimal vtaBaseImponible;
	@Column(name = "vta_montoiva")
	private java.math.BigDecimal vtaMontoIva;
	@Column(name = "vta_total")
	private java.math.BigDecimal vtaTotal;
	@Column(name = "vta_ambiente")
	private String vtaAmbiente;
	@Column(name = "auxiliar")
	private boolean estado;

	public AnxListaVentasPendientesTO() {
	}

	public AnxListaVentasPendientesTO(Integer id, String vtaPeriodo, String vtaMotivo, String vtaNumero,
			String vtaDocumentoTipo, String vtaDocumentoNumero, String vtaFecha, String cliCodigo, String cliNombre,
			BigDecimal vtaBase0, BigDecimal vtaBaseImponible, BigDecimal vtaMontoIva, BigDecimal vtaTotal,
			String vtaAmbiente, boolean estado) {
		this.id = id;
		this.vtaPeriodo = vtaPeriodo;
		this.vtaMotivo = vtaMotivo;
		this.vtaNumero = vtaNumero;
		this.vtaDocumentoTipo = vtaDocumentoTipo;
		this.vtaDocumentoNumero = vtaDocumentoNumero;
		this.vtaFecha = vtaFecha;
		this.cliCodigo = cliCodigo;
		this.cliNombre = cliNombre;
		this.vtaBase0 = vtaBase0;
		this.vtaBaseImponible = vtaBaseImponible;
		this.vtaMontoIva = vtaMontoIva;
		this.vtaTotal = vtaTotal;
		this.vtaAmbiente = vtaAmbiente;
		this.estado = estado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVtaPeriodo() {
		return vtaPeriodo;
	}

	public void setVtaPeriodo(String vtaPeriodo) {
		this.vtaPeriodo = vtaPeriodo;
	}

	public String getVtaMotivo() {
		return vtaMotivo;
	}

	public void setVtaMotivo(String vtaMotivo) {
		this.vtaMotivo = vtaMotivo;
	}

	public String getVtaNumero() {
		return vtaNumero;
	}

	public void setVtaNumero(String vtaNumero) {
		this.vtaNumero = vtaNumero;
	}

	public String getVtaDocumentoTipo() {
		return vtaDocumentoTipo;
	}

	public void setVtaDocumentoTipo(String vtaDocumentoTipo) {
		this.vtaDocumentoTipo = vtaDocumentoTipo;
	}

	public String getVtaDocumentoNumero() {
		return vtaDocumentoNumero;
	}

	public void setVtaDocumentoNumero(String vtaDocumentoNumero) {
		this.vtaDocumentoNumero = vtaDocumentoNumero;
	}

	public String getVtaFecha() {
		return vtaFecha;
	}

	public void setVtaFecha(String vtaFecha) {
		this.vtaFecha = vtaFecha;
	}

	public String getCliCodigo() {
		return cliCodigo;
	}

	public void setCliCodigo(String cliCodigo) {
		this.cliCodigo = cliCodigo;
	}

	public String getCliNombre() {
		return cliNombre;
	}

	public void setCliNombre(String cliNombre) {
		this.cliNombre = cliNombre;
	}

	public java.math.BigDecimal getVtaBase0() {
		return vtaBase0;
	}

	public void setVtaBase0(java.math.BigDecimal vtaBase0) {
		this.vtaBase0 = vtaBase0;
	}

	public java.math.BigDecimal getVtaBaseImponible() {
		return vtaBaseImponible;
	}

	public void setVtaBaseImponible(java.math.BigDecimal vtaBaseImponible) {
		this.vtaBaseImponible = vtaBaseImponible;
	}

	public java.math.BigDecimal getVtaMontoIva() {
		return vtaMontoIva;
	}

	public void setVtaMontoIva(java.math.BigDecimal vtaMontoIva) {
		this.vtaMontoIva = vtaMontoIva;
	}

	public java.math.BigDecimal getVtaTotal() {
		return vtaTotal;
	}

	public void setVtaTotal(java.math.BigDecimal vtaTotal) {
		this.vtaTotal = vtaTotal;
	}

	public String getVtaAmbiente() {
		return vtaAmbiente;
	}

	public void setVtaAmbiente(String vtaAmbiente) {
		this.vtaAmbiente = vtaAmbiente;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	


	
}
