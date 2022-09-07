/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class CarCobrosDetalleFormaPostfechadoTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "det_secuencial")
    private Integer detSecuencial;
    @Column(name = "ban_nombre")
    private String banNombre;
    @Column(name = "det_cuenta")
    private String detCuenta;
    @Column(name = "det_fecha_vencimiento")
    private String detFechaVencimiento;
    @Column(name = "det_referencia")
    private String detReferencia;
    @Column(name = "det_valor")
    private BigDecimal detValor;
    @Column(name = "det_observaciones")
    private String detObservaciones;
    @Column(name = "det_cliente_id")
    private String detClienteId;
    @Column(name = "det_cliente_razon_social")
    private String detClienteRazonSocial;
    @Transient
    private String tipo;
    @Column(name = "det_pk")
    private String pk;//PK DE ANTICIPO

    @Column(name = "det_contable_deposito_pk")
    private String depositoPk;//PK DE CONTABLE DEPOSITO

    public CarCobrosDetalleFormaPostfechadoTO() {
    }

    public CarCobrosDetalleFormaPostfechadoTO(Integer detSecuencial, String banNombre, String detCuenta, String detFechaVencimiento, String detReferencia, BigDecimal detValor, String detObservaciones) {
        this.detSecuencial = detSecuencial;
        this.banNombre = banNombre;
        this.detCuenta = detCuenta;
        this.detFechaVencimiento = detFechaVencimiento;
        this.detReferencia = detReferencia;
        this.detValor = detValor;
        this.detObservaciones = detObservaciones;
    }

    public Integer getDetSecuencial() {
        return detSecuencial;
    }

    public void setDetSecuencial(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public String getBanNombre() {
        return banNombre;
    }

    public void setBanNombre(String banNombre) {
        this.banNombre = banNombre;
    }

    public String getDetCuenta() {
        return detCuenta;
    }

    public void setDetCuenta(String detCuenta) {
        this.detCuenta = detCuenta;
    }

    public String getDetFechaVencimiento() {
        return detFechaVencimiento;
    }

    public void setDetFechaVencimiento(String detFechaVencimiento) {
        this.detFechaVencimiento = detFechaVencimiento;
    }

    public String getDetReferencia() {
        return detReferencia;
    }

    public void setDetReferencia(String detReferencia) {
        this.detReferencia = detReferencia;
    }

    public BigDecimal getDetValor() {
        return detValor;
    }

    public void setDetValor(BigDecimal detValor) {
        this.detValor = detValor;
    }

    public String getDetObservaciones() {
        return detObservaciones;
    }

    public void setDetObservaciones(String detObservaciones) {
        this.detObservaciones = detObservaciones;
    }

    public String getDetClienteId() {
        return detClienteId;
    }

    public void setDetClienteId(String detClienteId) {
        this.detClienteId = detClienteId;
    }

    public String getDetClienteRazonSocial() {
        return detClienteRazonSocial;
    }

    public void setDetClienteRazonSocial(String detClienteRazonSocial) {
        this.detClienteRazonSocial = detClienteRazonSocial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPk() {
        return pk;
    }

    public void setPk(String pk) {
        this.pk = pk;
    }

    public String getDepositoPk() {
        return depositoPk;
    }

    public void setDepositoPk(String depositoPk) {
        this.depositoPk = depositoPk;
    }

}
