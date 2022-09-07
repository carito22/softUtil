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
public class RhRolLoteTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "rl_id") //////
	private String rlId;

	@Column(name = "rl_nombres")
	private String rlNombres;

	@Column(name = "rl_cargo")
	private String rlCargo;

	@Column(name = "rl_dias_extra")
	private Integer rlDiasExtra;

	@Column(name = "rl_dias_falta")
	private Integer rlDiasFalta;

	@Column(name = "rl_dias_permiso")
	private Integer rlDiasPermiso;

	@Column(name = "rl_prestamos")
	private java.math.BigDecimal rlPrestamos;

	@Column(name = "rl_aplica")
	private Boolean rlAplica;

	public RhRolLoteTO(String rlId, String rlNombres, String rlCargo, Integer rlDiasExtra, Integer rlDiasFalta,
			Integer rlDiasPermiso, BigDecimal rlPrestamos, Boolean rlAplica) {
		this.rlId = rlId;
		this.rlNombres = rlNombres;
		this.rlCargo = rlCargo;
		this.rlDiasExtra = rlDiasExtra;
		this.rlDiasFalta = rlDiasFalta;
		this.rlDiasPermiso = rlDiasPermiso;
		this.rlPrestamos = rlPrestamos;
		this.rlAplica = rlAplica;
	}

	public Boolean getRlAplica() {
		return rlAplica;
	}

	public void setRlAplica(Boolean rlAplica) {
		this.rlAplica = rlAplica;
	}

	public String getRlCargo() {
		return rlCargo;
	}

	public void setRlCargo(String rlCargo) {
		this.rlCargo = rlCargo;
	}

	public Integer getRlDiasExtra() {
		return rlDiasExtra;
	}

	public void setRlDiasExtra(Integer rlDiasExtra) {
		this.rlDiasExtra = rlDiasExtra;
	}

	public Integer getRlDiasFalta() {
		return rlDiasFalta;
	}

	public void setRlDiasFalta(Integer rlDiasFalta) {
		this.rlDiasFalta = rlDiasFalta;
	}

	public Integer getRlDiasPermiso() {
		return rlDiasPermiso;
	}

	public void setRlDiasPermiso(Integer rlDiasPermiso) {
		this.rlDiasPermiso = rlDiasPermiso;
	}

	public String getRlId() {
		return rlId;
	}

	public void setRlId(String rlId) {
		this.rlId = rlId;
	}

	public String getRlNombres() {
		return rlNombres;
	}

	public void setRlNombres(String rlNombres) {
		this.rlNombres = rlNombres;
	}

	public BigDecimal getRlPrestamos() {
		return rlPrestamos;
	}

	public void setRlPrestamos(BigDecimal rlPrestamos) {
		this.rlPrestamos = rlPrestamos;
	}
}
