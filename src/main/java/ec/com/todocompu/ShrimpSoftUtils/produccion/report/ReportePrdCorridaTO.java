package ec.com.todocompu.ShrimpSoftUtils.produccion.report;

import java.io.Serializable;

public class ReportePrdCorridaTO implements Serializable {

    private String corEmpresa;
    private String corSector;
    private String corPiscina;
    private String corNumero;

    private String corFechaDesde;
    private String corFechaSiembra;
    private String corFechaPesca;
    private String corFechaHasta;

    public ReportePrdCorridaTO() {
    }

    public String getCorEmpresa() {
        return corEmpresa;
    }

    public void setCorEmpresa(String corEmpresa) {
        this.corEmpresa = corEmpresa;
    }

    public String getCorSector() {
        return corSector;
    }

    public void setCorSector(String corSector) {
        this.corSector = corSector;
    }

    public String getCorPiscina() {
        return corPiscina;
    }

    public void setCorPiscina(String corPiscina) {
        this.corPiscina = corPiscina;
    }

    public String getCorNumero() {
        return corNumero;
    }

    public void setCorNumero(String corNumero) {
        this.corNumero = corNumero;
    }

    public String getCorFechaDesde() {
        return corFechaDesde;
    }

    public void setCorFechaDesde(String corFechaDesde) {
        this.corFechaDesde = corFechaDesde;
    }

    public String getCorFechaSiembra() {
        return corFechaSiembra;
    }

    public void setCorFechaSiembra(String corFechaSiembra) {
        this.corFechaSiembra = corFechaSiembra;
    }

    public String getCorFechaPesca() {
        return corFechaPesca;
    }

    public void setCorFechaPesca(String corFechaPesca) {
        this.corFechaPesca = corFechaPesca;
    }

    public String getCorFechaHasta() {
        return corFechaHasta;
    }

    public void setCorFechaHasta(String corFechaHasta) {
        this.corFechaHasta = corFechaHasta;
    }

}
