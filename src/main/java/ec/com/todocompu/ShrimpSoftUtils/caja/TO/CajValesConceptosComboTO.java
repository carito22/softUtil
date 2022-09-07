package ec.com.todocompu.ShrimpSoftUtils.caja.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CajValesConceptosComboTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "conc_codigo")
	private String concCodigo;

	@Column(name = "conc_detalle")
	private String concDetalle;

	@Column(name = "conc_empresa")
	private String concEmpresa;

	@Column(name = "conc_inactivo")
	private Boolean concInactivo;

	@Column(name = "usr_empresa")
	private String usrEmpresa;

	@Column(name = "usr_codigo")
	private String usrCodigo;

	@Column(name = "usr_fecha_inserta")
	private String usrFechaInserta;

	public CajValesConceptosComboTO() {
	}

	public CajValesConceptosComboTO(String concCodigo, String concDetalle, String concEmpresa) {
		this.concCodigo = concCodigo;
		this.concDetalle = concDetalle;
		this.concEmpresa = concEmpresa;
	}

	public CajValesConceptosComboTO(String concCodigo, String concDetalle, String concEmpresa, Boolean concInactivo,
			String usrEmpresa, String usrCodigo, String usrFechaInserta) {
		this.concCodigo = concCodigo;
		this.concDetalle = concDetalle;
		this.concEmpresa = concEmpresa;
		this.concInactivo = concInactivo;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public String getConcCodigo() {
		return concCodigo;
	}

	public void setConcCodigo(String concCodigo) {
		this.concCodigo = concCodigo;
	}

	public String getConcDetalle() {
		return concDetalle;
	}

	public void setConcDetalle(String concDetalle) {
		this.concDetalle = concDetalle;
	}

	public String getConcEmpresa() {
		return concEmpresa;
	}

	public void setConcEmpresa(String concEmpresa) {
		this.concEmpresa = concEmpresa;
	}

	public Boolean getConcInactivo() {
		return concInactivo;
	}

	public void setConcInactivo(Boolean concInactivo) {
		this.concInactivo = concInactivo;
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

	public String getUsrFechaInserta() {
		return usrFechaInserta;
	}

	public void setUsrFechaInserta(String usrFechaInserta) {
		this.usrFechaInserta = usrFechaInserta;
	}

	@Override
	public String toString() {
		return this.concCodigo + " | " + this.concDetalle;
	}
}
