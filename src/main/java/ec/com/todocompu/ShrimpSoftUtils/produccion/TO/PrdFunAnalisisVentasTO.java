/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdFunAnalisisVentasTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "rc_empresa")
	private String rc_empresa;

	@Column(name = "rc_sector")
	private String rc_sector;

	@Column(name = "rc_piscina")
	private String rc_piscina;

	@Column(name = "rc_corrida")
	private String rc_corrida;

	@Column(name = "rc_fecha_siembra")
	private String rc_fecha_siembra;

	@Column(name = "rc_fecha_pesca")
	private String rc_fecha_pesca;

	@Column(name = "rc_edad")
	private java.math.BigDecimal rc_edad;

	@Column(name = "rc_hectareaje")
	private java.math.BigDecimal rc_hectareaje;

	@Column(name = "rc_numero_larvas")
	private java.math.BigDecimal rc_numero_lavas;

	@Column(name = "rc_densidad")
	private java.math.BigDecimal rc_densidad;

	@Column(name = "rc_talla_promedio")
	private java.math.BigDecimal rc_talla_promedio;

	@Column(name = "rc_laboratorio")
	private String rc_laboratorio;

	@Column(name = "rc_nauplio")
	private String rc_nauplio;

	@Column(name = "rc_biomasa_proyectada")
	private java.math.BigDecimal rc_biomasa_proyectada;

	@Column(name = "rc_biomasa_real")
	private java.math.BigDecimal rc_biomasa_real;

	@Column(name = "rc_balanceado")
	private java.math.BigDecimal rc_balanceado;

	@Column(name = "rc_conversion")
	private java.math.BigDecimal rc_converion;

	@Column(name = "rc_sobrevivencia")
	private java.math.BigDecimal rc_sobrevivencia;

	@Column(name = "rc_valor_venta")
	private java.math.BigDecimal rc_valor_venta;

	@Column(name = "rc_costo_total")
	private java.math.BigDecimal rc_costo_total;

	@Column(name = "rc_directo")
	private java.math.BigDecimal rc_directo;

	@Column(name = "rc_indirecto")
	private java.math.BigDecimal rc_indirecto;

	@Column(name = "rc_resultado")
	private java.math.BigDecimal rc_resultado;

	public PrdFunAnalisisVentasTO() {
	}

	public PrdFunAnalisisVentasTO(String rc_empresa, String rc_sector, String rc_piscina, String rc_corrida,
			String rc_fecha_siembra, String rc_fecha_pesca, BigDecimal rc_edad, BigDecimal rc_hectareaje,
			BigDecimal rc_numero_lavas, BigDecimal rc_densidad, BigDecimal rc_talla_promedio, String rc_laboratorio,
			String rc_nauplio, BigDecimal rc_biomasa_proyectada, BigDecimal rc_biomasa_real, BigDecimal rc_balanceado,
			BigDecimal rc_converion, BigDecimal rc_sobrevivencia, BigDecimal rc_valor_venta, BigDecimal rc_costo_total,
			BigDecimal rc_directo, BigDecimal rc_indirecto, BigDecimal rc_resultado, Integer id) {
		this.rc_empresa = rc_empresa;
		this.rc_sector = rc_sector;
		this.rc_piscina = rc_piscina;
		this.rc_corrida = rc_corrida;
		this.rc_fecha_siembra = rc_fecha_siembra;
		this.rc_fecha_pesca = rc_fecha_pesca;
		this.rc_edad = rc_edad;
		this.rc_hectareaje = rc_hectareaje;
		this.rc_numero_lavas = rc_numero_lavas;
		this.rc_densidad = rc_densidad;
		this.rc_talla_promedio = rc_talla_promedio;
		this.rc_laboratorio = rc_laboratorio;
		this.rc_nauplio = rc_nauplio;
		this.rc_biomasa_proyectada = rc_biomasa_proyectada;
		this.rc_biomasa_real = rc_biomasa_real;
		this.rc_balanceado = rc_balanceado;
		this.rc_converion = rc_converion;
		this.rc_sobrevivencia = rc_sobrevivencia;
		this.rc_valor_venta = rc_valor_venta;
		this.rc_costo_total = rc_costo_total;
		this.rc_directo = rc_directo;
		this.rc_indirecto = rc_indirecto;
		this.rc_resultado = rc_resultado;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getRc_balanceado() {
		return rc_balanceado;
	}

	public void setRc_balanceado(BigDecimal rc_balanceado) {
		this.rc_balanceado = rc_balanceado;
	}

	public BigDecimal getRc_biomasa_proyectada() {
		return rc_biomasa_proyectada;
	}

	public void setRc_biomasa_proyectada(BigDecimal rc_biomasa_proyectada) {
		this.rc_biomasa_proyectada = rc_biomasa_proyectada;
	}

	public BigDecimal getRc_biomasa_real() {
		return rc_biomasa_real;
	}

	public void setRc_biomasa_real(BigDecimal rc_biomasa_real) {
		this.rc_biomasa_real = rc_biomasa_real;
	}

	public BigDecimal getRc_converion() {
		return rc_converion;
	}

	public void setRc_converion(BigDecimal rc_converion) {
		this.rc_converion = rc_converion;
	}

	public String getRc_corrida() {
		return rc_corrida;
	}

	public void setRc_corrida(String rc_corrida) {
		this.rc_corrida = rc_corrida;
	}

	public BigDecimal getRc_costo_total() {
		return rc_costo_total;
	}

	public void setRc_costo_total(BigDecimal rc_costo_total) {
		this.rc_costo_total = rc_costo_total;
	}

	public BigDecimal getRc_densidad() {
		return rc_densidad;
	}

	public void setRc_densidad(BigDecimal rc_densidad) {
		this.rc_densidad = rc_densidad;
	}

	public BigDecimal getRc_directo() {
		return rc_directo;
	}

	public void setRc_directo(BigDecimal rc_directo) {
		this.rc_directo = rc_directo;
	}

	public BigDecimal getRc_edad() {
		return rc_edad;
	}

	public void setRc_edad(BigDecimal rc_edad) {
		this.rc_edad = rc_edad;
	}

	public String getRc_empresa() {
		return rc_empresa;
	}

	public void setRc_empresa(String rc_empresa) {
		this.rc_empresa = rc_empresa;
	}

	public String getRc_fecha_pesca() {
		return rc_fecha_pesca;
	}

	public void setRc_fecha_pesca(String rc_fecha_pesca) {
		this.rc_fecha_pesca = rc_fecha_pesca;
	}

	public String getRc_fecha_siembra() {
		return rc_fecha_siembra;
	}

	public void setRc_fecha_siembra(String rc_fecha_siembra) {
		this.rc_fecha_siembra = rc_fecha_siembra;
	}

	public BigDecimal getRc_hectareaje() {
		return rc_hectareaje;
	}

	public void setRc_hectareaje(BigDecimal rc_hectareaje) {
		this.rc_hectareaje = rc_hectareaje;
	}

	public BigDecimal getRc_indirecto() {
		return rc_indirecto;
	}

	public void setRc_indirecto(BigDecimal rc_indirecto) {
		this.rc_indirecto = rc_indirecto;
	}

	public String getRc_laboratorio() {
		return rc_laboratorio;
	}

	public void setRc_laboratorio(String rc_laboratorio) {
		this.rc_laboratorio = rc_laboratorio;
	}

	public String getRc_nauplio() {
		return rc_nauplio;
	}

	public void setRc_nauplio(String rc_nauplio) {
		this.rc_nauplio = rc_nauplio;
	}

	public BigDecimal getRc_numero_lavas() {
		return rc_numero_lavas;
	}

	public void setRc_numero_lavas(BigDecimal rc_numero_lavas) {
		this.rc_numero_lavas = rc_numero_lavas;
	}

	public String getRc_piscina() {
		return rc_piscina;
	}

	public void setRc_piscina(String rc_piscina) {
		this.rc_piscina = rc_piscina;
	}

	public BigDecimal getRc_resultado() {
		return rc_resultado;
	}

	public void setRc_resultado(BigDecimal rc_resultado) {
		this.rc_resultado = rc_resultado;
	}

	public String getRc_sector() {
		return rc_sector;
	}

	public void setRc_sector(String rc_sector) {
		this.rc_sector = rc_sector;
	}

	public BigDecimal getRc_sobrevivencia() {
		return rc_sobrevivencia;
	}

	public void setRc_sobrevivencia(BigDecimal rc_sobrevivencia) {
		this.rc_sobrevivencia = rc_sobrevivencia;
	}

	public BigDecimal getRc_talla_promedio() {
		return rc_talla_promedio;
	}

	public void setRc_talla_promedio(BigDecimal rc_talla_promedio) {
		this.rc_talla_promedio = rc_talla_promedio;
	}

	public BigDecimal getRc_valor_venta() {
		return rc_valor_venta;
	}

	public void setRc_valor_venta(BigDecimal rc_valor_venta) {
		this.rc_valor_venta = rc_valor_venta;
	}

}
