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
public class RhListaBonoConceptoTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "bc_secuencial")
	private Integer bcSecuencia;

	@Column(name = "bc_detalle")
	private String bcDetalle;

	@Column(name = "bc_valor")
	private BigDecimal bcValor;

	@Column(name = "bc_valor_fijo")
	private Boolean bcValorFijo;

	@Column(name = "bc_inactivo")
	private Boolean bcInactivo;

	public RhListaBonoConceptoTO() {
	}

	public RhListaBonoConceptoTO(Integer bcSecuencia, String bcDetalle, BigDecimal bcValor, Boolean bcValorFijo,
			Boolean bcInactivo) {
		this.bcSecuencia = bcSecuencia;
		this.bcDetalle = bcDetalle;
		this.bcValor = bcValor;
		this.bcValorFijo = bcValorFijo;
		this.bcInactivo = bcInactivo;
	}

	public String getBcDetalle() {
		return bcDetalle;
	}

	public void setBcDetalle(String bcDetalle) {
		this.bcDetalle = bcDetalle;
	}

	public Boolean getBcInactivo() {
		return bcInactivo;
	}

	public void setBcInactivo(Boolean bcInactivo) {
		this.bcInactivo = bcInactivo;
	}

	public Integer getBcSecuencia() {
		return bcSecuencia;
	}

	public void setBcSecuencia(Integer bcSecuencia) {
		this.bcSecuencia = bcSecuencia;
	}

	public BigDecimal getBcValor() {
		return bcValor;
	}

	public void setBcValor(BigDecimal bcValor) {
		this.bcValor = bcValor;
	}

	public Boolean getBcValorFijo() {
		return bcValorFijo;
	}

	public void setBcValorFijo(Boolean bcValorFijo) {
		this.bcValorFijo = bcValorFijo;
	}

}
