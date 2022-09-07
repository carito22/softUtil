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
public class AnxCompraElectronicaTO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "e_secuencial")
	private Integer eSecuencial;

	@Column(name = "e_tipo_ambiente")
	private String eTipoAmbiente;

	@Column(name = "e_clave_acceso")
	private String eClaveAcceso;

	@Column(name = "e_estado")
	private String eEstado;

	@Column(name = "e_autorizacion_numero")
	private String eAutorizacionNumero;

	@Column(name = "e_autorizacion_fecha")
	private String eAutorizacionFecha;

	
	@Column(name = "e_xml")
	private byte[] eXml;

	@Column(name = "e_enviado_por_correo")
	private Boolean eEnviadoPorCorreo;

	@Column(name = "comp_empresa")
	private String compEmpresa;

	@Column(name = "comp_periodo")
	private String compPeriodo;

	@Column(name = "comp_motivo")
	private String compMotivo;

	@Column(name = "comp_numero")
	private String compNumero;

	@Column(name = "usr_empresa")
	private String usrEmpresa;

	@Column(name = "usr_codigo")
	private String usrCodigo;

	@Column(name = "usr_fecha_inserta")
	private String usrFechaInserta;

	public AnxCompraElectronicaTO() {
	}

	public AnxCompraElectronicaTO(Integer eSecuencial, String eTipoAmbiente, String eClaveAcceso, String eEstado,
			String eAutorizacionNumero, String eAutorizacionFecha, byte[] eXml, Boolean eEnviadoPorCorreo,
			String compEmpresa, String compPeriodo, String compMotivo, String compNumero, String usrEmpresa,
			String usrCodigo, String usrFechaInserta) {
		this.eSecuencial = eSecuencial;
		this.eTipoAmbiente = eTipoAmbiente;
		this.eClaveAcceso = eClaveAcceso;
		this.eEstado = eEstado;
		this.eAutorizacionNumero = eAutorizacionNumero;
		this.eAutorizacionFecha = eAutorizacionFecha;
		this.eXml = eXml;
		this.eEnviadoPorCorreo = eEnviadoPorCorreo;
		this.compEmpresa = compEmpresa;
		this.compPeriodo = compPeriodo;
		this.compMotivo = compMotivo;
		this.compNumero = compNumero;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
	}

	public String getCompEmpresa() {
		return compEmpresa;
	}

	public void setCompEmpresa(String compEmpresa) {
		this.compEmpresa = compEmpresa;
	}

	public String getCompMotivo() {
		return compMotivo;
	}

	public void setCompMotivo(String compMotivo) {
		this.compMotivo = compMotivo;
	}

	public String getCompNumero() {
		return compNumero;
	}

	public void setCompNumero(String compNumero) {
		this.compNumero = compNumero;
	}

	public String getCompPeriodo() {
		return compPeriodo;
	}

	public void setCompPeriodo(String compPeriodo) {
		this.compPeriodo = compPeriodo;
	}

	public String geteAutorizacionFecha() {
		return eAutorizacionFecha;
	}

	public void seteAutorizacionFecha(String eAutorizacionFecha) {
		this.eAutorizacionFecha = eAutorizacionFecha;
	}

	public String geteAutorizacionNumero() {
		return eAutorizacionNumero;
	}

	public void seteAutorizacionNumero(String eAutorizacionNumero) {
		this.eAutorizacionNumero = eAutorizacionNumero;
	}

	public String geteClaveAcceso() {
		return eClaveAcceso;
	}

	public void seteClaveAcceso(String eClaveAcceso) {
		this.eClaveAcceso = eClaveAcceso;
	}

	public Boolean geteEnviadoPorCorreo() {
		return eEnviadoPorCorreo;
	}

	public void seteEnviadoPorCorreo(Boolean eEnviadoPorCorreo) {
		this.eEnviadoPorCorreo = eEnviadoPorCorreo;
	}

	public String geteEstado() {
		return eEstado;
	}

	public void seteEstado(String eEstado) {
		this.eEstado = eEstado;
	}

	public Integer geteSecuencial() {
		return eSecuencial;
	}

	public void seteSecuencial(Integer eSecuencial) {
		this.eSecuencial = eSecuencial;
	}

	public String geteTipoAmbiente() {
		return eTipoAmbiente;
	}

	public void seteTipoAmbiente(String eTipoAmbiente) {
		this.eTipoAmbiente = eTipoAmbiente;
	}

	public byte[] geteXml() {
		return eXml;
	}

	public void seteXml(byte[] eXml) {
		this.eXml = eXml;
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