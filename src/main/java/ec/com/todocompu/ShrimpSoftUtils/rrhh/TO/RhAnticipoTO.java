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
public class RhAnticipoTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ant_secuencial")
	private Integer antSecuencial;

	@Column(name = "ant_valor")
	private BigDecimal antValor;

	@Column(name = "ant_forma_pago")
	private String antFormasPago;

	@Column(name = "ant_reversado")
	private Boolean reversar;

	@Column(name = "emp_id")
	private String empId;

	@Column(name = "sec_codigo")
	private String secCodigo;

	@Column(name = "emp_empresa")
	private String empEmpresa;

	public RhAnticipoTO() {
	}

	public RhAnticipoTO(Integer antSecuencial, BigDecimal antValor, String antFormasPago, Boolean reversar,
			String empId, String secCodigo, String empEmpresa) {
		super();
		this.antSecuencial = antSecuencial;
		this.antValor = antValor;
		this.antFormasPago = antFormasPago;
		this.reversar = reversar;
		this.empId = empId;
		this.secCodigo = secCodigo;
		this.empEmpresa = empEmpresa;
	}

	public Integer getAntSecuencial() {
		return antSecuencial;
	}

	public void setAntSecuencial(Integer antSecuencial) {
		this.antSecuencial = antSecuencial;
	}

	public BigDecimal getAntValor() {
		return antValor;
	}

	public void setAntValor(BigDecimal antValor) {
		this.antValor = antValor;
	}

	public String getAntFormasPago() {
		return antFormasPago;
	}

	public void setAntFormasPago(String antFormasPago) {
		this.antFormasPago = antFormasPago;
	}

	public Boolean getReversar() {
		return reversar;
	}

	public void setReversar(Boolean reversar) {
		this.reversar = reversar;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	public String getEmpEmpresa() {
		return empEmpresa;
	}

	public void setEmpEmpresa(String empEmpresa) {
		this.empEmpresa = empEmpresa;
	}

}
