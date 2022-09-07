package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author javier tj
 */
@Entity
public class AnxTipoComprobanteTablaTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "tc_codigo")
	private String anxTcCodigo;
	@Column(name = "tc_descripcion")
	private String anxTcDescripcion;
	@Column(name = "tc_abreviatura")
	private String anxTcAbreviatura;

	public AnxTipoComprobanteTablaTO() {
	}

	public AnxTipoComprobanteTablaTO(String anxTcCodigo, String anxTcDescripcion, String anxTcAbreviatura) {
		this.anxTcCodigo = anxTcCodigo;
		this.anxTcDescripcion = anxTcDescripcion;
		this.anxTcAbreviatura = anxTcAbreviatura;
	}

	public String getAnxTcAbreviatura() {
		return anxTcAbreviatura;
	}

	public void setAnxTcAbreviatura(String anxTcAbreviatura) {
		this.anxTcAbreviatura = anxTcAbreviatura;
	}

	public String getAnxTcCodigo() {
		return anxTcCodigo;
	}

	public void setAnxTcCodigo(String anxTcCodigo) {
		this.anxTcCodigo = anxTcCodigo;
	}

	public String getAnxTcDescripcion() {
		return anxTcDescripcion;
	}

	public void setAnxTcDescripcion(String anxTcDescripcion) {
		this.anxTcDescripcion = anxTcDescripcion;
	}

}
