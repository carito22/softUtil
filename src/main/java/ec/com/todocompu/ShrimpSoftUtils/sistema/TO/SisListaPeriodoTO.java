/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.sistema.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class SisListaPeriodoTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "per_codigo")
	private String perCodigo;
	@Column(name = "per_detalle")
	private String perDetalle;
	@Column(name = "per_desde")
	private String perDesde;
	@Column(name = "per_hasta")
	private String perHasta;
	@Column(name = "per_cerrado")
	private Boolean perCerrado;

	public SisListaPeriodoTO() {
	}

	public SisListaPeriodoTO(String perCodigo, String perDetalle, String perDesde, String perHasta,
			Boolean perCerrado) {
		this.perCodigo = perCodigo;
		this.perDetalle = perDetalle;
		this.perDesde = perDesde;
		this.perHasta = perHasta;
		this.perCerrado = perCerrado;
	}

	public Boolean getPerCerrado() {
		return perCerrado;
	}

	public void setPerCerrado(Boolean perCerrado) {
		this.perCerrado = perCerrado;
	}

	public String getPerCodigo() {
		return perCodigo;
	}

	public void setPerCodigo(String perCodigo) {
		this.perCodigo = perCodigo;
	}

	public String getPerDesde() {
		return perDesde;
	}

	public void setPerDesde(String perDesde) {
		this.perDesde = perDesde;
	}

	public String getPerDetalle() {
		return perDetalle;
	}

	public void setPerDetalle(String perDetalle) {
		this.perDetalle = perDetalle;
	}

	public String getPerHasta() {
		return perHasta;
	}

	public void setPerHasta(String perHasta) {
		this.perHasta = perHasta;
	}

	@Override
	public String toString() {
		return this.perDetalle;
	}

}
