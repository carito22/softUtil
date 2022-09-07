package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RhParametrosTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "par_iess_porcentaje_aporte_individual")
	private BigDecimal parIessPorcentajeAporteIndividual;

	@Column(name = "par_iess_porcentaje_aporte_extendido")
	private BigDecimal parIessPorcentajeAporteExtendido;

	@Column(name = "par_iess_porcentaje_aporte_patronal")
	private BigDecimal parIessPorcentajeAportePatronal;

	@Column(name = "par_iess_porcentaje_iece")
	private BigDecimal parIessPorcentajeIece;

	@Column(name = "par_iess_porcentaje_secap")
	private BigDecimal parIessPorcentajeSecap;

	@Column(name = "par_salario_minimo_vital")
	private BigDecimal parSalarioMinimoVital;

	public RhParametrosTO() {
	}

	public RhParametrosTO(BigDecimal parIessPorcentajeAporteIndividual, BigDecimal parIessPorcentajeAporteExtendido,
			BigDecimal parIessPorcentajeAportePatronal, BigDecimal parIessPorcentajeIece,
			BigDecimal parIessPorcentajeSecap, BigDecimal parSalarioMinimoVital) {

		this.parIessPorcentajeAporteIndividual = parIessPorcentajeAporteIndividual;
		this.parIessPorcentajeAporteExtendido = parIessPorcentajeAporteExtendido;
		this.parIessPorcentajeAportePatronal = parIessPorcentajeAportePatronal;
		this.parIessPorcentajeIece = parIessPorcentajeIece;
		this.parIessPorcentajeSecap = parIessPorcentajeSecap;
		this.parSalarioMinimoVital = parSalarioMinimoVital;
	}

	public BigDecimal getParIessPorcentajeAporteExtendido() {
		return parIessPorcentajeAporteExtendido;
	}

	public void setParIessPorcentajeAporteExtendido(BigDecimal parIessPorcentajeAporteExtendido) {
		this.parIessPorcentajeAporteExtendido = parIessPorcentajeAporteExtendido;
	}

	public BigDecimal getParIessPorcentajeAporteIndividual() {
		return parIessPorcentajeAporteIndividual;
	}

	public void setParIessPorcentajeAporteIndividual(BigDecimal parIessPorcentajeAporteIndividual) {
		this.parIessPorcentajeAporteIndividual = parIessPorcentajeAporteIndividual;
	}

	public BigDecimal getParIessPorcentajeAportePatronal() {
		return parIessPorcentajeAportePatronal;
	}

	public void setParIessPorcentajeAportePatronal(BigDecimal parIessPorcentajeAportePatronal) {
		this.parIessPorcentajeAportePatronal = parIessPorcentajeAportePatronal;
	}

	public BigDecimal getParIessPorcentajeIece() {
		return parIessPorcentajeIece;
	}

	public void setParIessPorcentajeIece(BigDecimal parIessPorcentajeIece) {
		this.parIessPorcentajeIece = parIessPorcentajeIece;
	}

	public BigDecimal getParIessPorcentajeSecap() {
		return parIessPorcentajeSecap;
	}

	public void setParIessPorcentajeSecap(BigDecimal parIessPorcentajeSecap) {
		this.parIessPorcentajeSecap = parIessPorcentajeSecap;
	}

	public BigDecimal getParSalarioMinimoVital() {
		return parSalarioMinimoVital;
	}

	public void setParSalarioMinimoVital(BigDecimal parSalarioMinimoVital) {
		this.parSalarioMinimoVital = parSalarioMinimoVital;
	}
}
