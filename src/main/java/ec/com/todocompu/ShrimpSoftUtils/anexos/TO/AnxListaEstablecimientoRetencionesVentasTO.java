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
public class AnxListaEstablecimientoRetencionesVentasTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "rvce_establecimiento")
	private String establecimiento;

	@Column(name = "rvce_total_ventas")
	private BigDecimal totalVentas;

	public AnxListaEstablecimientoRetencionesVentasTO() {
	}

	public AnxListaEstablecimientoRetencionesVentasTO(String establecimiento, BigDecimal totalVentas, Integer id) {
		this.establecimiento = establecimiento;
		this.totalVentas = totalVentas;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEstablecimiento() {
		return establecimiento;
	}

	public void setEstablecimiento(String establecimiento) {
		this.establecimiento = establecimiento;
	}

	public BigDecimal getTotalVentas() {
		return totalVentas;
	}

	public void setTotalVentas(BigDecimal totalVentas) {
		this.totalVentas = totalVentas;
	}

}
