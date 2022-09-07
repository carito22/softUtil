/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;

/**
 *
 * @author CarolValdiviezo
 */
public class InvProductoFormulaTO {

    private Integer proSecuencial;
    private String proEmpresa;
    private String proCodigoPrincipal;
    private String proFormulaEmpresa;
    private String proFormulaCodigoPrincipal;
    private String proFormulaCodigoPrincipalCopia;
    private String proFormulaNombre;
    private String proFormulaDetalle;
    private Boolean proFormulaInactivo;
    private String proFormulaMedidaDetalle;
    private String proFormulaMedidaCodigo;
    private BigDecimal proCantidad;
    private BigDecimal oldProCantidad;

    public InvProductoFormulaTO() {
    }

    public Integer getProSecuencial() {
        return proSecuencial;
    }

    public void setProSecuencial(Integer proSecuencial) {
        this.proSecuencial = proSecuencial;
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

    public String getProFormulaEmpresa() {
        return proFormulaEmpresa;
    }

    public void setProFormulaEmpresa(String proFormulaEmpresa) {
        this.proFormulaEmpresa = proFormulaEmpresa;
    }

    public String getProFormulaCodigoPrincipal() {
        return proFormulaCodigoPrincipal;
    }

    public void setProFormulaCodigoPrincipal(String proFormulaCodigoPrincipal) {
        this.proFormulaCodigoPrincipal = proFormulaCodigoPrincipal;
    }

    public String getProFormulaCodigoPrincipalCopia() {
        return proFormulaCodigoPrincipalCopia;
    }

    public void setProFormulaCodigoPrincipalCopia(String proFormulaCodigoPrincipalCopia) {
        this.proFormulaCodigoPrincipalCopia = proFormulaCodigoPrincipalCopia;
    }

    public String getProFormulaNombre() {
        return proFormulaNombre;
    }

    public void setProFormulaNombre(String proFormulaNombre) {
        this.proFormulaNombre = proFormulaNombre;
    }

    public String getProFormulaDetalle() {
        return proFormulaDetalle;
    }

    public void setProFormulaDetalle(String proFormulaDetalle) {
        this.proFormulaDetalle = proFormulaDetalle;
    }

    public Boolean getProFormulaInactivo() {
        return proFormulaInactivo;
    }

    public void setProFormulaInactivo(Boolean proFormulaInactivo) {
        this.proFormulaInactivo = proFormulaInactivo;
    }

    public String getProFormulaMedidaDetalle() {
        return proFormulaMedidaDetalle;
    }

    public void setProFormulaMedidaDetalle(String proFormulaMedidaDetalle) {
        this.proFormulaMedidaDetalle = proFormulaMedidaDetalle;
    }

    public String getProFormulaMedidaCodigo() {
        return proFormulaMedidaCodigo;
    }

    public void setProFormulaMedidaCodigo(String proFormulaMedidaCodigo) {
        this.proFormulaMedidaCodigo = proFormulaMedidaCodigo;
    }

    public BigDecimal getProCantidad() {
        return proCantidad;
    }

    public void setProCantidad(BigDecimal proCantidad) {
        this.proCantidad = proCantidad;
    }

    public BigDecimal getOldProCantidad() {
        return oldProCantidad;
    }

    public void setOldProCantidad(BigDecimal oldProCantidad) {
        this.oldProCantidad = oldProCantidad;
    }

}
