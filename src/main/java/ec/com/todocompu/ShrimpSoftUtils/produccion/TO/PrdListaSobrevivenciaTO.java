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

@Entity
public class PrdListaSobrevivenciaTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "sob_codigo")
	private Integer sobCodigo;

	@Column(name = "sob_dias_desde")
	private Integer sobDiasDesde;

	@Column(name = "sob_dias_hasta")
	private Integer sobDiasHasta;

	@Column(name = "sob_sobrevivencia")
	private BigDecimal sobSobrevivencia;

	@Column(name = "sob_alimentacion")
	private BigDecimal sobAlimentacion;

	public PrdListaSobrevivenciaTO() {
	}

	public PrdListaSobrevivenciaTO(Integer sobCodigo, Integer sobDiasDesde, Integer sobDiasHasta,
			BigDecimal sobSobrevivencia, BigDecimal sobAlimentacion) {
		this.sobCodigo = sobCodigo;
		this.sobDiasDesde = sobDiasDesde;
		this.sobDiasHasta = sobDiasHasta;
		this.sobSobrevivencia = sobSobrevivencia;
		this.sobAlimentacion = sobAlimentacion;
	}

	public Integer getSobCodigo() {
		return sobCodigo;
	}

	public void setSobCodigo(Integer sobCodigo) {
		this.sobCodigo = sobCodigo;
	}

	public Integer getSobDiasDesde() {
		return sobDiasDesde;
	}

	public void setSobDiasDesde(Integer sobDiasDesde) {
		this.sobDiasDesde = sobDiasDesde;
	}

	public Integer getSobDiasHasta() {
		return sobDiasHasta;
	}

	public void setSobDiasHasta(Integer sobDiasHasta) {
		this.sobDiasHasta = sobDiasHasta;
	}

	public BigDecimal getSobSobrevivencia() {
		return sobSobrevivencia;
	}

	public void setSobSobrevivencia(BigDecimal sobSobrevivencia) {
		this.sobSobrevivencia = sobSobrevivencia;
	}

	public BigDecimal getSobAlimentacion() {
		return sobAlimentacion;
	}

	public void setSobAlimentacion(BigDecimal sobAlimentacion) {
		this.sobAlimentacion = sobAlimentacion;
	}
}