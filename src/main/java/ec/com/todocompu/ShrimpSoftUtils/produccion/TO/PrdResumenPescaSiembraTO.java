package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdResumenPescaSiembraTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "rc_sector")
    private String rcSector;
    @Column(name = "rc_piscina")
    private String rcPiscina;
    @Column(name = "rc_corrida")
    private String rcCorrida;
    @Column(name = "rc_hectareaje")
    private BigDecimal rcHectareaje;
    @Column(name = "rc_fecha_desde")
    private String rcFechaDesde;
    @Column(name = "rc_fecha_siembra")
    private String rcFechaSiembra;
    @Column(name = "rc_fecha_pesca")
    private String rcFechaPesca;
    @Column(name = "rc_fecha_hasta")
    private String rcFechaHasta;
    @Column(name = "rc_edad")
    private BigDecimal rcEdad;
    @Column(name = "rc_dias_muertos")
    private BigDecimal rcDiasMuertos;
    @Column(name = "rc_numero_larvas")
    private Integer rcNumeroLarvas;
    @Column(name = "rc_densidad")
    private Integer rcDensidad;
    @Column(name = "rc_laboratorio")
    private String rcLaboratorio;
    @Column(name = "rc_nauplio")
    private String rcNauplio;
    @Column(name = "rc_balanceado")
    private BigDecimal rcBalanceado;
    @Column(name = "rc_biomasa")
    private BigDecimal rcBiomasa;
    @Column(name = "rc_biomasa_real")
    private BigDecimal rcBiomasaReal;
    @Column(name = "rc_conversion")
    private BigDecimal rcConversion;
    @Column(name = "rc_talla_promedio")
    private BigDecimal rcTallaPromedio;
    @Column(name = "rc_peso_ideal")
    private BigDecimal rcPesoIdeal;
    @Column(name = "rc_sobrevivencia")
    private String rcSobrevivencia;
    @Column(name = "rc_directo")
    private BigDecimal rcDirecto;
    @Column(name = "rc_indirecto")
    private BigDecimal rcIndirecto;
    @Column(name = "rc_transferencia")
    private BigDecimal rcTransferencia;
    @Column(name = "rc_subtotal")
    private BigDecimal rcSubtotal;
    @Column(name = "rc_administrativo")
    private BigDecimal rcAdministrativo;
    @Column(name = "rc_financiero")
    private BigDecimal rcFinanciero;
    @Column(name = "rc_gnd")
    private BigDecimal rcGND;
    @Column(name = "rc_subtotal2")
    private BigDecimal rcSubtotal2;
    @Column(name = "rc_total")
    private BigDecimal rcTotal;
    @Column(name = "rc_venta")
    private BigDecimal rcVenta;
    @Column(name = "rc_costo_balanceado")
    private BigDecimal rcCostoBalanceado;
    @Column(name = "rc_costo_balanceado_transferido")
    private BigDecimal rcCostoBalanceadoTransferido;
    @Column(name = "rc_otros_gastos")
    private BigDecimal rcOtrosGastos;
    @Column(name = "rc_directo_transferido")
    private BigDecimal rcDirectoTransferido;
    @Column(name = "rc_indirecto_transferido")
    private BigDecimal rcIndirectoTransferido;
    @Column(name = "rc_gasto_transferido")
    private BigDecimal rcGastoTransferido;
    @Column(name = "rc_otro_gasto_transferido")
    private BigDecimal rcOtroGastoTransferido;
    @Column(name = "rc_corrida_origen")
    private String rcCorridaOrigen;
    @Column(name = "rc_corrida_destino")
    private String rcCorridaDestino;

    public PrdResumenPescaSiembraTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRcSector() {
        return rcSector;
    }

    public void setRcSector(String rcSector) {
        this.rcSector = rcSector;
    }

    public String getRcPiscina() {
        return rcPiscina;
    }

    public void setRcPiscina(String rcPiscina) {
        this.rcPiscina = rcPiscina;
    }

    public String getRcCorrida() {
        return rcCorrida;
    }

    public void setRcCorrida(String rcCorrida) {
        this.rcCorrida = rcCorrida;
    }

    public BigDecimal getRcHectareaje() {
        return rcHectareaje;
    }

    public void setRcHectareaje(BigDecimal rcHectareaje) {
        this.rcHectareaje = rcHectareaje;
    }

    public String getRcFechaDesde() {
        return rcFechaDesde;
    }

    public void setRcFechaDesde(String rcFechaDesde) {
        this.rcFechaDesde = rcFechaDesde;
    }

    public String getRcFechaSiembra() {
        return rcFechaSiembra;
    }

    public void setRcFechaSiembra(String rcFechaSiembra) {
        this.rcFechaSiembra = rcFechaSiembra;
    }

    public String getRcFechaPesca() {
        return rcFechaPesca;
    }

    public void setRcFechaPesca(String rcFechaPesca) {
        this.rcFechaPesca = rcFechaPesca;
    }

    public String getRcFechaHasta() {
        return rcFechaHasta;
    }

    public void setRcFechaHasta(String rcFechaHasta) {
        this.rcFechaHasta = rcFechaHasta;
    }

    public BigDecimal getRcEdad() {
        return rcEdad;
    }

    public void setRcEdad(BigDecimal rcEdad) {
        this.rcEdad = rcEdad;
    }

    public BigDecimal getRcDiasMuertos() {
        return rcDiasMuertos;
    }

    public void setRcDiasMuertos(BigDecimal rcDiasMuertos) {
        this.rcDiasMuertos = rcDiasMuertos;
    }

    public Integer getRcNumeroLarvas() {
        return rcNumeroLarvas;
    }

    public void setRcNumeroLarvas(Integer rcNumeroLarvas) {
        this.rcNumeroLarvas = rcNumeroLarvas;
    }

    public Integer getRcDensidad() {
        return rcDensidad;
    }

    public void setRcDensidad(Integer rcDensidad) {
        this.rcDensidad = rcDensidad;
    }

    public String getRcLaboratorio() {
        return rcLaboratorio;
    }

    public void setRcLaboratorio(String rcLaboratorio) {
        this.rcLaboratorio = rcLaboratorio;
    }

    public String getRcNauplio() {
        return rcNauplio;
    }

    public void setRcNauplio(String rcNauplio) {
        this.rcNauplio = rcNauplio;
    }

    public BigDecimal getRcBalanceado() {
        return rcBalanceado;
    }

    public void setRcBalanceado(BigDecimal rcBalanceado) {
        this.rcBalanceado = rcBalanceado;
    }

    public BigDecimal getRcBiomasa() {
        return rcBiomasa;
    }

    public void setRcBiomasa(BigDecimal rcBiomasa) {
        this.rcBiomasa = rcBiomasa;
    }

    public BigDecimal getRcBiomasaReal() {
        return rcBiomasaReal;
    }

    public void setRcBiomasaReal(BigDecimal rcBiomasaReal) {
        this.rcBiomasaReal = rcBiomasaReal;
    }

    public BigDecimal getRcConversion() {
        return rcConversion;
    }

    public void setRcConversion(BigDecimal rcConversion) {
        this.rcConversion = rcConversion;
    }

    public BigDecimal getRcTallaPromedio() {
        return rcTallaPromedio;
    }

    public void setRcTallaPromedio(BigDecimal rcTallaPromedio) {
        this.rcTallaPromedio = rcTallaPromedio;
    }

    public BigDecimal getRcPesoIdeal() {
        return rcPesoIdeal;
    }

    public void setRcPesoIdeal(BigDecimal rcPesoIdeal) {
        this.rcPesoIdeal = rcPesoIdeal;
    }

    public String getRcSobrevivencia() {
        return rcSobrevivencia;
    }

    public void setRcSobrevivencia(String rcSobrevivencia) {
        this.rcSobrevivencia = rcSobrevivencia;
    }

    public BigDecimal getRcDirecto() {
        return rcDirecto;
    }

    public void setRcDirecto(BigDecimal rcDirecto) {
        this.rcDirecto = rcDirecto;
    }

    public BigDecimal getRcIndirecto() {
        return rcIndirecto;
    }

    public void setRcIndirecto(BigDecimal rcIndirecto) {
        this.rcIndirecto = rcIndirecto;
    }

    public BigDecimal getRcTransferencia() {
        return rcTransferencia;
    }

    public void setRcTransferencia(BigDecimal rcTransferencia) {
        this.rcTransferencia = rcTransferencia;
    }

    public BigDecimal getRcSubtotal() {
        return rcSubtotal;
    }

    public void setRcSubtotal(BigDecimal rcSubtotal) {
        this.rcSubtotal = rcSubtotal;
    }

    public BigDecimal getRcAdministrativo() {
        return rcAdministrativo;
    }

    public void setRcAdministrativo(BigDecimal rcAdministrativo) {
        this.rcAdministrativo = rcAdministrativo;
    }

    public BigDecimal getRcFinanciero() {
        return rcFinanciero;
    }

    public void setRcFinanciero(BigDecimal rcFinanciero) {
        this.rcFinanciero = rcFinanciero;
    }

    public BigDecimal getRcGND() {
        return rcGND;
    }

    public void setRcGND(BigDecimal rcGND) {
        this.rcGND = rcGND;
    }

    public BigDecimal getRcSubtotal2() {
        return rcSubtotal2;
    }

    public void setRcSubtotal2(BigDecimal rcSubtotal2) {
        this.rcSubtotal2 = rcSubtotal2;
    }

    public BigDecimal getRcTotal() {
        return rcTotal;
    }

    public void setRcTotal(BigDecimal rcTotal) {
        this.rcTotal = rcTotal;
    }

    public BigDecimal getRcVenta() {
        return rcVenta;
    }

    public void setRcVenta(BigDecimal rcVenta) {
        this.rcVenta = rcVenta;
    }

    public BigDecimal getRcCostoBalanceado() {
        return rcCostoBalanceado;
    }

    public void setRcCostoBalanceado(BigDecimal rcCostoBalanceado) {
        this.rcCostoBalanceado = rcCostoBalanceado;
    }

    public BigDecimal getRcCostoBalanceadoTransferido() {
        return rcCostoBalanceadoTransferido;
    }

    public void setRcCostoBalanceadoTransferido(BigDecimal rcCostoBalanceadoTransferido) {
        this.rcCostoBalanceadoTransferido = rcCostoBalanceadoTransferido;
    }

    public BigDecimal getRcOtrosGastos() {
        return rcOtrosGastos;
    }

    public void setRcOtrosGastos(BigDecimal rcOtrosGastos) {
        this.rcOtrosGastos = rcOtrosGastos;
    }

    public BigDecimal getRcDirectoTransferido() {
        return rcDirectoTransferido;
    }

    public void setRcDirectoTransferido(BigDecimal rcDirectoTransferido) {
        this.rcDirectoTransferido = rcDirectoTransferido;
    }

    public BigDecimal getRcIndirectoTransferido() {
        return rcIndirectoTransferido;
    }

    public void setRcIndirectoTransferido(BigDecimal rcIndirectoTransferido) {
        this.rcIndirectoTransferido = rcIndirectoTransferido;
    }

    public BigDecimal getRcGastoTransferido() {
        return rcGastoTransferido;
    }

    public void setRcGastoTransferido(BigDecimal rcGastoTransferido) {
        this.rcGastoTransferido = rcGastoTransferido;
    }

    public BigDecimal getRcOtroGastoTransferido() {
        return rcOtroGastoTransferido;
    }

    public void setRcOtroGastoTransferido(BigDecimal rcOtroGastoTransferido) {
        this.rcOtroGastoTransferido = rcOtroGastoTransferido;
    }

    public String getRcCorridaOrigen() {
        return rcCorridaOrigen;
    }

    public void setRcCorridaOrigen(String rcCorridaOrigen) {
        this.rcCorridaOrigen = rcCorridaOrigen;
    }

    public String getRcCorridaDestino() {
        return rcCorridaDestino;
    }

    public void setRcCorridaDestino(String rcCorridaDestino) {
        this.rcCorridaDestino = rcCorridaDestino;
    }

}
