package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarListaCobrosTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "cxcc_periodo")
    private String cxccPeriodo;
    @Column(name = "cxcc_motivo")
    private String cxccMotivo;
    @Column(name = "cxcc_numero")
    private String cxccNumero;
    @Column(name = "cxcc_documento_numero")
    private String cxccDocumentoNumero;
    @Column(name = "cxcc_sector")
    private String cxccSector;
    @Column(name = "cxcc_fecha_emision")
    private String cxccFechaEmision;
    @Column(name = "cxcc_fecha_vencimiento")
    private String cxccFechaVencimiento;
    @Column(name = "cxcc_total")
    private BigDecimal cxccTotal;
    @Column(name = "cxcc_abonos")
    private BigDecimal cxccAbonos;
    @Column(name = "cxcc_saldo")
    private BigDecimal cxccSaldo;
    @Column(name = "cxcc_documento_complemento")
    private String cxccDocumentoComplemento;

    public CarListaCobrosTO() {
    }

    public CarListaCobrosTO(String cxccPeriodo, String cxccMotivo, String cxccNumero,
            String cxccDocumentoNumero, String cxccSector, String cxccFechaEmision, String cxccFechaVencimiento,
            BigDecimal cxccTotal, BigDecimal cxccAbonos, BigDecimal cxccSaldo, Integer id) {
        this.cxccPeriodo = cxccPeriodo;
        this.cxccMotivo = cxccMotivo;
        this.cxccNumero = cxccNumero;
        this.cxccDocumentoNumero = cxccDocumentoNumero;
        this.cxccSector = cxccSector;
        this.cxccFechaEmision = cxccFechaEmision;
        this.cxccFechaVencimiento = cxccFechaVencimiento;
        this.cxccTotal = cxccTotal;
        this.cxccAbonos = cxccAbonos;
        this.cxccSaldo = cxccSaldo;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getCxccAbonos() {
        return cxccAbonos;
    }

    public void setCxccAbonos(BigDecimal cxccAbonos) {
        this.cxccAbonos = cxccAbonos;
    }

    public String getCxccDocumentoNumero() {
        return cxccDocumentoNumero;
    }

    public void setCxccDocumentoNumero(String cxccDocumentoNumero) {
        this.cxccDocumentoNumero = cxccDocumentoNumero;
    }

    public String getCxccFechaEmision() {
        return cxccFechaEmision;
    }

    public void setCxccFechaEmision(String cxccFechaEmision) {
        this.cxccFechaEmision = cxccFechaEmision;
    }

    public String getCxccFechaVencimiento() {
        return cxccFechaVencimiento;
    }

    public void setCxccFechaVencimiento(String cxccFechaVencimiento) {
        this.cxccFechaVencimiento = cxccFechaVencimiento;
    }

    public String getCxccMotivo() {
        return cxccMotivo;
    }

    public void setCxccMotivo(String cxccMotivo) {
        this.cxccMotivo = cxccMotivo;
    }

    public String getCxccNumero() {
        return cxccNumero;
    }

    public void setCxccNumero(String cxccNumero) {
        this.cxccNumero = cxccNumero;
    }

    public String getCxccPeriodo() {
        return cxccPeriodo;
    }

    public void setCxccPeriodo(String cxccPeriodo) {
        this.cxccPeriodo = cxccPeriodo;
    }

    public BigDecimal getCxccSaldo() {
        return cxccSaldo;
    }

    public void setCxccSaldo(BigDecimal cxccSaldo) {
        this.cxccSaldo = cxccSaldo;
    }

    public String getCxccSector() {
        return cxccSector;
    }

    public void setCxccSector(String cxccSector) {
        this.cxccSector = cxccSector;
    }

    public BigDecimal getCxccTotal() {
        return cxccTotal;
    }

    public void setCxccTotal(BigDecimal cxccTotal) {
        this.cxccTotal = cxccTotal;
    }

    public String getCxccDocumentoComplemento() {
        return cxccDocumentoComplemento;
    }

    public void setCxccDocumentoComplemento(String cxccDocumentoComplemento) {
        this.cxccDocumentoComplemento = cxccDocumentoComplemento;
    }

}
