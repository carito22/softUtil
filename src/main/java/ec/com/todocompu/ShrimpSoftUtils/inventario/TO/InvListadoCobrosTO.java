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
public class InvListadoCobrosTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "cob_periodo")
	private String cobPeriodo;

	@Column(name = "cob_tipo")
	private String cobTipo;

	@Column(name = "cob_numero")
	private String cobNumero;

	@Column(name = "cob_fecha")
	private String cobFecha;

	@Column(name = "cob_valor")
	private String cobValor;

	@Column(name = "cob_observaciones")
	private String cobObservaciones;

	public InvListadoCobrosTO() {
	}

	public InvListadoCobrosTO(Integer id, String cobPeriodo, String cobTipo, String cobNumero, String cobFecha,
			String cobValor, String cobObservaciones) {
		super();
		this.id = id;
		this.cobPeriodo = cobPeriodo;
		this.cobTipo = cobTipo;
		this.cobNumero = cobNumero;
		this.cobFecha = cobFecha;
		this.cobValor = cobValor;
		this.cobObservaciones = cobObservaciones;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCobValor() {
		return cobValor;
	}

	public void setCobValor(String cobValor) {
		this.cobValor = cobValor;
	}

	public String getCobFecha() {
		return cobFecha;
	}

	public void setCobFecha(String cobFecha) {
		this.cobFecha = cobFecha;
	}

	public String getCobNumero() {
		return cobNumero;
	}

	public void setCobNumero(String cobNumero) {
		this.cobNumero = cobNumero;
	}

	public String getCobObservaciones() {
		return cobObservaciones;
	}

	public void setCobObservaciones(String cobObservaciones) {
		this.cobObservaciones = cobObservaciones;
	}

	public String getCobPeriodo() {
		return cobPeriodo;
	}

	public void setCobPeriodo(String cobPeriodo) {
		this.cobPeriodo = cobPeriodo;
	}

	public String getCobTipo() {
		return cobTipo;
	}

	public void setCobTipo(String cobTipo) {
		this.cobTipo = cobTipo;
	}

	@Override
	public String toString() {
		return this.cobPeriodo + "|" + this.cobTipo + "|" + this.cobNumero;
	}
}
