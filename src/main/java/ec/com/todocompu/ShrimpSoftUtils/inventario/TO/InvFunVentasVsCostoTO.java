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
public class InvFunVentasVsCostoTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "vc_producto")
	private String vcProducto;

	@Column(name = "vc_codigo")
	private String vcCodigo;

	@Column(name = "vc_medida")
	private String vcMedida;

	@Column(name = "vc_cantidad")
	private java.math.BigDecimal vcCantidad;

	@Column(name = "vc_total_ventas")
	private java.math.BigDecimal vcTotalVentas;

	@Column(name = "vc_total_costo")
	private java.math.BigDecimal vcTotalCosto;

	@Column(name = "vc_porcentaje")
	private java.math.BigDecimal vcPorcentaje;

	public InvFunVentasVsCostoTO() {
	}

	public InvFunVentasVsCostoTO(String vcProducto, String vcCodigo, String vcMedida, BigDecimal vcCantidad,
			BigDecimal vcTotalVentas, BigDecimal vcTotalCosto, BigDecimal vcPorcentaje, Integer id) {
		this.vcProducto = vcProducto;
		this.vcCodigo = vcCodigo;
		this.vcMedida = vcMedida;
		this.vcCantidad = vcCantidad;
		this.vcTotalVentas = vcTotalVentas;
		this.vcTotalCosto = vcTotalCosto;
		this.vcPorcentaje = vcPorcentaje;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getVcCantidad() {
		return vcCantidad;
	}

	public void setVcCantidad(BigDecimal vcCantidad) {
		this.vcCantidad = vcCantidad;
	}

	public String getVcCodigo() {
		return vcCodigo;
	}

	public void setVcCodigo(String vcCodigo) {
		this.vcCodigo = vcCodigo;
	}

	public String getVcMedida() {
		return vcMedida;
	}

	public void setVcMedida(String vcMedida) {
		this.vcMedida = vcMedida;
	}

	public BigDecimal getVcPorcentaje() {
		return vcPorcentaje;
	}

	public void setVcPorcentaje(BigDecimal vcPorcentaje) {
		this.vcPorcentaje = vcPorcentaje;
	}

	public String getVcProducto() {
		return vcProducto;
	}

	public void setVcProducto(String vcProducto) {
		this.vcProducto = vcProducto;
	}

	public BigDecimal getVcTotalCosto() {
		return vcTotalCosto;
	}

	public void setVcTotalCosto(BigDecimal vcTotalCosto) {
		this.vcTotalCosto = vcTotalCosto;
	}

	public BigDecimal getVcTotalVentas() {
		return vcTotalVentas;
	}

	public void setVcTotalVentas(BigDecimal vcTotalVentas) {
		this.vcTotalVentas = vcTotalVentas;
	}

}
