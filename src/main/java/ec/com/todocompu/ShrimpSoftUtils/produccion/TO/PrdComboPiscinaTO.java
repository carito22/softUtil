package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdComboPiscinaTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "pis_numero")
	private String pisNumero;
	@Column(name = "pis_nombre")
	private String pisNombre;
	@Column(name = "pis_hectareaje")
	private BigDecimal pisHectareaje;

	public PrdComboPiscinaTO() {
	}

	public PrdComboPiscinaTO(String pisNumero, String pisNombre, BigDecimal pisHectareaje) {
		this.pisNumero = pisNumero;
		this.pisNombre = pisNombre;
		this.pisHectareaje = pisHectareaje;
	}

	public BigDecimal getPisHectareaje() {
		return pisHectareaje;
	}

	public void setPisHectareaje(BigDecimal pisHectareaje) {
		this.pisHectareaje = pisHectareaje;
	}

	public String getPisNombre() {
		return pisNombre;
	}

	public void setPisNombre(String pisNombre) {
		this.pisNombre = pisNombre;
	}

	public String getPisNumero() {
		return pisNumero;
	}

	public void setPisNumero(String pisNumero) {
		this.pisNumero = pisNumero;
	}

	@Override
	public String toString() {
		return this.pisNumero + " " + this.pisNombre;
	}

}
