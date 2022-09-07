/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.report;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author misayo
 */
public class ReporteLiquidacionPesca {
    // CABECERA

    private String liqEmpresa;
    private String liqMotivo;
    private String liqNumero;
    private String liqLote;
    private String liqFecha;
    private String unidadMedida;
    private String liqClase;
    private BigDecimal liqLibrasEnviadas;
    private BigDecimal liqLibrasRecibidas;
    private BigDecimal liqLibrasBasura;
    private BigDecimal liqLibrasRetiradas;
    private BigDecimal liqLibrasNetas;
    private BigDecimal liqLibrasEntero;
    private BigDecimal liqLibrasCola;
    private BigDecimal liqLibrasColaProcesadas;
    private BigDecimal liqAnimalesCosechados;
    private BigDecimal liqTotalMonto;
    public BigDecimal detTotal;
    public BigDecimal totalLibras;
    private boolean liqPendiente;
    private boolean liqAnulado;
    //Piscina
    private String pisSector;
    private String pisNumero;
    //Cliente
    private String cliCodigo;
    private String cliNombre;
    //Sector
    private String sectorDetalle;
    //Corrida
    private String corSector;
    private String corPiscina;
    private String corNumero;
    private String corFechaDesde;
    private String corFechaHasta;
    //Totales
    private BigDecimal rendimiento;
    // DETALLE
    private Integer detSecuencial;
    private Integer detOrden;
    private BigDecimal detLibras;
    private BigDecimal detPrecio;
    private String prodCodigo;
    private String tallaCodigo;
    private String tallaDescripcion;
    private String detGuia;
    //proveedor
    private String provCodigo;
    private String provNombre;
    //Usuario
    private String liqUsuario;
    //Informacion Adicional
    private BigDecimal liqGramaje;
    private BigDecimal liqGavetas;
    private BigDecimal liqPesoPromedio;
    private BigDecimal liqLarvilla;
    private BigDecimal liqQuebrado;
    private String liqObservaciones;
    private String liqComisionista;

    private String liqBines;
    private String liqAguaje;
    private String liqPiscina;

    private String liqTipoReliquidacion;
    private BigDecimal liqRendimientoCola;

    public ReporteLiquidacionPesca() {
    }

    public ReporteLiquidacionPesca(String liqEmpresa, String liqMotivo, String liqNumero, String liqLote, String liqFecha, String unidadMedida, String liqClase, BigDecimal liqLibrasEnviadas, BigDecimal liqLibrasRecibidas, BigDecimal liqLibrasBasura, BigDecimal liqLibrasRetiradas, BigDecimal liqLibrasNetas, BigDecimal liqLibrasEntero, BigDecimal liqLibrasCola, BigDecimal liqLibrasColaProcesadas, BigDecimal liqAnimalesCosechados, BigDecimal liqTotalMonto, BigDecimal detTotal, boolean liqPendiente, boolean liqAnulado, String cliCodigo, String pisSector, String pisNumero, Integer detSecuencial, Integer detOrden, BigDecimal detLibras, BigDecimal detPrecio, String prodCodigo, String tallaCodigo, String provCodigo, String provNombre, String liqUsuario, BigDecimal liqGramaje, BigDecimal liqGavetas, BigDecimal liqPesoPromedio, BigDecimal liqLarvilla, BigDecimal liqQuebrado, String liqObservaciones, BigDecimal totalLibras) {
        this.liqEmpresa = liqEmpresa;
        this.liqMotivo = liqMotivo;
        this.liqNumero = liqNumero;
        this.liqLote = liqLote;
        this.liqFecha = liqFecha;
        this.unidadMedida = unidadMedida;
        this.liqClase = liqClase;
        this.liqLibrasEnviadas = liqLibrasEnviadas;
        this.liqLibrasRecibidas = liqLibrasRecibidas;
        this.liqLibrasBasura = liqLibrasBasura;
        this.liqLibrasRetiradas = liqLibrasRetiradas;
        this.liqLibrasNetas = liqLibrasNetas;
        this.liqLibrasEntero = liqLibrasEntero;
        this.liqLibrasCola = liqLibrasCola;
        this.liqLibrasColaProcesadas = liqLibrasColaProcesadas;
        this.liqAnimalesCosechados = liqAnimalesCosechados;
        this.liqTotalMonto = liqTotalMonto;
        this.detTotal = detTotal;
        this.liqPendiente = liqPendiente;
        this.liqAnulado = liqAnulado;
        this.cliCodigo = cliCodigo;
        this.pisSector = pisSector;
        this.pisNumero = pisNumero;
        this.detSecuencial = detSecuencial;
        this.detOrden = detOrden;
        this.detLibras = detLibras;
        this.detPrecio = detPrecio;
        this.prodCodigo = prodCodigo;
        this.tallaCodigo = tallaCodigo;
        this.provCodigo = provCodigo;
        this.provNombre = provNombre;
        this.liqUsuario = liqUsuario;
        this.liqGramaje = liqGramaje;
        this.liqGavetas = liqGavetas;
        this.liqPesoPromedio = liqPesoPromedio;
        this.liqLarvilla = liqLarvilla;
        this.liqQuebrado = liqQuebrado;
        this.liqObservaciones = liqObservaciones;
        this.totalLibras = totalLibras;
    }

