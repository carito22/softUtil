/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
public class AnxGuiaRemisionElectronicaTO implements java.io.Serializable {

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

    @Column(name = "guia_empresa")
    private String guiaEmpresa;

    @Column(name = "guia_periodo")
    private String guiaPeriodo;

    @Column(name = "guia_numero")
    private String guiaNumero;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    private String guiaFecha;

    public AnxGuiaRemisionElectronicaTO() {
    }

    public AnxGuiaRemisionElectronicaTO(Integer eSecuencial, String eTipoAmbiente, String eClaveAcceso, String eEstado, String eAutorizacionNumero, String eAutorizacionFecha, byte[] eXml, Boolean eEnviadoPorCorreo, String guiaEmpresa, String guiaPeriodo, String guiaNumero, String usrEmpresa, String usrCodigo, String usrFechaInserta, String guiaFecha) {
        this.eSecuencial = eSecuencial;
        this.eTipoAmbiente = eTipoAmbiente;
        this.eClaveAcceso = eClaveAcceso;
        this.eEstado = eEstado;
        this.eAutorizacionNumero = eAutorizacionNumero;
        this.eAutorizacionFecha = eAutorizacionFecha;
        this.eXml = eXml;
        this.eEnviadoPorCorreo = eEnviadoPorCorreo;
        this.guiaEmpresa = guiaEmpresa;
        this.guiaPeriodo = guiaPeriodo;
        this.guiaNumero = guiaNumero;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.guiaFecha = guiaFecha;
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

    public String geteClaveAcceso() {
        return eClaveAcceso;
    }

    public void seteClaveAcceso(String eClaveAcceso) {
        this.eClaveAcceso = eClaveAcceso;
    }

    public String geteEstado() {
        return eEstado;
    }

    public void seteEstado(String eEstado) {
        this.eEstado = eEstado;
    }

    public String geteAutorizacionNumero() {
        return eAutorizacionNumero;
    }

    public void seteAutorizacionNumero(String eAutorizacionNumero) {
        this.eAutorizacionNumero = eAutorizacionNumero;
    }

    public String geteAutorizacionFecha() {
        return eAutorizacionFecha;
    }

    public void seteAutorizacionFecha(String eAutorizacionFecha) {
        this.eAutorizacionFecha = eAutorizacionFecha;
    }

    public byte[] geteXml() {
        return eXml;
    }

    public void seteXml(byte[] eXml) {
        this.eXml = eXml;
    }

    public Boolean geteEnviadoPorCorreo() {
        return eEnviadoPorCorreo;
    }

    public void seteEnviadoPorCorreo(Boolean eEnviadoPorCorreo) {
        this.eEnviadoPorCorreo = eEnviadoPorCorreo;
    }

    public String getGuiaEmpresa() {
        return guiaEmpresa;
    }

    public void setGuiaEmpresa(String guiaEmpresa) {
        this.guiaEmpresa = guiaEmpresa;
    }

    public String getGuiaPeriodo() {
        return guiaPeriodo;
    }

    public void setGuiaPeriodo(String guiaPeriodo) {
        this.guiaPeriodo = guiaPeriodo;
    }

    public String getGuiaNumero() {
        return guiaNumero;
    }

    public void setGuiaNumero(String guiaNumero) {
        this.guiaNumero = guiaNumero;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getGuiaFecha() {
        return guiaFecha;
    }

    public void setGuiaFecha(String guiaFecha) {
        this.guiaFecha = guiaFecha;
    }

}
