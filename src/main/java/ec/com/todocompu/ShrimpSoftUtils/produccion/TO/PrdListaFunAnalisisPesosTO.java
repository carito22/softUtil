/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos
 */
@Entity
public class PrdListaFunAnalisisPesosTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "ap_piscina")
	private String apPiscina;
	@Column(name = "ap_sector")
	private String apSector;
	@Column(name = "ap_corrida")
	private String apCorrida;
	@Column(name = "ap_hectareas")
	private BigDecimal apHectareas;
	@Column(name = "ap_fecha_siembra")
	private String apFechaSiembra;
	@Column(name = "ap_forma_siembra")
	private String apFormaSiembra;
	@Column(name = "ap_densidad_inicial_m2")
	private BigDecimal apDensidadMetroCuadrado;
	@Column(name = "ap_sobrevivencia")
	private BigDecimal apSobrevivenciaMetroCuadrado;
	@Column(name = "ap_densidad_actual_m2")
	private BigDecimal apRaleo;
	@Column(name = "ap_edad")
	private BigDecimal apEdad;
	@Column(name = "ap_peso_ideal")
	private BigDecimal apPesoIdeal;
	@Column(name = "ap_peso_sobre_ideal")
	private BigDecimal apPesoSobreIdeal;
	@Column(name = "ap_peso_promedio_actual")
	private BigDecimal apPesoPromedioActual;
	@Column(name = "ap_incremento_4_semana")
	private BigDecimal apPesoIncrementoSemana4;
	@Column(name = "ap_incremento_3_semana")
	private BigDecimal apPesoIncrementoSemana3;
	@Column(name = "ap_incremento_2_semana")
	private BigDecimal apPesoIncrementoSemana2;
	@Column(name = "ap_incremento_1_semana")
	private BigDecimal apPesoIncrementoSemana1;
	@Column(name = "ap_incremento_promedio")
	private BigDecimal apPesoIncrementoPromedio;
	@Column(name = "ap_balanceado_tipo")
	private String apBalanceadoTipo;
	@Column(name = "ap_balanceado_sacos")
	private BigDecimal apBalanceadoSacos;
	@Column(name = "ap_balanceado_kilos_hectarea")
	private BigDecimal apBalanceadoKilosHectarea;
	@Column(name = "ap_balanceado_acumulado")
	private BigDecimal apBalanceadoAcumulado;
	@Column(name = "ap_biomasa_proyectada")
	private BigDecimal apBiomasaProyectada;
	@Column(name = "ap_conversion_alimenticia")
	private BigDecimal apConversionAlimenticia;
	@Column(name = "ap_laboratorio")
	private String apLaboratorio;
	@Column(name = "ap_nauplio")
	private String apNauplio;

	public PrdListaFunAnalisisPesosTO(String apSector, String apPiscina, String apCorrida, BigDecimal apHectareas,
			String apFechaSiembra, String apFormaSiembra, BigDecimal apDensidadMetroCuadrado,
			BigDecimal apSobrevivenciaMetroCuadrado, BigDecimal apRaleo, BigDecimal apEdad, BigDecimal apPesoIdeal,
			BigDecimal apPesoSobreIdeal, BigDecimal apPesoPromedioActual, BigDecimal apPesoIncrementoSemana4,
			BigDecimal apPesoIncrementoSemana3, BigDecimal apPesoIncrementoSemana2, BigDecimal apPesoIncrementoSemana1,
			BigDecimal apPesoIncrementoPromedio, String apBalanceadoTipo, BigDecimal apBalanceadoSacos,
			BigDecimal apBalanceadoKilosHectarea, BigDecimal apBalanceadoAcumulado, BigDecimal apBiomasaProyectada,
			BigDecimal apConversionAlimenticia, String apLaboratorio, String apNauplio, Integer id) {
		this.apSector = apSector;
		this.apPiscina = apPiscina;
		this.apCorrida = apCorrida;
		this.apHectareas = apHectareas;
		this.apFechaSiembra = apFechaSiembra;
		this.apFormaSiembra = apFormaSiembra;
		this.apDensidadMetroCuadrado = apDensidadMetroCuadrado;
		this.apSobrevivenciaMetroCuadrado = apSobrevivenciaMetroCuadrado;
		this.apRaleo = apRaleo;
		this.apEdad = apEdad;
		this.apPesoIdeal = apPesoIdeal;
		this.apPesoSobreIdeal = apPesoSobreIdeal;
		this.apPesoPromedioActual = apPesoPromedioActual;
		this.apPesoIncrementoSemana4 = apPesoIncrementoSemana4;
		this.apPesoIncrementoSemana3 = apPesoIncrementoSemana3;
		this.apPesoIncrementoSemana2 = apPesoIncrementoSemana2;
		this.apPesoIncrementoSemana1 = apPesoIncrementoSemana1;
		this.apPesoIncrementoPromedio = apPesoIncrementoPromedio;
		this.apBalanceadoTipo = apBalanceadoTipo;
		this.apBalanceadoSacos = apBalanceadoSacos;
		this.apBalanceadoKilosHectarea = apBalanceadoKilosHectarea;
		this.apBalanceadoAcumulado = apBalanceadoAcumulado;
		this.apBiomasaProyectada = apBiomasaProyectada;
		this.apConversionAlimenticia = apConversionAlimenticia;
		this.apLaboratorio = apLaboratorio;
		this.apNauplio = apNauplio;
		this.id = id;
	}

	public PrdListaFunAnalisisPesosTO() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getApBalanceadoAcumulado() {
		return apBalanceadoAcumulado;
	}

	public void setApBalanceadoAcumulado(BigDecimal apBalanceadoAcumulado) {
		this.apBalanceadoAcumulado = apBalanceadoAcumulado;
	}

	public BigDecimal getApBalanceadoKilosHectarea() {
		return apBalanceadoKilosHectarea;
	}

	public void setApBalanceadoKilosHectarea(BigDecimal apBalanceadoKilosHectarea) {
		this.apBalanceadoKilosHectarea = apBalanceadoKilosHectarea;
	}

	public BigDecimal getApBalanceadoSacos() {
		return apBalanceadoSacos;
	}

	public void setApBalanceadoSacos(BigDecimal apBalanceadoSacos) {
		this.apBalanceadoSacos = apBalanceadoSacos;
	}

	public String getApBalanceadoTipo() {
		return apBalanceadoTipo;
	}

	public void setApBalanceadoTipo(String apBalanceadoTipo) {
		this.apBalanceadoTipo = apBalanceadoTipo;
	}

	public BigDecimal getApBiomasaProyectada() {
		return apBiomasaProyectada;
	}

	public void setApBiomasaProyectada(BigDecimal apBiomasaProyectada) {
		this.apBiomasaProyectada = apBiomasaProyectada;
	}

	public BigDecimal getApConversionAlimenticia() {
		return apConversionAlimenticia;
	}

	public void setApConversionAlimenticia(BigDecimal apConversionAlimenticia) {
		this.apConversionAlimenticia = apConversionAlimenticia;
	}

	public String getApCorrida() {
		return apCorrida;
	}

	public void setApCorrida(String apCorrida) {
		this.apCorrida = apCorrida;
	}

	public BigDecimal getApDensidadMetroCuadrado() {
		return apDensidadMetroCuadrado;
	}

	public void setApDensidadMetroCuadrado(BigDecimal apDensidadMetroCuadrado) {
		this.apDensidadMetroCuadrado = apDensidadMetroCuadrado;
	}

	public BigDecimal getApEdad() {
		return apEdad;
	}

	public void setApEdad(BigDecimal apEdad) {
		this.apEdad = apEdad;
	}

	public String getApFechaSiembra() {
		return apFechaSiembra;
	}

	public void setApFechaSiembra(String apFechaSiembra) {
		this.apFechaSiembra = apFechaSiembra;
	}

	public String getApFormaSiembra() {
		return apFormaSiembra;
	}

	public void setApFormaSiembra(String apFormaSiembra) {
		this.apFormaSiembra = apFormaSiembra;
	}

	public BigDecimal getApHectareas() {
		return apHectareas;
	}

	public void setApHectareas(BigDecimal apHectareas) {
		this.apHectareas = apHectareas;
	}

	public String getApLaboratorio() {
		return apLaboratorio;
	}

	public void setApLaboratorio(String apLaboratorio) {
		this.apLaboratorio = apLaboratorio;
	}

	public String getApNauplio() {
		return apNauplio;
	}

	public void setApNauplio(String apNauplio) {
		this.apNauplio = apNauplio;
	}

	public BigDecimal getApPesoIdeal() {
		return apPesoIdeal;
	}

	public void setApPesoIdeal(BigDecimal apPesoIdeal) {
		this.apPesoIdeal = apPesoIdeal;
	}

	public BigDecimal getApPesoIncrementoPromedio() {
		return apPesoIncrementoPromedio;
	}

	public void setApPesoIncrementoPromedio(BigDecimal apPesoIncrementoPromedio) {
		this.apPesoIncrementoPromedio = apPesoIncrementoPromedio;
	}

	public BigDecimal getApPesoIncrementoSemana1() {
		return apPesoIncrementoSemana1;
	}

	public void setApPesoIncrementoSemana1(BigDecimal apPesoIncrementoSemana1) {
		this.apPesoIncrementoSemana1 = apPesoIncrementoSemana1;
	}

	public BigDecimal getApPesoIncrementoSemana2() {
		return apPesoIncrementoSemana2;
	}

	public void setApPesoIncrementoSemana2(BigDecimal apPesoIncrementoSemana2) {
		this.apPesoIncrementoSemana2 = apPesoIncrementoSemana2;
	}

	public BigDecimal getApPesoIncrementoSemana3() {
		return apPesoIncrementoSemana3;
	}

	public void setApPesoIncrementoSemana3(BigDecimal apPesoIncrementoSemana3) {
		this.apPesoIncrementoSemana3 = apPesoIncrementoSemana3;
	}

	public BigDecimal getApPesoIncrementoSemana4() {
		return apPesoIncrementoSemana4;
	}

	public void setApPesoIncrementoSemana4(BigDecimal apPesoIncrementoSemana4) {
		this.apPesoIncrementoSemana4 = apPesoIncrementoSemana4;
	}

	public BigDecimal getApPesoPromedioActual() {
		return apPesoPromedioActual;
	}

	public void setApPesoPromedioActual(BigDecimal apPesoPromedioActual) {
		this.apPesoPromedioActual = apPesoPromedioActual;
	}

	public BigDecimal getApPesoSobreIdeal() {
		return apPesoSobreIdeal;
	}

	public void setApPesoSobreIdeal(BigDecimal apPesoSobreIdeal) {
		this.apPesoSobreIdeal = apPesoSobreIdeal;
	}

	public String getApPiscina() {
		return apPiscina;
	}

	public void setApPiscina(String apPiscina) {
		this.apPiscina = apPiscina;
	}

	public BigDecimal getApRaleo() {
		return apRaleo;
	}

	public void setApRaleo(BigDecimal apRaleo) {
		this.apRaleo = apRaleo;
	}

	public String getApSector() {
		return apSector;
	}

	public void setApSector(String apSector) {
		this.apSector = apSector;
	}

	public BigDecimal getApSobrevivenciaMetroCuadrado() {
		return apSobrevivenciaMetroCuadrado;
	}

	public void setApSobrevivenciaMetroCuadrado(BigDecimal apSobrevivenciaMetroCuadrado) {
		this.apSobrevivenciaMetroCuadrado = apSobrevivenciaMetroCuadrado;
	}

}
