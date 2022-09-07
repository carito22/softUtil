/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdFunCostosPorFechaSimpleTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "costo_sector")
	private String costo_sector;

	@Column(name = "costo_piscina")
	private String costo_piscina;

	@Column(name = "costo_corrida")
	private String costo_corrida;

	@Column(name = "costo_total")
	private BigDecimal costo_total;

	public PrdFunCostosPorFechaSimpleTO() {
	}

	public PrdFunCostosPorFechaSimpleTO(String costo_sector, String costo_piscina, String costo_corrida,
			BigDecimal costo_total, Integer id) {
		this.costo_sector = costo_sector;
		this.costo_piscina = costo_piscina;
		this.costo_corrida = costo_corrida;
		this.costo_total = costo_total;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCosto_corrida() {
		return costo_corrida;
	}

	public void setCosto_corrida(String costo_corrida) {
		this.costo_corrida = costo_corrida;
	}

	public String getCosto_piscina() {
		return costo_piscina;
	}

	public void setCosto_piscina(String costo_piscina) {
		this.costo_piscina = costo_piscina;
	}

	public String getCosto_sector() {
		return costo_sector;
	}

	public void setCosto_sector(String costo_sector) {
		this.costo_sector = costo_sector;
	}

	public BigDecimal getCosto_total() {
		return costo_total;
	}

	public void setCosto_total(BigDecimal costo_total) {
		this.costo_total = costo_total;
	}

}
