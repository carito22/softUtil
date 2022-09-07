/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author VALDIVIEZO
 */
@Entity
public class CarCuentasPorPagarDetalladoGranjasMarinasTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "cxpd_empresa")
    private String cxpdEmpresa;
    @Column(name = "cxpd_periodo")
    private String cxpdPeriodo;
    @Column(name = "cxpd_motivo")
    private String cxpdMotivo;
    @Column(name = "cxpd_numero")
    private String cxpdNumero;
    @Column(name = "cxpd_proveedor_id")
    private String cxpdProveedorId;
    @Column(name = "cxpd_proveedor_razon_social")
    private String cxpdProveedorRazonSocial;
    @Column(name = "cxpd_documento")
    private String cxpdDocumento;
    @Column(name = "cxpd_observaciones")
    private String cxpdObservaciones;
    @Column(name = "cxpd_fecha_emision")
    private String cxpdFechaEmision;
    @Column(name = "cxpd_fecha_vencimiento")
    private String cxpdFechaVencimiento;
    @Column(name = "cxpd_dias_credito")
    private String cxpdDiasCredito;
    @Column(name = "cxpd_dias_vencidos")
    private String cxpdDiasVencidos;
    @Column(name = "cxpd_saldo")
    private java.math.BigDecimal cxpdSaldo;
    @Column(name = "cxpd_usuario_aprueba_pago")
    private String cxpdUsuarioApruebaPago;
    @Column(name = "cxpd_zona")
    private String cxpdZona;

    public CarCuentasPorPagarDetalladoGranjasMarinasTO() {
    }

    public CarCuentasPorPagarDetalladoGranjasMarinasTO(Integer id, String cxpdEmpresa, String cxpdPeriodo, String cxpdMotivo, String cxpdNumero, String cxpdProveedorId, String cxpdProveedorRazonSocial, String cxpdDocumento, String cxpdObservaciones, String cxpdFechaEmision, String cxpdFechaVencimiento, String cxpdDiasCredito, String cxpdDiasVencidos, BigDecimal cxpdSaldo, String cxpdUsuarioApruebaPago) {
        this.id = id;
        this.cxpdEmpresa = cxpdEmpresa;
        this.cxpdPeriodo = cxpdPeriodo;
        this.cxpdMotivo = cxpdMotivo;
        this.cxpdNumero = cxpdNumero;
        this.cxpdProveedorId = cxpdProveedorId;
        this.cxpdProveedorRazonSocial = cxpdProveedorRazonSocial;
        this.cxpdDocumento = cxpdDocumento;
        this.cxpdObservaciones = cxpdObservaciones;
        this.cxpdFechaEmision = cxpdFechaEmision;
        this.cxpdFechaVencimiento = cxpdFechaVencimiento;
        this.cxpdDiasCredito = cxpdDiasCredito;
        this.cxpdDiasVencidos = cxpdDiasVencidos;
        this.cxpdSaldo = cxpdSaldo;
        this.cxpdUsuarioApruebaPago = cxpdUsuarioApruebaPago;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCxpdEmpresa() {
        return cxpdEmpresa;
    }

    public void setCxpdEmpresa(String cxpdEmpresa) {
        this.cxpdEmpresa = cxpdEmpresa;
    }

    public String getCxpdPeriodo() {
        return cxpdPeriodo;
    }

    public void setCxpdPeriodo(String cxpdPeriodo) {
        this.cxpdPeriodo = cxpdPeriodo;
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

    public String getCxpdProveedorId() {
        return cxpdProveedorId;
    }

    public void setCxpdProveedorId(String cxpdProveedorId) {
        this.cxpdProveedorId = cxpdProveedorId;
    }

    public String getCxpdProveedorRazonSocial() {
        return cxpdProveedorRazonSocial;
    }

    public void setCxpdProveedorRazonSocial(String cxpdProveedorRazonSocial) {
        this.cxpdProveedorRazonSocial = cxpdProveedorRazonSocial;
    }

    public String getCxpdDocumento() {
        return cxpdDocumento;
    }

    public void setCxpdDocumento(String cxpdDocumento) {
        this.cxpdDocumento = cxpdDocumento;
    }

    public String getCxpdObservaciones() {
        return cxpdObservaciones;
    }

    public void setCxpdObservaciones(String cxpdObservaciones) {
        this.cxpdObservaciones = cxpdObservaciones;
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

    public String getCxpdDiasCredito() {
        return cxpdDiasCredito;
    }

    public void setCxpdDiasCredito(String cxpdDiasCredito) {
        this.cxpdDiasCredito = cxpdDiasCredito;
    }

    public String getCxpdDiasVencidos() {
        return cxpdDiasVencidos;
    }

    public void setCxpdDiasVencidos(String cxpdDiasVencidos) {
        this.cxpdDiasVencidos = cxpdDiasVencidos;
    }

    public BigDecimal getCxpdSaldo() {
        return cxpdSaldo;
    }

    public void setCxpdSaldo(BigDecimal cxpdSaldo) {
        this.cxpdSaldo = cxpdSaldo;
    }

    public String getCxpdUsuarioApruebaPago() {
        return cxpdUsuarioApruebaPago;
    }

    public void setCxpdUsuarioApruebaPago(String cxpdUsuarioApruebaPago) {
        this.cxpdUsuarioApruebaPago = cxpdUsuarioApruebaPago;
    }

    public String getCxpdZona() {
        return cxpdZona;
    }

    public void setCxpdZona(String cxpdZona) {
        this.cxpdZona = cxpdZona;
    }

}
