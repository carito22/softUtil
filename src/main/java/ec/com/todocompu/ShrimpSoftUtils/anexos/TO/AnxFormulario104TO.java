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
public class AnxFormulario104TO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "f104_seccion")
    private String f104Seccion;

    @Column(name = "f104_descripcion")
    private String f104Descripcion;

    @Column(name = "f104_valor_bruto_codigo")
    private String f104ValorBrutoCodigo;

    @Column(name = "f104_valor_bruto_valor")
    private java.math.BigDecimal f104ValorBrutoValor;

    @Column(name = "f104_valor_neto_codigo")
    private String f104ValorNetoCodigo;

    @Column(name = "f104_valor_neto_valor")
    private java.math.BigDecimal f104ValorNetoValor;

    @Column(name = "f104_impuesto_generado_codigo")
    private String f104ImpuestoGeneradoCodigo;

    @Column(name = "f104_impuesto_generado_valor")
    private java.math.BigDecimal f104ImpuestoGeneradoValor;

    public AnxFormulario104TO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getF104Seccion() {
        return f104Seccion;
    }

    public void setF104Seccion(String f104Seccion) {
        this.f104Seccion = f104Seccion;
    }

    public String getF104Descripcion() {
        return f104Descripcion;
    }

    public void setF104Descripcion(String f104Descripcion) {
        this.f104Descripcion = f104Descripcion;
    }

    public String getF104ValorBrutoCodigo() {
        return f104ValorBrutoCodigo;
    }

    public void setF104ValorBrutoCodigo(String f104ValorBrutoCodigo) {
        this.f104ValorBrutoCodigo = f104ValorBrutoCodigo;
    }

    public BigDecimal getF104ValorBrutoValor() {
        return f104ValorBrutoValor;
    }

    public void setF104ValorBrutoValor(BigDecimal f104ValorBrutoValor) {
        this.f104ValorBrutoValor = f104ValorBrutoValor;
    }

    public String getF104ValorNetoCodigo() {
        return f104ValorNetoCodigo;
    }

    public void setF104ValorNetoCodigo(String f104ValorNetoCodigo) {
        this.f104ValorNetoCodigo = f104ValorNetoCodigo;
    }

    public BigDecimal getF104ValorNetoValor() {
        return f104ValorNetoValor;
    }

    public void setF104ValorNetoValor(BigDecimal f104ValorNetoValor) {
        this.f104ValorNetoValor = f104ValorNetoValor;
    }

    public String getF104ImpuestoGeneradoCodigo() {
        return f104ImpuestoGeneradoCodigo;
    }

    public void setF104ImpuestoGeneradoCodigo(String f104ImpuestoGeneradoCodigo) {
        this.f104ImpuestoGeneradoCodigo = f104ImpuestoGeneradoCodigo;
    }

    public BigDecimal getF104ImpuestoGeneradoValor() {
        return f104ImpuestoGeneradoValor;
    }

    public void setF104ImpuestoGeneradoValor(BigDecimal f104ImpuestoGeneradoValor) {
        this.f104ImpuestoGeneradoValor = f104ImpuestoGeneradoValor;
    }

}
