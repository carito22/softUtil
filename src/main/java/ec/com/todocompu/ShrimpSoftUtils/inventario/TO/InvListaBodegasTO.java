package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InvListaBodegasTO implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "bod_codigo")
	private String bodCodigo;
	@Column(name = "bod_nombre")
	private String bodNombre;
	@Column(name = "bod_responsable")
	private String bodResponsable;
	@Column(name = "bod_inactiva")
	private Boolean bodInactiva;
	@Column(name = "sec_codigo")
	private String codigoCP;

	public InvListaBodegasTO() {
	}

	public InvListaBodegasTO(String bodCodigo, String bodNombre, String bodResponsable, Boolean bodInactiva,
			String codigoCP) {
		this.bodCodigo = bodCodigo;
		this.bodNombre = bodNombre;
		this.bodResponsable = bodResponsable;
		this.bodInactiva = bodInactiva;
		this.codigoCP = codigoCP;
	}

	public String getBodCodigo() {
		return bodCodigo;
	}

	public void setBodCodigo(String bodCodigo) {
		this.bodCodigo = bodCodigo;
	}

	public Boolean getBodInactiva() {
		return bodInactiva;
	}

	public void setBodInactiva(Boolean bodInactiva) {
		this.bodInactiva = bodInactiva;
	}

	public String getBodNombre() {
		return bodNombre;
	}

	public void setBodNombre(String bodNombre) {
		this.bodNombre = bodNombre;
	}

	public String getBodResponsable() {
		return bodResponsable;
	}

	public void setBodResponsable(String bodResponsable) {
		this.bodResponsable = bodResponsable;
	}

	public String getCodigoCP() {
		return codigoCP;
	}

	public void setCodigoCP(String codigoCP) {
		this.codigoCP = codigoCP;
	}
}
