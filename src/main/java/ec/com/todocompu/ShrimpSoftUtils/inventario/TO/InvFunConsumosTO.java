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
public class InvFunConsumosTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "comp_numero_sistema")
	private String compNumeroSistema;

	@Column(name = "comp_fecha")
	private String compFecha;

	@Column(name = "comp_observaciones")
	private String compObservaciones;

	@Column(name = "comp_pendiente")
	private Boolean compPendiente;

	@Column(name = "comp_anulado")
	private Boolean compAnulado;

	public InvFunConsumosTO() {
	}

	public InvFunConsumosTO(String compNumeroSistema, String compFecha, String compObservaciones, Boolean compPendiente,
			Boolean compAnulado, Integer id) {
		this.compNumeroSistema = compNumeroSistema;
		this.compFecha = compFecha;
		this.compObservaciones = compObservaciones;
		this.compPendiente = compPendiente;
		this.compAnulado = compAnulado;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCompNumeroSistema() {
		return compNumeroSistema;
	}

	public void setCompNumeroSistema(String compNumeroSistema) {
		this.compNumeroSistema = compNumeroSistema;
	}

	public String getCompFecha() {
		return compFecha;
	}

	public void setCompFecha(String compFecha) {
		this.compFecha = compFecha;
	}

	public String getCompObservaciones() {
		return compObservaciones;
	}

	public void setCompObservaciones(String compObservaciones) {
		this.compObservaciones = compObservaciones;
	}

	public Boolean getCompPendiente() {
		return compPendiente;
	}

	public void setCompPendiente(Boolean compPendiente) {
		this.compPendiente = compPendiente;
	}

	public Boolean getCompAnulado() {
		return compAnulado;
	}

	public void setCompAnulado(Boolean compAnulado) {
		this.compAnulado = compAnulado;
	}

}
