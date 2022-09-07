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
public class PrdListaFunAnalisisPesosComplementoTO implements Serializable {

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

	@Column(name = "ap_fecha")
	private String apFecha;

	@Column(name = "ap_incremento")
	private BigDecimal apIncremento;

	public PrdListaFunAnalisisPesosComplementoTO(String apSector, String apPiscina, String apCorrida, String apFecha,
			BigDecimal apIncremento, Integer id) {
		this.apSector = apSector;
		this.apPiscina = apPiscina;
		this.apCorrida = apCorrida;
		this.apFecha = apFecha;
		this.apIncremento = apIncremento;
		this.id = id;
	}

	public PrdListaFunAnalisisPesosComplementoTO() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getApCorrida() {
		return apCorrida;
	}

	public void setApCorrida(String apCorrida) {
		this.apCorrida = apCorrida;
	}

	public String getApFecha() {
		return apFecha;
	}

	public void setApFecha(String apFecha) {
		this.apFecha = apFecha;
	}

	public BigDecimal getApIncremento() {
		return apIncremento;
	}

	public void setApIncremento(BigDecimal apIncremento) {
		this.apIncremento = apIncremento;
	}

	public String getApPiscina() {
		return apPiscina;
	}

	public void setApPiscina(String apPiscina) {
		this.apPiscina = apPiscina;
	}

	public String getApSector() {
		return apSector;
	}

	public void setApSector(String apSector) {
		this.apSector = apSector;
	}
}
