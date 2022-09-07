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
public class RhFunUtilidadesCalcularTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "uti_id")
	private String utiId;

	@Column(name = "uti_nombres")
	private String utiNombres;

	@Column(name = "uti_apellidos")
	private String utiApellidos;

	@Column(name = "uti_genero")
	private Character utiGenero;

	@Column(name = "uti_fecha_ingreso")
	private String utiFechaIngreso;

	@Column(name = "uti_fecha_salida")
	private String utiFechaSalida;

	@Column(name = "uti_cargo")
	private String utiCargo;

	@Column(name = "uti_cargas_familiares")
	private Integer utiCargasFamiliares;

	@Column(name = "uti_dias_laborados")
	private Integer utiDiasLaborados;

	@Column(name = "uti_valor_personal")
	private java.math.BigDecimal utiValorPersonal;

	@Column(name = "uti_valor_cargas")
	private java.math.BigDecimal utiValorCargas;

	@Column(name = "uti_valor_utilidades")
	private java.math.BigDecimal utiValorUtilidades;

	@Column(name = "uti_valor_sueldos")
	private java.math.BigDecimal utiValorSueldos;

	@Column(name = "uti_valor_bonos")
	private java.math.BigDecimal utiValorBonos;

	@Column(name = "uti_valor_xiii")
	private java.math.BigDecimal utiValorXiii;

	@Column(name = "uti_valor_xiv")
	private java.math.BigDecimal utiValorXiv;

	@Column(name = "uti_valor_fondo_reserva")
	private java.math.BigDecimal utiValorFondoReserva;

	@Column(name = "uti_valor_salario_digno")
	private java.math.BigDecimal utiValorSalarioDigno;

	@Column(name = "uti_valor_utilidad_anio_anterior")
	private java.math.BigDecimal utiValorUtilidadAnterior;

	@Column(name = "uti_valor_impuesto")
	private java.math.BigDecimal utiValorImpuesto;

	@Column(name = "uti_categoria")
	private String utiCategoria;

	@Column(name = "uti_cuenta")
	private String utiCuenta;

	@Column(name = "uti_sector")
	private String utiSector;

	// @Column(name = "valor_utilidades")
	private boolean estado;

	public RhFunUtilidadesCalcularTO() {
	}

	public RhFunUtilidadesCalcularTO(String utiId, String utiNombres, String utiApellidos, Character utiGenero,
			String utiFechaIngreso, String utiFechaSalida, String utiCargo, Integer utiCargasFamiliares,
			Integer utiDiasLaborados, BigDecimal utiValorPersonal, BigDecimal utiValorCargas,
			BigDecimal utiValorUtilidades, BigDecimal utiValorSueldos, BigDecimal utiValorBonos,
			BigDecimal utiValorXiii, BigDecimal utiValorXiv, BigDecimal utiValorFondoReserva,
			BigDecimal utiValorSalarioDigno, BigDecimal utiValorUtilidadAnterior, BigDecimal utiValorImpuesto,
			String utiCategoria, String utiCuenta, String utiSector, Integer id) {
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
		this.utiValorSueldos = utiValorSueldos;
		this.utiValorBonos = utiValorBonos;
		this.utiValorXiii = utiValorXiii;
		this.utiValorXiv = utiValorXiv;
		this.utiValorFondoReserva = utiValorFondoReserva;
		this.utiValorSalarioDigno = utiValorSalarioDigno;
		this.utiValorUtilidadAnterior = utiValorUtilidadAnterior;
		this.utiValorImpuesto = utiValorImpuesto;
		this.utiCategoria = utiCategoria;
		this.utiCuenta = utiCuenta;
		this.utiSector = utiSector;
		this.id = id;

	}

	public RhFunUtilidadesCalcularTO(String utiId, String utiNombres, String utiApellidos, Character utiGenero,
			String utiFechaIngreso, String utiFechaSalida, String utiCargo, Integer utiCargasFamiliares,
			Integer utiDiasLaborados, BigDecimal utiValorPersonal, BigDecimal utiValorCargas,
			BigDecimal utiValorUtilidades, BigDecimal utiValorSueldos, BigDecimal utiValorBonos,
			BigDecimal utiValorXiii, BigDecimal utiValorXiv, BigDecimal utiValorFondoReserva,
			BigDecimal utiValorSalarioDigno, BigDecimal utiValorUtilidadAnterior, BigDecimal utiValorImpuesto,
			String utiCategoria, String utiCuenta, String utiSector, boolean estado, Integer id) {
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
		this.utiValorSueldos = utiValorSueldos;
		this.utiValorBonos = utiValorBonos;
		this.utiValorXiii = utiValorXiii;
		this.utiValorXiv = utiValorXiv;
		this.utiValorFondoReserva = utiValorFondoReserva;
		this.utiValorSalarioDigno = utiValorSalarioDigno;
		this.utiValorUtilidadAnterior = utiValorUtilidadAnterior;
		this.utiValorImpuesto = utiValorImpuesto;
		this.utiCategoria = utiCategoria;
		this.utiCuenta = utiCuenta;
		this.utiSector = utiSector;
		this.estado = estado;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUtiFechaSalida() {
		return utiFechaSalida;
	}

	public void setUtiFechaSalida(String utiFechaSalida) {
		this.utiFechaSalida = utiFechaSalida;
	}

	public boolean isEstado() {
		return estado;
	}

	//
	public void setEstado(boolean estado) {
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

	public BigDecimal getUtiValorSueldos() {
		return utiValorSueldos;
	}

	public void setUtiValorSueldos(BigDecimal utiValorSueldos) {
		this.utiValorSueldos = utiValorSueldos;
	}

	public BigDecimal getUtiValorBonos() {
		return utiValorBonos;
	}

	public void setUtiValorBonos(BigDecimal utiValorBonos) {
		this.utiValorBonos = utiValorBonos;
	}

	public BigDecimal getUtiValorXiii() {
		return utiValorXiii;
	}

	public void setUtiValorXiii(BigDecimal utiValorXiii) {
		this.utiValorXiii = utiValorXiii;
	}

	public BigDecimal getUtiValorXiv() {
		return utiValorXiv;
	}

	public void setUtiValorXiv(BigDecimal utiValorXiv) {
		this.utiValorXiv = utiValorXiv;
	}

	public BigDecimal getUtiValorFondoReserva() {
		return utiValorFondoReserva;
	}

	public void setUtiValorFondoReserva(BigDecimal utiValorFondoReserva) {
		this.utiValorFondoReserva = utiValorFondoReserva;
	}

	public BigDecimal getUtiValorSalarioDigno() {
		return utiValorSalarioDigno;
	}

	public void setUtiValorSalarioDigno(BigDecimal utiValorSalarioDigno) {
		this.utiValorSalarioDigno = utiValorSalarioDigno;
	}

	public BigDecimal getUtiValorUtilidadAnterior() {
		return utiValorUtilidadAnterior;
	}

	public void setUtiValorUtilidadAnterior(BigDecimal utiValorUtilidadAnterior) {
		this.utiValorUtilidadAnterior = utiValorUtilidadAnterior;
	}

	public BigDecimal getUtiValorImpuesto() {
		return utiValorImpuesto;
	}

	public void setUtiValorImpuesto(BigDecimal utiValorImpuesto) {
		this.utiValorImpuesto = utiValorImpuesto;
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

}
