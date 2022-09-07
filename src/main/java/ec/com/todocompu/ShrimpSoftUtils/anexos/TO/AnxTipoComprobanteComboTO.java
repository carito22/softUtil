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
public class AnxTipoComprobanteComboTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "tc_codigo")
	private String tcCodigo;

	@Column(name = "tc_descripcion")
	private String tcDescripcion;

	@Column(name = "tc_reporte")
	private String tcRutaReporte;

	public AnxTipoComprobanteComboTO() {
	}

	public AnxTipoComprobanteComboTO(String tcCodigo, String tcDescripcion, String tcRutaReporte) {
		this.tcCodigo = tcCodigo;
		this.tcDescripcion = tcDescripcion;
		this.tcRutaReporte = tcRutaReporte;
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

	public String getTcRutaReporte() {
		return tcRutaReporte;
	}

	public void setTcRutaReporte(String tcRutaReporte) {
		this.tcRutaReporte = tcRutaReporte;
	}

	@Override
	public String toString() {
		return this.tcDescripcion;
	}
}
