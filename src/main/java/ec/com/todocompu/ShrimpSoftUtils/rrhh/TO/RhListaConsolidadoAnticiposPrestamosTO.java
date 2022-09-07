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
public class RhListaConsolidadoAnticiposPrestamosTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "cap_categoria")
	private String capCategoria;

	@Column(name = "cap_id")
	private String capId;

	@Column(name = "cap_nombres")
	private String capNombres;

	@Column(name = "cap_anticipos")
	private BigDecimal capAnticipos;

	@Column(name = "cap_prestamos")
	private BigDecimal capPrestamos;

	@Column(name = "cap_total")
	private BigDecimal capTotal;

	@Column(name = "cap_orden")
	private String capOrden;

	public RhListaConsolidadoAnticiposPrestamosTO() {
	}

	public RhListaConsolidadoAnticiposPrestamosTO(String capCategoria, String capId, String capNombres,
			BigDecimal capAnticipos, BigDecimal capPrestamos, BigDecimal capTotal, String capOrden, Integer id) {
		this.capCategoria = capCategoria;
		this.capId = capId;
		this.capNombres = capNombres;
		this.capAnticipos = capAnticipos;
		this.capPrestamos = capPrestamos;
		this.capTotal = capTotal;
		this.capOrden = capOrden;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getCapAnticipos() {
		return capAnticipos;
	}

	public void setCapAnticipos(BigDecimal capAnticipos) {
		this.capAnticipos = capAnticipos;
	}

	public String getCapCategoria() {
		return capCategoria;
	}

	public void setCapCategoria(String capCategoria) {
		this.capCategoria = capCategoria;
	}

	public String getCapId() {
		return capId;
	}

	public void setCapId(String capId) {
		this.capId = capId;
	}

	public String getCapNombres() {
		return capNombres;
	}

	public void setCapNombres(String capNombres) {
		this.capNombres = capNombres;
	}

	public String getCapOrden() {
		return capOrden;
	}

	public void setCapOrden(String capOrden) {
		this.capOrden = capOrden;
	}

	public BigDecimal getCapPrestamos() {
		return capPrestamos;
	}

	public void setCapPrestamos(BigDecimal capPrestamos) {
		this.capPrestamos = capPrestamos;
	}

	public BigDecimal getCapTotal() {
		return capTotal;
	}

	public void setCapTotal(BigDecimal capTotal) {
		this.capTotal = capTotal;
	}
}
