package ec.com.todocompu.ShrimpSoftUtils.cartera.report;

import java.math.BigDecimal;

public class ReporteCuentasPorCobrarDetallado {

    private String codigoCP;
    private String fechaHasta;
    ///////// DETALLE
    private String cxpdPeriodo;
    private String cxpdMotivo;
    private String cxpdNumero;
    private String cxpdCliente;
    private String cxpdFechaEmision;
    private String cxpdFechaVencimiento;
    private java.math.BigDecimal cxpdSaldo;

    private Integer cxcdDiasCredito;
    private Integer cxcdDiasVencidos;
    private BigDecimal cxcdTotal;
    private BigDecimal cxcdRetencionValor;
    private BigDecimal cxcdAbono;
    private String cxcdClienteGrupoEmpresarial;
    private String cxcdClienteRazonSocial;
    private String cxcdClienteCelular;
    private String cxcdClienteEmail;
    private String cxcdRetencionNumero;
    private String cxcdChequeNumero;

    public ReporteCuentasPorCobrarDetallado() {
    }

    public ReporteCuentasPorCobrarDetallado(String codigoCP, String fechaHasta, String cxpdPeriodo, String cxpdMotivo,
            String cxpdNumero, String cxpdCliente, String cxpdFechaEmision, String cxpdFechaVencimiento,
            BigDecimal cxpdSaldo) {
        this.codigoCP = codigoCP;
        this.fechaHasta = fechaHasta;
        this.cxpdPeriodo = cxpdPeriodo;
        this.cxpdMotivo = cxpdMotivo;
        this.cxpdNumero = cxpdNumero;
        this.cxpdCliente = cxpdCliente;
        this.cxpdFechaEmision = cxpdFechaEmision;
        this.cxpdFechaVencimiento = cxpdFechaVencimiento;
        this.cxpdSaldo = cxpdSaldo;
    }

    public String getCodigoCP() {
        return codigoCP;
    }

    public void setCodigoCP(String codigoCP) {
        this.codigoCP = codigoCP;
    }

    public String getCxpdCliente() {
        return cxpdCliente;
    }

    public void setCxpdCliente(String cxpdCliente) {
        this.cxpdCliente = cxpdCliente;
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

    public Integer getCxcdDiasCredito() {
        return cxcdDiasCredito;
    }

    public void setCxcdDiasCredito(Integer cxcdDiasCredito) {
        this.cxcdDiasCredito = cxcdDiasCredito;
    }

    public Integer getCxcdDiasVencidos() {
        return cxcdDiasVencidos;
    }

    public void setCxcdDiasVencidos(Integer cxcdDiasVencidos) {
        this.cxcdDiasVencidos = cxcdDiasVencidos;
    }

    public BigDecimal getCxcdTotal() {
        return cxcdTotal;
    }

    public void setCxcdTotal(BigDecimal cxcdTotal) {
        this.cxcdTotal = cxcdTotal;
    }

    public BigDecimal getCxcdRetencionValor() {
        return cxcdRetencionValor;
    }

    public void setCxcdRetencionValor(BigDecimal cxcdRetencionValor) {
        this.cxcdRetencionValor = cxcdRetencionValor;
    }

    public BigDecimal getCxcdAbono() {
        return cxcdAbono;
    }

    public void setCxcdAbono(BigDecimal cxcdAbono) {
        this.cxcdAbono = cxcdAbono;
    }

    public String getCxcdClienteGrupoEmpresarial() {
        return cxcdClienteGrupoEmpresarial;
    }

    public void setCxcdClienteGrupoEmpresarial(String cxcdClienteGrupoEmpresarial) {
        this.cxcdClienteGrupoEmpresarial = cxcdClienteGrupoEmpresarial;
    }

    public String getCxcdRetencionNumero() {
        return cxcdRetencionNumero;
    }

    public void setCxcdRetencionNumero(String cxcdRetencionNumero) {
        this.cxcdRetencionNumero = cxcdRetencionNumero;
    }

    public String getCxcdClienteRazonSocial() {
        return cxcdClienteRazonSocial;
    }

    public String getCxcdClienteCelular() {
        return cxcdClienteCelular;
    }

    public void setCxcdClienteCelular(String cxcdClienteCelular) {
        this.cxcdClienteCelular = cxcdClienteCelular;
    }

    public String getCxcdClienteEmail() {
        return cxcdClienteEmail;
    }

    public void setCxcdClienteEmail(String cxcdClienteEmail) {
        this.cxcdClienteEmail = cxcdClienteEmail;
    }

    public void setCxcdClienteRazonSocial(String cxcdClienteRazonSocial) {
        this.cxcdClienteRazonSocial = cxcdClienteRazonSocial;
    }

    public String getCxcdChequeNumero() {
        return cxcdChequeNumero;
    }

    public void setCxcdChequeNumero(String cxcdChequeNumero) {
        this.cxcdChequeNumero = cxcdChequeNumero;
    }

}
