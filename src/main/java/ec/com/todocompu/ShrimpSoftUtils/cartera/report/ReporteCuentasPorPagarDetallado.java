package ec.com.todocompu.ShrimpSoftUtils.cartera.report;

import java.math.BigDecimal;

public class ReporteCuentasPorPagarDetallado {

    private String codigoCP;
    private String fechaHasta;
    private String proveedor;
    ///////// DETALLE
    private String cxpdPeriodo;
    private String cxpdMotivo;
    private String cxpdNumero;
    private String cxpdProveedor;
    private String cxpdObservaciones;
    private String cxpdFechaEmision;
    private String cxpdFechaVencimiento;
    private java.math.BigDecimal cxpdSaldo;
    private String cxpdZona;
    private String cxpdDiasCredito;
    private String cxpdDiasVencidos;
    private java.math.BigDecimal cxpdSaldoVencido;
    private java.math.BigDecimal cxpdSaldoPorVencer;
    private String cxpdDocumento;

    public ReporteCuentasPorPagarDetallado() {
    }

    public ReporteCuentasPorPagarDetallado(String codigoCP, String fechaHasta, String cxpdPeriodo, String cxpdMotivo,
            String cxpdNumero, String cxpdProveedor, String cxpdFechaEmision, String cxpdFechaVencimiento,
            BigDecimal cxpdSaldo) {
        this.codigoCP = codigoCP;
        this.fechaHasta = fechaHasta;
        this.cxpdPeriodo = cxpdPeriodo;
        this.cxpdMotivo = cxpdMotivo;
        this.cxpdNumero = cxpdNumero;
        this.cxpdProveedor = cxpdProveedor;
        this.cxpdFechaEmision = cxpdFechaEmision;
        this.cxpdFechaVencimiento = cxpdFechaVencimiento;
        this.cxpdSaldo = cxpdSaldo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getCodigoCP() {
        return codigoCP;
    }

    public void setCodigoCP(String codigoCP) {
        this.codigoCP = codigoCP;
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

    public String getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public String getCxpdObservaciones() {
        return cxpdObservaciones;
    }

    public void setCxpdObservaciones(String cxpdObservaciones) {
        this.cxpdObservaciones = cxpdObservaciones;
    }

    public String getCxpdZona() {
        return cxpdZona;
    }

    public void setCxpdZona(String cxpdZona) {
        this.cxpdZona = cxpdZona;
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

    public BigDecimal getCxpdSaldoVencido() {
        return cxpdSaldoVencido;
    }

    public void setCxpdSaldoVencido(BigDecimal cxpdSaldoVencido) {
        this.cxpdSaldoVencido = cxpdSaldoVencido;
    }

    public BigDecimal getCxpdSaldoPorVencer() {
        return cxpdSaldoPorVencer;
    }

    public void setCxpdSaldoPorVencer(BigDecimal cxpdSaldoPorVencer) {
        this.cxpdSaldoPorVencer = cxpdSaldoPorVencer;
    }

    public String getCxpdDocumento() {
        return cxpdDocumento;
    }

    public void setCxpdDocumento(String cxpdDocumento) {
        this.cxpdDocumento = cxpdDocumento;
    }

}
