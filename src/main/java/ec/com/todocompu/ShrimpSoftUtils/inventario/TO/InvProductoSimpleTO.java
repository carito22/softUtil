/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

/**
 *
 * @author Developer4
 */
public class InvProductoSimpleTO {

    private String proEmpresa;
    private String proCodigoPrincipal;
    private String proNombre;
    private String proDetalle;
    private Boolean proInactivo;
    private String catCodigo;
    private String medDetalle;
    private String medCodigo;
    private String medEmpresa;
    private boolean proCreditoTributario;
    private String proIva;
    private int proMaximo;

    public InvProductoSimpleTO() {

    }

    public InvProductoSimpleTO(String proEmpresa, String proCodigoPrincipal, String proNombre, String proDetalle, Boolean proInactivo, String catCodigo, String medDetalle, String medCodigo, String medEmpresa, boolean proCreditoTributario, String proIva, int proMaximo) {
        this.proEmpresa = proEmpresa;
        this.proCodigoPrincipal = proCodigoPrincipal;
        this.proNombre = proNombre;
        this.proDetalle = proDetalle;
        this.proInactivo = proInactivo;
        this.catCodigo = catCodigo;
        this.medDetalle = medDetalle;
        this.medCodigo = medCodigo;
        this.medEmpresa = medEmpresa;
        this.proCreditoTributario = proCreditoTributario;
        this.proIva = proIva;
        this.proMaximo = proMaximo;
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

    public String getProDetalle() {
        return proDetalle;
    }

    public void setProDetalle(String proDetalle) {
        this.proDetalle = proDetalle;
    }

    public Boolean getProInactivo() {
        return proInactivo;
    }

    public void setProInactivo(Boolean proInactivo) {
        this.proInactivo = proInactivo;
    }

    public String getCatCodigo() {
        return catCodigo;
    }

    public void setCatCodigo(String catCodigo) {
        this.catCodigo = catCodigo;
    }

    public String getMedDetalle() {
        return medDetalle;
    }

    public void setMedDetalle(String medDetalle) {
        this.medDetalle = medDetalle;
    }

    public String getMedCodigo() {
        return medCodigo;
    }

    public void setMedCodigo(String medCodigo) {
        this.medCodigo = medCodigo;
    }

    public String getMedEmpresa() {
        return medEmpresa;
    }

    public void setMedEmpresa(String medEmpresa) {
        this.medEmpresa = medEmpresa;
    }

    public boolean isProCreditoTributario() {
        return proCreditoTributario;
    }

    public void setProCreditoTributario(boolean proCreditoTributario) {
        this.proCreditoTributario = proCreditoTributario;
    }

    public String getProIva() {
        return proIva;
    }

    public void setProIva(String proIva) {
        this.proIva = proIva;
    }

    public int getProMaximo() {
        return proMaximo;
    }

    public void setProMaximo(int proMaximo) {
        this.proMaximo = proMaximo;
    }

}
