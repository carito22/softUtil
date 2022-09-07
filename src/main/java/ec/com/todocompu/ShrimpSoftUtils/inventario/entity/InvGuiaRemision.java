/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
@Table(name = "inv_guia_remision", schema = "inventario")
public class InvGuiaRemision implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvGuiaRemisionPK invGuiaRemisionPK;

    @Column(name = "guia_anulado")
    private boolean guiaAnulado;

    @Column(name = "guia_pendiente")
    private boolean guiaPendiente;

    @Column(name = "guia_fecha_emision")
    @Temporal(TemporalType.DATE)
    private Date guiaFechaEmision;

    @JoinColumns({
        @JoinColumn(name = "trans_empresa", referencedColumnName = "trans_empresa"),
        @JoinColumn(name = "trans_codigo", referencedColumnName = "trans_codigo")})
    @ManyToOne
    private InvTransportista invTransportista;

    @Column(name = "guia_documento_numero")
    private String guiaDocumentoNumero;

    @Column(name = "guia_placa")
    private String guiaPlaca;

    @Column(name = "guia_fecha_inicio_transporte")
    @Temporal(TemporalType.DATE)
    private Date guiaFechaInicioTransporte;

    @Column(name = "guia_fecha_fin_transporte")
    @Temporal(TemporalType.DATE)
    private Date guiaFechaFinTransporte;

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

    @JoinColumns({
        @JoinColumn(name = "cli_empresa", referencedColumnName = "cli_empresa"),
        @JoinColumn(name = "cli_codigo", referencedColumnName = "cli_codigo")})
    @ManyToOne
    private InvCliente invCliente;

    @Column(name = "guia_codigo_establecimiento")
    private String guiaCodigoEstablecimiento;

    @Column(name = "guia_documento_aduanero")
    private String guiaDocumentoAduanero;

    @Column(name = "guia_ruta")
    private String guiaRuta;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;

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

    @Column(name = "guia_gramos")
    private BigDecimal guiaGramos;
    @Column(name = "guia_libras")
    private BigDecimal guiaLibras;
    @Column(name = "guia_hora")
    private String guiaHora;
    @Column(name = "guia_inp")
    private String guiaInp;
    @Column(name = "guia_inp_empresa")
    private String guiaInpEmpresa;
    @Column(name = "guia_inp_cli_codigo")
    private String guiaInpCliCodigo;
    
    @Column(name = "guia_remision_ruta")
    private BigDecimal guiaRemisionRuta;

    public InvGuiaRemision() {
    }

    public InvGuiaRemision(InvGuiaRemisionPK invGuiaRemisionPK, boolean guiaAnulado, boolean guiaPendiente, Date guiaFechaEmision, InvTransportista invTransportista, String guiaDocumentoNumero, String guiaPlaca, Date guiaFechaInicioTransporte, Date guiaFechaFinTransporte, String guiaPuntoPartida, String nroDocumento, String tipoDocumento, String nroAutorizacion, String guiaMotivoTraslado, String guiaPuntoLlegada, InvCliente invCliente, String guiaCodigoEstablecimiento, String guiaDocumentoAduanero, String guiaRuta, String usrCodigo, Date usrFechaInserta, String guiaInformacionAdicional) {
        this.invGuiaRemisionPK = invGuiaRemisionPK;
        this.guiaAnulado = guiaAnulado;
        this.guiaPendiente = guiaPendiente;
        this.guiaFechaEmision = guiaFechaEmision;
        this.invTransportista = invTransportista;
        this.guiaDocumentoNumero = guiaDocumentoNumero;
        this.guiaPlaca = guiaPlaca;
        this.guiaFechaInicioTransporte = guiaFechaInicioTransporte;
        this.guiaFechaFinTransporte = guiaFechaFinTransporte;
        this.guiaPuntoPartida = guiaPuntoPartida;
        this.nroDocumento = nroDocumento;
        this.tipoDocumento = tipoDocumento;
        this.nroAutorizacion = nroAutorizacion;
        this.guiaMotivoTraslado = guiaMotivoTraslado;
        this.guiaPuntoLlegada = guiaPuntoLlegada;
        this.invCliente = invCliente;
        this.guiaCodigoEstablecimiento = guiaCodigoEstablecimiento;
        this.guiaDocumentoAduanero = guiaDocumentoAduanero;
        this.guiaRuta = guiaRuta;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.guiaInformacionAdicional = guiaInformacionAdicional;
    }

    public InvGuiaRemisionPK getInvGuiaRemisionPK() {
        return invGuiaRemisionPK;
    }

    public void setInvGuiaRemisionPK(InvGuiaRemisionPK invGuiaRemisionPK) {
        this.invGuiaRemisionPK = invGuiaRemisionPK;
    }

    public boolean isGuiaAnulado() {
        return guiaAnulado;
    }

    public void setGuiaAnulado(boolean guiaAnulado) {
        this.guiaAnulado = guiaAnulado;
    }

    public Date getGuiaFechaEmision() {
        return guiaFechaEmision;
    }

    public void setGuiaFechaEmision(Date guiaFechaEmision) {
        this.guiaFechaEmision = guiaFechaEmision;
    }

    public InvTransportista getInvTransportista() {
        return invTransportista;
    }

    public void setInvTransportista(InvTransportista invTransportista) {
        this.invTransportista = invTransportista;
    }

    public String getGuiaPlaca() {
        return guiaPlaca;
    }

    public void setGuiaPlaca(String guiaPlaca) {
        this.guiaPlaca = guiaPlaca;
    }

    public Date getGuiaFechaInicioTransporte() {
        return guiaFechaInicioTransporte;
    }

    public void setGuiaFechaInicioTransporte(Date guiaFechaInicioTransporte) {
        this.guiaFechaInicioTransporte = guiaFechaInicioTransporte;
    }

    public Date getGuiaFechaFinTransporte() {
        return guiaFechaFinTransporte;
    }

    public void setGuiaFechaFinTransporte(Date guiaFechaFinTransporte) {
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

    public String getGuiaDocumentoNumero() {
        return guiaDocumentoNumero;
    }

    public void setGuiaDocumentoNumero(String guiaDocumentoNumero) {
        this.guiaDocumentoNumero = guiaDocumentoNumero;
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

    public InvCliente getInvCliente() {
        return invCliente;
    }

    public void setInvCliente(InvCliente invCliente) {
        this.invCliente = invCliente;
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

    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
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

    public BigDecimal getGuiaGramos() {
        return guiaGramos;
    }

    public void setGuiaGramos(BigDecimal guiaGramos) {
        this.guiaGramos = guiaGramos;
    }

    public BigDecimal getGuiaLibras() {
        return guiaLibras;
    }

    public void setGuiaLibras(BigDecimal guiaLibras) {
        this.guiaLibras = guiaLibras;
    }

    public String getGuiaHora() {
        return guiaHora;
    }

    public void setGuiaHora(String guiaHora) {
        this.guiaHora = guiaHora;
    }

    public String getGuiaInp() {
        return guiaInp;
    }

    public void setGuiaInp(String guiaInp) {
        this.guiaInp = guiaInp;
    }

    public String getGuiaInpEmpresa() {
        return guiaInpEmpresa;
    }

    public void setGuiaInpEmpresa(String guiaInpEmpresa) {
        this.guiaInpEmpresa = guiaInpEmpresa;
    }

    public String getGuiaInpCliCodigo() {
        return guiaInpCliCodigo;
    }

    public void setGuiaInpCliCodigo(String guiaInpCliCodigo) {
        this.guiaInpCliCodigo = guiaInpCliCodigo;
    }

    public BigDecimal getGuiaRemisionRuta() {
        return guiaRemisionRuta;
    }

    public void setGuiaRemisionRuta(BigDecimal guiaRemisionRuta) {
        this.guiaRemisionRuta = guiaRemisionRuta;
    }
    
}
