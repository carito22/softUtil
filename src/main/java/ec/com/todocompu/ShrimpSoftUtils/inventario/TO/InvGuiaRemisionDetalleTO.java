/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
public class InvGuiaRemisionDetalleTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "det_secuencial")
    private Integer detSecuencia;

    @Column(name = "det_orden")
    private Integer detOrden;

    @Column(name = "det_cantidad")
    private BigDecimal detCantidad;

    @Column(name = "pro_empresa")
    private String proEmpresa;

    @Column(name = "pro_codigo_principal")
    private String proCodigoPrincipal;

    @Column(name = "pro_nombre")
    private String nombreProducto;

    @Column(name = "guia_empresa")
    private String guiaEmpresa;

    @Column(name = "guia_periodo")
    private String guiaPeriodo;

    @Column(name = "guia_numero")
    private String guiaNumero;

    @Transient
    private String proCodigoPrincipalCopia;

    @Transient
    private String medidaProducto;

    public InvGuiaRemisionDetalleTO() {
    }

    public InvGuiaRemisionDetalleTO(Integer detSecuencia, Integer detOrden, BigDecimal detCantidad, String proEmpresa, String proCodigoPrincipal, String nombreProducto, String guiaEmpresa, String guiaPeriodo, String guiaNumero) {
        this.detSecuencia = detSecuencia;
        this.detOrden = detOrden;
        this.detCantidad = detCantidad;
        this.proEmpresa = proEmpresa;
        this.proCodigoPrincipal = proCodigoPrincipal;
        this.nombreProducto = nombreProducto;
        this.guiaEmpresa = guiaEmpresa;
        this.guiaPeriodo = guiaPeriodo;
        this.guiaNumero = guiaNumero;
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

    public String getGuiaPeriodo() {
        return guiaPeriodo;
    }

    public void setGuiaPeriodo(String guiaPeriodo) {
        this.guiaPeriodo = guiaPeriodo;
    }

    public BigDecimal getDetCantidad() {
        return detCantidad;
    }

    public void setDetCantidad(BigDecimal detCantidad) {
        this.detCantidad = detCantidad;
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

    public String getProCodigoPrincipalCopia() {
        return proCodigoPrincipalCopia;
    }

    public void setProCodigoPrincipalCopia(String proCodigoPrincipalCopia) {
        this.proCodigoPrincipalCopia = proCodigoPrincipalCopia;
    }

    public String getGuiaEmpresa() {
        return guiaEmpresa;
    }

    public void setGuiaEmpresa(String guiaEmpresa) {
        this.guiaEmpresa = guiaEmpresa;
    }

    public String getGuiaNumero() {
        return guiaNumero;
    }

    public void setGuiaNumero(String guiaNumero) {
        this.guiaNumero = guiaNumero;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getMedidaProducto() {
        return medidaProducto;
    }

    public void setMedidaProducto(String medidaProducto) {
        this.medidaProducto = medidaProducto;
    }

}
