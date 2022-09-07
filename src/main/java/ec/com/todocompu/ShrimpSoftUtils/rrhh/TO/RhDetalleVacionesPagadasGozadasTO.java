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
public class RhDetalleVacionesPagadasGozadasTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "vac_id")
	private String vacId;

	@Column(name = "vac_apellidos_nombres")
	private String vacApellidosNombres;

	@Column(name = "vac_valor")
	private BigDecimal vacValor;

	@Column(name = "vac_desde")
	private String vacDesde;

	@Column(name = "vac_hasta")
	private String vacHasta;

	@Column(name = "vac_gozadas_desde")
	private String vacGozadasDesde;

	@Column(name = "vac_gozadas_hasta")
	private String vacGozadasHasta;

	@Column(name = "vac_observaciones")
	private String vacObservaciones;

	@Column(name = "vac_contable")
	private String vacContables;

	public RhDetalleVacionesPagadasGozadasTO() {
	}

	public RhDetalleVacionesPagadasGozadasTO(String vacId, String vacApellidosNombres, BigDecimal vacValor,
			String vacDesde, String vacHasta, String vacGozadasDesde, String vacGozadasHasta, String vacObservaciones,
			String vacContables, Integer id) {
		this.vacId = vacId;
		this.vacApellidosNombres = vacApellidosNombres;
		this.vacValor = vacValor;
		this.vacDesde = vacDesde;
		this.vacHasta = vacHasta;
		this.vacGozadasDesde = vacGozadasDesde;
		this.vacGozadasHasta = vacGozadasHasta;
		this.vacObservaciones = vacObservaciones;
		this.vacContables = vacContables;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVacApellidosNombres() {
		return vacApellidosNombres;
	}

	public void setVacApellidosNombres(String vacApellidosNombres) {
		this.vacApellidosNombres = vacApellidosNombres;
	}

	public String getVacContables() {
		return vacContables;
	}

	public void setVacContables(String vacContables) {
		this.vacContables = vacContables;
	}

	public String getVacDesde() {
		return vacDesde;
	}

	public void setVacDesde(String vacDesde) {
		this.vacDesde = vacDesde;
	}

	public String getVacGozadasDesde() {
		return vacGozadasDesde;
	}

	public void setVacGozadasDesde(String vacGozadasDesde) {
		this.vacGozadasDesde = vacGozadasDesde;
	}

	public String getVacGozadasHasta() {
		return vacGozadasHasta;
	}

	public void setVacGozadasHasta(String vacGozadasHasta) {
		this.vacGozadasHasta = vacGozadasHasta;
	}

	public String getVacHasta() {
		return vacHasta;
	}

	public void setVacHasta(String vacHasta) {
		this.vacHasta = vacHasta;
	}

	public String getVacId() {
		return vacId;
	}

	public void setVacId(String vacId) {
		this.vacId = vacId;
	}

	public String getVacObservaciones() {
		return vacObservaciones;
	}

	public void setVacObservaciones(String vacObservaciones) {
		this.vacObservaciones = vacObservaciones;
	}

	public BigDecimal getVacValor() {
		return vacValor;
	}

	public void setVacValor(BigDecimal vacValor) {
		this.vacValor = vacValor;
	}

}
