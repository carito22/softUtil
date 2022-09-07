/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvListadoPagosTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "pag_periodo")
	private String pagPeriodo;

	@Column(name = "pag_tipo")
	private String pagTipo;

	@Column(name = "pag_numero")
	private String pagNumero;

	@Column(name = "pag_fecha")
	private String pagFecha;

	// @Column(name = "pag_cuenta_codigo")
	// private String pagCuentaCodigo;

	// @Column(name = "pag_cuenta_detalle")
	// private String pagCuentaDetalle;
	//
	// @Column(name = "pag_documento")
	// private String pagDocumento;

	@Column(name = "pag_valor")
	private String pagValor;

	@Column(name = "pag_observaciones")
	private String pagObservaciones;

	public InvListadoPagosTO() {
	}

	public InvListadoPagosTO(Integer id, String pagPeriodo, String pagTipo, String pagNumero, String pagFecha,
			String pagValor, String pagObservaciones) {
		this.id = id;
		this.pagPeriodo = pagPeriodo;
		this.pagTipo = pagTipo;
		this.pagNumero = pagNumero;
		this.pagFecha = pagFecha;
		this.pagValor = pagValor;
		this.pagObservaciones = pagObservaciones;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPagValor() {
		return pagValor;
	}

	public void setPagValor(String pagValor) {
		this.pagValor = pagValor;
	}

	public String getPagFecha() {
		return pagFecha;
	}

	public void setPagFecha(String pagFecha) {
		this.pagFecha = pagFecha;
	}

	public String getPagNumero() {
		return pagNumero;
	}

	public void setPagNumero(String pagNumero) {
		this.pagNumero = pagNumero;
	}

	public String getPagObservaciones() {
		return pagObservaciones;
	}

	public void setPagObservaciones(String pagObservaciones) {
		this.pagObservaciones = pagObservaciones;
	}

	public String getPagPeriodo() {
		return pagPeriodo;
	}

	public void setPagPeriodo(String pagPeriodo) {
		this.pagPeriodo = pagPeriodo;
	}

	public String getPagTipo() {
		return pagTipo;
	}

	public void setPagTipo(String pagTipo) {
		this.pagTipo = pagTipo;
	}

	@Override
	public String toString() {
		return this.pagPeriodo + "|" + this.pagTipo + "|" + this.pagNumero;
	}
}
