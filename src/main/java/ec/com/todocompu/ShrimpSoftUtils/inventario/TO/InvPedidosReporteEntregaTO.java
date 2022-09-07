/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Mario Ramos Duque
 */
@Entity
public class InvPedidosReporteEntregaTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "ent_entregado")
    private String entEntregado;
    @Column(name = "ent_det_por_entregar")
    private BigDecimal entDetPorEntregar;
    @Column(name = "ent_det_entregado")
    private BigDecimal entDetEntregado;
    @Column(name = "ent_det_cantidad")
    private BigDecimal entDetCantidad;
    @Column(name = "ent_det_cantidad_aprobada")
    private BigDecimal entDetCantidadAprobada;
    @Column(name = "ent_pro_codigo_principal")
    private String entProCodigoPrincipal;
    @Column(name = "ent_pro_detalle")
    private String entProDetalle;
    @Column(name = "ent_fecha_entrega")
    private String entFechaEntrega;
    @Column(name = "ent_fecha_emision")
    private String entFechaEmision;
    @Column(name = "ent_cliente")
    private String entCliente;
    @Column(name = "ent_proveedor")
    private String entProveedor;
    @Column(name = "ent_oc_motivo")
    private String entOcMotivo;
    @Column(name = "ent_oc_sector")
    private String entOcSector;
    @Column(name = "ent_oc_numero")
    private String entOcNumero;
    @Column(name = "ent_ped_motivo")
    private String entPedMotivo;
    @Column(name = "ent_ped_sector")
    private String entPedSector;
    @Column(name = "ent_ped_numero")
    private String entPedNumero;
    @Column(name = "ent_ped_empresa")
    private String entPedEmpresa;
    @Column(name = "ent_oc_lugar_entrega")
    private String entOcLugarEntrega;
    @Column(name = "ent_grupo_empresarial")
    private String entGrupoEmpresarial;
    @Column(name = "ent_ped_orden_compra")
    private String entPedOrdenCompra;
    @Column(name = "ent_oc_detalle_secuencial")
    private int entOcDetalleSecuencial;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntEntregado() {
        return entEntregado;
    }

    public void setEntEntregado(String entEntregado) {
        this.entEntregado = entEntregado;
    }

    public BigDecimal getEntDetPorEntregar() {
        return entDetPorEntregar;
    }

    public void setEntDetPorEntregar(BigDecimal entDetPorEntregar) {
        this.entDetPorEntregar = entDetPorEntregar;
    }

    public BigDecimal getEntDetEntregado() {
        return entDetEntregado;
    }

    public void setEntDetEntregado(BigDecimal entDetEntregado) {
        this.entDetEntregado = entDetEntregado;
    }

    public BigDecimal getEntDetCantidad() {
        return entDetCantidad;
    }

    public void setEntDetCantidad(BigDecimal entDetCantidad) {
        this.entDetCantidad = entDetCantidad;
    }

    public String getEntProCodigoPrincipal() {
        return entProCodigoPrincipal;
    }

    public void setEntProCodigoPrincipal(String entProCodigoPrincipal) {
        this.entProCodigoPrincipal = entProCodigoPrincipal;
    }

    public String getEntProDetalle() {
        return entProDetalle;
    }

    public void setEntProDetalle(String entProDetalle) {
        this.entProDetalle = entProDetalle;
    }

    public String getEntFechaEntrega() {
        return entFechaEntrega;
    }

    public void setEntFechaEntrega(String entFechaEntrega) {
        this.entFechaEntrega = entFechaEntrega;
    }

    public String getEntFechaEmision() {
        return entFechaEmision;
    }

    public void setEntFechaEmision(String entFechaEmision) {
        this.entFechaEmision = entFechaEmision;
    }

    public String getEntOcMotivo() {
        return entOcMotivo;
    }

    public void setEntOcMotivo(String entOcMotivo) {
        this.entOcMotivo = entOcMotivo;
    }

    public String getEntOcSector() {
        return entOcSector;
    }

    public void setEntOcSector(String entOcSector) {
        this.entOcSector = entOcSector;
    }

    public String getEntOcNumero() {
        return entOcNumero;
    }

    public void setEntOcNumero(String entOcNumero) {
        this.entOcNumero = entOcNumero;
    }

    public String getEntPedMotivo() {
        return entPedMotivo;
    }

    public void setEntPedMotivo(String entPedMotivo) {
        this.entPedMotivo = entPedMotivo;
    }

    public String getEntPedSector() {
        return entPedSector;
    }

    public void setEntPedSector(String entPedSector) {
        this.entPedSector = entPedSector;
    }

    public String getEntPedNumero() {
        return entPedNumero;
    }

    public void setEntPedNumero(String entPedNumero) {
        this.entPedNumero = entPedNumero;
    }

    public String getEntPedEmpresa() {
        return entPedEmpresa;
    }

    public void setEntPedEmpresa(String entPedEmpresa) {
        this.entPedEmpresa = entPedEmpresa;
    }

    public String getEntProveedor() {
        return entProveedor;
    }

    public void setEntProveedor(String entProveedor) {
        this.entProveedor = entProveedor;
    }

    public String getEntOcLugarEntrega() {
        return entOcLugarEntrega;
    }

    public void setEntOcLugarEntrega(String entOcLugarEntrega) {
        this.entOcLugarEntrega = entOcLugarEntrega;
    }

    public String getEntGrupoEmpresarial() {
        return entGrupoEmpresarial;
    }

    public void setEntGrupoEmpresarial(String entGrupoEmpresarial) {
        this.entGrupoEmpresarial = entGrupoEmpresarial;
    }

    public String getEntPedOrdenCompra() {
        return entPedOrdenCompra;
    }

    public void setEntPedOrdenCompra(String entPedOrdenCompra) {
        this.entPedOrdenCompra = entPedOrdenCompra;
    }

    public String getEntCliente() {
        return entCliente;
    }

    public void setEntCliente(String entCliente) {
        this.entCliente = entCliente;
    }

    public BigDecimal getEntDetCantidadAprobada() {
        return entDetCantidadAprobada;
    }

    public void setEntDetCantidadAprobada(BigDecimal entDetCantidadAprobada) {
        this.entDetCantidadAprobada = entDetCantidadAprobada;
    }

    public int getEntOcDetalleSecuencial() {
        return entOcDetalleSecuencial;
    }

    public void setEntOcDetalleSecuencial(int entOcDetalleSecuencial) {
        this.entOcDetalleSecuencial = entOcDetalleSecuencial;
    }

}
