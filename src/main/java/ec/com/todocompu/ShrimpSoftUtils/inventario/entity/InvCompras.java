package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConContable;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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

@Entity
@Table(name = "inv_compras", schema = "inventario")
public class InvCompras implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected InvComprasPK invComprasPK;
    @Column(name = "comp_documento_empresa")
    private String compDocumentoEmpresa;
    @Column(name = "comp_documento_proveedor")
    private String compDocumentoProveedor;
    @Column(name = "comp_documento_tipo")
    private String compDocumentoTipo;
    @Column(name = "comp_documento_numero")
    private String compDocumentoNumero;
    @Column(name = "comp_fecha")
    @Temporal(TemporalType.DATE)
    private Date compFecha;
    @Column(name = "comp_fecha_vencimiento")
    @Temporal(TemporalType.DATE)
    private Date compFechaVencimiento;
    @Column(name = "comp_iva_vigente")
    private BigDecimal compIvaVigente;
    @Column(name = "comp_observaciones")
    private String compObservaciones;
    @Column(name = "comp_electronica")
    private boolean compElectronica;
    @Column(name = "comp_activo_fijo")
    private boolean compActivoFijo;
    @Column(name = "comp_importacion")
    private boolean compImportacion;
    @Column(name = "comp_pendiente")
    private boolean compPendiente;
    @Column(name = "comp_revisado")
    private boolean compRevisado;
    @Column(name = "comp_anulado")
    private boolean compAnulado;
    @Column(name = "comp_programada")
    private boolean compProgramada;
    @Column(name = "comp_forma_pago")
    private String compFormaPago;
    @Column(name = "comp_documento_forma_pago")
    private String compDocumentoFormaPago;
    @Column(name = "comp_base0")
    private BigDecimal compBase0;
    @Column(name = "comp_base_imponible")
    private BigDecimal compBaseImponible;
    @Column(name = "comp_base_no_objeto")
    private BigDecimal compBaseNoObjeto;
    @Column(name = "comp_base_exenta")
    private BigDecimal compBaseExenta;
    @Column(name = "comp_ice")
    private BigDecimal compIce;
    @Column(name = "comp_monto_iva")
    private BigDecimal compMontoIva;
    @Column(name = "comp_otros_impuestos")
    private BigDecimal compOtrosImpuestos;
    // comp_propina
    @Column(name = "comp_propina")
    private BigDecimal compPropina;
    @Column(name = "comp_total")
    private BigDecimal compTotal;
    @Column(name = "comp_valor_retenido")
    private BigDecimal compValorRetenido;
    @Column(name = "comp_retencion_asumida")
    private Boolean compRetencionAsumida;
    @Column(name = "comp_saldo")
    private BigDecimal compSaldo;
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
    @Column(name = "emp_codigo")
    private String empCodigo;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invCompras")
    private List<InvComprasRecepcion> invComprasRecepcionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invCompras")
    private List<InvComprasMotivoAnulacion> invComprasMotivoAnulacionList;
    @JoinColumns({
        @JoinColumn(name = "prov_empresa", referencedColumnName = "prov_empresa")
        ,
        @JoinColumn(name = "prov_codigo", referencedColumnName = "prov_codigo")})
    @ManyToOne(optional = false)
    private InvProveedor invProveedor;
    @JoinColumns({
        @JoinColumn(name = "bod_empresa", referencedColumnName = "bod_empresa")
        ,
        @JoinColumn(name = "bod_codigo", referencedColumnName = "bod_codigo")})
    @ManyToOne
    private InvBodega invBodega;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invCompras")
    private List<InvComprasDetalle> invComprasDetalleList;

    //orden de compra 
    @Column(name = "oc_empresa")
    private String ocEmpresa;
    @Column(name = "oc_sector")
    private String ocSector;
    @Column(name = "oc_motivo")
    private String ocMotivo;
    @Column(name = "oc_numero")
    private String ocNumero;
    //APROBAR PAGO
    @Column(name = "comp_usuario_aprueba_pago")
    private String compUsuarioApruebaPago;
    @Column(name = "comp_fecha_aprueba_pago")
    @Temporal(TemporalType.DATE)
    private Date compFechaApruebaPago;
    @Column(name = "comp_imb_facturado")
    private boolean compImbFacturado;
    //transportista
    @Column(name = "comp_transportista_ruc")
    private String compTransportistaRuc;

    @Column(name = "clave_acceso_externa")
    private String compClaveAccesoExterna;

    @Column(name = "fecha_ultima_validacion_sri")
    @Temporal(TemporalType.DATE)
    private Date fechaUltimaValidacionSri;

    @Column(name = "oc_orden_pedido")
    private String ocOrdenPedido;

    @Column(name = "comp_saldo_importado")
    private boolean compSaldoImportado;
    @Transient
    private Integer id;

    @Column(name = "fp_secuencial")
    private Integer fpSecuencial;

    @Column(name = "comp_guia_compra")
    private String compGuiaCompra;

    @Column(name = "comp_es_imb")
    private Boolean compEsImb;

    @JoinColumns({
        @JoinColumn(name = "caja_empresa", referencedColumnName = "con_empresa"),
        @JoinColumn(name = "caja_periodo", referencedColumnName = "con_periodo"),
        @JoinColumn(name = "caja_tipo", referencedColumnName = "con_tipo"),
        @JoinColumn(name = "caja_numero", referencedColumnName = "con_numero")})
    @ManyToOne(optional = true)
    private ConContable cajaContable;

    public InvCompras() {
    }

    public InvCompras(InvComprasPK invComprasPK) {
        this.invComprasPK = invComprasPK;
    }

    public InvCompras(InvComprasPK invComprasPK, Date compFecha, Date compFechaVencimiento,
            BigDecimal compIvaVigente, boolean compElectronica, boolean compActivoFijo, boolean compImportacion,
            boolean compPendiente, boolean compRevisado, boolean compAnulado, BigDecimal compBase0,
            BigDecimal compBaseImponible, BigDecimal compBaseNoObjeto, BigDecimal compBaseExenta,
            BigDecimal compMontoIva, BigDecimal compOtrosImpuestos, BigDecimal compTotal, BigDecimal compValorRetenido,
            BigDecimal compSaldo, String secEmpresa, String secCodigo, String empCodigo, String usrCodigo,
            Date usrFechaInserta) {
        this.invComprasPK = invComprasPK;
        this.compFecha = compFecha;
        this.compFechaVencimiento = compFechaVencimiento;
        this.compIvaVigente = compIvaVigente;
        this.compElectronica = compElectronica;
        this.compActivoFijo = compActivoFijo;
        this.compImportacion = compImportacion;
        this.compPendiente = compPendiente;
        this.compRevisado = compRevisado;
        this.compAnulado = compAnulado;
        this.compBase0 = compBase0;
        this.compBaseImponible = compBaseImponible;
        this.compBaseNoObjeto = compBaseNoObjeto;
        this.compBaseExenta = compBaseExenta;
        this.compMontoIva = compMontoIva;
        this.compOtrosImpuestos = compOtrosImpuestos;
        this.compTotal = compTotal;
        this.compValorRetenido = compValorRetenido;
        this.compSaldo = compSaldo;
        this.secEmpresa = secEmpresa;
        this.secCodigo = secCodigo;
        this.empCodigo = empCodigo;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public InvCompras(String compEmpresa, String compPeriodo, String compMotivo, String compNumero) {
        this.invComprasPK = new InvComprasPK(compEmpresa, compPeriodo, compMotivo, compNumero);
    }

    public InvComprasPK getInvComprasPK() {
        return invComprasPK;
    }

    public void setInvComprasPK(InvComprasPK invComprasPK) {
        this.invComprasPK = invComprasPK;
    }

    public String getCompDocumentoEmpresa() {
        return compDocumentoEmpresa;
    }

    public void setCompDocumentoEmpresa(String compDocumentoEmpresa) {
        this.compDocumentoEmpresa = compDocumentoEmpresa;
    }

    public String getCompDocumentoProveedor() {
        return compDocumentoProveedor;
    }

    public void setCompDocumentoProveedor(String compDocumentoProveedor) {
        this.compDocumentoProveedor = compDocumentoProveedor;
    }

    public String getCompDocumentoTipo() {
        return compDocumentoTipo;
    }

    public void setCompDocumentoTipo(String compDocumentoTipo) {
        this.compDocumentoTipo = compDocumentoTipo;
    }

    public String getCompDocumentoNumero() {
        return compDocumentoNumero;
    }

    public void setCompDocumentoNumero(String compDocumentoNumero) {
        this.compDocumentoNumero = compDocumentoNumero;
    }

    public Date getCompFecha() {
        return compFecha;
    }

    public void setCompFecha(Date compFecha) {
        this.compFecha = compFecha;
    }

    public Date getCompFechaVencimiento() {
        return compFechaVencimiento;
    }

    public void setCompFechaVencimiento(Date compFechaVencimiento) {
        this.compFechaVencimiento = compFechaVencimiento;
    }

    public BigDecimal getCompIvaVigente() {
        return compIvaVigente;
    }

    public void setCompIvaVigente(BigDecimal compIvaVigente) {
        this.compIvaVigente = compIvaVigente;
    }

    public String getCompObservaciones() {
        return compObservaciones;
    }

    public void setCompObservaciones(String compObservaciones) {
        this.compObservaciones = compObservaciones;
    }

    public boolean getCompElectronica() {
        return compElectronica;
    }

    public void setCompElectronica(boolean compElectronica) {
        this.compElectronica = compElectronica;
    }

    public boolean getCompActivoFijo() {
        return compActivoFijo;
    }

    public void setCompActivoFijo(boolean compActivoFijo) {
        this.compActivoFijo = compActivoFijo;
    }

    public boolean getCompImportacion() {
        return compImportacion;
    }

    public void setCompImportacion(boolean compImportacion) {
        this.compImportacion = compImportacion;
    }

    public BigDecimal getCompIce() {
        return compIce;
    }

    public void setCompIce(BigDecimal compIce) {
        this.compIce = compIce;
    }

    public BigDecimal getCompPropina() {
        return compPropina;
    }

    public void setCompPropina(BigDecimal compPropina) {
        this.compPropina = compPropina;
    }

    public boolean getCompPendiente() {
        return compPendiente;
    }

    public void setCompPendiente(boolean compPendiente) {
        this.compPendiente = compPendiente;
    }

    public boolean getCompRevisado() {
        return compRevisado;
    }

    public void setCompRevisado(boolean compRevisado) {
        this.compRevisado = compRevisado;
    }

    public boolean getCompAnulado() {
        return compAnulado;
    }

    public void setCompAnulado(boolean compAnulado) {
        this.compAnulado = compAnulado;
    }

    public String getCompFormaPago() {
        return compFormaPago;
    }

    public void setCompFormaPago(String compFormaPago) {
        this.compFormaPago = compFormaPago;
    }

    public String getCompDocumentoFormaPago() {
        return compDocumentoFormaPago;
    }

    public void setCompDocumentoFormaPago(String compDocumentoFormaPago) {
        this.compDocumentoFormaPago = compDocumentoFormaPago;
    }

    public BigDecimal getCompBase0() {
        return compBase0;
    }

    public void setCompBase0(BigDecimal compBase0) {
        this.compBase0 = compBase0;
    }

    public BigDecimal getCompBaseImponible() {
        return compBaseImponible;
    }

    public void setCompBaseImponible(BigDecimal compBaseImponible) {
        this.compBaseImponible = compBaseImponible;
    }

    public BigDecimal getCompBaseNoObjeto() {
        return compBaseNoObjeto;
    }

    public void setCompBaseNoObjeto(BigDecimal compBaseNoObjeto) {
        this.compBaseNoObjeto = compBaseNoObjeto;
    }

    public BigDecimal getCompBaseExenta() {
        return compBaseExenta;
    }

    public void setCompBaseExenta(BigDecimal compBaseExenta) {
        this.compBaseExenta = compBaseExenta;
    }

    public BigDecimal getCompMontoIva() {
        return compMontoIva;
    }

    public void setCompMontoIva(BigDecimal compMontoIva) {
        this.compMontoIva = compMontoIva;
    }

    public BigDecimal getCompOtrosImpuestos() {
        return compOtrosImpuestos;
    }

    public void setCompOtrosImpuestos(BigDecimal compOtrosImpuestos) {
        this.compOtrosImpuestos = compOtrosImpuestos;
    }

    public BigDecimal getCompTotal() {
        return compTotal;
    }

    public void setCompTotal(BigDecimal compTotal) {
        this.compTotal = compTotal;
    }

    public BigDecimal getCompValorRetenido() {
        return compValorRetenido;
    }

    public void setCompValorRetenido(BigDecimal compValorRetenido) {
        this.compValorRetenido = compValorRetenido;
    }

    public Boolean getCompRetencionAsumida() {
        return compRetencionAsumida;
    }

    public void setCompRetencionAsumida(Boolean compRetencionAsumida) {
        this.compRetencionAsumida = compRetencionAsumida;
    }

    public BigDecimal getCompSaldo() {
        return compSaldo;
    }

    public void setCompSaldo(BigDecimal compSaldo) {
        this.compSaldo = compSaldo;
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

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
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

    public List<InvComprasRecepcion> getInvComprasRecepcionList() {
        return invComprasRecepcionList;
    }

    public void setInvComprasRecepcionList(List<InvComprasRecepcion> invComprasRecepcionList) {
        this.invComprasRecepcionList = invComprasRecepcionList;
    }

    public List<InvComprasMotivoAnulacion> getInvComprasMotivoAnulacionList() {
        return invComprasMotivoAnulacionList;
    }

    public void setInvComprasMotivoAnulacionList(List<InvComprasMotivoAnulacion> invComprasMotivoAnulacionList) {
        this.invComprasMotivoAnulacionList = invComprasMotivoAnulacionList;
    }

    public InvProveedor getInvProveedor() {
        return invProveedor;
    }

    public void setInvProveedor(InvProveedor invProveedor) {
        this.invProveedor = invProveedor;
    }

    public InvBodega getInvBodega() {
        return invBodega;
    }

    public void setInvBodega(InvBodega invBodega) {
        this.invBodega = invBodega;
    }

    public List<InvComprasDetalle> getInvComprasDetalleList() {
        return invComprasDetalleList;
    }

    public void setInvComprasDetalleList(List<InvComprasDetalle> invComprasDetalleList) {
        this.invComprasDetalleList = invComprasDetalleList;
    }

    public String getOcEmpresa() {
        return ocEmpresa;
    }

    public void setOcEmpresa(String ocEmpresa) {
        this.ocEmpresa = ocEmpresa;
    }

    public String getOcSector() {
        return ocSector;
    }

    public void setOcSector(String ocSector) {
        this.ocSector = ocSector;
    }

    public String getOcMotivo() {
        return ocMotivo;
    }

    public void setOcMotivo(String ocMotivo) {
        this.ocMotivo = ocMotivo;
    }

    public String getOcNumero() {
        return ocNumero;
    }

    public void setOcNumero(String ocNumero) {
        this.ocNumero = ocNumero;
    }

    public boolean isCompProgramada() {
        return compProgramada;
    }

    public void setCompProgramada(boolean compProgramada) {
        this.compProgramada = compProgramada;
    }

    public String getCompUsuarioApruebaPago() {
        return compUsuarioApruebaPago;
    }

    public void setCompUsuarioApruebaPago(String compUsuarioApruebaPago) {
        this.compUsuarioApruebaPago = compUsuarioApruebaPago;
    }

    public Date getCompFechaApruebaPago() {
        return compFechaApruebaPago;
    }

    public void setCompFechaApruebaPago(Date compFechaApruebaPago) {
        this.compFechaApruebaPago = compFechaApruebaPago;
    }

    public boolean isCompImbFacturado() {
        return compImbFacturado;
    }

    public void setCompImbFacturado(boolean compImbFacturado) {
        this.compImbFacturado = compImbFacturado;
    }

    public String getCompTransportistaRuc() {
        return compTransportistaRuc;
    }

    public void setCompTransportistaRuc(String compTransportistaRuc) {
        this.compTransportistaRuc = compTransportistaRuc;
    }

    public String getCompClaveAccesoExterna() {
        return compClaveAccesoExterna;
    }

    public void setCompClaveAccesoExterna(String compClaveAccesoExterna) {
        this.compClaveAccesoExterna = compClaveAccesoExterna;
    }

    public Date getFechaUltimaValidacionSri() {
        return fechaUltimaValidacionSri;
    }

    public void setFechaUltimaValidacionSri(Date fechaUltimaValidacionSri) {
        this.fechaUltimaValidacionSri = fechaUltimaValidacionSri;
    }

    public String getOcOrdenPedido() {
        return ocOrdenPedido;
    }

    public void setOcOrdenPedido(String ocOrdenPedido) {
        this.ocOrdenPedido = ocOrdenPedido;
    }

    public boolean isCompSaldoImportado() {
        return compSaldoImportado;
    }

    public void setCompSaldoImportado(boolean compSaldoImportado) {
        this.compSaldoImportado = compSaldoImportado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFpSecuencial() {
        return fpSecuencial;
    }

    public void setFpSecuencial(Integer fpSecuencial) {
        this.fpSecuencial = fpSecuencial;
    }

    public String getCompGuiaCompra() {
        return compGuiaCompra;
    }

    public void setCompGuiaCompra(String compGuiaCompra) {
        this.compGuiaCompra = compGuiaCompra;
    }

    public Boolean getCompEsImb() {
        return compEsImb;
    }

    public void setCompEsImb(Boolean compEsImb) {
        this.compEsImb = compEsImb;
    }

    public ConContable getCajaContable() {
        return cajaContable;
    }

    public void setCajaContable(ConContable cajaContable) {
        this.cajaContable = cajaContable;
    }   

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invComprasPK != null ? invComprasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof InvCompras)) {
            return false;
        }
        InvCompras other = (InvCompras) object;
        if ((this.invComprasPK == null && other.invComprasPK != null)
                || (this.invComprasPK != null && !this.invComprasPK.equals(other.invComprasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.entity.InvCompras[ invComprasPK=" + invComprasPK + " ]";
    }

}
