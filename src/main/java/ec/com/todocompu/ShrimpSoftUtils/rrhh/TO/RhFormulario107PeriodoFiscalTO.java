/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class RhFormulario107PeriodoFiscalTO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "f107_anio")
	private String f107p_anio;

	@Column(name = "f107_fecha_desde")
	private String f107p_fechaDesde;

	@Column(name = "f107_fecha_hasta")
	private String f107p_fechaHasta;

	@Column(name = "f107_fecha_entrega")
	private String f107p_fechaEntrega;

	public RhFormulario107PeriodoFiscalTO(String f107p_anio, String f107p_fechaDesde, String f107p_fechaHasta,
			String f107p_fechaEntrega) {
		this.f107p_anio = f107p_anio;
		this.f107p_fechaDesde = f107p_fechaDesde;
		this.f107p_fechaHasta = f107p_fechaHasta;
		this.f107p_fechaEntrega = f107p_fechaEntrega;
	}

	public String getF107p_anio() {
		return f107p_anio;
	}

	public void setF107p_anio(String f107p_anio) {
		this.f107p_anio = f107p_anio;
	}

	public String getF107p_fechaDesde() {
		return f107p_fechaDesde;
	}

	public void setF107p_fechaDesde(String f107p_fechaDesde) {
		this.f107p_fechaDesde = f107p_fechaDesde;
	}

	public String getF107p_fechaEntrega() {
		return f107p_fechaEntrega;
	}

	public void setF107p_fechaEntrega(String f107p_fechaEntrega) {
		this.f107p_fechaEntrega = f107p_fechaEntrega;
	}

	public String getF107p_fechaHasta() {
		return f107p_fechaHasta;
	}

	public void setF107p_fechaHasta(String f107p_fechaHasta) {
		this.f107p_fechaHasta = f107p_fechaHasta;
	}

	@Override
	public String toString() {
		return this.f107p_anio;
	}
}
