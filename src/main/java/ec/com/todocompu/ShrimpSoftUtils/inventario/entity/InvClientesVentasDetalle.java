/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author DEVELOPER
 */
@Entity
@Table(name = "inv_clientes_ventas_detalle", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvClientesVentasDetalle.findAll", query = "SELECT i FROM InvClientesVentasDetalle i")})
public class InvClientesVentasDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "det_secuencial")
    private Integer detSecuencial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "det_orden")
    private int detOrden;
    @Basic(optional = false)
    @NotNull
    @Column(name = "det_grupo")
    private int detGrupo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "det_cantidad")
    private BigDecimal detCantidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "det_precio")
    private BigDecimal detPrecio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "det_porcentaje_recargo")
    private BigDecimal detPorcentajeRecargo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "det_porcentaje_descuento")
    private BigDecimal detPorcentajeDescuento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "pro_nombre")
    private String proNombre;
    @Size(max = 2147483647)
    @Column(name = "cli_codigo_establecimiento")
    private String cliCodigoEstablecimiento;
    @JoinColumns({
        @JoinColumn(name = "cli_empresa", referencedColumnName = "cli_empresa"),
        @JoinColumn(name = "cli_codigo", referencedColumnName = "cli_codigo")})
    @ManyToOne(optional = false)
    private InvCliente invCliente;
    @JoinColumns({
        @JoinColumn(name = "pro_empresa", referencedColumnName = "pro_empresa"),
        @JoinColumn(name = "pro_codigo_principal", referencedColumnName = "pro_codigo_principal")})
    @ManyToOne(optional = false)
    private InvProducto invProducto;
    @Column(name = "bod_empresa")
    private String bodEmpresa;
    @Column(name = "bod_codigo")
    private String bodCodigo;
    @JoinColumns({
        @JoinColumn(name = "det_contrato_secuencial", referencedColumnName = "cli_secuencial")})
    @ManyToOne(optional = false)
    private InvClienteContrato invClienteContrato;

    public InvClientesVentasDetalle() {
    }

    public InvClientesVentasDetalle(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public InvClientesVentasDetalle(Integer detSecuencial, int detOrden, int detGrupo, BigDecimal detCantidad, BigDecimal detPrecio, BigDecimal detPorcentajeRecargo, BigDecimal detPorcentajeDescuento, String proNombre) {
        this.detSecuencial = detSecuencial;
        this.detOrden = detOrden;
        this.detGrupo = detGrupo;
        this.detCantidad = detCantidad;
        this.detPrecio = detPrecio;
        this.detPorcentajeRecargo = detPorcentajeRecargo;
        this.detPorcentajeDescuento = detPorcentajeDescuento;
        this.proNombre = proNombre;
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

    public int getDetGrupo() {
        return detGrupo;
    }

    public void setDetGrupo(int detGrupo) {
        this.detGrupo = detGrupo;
    }

    public BigDecimal getDetCantidad() {
        return detCantidad;
    }

    public void setDetCantidad(BigDecimal detCantidad) {
        this.detCantidad = detCantidad;
    }

    public BigDecimal getDetPrecio() {
        return detPrecio;
    }

    public void setDetPrecio(BigDecimal detPrecio) {
        this.detPrecio = detPrecio;
    }

    public BigDecimal getDetPorcentajeRecargo() {
        return detPorcentajeRecargo;
    }

    public void setDetPorcentajeRecargo(BigDecimal detPorcentajeRecargo) {
        this.detPorcentajeRecargo = detPorcentajeRecargo;
    }

    public BigDecimal getDetPorcentajeDescuento() {
        return detPorcentajeDescuento;
    }

    public void setDetPorcentajeDescuento(BigDecimal detPorcentajeDescuento) {
        this.detPorcentajeDescuento = detPorcentajeDescuento;
    }

    public String getProNombre() {
        return proNombre;
    }

    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
    }

    public InvCliente getInvCliente() {
        return invCliente;
    }

    public void setInvCliente(InvCliente invCliente) {
        this.invCliente = invCliente;
    }

    public InvProducto getInvProducto() {
        return invProducto;
    }

    public void setInvProducto(InvProducto invProducto) {
        this.invProducto = invProducto;
    }

    public String getCliCodigoEstablecimiento() {
        return cliCodigoEstablecimiento;
    }

    public void setCliCodigoEstablecimiento(String cliCodigoEstablecimiento) {
        this.cliCodigoEstablecimiento = cliCodigoEstablecimiento;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detSecuencial != null ? detSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvClientesVentasDetalle)) {
            return false;
        }
        InvClientesVentasDetalle other = (InvClientesVentasDetalle) object;
        if ((this.detSecuencial == null && other.detSecuencial != null) || (this.detSecuencial != null && !this.detSecuencial.equals(other.detSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvClientesVentasDetalle[ detSecuencial=" + detSecuencial + " ]";
    }

    public String getBodEmpresa() {
        return bodEmpresa;
    }

    public void setBodEmpresa(String bodEmpresa) {
        this.bodEmpresa = bodEmpresa;
    }

    public String getBodCodigo() {
        return bodCodigo;
    }

    public void setBodCodigo(String bodCodigo) {
        this.bodCodigo = bodCodigo;
    }

    public InvClienteContrato getInvClienteContrato() {
        return invClienteContrato;
    }

    public void setInvClienteContrato(InvClienteContrato invClienteContrato) {
        this.invClienteContrato = invClienteContrato;
    }

}
