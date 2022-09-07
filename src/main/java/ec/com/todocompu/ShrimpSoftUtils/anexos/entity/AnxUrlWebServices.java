package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "anx_url_web_services", schema = "anexo")
public class AnxUrlWebServices implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
	@Column(name = "url_secuencial")
	private Integer urlSecuencial;
	@Column(name = "url_ambiente_produccion")
	private String urlAmbienteProduccion;
	@Column(name = "url_ambiente_pruebas")
	private String urlAmbientePruebas;

	public AnxUrlWebServices() {
	}

	public AnxUrlWebServices(Integer urlSecuencial) {
		this.urlSecuencial = urlSecuencial;
	}

	public Integer getUrlSecuencial() {
		return urlSecuencial;
	}

	public void setUrlSecuencial(Integer urlSecuencial) {
		this.urlSecuencial = urlSecuencial;
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

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (urlSecuencial != null ? urlSecuencial.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof AnxUrlWebServices)) {
			return false;
		}
		AnxUrlWebServices other = (AnxUrlWebServices) object;
		if ((this.urlSecuencial == null && other.urlSecuencial != null)
				|| (this.urlSecuencial != null && !this.urlSecuencial.equals(other.urlSecuencial))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "anexos.entity.AnxUrlWebServices[ urlSecuencial=" + urlSecuencial + " ]";
	}

}
