package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarListaPagosTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "cxpp_periodo")
    private String cxppPeriodo;
    @Column(name = "cxpp_motivo")
    private String cxppMotivo;
    @Column(name = "cxpp_numero")
    private String cxppNumero;
    @Column(name = "cxpp_documento_numero")
    private String cxppDocumentoNumero;
    @Column(name = "cxpp_usuario_aprueba_pago")
    private String cxppUsuarioApruebaPago;
    @Column(name = "cxpp_sector")
    private String cxppSector;
    @Column(name = "cxpp_fecha_emision")
    private String cxppFechaEmision;
    @Column(name = "cxpp_fecha_vencimiento")
    private String cxppFechaVencimiento;
    @Column(name = "cxpp_total")
    private BigDecimal cxppTotal;
    @Column(name = "cxpp_abonos")
    private BigDecimal cxppAbonos;
    @Column(name = "cxpp_saldo")
    private BigDecimal cxppSaldo;
    @Column(name = "cxpp_documento_tipo_complemento")
    private String cxppDocumentoTipoComplemento;
    @Column(name = "cxpp_documento_numero_complemento")
    private String cxppDocumentoNumeroComplemento;

    public CarListaPagosTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCxppPeriodo() {
        return cxppPeriodo;
    }

    public void setCxppPeriodo(String cxppPeriodo) {
        this.cxppPeriodo = cxppPeriodo;
    }

    public String getCxppMotivo() {
        return cxppMotivo;
    }

    public void setCxppMotivo(String cxppMotivo) {
        this.cxppMotivo = cxppMotivo;
    }

    public String getCxppNumero() {
        return cxppNumero;
    }

    public void setCxppNumero(String cxppNumero) {
        this.cxppNumero = cxppNumero;
    }

    public String getCxppDocumentoNumero() {
        return cxppDocumentoNumero;
    }

    public void setCxppDocumentoNumero(String cxppDocumentoNumero) {
        this.cxppDocumentoNumero = cxppDocumentoNumero;
    }

    public String getCxppSector() {
        return cxppSector;
    }

    public void setCxppSector(String cxppSector) {
        this.cxppSector = cxppSector;
    }

    public String getCxppFechaEmision() {
        return cxppFechaEmision;
    }

    public void setCxppFechaEmision(String cxppFechaEmision) {
        this.cxppFechaEmision = cxppFechaEmision;
    }

    public String getCxppFechaVencimiento() {
        return cxppFechaVencimiento;
    }

    public void setCxppFechaVencimiento(String cxppFechaVencimiento) {
        this.cxppFechaVencimiento = cxppFechaVencimiento;
    }

    public BigDecimal getCxppTotal() {
        return cxppTotal;
    }

    public void setCxppTotal(BigDecimal cxppTotal) {
        this.cxppTotal = cxppTotal;
    }

    public BigDecimal getCxppAbonos() {
        return cxppAbonos;
    }

    public void setCxppAbonos(BigDecimal cxppAbonos) {
        this.cxppAbonos = cxppAbonos;
    }

    public BigDecimal getCxppSaldo() {
        return cxppSaldo;
    }

    public void setCxppSaldo(BigDecimal cxppSaldo) {
        this.cxppSaldo = cxppSaldo;
    }

    public String getCxppUsuarioApruebaPago() {
        return cxppUsuarioApruebaPago;
    }

    public void setCxppUsuarioApruebaPago(String cxppUsuarioApruebaPago) {
        this.cxppUsuarioApruebaPago = cxppUsuarioApruebaPago;
    }

    public String getCxppDocumentoTipoComplemento() {
        return cxppDocumentoTipoComplemento;
    }

    public void setCxppDocumentoTipoComplemento(String cxppDocumentoTipoComplemento) {
        this.cxppDocumentoTipoComplemento = cxppDocumentoTipoComplemento;
    }

    public String getCxppDocumentoNumeroComplemento() {
        return cxppDocumentoNumeroComplemento;
    }

    public void setCxppDocumentoNumeroComplemento(String cxppDocumentoNumeroComplemento) {
        this.cxppDocumentoNumeroComplemento = cxppDocumentoNumeroComplemento;
    }

}
