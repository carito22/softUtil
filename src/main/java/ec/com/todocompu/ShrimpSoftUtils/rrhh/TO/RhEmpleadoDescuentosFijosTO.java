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
 * @author javier tj
 */
@Entity
public class RhEmpleadoDescuentosFijosTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "desc_secuencial")
	private Integer descSecuencial;

	@Column(name = "desc_valor")
	private BigDecimal descValor;

	@Column(name = "emp_empresa")
	private String emp_empresa;

	@Column(name = "emp_id")
	private String emp_id;

	@Column(name = "mot_empresa")
	private String mot_empresa;

	@Column(name = "mot_detalle")
	private String mot_detalle;

	public RhEmpleadoDescuentosFijosTO() {
	}

	public RhEmpleadoDescuentosFijosTO(Integer descSecuencial, BigDecimal descValor, String emp_empresa, String emp_id,
			String mot_empresa, String mot_detalle) {
		this.descSecuencial = descSecuencial;
		this.descValor = descValor;
		this.emp_empresa = emp_empresa;
		this.emp_id = emp_id;
		this.mot_empresa = mot_empresa;
		this.mot_detalle = mot_detalle;
	}

	public Integer getDescSecuencial() {
		return descSecuencial;
	}

	public void setDescSecuencial(Integer descSecuencial) {
		this.descSecuencial = descSecuencial;
	}

	public BigDecimal getDescValor() {
		return descValor;
	}

	public void setDescValor(BigDecimal descValor) {
		this.descValor = descValor;
	}

	public String getEmp_empresa() {
		return emp_empresa;
	}

	public void setEmp_empresa(String emp_empresa) {
		this.emp_empresa = emp_empresa;
	}

	public String getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}

	public String getMot_detalle() {
		return mot_detalle;
	}

	public void setMot_detalle(String mot_detalle) {
		this.mot_detalle = mot_detalle;
	}

	public String getMot_empresa() {
		return mot_empresa;
	}

	public void setMot_empresa(String mot_empresa) {
		this.mot_empresa = mot_empresa;
	}

}