    public String getLiqEmpresa() {
        return liqEmpresa;
    }

    public void setLiqEmpresa(String liqEmpresa) {
        this.liqEmpresa = liqEmpresa;
    }

    public String getLiqMotivo() {
        return liqMotivo;
    }

    public void setLiqMotivo(String liqMotivo) {
        this.liqMotivo = liqMotivo;
    }

    public String getLiqNumero() {
        return liqNumero;
    }

    public void setLiqNumero(String liqNumero) {
        this.liqNumero = liqNumero;
    }

    public String getLiqLote() {
        return liqLote;
    }

    public void setLiqLote(String liqLote) {
        this.liqLote = liqLote;
    }

    public String getLiqUsuario() {
        return liqUsuario;
    }

    public void setLiqUsuario(String liqUsuario) {
        this.liqUsuario = liqUsuario;
    }

    public String getLiqFecha() {
        return liqFecha;
    }

    public void setLiqFecha(String liqFecha) {
        this.liqFecha = liqFecha;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public String getLiqClase() {
        return liqClase;
    }

    public void setLiqClase(String liqClase) {
        this.liqClase = liqClase;
    }

    public BigDecimal getLiqLibrasEnviadas() {
        return liqLibrasEnviadas;
    }

    public void setLiqLibrasEnviadas(BigDecimal liqLibrasEnviadas) {
        this.liqLibrasEnviadas = liqLibrasEnviadas;
    }

    public BigDecimal getLiqLibrasRecibidas() {
        return liqLibrasRecibidas;
    }

    public void setLiqLibrasRecibidas(BigDecimal liqLibrasRecibidas) {
        this.liqLibrasRecibidas = liqLibrasRecibidas;
    }

    public BigDecimal getLiqLibrasBasura() {
        return liqLibrasBasura;
    }

    public void setLiqLibrasBasura(BigDecimal liqLibrasBasura) {
        this.liqLibrasBasura = liqLibrasBasura;
    }

    public BigDecimal getLiqLibrasRetiradas() {
        return liqLibrasRetiradas;
    }

    public void setLiqLibrasRetiradas(BigDecimal liqLibrasRetiradas) {
        this.liqLibrasRetiradas = liqLibrasRetiradas;
    }

    public BigDecimal getLiqLibrasNetas() {
        return liqLibrasNetas;
    }

    public void setLiqLibrasNetas(BigDecimal liqLibrasNetas) {
        this.liqLibrasNetas = liqLibrasNetas;
    }

    public BigDecimal getLiqLibrasEntero() {
        return liqLibrasEntero;
    }

    public void setLiqLibrasEntero(BigDecimal liqLibrasEntero) {
        this.liqLibrasEntero = liqLibrasEntero;
    }

    public BigDecimal getLiqLibrasCola() {
        return liqLibrasCola;
    }

    public void setLiqLibrasCola(BigDecimal liqLibrasCola) {
        this.liqLibrasCola = liqLibrasCola;
    }

    public BigDecimal getLiqLibrasColaProcesadas() {
        return liqLibrasColaProcesadas;
    }

    public void setLiqLibrasColaProcesadas(BigDecimal liqLibrasColaProcesadas) {
        this.liqLibrasColaProcesadas = liqLibrasColaProcesadas;
    }

    public BigDecimal getLiqAnimalesCosechados() {
        return liqAnimalesCosechados;
    }

    public void setLiqAnimalesCosechados(BigDecimal liqAnimalesCosechados) {
        this.liqAnimalesCosechados = liqAnimalesCosechados;
    }

    public BigDecimal getLiqTotalMonto() {
        return liqTotalMonto;
    }

    public void setLiqTotalMonto(BigDecimal liqTotalMonto) {
        this.liqTotalMonto = liqTotalMonto;
    }

    public BigDecimal getDetTotal() {
        return detTotal;
    }

    public void setDetTotal(BigDecimal detTotal) {
        this.detTotal = detTotal;
    }

    public boolean isLiqPendiente() {
        return liqPendiente;
    }

    public void setLiqPendiente(boolean liqPendiente) {
        this.liqPendiente = liqPendiente;
    }

    public boolean isLiqAnulado() {
        return liqAnulado;
    }

    public void setLiqAnulado(boolean liqAnulado) {
        this.liqAnulado = liqAnulado;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getPisSector() {
        return pisSector;
    }

    public void setPisSector(String pisSector) {
        this.pisSector = pisSector;
    }

    public String getPisNumero() {
        return pisNumero;
    }

    public void setPisNumero(String pisNumero) {
        this.pisNumero = pisNumero;
    }

    public Integer getDetSecuencial() {
        return detSecuencial;
    }

    public void setDetSecuencial(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public Integer getDetOrden() {
        return detOrden;
    }

    public void setDetOrden(Integer detOrden) {
        this.detOrden = detOrden;
    }

    public BigDecimal getDetLibras() {
        return detLibras;
    }

    public void setDetLibras(BigDecimal detLibras) {
        this.detLibras = detLibras;
    }

    public BigDecimal getDetPrecio() {
        return detPrecio;
    }

    public void setDetPrecio(BigDecimal detPrecio) {
        this.detPrecio = detPrecio;
    }

    public String getProdCodigo() {
        return prodCodigo;
    }

    public void setProdCodigo(String prodCodigo) {
        this.prodCodigo = prodCodigo;
    }

    public String getTallaCodigo() {
        return tallaCodigo;
    }

    public void setTallaCodigo(String tallaCodigo) {
        this.tallaCodigo = tallaCodigo;
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

    public String getCorFechaHasta() {
        return corFechaHasta;
    }

    public void setCorFechaHasta(String corFechaHasta) {
        this.corFechaHasta = corFechaHasta;
    }

    public BigDecimal getRendimiento() {
        return rendimiento;
    }

    public void setRendimiento(BigDecimal rendimiento) {
        this.rendimiento = rendimiento;
    }

    public String getCliNombre() {
        return cliNombre;
    }

    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }

    public String getSectorDetalle() {
        return sectorDetalle;
    }

    public void setSectorDetalle(String SectorDetalle) {
        this.sectorDetalle = SectorDetalle;
    }

    public String getProvCodigo() {
        return provCodigo;
    }

    public void setProvCodigo(String provCodigo) {
        this.provCodigo = provCodigo;
    }

    public String getProvNombre() {
        return provNombre;
    }

    public void setProvNombre(String provNombre) {
        this.provNombre = provNombre;
    }

    public String getTallaDescripcion() {
        return tallaDescripcion;
    }

    public void setTallaDescripcion(String tallaDescripcion) {
        this.tallaDescripcion = tallaDescripcion;
    }

    public BigDecimal getLiqGramaje() {
        return liqGramaje;
    }

    public void setLiqGramaje(BigDecimal liqGramaje) {
        this.liqGramaje = liqGramaje;
    }

    public BigDecimal getLiqGavetas() {
        return liqGavetas;
    }

    public void setLiqGavetas(BigDecimal liqGavetas) {
        this.liqGavetas = liqGavetas;
    }

    public BigDecimal getLiqPesoPromedio() {
        return liqPesoPromedio;
    }

    public void setLiqPesoPromedio(BigDecimal liqPesoPromedio) {
        this.liqPesoPromedio = liqPesoPromedio;
    }

    public BigDecimal getLiqLarvilla() {
        return liqLarvilla;
    }

    public void setLiqLarvilla(BigDecimal liqLarvilla) {
        this.liqLarvilla = liqLarvilla;
    }

    public BigDecimal getLiqQuebrado() {
        return liqQuebrado;
    }

    public void setLiqQuebrado(BigDecimal liqQuebrado) {
        this.liqQuebrado = liqQuebrado;
    }

    public String getLiqObservaciones() {
        return liqObservaciones;
    }

    public void setLiqObservaciones(String liqObservaciones) {
        this.liqObservaciones = liqObservaciones;
    }

    public BigDecimal getTotalLibras() {
        return totalLibras;
    }

    public void setTotalLibras(BigDecimal totalLibras) {
        this.totalLibras = totalLibras;
    }

    public String getDetGuia() {
        return detGuia;
    }

    public void setDetGuia(String detGuia) {
        this.detGuia = detGuia;
    }

    public String getLiqComisionista() {
        return liqComisionista;
    }

    public void setLiqComisionista(String liqComisionista) {
        this.liqComisionista = liqComisionista;
    }

    public String getLiqBines() {
        return liqBines;
    }

    public void setLiqBines(String liqBines) {
        this.liqBines = liqBines;
    }

    public String getLiqAguaje() {
        return liqAguaje;
    }

    public void setLiqAguaje(String liqAguaje) {
        this.liqAguaje = liqAguaje;
    }

    public String getLiqPiscina() {
        return liqPiscina;
    }

    public void setLiqPiscina(String liqPiscina) {
        this.liqPiscina = liqPiscina;
    }

    public String getLiqTipoReliquidacion() {
        return liqTipoReliquidacion;
    }

    public void setLiqTipoReliquidacion(String liqTipoReliquidacion) {
        this.liqTipoReliquidacion = liqTipoReliquidacion;
    }

    public BigDecimal getLiqRendimientoCola() {
        return liqRendimientoCola;
    }

    public void setLiqRendimientoCola(BigDecimal liqRendimientoCola) {
        this.liqRendimientoCola = liqRendimientoCola;
    }

}
