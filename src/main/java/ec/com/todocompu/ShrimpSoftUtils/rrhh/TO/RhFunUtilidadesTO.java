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
public class RhFunUtilidadesTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "emp_id")
	private String utiId;

	@Column(name = "emp_nombres")
	private String utiNombres;

	@Column(name = "emp_apellidos")
	private String utiApellidos;

	@Column(name = "emp_genero")
	private Character utiGenero;

	@Column(name = "emp_fecha_ingreso")
	private String utiFechaIngreso;

	@Column(name = "emp_fecha_salida")
	private String utiFechaSalida;

	@Column(name = "emp_cargo")
	private String utiCargo;

	@Column(name = "emp_cargas_familiares")
	private Integer utiCargasFamiliares;

	@Column(name = "dias_laborados")
	private Integer utiDiasLaborados;

	@Column(name = "uti_valor_personal")
	private java.math.BigDecimal utiValorPersonal;

	@Column(name = "uti_valor_cargas")
	private java.math.BigDecimal utiValorCargas;

	@Column(name = "valor_utilidades")
	private java.math.BigDecimal utiValorUtilidades;

	@Column(name = "uti_categoria")
	private String utiCategoria;

	@Column(name = "cta_xiv")
	private String utiCuenta;

	@Column(name = "sec_codigo")
	private String utiSector;

	// @Column(name = "emp_codigo")
	private boolean estado;

	public RhFunUtilidadesTO() {
	}

	public RhFunUtilidadesTO(String utiId, String utiNombres, String utiApellidos, Character utiGenero,
			String utiFechaIngreso, String utiFechaSalida, String utiCargo, Integer utiCargasFamiliares,
			Integer utiDiasLaborados, BigDecimal utiValorPersonal, BigDecimal utiValorCargas,
			BigDecimal utiValorUtilidades, String utiCategoria, String utiCuenta, String utiSector, boolean estado) {
		this.utiId = utiId;
		this.utiNombres = utiNombres;
		this.utiApellidos = utiApellidos;
		this.utiGenero = utiGenero;
		this.utiFechaIngreso = utiFechaIngreso;
		this.utiFechaSalida = utiFechaSalida;
		this.utiCargo = utiCargo;
		this.utiCargasFamiliares = utiCargasFamiliares;
		this.utiDiasLaborados = utiDiasLaborados;
		this.utiValorPersonal = utiValorPersonal;
		this.utiValorCargas = utiValorCargas;
		this.utiValorUtilidades = utiValorUtilidades;
		this.utiCategoria = utiCategoria;
		this.utiCuenta = utiCuenta;
		this.utiSector = utiSector;
		this.estado = estado;
	}

	public String getUtiId() {
		return utiId;
	}

	public void setUtiId(String utiId) {
		this.utiId = utiId;
	}

	public String getUtiNombres() {
		return utiNombres;
	}

	public void setUtiNombres(String utiNombres) {
		this.utiNombres = utiNombres;
	}

	public String getUtiApellidos() {
		return utiApellidos;
	}

	public void setUtiApellidos(String utiApellidos) {
		this.utiApellidos = utiApellidos;
	}

	public Character getUtiGenero() {
		return utiGenero;
	}

	public void setUtiGenero(Character utiGenero) {
		this.utiGenero = utiGenero;
	}

	public String getUtiFechaIngreso() {
		return utiFechaIngreso;
	}

	public void setUtiFechaIngreso(String utiFechaIngreso) {
		this.utiFechaIngreso = utiFechaIngreso;
	}

	public String getUtiFechaSalida() {
		return utiFechaSalida;
	}

	public void setUtiFechaSalida(String utiFechaSalida) {
		this.utiFechaSalida = utiFechaSalida;
	}

	public String getUtiCargo() {
		return utiCargo;
	}

	public void setUtiCargo(String utiCargo) {
		this.utiCargo = utiCargo;
	}

	public Integer getUtiCargasFamiliares() {
		return utiCargasFamiliares;
	}

	public void setUtiCargasFamiliares(Integer utiCargasFamiliares) {
		this.utiCargasFamiliares = utiCargasFamiliares;
	}

	public Integer getUtiDiasLaborados() {
		return utiDiasLaborados;
	}

	public void setUtiDiasLaborados(Integer utiDiasLaborados) {
		this.utiDiasLaborados = utiDiasLaborados;
	}

	public BigDecimal getUtiValorPersonal() {
		return utiValorPersonal;
	}

	public void setUtiValorPersonal(BigDecimal utiValorPersonal) {
		this.utiValorPersonal = utiValorPersonal;
	}

	public BigDecimal getUtiValorCargas() {
		return utiValorCargas;
	}

	public void setUtiValorCargas(BigDecimal utiValorCargas) {
		this.utiValorCargas = utiValorCargas;
	}

	public BigDecimal getUtiValorUtilidades() {
		return utiValorUtilidades;
	}

	public void setUtiValorUtilidades(BigDecimal utiValorUtilidades) {
		this.utiValorUtilidades = utiValorUtilidades;
	}

	public String getUtiCategoria() {
		return utiCategoria;
	}

	public void setUtiCategoria(String utiCategoria) {
		this.utiCategoria = utiCategoria;
	}

	public String getUtiCuenta() {
		return utiCuenta;
	}

	public void setUtiCuenta(String utiCuenta) {
		this.utiCuenta = utiCuenta;
	}

	public String getUtiSector() {
		return utiSector;
	}

	public void setUtiSector(String utiSector) {
		this.utiSector = utiSector;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
