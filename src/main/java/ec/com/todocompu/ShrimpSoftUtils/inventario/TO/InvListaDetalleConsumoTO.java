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
public class InvListaDetalleConsumoTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "det_secuencial")
	private Integer secuencial;

	@Column(name = "bod_codigo")
	private String codigoBodega;

	@Column(name = "pro_codigo_principal")
	private String codigoProducto;

	@Column(name = "pro_nombre")
	private String nombreProducto;

	@Column(name = "det_cantidad")
	private java.math.BigDecimal cantidadProducto;

	@Column(name = "det_valor_promedio")
	private java.math.BigDecimal costoPromedio;

	@Column(name = "med_detalle")
	private String medidaDetalle;

	@Column(name = "sec_codigo")
	private String codigoCP;

	@Column(name = "pis_numero")
	private String codigoCC;

	public InvListaDetalleConsumoTO() {
	}

	public java.math.BigDecimal getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(java.math.BigDecimal cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

        public BigDecimal getCostoPromedio() {
            return costoPromedio;
        }

        public void setCostoPromedio(BigDecimal costoPromedio) {
            this.costoPromedio = costoPromedio;
        }

	public String getCodigoBodega() {
		return codigoBodega;
	}

	public void setCodigoBodega(String codigoBodega) {
		this.codigoBodega = codigoBodega;
	}

	public String getCodigoCC() {
		return codigoCC;
	}

	public void setCodigoCC(String codigoCC) {
		this.codigoCC = codigoCC;
	}

	public String getCodigoCP() {
		return codigoCP;
	}

	public void setCodigoCP(String codigoCP) {
		this.codigoCP = codigoCP;
	}

	public String getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(String codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getMedidaDetalle() {
		return medidaDetalle;
	}

	public void setMedidaDetalle(String medidaDetalle) {
		this.medidaDetalle = medidaDetalle;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Integer getSecuencial() {
		return secuencial;
	}

	public void setSecuencial(Integer secuencial) {
		this.secuencial = secuencial;
	}

	@Override
	public String toString() {
		return this.secuencial + " " + this.codigoBodega + " " + this.codigoProducto + " " + this.nombreProducto + " "
				+ this.cantidadProducto + " " + this.medidaDetalle + " " + this.codigoCP + " " + this.codigoCC;
	}
}
