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
public class InvProductoMarcaComboListadoTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "mar_codigo")
    private String marCodigo;

    @Column(name = "mar_detalle")
    private String marDetalle;

    @Column(name = "mar_abreviado")
    private String marAbreviado;
    
    @Column(name = "mar_incluir_en_facturacion")
    private boolean marIncluirEnFacturacion;

    public InvProductoMarcaComboListadoTO() {
    }

    public InvProductoMarcaComboListadoTO(String marCodigo, String marDetalle, String marAbreviado) {
        this.marCodigo = marCodigo;
        this.marDetalle = marDetalle;
        this.marAbreviado = marAbreviado;
    }

    public String getMarAbreviado() {
        return marAbreviado;
    }

    public void setMarAbreviado(String marAbreviado) {
        this.marAbreviado = marAbreviado;
    }

    public String getMarCodigo() {
        return marCodigo;
    }

    public void setMarCodigo(String marCodigo) {
        this.marCodigo = marCodigo;
    }

    public String getMarDetalle() {
        return marDetalle;
    }

    public void setMarDetalle(String marDetalle) {
        this.marDetalle = marDetalle;
    }

    public boolean isMarIncluirEnFacturacion() {
        return marIncluirEnFacturacion;
    }

    public void setMarIncluirEnFacturacion(boolean marIncluirEnFacturacion) {
        this.marIncluirEnFacturacion = marIncluirEnFacturacion;
    }

    @Override
    public String toString() {
        return this.marDetalle;
    }
}
