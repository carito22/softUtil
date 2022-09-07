/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class RhProvisionFechasTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Integer id;

	@Column(name = "prov_id")
	private String provId;

	@Column(name = "prov_nombres")
	private String provNombres;

	@Column(name = "prov_mes")
	private String provMes;

	@Column(name = "prov_valor")
	private java.math.BigDecimal provValor;

	public RhProvisionFechasTO() {
	}

	public RhProvisionFechasTO(String provId, String provNombres, String provMes, BigDecimal provValor, Integer id) {
		this.provId = provId;
		this.provNombres = provNombres;
		this.provMes = provMes;
		this.provValor = provValor;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProvId() {
		return provId;
	}

	public void setProvId(String provId) {
		this.provId = provId;
	}

	public String getProvNombres() {
		return provNombres;
	}

	public void setProvNombres(String provNombres) {
		this.provNombres = provNombres;
	}

	public String getProvMes() {
		return provMes;
	}

	public void setProvMes(String provMes) {
		this.provMes = provMes;
	}

	public BigDecimal getProvValor() {
		return provValor;
	}

	public void setProvValor(BigDecimal provValor) {
		this.provValor = provValor;
	}

	@Override
	public String toString() {
		return this.provId + " " + this.provNombres + " " + this.provMes + " " + this.provValor;
	}
}
