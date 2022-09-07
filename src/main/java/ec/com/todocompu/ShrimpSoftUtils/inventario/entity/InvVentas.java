package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "inv_ventas", schema = "inventario")
public class InvVentas implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected InvVentasPK invVentasPK;
    @Column(name = "vta_documento_tipo")
    private String vtaDocumentoTipo;
    @Column(name = "vta_documento_numero")
    private String vtaDocumentoNumero;
    @Column(name = "vta_fecha")
    private Date vtaFecha;
    @Column(name = "vta_fecha_vencimiento")
    private Date vtaFechaVencimiento;
    @Column(name = "vta_iva_vigente")
    private BigDecimal vtaIvaVigente;
    @Column(name = "vta_observaciones")
    private String vtaObservaciones;
    @Column(name = "vta_informacion_adicional")
    private String vtaInformacionAdicional;
    @Column(name = "vta_pendiente")
    private boolean vtaPendiente;
    @Column(name = "vta_revisado")
    private boolean vtaRevisado;
    @Column(name = "vta_anulado")
    private boolean vtaAnulado;
    @Column(name = "vta_forma_pago")
    private String vtaFormaPago;
    @Column(name = "vta_base0")
    private BigDecimal vtaBase0;
    @Column(name = "vta_base_imponible")
    private BigDecimal vtaBaseImponible;
    @Column(name = "vta_base_no_objeto")
    private BigDecimal vtaBaseNoObjeto;
    @Column(name = "vta_base_exenta")
    private BigDecimal vtaBaseExenta;
    @Column(name = "vta_descuento_base0")
    private BigDecimal vtaDescuentoBase0;
    @Column(name = "vta_descuento_base_imponible")
    private BigDecimal vtaDescuentoBaseImponible;
    @Column(name = "vta_descuento_base_no_objeto")
    private BigDecimal vtaDescuentoBaseNoObjeto;
    @Column(name = "vta_descuento_base_exenta")
    private BigDecimal vtaDescuentoBaseExenta;
    @Column(name = "vta_subtotal_base0")
    private BigDecimal vtaSubtotalBase0;
    @Column(name = "vta_subtotal_base_imponible")
    private BigDecimal vtaSubtotalBaseImponible;
    @Column(name = "vta_subtotal_base_no_objeto")
    private BigDecimal vtaSubtotalBaseNoObjeto;
    @Column(name = "vta_subtotal_base_exenta")
    private BigDecimal vtaSubtotalBaseExenta;
    @Column(name = "vta_montoiva")
    private BigDecimal vtaMontoiva;
    @Column(name = "vta_total")
    private BigDecimal vtaTotal;
    @Column(name = "vta_pagado_efectivo")
    private BigDecimal vtaPagadoEfectivo;
    @Column(name = "vta_pagado_dinero_electronico")
    private BigDecimal vtaPagadoDineroElectronico;
    @Column(name = "vta_pagado_tarjeta_credito")
    private BigDecimal vtaPagadoTarjetaCredito;
    @Column(name = "vta_pagado_otros")
    private BigDecimal vtaPagadoOtro;
    @Column(name = "vta_monto_ice")
    private BigDecimal vtaMontoIce;
    @Column(name = "sec_empresa")
    private String secEmpresa;
    @Column(name = "sec_codigo")
    private String secCodigo;
    @Column(name = "cta_empresa")
    private String ctaEmpresa;
    @Column(name = "cta_codigo")
    private String ctaCodigo;
    @Column(name = "con_empresa")
    private String conEmpresa;
    @Column(name = "con_periodo")
    private String conPeriodo;
    @Column(name = "con_tipo")
    private String conTipo;
    @Column(name = "con_numero")
    private String conNumero;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @Column(name = "usr_modifica")
    private String usrModifica;
    @Column(name = "usr_fecha_modifica")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaModifica;
    @Column(name = "usr_comentario")
    private String usrComentario;

    @Size(max = 2147483647)
    @Column(name = "vta_lista_de_precios")
    private String vtaListaDePrecios;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vta_reembolso")
    private boolean vtaReembolso;
    @Size(max = 2147483647)
    @Column(name = "fc_banco")
    private String fcBanco;
    @Size(max = 2147483647)
    @Column(name = "fc_cuenta")
    private String fcCuenta;
    @Size(max = 2147483647)
    @Column(name = "fc_cheque")
    private String fcCheque;
    @Size(max = 2147483647)
    @Column(name = "fc_lote")
    private String fcLote;
    @Size(max = 2147483647)
    @Column(name = "fc_titular")
    private String fcTitular;
    @JoinColumns({
        @JoinColumn(name = "prof_empresa", referencedColumnName = "prof_empresa")
        , @JoinColumn(name = "prof_periodo", referencedColumnName = "prof_periodo")
        , @JoinColumn(name = "prof_motivo", referencedColumnName = "prof_motivo")
        , @JoinColumn(name = "prof_numero", referencedColumnName = "prof_numero")})
    @ManyToOne
    private InvProformas invProformas;
    @JoinColumn(name = "fc_secuencial", referencedColumnName = "fc_secuencial")
    @ManyToOne
    private InvVentasFormaCobro fcSecuencial;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invVentas")
    private List<InvVentasDetalle> invVentasDetalleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invVentas")
    private List<InvVentasRecepcion> invVentasRecepcionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invVentas")
    private List<InvVentasMotivoAnulacion> invVentasMotivoAnulacionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invVentas")
    private List<InvVentasComplemento> invVentasComplementoList;

    @JoinColumns({
        @JoinColumn(name = "cli_empresa", referencedColumnName = "cli_empresa")
        , @JoinColumn(name = "cli_codigo", referencedColumnName = "cli_codigo")})
    @ManyToOne(optional = false)
    private InvCliente invCliente;
    @JoinColumns({
        @JoinColumn(name = "bod_empresa", referencedColumnName = "bod_empresa")
        , @JoinColumn(name = "bod_codigo", referencedColumnName = "bod_codigo")})
    @ManyToOne
    private InvBodega invBodega;

    @Column(name = "vta_recurrente", updatable = false)
    private Integer vtaRecurrente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vta_consignacion", updatable = false)
    private boolean vtaConsignacion;
    @Column(name = "vta_vendedor")
    private String vtaVendedor;
    @Size(max = 2147483647)
    @Column(name = "cli_codigo_establecimiento")
    private String cliCodigoEstablecimiento;
    @Size(max = 2147483647)
    @Column(name = "vta_clave_acceso_externa", updatable = false)
    private String vtaClaveAccesoExterna;
    @Column(name = "vta_codigo_transaccional", updatable = false)
    private String vtaCodigoTransaccional;
    @Column(name = "fecha_ultima_validacion_sri")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimaValidacionSri;
    @Transient
    private Integer id;
    @Column(name = "vta_saldo_importado")
    private boolean vtaSaldoImportado;

    @Column(name = "vta_negociable", updatable = false)
    private boolean vtaNegociable = false;

    public InvVentas() {
    }

    public InvVentas(InvVentasPK invVentasPK) {
        this.invVentasPK = invVentasPK;
    }

    public InvVentas(InvVentasPK invVentasPK, String vtaDocumentoTipo, String vtaDocumentoNumero, Date vtaFecha, Date vtaFechaVencimiento,
            BigDecimal vtaIvaVigente, String vtaObservaciones, String vtaInformacionAdicional, boolean vtaPendiente,
            boolean vtaRevisado, boolean vtaAnulado, String vtaFormaPago, BigDecimal vtaBase0,
            BigDecimal vtaBaseImponible, BigDecimal vtaBaseNoObjeto, BigDecimal vtaBaseExenta,
            BigDecimal vtaDescuentoBase0, BigDecimal vtaDescuentoBaseImponible, BigDecimal vtaDescuentoBaseNoObjeto,
            BigDecimal vtaDescuentoBaseExenta, BigDecimal vtaSubtotalBase0, BigDecimal vtaSubtotalBaseImponible,
            BigDecimal vtaSubtotalBaseNoObjeto, BigDecimal vtaSubtotalBaseExenta, BigDecimal vtaMontoiva,
            BigDecimal vtaTotal, BigDecimal vtaPagadoEfectivo, BigDecimal vtaPagadoDineroElectronico,
            BigDecimal vtaPagadoTarjetaCredito, BigDecimal vtaPagadoOtro, String secEmpresa, String secCodigo,
            String ctaEmpresa, String ctaCodigo, String conEmpresa, String conPeriodo, String conTipo, String conNumero,
            String usrEmpresa, String usrCodigo, Date usrFechaInserta, String usrModifica, Date usrFechaModifica,
            String usrComentario, String vtaListaDePrecios, boolean vtaReembolso, String fcBanco, String fcCuenta, String fcCheque,
            String fcLote, String fcTitular, InvProformas invProformas, InvVentasFormaCobro fcSecuencial, List<InvVentasDetalle> invVentasDetalleList,
            List<InvVentasRecepcion> invVentasRecepcionList, List<InvVentasMotivoAnulacion> invVentasMotivoAnulacionList,
            List<InvVentasComplemento> invVentasComplementoList, InvCliente invCliente, InvBodega invBodega, String vtaVendedor) {
        this.invVentasPK = invVentasPK;
        this.vtaDocumentoTipo = vtaDocumentoTipo;
        this.vtaDocumentoNumero = vtaDocumentoNumero;
        this.vtaFecha = vtaFecha;
        this.vtaFechaVencimiento = vtaFechaVencimiento;
        this.vtaIvaVigente = vtaIvaVigente;
        this.vtaObservaciones = vtaObservaciones;
        this.vtaInformacionAdicional = vtaInformacionAdicional;
        this.vtaPendiente = vtaPendiente;
        this.vtaRevisado = vtaRevisado;
        this.vtaAnulado = vtaAnulado;
        this.vtaFormaPago = vtaFormaPago;
        this.vtaBase0 = vtaBase0;
        this.vtaBaseImponible = vtaBaseImponible;
        this.vtaBaseNoObjeto = vtaBaseNoObjeto;
        this.vtaBaseExenta = vtaBaseExenta;
        this.vtaDescuentoBase0 = vtaDescuentoBase0;
        this.vtaDescuentoBaseImponible = vtaDescuentoBaseImponible;
        this.vtaDescuentoBaseNoObjeto = vtaDescuentoBaseNoObjeto;
        this.vtaDescuentoBaseExenta = vtaDescuentoBaseExenta;
        this.vtaSubtotalBase0 = vtaSubtotalBase0;
        this.vtaSubtotalBaseImponible = vtaSubtotalBaseImponible;
        this.vtaSubtotalBaseNoObjeto = vtaSubtotalBaseNoObjeto;
        this.vtaSubtotalBaseExenta = vtaSubtotalBaseExenta;
        this.vtaMontoiva = vtaMontoiva;
        this.vtaTotal = vtaTotal;
        this.vtaPagadoEfectivo = vtaPagadoEfectivo;
        this.vtaPagadoDineroElectronico = vtaPagadoDineroElectronico;
        this.vtaPagadoTarjetaCredito = vtaPagadoTarjetaCredito;
        this.vtaPagadoOtro = vtaPagadoOtro;
        this.secEmpresa = secEmpresa;
        this.secCodigo = secCodigo;
        this.ctaEmpresa = ctaEmpresa;
        this.ctaCodigo = ctaCodigo;
        this.conEmpresa = conEmpresa;
        this.conPeriodo = conPeriodo;
        this.conTipo = conTipo;
        this.conNumero = conNumero;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.usrModifica = usrModifica;
        this.usrFechaModifica = usrFechaModifica;
        this.usrComentario = usrComentario;
        this.vtaListaDePrecios = vtaListaDePrecios;
        this.vtaReembolso = vtaReembolso;
        this.fcBanco = fcBanco;
        this.fcCuenta = fcCuenta;
        this.fcCheque = fcCheque;
        this.fcLote = fcLote;
        this.fcTitular = fcTitular;
        this.invProformas = invProformas;
        this.fcSecuencial = fcSecuencial;
        this.invVentasDetalleList = invVentasDetalleList;
        this.invVentasRecepcionList = invVentasRecepcionList;
        this.invVentasMotivoAnulacionList = invVentasMotivoAnulacionList;
        this.invVentasComplementoList = invVentasComplementoList;
        this.invCliente = invCliente;
        this.invBodega = invBodega;
        this.vtaVendedor = vtaVendedor;
    }

    public InvVentas(String vtaEmpresa, String vtaPeriodo, String vtaMotivo, String vtaNumero) {
        this.invVentasPK = new InvVentasPK(vtaEmpresa, vtaPeriodo, vtaMotivo, vtaNumero);
    }

    public InvVentasPK getInvVentasPK() {
        return invVentasPK;
    }

    public void setInvVentasPK(InvVentasPK invVentasPK) {
        this.invVentasPK = invVentasPK;
    }

    public String getVtaDocumentoTipo() {
        return vtaDocumentoTipo;
    }

    public void setVtaDocumentoTipo(String vtaDocumentoTipo) {
        this.vtaDocumentoTipo = vtaDocumentoTipo;
    }

    public String getVtaDocumentoNumero() {
        return vtaDocumentoNumero;
    }

    public void setVtaDocumentoNumero(String vtaDocumentoNumero) {
        this.vtaDocumentoNumero = vtaDocumentoNumero;
    }

    public Date getVtaFecha() {
        return vtaFecha;
    }

    public void setVtaFecha(Date vtaFecha) {
        this.vtaFecha = vtaFecha;
    }

    public Date getVtaFechaVencimiento() {
        return vtaFechaVencimiento;
    }

    public void setVtaFechaVencimiento(Date vtaFechaVencimiento) {
        this.vtaFechaVencimiento = vtaFechaVencimiento;
    }

    public BigDecimal getVtaIvaVigente() {
        return vtaIvaVigente;
    }

    public void setVtaIvaVigente(BigDecimal vtaIvaVigente) {
        this.vtaIvaVigente = vtaIvaVigente;
    }

    public String getVtaObservaciones() {
        return vtaObservaciones;
    }

    public void setVtaObservaciones(String vtaObservaciones) {
        this.vtaObservaciones = vtaObservaciones;
    }

    public String getVtaInformacionAdicional() {
        return vtaInformacionAdicional;
    }

    public void setVtaInformacionAdicional(String vtaInformacionAdicional) {
        this.vtaInformacionAdicional = vtaInformacionAdicional;
    }

    public boolean getVtaPendiente() {
        return vtaPendiente;
    }

    public void setVtaPendiente(boolean vtaPendiente) {
        this.vtaPendiente = vtaPendiente;
    }

    public boolean getVtaRevisado() {
        return vtaRevisado;
    }

    public void setVtaRevisado(boolean vtaRevisado) {
        this.vtaRevisado = vtaRevisado;
    }

    public boolean getVtaAnulado() {
        return vtaAnulado;
    }

    public void setVtaAnulado(boolean vtaAnulado) {
        this.vtaAnulado = vtaAnulado;
    }

    public String getVtaFormaPago() {
        return vtaFormaPago;
    }

    public void setVtaFormaPago(String vtaFormaPago) {
        this.vtaFormaPago = vtaFormaPago;
    }

    public BigDecimal getVtaBase0() {
        return vtaBase0;
    }

    public void setVtaBase0(BigDecimal vtaBase0) {
        this.vtaBase0 = vtaBase0;
    }

    public BigDecimal getVtaBaseImponible() {
        return vtaBaseImponible;
    }

    public void setVtaBaseImponible(BigDecimal vtaBaseImponible) {
        this.vtaBaseImponible = vtaBaseImponible;
    }

    public BigDecimal getVtaBaseNoObjeto() {
        return vtaBaseNoObjeto;
    }

    public void setVtaBaseNoObjeto(BigDecimal vtaBaseNoObjeto) {
        this.vtaBaseNoObjeto = vtaBaseNoObjeto;
    }

    public BigDecimal getVtaBaseExenta() {
        return vtaBaseExenta;
    }

    public void setVtaBaseExenta(BigDecimal vtaBaseExenta) {
        this.vtaBaseExenta = vtaBaseExenta;
    }

    public BigDecimal getVtaDescuentoBase0() {
        return vtaDescuentoBase0;
    }

    public void setVtaDescuentoBase0(BigDecimal vtaDescuentoBase0) {
        this.vtaDescuentoBase0 = vtaDescuentoBase0;
    }

    public BigDecimal getVtaDescuentoBaseImponible() {
        return vtaDescuentoBaseImponible;
    }

    public void setVtaDescuentoBaseImponible(BigDecimal vtaDescuentoBaseImponible) {
        this.vtaDescuentoBaseImponible = vtaDescuentoBaseImponible;
    }

    public BigDecimal getVtaDescuentoBaseNoObjeto() {
        return vtaDescuentoBaseNoObjeto;
    }

    public void setVtaDescuentoBaseNoObjeto(BigDecimal vtaDescuentoBaseNoObjeto) {
        this.vtaDescuentoBaseNoObjeto = vtaDescuentoBaseNoObjeto;
    }

    public BigDecimal getVtaDescuentoBaseExenta() {
        return vtaDescuentoBaseExenta;
    }

    public void setVtaDescuentoBaseExenta(BigDecimal vtaDescuentoBaseExenta) {
        this.vtaDescuentoBaseExenta = vtaDescuentoBaseExenta;
    }

    public BigDecimal getVtaSubtotalBase0() {
        return vtaSubtotalBase0;
    }

    public void setVtaSubtotalBase0(BigDecimal vtaSubtotalBase0) {
        this.vtaSubtotalBase0 = vtaSubtotalBase0;
    }

    public BigDecimal getVtaSubtotalBaseImponible() {
        return vtaSubtotalBaseImponible;
    }

    public void setVtaSubtotalBaseImponible(BigDecimal vtaSubtotalBaseImponible) {
        this.vtaSubtotalBaseImponible = vtaSubtotalBaseImponible;
    }

    public BigDecimal getVtaSubtotalBaseNoObjeto() {
        return vtaSubtotalBaseNoObjeto;
    }

    public void setVtaSubtotalBaseNoObjeto(BigDecimal vtaSubtotalBaseNoObjeto) {
        this.vtaSubtotalBaseNoObjeto = vtaSubtotalBaseNoObjeto;
    }

    public BigDecimal getVtaSubtotalBaseExenta() {
        return vtaSubtotalBaseExenta;
    }

    public void setVtaSubtotalBaseExenta(BigDecimal vtaSubtotalBaseExenta) {
        this.vtaSubtotalBaseExenta = vtaSubtotalBaseExenta;
    }

    public BigDecimal getVtaMontoiva() {
        return vtaMontoiva;
    }

    public void setVtaMontoiva(BigDecimal vtaMontoiva) {
        this.vtaMontoiva = vtaMontoiva;
    }

    public BigDecimal getVtaTotal() {
        return vtaTotal;
    }

    public void setVtaTotal(BigDecimal vtaTotal) {
        this.vtaTotal = vtaTotal;
    }

    public BigDecimal getVtaPagadoEfectivo() {
        return vtaPagadoEfectivo;
    }

    public void setVtaPagadoEfectivo(BigDecimal vtaPagadoEfectivo) {
        this.vtaPagadoEfectivo = vtaPagadoEfectivo;
    }

    public BigDecimal getVtaPagadoDineroElectronico() {
        return vtaPagadoDineroElectronico;
    }

    public void setVtaPagadoDineroElectronico(BigDecimal vtaPagadoDineroElectronico) {
        this.vtaPagadoDineroElectronico = vtaPagadoDineroElectronico;
    }

    public BigDecimal getVtaPagadoTarjetaCredito() {
        return vtaPagadoTarjetaCredito;
    }

    public void setVtaPagadoTarjetaCredito(BigDecimal vtaPagadoTarjetaCredito) {
        this.vtaPagadoTarjetaCredito = vtaPagadoTarjetaCredito;
    }

    public BigDecimal getVtaPagadoOtro() {
        return vtaPagadoOtro;
    }

    public void setVtaPagadoOtro(BigDecimal vtaPagadoOtro) {
        this.vtaPagadoOtro = vtaPagadoOtro;
    }

    public String getSecEmpresa() {
        return secEmpresa;
    }

    public void setSecEmpresa(String secEmpresa) {
        this.secEmpresa = secEmpresa;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getCtaEmpresa() {
        return ctaEmpresa;
    }

    public void setCtaEmpresa(String ctaEmpresa) {
        this.ctaEmpresa = ctaEmpresa;
    }

    public String getCtaCodigo() {
        return ctaCodigo;
    }

    public void setCtaCodigo(String ctaCodigo) {
        this.ctaCodigo = ctaCodigo;
    }

    public String getConEmpresa() {
        return conEmpresa;
    }

    public void setConEmpresa(String conEmpresa) {
        this.conEmpresa = conEmpresa;
    }

    public String getConPeriodo() {
        return conPeriodo;
    }

    public void setConPeriodo(String conPeriodo) {
        this.conPeriodo = conPeriodo;
    }

    public String getConTipo() {
        return conTipo;
    }

    public void setConTipo(String conTipo) {
        this.conTipo = conTipo;
    }

    public String getConNumero() {
        return conNumero;
    }

    public void setConNumero(String conNumero) {
        this.conNumero = conNumero;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrModifica() {
        return usrModifica;
    }

    public void setUsrModifica(String usrModifica) {
        this.usrModifica = usrModifica;
    }

    public Date getUsrFechaModifica() {
        return usrFechaModifica;
    }

    public void setUsrFechaModifica(Date usrFechaModifica) {
        this.usrFechaModifica = usrFechaModifica;
    }

    public String getUsrComentario() {
        return usrComentario;
    }

    public void setUsrComentario(String usrComentario) {
        this.usrComentario = usrComentario;
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

    public List<InvVentasDetalle> getInvVentasDetalleList() {
        return invVentasDetalleList;
    }

    public void setInvVentasDetalleList(List<InvVentasDetalle> invVentasDetalleList) {
        this.invVentasDetalleList = invVentasDetalleList;
    }

    public List<InvVentasRecepcion> getInvVentasRecepcionList() {
        return invVentasRecepcionList;
    }

    public void setInvVentasRecepcionList(List<InvVentasRecepcion> invVentasRecepcionList) {
        this.invVentasRecepcionList = invVentasRecepcionList;
    }

    public List<InvVentasMotivoAnulacion> getInvVentasMotivoAnulacionList() {
        return invVentasMotivoAnulacionList;
    }

    public void setInvVentasMotivoAnulacionList(List<InvVentasMotivoAnulacion> invVentasMotivoAnulacionList) {
        this.invVentasMotivoAnulacionList = invVentasMotivoAnulacionList;
    }

    public List<InvVentasComplemento> getInvVentasComplementoList() {
        return invVentasComplementoList;
    }

    public void setInvVentasComplementoList(List<InvVentasComplemento> invVentasComplementoList) {
        this.invVentasComplementoList = invVentasComplementoList;
    }

    public InvCliente getInvCliente() {
        return invCliente;
    }

    public void setInvCliente(InvCliente invCliente) {
        this.invCliente = invCliente;
    }

    public InvBodega getInvBodega() {
        return invBodega;
    }

    public void setInvBodega(InvBodega invBodega) {
        this.invBodega = invBodega;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invVentasPK != null ? invVentasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvVentas)) {
            return false;
        }
        InvVentas other = (InvVentas) object;
        if ((this.invVentasPK == null && other.invVentasPK != null)
                || (this.invVentasPK != null && !this.invVentasPK.equals(other.invVentasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.entity.InvVentas[ invVentasPK=" + invVentasPK + " ]";
    }

    public String getVtaListaDePrecios() {
        return vtaListaDePrecios;
    }

    public void setVtaListaDePrecios(String vtaListaDePrecios) {
        this.vtaListaDePrecios = vtaListaDePrecios;
    }

    public boolean getVtaReembolso() {
        return vtaReembolso;
    }

    public void setVtaReembolso(boolean vtaReembolso) {
        this.vtaReembolso = vtaReembolso;
    }

    public String getFcBanco() {
        return fcBanco;
    }

    public void setFcBanco(String fcBanco) {
        this.fcBanco = fcBanco;
    }

    public String getFcCuenta() {
        return fcCuenta;
    }

    public void setFcCuenta(String fcCuenta) {
        this.fcCuenta = fcCuenta;
    }

    public String getFcCheque() {
        return fcCheque;
    }

    public void setFcCheque(String fcCheque) {
        this.fcCheque = fcCheque;
    }

    public String getFcLote() {
        return fcLote;
    }

    public void setFcLote(String fcLote) {
        this.fcLote = fcLote;
    }

    public String getFcTitular() {
        return fcTitular;
    }

    public void setFcTitular(String fcTitular) {
        this.fcTitular = fcTitular;
    }

    public InvProformas getInvProformas() {
        return invProformas;
    }

    public void setInvProformas(InvProformas invProformas) {
        this.invProformas = invProformas;
    }

    public InvVentasFormaCobro getFcSecuencial() {
        return fcSecuencial;
    }

    public void setFcSecuencial(InvVentasFormaCobro fcSecuencial) {
        this.fcSecuencial = fcSecuencial;
    }

    public Integer getVtaRecurrente() {
        return vtaRecurrente;
    }

    public void setVtaRecurrente(Integer vtaRecurrente) {
        this.vtaRecurrente = vtaRecurrente;
    }

    public String getVtaVendedor() {
        return vtaVendedor;
    }

    public void setVtaVendedor(String vtaVendedor) {
        this.vtaVendedor = vtaVendedor;
    }

    public boolean isVtaConsignacion() {
        return vtaConsignacion;
    }

    public void setVtaConsignacion(boolean vtaConsignacion) {
        this.vtaConsignacion = vtaConsignacion;
    }

    public String getCliCodigoEstablecimiento() {
        return cliCodigoEstablecimiento;
    }

    public void setCliCodigoEstablecimiento(String cliCodigoEstablecimiento) {
        this.cliCodigoEstablecimiento = cliCodigoEstablecimiento;
    }

    public BigDecimal getVtaMontoIce() {
        return vtaMontoIce;
    }

    public void setVtaMontoIce(BigDecimal vtaMontoIce) {
        this.vtaMontoIce = vtaMontoIce;
    }

    public String getVtaClaveAccesoExterna() {
        return vtaClaveAccesoExterna;
    }

    public void setVtaClaveAccesoExterna(String vtaClaveAccesoExterna) {
        this.vtaClaveAccesoExterna = vtaClaveAccesoExterna;
    }

    public String getVtaCodigoTransaccional() {
        return vtaCodigoTransaccional;
    }

    public void setVtaCodigoTransaccional(String vtaCodigoTransaccional) {
        this.vtaCodigoTransaccional = vtaCodigoTransaccional;
    }

    public Date getFechaUltimaValidacionSri() {
        return fechaUltimaValidacionSri;
    }

    public void setFechaUltimaValidacionSri(Date fechaUltimaValidacionSri) {
        this.fechaUltimaValidacionSri = fechaUltimaValidacionSri;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isVtaSaldoImportado() {
        return vtaSaldoImportado;
    }

    public void setVtaSaldoImportado(boolean vtaSaldoImportado) {
        this.vtaSaldoImportado = vtaSaldoImportado;
    }

    public boolean isVtaNegociable() {
        return vtaNegociable;
    }

    public void setVtaNegociable(boolean vtaNegociable) {
        this.vtaNegociable = vtaNegociable;
    }

}
