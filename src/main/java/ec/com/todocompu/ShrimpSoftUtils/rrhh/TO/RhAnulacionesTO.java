/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class RhAnulacionesTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "anu_sector")
	private String anuSector;

	@Column(name = "anu_categoria")
	private String anuCategoria;

	@Column(name = "anu_fecha")
	private String anuFecha;

	@Column(name = "anu_id")
	private String anuId;

	@Column(name = "anu_nombres")
	private String anuNombres;

	@Column(name = "anu_valor")
	private BigDecimal anuValor;

	@Column(name = "anu_forma_pago_cuenta")
	private String anuFormaPagoCuenta;

	@Column(name = "anu_forma_pago_detalle")
	private String anuFormaPagoDetalle;

	@Column(name = "anu_documento")
	private String anuDocumento;

	@Column(name = "anu_observaciones")
	private String anuObservaciones;

	@Column(name = "anu_anulado")
	private Boolean anuAnulado;

	public RhAnulacionesTO() {
	}

	public RhAnulacionesTO(String anuSector, String anuCategoria, String anuFecha, String anuId, String anuNombres,
			BigDecimal anuValor, String anuFormaPagoCuenta, String anuFormaPagoDetalle, String anuDocumento,
			String anuObservaciones, Boolean anuAnulado, Integer id) {
		this.anuSector = anuSector;
		this.anuCategoria = anuCategoria;
		this.anuFecha = anuFecha;
		this.anuId = anuId;
		this.anuNombres = anuNombres;
		this.anuValor = anuValor;
		this.anuFormaPagoCuenta = anuFormaPagoCuenta;
		this.anuFormaPagoDetalle = anuFormaPagoDetalle;
		this.anuDocumento = anuDocumento;
		this.anuObservaciones = anuObservaciones;
		this.anuAnulado = anuAnulado;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getAnuAnulado() {
		return anuAnulado;
	}

	public void setAnuAnulado(Boolean anuAnulado) {
		this.anuAnulado = anuAnulado;
	}

	public String getAnuCategoria() {
		return anuCategoria;
	}

	public void setAnuCategoria(String anuCategoria) {
		this.anuCategoria = anuCategoria;
	}

	public String getAnuDocumento() {
		return anuDocumento;
	}

	public void setAnuDocumento(String anuDocumento) {
		this.anuDocumento = anuDocumento;
	}

	public String getAnuFecha() {
		return anuFecha;
	}

	public void setAnuFecha(String anuFecha) {
		this.anuFecha = anuFecha;
	}

	public String getAnuFormaPagoCuenta() {
		return anuFormaPagoCuenta;
	}

	public void setAnuFormaPagoCuenta(String anuFormaPagoCuenta) {
		this.anuFormaPagoCuenta = anuFormaPagoCuenta;
	}

	public String getAnuFormaPagoDetalle() {
		return anuFormaPagoDetalle;
	}

	public void setAnuFormaPagoDetalle(String anuFormaPagoDetalle) {
		this.anuFormaPagoDetalle = anuFormaPagoDetalle;
	}

	public String getAnuId() {
		return anuId;
	}

	public void setAnuId(String anuId) {
		this.anuId = anuId;
	}

	public String getAnuNombres() {
		return anuNombres;
	}

	public void setAnuNombres(String anuNombres) {
		this.anuNombres = anuNombres;
	}

	public String getAnuObservaciones() {
		return anuObservaciones;
	}

	public void setAnuObservaciones(String anuObservaciones) {
		this.anuObservaciones = anuObservaciones;
	}

	public String getAnuSector() {
		return anuSector;
	}

	public void setAnuSector(String anuSector) {
		this.anuSector = anuSector;
	}

	public BigDecimal getAnuValor() {
		return anuValor;
	}

	public void setAnuValor(BigDecimal anuValor) {
		this.anuValor = anuValor;
	}
}
