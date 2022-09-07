/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdListaSectorConHectareajeTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "bod_codigo")
	private String bodCodigo;
	
	@Column(name = "sec_codigo")
	private String secCodigo;

	@Column(name = "sec_nombre")
	private String secNombre;

	

	@Column(name = "bod_nombre")
	private String bodNombre;

	@Column(name = "sec_hectareaje")
	private java.math.BigDecimal secHectareaje;

	public PrdListaSectorConHectareajeTO() {
	}

	public PrdListaSectorConHectareajeTO(String secCodigo, String secNombre, String bodCodigo, String bodNombre,
			BigDecimal secHectareaje) {
		this.secCodigo = secCodigo;
		this.secNombre = secNombre;
		this.bodCodigo = bodCodigo;
		this.bodNombre = bodNombre;
		this.secHectareaje = secHectareaje;
	}

	public String getBodCodigo() {
		return bodCodigo;
	}

	public void setBodCodigo(String bodCodigo) {
		this.bodCodigo = bodCodigo;
	}

	public String getBodNombre() {
		return bodNombre;
	}

	public void setBodNombre(String bodNombre) {
		this.bodNombre = bodNombre;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	public BigDecimal getSecHectareaje() {
		return secHectareaje;
	}

	public void setSecHectareaje(BigDecimal secHectareaje) {
		this.secHectareaje = secHectareaje;
	}

	public String getSecNombre() {
		return secNombre;
	}

	public void setSecNombre(String secNombre) {
		this.secNombre = secNombre;
	}
}
