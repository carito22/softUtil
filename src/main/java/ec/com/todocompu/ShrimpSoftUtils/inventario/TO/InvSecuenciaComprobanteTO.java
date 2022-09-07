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
public class InvSecuenciaComprobanteTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "sec_compra")
	private String secCompra;

	@Column(name = "sec_fecha")
	private String secFecha;

	@Column(name = "sec_comprobante")
	private String secComprobante;

	@Column(name = "sec_total_comprobante")
	private java.math.BigDecimal secTotalComprobante;

	@Column(name = "sec_retencion")
	private String secRetencion;

	@Column(name = "sec_total_retencion")
	private java.math.BigDecimal secTotalRetencion;

	@Column(name = "sec_contable")
	private String secContable;

	public InvSecuenciaComprobanteTO() {
	}

	public InvSecuenciaComprobanteTO(String secCompra, String secFecha, String secComprobante,
			BigDecimal secTotalComprobante, String secRetencion, BigDecimal secTotalRetencion, String secContable) {
		this.secCompra = secCompra;
		this.secFecha = secFecha;
		this.secComprobante = secComprobante;
		this.secTotalComprobante = secTotalComprobante;
		this.secRetencion = secRetencion;
		this.secTotalRetencion = secTotalRetencion;
		this.secContable = secContable;
	}

	public String getSecCompra() {
		return secCompra;
	}

	public void setSecCompra(String secCompra) {
		this.secCompra = secCompra;
	}

	public String getSecComprobante() {
		return secComprobante;
	}

	public void setSecComprobante(String secComprobante) {
		this.secComprobante = secComprobante;
	}

	public String getSecContable() {
		return secContable;
	}

	public void setSecContable(String secContable) {
		this.secContable = secContable;
	}

	public String getSecFecha() {
		return secFecha;
	}

	public void setSecFecha(String secFecha) {
		this.secFecha = secFecha;
	}

	public String getSecRetencion() {
		return secRetencion;
	}

	public void setSecRetencion(String secRetencion) {
		this.secRetencion = secRetencion;
	}

	public BigDecimal getSecTotalComprobante() {
		return secTotalComprobante;
	}

	public void setSecTotalComprobante(BigDecimal secTotalComprobante) {
		this.secTotalComprobante = secTotalComprobante;
	}

	public BigDecimal getSecTotalRetencion() {
		return secTotalRetencion;
	}

	public void setSecTotalRetencion(BigDecimal secTotalRetencion) {
		this.secTotalRetencion = secTotalRetencion;
	}

}
