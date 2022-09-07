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
 * @author Carlos Ajila
 */
@Entity
public class PrdListaGrameajeTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "gra_empresa")
	private String empCodigo;

	@Column(name = "gra_sector")
	private String secCodigo;

	@Column(name = "gra_piscina")
	private String pisNumero;

	@Column(name = "gra_fecha")
	private String graFecha;

	@Column(name = "pis_hectareaje")
	private BigDecimal pisHectareaje;

	public PrdListaGrameajeTO() {
	}

	public PrdListaGrameajeTO(String empCodigo, String secCodigo, String pisNumero, String graFecha,
			BigDecimal pisHectareaje) {
		this.empCodigo = empCodigo;
		this.secCodigo = secCodigo;
		this.pisNumero = pisNumero;
		this.graFecha = graFecha;
		this.pisHectareaje = pisHectareaje;
	}

	public String getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	public String getGraFecha() {
		return graFecha;
	}

	public void setGraFecha(String graFecha) {
		this.graFecha = graFecha;
	}

	public BigDecimal getPisHectareaje() {
		return pisHectareaje;
	}

	public void setPisHectareaje(BigDecimal pisHectareaje) {
		this.pisHectareaje = pisHectareaje;
	}

	public String getPisNumero() {
		return pisNumero;
	}

	public void setPisNumero(String pisNumero) {
		this.pisNumero = pisNumero;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}
}
