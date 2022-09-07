package ec.com.todocompu.ShrimpSoftUtils.banco.TO;

import java.math.BigDecimal;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author KevinQuispe
 */
@Entity
public class BanDetalleChequesPosfechadosTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "chq_cliente_id")
    private String chqClienteId;

    @Column(name = "chq_cliente_razon_social")
    private String chqClienteRazonSocial;

    @Column(name = "chq_periodo")
    private String chqPeriodo;

    @Column(name = "chq_tipo")
    private String chqTipo;

    @Column(name = "chq_numero")
    private String chqNumero;

    @Column(name = "chq_banco")
    private String chqBanco;

    @Column(name = "chq_cuenta")
    private String chqCuenta;

    @Column(name = "chq_fecha_emision")
    private String chqFechaEmision;

    @Column(name = "chq_fecha_vencimiento")
    private String chqFechaVencimiento;

    @Column(name = "chq_referencia")
    private String chqReferencia;

    @Column(name = "chq_valor")
    private java.math.BigDecimal chqValor;

    @Column(name = "chq_observaciones")
    private String chqObservaciones;

    @Column(name = "det_secuencial")
    private String detSecuencial;

    public BanDetalleChequesPosfechadosTO() {
    }

    public BanDetalleChequesPosfechadosTO(Integer id, String chqClienteId, String chqClienteRazonSocial, String chqPeriodo, String chqTipo, String chqNumero, String chqBanco,
            String chqCuenta, String chqFechaEmision, String chqFechaVencimiento, String chqReferencia, BigDecimal chqValor,
            String chqObservaciones, String detSecuencial) {
        this.id = id;
        this.chqClienteId = chqClienteId;
        this.chqClienteRazonSocial = chqClienteRazonSocial;
        this.chqPeriodo = chqPeriodo;
        this.chqTipo = chqTipo;
        this.chqNumero = chqNumero;
        this.chqBanco = chqBanco;
        this.chqCuenta = chqCuenta;
        this.chqFechaEmision = chqFechaEmision;
        this.chqFechaVencimiento = chqFechaVencimiento;
        this.chqReferencia = chqReferencia;
        this.chqValor = chqValor;
        this.chqObservaciones = chqObservaciones;
        this.detSecuencial = detSecuencial;
    }

     public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getChqClienteId() {
        return chqClienteId;
    }

    public void setChqClienteId(String chqClienteId) {
        this.chqClienteId = chqClienteId;
    }

    public String getChqClienteRazonSocial() {
        return chqClienteRazonSocial;
    }

    public void setChqClienteRazonSocial(String chqClienteRazonSocial) {
        this.chqClienteRazonSocial = chqClienteRazonSocial;
    }

    public String getChqPeriodo() {
        return chqPeriodo;
    }

    public void setChqPeriodo(String chqPeriodo) {
        this.chqPeriodo = chqPeriodo;
    }

    public String getChqTipo() {
        return chqTipo;
    }

    public void setChqTipo(String chqTipo) {
        this.chqTipo = chqTipo;
    }

    public String getChqNumero() {
        return chqNumero;
    }

    public void setChqNumero(String chqNumero) {
        this.chqNumero = chqNumero;
    }

    public String getChqBanco() {
        return chqBanco;
    }

    public void setChqBanco(String chqBanco) {
        this.chqBanco = chqBanco;
    }

    public String getChqCuenta() {
        return chqCuenta;
    }

    public void setChqCuenta(String chqCuenta) {
        this.chqCuenta = chqCuenta;
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

    public String getChqReferencia() {
        return chqReferencia;
    }

    public void setChqReferencia(String chqReferencia) {
        this.chqReferencia = chqReferencia;
    }

    public BigDecimal getChqValor() {
        return chqValor;
    }

    public void setChqValor(BigDecimal chqValor) {
        this.chqValor = chqValor;
    }

    public String getChqObservaciones() {
        return chqObservaciones;
    }

    public void setChqObservaciones(String chqObservaciones) {
        this.chqObservaciones = chqObservaciones;
    }

    public String getDetSecuencial() {
        return detSecuencial;
    }

    public void setDetSecuencial(String detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

}
