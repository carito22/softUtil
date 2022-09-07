/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class AnxTipoComprobanteTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "tc_codigo")
	private String tcCodigo;
	@Column(name = "tc_descripcion")
	private String tcDescripcion;
	@Column(name = "tc_transaccion")
	private String tcTransaccion;
	@Column(name = "tc_sustento")
	private String tcSustento;
	@Column(name = "tc_abreviatura")
	private String tcAbreviatura;

	public AnxTipoComprobanteTO() {
	}

	public AnxTipoComprobanteTO(String tcCodigo, String tcDescripcion, String tcTransaccion, String tcSustento,
			String tcAbreviatura) {
		this.tcCodigo = tcCodigo;
		this.tcDescripcion = tcDescripcion;
		this.tcTransaccion = tcTransaccion;
		this.tcSustento = tcSustento;
		this.tcAbreviatura = tcAbreviatura;
	}

	public String getTcAbreviatura() {
		return tcAbreviatura;
	}

	public void setTcAbreviatura(String tcAbreviatura) {
		this.tcAbreviatura = tcAbreviatura;
	}

	public String getTcCodigo() {
		return tcCodigo;
	}

	public void setTcCodigo(String tcCodigo) {
		this.tcCodigo = tcCodigo;
	}

	public String getTcDescripcion() {
		return tcDescripcion;
	}

	public void setTcDescripcion(String tcDescripcion) {
		this.tcDescripcion = tcDescripcion;
	}

	public String getTcSustento() {
		return tcSustento;
	}

	public void setTcSustento(String tcSustento) {
		this.tcSustento = tcSustento;
	}

	public String getTcTransaccion() {
		return tcTransaccion;
	}

	public void setTcTransaccion(String tcTransaccion) {
		this.tcTransaccion = tcTransaccion;
	}
}
