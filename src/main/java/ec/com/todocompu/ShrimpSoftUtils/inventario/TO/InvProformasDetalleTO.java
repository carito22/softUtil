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
public class InvProformasDetalleTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "det_secuencial")
	private Integer detSecuencia;

	@Column(name = "det_orden")
	private Integer detOrden;

	@Column(name = "det_cantidad")
	private java.math.BigDecimal detCantidad;

	@Column(name = "det_precio")
	private java.math.BigDecimal detPrecio;

	@Column(name = "det_porcentaje_recargo")
	private java.math.BigDecimal detPorcentajeRecargo;

	@Column(name = "det_porcentaje_descuento")
	private java.math.BigDecimal detPorcentajeDescuento;

	@Column(name = "pro_empresa")
	private String proEmpresa;

	@Column(name = "pro_codigo_principal")
	private String proCodigoPrincipal;

	@Column(name = "pro_nombre")
	private String proNombre;

	@Column(name = "prof_empresa")
	private String profEmpresa;

	@Column(name = "prof_periodo")
	private String profPeriodo;

	@Column(name = "prof_motivo")
	private String profMotivo;

	@Column(name = "prof_numero")
	private String profNumero;

	public InvProformasDetalleTO() {
	}

	public InvProformasDetalleTO(Integer detSecuencia, Integer detOrden, BigDecimal detCantidad, BigDecimal detPrecio,
			BigDecimal detPorcentajeRecargo, BigDecimal detPorcentajeDescuento, String proEmpresa,
			String proCodigoPrincipal, String proNombre, String profEmpresa, String profPeriodo, String profMotivo,
			String profNumero) {
		this.detSecuencia = detSecuencia;
		this.detOrden = detOrden;
		this.detCantidad = detCantidad;
		this.detPrecio = detPrecio;
		this.detPorcentajeRecargo = detPorcentajeRecargo;
		this.detPorcentajeDescuento = detPorcentajeDescuento;
		this.proEmpresa = proEmpresa;
		this.proCodigoPrincipal = proCodigoPrincipal;
		this.proNombre = proNombre;
		this.profEmpresa = profEmpresa;
		this.profPeriodo = profPeriodo;
		this.profMotivo = profMotivo;
		this.profNumero = profNumero;
	}

	public BigDecimal getDetPorcentajeRecargo() {
		return detPorcentajeRecargo;
	}

	public void setDetPorcentajeRecargo(BigDecimal detPorcentajeRecargo) {
		this.detPorcentajeRecargo = detPorcentajeRecargo;
	}

	public BigDecimal getDetCantidad() {
		return detCantidad;
	}

	public void setDetCantidad(BigDecimal detCantidad) {
		this.detCantidad = detCantidad;
	}

	public Integer getDetOrden() {
		return detOrden;
	}

	public void setDetOrden(Integer detOrden) {
		this.detOrden = detOrden;
	}

	public BigDecimal getDetPorcentajeDescuento() {
		return detPorcentajeDescuento;
	}

	public void setDetPorcentajeDescuento(BigDecimal detPorcentajeDescuento) {
		this.detPorcentajeDescuento = detPorcentajeDescuento;
	}

	public BigDecimal getDetPrecio() {
		return detPrecio;
	}

	public void setDetPrecio(BigDecimal detPrecio) {
		this.detPrecio = detPrecio;
	}

	public Integer getDetSecuencia() {
		return detSecuencia;
	}

	public void setDetSecuencia(Integer detSecuencia) {
		this.detSecuencia = detSecuencia;
	}

	public String getProCodigoPrincipal() {
		return proCodigoPrincipal;
	}

	public void setProCodigoPrincipal(String proCodigoPrincipal) {
		this.proCodigoPrincipal = proCodigoPrincipal;
	}

	public String getProEmpresa() {
		return proEmpresa;
	}

	public void setProEmpresa(String proEmpresa) {
		this.proEmpresa = proEmpresa;
	}

	public String getProNombre() {
		return proNombre;
	}

	public void setProNombre(String proNombre) {
		this.proNombre = proNombre;
	}

	public String getProfEmpresa() {
		return profEmpresa;
	}

	public void setProfEmpresa(String profEmpresa) {
		this.profEmpresa = profEmpresa;
	}

	public String getProfMotivo() {
		return profMotivo;
	}

	public void setProfMotivo(String profMotivo) {
		this.profMotivo = profMotivo;
	}

	public String getProfNumero() {
		return profNumero;
	}

	public void setProfNumero(String profNumero) {
		this.profNumero = profNumero;
	}

	public String getProfPeriodo() {
		return profPeriodo;
	}

	public void setProfPeriodo(String profPeriodo) {
		this.profPeriodo = profPeriodo;
	}

	@Override
	public String toString() {
		return this.detSecuencia + " " + this.detOrden + " " + this.detCantidad + " " + this.detPrecio + " "
				+ this.detPorcentajeDescuento + " " + this.proEmpresa + " " + this.proCodigoPrincipal + " "
				+ this.proNombre + " " + this.profEmpresa + " " + this.profPeriodo + " " + this.profMotivo + " "
				+ this.profNumero;
	}
}
