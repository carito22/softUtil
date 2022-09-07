package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CarolValdiviezo
 */
@Entity
public class InvGuiaRemisionTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "guia_empresa")
    private String guiaEmpresa;

    @Column(name = "guia_periodo")
    private String guiaPeriodo;

    @Column(name = "guia_numero")
    private String guiaNumero;

    @Column(name = "guia_documento_numero")
    private String guiaDocumentoNumero;

    @Column(name = "guia_anulado")
    private boolean guiaAnulado;

    @Column(name = "guia_pendiente")
    private boolean guiaPendiente;

    @Column(name = "guia_fecha_emision")
    private String guiaFechaEmision;

    @Column(name = "trans_empresa")
    private String transEmpresa;

    @Column(name = "trans_codigo")
    private String transCodigo;

    @Column(name = "guia_placa")
    private String guiaPlaca;

    @Column(name = "guia_fecha_inicio_transporte")
    private String guiaFechaInicioTransporte;

    @Column(name = "guia_fecha_fin_transporte")
    private String guiaFechaFinTransporte;

    @Column(name = "guia_identificacion_transportista")
    private String guiaIdentificacionTransportista;

    @Column(name = "guia_punto_partida")
    private String guiaPuntoPartida;

    @Column(name = "nro_documento")
    private String nroDocumento;

    @Column(name = "tipo_documento")
    private String tipoDocumento;

    @Column(name = "nro_autorizacion")
    private String nroAutorizacion;

    @Column(name = "guia_motivo_traslado")
    private String guiaMotivoTraslado;

    @Column(name = "guia_punto_llegada")
    private String guiaPuntoLlegada;

    @Column(name = "cli_empresa")
    private String cliEmpresa;

    @Column(name = "cli_codigo")
    private String cliCodigo;

    @Column(name = "guia_codigo_establecimiento")
    private String guiaCodigoEstablecimiento;

    @Column(name = "guia_documento_aduanero")
    private String guiaDocumentoAduanero;

    @Column(name = "guia_ruta")
    private String guiaRuta;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    @Column(name = "guia_informacion_adicional")
    private String guiaInformacionAdicional;

    @Column(name = "guia_clave_acceso_externa")
    private String guiaClaveAccesoExterna;
    @Column(name = "guia_tipo_movil")
    private String guiaTipoMovil;
    @Column(name = "guia_recibidor")
    private String guiaRecibidor;
    @Column(name = "guia_sello")
    private String guiaSello;

    public InvGuiaRemisionTO() {
    }

    public InvGuiaRemisionTO(Integer id, String guiaEmpresa, String guiaPeriodo, String guiaNumero, String guiaDocumentoNumero, boolean guiaAnulado, boolean guiaPendiente, String guiaFechaEmision, String transEmpresa, String transCodigo, String guiaPlaca, String guiaFechaInicioTransporte, String guiaFechaFinTransporte, String guiaIdentificacionTransportista, String guiaPuntoPartida, String nroDocumento, String tipoDocumento, String nroAutorizacion, String guiaMotivoTraslado, String guiaPuntoLlegada, String cliEmpresa, String cliCodigo, String guiaCodigoEstablecimiento, String guiaDocumentoAduanero, String guiaRuta, String usrCodigo, String usrFechaInserta, String guiaInformacionAdicional) {
        this.id = id;
        this.guiaEmpresa = guiaEmpresa;
        this.guiaPeriodo = guiaPeriodo;
        this.guiaNumero = guiaNumero;
        this.guiaDocumentoNumero = guiaDocumentoNumero;
        this.guiaAnulado = guiaAnulado;
        this.guiaPendiente = guiaPendiente;
        this.guiaFechaEmision = guiaFechaEmision;
        this.transEmpresa = transEmpresa;
        this.transCodigo = transCodigo;
        this.guiaPlaca = guiaPlaca;
        this.guiaFechaInicioTransporte = guiaFechaInicioTransporte;
        this.guiaFechaFinTransporte = guiaFechaFinTransporte;
        this.guiaIdentificacionTransportista = guiaIdentificacionTransportista;
        this.guiaPuntoPartida = guiaPuntoPartida;
        this.nroDocumento = nroDocumento;
        this.tipoDocumento = tipoDocumento;
        this.nroAutorizacion = nroAutorizacion;
        this.guiaMotivoTraslado = guiaMotivoTraslado;
        this.guiaPuntoLlegada = guiaPuntoLlegada;
        this.cliEmpresa = cliEmpresa;
        this.cliCodigo = cliCodigo;
        this.guiaCodigoEstablecimiento = guiaCodigoEstablecimiento;
        this.guiaDocumentoAduanero = guiaDocumentoAduanero;
        this.guiaRuta = guiaRuta;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.guiaInformacionAdicional = guiaInformacionAdicional;
    }

    public String getGuiaEmpresa() {
        return guiaEmpresa;
    }

    public void setGuiaEmpresa(String guiaEmpresa) {
        this.guiaEmpresa = guiaEmpresa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public boolean isGuiaAnulado() {
        return guiaAnulado;
    }

    public void setGuiaAnulado(boolean guiaAnulado) {
        this.guiaAnulado = guiaAnulado;
    }

    public String getGuiaFechaEmision() {
        return guiaFechaEmision;
    }

    public void setGuiaFechaEmision(String guiaFechaEmision) {
        this.guiaFechaEmision = guiaFechaEmision;
    }

    public String getTransEmpresa() {
        return transEmpresa;
    }

    public void setTransEmpresa(String transEmpresa) {
        this.transEmpresa = transEmpresa;
    }

    public String getTransCodigo() {
        return transCodigo;
    }

    public void setTransCodigo(String transCodigo) {
        this.transCodigo = transCodigo;
    }

    public String getGuiaPlaca() {
        return guiaPlaca;
    }

    public void setGuiaPlaca(String guiaPlaca) {
        this.guiaPlaca = guiaPlaca;
    }

    public String getGuiaFechaInicioTransporte() {
        return guiaFechaInicioTransporte;
    }

    public void setGuiaFechaInicioTransporte(String guiaFechaInicioTransporte) {
        this.guiaFechaInicioTransporte = guiaFechaInicioTransporte;
    }

    public String getGuiaFechaFinTransporte() {
        return guiaFechaFinTransporte;
    }

    public void setGuiaFechaFinTransporte(String guiaFechaFinTransporte) {
        this.guiaFechaFinTransporte = guiaFechaFinTransporte;
    }

    public String getGuiaIdentificacionTransportista() {
        return guiaIdentificacionTransportista;
    }

    public void setGuiaIdentificacionTransportista(String guiaIdentificacionTransportista) {
        this.guiaIdentificacionTransportista = guiaIdentificacionTransportista;
    }

    public String getGuiaPuntoPartida() {
        return guiaPuntoPartida;
    }

    public void setGuiaPuntoPartida(String guiaPuntoPartida) {
        this.guiaPuntoPartida = guiaPuntoPartida;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNroAutorizacion() {
        return nroAutorizacion;
    }

    public void setNroAutorizacion(String nroAutorizacion) {
        this.nroAutorizacion = nroAutorizacion;
    }

    public String getGuiaMotivoTraslado() {
        return guiaMotivoTraslado;
    }

    public void setGuiaMotivoTraslado(String guiaMotivoTraslado) {
        this.guiaMotivoTraslado = guiaMotivoTraslado;
    }

    public String getGuiaPuntoLlegada() {
        return guiaPuntoLlegada;
    }

    public void setGuiaPuntoLlegada(String guiaPuntoLlegada) {
        this.guiaPuntoLlegada = guiaPuntoLlegada;
    }

    public String getCliEmpresa() {
        return cliEmpresa;
    }

    public void setCliEmpresa(String cliEmpresa) {
        this.cliEmpresa = cliEmpresa;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getGuiaCodigoEstablecimiento() {
        return guiaCodigoEstablecimiento;
    }

    public void setGuiaCodigoEstablecimiento(String guiaCodigoEstablecimiento) {
        this.guiaCodigoEstablecimiento = guiaCodigoEstablecimiento;
    }

    public String getGuiaDocumentoAduanero() {
        return guiaDocumentoAduanero;
    }

    public void setGuiaDocumentoAduanero(String guiaDocumentoAduanero) {
        this.guiaDocumentoAduanero = guiaDocumentoAduanero;
    }

    public String getGuiaRuta() {
        return guiaRuta;
    }

    public void setGuiaRuta(String guiaRuta) {
        this.guiaRuta = guiaRuta;
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

    public String getGuiaDocumentoNumero() {
        return guiaDocumentoNumero;
    }

    public void setGuiaDocumentoNumero(String guiaDocumentoNumero) {
        this.guiaDocumentoNumero = guiaDocumentoNumero;
    }

    public String getGuiaInformacionAdicional() {
        return guiaInformacionAdicional;
    }

    public void setGuiaInformacionAdicional(String guiaInformacionAdicional) {
        this.guiaInformacionAdicional = guiaInformacionAdicional;
    }

    public boolean isGuiaPendiente() {
        return guiaPendiente;
    }

    public void setGuiaPendiente(boolean guiaPendiente) {
        this.guiaPendiente = guiaPendiente;
    }

    public String getGuiaClaveAccesoExterna() {
        return guiaClaveAccesoExterna;
    }

    public void setGuiaClaveAccesoExterna(String guiaClaveAccesoExterna) {
        this.guiaClaveAccesoExterna = guiaClaveAccesoExterna;
    }

    public String getGuiaTipoMovil() {
        return guiaTipoMovil;
    }

    public void setGuiaTipoMovil(String guiaTipoMovil) {
        this.guiaTipoMovil = guiaTipoMovil;
    }

    public String getGuiaRecibidor() {
        return guiaRecibidor;
    }

    public void setGuiaRecibidor(String guiaRecibidor) {
        this.guiaRecibidor = guiaRecibidor;
    }

    public String getGuiaSello() {
        return guiaSello;
    }

    public void setGuiaSello(String guiaSello) {
        this.guiaSello = guiaSello;
    }

}
