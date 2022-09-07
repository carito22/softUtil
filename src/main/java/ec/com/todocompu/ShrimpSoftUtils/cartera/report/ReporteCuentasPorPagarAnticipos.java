package ec.com.todocompu.ShrimpSoftUtils.cartera.report;

import java.math.BigDecimal;

public class ReporteCuentasPorPagarAnticipos {

    private String codigoCP;
    private String fechaHasta;
    private boolean verDetalle;
    ///////// DETALLE
    private String cxpgCodigo;
    private String cxpgNombre;
    private BigDecimal cxpgSaldo;
    private BigDecimal cxpgAnticipo;
    private BigDecimal cxpgTotal;

    private BigDecimal cxppSaldoSinVencer;
    private BigDecimal cxppSaldoVencido30;
    private BigDecimal cxppSaldoVencido60;
    private BigDecimal cxppSaldoVencido90;
    private BigDecimal cxppSaldoVencido120;
    private BigDecimal cxppSaldoVencidoMayor120;

    public ReporteCuentasPorPagarAnticipos() {
    }

    public ReporteCuentasPorPagarAnticipos(String codigoCP, String fechaHasta, String cxpgCodigo, String cxpgNombre,
            BigDecimal cxpgSaldo, BigDecimal cxpgAnticipo, BigDecimal cxpgTotal) {
        this.codigoCP = codigoCP;
        this.fechaHasta = fechaHasta;
        this.cxpgCodigo = cxpgCodigo;
        this.cxpgNombre = cxpgNombre;
        this.cxpgSaldo = cxpgSaldo;
        this.cxpgAnticipo = cxpgAnticipo;
        this.cxpgTotal = cxpgTotal;
    }

    public String getCodigoCP() {
        return codigoCP;
    }

    public void setCodigoCP(String codigoCP) {
        this.codigoCP = codigoCP;
    }

    public BigDecimal getCxpgAnticipo() {
        return cxpgAnticipo;
    }

    public void setCxpgAnticipo(BigDecimal cxpgAnticipo) {
        this.cxpgAnticipo = cxpgAnticipo;
    }

    public String getCxpgCodigo() {
        return cxpgCodigo;
    }

    public void setCxpgCodigo(String cxpgCodigo) {
        this.cxpgCodigo = cxpgCodigo;
    }

    public String getCxpgNombre() {
        return cxpgNombre;
    }

    public void setCxpgNombre(String cxpgNombre) {
        this.cxpgNombre = cxpgNombre;
    }

    public BigDecimal getCxpgSaldo() {
        return cxpgSaldo;
    }

    public void setCxpgSaldo(BigDecimal cxpgSaldo) {
        this.cxpgSaldo = cxpgSaldo;
    }

    public BigDecimal getCxpgTotal() {
        return cxpgTotal;
    }

    public void setCxpgTotal(BigDecimal cxpgTotal) {
        this.cxpgTotal = cxpgTotal;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public BigDecimal getCxppSaldoSinVencer() {
        return cxppSaldoSinVencer;
    }

    public void setCxppSaldoSinVencer(BigDecimal cxppSaldoSinVencer) {
        this.cxppSaldoSinVencer = cxppSaldoSinVencer;
    }

    public BigDecimal getCxppSaldoVencido30() {
        return cxppSaldoVencido30;
    }

    public void setCxppSaldoVencido30(BigDecimal cxppSaldoVencido30) {
        this.cxppSaldoVencido30 = cxppSaldoVencido30;
    }

    public BigDecimal getCxppSaldoVencido60() {
        return cxppSaldoVencido60;
    }

    public void setCxppSaldoVencido60(BigDecimal cxppSaldoVencido60) {
        this.cxppSaldoVencido60 = cxppSaldoVencido60;
    }

    public BigDecimal getCxppSaldoVencido90() {
        return cxppSaldoVencido90;
    }

    public void setCxppSaldoVencido90(BigDecimal cxppSaldoVencido90) {
        this.cxppSaldoVencido90 = cxppSaldoVencido90;
    }

    public BigDecimal getCxppSaldoVencido120() {
        return cxppSaldoVencido120;
    }

    public void setCxppSaldoVencido120(BigDecimal cxppSaldoVencido120) {
        this.cxppSaldoVencido120 = cxppSaldoVencido120;
    }

    public BigDecimal getCxppSaldoVencidoMayor120() {
        return cxppSaldoVencidoMayor120;
    }

    public void setCxppSaldoVencidoMayor120(BigDecimal cxppSaldoVencidoMayor120) {
        this.cxppSaldoVencidoMayor120 = cxppSaldoVencidoMayor120;
    }

    public boolean isVerDetalle() {
        return verDetalle;
    }

    public void setVerDetalle(boolean verDetalle) {
        this.verDetalle = verDetalle;
    }

}
