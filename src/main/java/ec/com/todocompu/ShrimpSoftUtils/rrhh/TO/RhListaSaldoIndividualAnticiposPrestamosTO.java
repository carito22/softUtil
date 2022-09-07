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
public class RhListaSaldoIndividualAnticiposPrestamosTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "siap_secuencial")
	private Integer id;

	@Column(name = "siap_tipo")
	private String siapTipo;

	@Column(name = "siap_fecha")
	private String siapFecha;

	@Column(name = "siap_observaciones")
	private String siapObservaciones;

	@Column(name = "siap_debitos")
	private BigDecimal siapDebitos;

	@Column(name = "siap_creditos")
	private BigDecimal siapCreditos;

	@Column(name = "siap_saldo")
	private BigDecimal siapSaldo;

	@Column(name = "siap_contable")
	private String siapContable;

	public RhListaSaldoIndividualAnticiposPrestamosTO() {
	}

	public RhListaSaldoIndividualAnticiposPrestamosTO(String siapTipo, String siapFecha, String siapObservaciones,
			BigDecimal siapDebitos, BigDecimal siapCreditos, BigDecimal siapSaldo, String siapContable, Integer id) {
		this.siapTipo = siapTipo;
		this.siapFecha = siapFecha;
		this.siapObservaciones = siapObservaciones;
		this.siapDebitos = siapDebitos;
		this.siapCreditos = siapCreditos;
		this.siapSaldo = siapSaldo;
		this.siapContable = siapContable;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSiapContable() {
		return siapContable;
	}

	public void setSiapContable(String siapContable) {
		this.siapContable = siapContable;
	}

	public BigDecimal getSiapCreditos() {
		return siapCreditos;
	}

	public void setSiapCreditos(BigDecimal siapCreditos) {
		this.siapCreditos = siapCreditos;
	}

	public BigDecimal getSiapDebitos() {
		return siapDebitos;
	}

	public void setSiapDebitos(BigDecimal siapDebitos) {
		this.siapDebitos = siapDebitos;
	}

	public String getSiapFecha() {
		return siapFecha;
	}

	public void setSiapFecha(String siapFecha) {
		this.siapFecha = siapFecha;
	}

	public String getSiapObservaciones() {
		return siapObservaciones;
	}

	public void setSiapObservaciones(String siapObservaciones) {
		this.siapObservaciones = siapObservaciones;
	}

	public BigDecimal getSiapSaldo() {
		return siapSaldo;
	}

	public void setSiapSaldo(BigDecimal siapSaldo) {
		this.siapSaldo = siapSaldo;
	}

	public String getSiapTipo() {
		return siapTipo;
	}

	public void setSiapTipo(String siapTipo) {
		this.siapTipo = siapTipo;
	}
}
