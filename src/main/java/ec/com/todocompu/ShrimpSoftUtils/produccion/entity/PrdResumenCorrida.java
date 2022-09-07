package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "prd_resumen_corrida", schema = "produccion")
public class PrdResumenCorrida implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected PrdResumenCorridaPK prdResumenCorridaPK;
    @Column(name = "rc_sector_nombre")
    private String rcSectorNombre;
    @Column(name = "rc_piscina_nombre")
    private String rcPiscinaNombre;
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
    private Integer rcEdad;
    @Column(name = "rc_dias_muertos")
    private Integer rcDiasMuertos;
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
    @Column(name = "rc_talla_grande")
    private BigDecimal rcTallaGrande;
    @Column(name = "rc_talla_mediano")
    private BigDecimal rcTallaMediano;
    @Column(name = "rc_talla_pequeno")
    private BigDecimal rcTallaPequeno;
    @Column(name = "rc_talla_promedio")
    private BigDecimal rcTallaPromedio;
    @Column(name = "rc_peso_ideal")
    private BigDecimal rcPesoIdeal;
    @Column(name = "rc_sobrevivencia")
    private String rcSobrevivencia;
    @Column(name = "rc_total")
    private BigDecimal rcTotal;
    @Column(name = "rc_directo")
    private BigDecimal rcDirecto;
    @Column(name = "rc_indirecto")
    private BigDecimal rcIndirecto;
    @Column(name = "rc_valor_venta")
    private BigDecimal rcValorVenta;
    @Column(name = "rc_resultado")
    private BigDecimal rcResultado;
    @Column(name = "rc_costo_hectarea")
    private BigDecimal rcCostoHectarea;
    @Column(name = "rc_venta_hectarea")
    private BigDecimal rcVentaHectarea;
    @Column(name = "rc_resultado_hectarea")
    private BigDecimal rcResultadoHectarea;
    @Column(name = "rc_costo_libra")
    private BigDecimal rcCostoLibra;
    @Column(name = "rc_venta_libra")
    private BigDecimal rcVentaLibra;
    @Column(name = "rc_resultado_libra")
    private BigDecimal rcResultadoLibra;
    @Column(name = "rc_costo_directo_dia")
    private BigDecimal rcCostoDirectoDia;
    @Column(name = "rc_venta_indirecto_dia")
    private BigDecimal rcVentaIndirectoDia;
    @Column(name = "rc_costo_total_dia")
    private BigDecimal rcCostoTotalDia;
    @Column(name = "rc_fecha_hora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date rcFechaHora;

    @Column(name = "rc_corrida_origen")
    private String rcCorridaOrigen;
    @Column(name = "rc_corrida_destino")
    private String rcCorridaDestino;

    public PrdResumenCorrida() {
    }

    public PrdResumenCorrida(PrdResumenCorridaPK prdResumenCorridaPK) {
        this.prdResumenCorridaPK = prdResumenCorridaPK;
    }

    public PrdResumenCorrida(PrdResumenCorridaPK prdResumenCorridaPK, Date rcFechaHora) {
        this.prdResumenCorridaPK = prdResumenCorridaPK;
        this.rcFechaHora = rcFechaHora;
    }

    public PrdResumenCorrida(String rcEmpresa, String rcSector, String rcPiscina, String rcCorrida) {
        this.prdResumenCorridaPK = new PrdResumenCorridaPK(rcEmpresa, rcSector, rcPiscina, rcCorrida);
    }

    public PrdResumenCorridaPK getPrdResumenCorridaPK() {
        return prdResumenCorridaPK;
    }

    public void setPrdResumenCorridaPK(PrdResumenCorridaPK prdResumenCorridaPK) {
        this.prdResumenCorridaPK = prdResumenCorridaPK;
    }

    public String getRcSectorNombre() {
        return rcSectorNombre;
    }

    public void setRcSectorNombre(String rcSectorNombre) {
        this.rcSectorNombre = rcSectorNombre;
    }

    public String getRcPiscinaNombre() {
        return rcPiscinaNombre;
    }

    public void setRcPiscinaNombre(String rcPiscinaNombre) {
        this.rcPiscinaNombre = rcPiscinaNombre;
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

    public Integer getRcEdad() {
        return rcEdad;
    }

    public void setRcEdad(Integer rcEdad) {
        this.rcEdad = rcEdad;
    }

    public Integer getRcDiasMuertos() {
        return rcDiasMuertos;
    }

    public void setRcDiasMuertos(Integer rcDiasMuertos) {
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

    public BigDecimal getRcTallaGrande() {
        return rcTallaGrande;
    }

    public void setRcTallaGrande(BigDecimal rcTallaGrande) {
        this.rcTallaGrande = rcTallaGrande;
    }

    public BigDecimal getRcTallaMediano() {
        return rcTallaMediano;
    }

    public void setRcTallaMediano(BigDecimal rcTallaMediano) {
        this.rcTallaMediano = rcTallaMediano;
    }

    public BigDecimal getRcTallaPequeno() {
        return rcTallaPequeno;
    }

    public void setRcTallaPequeno(BigDecimal rcTallaPequeno) {
        this.rcTallaPequeno = rcTallaPequeno;
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

    public BigDecimal getRcTotal() {
        return rcTotal;
    }

    public void setRcTotal(BigDecimal rcTotal) {
        this.rcTotal = rcTotal;
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

    public BigDecimal getRcValorVenta() {
        return rcValorVenta;
    }

    public void setRcValorVenta(BigDecimal rcValorVenta) {
        this.rcValorVenta = rcValorVenta;
    }

    public BigDecimal getRcResultado() {
        return rcResultado;
    }

    public void setRcResultado(BigDecimal rcResultado) {
        this.rcResultado = rcResultado;
    }

    public BigDecimal getRcCostoHectarea() {
        return rcCostoHectarea;
    }

    public void setRcCostoHectarea(BigDecimal rcCostoHectarea) {
        this.rcCostoHectarea = rcCostoHectarea;
    }

    public BigDecimal getRcVentaHectarea() {
        return rcVentaHectarea;
    }

    public void setRcVentaHectarea(BigDecimal rcVentaHectarea) {
        this.rcVentaHectarea = rcVentaHectarea;
    }

    public BigDecimal getRcResultadoHectarea() {
        return rcResultadoHectarea;
    }

    public void setRcResultadoHectarea(BigDecimal rcResultadoHectarea) {
        this.rcResultadoHectarea = rcResultadoHectarea;
    }

    public BigDecimal getRcCostoLibra() {
        return rcCostoLibra;
    }

    public void setRcCostoLibra(BigDecimal rcCostoLibra) {
        this.rcCostoLibra = rcCostoLibra;
    }

    public BigDecimal getRcVentaLibra() {
        return rcVentaLibra;
    }

    public void setRcVentaLibra(BigDecimal rcVentaLibra) {
        this.rcVentaLibra = rcVentaLibra;
    }

    public BigDecimal getRcResultadoLibra() {
        return rcResultadoLibra;
    }

    public void setRcResultadoLibra(BigDecimal rcResultadoLibra) {
        this.rcResultadoLibra = rcResultadoLibra;
    }

    public BigDecimal getRcCostoDirectoDia() {
        return rcCostoDirectoDia;
    }

    public void setRcCostoDirectoDia(BigDecimal rcCostoDirectoDia) {
        this.rcCostoDirectoDia = rcCostoDirectoDia;
    }

    public BigDecimal getRcVentaIndirectoDia() {
        return rcVentaIndirectoDia;
    }

    public void setRcVentaIndirectoDia(BigDecimal rcVentaIndirectoDia) {
        this.rcVentaIndirectoDia = rcVentaIndirectoDia;
    }

    public BigDecimal getRcCostoTotalDia() {
        return rcCostoTotalDia;
    }

    public void setRcCostoTotalDia(BigDecimal rcCostoTotalDia) {
        this.rcCostoTotalDia = rcCostoTotalDia;
    }

    public Date getRcFechaHora() {
        return rcFechaHora;
    }

    public void setRcFechaHora(Date rcFechaHora) {
        this.rcFechaHora = rcFechaHora;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdResumenCorridaPK != null ? prdResumenCorridaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PrdResumenCorrida)) {
            return false;
        }
        PrdResumenCorrida other = (PrdResumenCorrida) object;
        if ((this.prdResumenCorridaPK == null && other.prdResumenCorridaPK != null)
                || (this.prdResumenCorridaPK != null && !this.prdResumenCorridaPK.equals(other.prdResumenCorridaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "produccion.entity.PrdResumenCorrida[ prdResumenCorridaPK=" + prdResumenCorridaPK + " ]";
    }

}
