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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.JoinColumnOrFormula;
import org.hibernate.annotations.JoinColumnsOrFormulas;
import org.hibernate.annotations.JoinFormula;

/**
 *
 * @author Developer0
 */
@Entity
@Table(name = "inv_pedidos", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvPedidos.findAll", query = "SELECT i FROM InvPedidos i")})
public class InvPedidos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvPedidosPK invPedidosPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ped_codigo_transaccional")
    private String pedCodigoTransaccional;
    @Size(max = 2147483647)
    @Column(name = "ped_orden_compra")
    private String pedOrdenCompra;
    @Size(max = 2147483647)
    @Column(name = "ped_forma_cobro")
    private String pedFormaCobro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ped_fecha_emision")
    @Temporal(TemporalType.DATE)
    private Date pedFechaEmision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ped_fecha_vencimiento")
    @Temporal(TemporalType.DATE)
    private Date pedFechaVencimiento;
    @Column(name = "ped_fecha_hora_entrega")
    @Temporal(TemporalType.TIMESTAMP)
    private Date pedFechaHoraEntrega;
    @Size(max = 2147483647)
    @Column(name = "ped_lugar_entrega")
    private String pedLugarEntrega;
    @Column(name = "usr_fecha_aprobada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaAprobada;
    @Size(max = 2147483647)
    @Column(name = "ped_contacto_nombre")
    private String pedContactoNombre;
    @Size(max = 2147483647)
    @Column(name = "ped_contacto_telefono")
    private String pedContactoTelefono;
    @Size(max = 2147483647)
    @Column(name = "ped_observaciones_registra")
    private String pedObservacionesRegistra;
    @Size(max = 2147483647)
    @Column(name = "ped_observaciones_aprueba")
    private String pedObservacionesAprueba;
    @Size(max = 2147483647)
    @Column(name = "ped_observaciones_ejecuta")
    private String pedObservacionesEjecuta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ped_pendiente")
    private boolean pedPendiente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ped_aprobado")
    private boolean pedAprobado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ped_ejecutado")
    private boolean pedEjecutado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ped_anulado")
    private boolean pedAnulado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ped_monto_total")
    private BigDecimal pedMontoTotal;
    @JoinColumns({
        @JoinColumn(name = "cli_empresa", referencedColumnName = "cli_empresa")
        , @JoinColumn(name = "cli_codigo", referencedColumnName = "cli_codigo")})
    @ManyToOne
    private InvCliente invCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usr_registra")
    private String usrRegistra;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usr_aprueba")
    private String usrAprueba;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usr_ejecuta")
    private String usrEjecuta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invPedidos")
    private List<InvPedidosDetalle> invPedidosDetalleList;
    @JoinColumnsOrFormulas(value = {
        @JoinColumnOrFormula(formula = @JoinFormula(value = "ped_empresa", referencedColumnName = "pm_empresa")),
        @JoinColumnOrFormula(formula = @JoinFormula(value = "ped_sector", referencedColumnName = "pm_sector")),
        @JoinColumnOrFormula(formula = @JoinFormula(value = "ped_motivo", referencedColumnName = "pm_codigo"))
    })
    @ManyToOne(optional = false)
    private InvPedidosMotivo invPedidosMotivo;
    @Size(max = 2147483647)
    @Column(name = "ped_motivo_anulacion")
    private String pedMotivoAnulacion;
    
    public InvPedidos() {
    }

    public InvPedidos(InvPedidosPK invPedidosPK) {
        this.invPedidosPK = invPedidosPK;
    }

    public InvPedidos(InvPedidosPK invPedidosPK, String pedCodigoTransaccional, String pedOrdenCompra, String pedFormaCobro, Date pedFechaEmision, Date pedFechaVencimiento, Date pedFechaHoraEntrega, String pedLugarEntrega, String pedContactoNombre, String pedContactoTelefono, String pedObservacionesRegistra, String pedObservacionesAprueba, String pedObservacionesEjecuta, boolean pedPendiente, boolean pedAprobado, boolean pedEjecutado, boolean pedAnulado, BigDecimal pedMontoTotal, InvCliente invCliente, String usrRegistra, String usrAprueba, String usrEjecuta, Date usrFechaInserta, List<InvPedidosDetalle> invPedidosDetalleList, InvPedidosMotivo invPedidosMotivo, Date usrFechaAprobada) {
        this.invPedidosPK = invPedidosPK;
        this.pedCodigoTransaccional = pedCodigoTransaccional;
        this.pedOrdenCompra = pedOrdenCompra;
        this.pedFormaCobro = pedFormaCobro;
        this.pedFechaEmision = pedFechaEmision;
        this.pedFechaVencimiento = pedFechaVencimiento;
        this.pedFechaHoraEntrega = pedFechaHoraEntrega;
        this.pedLugarEntrega = pedLugarEntrega;
        this.pedContactoNombre = pedContactoNombre;
        this.pedContactoTelefono = pedContactoTelefono;
        this.pedObservacionesRegistra = pedObservacionesRegistra;
        this.pedObservacionesAprueba = pedObservacionesAprueba;
        this.pedObservacionesEjecuta = pedObservacionesEjecuta;
        this.pedPendiente = pedPendiente;
        this.pedAprobado = pedAprobado;
        this.pedEjecutado = pedEjecutado;
        this.pedAnulado = pedAnulado;
        this.pedMontoTotal = pedMontoTotal;
        this.invCliente = invCliente;
        this.usrRegistra = usrRegistra;
        this.usrAprueba = usrAprueba;
        this.usrEjecuta = usrEjecuta;
        this.usrFechaInserta = usrFechaInserta;
        this.usrFechaAprobada = usrFechaAprobada;
        this.invPedidosDetalleList = invPedidosDetalleList;
        this.invPedidosMotivo = invPedidosMotivo;
    }

    public Date getUsrFechaAprobada() {
        return usrFechaAprobada;
    }

    public void setUsrFechaAprobada(Date usrFechaAprobada) {
        this.usrFechaAprobada = usrFechaAprobada;
    }

    public InvPedidos(String pedEmpresa, String pedSector, String pedMotivo, String pedNumero) {
        this.invPedidosPK = new InvPedidosPK(pedEmpresa, pedSector, pedMotivo, pedNumero);
    }

    public InvPedidosPK getInvPedidosPK() {
        return invPedidosPK;
    }

    public void setInvPedidosPK(InvPedidosPK invPedidosPK) {
        this.invPedidosPK = invPedidosPK;
    }

    public String getPedObservacionesRegistra() {
        return pedObservacionesRegistra;
    }

    public void setPedObservacionesRegistra(String pedObservacionesRegistra) {
        this.pedObservacionesRegistra = pedObservacionesRegistra;
    }

    public String getPedObservacionesAprueba() {
        return pedObservacionesAprueba;
    }

    public void setPedObservacionesAprueba(String pedObservacionesAprueba) {
        this.pedObservacionesAprueba = pedObservacionesAprueba;
    }

    public String getPedObservacionesEjecuta() {
        return pedObservacionesEjecuta;
    }

    public void setPedObservacionesEjecuta(String pedObservacionesEjecuta) {
        this.pedObservacionesEjecuta = pedObservacionesEjecuta;
    }

    public boolean getPedPendiente() {
        return pedPendiente;
    }

    public void setPedPendiente(boolean pedPendiente) {
        this.pedPendiente = pedPendiente;
    }

    public boolean getPedAprobado() {
        return pedAprobado;
    }

    public void setPedAprobado(boolean pedAprobado) {
        this.pedAprobado = pedAprobado;
    }

    public boolean getPedEjecutado() {
        return pedEjecutado;
    }

    public void setPedEjecutado(boolean pedEjecutado) {
        this.pedEjecutado = pedEjecutado;
    }

    public boolean getPedAnulado() {
        return pedAnulado;
    }

    public void setPedAnulado(boolean pedAnulado) {
        this.pedAnulado = pedAnulado;
    }

    public BigDecimal getPedMontoTotal() {
        return pedMontoTotal;
    }

    public void setPedMontoTotal(BigDecimal pedMontoTotal) {
        this.pedMontoTotal = pedMontoTotal;
    }

    public String getUsrRegistra() {
        return usrRegistra;
    }

    public void setUsrRegistra(String usrRegistra) {
        this.usrRegistra = usrRegistra;
    }

    public String getUsrAprueba() {
        return usrAprueba;
    }

    public void setUsrAprueba(String usrAprueba) {
        this.usrAprueba = usrAprueba;
    }

    public String getUsrEjecuta() {
        return usrEjecuta;
    }

    public void setUsrEjecuta(String usrEjecuta) {
        this.usrEjecuta = usrEjecuta;
    }

    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public List<InvPedidosDetalle> getInvPedidosDetalleList() {
        return invPedidosDetalleList;
    }

    public void setInvPedidosDetalleList(List<InvPedidosDetalle> invPedidosDetalleList) {
        this.invPedidosDetalleList = invPedidosDetalleList;
    }

    public InvPedidosMotivo getInvPedidosMotivo() {
        return invPedidosMotivo;
    }

    public void setInvPedidosMotivo(InvPedidosMotivo invPedidosMotivo) {
        this.invPedidosMotivo = invPedidosMotivo;
    }

    public String getPedCodigoTransaccional() {
        return pedCodigoTransaccional;
    }

    public void setPedCodigoTransaccional(String pedCodigoTransaccional) {
        this.pedCodigoTransaccional = pedCodigoTransaccional;
    }

    public Date getPedFechaEmision() {
        return pedFechaEmision;
    }

    public void setPedFechaEmision(Date pedFechaEmision) {
        this.pedFechaEmision = pedFechaEmision;
    }

    public Date getPedFechaVencimiento() {
        return pedFechaVencimiento;
    }

    public void setPedFechaVencimiento(Date pedFechaVencimiento) {
        this.pedFechaVencimiento = pedFechaVencimiento;
    }

    public Date getPedFechaHoraEntrega() {
        return pedFechaHoraEntrega;
    }

    public void setPedFechaHoraEntrega(Date pedFechaHoraEntrega) {
        this.pedFechaHoraEntrega = pedFechaHoraEntrega;
    }

    public String getPedLugarEntrega() {
        return pedLugarEntrega;
    }

    public void setPedLugarEntrega(String pedLugarEntrega) {
        this.pedLugarEntrega = pedLugarEntrega;
    }

    public String getPedContactoNombre() {
        return pedContactoNombre;
    }

    public void setPedContactoNombre(String pedContactoNombre) {
        this.pedContactoNombre = pedContactoNombre;
    }

    public String getPedContactoTelefono() {
        return pedContactoTelefono;
    }

    public void setPedContactoTelefono(String pedContactoTelefono) {
        this.pedContactoTelefono = pedContactoTelefono;
    }

    public InvCliente getInvCliente() {
        return invCliente;
    }

    public void setInvCliente(InvCliente invCliente) {
        this.invCliente = invCliente;
    }

    public String getPedOrdenCompra() {
        return pedOrdenCompra;
    }

    public void setPedOrdenCompra(String pedOrdenCompra) {
        this.pedOrdenCompra = pedOrdenCompra;
    }

    public String getPedFormaCobro() {
        return pedFormaCobro;
    }

    public void setPedFormaCobro(String pedFormaCobro) {
        this.pedFormaCobro = pedFormaCobro;
    }

    public String getPedMotivoAnulacion() {
        return pedMotivoAnulacion;
    }

    public void setPedMotivoAnulacion(String pedMotivoAnulacion) {
        this.pedMotivoAnulacion = pedMotivoAnulacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invPedidosPK != null ? invPedidosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvPedidos)) {
            return false;
        }
        InvPedidos other = (InvPedidos) object;
        if ((this.invPedidosPK == null && other.invPedidosPK != null) || (this.invPedidosPK != null && !this.invPedidosPK.equals(other.invPedidosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidos[ invPedidosPK=" + invPedidosPK + " ]";
    }

}
