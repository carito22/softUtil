/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class CarFunCuentasPagadasListadoTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "cxpd_periodo")
    private String cxpdPeriodo;

    @Column(name = "cxpd_motivo")
    private String cxpdMotivo;

    @Column(name = "cxpd_numero")
    private String cxpdNumero;

    @Column(name = "cxpd_proveedor")
    private String cxpdProveedor;

    @Column(name = "cxpd_fecha_emision")
    private String cxpdFechaEmision;

    @Column(name = "cxpd_fecha_vencimiento")
    private String cxpdFechaVencimiento;

    @Column(name = "cxpd_fecha_aprobacion")
    private String cxpdFechaAprobacion;

    @Column(name = "cxpd_usuario_aprobador")
    private String cxpdUsuarioAprobador;
    
    @Column(name = "cxpd_pago")
    private String cxpdPago;

    @Column(name = "cxpd_saldo")
    private java.math.BigDecimal cxpdSaldo;

    public CarFunCuentasPagadasListadoTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCxpdFechaEmision() {
        return cxpdFechaEmision;
    }

    public void setCxpdFechaEmision(String cxpdFechaEmision) {
        this.cxpdFechaEmision = cxpdFechaEmision;
    }

    public String getCxpdFechaVencimiento() {
        return cxpdFechaVencimiento;
    }

    public void setCxpdFechaVencimiento(String cxpdFechaVencimiento) {
        this.cxpdFechaVencimiento = cxpdFechaVencimiento;
    }

    public String getCxpdMotivo() {
        return cxpdMotivo;
    }

    public void setCxpdMotivo(String cxpdMotivo) {
        this.cxpdMotivo = cxpdMotivo;
    }

    public String getCxpdNumero() {
        return cxpdNumero;
    }

    public void setCxpdNumero(String cxpdNumero) {
        this.cxpdNumero = cxpdNumero;
    }

    public String getCxpdPeriodo() {
        return cxpdPeriodo;
    }

    public void setCxpdPeriodo(String cxpdPeriodo) {
        this.cxpdPeriodo = cxpdPeriodo;
    }

    public String getCxpdProveedor() {
        return cxpdProveedor;
    }

    public void setCxpdProveedor(String cxpdProveedor) {
        this.cxpdProveedor = cxpdProveedor;
    }

    public BigDecimal getCxpdSaldo() {
        return cxpdSaldo;
    }

    public void setCxpdSaldo(BigDecimal cxpdSaldo) {
        this.cxpdSaldo = cxpdSaldo;
    }

    public String getCxpdFechaAprobacion() {
        return cxpdFechaAprobacion;
    }

    public void setCxpdFechaAprobacion(String cxpdFechaAprobacion) {
        this.cxpdFechaAprobacion = cxpdFechaAprobacion;
    }

    public String getCxpdUsuarioAprobador() {
        return cxpdUsuarioAprobador;
    }

    public void setCxpdUsuarioAprobador(String cxpdUsuarioAprobador) {
        this.cxpdUsuarioAprobador = cxpdUsuarioAprobador;
    }

    public String getCxpdPago() {
        return cxpdPago;
    }

    public void setCxpdPago(String cxpdPago) {
        this.cxpdPago = cxpdPago;
    }

}
