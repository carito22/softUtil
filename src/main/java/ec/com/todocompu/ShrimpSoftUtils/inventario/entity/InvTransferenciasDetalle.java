package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdPiscina;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.CascadeType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "inv_transferencias_detalle", schema = "inventario")
public class InvTransferenciasDetalle implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "det_secuencial")
    private Integer detSecuencial;
    @Column(name = "det_orden")
    private int detOrden;
    @Column(name = "det_pendiente")
    private boolean detPendiente;
    @Column(name = "det_confirmado")
    private boolean detConfirmado;
    @Column(name = "det_cantidad")
    private BigDecimal detCantidad;
    @Column(name = "det_origen_valor_promedio", insertable = false, updatable = false)
    private BigDecimal detOrigenValorPromedio;
    @Column(name = "det_origen_valor_ultima_compra", insertable = false, updatable = false)
    private BigDecimal detOrigenValorUltimaCompra;
    @Column(name = "det_origen_saldo", insertable = false, updatable = false)
    private BigDecimal detOrigenSaldo;
    @Column(name = "det_destino_valor_promedio", insertable = false, updatable = false)
    private BigDecimal detDestinoValorPromedio;
    @Column(name = "det_destino_valor_ultima_compra", insertable = false, updatable = false)
    private BigDecimal detDestinoValorUltimaCompra;
    @Column(name = "det_destino_saldo", insertable = false, updatable = false)
    private BigDecimal detDestinoSaldo;
    @Column(name = "sec_origen_empresa")
    private String secOrigenEmpresa;
    @Column(name = "sec_origen_codigo")
    private String secOrigenCodigo;
    @Column(name = "sec_destino_empresa")
    private String secDestinoEmpresa;
    @Column(name = "sec_destino_codigo")
    private String secDestinoCodigo;
	@JoinColumns({ @JoinColumn(name = "trans_empresa", referencedColumnName = "trans_empresa"),
			@JoinColumn(name = "trans_periodo", referencedColumnName = "trans_periodo"),
			@JoinColumn(name = "trans_motivo", referencedColumnName = "trans_motivo"),
			@JoinColumn(name = "trans_numero", referencedColumnName = "trans_numero") })
    @ManyToOne(optional = false)
    private InvTransferencias invTransferencias;
	@JoinColumns({ @JoinColumn(name = "pro_empresa", referencedColumnName = "pro_empresa"),
			@JoinColumn(name = "pro_codigo_principal", referencedColumnName = "pro_codigo_principal") })
    @ManyToOne(optional = false)
    private InvProducto invProducto;
	@JoinColumns({ @JoinColumn(name = "bod_origen_empresa", referencedColumnName = "bod_empresa"),
			@JoinColumn(name = "bod_origen_codigo", referencedColumnName = "bod_codigo") })
    @ManyToOne
    private InvBodega invBodega;
	@JoinColumns({ @JoinColumn(name = "bod_destino_empresa", referencedColumnName = "bod_empresa"),
			@JoinColumn(name = "bod_destino_codigo", referencedColumnName = "bod_codigo") })
    @ManyToOne
    private InvBodega invBodega1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "detSecuencialTransferencia")
    private List<InvTransferenciasDetalleSeries> invTransferenciasDetalleSeriesList;
    
    @JoinColumns({
        @JoinColumn(name = "pis_empresa", referencedColumnName = "pis_empresa")
        , @JoinColumn(name = "pis_sector", referencedColumnName = "pis_sector")
        , @JoinColumn(name = "pis_numero", referencedColumnName = "pis_numero")})
    @ManyToOne(optional = true)
    private PrdPiscina prdPiscina;

    public InvTransferenciasDetalle() {
    }

    public InvTransferenciasDetalle(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public InvTransferenciasDetalle(Integer detSecuencial, int detOrden, boolean detPendiente, boolean detConfirmado,
            BigDecimal detCantidad) {
        this.detSecuencial = detSecuencial;
        this.detOrden = detOrden;
        this.detPendiente = detPendiente;
        this.detConfirmado = detConfirmado;
        this.detCantidad = detCantidad;
    }

    public Integer getDetSecuencial() {
        return detSecuencial;
    }

    public void setDetSecuencial(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public int getDetOrden() {
        return detOrden;
    }

    public void setDetOrden(int detOrden) {
        this.detOrden = detOrden;
    }

    public boolean getDetPendiente() {
        return detPendiente;
    }

    public void setDetPendiente(boolean detPendiente) {
        this.detPendiente = detPendiente;
    }

    public boolean getDetConfirmado() {
        return detConfirmado;
    }

    public void setDetConfirmado(boolean detConfirmado) {
        this.detConfirmado = detConfirmado;
    }

    public BigDecimal getDetCantidad() {
        return detCantidad;
    }

    public void setDetCantidad(BigDecimal detCantidad) {
        this.detCantidad = detCantidad;
    }

    public BigDecimal getDetOrigenValorPromedio() {
        return detOrigenValorPromedio;
    }

    public void setDetOrigenValorPromedio(BigDecimal detOrigenValorPromedio) {
        this.detOrigenValorPromedio = detOrigenValorPromedio;
    }

    public BigDecimal getDetOrigenValorUltimaCompra() {
        return detOrigenValorUltimaCompra;
    }

    public void setDetOrigenValorUltimaCompra(BigDecimal detOrigenValorUltimaCompra) {
        this.detOrigenValorUltimaCompra = detOrigenValorUltimaCompra;
    }

    public BigDecimal getDetOrigenSaldo() {
        return detOrigenSaldo;
    }

    public void setDetOrigenSaldo(BigDecimal detOrigenSaldo) {
        this.detOrigenSaldo = detOrigenSaldo;
    }

    public BigDecimal getDetDestinoValorPromedio() {
        return detDestinoValorPromedio;
    }

    public void setDetDestinoValorPromedio(BigDecimal detDestinoValorPromedio) {
        this.detDestinoValorPromedio = detDestinoValorPromedio;
    }

    public BigDecimal getDetDestinoValorUltimaCompra() {
        return detDestinoValorUltimaCompra;
    }

    public void setDetDestinoValorUltimaCompra(BigDecimal detDestinoValorUltimaCompra) {
        this.detDestinoValorUltimaCompra = detDestinoValorUltimaCompra;
    }

    public BigDecimal getDetDestinoSaldo() {
        return detDestinoSaldo;
    }

    public void setDetDestinoSaldo(BigDecimal detDestinoSaldo) {
        this.detDestinoSaldo = detDestinoSaldo;
    }

    public String getSecOrigenEmpresa() {
        return secOrigenEmpresa;
    }

    public void setSecOrigenEmpresa(String secOrigenEmpresa) {
        this.secOrigenEmpresa = secOrigenEmpresa;
    }

    public String getSecOrigenCodigo() {
        return secOrigenCodigo;
    }

    public void setSecOrigenCodigo(String secOrigenCodigo) {
        this.secOrigenCodigo = secOrigenCodigo;
    }

    public String getSecDestinoEmpresa() {
        return secDestinoEmpresa;
    }

    public void setSecDestinoEmpresa(String secDestinoEmpresa) {
        this.secDestinoEmpresa = secDestinoEmpresa;
    }

    public String getSecDestinoCodigo() {
        return secDestinoCodigo;
    }

    public void setSecDestinoCodigo(String secDestinoCodigo) {
        this.secDestinoCodigo = secDestinoCodigo;
    }

    public InvTransferencias getInvTransferencias() {
        return invTransferencias;
    }

    public void setInvTransferencias(InvTransferencias invTransferencias) {
        this.invTransferencias = invTransferencias;
    }

    public InvProducto getInvProducto() {
        return invProducto;
    }

    public void setInvProducto(InvProducto invProducto) {
        this.invProducto = invProducto;
    }

    public InvBodega getInvBodega() {
        return invBodega;
    }

    public void setInvBodega(InvBodega invBodega) {
        this.invBodega = invBodega;
    }

    public InvBodega getInvBodega1() {
        return invBodega1;
    }

    public void setInvBodega1(InvBodega invBodega1) {
        this.invBodega1 = invBodega1;
    }

    public PrdPiscina getPrdPiscina() {
        return prdPiscina;
    }

    public void setPrdPiscina(PrdPiscina prdPiscina) {
        this.prdPiscina = prdPiscina;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detSecuencial != null ? detSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvTransferenciasDetalle)) {
            return false;
        }
        InvTransferenciasDetalle other = (InvTransferenciasDetalle) object;
        if ((this.detSecuencial == null && other.detSecuencial != null)
                || (this.detSecuencial != null && !this.detSecuencial.equals(other.detSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "inventario.entity.InvTransferenciasDetalle[ detSecuencial=" + detSecuencial + " ]";
    }

    public List<InvTransferenciasDetalleSeries> getInvTransferenciasDetalleSeriesList() {
        return invTransferenciasDetalleSeriesList;
    }

    public void setInvTransferenciasDetalleSeriesList(List<InvTransferenciasDetalleSeries> invTransferenciasDetalleSeriesList) {
        this.invTransferenciasDetalleSeriesList = invTransferenciasDetalleSeriesList;
    }

}
