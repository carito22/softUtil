
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PiscinaGrameajeTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	private Integer id;
	@Column(name = "gra_piscina_codigo")
	private String graPiscinaCodigo;
	@Column(name = "gra_piscina_nombre")
	private String graPiscinaNombre;
	@Column(name = "gra_hectareas")
	private BigDecimal graHectareas;
	@Column(name = "gra_fecha_siembra")
	private Date graFechaSiembra;
	@Column(name = "gra_dias_cultivo")
	private Integer graDiasCultivo;
	@Column(name = "gra_cantidad_larvas")
	private Integer graCantidadLarvas;
	@Column(name = "gra_peso_anterior")
	private BigDecimal graPesoAnterior;
	@Column(name = "gra_peso_actual")
	private BigDecimal graPesoActual;
	@Column(name = "gra_biomasa")
	private BigDecimal graBiomasa;
	@Column(name = "gra_animales_m2")
	private BigDecimal graAnimalesM2;
	@Column(name = "gra_sobrevivencia_predefinido")
	private BigDecimal graSobrevivencia;
	@Column(name = "gra_comentario")
	private String graComentario;

	public PiscinaGrameajeTO() {
	}

	public PiscinaGrameajeTO(String graPiscinaCodigo, String graPiscinaNombre, BigDecimal graHectareas,
			Date graFechaSiembra, Integer graDiasCultivo, Integer graCantidadLarvas, BigDecimal graPesoAnterior, 
                        BigDecimal graPesoActual, BigDecimal graBiomasa, BigDecimal graAnimalesM2, BigDecimal graSobrevivencia,
			String graComentario) {
		super();
		this.graPiscinaCodigo = graPiscinaCodigo;
		this.graPiscinaNombre = graPiscinaNombre;
		this.graHectareas = graHectareas;
		this.graFechaSiembra = graFechaSiembra;
		this.graDiasCultivo = graDiasCultivo;
		this.graCantidadLarvas = graCantidadLarvas;
		this.graPesoAnterior = graPesoAnterior;
		this.graPesoActual = graPesoActual;
		this.graBiomasa = graBiomasa;
		this.graAnimalesM2 = graAnimalesM2;
		this.graSobrevivencia = graSobrevivencia;
		this.graComentario = graComentario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGraPiscinaCodigo() {
		return graPiscinaCodigo;
	}

	public void setGraPiscinaCodigo(String graPiscinaCodigo) {
		this.graPiscinaCodigo = graPiscinaCodigo;
	}

	public String getGraPiscinaNombre() {
		return graPiscinaNombre;
	}

	public void setGraPiscinaNombre(String graPiscinaNombre) {
		this.graPiscinaNombre = graPiscinaNombre;
	}

	public BigDecimal getGraHectareas() {
		return graHectareas;
	}

	public void setGraHectareas(BigDecimal graHectareas) {
		this.graHectareas = graHectareas;
	}

	public Date getGraFechaSiembra() {
		return graFechaSiembra;
	}

	public void setGraFechaSiembra(Date graFechaSiembra) {
		this.graFechaSiembra = graFechaSiembra;
	}

	public Integer getGraDiasCultivo() {
		return graDiasCultivo;
	}

	public void setGraDiasCultivo(Integer graDiasCultivo) {
		this.graDiasCultivo = graDiasCultivo;
	}

	public Integer getGraCantidadLarvas() {
		return graCantidadLarvas;
	}

	public void setGraCantidadLarvas(Integer graCantidadLarvas) {
		this.graCantidadLarvas = graCantidadLarvas;
	}

	public BigDecimal getGraPesoAnterior() {
		return graPesoAnterior;
	}

	public void setGraPesoAnterior(BigDecimal graPesoAnterior) {
		this.graPesoAnterior = graPesoAnterior;
	}

	public BigDecimal getGraPesoActual() {
		return graPesoActual;
	}

	public void setGraPesoActual(BigDecimal graPesoActual) {
		this.graPesoActual = graPesoActual;
	}

	public BigDecimal getGraBiomasa() {
		return graBiomasa;
	}

	public void setGraBiomasa(BigDecimal graBiomasa) {
		this.graBiomasa = graBiomasa;
	}

	public BigDecimal getGraAnimalesM2() {
		return graAnimalesM2;
	}

	public void setGraAnimalesM2(BigDecimal graAnimalesM2) {
		this.graAnimalesM2 = graAnimalesM2;
	}

	public BigDecimal getGraSobrevivencia() {
		return graSobrevivencia;
	}

	public void setGraSobrevivencia(BigDecimal graSobrevivencia) {
		this.graSobrevivencia = graSobrevivencia;
	}

	public String getGraComentario() {
		return graComentario;
	}

	public void setGraComentario(String graComentario) {
		this.graComentario = graComentario;
	}

}
