/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * @author Andres Guachisaca
 */
// @Entity
public class RhAnticipoDetalleTO implements Serializable {

	private static final long serialVersionUID = 1L;
	// @Id
	// @Column(name = "sec_codigo")
	private String secCodigo;

	// @Column(name = "emp_id")
	private String empId;

	// @Column(name = "veh_empresa")
	private String empApellidosNombres;

	// @Column(name = "ant")
	private BigDecimal antValor;

	// Agregados al jTable
	private String antFormasPago;
	private String conDetDocumento;

	public RhAnticipoDetalleTO() {

	}

	public RhAnticipoDetalleTO(String secCodigo, String empId, String empApellidosNombres, BigDecimal antValor) {
		this.secCodigo = secCodigo;
		this.empId = empId;
		this.empApellidosNombres = empApellidosNombres;
		this.antValor = antValor;
	}

	public RhAnticipoDetalleTO(String secCodigo, String empId, String empApellidosNombres, BigDecimal antValor,
			String antFormasPago, String conDetDocumento) {
		this.secCodigo = secCodigo;
		this.empId = empId;
		this.empApellidosNombres = empApellidosNombres;
		this.antValor = antValor;

		this.antFormasPago = antFormasPago;
		this.conDetDocumento = conDetDocumento;
	}

	public BigDecimal getAntValor() {
		return antValor;
	}

	public void setAntValor(BigDecimal antValor) {
		this.antValor = antValor;
	}

	public String getEmpApellidosNombres() {
		return empApellidosNombres;
	}

	public void setEmpApellidosNombres(String empApellidosNombres) {
		this.empApellidosNombres = empApellidosNombres;
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

	public String getAntFormasPago() {
		return antFormasPago;
	}

	public void setAntFormasPago(String antFormasPago) {
		this.antFormasPago = antFormasPago;
	}

	public String getConDetDocumento() {
		return conDetDocumento;
	}

	public void setConDetDocumento(String conDetDocumento) {
		this.conDetDocumento = conDetDocumento;
	}

}
