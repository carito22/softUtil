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
public class RhListaSaldoConsolidadoAnticiposPrestamosTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "scap_categoria")
	private String scapCategoria;

	@Column(name = "scap_id")
	private String scapId;

	@Column(name = "scap_nombres")
	private String scapNombres;

	@Column(name = "scap_anticipos")
	private BigDecimal scapAnticipos;

	@Column(name = "scap_prestamos")
	private BigDecimal scapPrestamos;

	@Column(name = "scap_total")
	private BigDecimal scapTotal;

	@Column(name = "scap_orden")
	private String scapOrden;

	public RhListaSaldoConsolidadoAnticiposPrestamosTO() {
	}

	public RhListaSaldoConsolidadoAnticiposPrestamosTO(String scapCategoria, String scapId, String scapNombres,
			BigDecimal scapAnticipos, BigDecimal scapPrestamos, BigDecimal scapTotal, String scapOrden, Integer id) {
		this.scapCategoria = scapCategoria;
		this.scapId = scapId;
		this.scapNombres = scapNombres;
		this.scapAnticipos = scapAnticipos;
		this.scapPrestamos = scapPrestamos;
		this.scapTotal = scapTotal;
		this.scapOrden = scapOrden;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getScapAnticipos() {
		return scapAnticipos;
	}

	public void setScapAnticipos(BigDecimal scapAnticipos) {
		this.scapAnticipos = scapAnticipos;
	}

	public String getScapCategoria() {
		return scapCategoria;
	}

	public void setScapCategoria(String scapCategoria) {
		this.scapCategoria = scapCategoria;
	}

	public String getScapId() {
		return scapId;
	}

	public void setScapId(String scapId) {
		this.scapId = scapId;
	}

	public String getScapNombres() {
		return scapNombres;
	}

	public void setScapNombres(String scapNombres) {
		this.scapNombres = scapNombres;
	}

	public String getScapOrden() {
		return scapOrden;
	}

	public void setScapOrden(String scapOrden) {
		this.scapOrden = scapOrden;
	}

	public BigDecimal getScapPrestamos() {
		return scapPrestamos;
	}

	public void setScapPrestamos(BigDecimal scapPrestamos) {
		this.scapPrestamos = scapPrestamos;
	}

	public BigDecimal getScapTotal() {
		return scapTotal;
	}

	public void setScapTotal(BigDecimal scapTotal) {
		this.scapTotal = scapTotal;
	}
}
