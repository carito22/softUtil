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

/**
 *
 * @author Andres Guachisaca
 */

@Entity
public class CarFunCobrosDetalleTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "cob_numero_sistema")
    private String cobNumeroSistema;

    @Column(name = "cob_fecha")
    private String cobFecha;

    @Column(name = "cob_cliente")
    private String cobCliente;

    @Column(name = "cob_forma_pago")
    private String cobFormaPago;

    @Column(name = "cob_referencia")
    private String cobReferencia;

    @Column(name = "cob_valor")
    private java.math.BigDecimal cobValor;

    @Column(name = "cob_observaciones")
    private String cobObservaciones;

    @Column(name = "cob_pendiente")
    private Boolean cobPendiente;

    @Column(name = "cob_anulado")
    private Boolean cobAnulado;

    @Column(name = "cob_cliente_id")
    private String cobClienteId;

    @Column(name = "cob_cliente_razon_social")
    private String cobClienteRazonSocial;

    public CarFunCobrosDetalleTO() {
    }

    public CarFunCobrosDetalleTO(String cobNumeroSistema, String cobFecha, String cobCliente, String cobFormaPago,
            String cobReferencia, BigDecimal cobValor, String cobObservaciones, Boolean cobPendiente,
            Boolean cobAnulado, Integer id) {
        this.cobNumeroSistema = cobNumeroSistema;
        this.cobFecha = cobFecha;
        this.cobCliente = cobCliente;
        this.cobFormaPago = cobFormaPago;
        this.cobReferencia = cobReferencia;
        this.cobValor = cobValor;
        this.cobObservaciones = cobObservaciones;
        this.cobPendiente = cobPendiente;
        this.cobAnulado = cobAnulado;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getCobAnulado() {
        return cobAnulado;
    }

    public void setCobAnulado(Boolean cobAnulado) {
        this.cobAnulado = cobAnulado;
    }

    public String getCobCliente() {
        return cobCliente;
    }

    public void setCobCliente(String cobCliente) {
        this.cobCliente = cobCliente;
    }

    public String getCobFecha() {
        return cobFecha;
    }

    public void setCobFecha(String cobFecha) {
        this.cobFecha = cobFecha;
    }

    public String getCobFormaPago() {
        return cobFormaPago;
    }

    public void setCobFormaPago(String cobFormaPago) {
        this.cobFormaPago = cobFormaPago;
    }

    public String getCobNumeroSistema() {
        return cobNumeroSistema;
    }

    public void setCobNumeroSistema(String cobNumeroSistema) {
        this.cobNumeroSistema = cobNumeroSistema;
    }

    public String getCobObservaciones() {
        return cobObservaciones;
    }

    public void setCobObservaciones(String cobObservaciones) {
        this.cobObservaciones = cobObservaciones;
    }

    public Boolean getCobPendiente() {
        return cobPendiente;
    }

    public void setCobPendiente(Boolean cobPendiente) {
        this.cobPendiente = cobPendiente;
    }

    public String getCobReferencia() {
        return cobReferencia;
    }

    public void setCobReferencia(String cobReferencia) {
        this.cobReferencia = cobReferencia;
    }

    public BigDecimal getCobValor() {
        return cobValor;
    }

    public void setCobValor(BigDecimal cobValor) {
        this.cobValor = cobValor;
    }

    public String getCobClienteId() {
        return cobClienteId;
    }

    public void setCobClienteId(String cobClienteId) {
        this.cobClienteId = cobClienteId;
    }

    public String getCobClienteRazonSocial() {
        return cobClienteRazonSocial;
    }

    public void setCobClienteRazonSocial(String cobClienteRazonSocial) {
        this.cobClienteRazonSocial = cobClienteRazonSocial;
    }

}
