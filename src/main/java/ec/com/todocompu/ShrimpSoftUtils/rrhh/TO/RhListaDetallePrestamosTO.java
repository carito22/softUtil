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
public class RhListaDetallePrestamosTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "dp_categoria")
	private String dpCategoria;

	@Column(name = "dp_fecha")
	private String dpFecha;

	@Column(name = "dp_id")
	private String dpId;

	@Column(name = "dp_nombres")
	private String dpNombres;

	@Column(name = "dp_valor")
	private BigDecimal dpValor;

	@Column(name = "dp_forma_pago")
	private String dpFormaPago;

	@Column(name = "dp_documento")
	private String dpDocumento;

	@Column(name = "dp_contable")
	private String dpContable;

	@Column(name = "dp_observaciones")
	private String dpObservaciones;

	@Column(name = "dp_pendiente")
	private Boolean dpPendiente;

	@Column(name = "dp_reversado")
	private Boolean dpReversado;

	@Column(name = "dp_anulado")
	private Boolean dpAnulado;

	public RhListaDetallePrestamosTO() {
	}

	public RhListaDetallePrestamosTO(Integer id, String dpCategoria, String dpFecha, String dpId, String dpNombres,
			BigDecimal dpValor, String dpFormaPago, String dpDocumento, String dpContable, String dpObservaciones,
			Boolean dpPendiente, Boolean dpReversado, Boolean dpAnulado) {
		super();
		this.id = id;
		this.dpCategoria = dpCategoria;
		this.dpFecha = dpFecha;
		this.dpId = dpId;
		this.dpNombres = dpNombres;
		this.dpValor = dpValor;
		this.dpFormaPago = dpFormaPago;
		this.dpDocumento = dpDocumento;
		this.dpContable = dpContable;
		this.dpObservaciones = dpObservaciones;
		this.dpPendiente = dpPendiente;
		this.dpReversado = dpReversado;
		this.dpAnulado = dpAnulado;
	}

	public Boolean getDpPendiente() {
		return dpPendiente;
	}

	public void setDpPendiente(Boolean dpPendiente) {
		this.dpPendiente = dpPendiente;
	}

	public Boolean getDpReversado() {
		return dpReversado;
	}

	public void setDpReversado(Boolean dpReversado) {
		this.dpReversado = dpReversado;
	}

	public Boolean getDpAnulado() {
		return dpAnulado;
	}

	public void setDpAnulado(Boolean dpAnulado) {
		this.dpAnulado = dpAnulado;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDpCategoria() {
		return dpCategoria;
	}

	public void setDpCategoria(String dpCategoria) {
		this.dpCategoria = dpCategoria;
	}

	public String getDpContable() {
		return dpContable;
	}

	public void setDpContable(String dpContable) {
		this.dpContable = dpContable;
	}

	public String getDpDocumento() {
		return dpDocumento;
	}

	public void setDpDocumento(String dpDocumento) {
		this.dpDocumento = dpDocumento;
	}

	public String getDpFecha() {
		return dpFecha;
	}

	public void setDpFecha(String dpFecha) {
		this.dpFecha = dpFecha;
	}

	public String getDpFormaPago() {
		return dpFormaPago;
	}

	public void setDpFormaPago(String dpFormaPago) {
		this.dpFormaPago = dpFormaPago;
	}

	public String getDpId() {
		return dpId;
	}

	public void setDpId(String dpId) {
		this.dpId = dpId;
	}

	public String getDpNombres() {
		return dpNombres;
	}

	public void setDpNombres(String dpNombres) {
		this.dpNombres = dpNombres;
	}

	public String getDpObservaciones() {
		return dpObservaciones;
	}

	public void setDpObservaciones(String dpObservaciones) {
		this.dpObservaciones = dpObservaciones;
	}

	public BigDecimal getDpValor() {
		return dpValor;
	}

	public void setDpValor(BigDecimal dpValor) {
		this.dpValor = dpValor;
	}
}
