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
public class InvComprasDetalleImbTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "det_secuencial")
    private Integer detSecuencia;

    @Column(name = "comp_empresa")
    private String comEmpresa;

    @Column(name = "comp_periodo")
    private String comPeriodo;

    @Column(name = "comp_motivo")
    private String comMotivo;

    @Column(name = "comp_numero")
    private String comNumero;

    @Column(name = "comp_imb_empresa")
    private String comImbEmpresa;

    @Column(name = "comp_imb_periodo")
    private String comImbPeriodo;

    @Column(name = "comp_imb_motivo")
    private String comImbMotivo;

    @Column(name = "comp_imb_numero")
    private String comImbNumero;

    @Column(name = "prov_imb_codigo")
    private String provImbCodigo;

    @Column(name = "prov_imb_empresa")
    private String provImbEmpresa;

    @Column(name = "comp_imb_total")
    private BigDecimal comImbTotal;

    @Transient
    private String comImbFecha;

    public InvComprasDetalleImbTO() {
    }

    public Integer getDetSecuencia() {
        return detSecuencia;
    }

    public void setDetSecuencia(Integer detSecuencia) {
        this.detSecuencia = detSecuencia;
    }

    public String getComEmpresa() {
        return comEmpresa;
    }

    public void setComEmpresa(String comEmpresa) {
        this.comEmpresa = comEmpresa;
    }

    public String getComPeriodo() {
        return comPeriodo;
    }

    public void setComPeriodo(String comPeriodo) {
        this.comPeriodo = comPeriodo;
    }

    public String getComMotivo() {
        return comMotivo;
    }

    public void setComMotivo(String comMotivo) {
        this.comMotivo = comMotivo;
    }

    public String getComNumero() {
        return comNumero;
    }

    public void setComNumero(String comNumero) {
        this.comNumero = comNumero;
    }

    public String getComImbEmpresa() {
        return comImbEmpresa;
    }

    public void setComImbEmpresa(String comImbEmpresa) {
        this.comImbEmpresa = comImbEmpresa;
    }

    public String getComImbPeriodo() {
        return comImbPeriodo;
    }

    public void setComImbPeriodo(String comImbPeriodo) {
        this.comImbPeriodo = comImbPeriodo;
    }

    public String getComImbMotivo() {
        return comImbMotivo;
    }

    public void setComImbMotivo(String comImbMotivo) {
        this.comImbMotivo = comImbMotivo;
    }

    public String getComImbNumero() {
        return comImbNumero;
    }

    public void setComImbNumero(String comImbNumero) {
        this.comImbNumero = comImbNumero;
    }

    public String getProvImbCodigo() {
        return provImbCodigo;
    }

    public void setProvImbCodigo(String provImbCodigo) {
        this.provImbCodigo = provImbCodigo;
    }

    public String getProvImbEmpresa() {
        return provImbEmpresa;
    }

    public void setProvImbEmpresa(String provImbEmpresa) {
        this.provImbEmpresa = provImbEmpresa;
    }

    public BigDecimal getComImbTotal() {
        return comImbTotal;
    }

    public void setComImbTotal(BigDecimal comImbTotal) {
        this.comImbTotal = comImbTotal;
    }

    public String getComImbFecha() {
        return comImbFecha;
    }

    public void setComImbFecha(String comImbFecha) {
        this.comImbFecha = comImbFecha;
    }

}
