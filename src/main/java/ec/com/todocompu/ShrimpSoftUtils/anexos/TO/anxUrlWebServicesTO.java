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
 * @author charly
 */
@Entity
public class anxUrlWebServicesTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "url_secuencial")
	private Integer urlSecuencial;

	@Column(name = "url_ambiente_produccion")
	private String urlAmbienteProduccion;

	@Column(name = "url_ambiente_pruebas")
	private String urlAmbientePruebas;

	@Column(name = "usr_codigo")
	private String usrCodigo;

	@Column(name = "usr_empresa")
	private String usrEmpresa;

	public anxUrlWebServicesTO() {
	}

	public anxUrlWebServicesTO(Integer urlSecuencial, String urlAmbienteProduccion, String urlAmbientePruebas,
			String usrCodigo, String usrEmpresa) {
		this.urlSecuencial = urlSecuencial;
		this.urlAmbienteProduccion = urlAmbienteProduccion;
		this.urlAmbientePruebas = urlAmbientePruebas;
		this.usrCodigo = usrCodigo;
		this.usrEmpresa = usrEmpresa;
	}

	public String getUrlAmbienteProduccion() {
		return urlAmbienteProduccion;
	}

	public void setUrlAmbienteProduccion(String urlAmbienteProduccion) {
		this.urlAmbienteProduccion = urlAmbienteProduccion;
	}

	public String getUrlAmbientePruebas() {
		return urlAmbientePruebas;
	}

	public void setUrlAmbientePruebas(String urlAmbientePruebas) {
		this.urlAmbientePruebas = urlAmbientePruebas;
	}

	public Integer getUrlSecuencial() {
		return urlSecuencial;
	}

	public void setUrlSecuencial(Integer urlSecuencial) {
		this.urlSecuencial = urlSecuencial;
	}

	public String getUsrCodigo() {
		return usrCodigo;
	}

	public void setUsrCodigo(String usrCodigo) {
		this.usrCodigo = usrCodigo;
	}

	public String getUsrEmpresa() {
		return usrEmpresa;
	}

	public void setUsrEmpresa(String usrEmpresa) {
		this.usrEmpresa = usrEmpresa;
	}

}