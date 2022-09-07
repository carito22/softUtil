package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "anx_dpa_ecuador", schema = "anexo")
@XmlRootElement
public class AnxDpaEcuador implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	protected AnxDpaEcuadorPK anxDpaEcuadorPK;
	@Column(name = "nombre_provincia")
	private String nombreProvincia;
	@Column(name = "nombre_canton")
	private String nombreCanton;
	@Column(name = "nombre_parroquia")
	private String nombreParroquia;

	public AnxDpaEcuador() {
	}

	public AnxDpaEcuador(AnxDpaEcuadorPK anxDpaEcuadorPK) {
		this.anxDpaEcuadorPK = anxDpaEcuadorPK;
	}

	public AnxDpaEcuador(AnxDpaEcuadorPK anxDpaEcuadorPK, String nombreProvincia, String nombreCanton,
			String nombreParroquia) {
		this.anxDpaEcuadorPK = anxDpaEcuadorPK;
		this.nombreProvincia = nombreProvincia;
		this.nombreCanton = nombreCanton;
		this.nombreParroquia = nombreParroquia;
	}

	public AnxDpaEcuador(String codigoProvincia, String codigoCanton, String codigoParroquia) {
		this.anxDpaEcuadorPK = new AnxDpaEcuadorPK(codigoProvincia, codigoCanton, codigoParroquia);
	}

	public AnxDpaEcuadorPK getAnxDpaEcuadorPK() {
		return anxDpaEcuadorPK;
	}

	public void setAnxDpaEcuadorPK(AnxDpaEcuadorPK anxDpaEcuadorPK) {
		this.anxDpaEcuadorPK = anxDpaEcuadorPK;
	}

	public String getNombreProvincia() {
		return nombreProvincia;
	}

	public void setNombreProvincia(String nombreProvincia) {
		this.nombreProvincia = nombreProvincia;
	}

	public String getNombreCanton() {
		return nombreCanton;
	}

	public void setNombreCanton(String nombreCanton) {
		this.nombreCanton = nombreCanton;
	}

	public String getNombreParroquia() {
		return nombreParroquia;
	}

	public void setNombreParroquia(String nombreParroquia) {
		this.nombreParroquia = nombreParroquia;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (anxDpaEcuadorPK != null ? anxDpaEcuadorPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof AnxDpaEcuador)) {
			return false;
		}
		AnxDpaEcuador other = (AnxDpaEcuador) object;
		if ((this.anxDpaEcuadorPK == null && other.anxDpaEcuadorPK != null)
				|| (this.anxDpaEcuadorPK != null && !this.anxDpaEcuadorPK.equals(other.anxDpaEcuadorPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "anexos.entity.AnxDpaEcuador[ anxDpaEcuadorPK=" + anxDpaEcuadorPK + " ]";
	}

}
