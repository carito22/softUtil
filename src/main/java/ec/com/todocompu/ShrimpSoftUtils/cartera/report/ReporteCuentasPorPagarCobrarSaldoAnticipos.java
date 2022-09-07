package ec.com.todocompu.ShrimpSoftUtils.cartera.report;

import java.math.BigDecimal;

public class ReporteCuentasPorPagarCobrarSaldoAnticipos {

    private String codigoCP;
    private String fechaHasta;
    private String fechaDesde;
    ///////// DETALLE
    private String antPeriodo;
    private String antTipo;
    private String antNumero;
    private String antSector;
    private String antFecha;
    private java.math.BigDecimal antValor;
    private String antProveedorCodigo;
    private String antProveedorRazonSocial;

    public ReporteCuentasPorPagarCobrarSaldoAnticipos() {
    }

    public ReporteCuentasPorPagarCobrarSaldoAnticipos(String codigoCP, String fechaHasta, String antPeriodo,
            String antTipo, String antNumero, String antSector, String antFecha, BigDecimal antValor,
            String antProveedorCodigo, String antProveedorRazonSocial) {
        this.codigoCP = codigoCP;
        this.fechaHasta = fechaHasta;
        this.antPeriodo = antPeriodo;
        this.antTipo = antTipo;
        this.antNumero = antNumero;
        this.antSector = antSector;
        this.antFecha = antFecha;
        this.antValor = antValor;
        this.antProveedorCodigo = antProveedorCodigo;
        this.antProveedorRazonSocial = antProveedorRazonSocial;
    }

    public String getCodigoCP() {
        return codigoCP;
    }

    public void setCodigoCP(String codigoCP) {
        this.codigoCP = codigoCP;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public String getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(String fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public String getAntPeriodo() {
        return antPeriodo;
    }

    public void setAntPeriodo(String antPeriodo) {
        this.antPeriodo = antPeriodo;
    }

    public String getAntTipo() {
        return antTipo;
    }

    public void setAntTipo(String antTipo) {
        this.antTipo = antTipo;
    }

    public String getAntNumero() {
        return antNumero;
    }

    public void setAntNumero(String antNumero) {
        this.antNumero = antNumero;
    }

    public String getAntSector() {
        return antSector;
    }

    public void setAntSector(String antSector) {
        this.antSector = antSector;
    }

    public String getAntFecha() {
        return antFecha;
    }

    public void setAntFecha(String antFecha) {
        this.antFecha = antFecha;
    }

    public BigDecimal getAntValor() {
        return antValor;
    }

    public void setAntValor(BigDecimal antValor) {
        this.antValor = antValor;
    }

    public String getAntProveedorCodigo() {
        return antProveedorCodigo;
    }

    public void setAntProveedorCodigo(String antProveedorCodigo) {
        this.antProveedorCodigo = antProveedorCodigo;
    }

    public String getAntProveedorRazonSocial() {
        return antProveedorRazonSocial;
    }

    public void setAntProveedorRazonSocial(String antProveedorRazonSocial) {
        this.antProveedorRazonSocial = antProveedorRazonSocial;
    }
}
