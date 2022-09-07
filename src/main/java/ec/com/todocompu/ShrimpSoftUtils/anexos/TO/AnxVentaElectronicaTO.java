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
public class AnxVentaElectronicaTO implements java.io.Serializable {

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

	@Column(name = "vta_empresa")
	private String vtaEmpresa;

	@Column(name = "vta_periodo")
	private String vtaPeriodo;

	@Column(name = "vta_motivo")
	private String vtaMotivo;

	@Column(name = "vta_numero")
	private String vtaNumero;

	@Column(name = "usr_empresa")
	private String usrEmpresa;

	@Column(name = "usr_codigo")
	private String usrCodigo;

	@Column(name = "usr_fecha_inserta")
	private String usrFechaInserta;

	// @Column(name = "fp_codigo")
	private String numeroDcto;

	// @Column(name = "fp_codigo")
	private String vtaFecha;

	public AnxVentaElectronicaTO() {
	}

	public AnxVentaElectronicaTO(Integer eSecuencial, String eTipoAmbiente, String eClaveAcceso, String eEstado,
			String eAutorizacionNumero, String eAutorizacionFecha, byte[] eXml, Boolean eEnviadoPorCorreo,
			String vtaEmpresa, String vtaPeriodo, String vtaMotivo, String vtaNumero, String usrEmpresa,
			String usrCodigo, String usrFechaInserta, String numeroDcto, String vtaFecha) {
		this.eSecuencial = eSecuencial;
		this.eTipoAmbiente = eTipoAmbiente;
		this.eClaveAcceso = eClaveAcceso;
		this.eEstado = eEstado;
		this.eAutorizacionNumero = eAutorizacionNumero;
		this.eAutorizacionFecha = eAutorizacionFecha;
		this.eXml = eXml;
		this.eEnviadoPorCorreo = eEnviadoPorCorreo;
		this.vtaEmpresa = vtaEmpresa;
		this.vtaPeriodo = vtaPeriodo;
		this.vtaMotivo = vtaMotivo;
		this.vtaNumero = vtaNumero;
		this.usrEmpresa = usrEmpresa;
		this.usrCodigo = usrCodigo;
		this.usrFechaInserta = usrFechaInserta;
		this.numeroDcto = numeroDcto;
		this.vtaFecha = vtaFecha;
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

	public String getNumeroDcto() {
		return numeroDcto;
	}

	public void setNumeroDcto(String numeroDcto) {
		this.numeroDcto = numeroDcto;
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

	public String getVtaEmpresa() {
		return vtaEmpresa;
	}

	public void setVtaEmpresa(String vtaEmpresa) {
		this.vtaEmpresa = vtaEmpresa;
	}

	public String getVtaFecha() {
		return vtaFecha;
	}

	public void setVtaFecha(String vtaFecha) {
		this.vtaFecha = vtaFecha;
	}

	public String getVtaMotivo() {
		return vtaMotivo;
	}

	public void setVtaMotivo(String vtaMotivo) {
		this.vtaMotivo = vtaMotivo;
	}

	public String getVtaNumero() {
		return vtaNumero;
	}

	public void setVtaNumero(String vtaNumero) {
		this.vtaNumero = vtaNumero;
	}

	public String getVtaPeriodo() {
		return vtaPeriodo;
	}

	public void setVtaPeriodo(String vtaPeriodo) {
		this.vtaPeriodo = vtaPeriodo;
	}

}