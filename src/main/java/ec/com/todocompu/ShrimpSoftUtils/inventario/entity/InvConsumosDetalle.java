package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdEquipoControl;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@Entity
@Table(name = "inv_consumos_detalle", schema = "inventario")
public class InvConsumosDetalle implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "det_secuencial")
    private Integer detSecuencial;
    @Column(name = "det_orden")
    private int detOrden;
    @Column(name = "det_pendiente")
    private boolean detPendiente;
    @Column(name = "det_cantidad")
    private BigDecimal detCantidad;
    @Column(name = "det_valor_promedio", insertable = false, updatable = false)
    private BigDecimal detValorPromedio;
    @Column(name = "det_valor_ultima_compra", insertable = false, updatable = false)
    private BigDecimal detValorUltimaCompra;
    @Column(name = "det_saldo", insertable = false, updatable = false)
    private BigDecimal detSaldo;
    @Column(name = "sec_empresa")
    private String secEmpresa;
    @Column(name = "sec_codigo")
    private String secCodigo;
    @Column(name = "pis_empresa")
    private String pisEmpresa;
    @Column(name = "pis_sector")
    private String pisSector;
    @Column(name = "pis_numero")
    private String pisNumero;
    @JoinColumns({
        @JoinColumn(name = "pro_empresa", referencedColumnName = "pro_empresa")
        ,
			@JoinColumn(name = "pro_codigo_principal", referencedColumnName = "pro_codigo_principal")})
    @ManyToOne(optional = false)
    private InvProducto invProducto;
    @JoinColumns({
        @JoinColumn(name = "cons_empresa", referencedColumnName = "cons_empresa")
        ,
			@JoinColumn(name = "cons_periodo", referencedColumnName = "cons_periodo")
        ,
			@JoinColumn(name = "cons_motivo", referencedColumnName = "cons_motivo")
        ,
			@JoinColumn(name = "cons_numero", referencedColumnName = "cons_numero")})
    @ManyToOne(optional = false)
    @JsonIgnore
    private InvConsumos invConsumos;
    @JoinColumns({
        @JoinColumn(name = "bod_empresa", referencedColumnName = "bod_empresa")
        ,
			@JoinColumn(name = "bod_codigo", referencedColumnName = "bod_codigo")})
    @ManyToOne(optional = false)
    private InvBodega invBodega;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "detSecuencialConsumo")
    private List<InvConsumosDetalleSeries> invConsumosDetalleSeriesList;

    @JoinColumns({
        @JoinColumn(name = "ec_empresa", referencedColumnName = "ec_empresa")
        ,
        @JoinColumn(name = "ec_codigo", referencedColumnName = "ec_codigo")})
    @ManyToOne(optional = true)
    private PrdEquipoControl prdEquipoControl;

    public InvConsumosDetalle() {
    }

    public InvConsumosDetalle(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public InvConsumosDetalle(Integer detSecuencial, int detOrden, boolean detPendiente, BigDecimal detCantidad) {
        this.detSecuencial = detSecuencial;
        this.detOrden = detOrden;
        this.detPendiente = detPendiente;
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

    public BigDecimal getDetCantidad() {
        return detCantidad;
    }

    public void setDetCantidad(BigDecimal detCantidad) {
        this.detCantidad = detCantidad;
    }

    public BigDecimal getDetValorPromedio() {
        return detValorPromedio;
    }

    public void setDetValorPromedio(BigDecimal detValorPromedio) {
        this.detValorPromedio = detValorPromedio;
    }

    public BigDecimal getDetValorUltimaCompra() {
        return detValorUltimaCompra;
    }

    public void setDetValorUltimaCompra(BigDecimal detValorUltimaCompra) {
        this.detValorUltimaCompra = detValorUltimaCompra;
    }

    public BigDecimal getDetSaldo() {
        return detSaldo;
    }

    public void setDetSaldo(BigDecimal detSaldo) {
        this.detSaldo = detSaldo;
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

    public String getPisEmpresa() {
        return pisEmpresa;
    }

    public void setPisEmpresa(String pisEmpresa) {
        this.pisEmpresa = pisEmpresa;
    }

    public String getPisSector() {
        return pisSector;
    }

    public void setPisSector(String pisSector) {
        this.pisSector = pisSector;
    }

    public String getPisNumero() {
        return pisNumero;
    }

    public void setPisNumero(String pisNumero) {
        this.pisNumero = pisNumero;
    }

    public InvProducto getInvProducto() {
        return invProducto;
    }

    public void setInvProducto(InvProducto invProducto) {
        this.invProducto = invProducto;
    }

    public InvConsumos getInvConsumos() {
        return invConsumos;
    }

    public void setInvConsumos(InvConsumos invConsumos) {
        this.invConsumos = invConsumos;
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
        hash += (detSecuencial != null ? detSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof InvConsumosDetalle)) {
            return false;
        }
        InvConsumosDetalle other = (InvConsumosDetalle) object;
        if ((this.detSecuencial == null && other.detSecuencial != null)
                || (this.detSecuencial != null && !this.detSecuencial.equals(other.detSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "InvConsumosDetalle [detSecuencial=" + detSecuencial + ", detOrden=" + detOrden + ", detPendiente="
                + detPendiente + ", detCantidad=" + detCantidad + ", detValorPromedio=" + detValorPromedio
                + ", detValorUltimaCompra=" + detValorUltimaCompra + ", detSaldo=" + detSaldo + ", secEmpresa="
                + secEmpresa + ", secCodigo=" + secCodigo + ", pisEmpresa=" + pisEmpresa + ", pisSector=" + pisSector
                + ", pisNumero=" + pisNumero + ", invProducto=" + invProducto + ", invConsumos=" + invConsumos
                + ", invBodega=" + invBodega + "]";
    }

    public List<InvConsumosDetalleSeries> getInvConsumosDetalleSeriesList() {
        return invConsumosDetalleSeriesList;
    }

    public void setInvConsumosDetalleSeriesList(List<InvConsumosDetalleSeries> invConsumosDetalleSeriesList) {
        this.invConsumosDetalleSeriesList = invConsumosDetalleSeriesList;
    }

    public PrdEquipoControl getPrdEquipoControl() {
        return prdEquipoControl;
    }

    public void setPrdEquipoControl(PrdEquipoControl prdEquipoControl) {
        this.prdEquipoControl = prdEquipoControl;
    }

}
