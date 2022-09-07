/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class AnxSustentoComboTO implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "sus_codigo")
    private String susCodigo;

    @Column(name = "sus_descripcion")
    private String susDescripcion;

    @Column(name = "sus_tipo_credito_tributario")
    private String susTipoCreditoTributario;

    public AnxSustentoComboTO() {
    }

    public AnxSustentoComboTO(String susCodigo, String susDescripcion) {
        this.susCodigo = susCodigo;
        this.susDescripcion = susDescripcion;
    }

    public String getSusCodigo() {
        return susCodigo;
    }

    public void setSusCodigo(String susCodigo) {
        this.susCodigo = susCodigo;
    }

    public String getSusDescripcion() {
        return susDescripcion;
    }

    public void setSusDescripcion(String susDescripcion) {
        this.susDescripcion = susDescripcion;
    }

    public String getSusTipoCreditoTributario() {
        return susTipoCreditoTributario;
    }

    public void setSusTipoCreditoTributario(String susTipoCreditoTributario) {
        this.susTipoCreditoTributario = susTipoCreditoTributario;
    }

    @Override
    public String toString() {
        return this.susDescripcion;
    }
}
