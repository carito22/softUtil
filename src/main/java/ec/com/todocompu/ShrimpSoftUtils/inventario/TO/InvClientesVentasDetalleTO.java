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
 * @author Andres Guachisaca
 */
@Entity
public class InvClientesVentasDetalleTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "det_secuencial")
    private Integer detSecuencia;

    @Column(name = "det_orden")
    private Integer detOrden;

    @Column(name = "det_grupo")
    private Integer detGrupo;

    @Column(name = "det_cantidad")
    private java.math.BigDecimal detCantidad;

    @Column(name = "det_precio")
    private java.math.BigDecimal detPrecio;

    @Column(name = "det_porcentaje_recargo")
    private java.math.BigDecimal detPorcentajeRecargo;

    @Column(name = "det_porcentaje_descuento")
    private java.math.BigDecimal detPorcentajeDescuento;

    @Column(name = "pro_empresa")
    private String proEmpresa;

    @Column(name = "pro_codigo_principal")
    private String proCodigoPrincipal;

    @Column(name = "pro_nombre")
    private String proNombre;
    
    @Column(name = "pro_iva")
    private String proEstadoIva;
    
    @Column(name = "cli_empresa")
    private String cliEmpresa;

    @Column(name = "cli_codigo")
    private String cliCodigo;
    
    @Column(name = "cli_codigo_establecimiento")
    private String cliCodigoEstablecimiento;
    
    @Column(name = "bod_empresa")
    private String bodEmpresa;
    
    @Column(name = "bod_codigo")
    private String bodCodigo;
    
    @Column(name = "det_contrato_secuencial")
    private Integer detContratoSecuencial;

    public InvClientesVentasDetalleTO() {
    }

    public Integer getDetSecuencia() {
        return detSecuencia;
    }

    public void setDetSecuencia(Integer detSecuencia) {
        this.detSecuencia = detSecuencia;
    }

    public Integer getDetOrden() {
        return detOrden;
    }

    public void setDetOrden(Integer detOrden) {
        this.detOrden = detOrden;
    }

    public Integer getDetGrupo() {
        return detGrupo;
    }

    public void setDetGrupo(Integer detGrupo) {
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

    public String getProEmpresa() {
        return proEmpresa;
    }

    public void setProEmpresa(String proEmpresa) {
        this.proEmpresa = proEmpresa;
    }

    public String getProCodigoPrincipal() {
        return proCodigoPrincipal;
    }

    public void setProCodigoPrincipal(String proCodigoPrincipal) {
        this.proCodigoPrincipal = proCodigoPrincipal;
    }

    public String getProNombre() {
        return proNombre;
    }

    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
    }

    public String getCliEmpresa() {
        return cliEmpresa;
    }

    public void setCliEmpresa(String cliEmpresa) {
        this.cliEmpresa = cliEmpresa;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getProEstadoIva() {
        return proEstadoIva;
    }

    public void setProEstadoIva(String proEstadoIva) {
        this.proEstadoIva = proEstadoIva;
    }

    public String getCliCodigoEstablecimiento() {
        return cliCodigoEstablecimiento;
    }

    public void setCliCodigoEstablecimiento(String cliCodigoEstablecimiento) {
        this.cliCodigoEstablecimiento = cliCodigoEstablecimiento;
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

    public Integer getDetContratoSecuencial() {
        return detContratoSecuencial;
    }

    public void setDetContratoSecuencial(Integer detContratoSecuencial) {
        this.detContratoSecuencial = detContratoSecuencial;
    }

}
