/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Developer0
 */
@Entity
@Table(name = "inv_pedidos_orden_compra", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvPedidosOrdenCompra.findAll", query = "SELECT i FROM InvPedidosOrdenCompra i")})
public class InvPedidosOrdenCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvPedidosOrdenCompraPK invPedidosOrdenCompraPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "oc_codigo_transaccional")
    private String ocCodigoTransaccional;
    @Basic(optional = false)
    @NotNull
    @Column(name = "oc_fecha_emision")
    @Temporal(TemporalType.DATE)
    private Date ocFechaEmision;
    @Column(name = "oc_fecha_hora_entrega")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ocFechaHoraEntrega;
    @Size(max = 2147483647)
    @Column(name = "oc_lugar_entrega")
    private String ocLugarEntrega;
    @Size(max = 2147483647)
    @Column(name = "oc_contacto_nombre")
    private String ocContactoNombre;
    @Size(max = 2147483647)
    @Column(name = "oc_contacto_telefono")
    private String ocContactoTelefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "oc_forma_pago")
    private String ocFormaPago;
    @Size(max = 2147483647)
    @Column(name = "oc_observaciones_registra")
    private String ocObservacionesRegistra;
    @Basic(optional = false)
    @NotNull
    @Column(name = "oc_aprobada")
    private boolean ocAprobada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "oc_pendiente")
    private boolean ocPendiente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "oc_cerrada")
    private boolean ocCerrada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "oc_anulado")
    private boolean ocAnulado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "oc_monto_total")
    private BigDecimal ocMontoTotal;
    @Basic(optional = false)
    @NotNull
    @Column(name = "oc_valor_retencion")
    private BigDecimal ocValorRetencion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Size(max = 2147483647)
    @Column(name = "usr_aprueba")
    private String usrAprueba;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usr_fecha_inserta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @Size(max = 2147483647)
    @Column(name = "usr_codigo_modifica")
    private String usrCodigoModifica;
    @Basic(optional = true)
    @Column(name = "usr_fecha_modifica")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaModifica;
    @JoinColumns({
        @JoinColumn(name = "cli_empresa", referencedColumnName = "cli_empresa")
        , @JoinColumn(name = "cli_codigo", referencedColumnName = "cli_codigo")})
    @ManyToOne
    private InvCliente invCliente;
    @JoinColumns({
        @JoinColumn(name = "prov_empresa", referencedColumnName = "prov_empresa")
        , @JoinColumn(name = "prov_codigo", referencedColumnName = "prov_codigo")})
    @ManyToOne(optional = false)
    private InvProveedor invProveedor;
    @JoinColumns({
        @JoinColumn(name = "oc_empresa", referencedColumnName = "ocm_empresa", insertable = false, updatable = false)
        , @JoinColumn(name = "oc_sector", referencedColumnName = "ocm_sector", insertable = false, updatable = false)
        , @JoinColumn(name = "oc_motivo", referencedColumnName = "ocm_codigo", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private InvPedidosOrdenCompraMotivo invPedidosOrdenCompraMotivo;
    @Size(max = 2147483647)
    @Column(name = "oc_motivo_anulacion")
    private String ocMotivoAnulacion;
    @OrderBy("det_orden ASC")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invPedidosOrdenCompra")
    private List<InvPedidosOrdenCompraDetalle> invPedidosOrdenCompraDetalleList;

    @Column(name = "oc_base0")
    private BigDecimal ocBase0;
    @Column(name = "oc_base_imponible")
    private BigDecimal ocBaseImponible;
    @Column(name = "oc_monto_iva")
    private BigDecimal ocMontoIva;
    @Column(name = "oc_iva_vigente")
    private BigDecimal ocIvaVigente;

    @Column(name = "oc_fecha_hora_aprobado")
    @Temporal(TemporalType.TIMESTAMP)
    private Date ocFechaHoraAprobado;
    @Size(max = 2147483647)

    @Column(name = "oc_motivo_desmayorizar")
    private String ocMotivoDesmayorizar;


    public InvPedidosOrdenCompra() {
    }

    public InvPedidosOrdenCompra(InvPedidosOrdenCompraPK invPedidosOrdenCompraPK) {
        this.invPedidosOrdenCompraPK = invPedidosOrdenCompraPK;
    }

    public InvPedidosOrdenCompra(InvPedidosOrdenCompraPK invPedidosOrdenCompraPK, String ocCodigoTransaccional, Date ocFechaEmision, Date ocFechaHoraEntrega, String ocLugarEntrega, String ocContactoNombre, String ocContactoTelefono, String ocFormaPago, String ocObservacionesRegistra, boolean ocAprobada, boolean ocAnulado, BigDecimal ocMontoTotal, BigDecimal ocValorRetencion, String usrCodigo, Date usrFechaInserta, InvCliente invCliente, InvProveedor invProveedor, InvPedidosOrdenCompraMotivo invPedidosOrdenCompraMotivo, List<InvPedidosOrdenCompraDetalle> invPedidosOrdenCompraDetalleList, Date ocFechaHoraAprobado, String ocMotivoDesmayorizar) {
        this.invPedidosOrdenCompraPK = invPedidosOrdenCompraPK;
        this.ocCodigoTransaccional = ocCodigoTransaccional;
        this.ocFechaEmision = ocFechaEmision;
        this.ocFechaHoraEntrega = ocFechaHoraEntrega;
        this.ocLugarEntrega = ocLugarEntrega;
        this.ocContactoNombre = ocContactoNombre;
        this.ocContactoTelefono = ocContactoTelefono;
        this.ocFormaPago = ocFormaPago;
        this.ocObservacionesRegistra = ocObservacionesRegistra;
        this.ocAprobada = ocAprobada;
        this.ocAnulado = ocAnulado;
        this.ocMontoTotal = ocMontoTotal;
        this.ocValorRetencion = ocValorRetencion;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.invCliente = invCliente;
        this.invProveedor = invProveedor;
        this.invPedidosOrdenCompraMotivo = invPedidosOrdenCompraMotivo;
        this.invPedidosOrdenCompraDetalleList = invPedidosOrdenCompraDetalleList;
        this.ocFechaHoraAprobado = ocFechaHoraAprobado;
        this.ocMotivoDesmayorizar = ocMotivoDesmayorizar;
    }

    public InvPedidosOrdenCompra(String ocEmpresa, String ocSector, String ocMotivo, String ocNumero) {
        this.invPedidosOrdenCompraPK = new InvPedidosOrdenCompraPK(ocEmpresa, ocSector, ocMotivo, ocNumero);
    }

    public InvPedidosOrdenCompraPK getInvPedidosOrdenCompraPK() {
        return invPedidosOrdenCompraPK;
    }

    public void setInvPedidosOrdenCompraPK(InvPedidosOrdenCompraPK invPedidosOrdenCompraPK) {
        this.invPedidosOrdenCompraPK = invPedidosOrdenCompraPK;
    }

    public String getOcCodigoTransaccional() {
        return ocCodigoTransaccional;
    }

    public void setOcCodigoTransaccional(String ocCodigoTransaccional) {
        this.ocCodigoTransaccional = ocCodigoTransaccional;
    }

    public String getOcFormaPago() {
        return ocFormaPago;
    }

    public void setOcFormaPago(String ocFormaPago) {
        this.ocFormaPago = ocFormaPago;
    }

    public String getOcObservacionesRegistra() {
        return ocObservacionesRegistra;
    }

    public void setOcObservacionesRegistra(String ocObservacionesRegistra) {
        this.ocObservacionesRegistra = ocObservacionesRegistra;
    }

    public boolean getOcAnulado() {
        return ocAnulado;
    }

    public void setOcAnulado(boolean ocAnulado) {
        this.ocAnulado = ocAnulado;
    }

    public BigDecimal getOcMontoTotal() {
        return ocMontoTotal;
    }

    public void setOcMontoTotal(BigDecimal ocMontoTotal) {
        this.ocMontoTotal = ocMontoTotal;
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

    public InvProveedor getInvProveedor() {
        return invProveedor;
    }

    public void setInvProveedor(InvProveedor invProveedor) {
        this.invProveedor = invProveedor;
    }

    public InvPedidosOrdenCompraMotivo getInvPedidosOrdenCompraMotivo() {
        return invPedidosOrdenCompraMotivo;
    }

    public void setInvPedidosOrdenCompraMotivo(InvPedidosOrdenCompraMotivo invPedidosOrdenCompraMotivo) {
        this.invPedidosOrdenCompraMotivo = invPedidosOrdenCompraMotivo;
    }

    public List<InvPedidosOrdenCompraDetalle> getInvPedidosOrdenCompraDetalleList() {
        return invPedidosOrdenCompraDetalleList;
    }

    public void setInvPedidosOrdenCompraDetalleList(List<InvPedidosOrdenCompraDetalle> invPedidosOrdenCompraDetalleList) {
        this.invPedidosOrdenCompraDetalleList = invPedidosOrdenCompraDetalleList;
    }

    public boolean getOcAprobada() {
        return ocAprobada;
    }

    public void setOcAprobada(boolean ocAprobada) {
        this.ocAprobada = ocAprobada;
    }

    public BigDecimal getOcValorRetencion() {
        return ocValorRetencion;
    }

    public void setOcValorRetencion(BigDecimal ocValorRetencion) {
        this.ocValorRetencion = ocValorRetencion;
    }

    public Date getOcFechaEmision() {
        return ocFechaEmision;
    }

    public void setOcFechaEmision(Date ocFechaEmision) {
        this.ocFechaEmision = ocFechaEmision;
    }

    public Date getOcFechaHoraEntrega() {
        return ocFechaHoraEntrega;
    }

    public void setOcFechaHoraEntrega(Date ocFechaHoraEntrega) {
        this.ocFechaHoraEntrega = ocFechaHoraEntrega;
    }

    public Date getOcFechaHoraAprobado() {
        return ocFechaHoraAprobado;
    }

    public void setOcFechaHoraAprobado(Date ocFechaHoraAprobado) {
        this.ocFechaHoraAprobado = ocFechaHoraAprobado;
    }

    public String getOcLugarEntrega() {
        return ocLugarEntrega;
    }

    public void setOcLugarEntrega(String ocLugarEntrega) {
        this.ocLugarEntrega = ocLugarEntrega;
    }

    public String getOcContactoNombre() {
        return ocContactoNombre;
    }

    public void setOcContactoNombre(String ocContactoNombre) {
        this.ocContactoNombre = ocContactoNombre;
    }

    public String getOcContactoTelefono() {
        return ocContactoTelefono;
    }

    public void setOcContactoTelefono(String ocContactoTelefono) {
        this.ocContactoTelefono = ocContactoTelefono;
    }

    public InvCliente getInvCliente() {
        return invCliente;
    }

    public void setInvCliente(InvCliente invCliente) {
        this.invCliente = invCliente;
    }

    public String getUsrAprueba() {
        return usrAprueba;
    }

    public void setUsrAprueba(String usrAprueba) {
        this.usrAprueba = usrAprueba;
    }

    public String getOcMotivoAnulacion() {
        return ocMotivoAnulacion;
    }

    public void setOcMotivoAnulacion(String ocMotivoAnulacion) {
        this.ocMotivoAnulacion = ocMotivoAnulacion;
    }

    public boolean isOcPendiente() {
        return ocPendiente;
    }

    public void setOcPendiente(boolean ocPendiente) {
        this.ocPendiente = ocPendiente;
    }

    public boolean isOcCerrada() {
        return ocCerrada;
    }

    public void setOcCerrada(boolean ocCerrada) {
        this.ocCerrada = ocCerrada;
    }

    public String getUsrCodigoModifica() {
        return usrCodigoModifica;
    }

    public void setUsrCodigoModifica(String usrCodigoModifica) {
        this.usrCodigoModifica = usrCodigoModifica;
    }

    public Date getUsrFechaModifica() {
        return usrFechaModifica;
    }

    public void setUsrFechaModifica(Date usrFechaModifica) {
        this.usrFechaModifica = usrFechaModifica;
    }

    public BigDecimal getOcBase0() {
        return ocBase0;
    }

    public void setOcBase0(BigDecimal ocBase0) {
        this.ocBase0 = ocBase0;
    }

    public BigDecimal getOcBaseImponible() {
        return ocBaseImponible;
    }

    public void setOcBaseImponible(BigDecimal ocBaseImponible) {
        this.ocBaseImponible = ocBaseImponible;
    }

    public BigDecimal getOcMontoIva() {
        return ocMontoIva;
    }

    public void setOcMontoIva(BigDecimal ocMontoIva) {
        this.ocMontoIva = ocMontoIva;
    }

    public BigDecimal getOcIvaVigente() {
        return ocIvaVigente;
    }

    public void setOcIvaVigente(BigDecimal ocIvaVigente) {
        this.ocIvaVigente = ocIvaVigente;
    }

    public String getOcMotivoDesmayorizar() {
        return ocMotivoDesmayorizar;
    }

    public void setOcMotivoDesmayorizar(String ocMotivoDesmayorizar) {
        this.ocMotivoDesmayorizar = ocMotivoDesmayorizar;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invPedidosOrdenCompraPK != null ? invPedidosOrdenCompraPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvPedidosOrdenCompra)) {
            return false;
        }
        InvPedidosOrdenCompra other = (InvPedidosOrdenCompra) object;
        if ((this.invPedidosOrdenCompraPK == null && other.invPedidosOrdenCompraPK != null) || (this.invPedidosOrdenCompraPK != null && !this.invPedidosOrdenCompraPK.equals(other.invPedidosOrdenCompraPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosOrdenCompra[ invPedidosOrdenCompraPK=" + invPedidosOrdenCompraPK + " ]";
    }

}
