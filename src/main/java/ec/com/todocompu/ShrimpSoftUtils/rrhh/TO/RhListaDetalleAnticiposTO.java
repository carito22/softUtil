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
public class RhListaDetalleAnticiposTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "da_categoria")
	private String daCategoria;

	@Column(name = "da_fecha")
	private String daFecha;

	@Column(name = "da_id")
	private String daId;

	@Column(name = "da_nombres")
	private String daNombres;

	@Column(name = "da_valor")
	private BigDecimal daValor;

	@Column(name = "da_reverso")
	private Boolean daReverso;

	@Column(name = "da_forma_pago")
	private String daFormaPago;

	@Column(name = "da_documento")
	private String daDocumento;

	@Column(name = "da_contable")
	private String daContable;

	@Column(name = "da_anulado")
	private Boolean daAnulado;

	@Column(name = "da_pendiente")
	private Boolean daPendiente;

	@Column(name = "da_observaciones")
	private String daObservaciones;

	public RhListaDetalleAnticiposTO() {

	}

	public RhListaDetalleAnticiposTO(String daCategoria, String daFecha, String daId, String daNombres,
			BigDecimal daValor, Boolean daReverso, String daFormaPago, String daDocumento, String daContable,
			Boolean daAnulado, Boolean daPendiente, String daObservaciones, Integer id) {
		this.daCategoria = daCategoria;
		this.daFecha = daFecha;
		this.daId = daId;
		this.daNombres = daNombres;
		this.daValor = daValor;
		this.daReverso = daReverso;
		this.daFormaPago = daFormaPago;
		this.daDocumento = daDocumento;
		this.daContable = daContable;
		this.daAnulado = daAnulado;
		this.daPendiente = daPendiente;
		this.daObservaciones = daObservaciones;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getDaAnulado() {
		return daAnulado;
	}

	public void setDaAnulado(Boolean daAnulado) {
		this.daAnulado = daAnulado;
	}

	public Boolean getDaPendiente() {
		return daPendiente;
	}

	public void setDaPendiente(Boolean daPendiente) {
		this.daPendiente = daPendiente;
	}

	public String getDaCategoria() {
		return daCategoria;
	}

	public void setDaCategoria(String daCategoria) {
		this.daCategoria = daCategoria;
	}

	public String getDaContable() {
		return daContable;
	}

	public void setDaContable(String daContable) {
		this.daContable = daContable;
	}

	public String getDaDocumento() {
		return daDocumento;
	}

	public void setDaDocumento(String daDocumento) {
		this.daDocumento = daDocumento;
	}

	public String getDaFecha() {
		return daFecha;
	}

	public void setDaFecha(String daFecha) {
		this.daFecha = daFecha;
	}

	public String getDaFormaPago() {
		return daFormaPago;
	}

	public void setDaFormaPago(String daFormaPago) {
		this.daFormaPago = daFormaPago;
	}

	public String getDaId() {
		return daId;
	}

	public void setDaId(String daId) {
		this.daId = daId;
	}

	public String getDaNombres() {
		return daNombres;
	}

	public void setDaNombres(String daNombres) {
		this.daNombres = daNombres;
	}

	public String getDaObservaciones() {
		return daObservaciones;
	}

	public void setDaObservaciones(String daObservaciones) {
		this.daObservaciones = daObservaciones;
	}

	public Boolean getDaReverso() {
		return daReverso;
	}

	public void setDaReverso(Boolean daReverso) {
		this.daReverso = daReverso;
	}

	public BigDecimal getDaValor() {
		return daValor;
	}

	public void setDaValor(BigDecimal daValor) {
		this.daValor = daValor;
	}
}
