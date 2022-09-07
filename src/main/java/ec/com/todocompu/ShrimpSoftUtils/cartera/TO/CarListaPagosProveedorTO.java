package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarListaPagosProveedorTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "prov_codigo")
    private String provCodigo;

    @Column(name = "prov_razon_social")
    private String provRazonSocial;

    @Column(name = "prov_id_numero")
    private String provRuc;

    @Column(name = "prov_direccion")
    private String provDireccion;

    @Column(name = "con_observaciones")
    private String provObservaciones;

    @Column(name = "con_fecha")
    private String conFecha;

    @Column(name = "pag_saldo_anterior")
    private BigDecimal pagSaldoAnterior;

    @Column(name = "pag_valor")
    private BigDecimal pagValor;

    @Column(name = "pag_saldo_actual")
    private BigDecimal pagSaldoActual;

    @Column(name = "prov_descripcion")
    private String provDescripcion;

    public CarListaPagosProveedorTO() {
    }

    public CarListaPagosProveedorTO(String provCodigo, String provRazonSocial, String provRuc, String provDireccion,
            String provObservaciones, String conFecha, BigDecimal pagSaldoAnterior, BigDecimal pagValor,
            BigDecimal pagSaldoActual) {
        this.provCodigo = provCodigo;
        this.provRazonSocial = provRazonSocial;
        this.provRuc = provRuc;
        this.provDireccion = provDireccion;
        this.provObservaciones = provObservaciones;
        this.conFecha = conFecha;
        this.pagSaldoAnterior = pagSaldoAnterior;
        this.pagValor = pagValor;
        this.pagSaldoActual = pagSaldoActual;
    }

    public BigDecimal getPagSaldoAnterior() {
        return pagSaldoAnterior;
    }

    public void setPagSaldoAnterior(BigDecimal pagSaldoAnterior) {
        this.pagSaldoAnterior = pagSaldoAnterior;
    }

    public BigDecimal getPagValor() {
        return pagValor;
    }

    public void setPagValor(BigDecimal pagValor) {
        this.pagValor = pagValor;
    }

    public BigDecimal getPagSaldoActual() {
        return pagSaldoActual;
    }

    public void setPagSaldoActual(BigDecimal pagSaldoActual) {
        this.pagSaldoActual = pagSaldoActual;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getConFecha() {
        return conFecha;
    }

    public void setConFecha(String conFecha) {
        this.conFecha = conFecha;
    }

    public String getProvCodigo() {
        return provCodigo;
    }

    public void setProvCodigo(String provCodigo) {
        this.provCodigo = provCodigo;
    }

    public String getProvDireccion() {
        return provDireccion;
    }

    public void setProvDireccion(String provDireccion) {
        this.provDireccion = provDireccion;
    }

    public String getProvRazonSocial() {
        return provRazonSocial;
    }

    public void setProvRazonSocial(String provRazonSocial) {
        this.provRazonSocial = provRazonSocial;
    }

    public String getProvObservaciones() {
        return provObservaciones;
    }

    public void setProvObservaciones(String provObservaciones) {
        this.provObservaciones = provObservaciones;
    }

    public String getProvRuc() {
        return provRuc;
    }

    public void setProvRuc(String provRuc) {
        this.provRuc = provRuc;
    }

    public String getProvDescripcion() {
        return provDescripcion;
    }

    public void setProvDescripcion(String provDescripcion) {
        this.provDescripcion = provDescripcion;
    }

}
