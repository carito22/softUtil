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
public class InvProveedorCategoriaTO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "pc_empresa")
	private String pcEmpresa;
	@Id
	@Column(name = "pc_codigo")
	private String pcCodigo;

	@Column(name = "pc_detalle")
	private String pcDetalle;

	@Column(name = "pc_aplica_retencion_iva")
	private Boolean pcAplicaRetencionIva;

	@Column(name = "usr_empresa")
	private String usrEmpresa;

	@Column(name = "usr_codigo")
	private String usrCodigo;

	@Column(name = "usr_fecha_inserta")
	private String usrFechaInserta;

	public InvProveedorCategoriaTO() {
	}

	public InvProveedorCategoriaTO(String pcEmpresa, String pcCodigo, String pcDetalle, Boolean pcAplicaRetencionIva,
			String usrEmpresa, String usrCodigo, String usrFechaInserta) {
		this.pcEmpresa = pcEmpresa;
		this.pcCodigo = pcCodigo;
		this.pcDetalle = pcDetalle;
		this.pcAplicaRetencionIva = pcAplicaRetencionIva;

		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public String getPcCodigo() {
		return pcCodigo;
	}

	public void setPcCodigo(String pcCodigo) {
		this.pcCodigo = pcCodigo;
	}

	public String getPcDetalle() {
		return pcDetalle;
	}

	public void setPcDetalle(String pcDetalle) {
		this.pcDetalle = pcDetalle;
	}

	public String getPcEmpresa() {
		return pcEmpresa;
	}

	public void setPcEmpresa(String pcEmpresa) {
		this.pcEmpresa = pcEmpresa;
	}

	public Boolean getPcAplicaRetencionIva() {
		return pcAplicaRetencionIva;
	}

	public void setPcAplicaRetencionIva(Boolean pcAplicaRetencionIva) {
		this.pcAplicaRetencionIva = pcAplicaRetencionIva;
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

}