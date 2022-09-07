/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class PrdLiquidacionMotivoTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "lm_empresa")
	private String lmEmpresa;

	@Column(name = "lm_codigo")
	private String lmCodigo;

	@Column(name = "lm_detalle")
	private String lmDetalle;

	@Column(name = "lm_inactivo")
	private Boolean lmInactivo;

	@Column(name = "usr_codigo")
	private String usrCodigo;

	@Column(name = "usr_fecha_inserta")
	private String usrFechaInserta;

	public PrdLiquidacionMotivoTO() {
	}

	public PrdLiquidacionMotivoTO(String lmEmpresa, String lmCodigo, String lmDetalle, Boolean lmInactivo,
			String usrCodigo, String usrFechaInserta) {
		this.lmEmpresa = lmEmpresa;
		this.lmCodigo = lmCodigo;
		this.lmDetalle = lmDetalle;
		this.lmInactivo = lmInactivo;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public String getLmCodigo() {
		return lmCodigo;
	}

	public void setLmCodigo(String lmCodigo) {
		this.lmCodigo = lmCodigo;
	}

	public String getLmDetalle() {
		return lmDetalle;
	}

	public void setLmDetalle(String lmDetalle) {
		this.lmDetalle = lmDetalle;
	}

	public String getLmEmpresa() {
		return lmEmpresa;
	}

	public void setLmEmpresa(String lmEmpresa) {
		this.lmEmpresa = lmEmpresa;
	}

	public Boolean getLmInactivo() {
		return lmInactivo;
	}

	public void setLmInactivo(Boolean lmInactivo) {
		this.lmInactivo = lmInactivo;
	}

	public String getUsrCodigo() {
		return usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public String getUsrFechaInserta() {
		return usrFechaInserta;
	}

	public void setUsrFechaInserta(String usrFechaInserta) {
		this.usrFechaInserta = usrFechaInserta;
	}

}
