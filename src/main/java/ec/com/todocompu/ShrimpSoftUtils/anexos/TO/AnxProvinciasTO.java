/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class AnxProvinciasTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "provincia_codigo")
	private String provinciaCodigo;

	@Column(name = "provincia_nombre")
	private String provinciaNombre;

	@Column(name = "canton_codigo")
	private String cantonCodigo;

	@Column(name = "canton_nombre")
	private String cantonNombre;

	public AnxProvinciasTO(String provinciaCodigo, String provinciaNombre, String cantonCodigo, String cantonNombre) {
		this.provinciaCodigo = provinciaCodigo;
		this.provinciaNombre = provinciaNombre;
		this.cantonCodigo = cantonCodigo;
		this.cantonNombre = cantonNombre;
	}

	public String getCantonCodigo() {
		return cantonCodigo;
	}

	public void setCantonCodigo(String cantonCodigo) {
		this.cantonCodigo = cantonCodigo;
	}

	public String getCantonNombre() {
		return cantonNombre;
	}

	public void setCantonNombre(String cantonNombre) {
		this.cantonNombre = cantonNombre;
	}

	public String getProvinciaCodigo() {
		return provinciaCodigo;
	}

	public void setProvinciaCodigo(String provinciaCodigo) {
		this.provinciaCodigo = provinciaCodigo;
	}

	public String getProvinciaNombre() {
		return provinciaNombre;
	}

	public void setProvinciaNombre(String provinciaNombre) {
		this.provinciaNombre = provinciaNombre;
	}

}