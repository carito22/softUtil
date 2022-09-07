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
public class RhListaDetalleViaticosTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "dv_categoria")
	private String dvCategoria;

	@Column(name = "dv_fecha")
	private String dvFecha;

	@Column(name = "dv_id")
	private String dvId;

	@Column(name = "dv_nombres")
	private String dvNombres;

	@Column(name = "dv_valor")
	private BigDecimal dvValor;

	@Column(name = "dv_reverso")
	private Boolean dvReverso;

	@Column(name = "dv_contable")
	private String dvContable;

	@Column(name = "dv_anulado")
	private Boolean dvAnulado;

	@Column(name = "dv_observaciones")
	private String dvObservaciones;

	public RhListaDetalleViaticosTO() {
	}

	public RhListaDetalleViaticosTO(String dvCategoria, String dvFecha, String dvId, String dvNombres,
			BigDecimal dvValor, Boolean dvReverso, String dvContable, Boolean dvAnulado, String dvObservaciones,
			Integer id) {
		this.dvCategoria = dvCategoria;
		this.dvFecha = dvFecha;
		this.dvId = dvId;
		this.dvNombres = dvNombres;
		this.dvValor = dvValor;
		this.dvReverso = dvReverso;
		this.dvContable = dvContable;
		this.dvAnulado = dvAnulado;
		this.dvObservaciones = dvObservaciones;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getDvAnulado() {
		return dvAnulado;
	}

	public void setDvAnulado(Boolean dvAnulado) {
		this.dvAnulado = dvAnulado;
	}

	public String getDvCategoria() {
		return dvCategoria;
	}

	public void setDvCategoria(String dvCategoria) {
		this.dvCategoria = dvCategoria;
	}

	public String getDvContable() {
		return dvContable;
	}

	public void setDvContable(String dvContable) {
		this.dvContable = dvContable;
	}

	public String getDvFecha() {
		return dvFecha;
	}

	public void setDvFecha(String dvFecha) {
		this.dvFecha = dvFecha;
	}

	public String getDvId() {
		return dvId;
	}

	public void setDvId(String dvId) {
		this.dvId = dvId;
	}

	public String getDvNombres() {
		return dvNombres;
	}

	public void setDvNombres(String dvNombres) {
		this.dvNombres = dvNombres;
	}

	public String getDvObservaciones() {
		return dvObservaciones;
	}

	public void setDvObservaciones(String dvObservaciones) {
		this.dvObservaciones = dvObservaciones;
	}

	public Boolean getDvReverso() {
		return dvReverso;
	}

	public void setDvReverso(Boolean dvReverso) {
		this.dvReverso = dvReverso;
	}

	public BigDecimal getDvValor() {
		return dvValor;
	}

	public void setDvValor(BigDecimal dvValor) {
		this.dvValor = dvValor;
	}
}
