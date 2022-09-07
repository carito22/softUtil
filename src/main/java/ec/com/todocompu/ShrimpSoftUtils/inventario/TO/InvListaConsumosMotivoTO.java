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
public class InvListaConsumosMotivoTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "cm_codigo")
	private String cmCodigo;

	@Column(name = "cm_detalle")
	private String cmDetalle;

	@Column(name = "cm_inactivo")
	private Boolean cmInactivo;

	@Column(name = "cm_forma_contabilizar")
	private String formaContabilisar;

	public InvListaConsumosMotivoTO() {
	}

	public InvListaConsumosMotivoTO(String cmCodigo, String cmDetalle, Boolean cmInactivo, String formaContabilisar) {
		this.cmCodigo = cmCodigo;
		this.cmDetalle = cmDetalle;
		this.cmInactivo = cmInactivo;
		this.formaContabilisar = formaContabilisar;
	}

	public String getFormaContabilisar() {
		return formaContabilisar;
	}

	public void setFormaContabilisar(String formaContabilisar) {
		this.formaContabilisar = formaContabilisar;
	}

	public String getCmCodigo() {
		return cmCodigo;
	}

	public void setCmCodigo(String cmCodigo) {
		this.cmCodigo = cmCodigo;
	}

	public String getCmDetalle() {
		return cmDetalle;
	}

	public void setCmDetalle(String cmDetalle) {
		this.cmDetalle = cmDetalle;
	}

	public Boolean getCmInactivo() {
		return cmInactivo;
	}

	public void setCmInactivo(Boolean cmInactivo) {
		this.cmInactivo = cmInactivo;
	}
}
