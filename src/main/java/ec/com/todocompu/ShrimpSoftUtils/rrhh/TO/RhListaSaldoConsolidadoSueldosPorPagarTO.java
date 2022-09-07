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
public class RhListaSaldoConsolidadoSueldosPorPagarTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "scsp_categoria")
	private String scspCategoria;

	@Column(name = "scsp_id")
	private String scspId;

	@Column(name = "scsp_nombres")
	private String scspNombres;

	@Column(name = "scsp_valor")
	private BigDecimal scspValor;

	@Column(name = "scsp_orden")
	private String scspOrden;

	public RhListaSaldoConsolidadoSueldosPorPagarTO() {
	}

	public RhListaSaldoConsolidadoSueldosPorPagarTO(String scspCategoria, String scspId, String scspNombres,
			BigDecimal scspValor, String scspOrden, Integer id) {
		this.scspCategoria = scspCategoria;
		this.scspId = scspId;
		this.scspNombres = scspNombres;
		this.scspValor = scspValor;
		this.scspOrden = scspOrden;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getScspCategoria() {
		return scspCategoria;
	}

	public void setScspCategoria(String scspCategoria) {
		this.scspCategoria = scspCategoria;
	}

	public String getScspId() {
		return scspId;
	}

	public void setScspId(String scspId) {
		this.scspId = scspId;
	}

	public String getScspNombres() {
		return scspNombres;
	}

	public void setScspNombres(String scspNombres) {
		this.scspNombres = scspNombres;
	}

	public String getScspOrden() {
		return scspOrden;
	}

	public void setScspOrden(String scspOrden) {
		this.scspOrden = scspOrden;
	}

	public BigDecimal getScspValor() {
		return scspValor;
	}

	public void setScspValor(BigDecimal scspValor) {
		this.scspValor = scspValor;
	}
}
