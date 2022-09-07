/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class AnxCompraDetalleTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "det_secuencial")
	private Integer detSecuencial;
	@Column(name = "det_concepto")
	private String detConcepto;
	@Column(name = "det_base0")
	private java.math.BigDecimal detBase0;
	@Column(name = "det_baseimponible")
	private java.math.BigDecimal detBaseImponible;
	@Column(name = "det_basenoobjetoiva")
	private java.math.BigDecimal detBaseNoObjetoIva;
	@Column(name = "det_porcentaje")
	private java.math.BigDecimal detPorcentaje;
	@Column(name = "det_valorretenido")
	private java.math.BigDecimal detValorRetenido;
	@Column(name = "det_orden")
	private Integer detOrden;

	@Column(name = "comp_empresa")
	private String compEmpresa;
	@Column(name = "comp_periodo")
	private String compPeriodo;
	@Column(name = "comp_motivo")
	private String compMotivo;
	@Column(name = "comp_numero")
	private String compNumero;

	@Column(name = "div_secuencial")
	private Integer divSecuencial;
	@Column(name = "div_fecha_pago")
	private String divFechaPago;
	@Column(name = "div_ir_asociado")
	private java.math.BigDecimal divIrAsociado;
	@Column(name = "div_anio_utilidades")
	private String divAnioUtilidades;

	public AnxCompraDetalleTO() {
	}

	public AnxCompraDetalleTO(Integer detSecuencial, String detConcepto, BigDecimal detBase0,
			BigDecimal detBaseImponible, BigDecimal detBaseNoObjetoIva, BigDecimal detPorcentaje,
			BigDecimal detValorRetenido, Integer detOrden, String compEmpresa, String compPeriodo, String compMotivo,
			String compNumero, Integer divSecuencial, String divFechaPago, BigDecimal divIrAsociado,
			String divAnioUtilidades) {
		this.detSecuencial = detSecuencial;
		this.detConcepto = detConcepto;
		this.detBase0 = detBase0;
		this.detBaseImponible = detBaseImponible;
		this.detBaseNoObjetoIva = detBaseNoObjetoIva;
		this.detPorcentaje = detPorcentaje;
		this.detValorRetenido = detValorRetenido;
		this.detOrden = detOrden;
		this.compEmpresa = compEmpresa;
		this.compPeriodo = compPeriodo;
		this.compMotivo = compMotivo;
		this.compNumero = compNumero;
		this.divSecuencial = divSecuencial;
		this.divFechaPago = divFechaPago;
		this.divIrAsociado = divIrAsociado;
		this.divAnioUtilidades = divAnioUtilidades;
	}

	public String getCompEmpresa() {
		return compEmpresa;
	}

	public void setCompEmpresa(String compEmpresa) {
		this.compEmpresa = compEmpresa;
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

	public BigDecimal getDetBase0() {
		return detBase0;
	}

	public void setDetBase0(BigDecimal detBase0) {
		this.detBase0 = detBase0;
	}

	public BigDecimal getDetBaseImponible() {
		return detBaseImponible;
	}

	public void setDetBaseImponible(BigDecimal detBaseImponible) {
		this.detBaseImponible = detBaseImponible;
	}

	public BigDecimal getDetBaseNoObjetoIva() {
		return detBaseNoObjetoIva;
	}

	public void setDetBaseNoObjetoIva(BigDecimal detBaseNoObjetoIva) {
		this.detBaseNoObjetoIva = detBaseNoObjetoIva;
	}

	public String getDetConcepto() {
		return detConcepto;
	}

	public void setDetConcepto(String detConcepto) {
		this.detConcepto = detConcepto;
	}

	public Integer getDetOrden() {
		return detOrden;
	}

	public void setDetOrden(Integer detOrden) {
		this.detOrden = detOrden;
	}

	public BigDecimal getDetPorcentaje() {
		return detPorcentaje;
	}

	public void setDetPorcentaje(BigDecimal detPorcentaje) {
		this.detPorcentaje = detPorcentaje;
	}

	public Integer getDetSecuencial() {
		return detSecuencial;
	}

	public void setDetSecuencial(Integer detSecuencial) {
		this.detSecuencial = detSecuencial;
	}

	public BigDecimal getDetValorRetenido() {
		return detValorRetenido;
	}

	public void setDetValorRetenido(BigDecimal detValorRetenido) {
		this.detValorRetenido = detValorRetenido;
	}

	public String getDivAnioUtilidades() {
		return divAnioUtilidades;
	}

	public void setDivAnioUtilidades(String divAnioUtilidades) {
		this.divAnioUtilidades = divAnioUtilidades;
	}

	public String getDivFechaPago() {
		return divFechaPago;
	}

	public void setDivFechaPago(String divFechaPago) {
		this.divFechaPago = divFechaPago;
	}

	public BigDecimal getDivIrAsociado() {
		return divIrAsociado;
	}

	public void setDivIrAsociado(BigDecimal divIrAsociado) {
		this.divIrAsociado = divIrAsociado;
	}

	public Integer getDivSecuencial() {
		return divSecuencial;
	}

	public void setDivSecuencial(Integer divSecuencial) {
		this.divSecuencial = divSecuencial;
	}

	@Override
	public String toString() {
		return this.detSecuencial + " " + this.detConcepto + " " + this.detBase0 + " " + this.detBaseImponible + " "
				+ this.detBaseNoObjetoIva + " " + this.detPorcentaje + " " + this.detValorRetenido + " " + this.detOrden
				+ " " + this.compEmpresa + " " + this.compPeriodo + " " + this.compMotivo + " " + this.compNumero;
	}
}
