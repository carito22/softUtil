/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.banco.TO;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class BanListaConciliacionBancariaTO implements Serializable {

    /**
     *
     */
    // cb_contable, cb_secuencial, cb_fecha, cb_documento,
    // cb_valor, cb_conciliado, cb_concepto, cb_observaciones
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "cb_contable")
    private String cbContable;

    @Column(name = "cb_secuencial")
    private Integer cbSecuencial;

    @Column(name = "cb_fecha")
    private String cbFecha;

    @Column(name = "cb_fecha_vencimiento")
    private String cbFechaVencimiento;

    @Column(name = "cb_documento")
    private String cbDocumento;

    @Column(name = "cb_valor")
    private java.math.BigDecimal cbValor;

    @Column(name = "cb_conciliado")
    private Boolean cbConciliado;

    @Column(name = "cb_conciliacion")
    private String cbConciliacion;

    @Column(name = "cb_concepto")
    private String cbConcepto;

    @Column(name = "cb_observaciones")
    private String cbObservaciones;

    @Column(name = "cb_dc")
    private char cbDc;

    @Column(name = "cb_categoria")
    private String cbCategoria;

    @Column(name = "cb_reversado")
    private Boolean cbReversado;

    public BanListaConciliacionBancariaTO() {
    }

    public BanListaConciliacionBancariaTO(String cbContable, Integer cbSecuencial, String cbFecha, String cbDocumento,
            BigDecimal cbValor, Boolean cbConciliado, String cbConcepto, String cbObservaciones, char cbDc, String cbCategoria,
            Integer id) {
        this.cbContable = cbContable;
        this.cbSecuencial = cbSecuencial;
        this.cbFecha = cbFecha;
        this.cbDocumento = cbDocumento;
        this.cbValor = cbValor;
        this.cbConciliado = cbConciliado;
        this.cbConcepto = cbConcepto;
        this.cbObservaciones = cbObservaciones;
        this.cbDc = cbDc;
        this.cbCategoria = cbCategoria;
        this.id = id;
    }

    public BanListaConciliacionBancariaTO(String cbContable, Integer cbSecuencial, String cbFecha, String cbDocumento,
            BigDecimal cbValor, Boolean cbConciliado, String cbObservaciones, String cbCategoria, Integer id) {
        this.cbContable = cbContable;
        this.cbSecuencial = cbSecuencial;
        this.cbFecha = cbFecha;
        this.cbDocumento = cbDocumento;
        this.cbValor = cbValor;
        this.cbConciliado = cbConciliado;
        this.cbObservaciones = cbObservaciones;
        this.cbCategoria = cbCategoria;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCbConcepto() {
        return cbConcepto;
    }

    public void setCbConcepto(String cbConcepto) {
        this.cbConcepto = cbConcepto;
    }

    public Boolean getCbConciliado() {
        return cbConciliado;
    }

    public void setCbConciliado(Boolean cbConciliado) {
        this.cbConciliado = cbConciliado;
    }

    public String getCbContable() {
        return cbContable;
    }

    public void setCbContable(String cbContable) {
        this.cbContable = cbContable;
    }

    public char getCbDc() {
        return cbDc;
    }

    public void setCbDc(char cbDc) {
        this.cbDc = cbDc;
    }

    public String getCbDocumento() {
        return cbDocumento;
    }

    public void setCbDocumento(String cbDocumento) {
        this.cbDocumento = cbDocumento;
    }

    public String getCbFecha() {
        return cbFecha;
    }

    public void setCbFecha(String cbFecha) {
        this.cbFecha = cbFecha;
    }

    public String getCbObservaciones() {
        return cbObservaciones;
    }

    public void setCbObservaciones(String cbObservaciones) {
        this.cbObservaciones = cbObservaciones;
    }

    public Integer getCbSecuencial() {
        return cbSecuencial;
    }

    public void setCbSecuencial(Integer cbSecuencial) {
        this.cbSecuencial = cbSecuencial;
    }

    public String getCbCategoria() {
        return cbCategoria;
    }

    public void setCbCategoria(String cbCategoria) {
        this.cbCategoria = cbCategoria;
    }

    public BigDecimal getCbValor() {
        return cbValor;
    }

    public void setCbValor(BigDecimal cbValor) {
        this.cbValor = cbValor;
    }

    public String getCbConciliacion() {
        return cbConciliacion;
    }

    public void setCbConciliacion(String cbConciliacion) {
        this.cbConciliacion = cbConciliacion;
    }

    public Boolean getCbReversado() {
        return cbReversado;
    }

    public void setCbReversado(Boolean cbReversado) {
        this.cbReversado = cbReversado;
    }

    public String getCbFechaVencimiento() {
        return cbFechaVencimiento;
    }

    public void setCbFechaVencimiento(String cbFechaVencimiento) {
        this.cbFechaVencimiento = cbFechaVencimiento;
    }

}
