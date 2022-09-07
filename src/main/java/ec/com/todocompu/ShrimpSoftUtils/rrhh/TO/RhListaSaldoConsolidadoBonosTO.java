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
public class RhListaSaldoConsolidadoBonosTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "scbv_categoria")
	private String scbvCategoria;

	@Column(name = "scbv_id")
	private String scbvId;

	@Column(name = "scbv_nombres")
	private String scbvNombres;

	@Column(name = "scbv_bonos")
	private BigDecimal scbvBonos;

	@Column(name = "scbv_bonos_nd")
	private BigDecimal scbvViaticos;

	@Column(name = "scbv_total")
	private BigDecimal scbvTotal;

	@Column(name = "scbv_orden")
	private String scbvOrden;

	public RhListaSaldoConsolidadoBonosTO() {
	}

	public RhListaSaldoConsolidadoBonosTO(String scbvCategoria, String scbvId, String scbvNombres,
			BigDecimal scbvBonos, BigDecimal scbvViaticos, BigDecimal scbvTotal, String scbvOrden, Integer id) {
		this.scbvCategoria = scbvCategoria;
		this.scbvId = scbvId;
		this.scbvNombres = scbvNombres;
		this.scbvBonos = scbvBonos;
		this.scbvViaticos = scbvViaticos;
		this.scbvTotal = scbvTotal;
		this.scbvOrden = scbvOrden;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getScbvBonos() {
		return scbvBonos;
	}

	public void setScbvBonos(BigDecimal scbvBonos) {
		this.scbvBonos = scbvBonos;
	}

	public String getScbvCategoria() {
		return scbvCategoria;
	}

	public void setScbvCategoria(String scbvCategoria) {
		this.scbvCategoria = scbvCategoria;
	}

	public String getScbvId() {
		return scbvId;
	}

	public void setScbvId(String scbvId) {
		this.scbvId = scbvId;
	}

	public String getScbvNombres() {
		return scbvNombres;
	}

	public void setScbvNombres(String scbvNombres) {
		this.scbvNombres = scbvNombres;
	}

	public String getScbvOrden() {
		return scbvOrden;
	}

	public void setScbvOrden(String scbvOrden) {
		this.scbvOrden = scbvOrden;
	}

	public BigDecimal getScbvTotal() {
		return scbvTotal;
	}

	public void setScbvTotal(BigDecimal scbvTotal) {
		this.scbvTotal = scbvTotal;
	}

	public BigDecimal getScbvViaticos() {
		return scbvViaticos;
	}

	public void setScbvViaticos(BigDecimal scbvViaticos) {
		this.scbvViaticos = scbvViaticos;
	}
}
