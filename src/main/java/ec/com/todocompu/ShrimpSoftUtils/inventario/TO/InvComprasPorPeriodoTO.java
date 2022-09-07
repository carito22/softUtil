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
 * @author developer3
 */
@Entity
public class InvComprasPorPeriodoTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "comp_fecha")
	private String consumoFecha;

	@Column(name = "comp_producto")
	private String consumoProducto;

	@Column(name = "comp_codigo")
	private String consumoCodigo;

	@Column(name = "comp_medida")
	private String consumoMedida;

	@Column(name = "comp_total")
	private java.math.BigDecimal consumoTotal;

	public InvComprasPorPeriodoTO(String consumoFecha, String consumoProducto, String consumoCodigo,
			String consumoMedida, BigDecimal consumoTotal, Integer id) {
		this.consumoFecha = consumoFecha;
		this.consumoProducto = consumoProducto;
		this.consumoCodigo = consumoCodigo;
		this.consumoMedida = consumoMedida;
		this.consumoTotal = consumoTotal;
		this.id = id;
	}

	public InvComprasPorPeriodoTO() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getConsumoCodigo() {
		return consumoCodigo;
	}

	public void setConsumoCodigo(String consumoCodigo) {
		this.consumoCodigo = consumoCodigo;
	}

	public String getConsumoFecha() {
		return consumoFecha;
	}

	public void setConsumoFecha(String consumoFecha) {
		this.consumoFecha = consumoFecha;
	}

	public String getConsumoMedida() {
		return consumoMedida;
	}

	public void setConsumoMedida(String consumoMedida) {
		this.consumoMedida = consumoMedida;
	}

	public String getConsumoProducto() {
		return consumoProducto;
	}

	public void setConsumoProducto(String consumoProducto) {
		this.consumoProducto = consumoProducto;
	}

	public BigDecimal getConsumoTotal() {
		return consumoTotal;
	}

	public void setConsumoTotal(BigDecimal consumoTotal) {
		this.consumoTotal = consumoTotal;
	}

}
