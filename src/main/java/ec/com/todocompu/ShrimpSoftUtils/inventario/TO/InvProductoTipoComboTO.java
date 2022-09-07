/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvProductoTipoComboTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "tip_codigo")
    private String tipCodigo;

    @Column(name = "tip_detalle")
    private String tipDetalle;

    @Column(name = "tip_tipo")
    private String tipTipo;

    @Column(name = "tip_activo")
    private Boolean tipActivo;

    @Column(name = "cta_codigo")
    private String ctaCodigo;

    @Column(name = "cta_empresa")
    private String ctaEmpresa;

    public InvProductoTipoComboTO() {
    }

    public InvProductoTipoComboTO(String tipCodigo, String tipDetalle, String tipTipo, Boolean tipActivo, String ctaCodigo, String ctaEmpresa) {
        this.tipCodigo = tipCodigo;
        this.tipDetalle = tipDetalle;
        this.tipTipo = tipTipo;
        this.tipActivo = tipActivo;
        this.ctaCodigo = ctaCodigo;
        this.ctaEmpresa = ctaEmpresa;
    }

    public Boolean getTipActivo() {
        return tipActivo;
    }

    public void setTipActivo(Boolean tipActivo) {
        this.tipActivo = tipActivo;
    }

    public String getTipCodigo() {
        return tipCodigo;
    }

    public void setTipCodigo(String tipCodigo) {
        this.tipCodigo = tipCodigo;
    }

    public String getTipDetalle() {
        return tipDetalle;
    }

    public void setTipDetalle(String tipDetalle) {
        this.tipDetalle = tipDetalle;
    }

    public String getTipTipo() {
        return tipTipo;
    }

    public void setTipTipo(String tipTipo) {
        this.tipTipo = tipTipo;
    }

    @Override
    public String toString() {
        return this.tipDetalle;
    }

    public String getCtaCodigo() {
        return ctaCodigo;
    }

    public void setCtaCodigo(String ctaCodigo) {
        this.ctaCodigo = ctaCodigo;
    }

    public String getCtaEmpresa() {
        return ctaEmpresa;
    }

    public void setCtaEmpresa(String ctaEmpresa) {
        this.ctaEmpresa = ctaEmpresa;
    }
}
