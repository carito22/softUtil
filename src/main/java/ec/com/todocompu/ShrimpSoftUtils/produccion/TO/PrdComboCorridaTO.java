package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdComboCorridaTO implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "cor_numero")
	private String corNumero;
	@Column(name = "cor_hectareas")
	private BigDecimal corHectareas;
	@Column(name = "cor_numero_larvas")
	private Integer corNumeroLarvas;
	@Column(name = "desde")
	private String desde;
	@Column(name = "hasta")
	private String hasta;

	public PrdComboCorridaTO() {
	}

	public PrdComboCorridaTO(String corNumero, BigDecimal corHectareas, Integer corNumeroLarvas, String desde,
			String hasta) {
		this.corNumero = corNumero;
		this.corHectareas = corHectareas;
		this.corNumeroLarvas = corNumeroLarvas;
		this.desde = desde;
		this.hasta = hasta;
	}

	public BigDecimal getCorHectareas() {
		return corHectareas;
	}

	public void setCorHectareas(BigDecimal corHectareas) {
		this.corHectareas = corHectareas;
	}

	public String getCorNumero() {
		return corNumero;
	}

	public void setCorNumero(String corNumero) {
		this.corNumero = corNumero;
	}

	public Integer getCorNumeroLarvas() {
		return corNumeroLarvas;
	}

	public void setCorNumeroLarvas(Integer corNumeroLarvas) {
		this.corNumeroLarvas = corNumeroLarvas;
	}

	public String getDesde() {
		return desde;
	}

	public void setDesde(String desde) {
		this.desde = desde;
	}

	public String getHasta() {
		return hasta;
	}

	public void setHasta(String hasta) {
		this.hasta = hasta;
	}

	@Override
	public String toString() {
		return this.corNumero + " | " + this.desde + " | " + this.hasta;
	}
}
