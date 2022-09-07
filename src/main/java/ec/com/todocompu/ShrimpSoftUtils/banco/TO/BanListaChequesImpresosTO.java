/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.banco.TO;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Mario Ramos Duque
 */
@Entity
public class BanListaChequesImpresosTO implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "chq_cuenta_codigo")
    private String chqCuentaCodigo;

    @Column(name = "chq_cuenta_detalle")
    private String chqCuentaDetalle;

    @Column(name = "chq_beneficiario")
    private String chqBeneficiario;

    @Column(name = "chq_numero")
    private String chqNumero;

    @Column(name = "chq_valor")
    private BigDecimal chqValor;

    @Column(name = "chq_fecha_emision")
    private String chqFechaEmision;

    @Column(name = "chq_fecha_vencimiento")
    private String chqFechaVencimiento;

    @Column(name = "chq_fecha_impresion")
    private String chqFechaImpresion;

    @Column(name = "chq_contable_periodo")
    private String chqContablePeriodo;

    @Column(name = "chq_contable_tipo")
    private String chqContableTipo;

    @Column(name = "chq_contable_numero")
    private String chqContableNumero;

    @Column(name = "conc_codigo")
    private String chqConCodigo;

    @Column(name = "chq_secuencia")
    private BigInteger chqSecuencia;

    @Column(name = "chq_orden")
    private BigInteger chqOrden;

    public BanListaChequesImpresosTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChqBeneficiario() {
        return chqBeneficiario;
    }

    public void setChqBeneficiario(String chqBeneficiario) {
        this.chqBeneficiario = chqBeneficiario;
    }

    public String getChqContableNumero() {
        return chqContableNumero;
    }

    public void setChqContableNumero(String chqContableNumero) {
        this.chqContableNumero = chqContableNumero;
    }

    public String getChqContablePeriodo() {
        return chqContablePeriodo;
    }

    public void setChqContablePeriodo(String chqContablePeriodo) {
        this.chqContablePeriodo = chqContablePeriodo;
    }

    public String getChqContableTipo() {
        return chqContableTipo;
    }

    public void setChqContableTipo(String chqContableTipo) {
        this.chqContableTipo = chqContableTipo;
    }

    public String getChqCuentaCodigo() {
        return chqCuentaCodigo;
    }

    public void setChqCuentaCodigo(String chqCuentaCodigo) {
        this.chqCuentaCodigo = chqCuentaCodigo;
    }

    public String getChqCuentaDetalle() {
        return chqCuentaDetalle;
    }

    public void setChqCuentaDetalle(String chqCuentaDetalle) {
        this.chqCuentaDetalle = chqCuentaDetalle;
    }

    public String getChqFechaEmision() {
        return chqFechaEmision;
    }

    public void setChqFechaEmision(String chqFechaEmision) {
        this.chqFechaEmision = chqFechaEmision;
    }

    public String getChqFechaVencimiento() {
        return chqFechaVencimiento;
    }

    public void setChqFechaVencimiento(String chqFechaVencimiento) {
        this.chqFechaVencimiento = chqFechaVencimiento;
    }

    public String getChqNumero() {
        return chqNumero;
    }

    public void setChqNumero(String chqNumero) {
        this.chqNumero = chqNumero;
    }

    public BigInteger getChqOrden() {
        return chqOrden;
    }

    public void setChqOrden(BigInteger chqOrden) {
        this.chqOrden = chqOrden;
    }

    public BigInteger getChqSecuencia() {
        return chqSecuencia;
    }

    public void setChqSecuencia(BigInteger chqSecuencia) {
        this.chqSecuencia = chqSecuencia;
    }

    public BigDecimal getChqValor() {
        return chqValor;
    }

    public void setChqValor(BigDecimal chqValor) {
        this.chqValor = chqValor;
    }

    public String getChqConCodigo() {
        return chqConCodigo;
    }

    public void setChqConCodigo(String chqConCodigo) {
        this.chqConCodigo = chqConCodigo;
    }

    public String getChqFechaImpresion() {
        return chqFechaImpresion;
    }

    public void setChqFechaImpresion(String chqFechaImpresion) {
        this.chqFechaImpresion = chqFechaImpresion;
    }

}
