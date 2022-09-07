/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@Table(name = "inv_venta_guia_remision", schema = "inventario")
public class InvVentaGuiaRemision implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "det_secuencial")
    private Integer detSecuencial;

    @JoinColumns({
        @JoinColumn(name = "vta_empresa", referencedColumnName = "vta_empresa")
        ,@JoinColumn(name = "vta_periodo", referencedColumnName = "vta_periodo")
        ,@JoinColumn(name = "vta_motivo", referencedColumnName = "vta_motivo")
        ,@JoinColumn(name = "vta_numero", referencedColumnName = "vta_numero")})
    @ManyToOne(optional = false)
    private InvVentas invVentas;

    @JoinColumns({
        @JoinColumn(name = "trans_empresa", referencedColumnName = "trans_empresa")
        ,@JoinColumn(name = "trans_codigo", referencedColumnName = "trans_codigo")})
    @ManyToOne
    private InvTransportista invTransportista;

    @Column(name = "guia_motivo_traslado")
    private String guiaMotivoTraslado;

    @Column(name = "guia_punto_llegada")
    private String guiaPuntoLlegada;

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

    public InvVentaGuiaRemision(Integer detSecuencial, InvVentas invVentas, InvTransportista invTransportista, String guiaMotivoTraslado, String guiaPuntoLlegada, String guiaPlaca, Date guiaFechaInicioTransporte, Date guiaFechaFinTransporte, String guiaPuntoPartida, InvCliente invCliente, String guiaCodigoEstablecimiento, String guiaDocumentoAduanero, String guiaRuta, String usrCodigo, Date usrFechaInserta) {
        this.detSecuencial = detSecuencial;
        this.invVentas = invVentas;
        this.invTransportista = invTransportista;
        this.guiaMotivoTraslado = guiaMotivoTraslado;
        this.guiaPuntoLlegada = guiaPuntoLlegada;
        this.guiaPlaca = guiaPlaca;
        this.guiaFechaInicioTransporte = guiaFechaInicioTransporte;
        this.guiaFechaFinTransporte = guiaFechaFinTransporte;
        this.guiaPuntoPartida = guiaPuntoPartida;
        this.guiaCodigoEstablecimiento = guiaCodigoEstablecimiento;
        this.guiaDocumentoAduanero = guiaDocumentoAduanero;
        this.guiaRuta = guiaRuta;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public InvVentaGuiaRemision() {
    }

    public Integer getDetSecuencial() {
        return detSecuencial;
    }

    public void setDetSecuencial(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public InvVentas getInvVentas() {
        return invVentas;
    }

    public void setInvVentas(InvVentas invVentas) {
        this.invVentas = invVentas;
    }

    public InvTransportista getInvTransportista() {
        return invTransportista;
    }

    public void setInvTransportista(InvTransportista invTransportista) {
        this.invTransportista = invTransportista;
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

}
