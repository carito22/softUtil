/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class AnxFormulario103TO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "ret_concepto")
    private String retConcepto;

    @Column(name = "ret_codigo_retencion")
    private String retCodigoRetencion;

    @Column(name = "ret_base_imponible")
    private java.math.BigDecimal retBaseImponible;

    @Column(name = "ret_codigo_formulario_103")
    private String retCodigoFormulario103;

    @Column(name = "ret_valor_retenido")
    private java.math.BigDecimal retValorRetenido;

    public AnxFormulario103TO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRetConcepto() {
        return retConcepto;
    }

    public void setRetConcepto(String retConcepto) {
        this.retConcepto = retConcepto;
    }

    public String getRetCodigoRetencion() {
        return retCodigoRetencion;
    }

    public void setRetCodigoRetencion(String retCodigoRetencion) {
        this.retCodigoRetencion = retCodigoRetencion;
    }

    public BigDecimal getRetBaseImponible() {
        return retBaseImponible;
    }

    public void setRetBaseImponible(BigDecimal retBaseImponible) {
        this.retBaseImponible = retBaseImponible;
    }

    public String getRetCodigoFormulario103() {
        return retCodigoFormulario103;
    }

    public void setRetCodigoFormulario103(String retCodigoFormulario103) {
        this.retCodigoFormulario103 = retCodigoFormulario103;
    }

    public BigDecimal getRetValorRetenido() {
        return retValorRetenido;
    }

    public void setRetValorRetenido(BigDecimal retValorRetenido) {
        this.retValorRetenido = retValorRetenido;
    }

}
