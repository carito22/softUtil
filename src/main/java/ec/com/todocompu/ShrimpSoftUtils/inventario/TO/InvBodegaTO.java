/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvBodegaTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "bod_empresa")
	private String empCodigo;

	@Column(name = "bod_codigo")
	private String bodCodigo;

	@Column(name = "bod_nombre")
	private String bodNombre;

	@Column(name = "bod_inactiva")
	private Boolean bodInactiva;

	@Column(name = "sec_empresa")
	private String secEmpresa;

	@Column(name = "sec_codigo")
	private String secCodigo;

	@Column(name = "det_empresa")
	private String detEmpresa;

	@Column(name = "det_usuario")
	private String detUsuario;

	@Column(name = "usr_empresa")
	private String usrEmpresa;

	@Column(name = "usr_codigo")
	private String usrInsertaBodega;

	@Column(name = "usr_fecha_inserta")
	private String usrFechaInsertaBodega;

	public InvBodegaTO() {
	}

	public InvBodegaTO(String empCodigo, String bodCodigo, String bodNombre, Boolean bodInactiva, String secEmpresa,
			String secCodigo, String detEmpresa, String detUsuario, String usrEmpresa, String usrInsertaBodega,
			String usrFechaInsertaBodega) {
		this.empCodigo = empCodigo;
		this.bodCodigo = bodCodigo;
		this.bodNombre = bodNombre;
		this.bodInactiva = bodInactiva;
		this.secEmpresa = secEmpresa;
		this.secCodigo = secCodigo;
		this.detEmpresa = detEmpresa;
		this.detUsuario = detUsuario;
		this.usrEmpresa = usrEmpresa;
		this.usrInsertaBodega = usrInsertaBodega;
		this.usrFechaInsertaBodega = usrFechaInsertaBodega;
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

	public String getDetEmpresa() {
		return detEmpresa;
	}

	public void setDetEmpresa(String detEmpresa) {
		this.detEmpresa = detEmpresa;
	}

	public String getDetUsuario() {
		return detUsuario;
	}

	public void setDetUsuario(String detUsuario) {
		this.detUsuario = detUsuario;
	}

	public String getEmpCodigo() {
		return empCodigo;
	}

	public void setEmpCodigo(String empCodigo) {
		this.empCodigo = empCodigo;
	}

	public String getSecCodigo() {
		return secCodigo;
	}

	public void setSecCodigo(String secCodigo) {
		this.secCodigo = secCodigo;
	}

	public String getSecEmpresa() {
		return secEmpresa;
	}

	public void setSecEmpresa(String secEmpresa) {
		this.secEmpresa = secEmpresa;
	}

	public String getUsrEmpresa() {
		return usrEmpresa;
	}

	public void setUsrEmpresa(String usrEmpresa) {
		this.usrEmpresa = usrEmpresa;
	}

	public String getUsrFechaInsertaBodega() {
		return usrFechaInsertaBodega;
	}

	public void setUsrFechaInsertaBodega(String usrFechaInsertaBodega) {
		this.usrFechaInsertaBodega = usrFechaInsertaBodega;
	}

	public String getUsrInsertaBodega() {
		return usrInsertaBodega;
	}

	public void setUsrInsertaBodega(String usrInsertaBodega) {
		this.usrInsertaBodega = usrInsertaBodega;
	}
}
