/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
public class InvConsultaGuiaRemisionTO implements java.io.Serializable {

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

    @Column(name = "trans_tipo_identificacion")
    private String transTipoIdentificacion;

    @Column(name = "trans_nro_identificacion")
    private String transNroIdentificacion;

    @Column(name = "trans_nombres")
    private String transNombres;

    @Column(name = "guia_placa")
    private String guiaPlaca;

    @Column(name = "guia_fecha_inicio_transporte")
    private String guiaFechaInicioTransporte;

    @Column(name = "guia_fecha_fin_transporte")
    private String guiaFechaFinTransporte;

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

    @Column(name = "guia_identificacion_destinatario")
    private String guiaIdentificacionDestinatario;

    @Column(name = "guia_nombres_destinatario")
    private String guiaNombresDestinatario;

    @Column(name = "guia_codigo_establecimiento")
    private String guiaCodigoEstablecimiento;

    @Column(name = "guia_documento_aduanero")
    private String guiaDocumentoAduanero;

    @Column(name = "guia_ruta")
    private String guiaRuta;

    @Column(name = "guia_electronica_estado")
    private String guiaElectronicaEstado;

    public InvConsultaGuiaRemisionTO() {
    }

    public InvConsultaGuiaRemisionTO(Integer id, String guiaEmpresa, String guiaPeriodo, String guiaNumero, String guiaDocumentoNumero, boolean guiaAnulado, boolean guiaPendiente, String guiaFechaEmision, String transTipoIdentificacion, String transNroIdentificacion, String transNombres, String guiaPlaca, String guiaFechaInicioTransporte, String guiaFechaFinTransporte, String guiaPuntoPartida, String nroDocumento, String tipoDocumento, String nroAutorizacion, String guiaMotivoTraslado, String guiaPuntoLlegada, String guiaIdentificacionDestinatario, String guiaNombresDestinatario, String guiaCodigoEstablecimiento, String guiaDocumentoAduanero, String guiaRuta) {
        this.id = id;
        this.guiaEmpresa = guiaEmpresa;
        this.guiaPeriodo = guiaPeriodo;
        this.guiaNumero = guiaNumero;
        this.guiaDocumentoNumero = guiaDocumentoNumero;
        this.guiaAnulado = guiaAnulado;
        this.guiaPendiente = guiaPendiente;
        this.guiaFechaEmision = guiaFechaEmision;
        this.transTipoIdentificacion = transTipoIdentificacion;
        this.transNroIdentificacion = transNroIdentificacion;
        this.transNombres = transNombres;
        this.guiaPlaca = guiaPlaca;
        this.guiaFechaInicioTransporte = guiaFechaInicioTransporte;
        this.guiaFechaFinTransporte = guiaFechaFinTransporte;
        this.guiaPuntoPartida = guiaPuntoPartida;
        this.nroDocumento = nroDocumento;
        this.tipoDocumento = tipoDocumento;
        this.nroAutorizacion = nroAutorizacion;
        this.guiaMotivoTraslado = guiaMotivoTraslado;
        this.guiaPuntoLlegada = guiaPuntoLlegada;
        this.guiaIdentificacionDestinatario = guiaIdentificacionDestinatario;
        this.guiaNombresDestinatario = guiaNombresDestinatario;
        this.guiaCodigoEstablecimiento = guiaCodigoEstablecimiento;
        this.guiaDocumentoAduanero = guiaDocumentoAduanero;
        this.guiaRuta = guiaRuta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getGuiaDocumentoNumero() {
        return guiaDocumentoNumero;
    }

    public void setGuiaDocumentoNumero(String guiaDocumentoNumero) {
        this.guiaDocumentoNumero = guiaDocumentoNumero;
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

    public String getTransTipoIdentificacion() {
        return transTipoIdentificacion;
    }

    public void setTransTipoIdentificacion(String transTipoIdentificacion) {
        this.transTipoIdentificacion = transTipoIdentificacion;
    }

    public String getTransNroIdentificacion() {
        return transNroIdentificacion;
    }

    public void setTransNroIdentificacion(String transNroIdentificacion) {
        this.transNroIdentificacion = transNroIdentificacion;
    }

    public String getTransNombres() {
        return transNombres;
    }

    public void setTransNombres(String transNombres) {
        this.transNombres = transNombres;
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

    public String getGuiaIdentificacionDestinatario() {
        return guiaIdentificacionDestinatario;
    }

    public void setGuiaIdentificacionDestinatario(String guiaIdentificacionDestinatario) {
        this.guiaIdentificacionDestinatario = guiaIdentificacionDestinatario;
    }

    public String getGuiaNombresDestinatario() {
        return guiaNombresDestinatario;
    }

    public void setGuiaNombresDestinatario(String guiaNombresDestinatario) {
        this.guiaNombresDestinatario = guiaNombresDestinatario;
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

    public boolean isGuiaPendiente() {
        return guiaPendiente;
    }

    public void setGuiaPendiente(boolean guiaPendiente) {
        this.guiaPendiente = guiaPendiente;
    }

    public String getGuiaElectronicaEstado() {
        return guiaElectronicaEstado;
    }

    public void setGuiaElectronicaEstado(String guiaElectronicaEstado) {
        this.guiaElectronicaEstado = guiaElectronicaEstado;
    }

}
