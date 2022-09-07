package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
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

import com.fasterxml.jackson.annotation.JsonIgnore;
import ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhEmpleado;
import java.math.BigDecimal;
import javax.persistence.OrderBy;

@Entity
@Table(name = "inv_consumos", schema = "inventario")
public class InvConsumos implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected InvConsumosPK invConsumosPK;
    @Column(name = "cons_referencia")
    private String consReferencia;
    @Column(name = "cons_fecha")
    private Date consFecha;
    @Column(name = "cons_observaciones")
    private String consObservaciones;
    @Column(name = "cons_pendiente")
    private boolean consPendiente;
    @Column(name = "cons_revisado")
    private boolean consRevisado;
    @Column(name = "cons_anulado")
    private boolean consAnulado;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "cons_codigo", updatable = false)
    private String consCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @JoinColumns({
        @JoinColumn(name = "bod_empresa", referencedColumnName = "bod_empresa")
        ,
        @JoinColumn(name = "bod_codigo", referencedColumnName = "bod_codigo")})
    @ManyToOne
    private InvBodega invBodega;
    @OrderBy("det_orden ASC")
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invConsumos")
    private List<InvConsumosDetalle> invConsumosDetalleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invConsumos")
    @JsonIgnore
    private List<InvConsumosMotivoAnulacion> invConsumosMotivoAnulacionList;
    @JoinColumns({
        @JoinColumn(name = "cli_empresa", referencedColumnName = "cli_empresa")
        ,
        @JoinColumn(name = "cli_codigo", referencedColumnName = "cli_codigo")})
    @ManyToOne
    private InvCliente invCliente;
    @JoinColumns({
        @JoinColumn(name = "prov_empresa", referencedColumnName = "prov_empresa")
        ,
        @JoinColumn(name = "prov_codigo", referencedColumnName = "prov_codigo")})
    @ManyToOne
    private InvProveedor invProveedor;
    @JoinColumns({
        @JoinColumn(name = "emp_empresa", referencedColumnName = "emp_empresa")
        ,
        @JoinColumn(name = "emp_id", referencedColumnName = "emp_id")})
    @ManyToOne
    private RhEmpleado rhEmpleado;
    @JoinColumns({
        @JoinColumn(name = "pro_empresa", referencedColumnName = "pro_empresa")
        ,
        @JoinColumn(name = "pro_codigo_principal", referencedColumnName = "pro_codigo_principal")})
    @ManyToOne
    private InvProducto invProducto;
    @Column(name = "pro_cantidad")
    private BigDecimal proCantidad;

    public InvConsumos() {
    }

    public InvConsumos(InvConsumosPK invConsumosPK) {
        this.invConsumosPK = invConsumosPK;
    }

    public InvConsumos(InvConsumosPK invConsumosPK, Date consFecha, boolean consPendiente, boolean consRevisado,
            boolean consAnulado, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.invConsumosPK = invConsumosPK;
        this.consFecha = consFecha;
        this.consPendiente = consPendiente;
        this.consRevisado = consRevisado;
        this.consAnulado = consAnulado;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public InvConsumos(String consEmpresa, String consPeriodo, String consMotivo, String consNumero) {
        this.invConsumosPK = new InvConsumosPK(consEmpresa, consPeriodo, consMotivo, consNumero);
    }

    public InvConsumosPK getInvConsumosPK() {
        return invConsumosPK;
    }

    public void setInvConsumosPK(InvConsumosPK invConsumosPK) {
        this.invConsumosPK = invConsumosPK;
    }

    public String getConsReferencia() {
        return consReferencia;
    }

    public void setConsReferencia(String consReferencia) {
        this.consReferencia = consReferencia;
    }

    public Date getConsFecha() {
        return consFecha;
    }

    public void setConsFecha(Date consFecha) {
        this.consFecha = consFecha;
    }

    public String getConsObservaciones() {
        return consObservaciones;
    }

    public void setConsObservaciones(String consObservaciones) {
        this.consObservaciones = consObservaciones;
    }

    public boolean getConsPendiente() {
        return consPendiente;
    }

    public void setConsPendiente(boolean consPendiente) {
        this.consPendiente = consPendiente;
    }

    public boolean getConsRevisado() {
        return consRevisado;
    }

    public void setConsRevisado(boolean consRevisado) {
        this.consRevisado = consRevisado;
    }

    public boolean getConsAnulado() {
        return consAnulado;
    }

    public void setConsAnulado(boolean consAnulado) {
        this.consAnulado = consAnulado;
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

    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getConsCodigo() {
        return consCodigo;
    }

    public void setConsCodigo(String consCodigo) {
        this.consCodigo = consCodigo;
    }

    public InvBodega getInvBodega() {
        return invBodega;
    }

    public void setInvBodega(InvBodega invBodega) {
        this.invBodega = invBodega;
    }

    public List<InvConsumosDetalle> getInvConsumosDetalleList() {
        return invConsumosDetalleList;
    }

    public void setInvConsumosDetalleList(List<InvConsumosDetalle> invConsumosDetalleList) {
        this.invConsumosDetalleList = invConsumosDetalleList;
    }

    public List<InvConsumosMotivoAnulacion> getInvConsumosMotivoAnulacionList() {
        return invConsumosMotivoAnulacionList;
    }

    public void setInvConsumosMotivoAnulacionList(List<InvConsumosMotivoAnulacion> invConsumosMotivoAnulacionList) {
        this.invConsumosMotivoAnulacionList = invConsumosMotivoAnulacionList;
    }

    public InvConsumosDetalle removeInvConsumosDetalleList(InvConsumosDetalle invConsumosDetalle) {
        getInvConsumosDetalleList().remove(invConsumosDetalle);
        invConsumosDetalle.setInvConsumos(null);

        return invConsumosDetalle;
    }

    public InvConsumosDetalle addInvConsumosDetalleList(InvConsumosDetalle invConsumosDetalle) {
        getInvConsumosDetalleList().add(invConsumosDetalle);
        invConsumosDetalle.setInvConsumos(this);

        return invConsumosDetalle;
    }

    public InvCliente getInvCliente() {
        return invCliente;
    }

    public void setInvCliente(InvCliente invCliente) {
        this.invCliente = invCliente;
    }

    public InvProveedor getInvProveedor() {
        return invProveedor;
    }

    public void setInvProveedor(InvProveedor invProveedor) {
        this.invProveedor = invProveedor;
    }

    public RhEmpleado getRhEmpleado() {
        return rhEmpleado;
    }

    public void setRhEmpleado(RhEmpleado rhEmpleado) {
        this.rhEmpleado = rhEmpleado;
    }

    public InvProducto getInvProducto() {
        return invProducto;
    }

    public void setInvProducto(InvProducto invProducto) {
        this.invProducto = invProducto;
    }

    public BigDecimal getProCantidad() {
        return proCantidad;
    }

    public void setProCantidad(BigDecimal proCantidad) {
        this.proCantidad = proCantidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invConsumosPK != null ? invConsumosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvConsumos)) {
            return false;
        }
        InvConsumos other = (InvConsumos) object;
        if ((this.invConsumosPK == null && other.invConsumosPK != null)
                || (this.invConsumosPK != null && !this.invConsumosPK.equals(other.invConsumosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.entity.InvConsumos[ invConsumosPK=" + invConsumosPK + " ]";
    }

}
