package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

public class RhBonoDetalleTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String secCodigo;
	private String pisNumero;
	private String empId;
	private String empApellidosNombres;
	private String bonoConcepto;
	private Boolean bonoDeducible;
	private String bonoObservacion;
	private Integer bonoCantidad;//
	private BigDecimal bonoPrecio;//
	private BigDecimal bonoValor;
	private String conDetDocumento;

	public RhBonoDetalleTO() {
	}

	public RhBonoDetalleTO(String secCodigo, String pisNumero, String empId, String empApellidosNombres,
			String bonoConcepto, Boolean bonoDeducible, String bonoObservacion, Integer bonoCantidad,
			BigDecimal bonoPrecio, BigDecimal bonoValor, String conDetDocumento) {
		this.secCodigo = secCodigo;
		this.pisNumero = pisNumero;
		this.empId = empId;
		this.empApellidosNombres = empApellidosNombres;
		this.bonoConcepto = bonoConcepto;
		this.bonoDeducible = bonoDeducible;
		this.bonoObservacion = bonoObservacion;
		this.bonoCantidad = bonoCantidad;
		this.bonoPrecio = bonoPrecio;
		this.bonoValor = bonoValor;
		this.conDetDocumento = conDetDocumento;
	}

	public Integer getBonoCantidad() {
		return bonoCantidad;
	}

	public void setBonoCantidad(Integer bonoCantidad) {
		this.bonoCantidad = bonoCantidad;
	}

	public String getBonoConcepto() {
		return bonoConcepto;
	}

	public void setBonoConcepto(String bonoConcepto) {
		this.bonoConcepto = bonoConcepto;
	}

	public Boolean getBonoDeducible() {
		return bonoDeducible;
	}

	public void setBonoDeducible(Boolean bonoDeducible) {
		this.bonoDeducible = bonoDeducible;
	}

	public BigDecimal getBonoPrecio() {
		return bonoPrecio;
	}

	public void setBonoPrecio(BigDecimal bonoPrecio) {
		this.bonoPrecio = bonoPrecio;
	}

	public BigDecimal getBonoValor() {
		return bonoValor;
	}

	public void setBonoValor(BigDecimal bonoValor) {
		this.bonoValor = bonoValor;
	}

	public String getConDetDocumento() {
		return conDetDocumento;
	}

	public void setConDetDocumento(String conDetDocumento) {
		this.conDetDocumento = conDetDocumento;
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

	public String getPisNumero() {
		return pisNumero;
	}

	public void setPisNumero(String pisNumero) {
		this.pisNumero = pisNumero;
	}

	public String getBonoObservacion() {
		return bonoObservacion;
	}

	public void setBonoObservacion(String bonoObservacion) {
		this.bonoObservacion = bonoObservacion;
	}

}
