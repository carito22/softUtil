package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import ec.com.todocompu.ShrimpSoftUtils.UtilsDate;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConContable;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name = "prd_corrida", schema = "produccion")
public class PrdCorrida implements Serializable {

    private static final long serialVersionUID = 1L;

    protected PrdCorridaPK prdCorridaPK;
    private BigDecimal corHectareas;
    private Date corFechaDesde;
    private Date corFechaSiembra;
    private Date corFechaSiembraMadre;
    private Date corFechaPesca;
    private Date corFechaHasta;
    private String corTipoSiembra;
    private Integer corNumeroLarvas;
    private String corLaboratorio;
    private String corNauplio;
    private BigDecimal corPellet;
    private BigDecimal corBiomasa;
    private BigDecimal corCostoDirecto;
    private BigDecimal corCostoIndirecto;
    private BigDecimal corCostoTransferencia;
    private BigDecimal corValorVenta;
    private String corObservaciones;
    private Boolean corActiva;
    private String usrEmpresa;
    private String usrCodigo;
    private Timestamp usrFechaInserta;
    private PrdPiscina prdPiscina;
    private List<PrdCorridaDetalle> prdCorridaDetalleList;
    private ConContable conContable;
    private BigDecimal corNumeroLarvasPlus;

    private ConContable conContableCostoVenta;

    public PrdCorrida() {
    }

    public PrdCorrida(PrdCorridaPK prdCorridaPK) {
        this.prdCorridaPK = prdCorridaPK;
    }

    public PrdCorrida(PrdCorridaPK prdCorridaPK, Date corFechaDesde, String usrEmpresa, String usrCodigo,
            Timestamp usrFechaInserta) {
        this.prdCorridaPK = prdCorridaPK;
        this.corFechaDesde = corFechaDesde;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public PrdCorrida(String corEmpresa, String corSector, String corPiscina, String corNumero) {
        this.prdCorridaPK = new PrdCorridaPK(corEmpresa, corSector, corPiscina, corNumero);
    }

    public PrdCorrida(PrdCorridaPK prdCorridaPK, BigDecimal corHectareas, Date corFechaDesde, Date corFechaSiembra,
            Date corFechaPesca, Date corFechaHasta, String corTipoSiembra, Integer corNumeroLarvas,
            String corLaboratorio, String corNauplio, BigDecimal corPellet, BigDecimal corBiomasa, BigDecimal corValorVenta,
            String corObservaciones, Boolean corActiva, PrdPiscina prdPiscina, BigDecimal corNumeroLarvasPlus) {
        this.prdCorridaPK = prdCorridaPK;
        this.corHectareas = corHectareas;
        this.corFechaDesde = corFechaDesde;
        this.corFechaSiembra = corFechaSiembra;
        this.corFechaPesca = corFechaPesca;
        this.corFechaHasta = corFechaHasta;
        this.corTipoSiembra = corTipoSiembra;
        this.corNumeroLarvas = corNumeroLarvas;
        this.corLaboratorio = corLaboratorio;
        this.corNauplio = corNauplio;
        this.corPellet = corPellet;
        this.corBiomasa = corBiomasa;
        this.corValorVenta = corValorVenta;
        this.corObservaciones = corObservaciones;
        this.corActiva = corActiva;
        this.prdPiscina = prdPiscina;
        this.corNumeroLarvasPlus = corNumeroLarvasPlus;
    }

    public PrdCorrida(PrdCorridaPK prdCorridaPK, BigDecimal corHectareas, Date corFechaDesde, Date corFechaSiembra,
            Date corFechaPesca, Date corFechaHasta, String corTipoSiembra, Integer corNumeroLarvas,
            String corLaboratorio, String corNauplio, BigDecimal corPellet, BigDecimal corBiomasa, BigDecimal corValorVenta,
            String corObservaciones, Boolean corActiva, String usrEmpresa, String usrCodigo, Timestamp usrFechaInserta,
            PrdPiscina prdPiscina) {
        this.prdCorridaPK = prdCorridaPK;
        this.corHectareas = corHectareas;
        this.corFechaDesde = corFechaDesde;
        this.corFechaSiembra = corFechaSiembra;
        this.corFechaPesca = corFechaPesca;
        this.corFechaHasta = corFechaHasta;
        this.corTipoSiembra = corTipoSiembra;
        this.corNumeroLarvas = corNumeroLarvas;
        this.corLaboratorio = corLaboratorio;
        this.corNauplio = corNauplio;
        this.corPellet = corPellet;
        this.corBiomasa = corBiomasa;
        this.corValorVenta = corValorVenta;
        this.corObservaciones = corObservaciones;
        this.corActiva = corActiva;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.prdPiscina = prdPiscina;
    }

    public PrdCorrida(PrdCorridaPK prdCorridaPK, BigDecimal corHectareas, Date corFechaDesde, Date corFechaSiembra,
            Date corFechaPesca, Date corFechaHasta, String corTipoSiembra, Integer corNumeroLarvas,
            String corLaboratorio, String corNauplio, BigDecimal corPellet, BigDecimal corBiomasa,
            BigDecimal corCostoDirecto, BigDecimal corCostoIndirecto, BigDecimal corCostoTransferencia,
            BigDecimal corValorVenta, String corObservaciones, Boolean corActiva, String usrEmpresa, String usrCodigo,
            Timestamp usrFechaInserta, PrdPiscina prdPiscina, List<PrdCorridaDetalle> prdCorridaDetalleList,
            ConContable conContable) {
        this.prdCorridaPK = prdCorridaPK;
        this.corHectareas = corHectareas;
        this.corFechaDesde = corFechaDesde;
        this.corFechaSiembra = corFechaSiembra;
        this.corFechaPesca = corFechaPesca;
        this.corFechaHasta = corFechaHasta;
        this.corTipoSiembra = corTipoSiembra;
        this.corNumeroLarvas = corNumeroLarvas;
        this.corLaboratorio = corLaboratorio;
        this.corNauplio = corNauplio;
        this.corPellet = corPellet;
        this.corBiomasa = corBiomasa;
        this.corCostoDirecto = corCostoDirecto;
        this.corCostoIndirecto = corCostoIndirecto;
        this.corCostoTransferencia = corCostoTransferencia;
        this.corValorVenta = corValorVenta;
        this.corObservaciones = corObservaciones;
        this.corActiva = corActiva;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.prdPiscina = prdPiscina;
        this.prdCorridaDetalleList = prdCorridaDetalleList;
        this.conContable = conContable;
    }

    public PrdCorrida(PrdCorridaPK prdCorridaPK, BigDecimal corHectareas, Date corFechaDesde, Date corFechaSiembra,
            Date corFechaPesca, Date corFechaHasta, String corTipoSiembra, Integer corNumeroLarvas,
            String corLaboratorio, String corNauplio, BigDecimal corPellet, BigDecimal corBiomasa,
            BigDecimal corCostoDirecto, BigDecimal corCostoIndirecto, BigDecimal corCostoTransferencia,
            BigDecimal corValorVenta, String corObservaciones, Boolean corActiva, String usrEmpresa, String usrCodigo,
            Timestamp usrFechaInserta, PrdPiscina prdPiscina, ConContable conContable) {
        this.prdCorridaPK = prdCorridaPK;
        this.corHectareas = corHectareas;
        this.corFechaDesde = corFechaDesde;
        this.corFechaSiembra = corFechaSiembra;
        this.corFechaPesca = corFechaPesca;
        this.corFechaHasta = corFechaHasta;
        this.corTipoSiembra = corTipoSiembra;
        this.corNumeroLarvas = corNumeroLarvas;
        this.corLaboratorio = corLaboratorio;
        this.corNauplio = corNauplio;
        this.corPellet = corPellet;
        this.corBiomasa = corBiomasa;
        this.corCostoDirecto = corCostoDirecto;
        this.corCostoIndirecto = corCostoIndirecto;
        this.corCostoTransferencia = corCostoTransferencia;
        this.corValorVenta = corValorVenta;
        this.corObservaciones = corObservaciones;
        this.corActiva = corActiva;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.prdPiscina = prdPiscina;
        this.conContable = conContable;
    }

    @EmbeddedId
    public PrdCorridaPK getPrdCorridaPK() {
        return prdCorridaPK;
    }

    public void setPrdCorridaPK(PrdCorridaPK prdCorridaPK) {
        this.prdCorridaPK = prdCorridaPK;
    }

    @Column(name = "cor_hectareas")
    public BigDecimal getCorHectareas() {
        return corHectareas;
    }

    public void setCorHectareas(BigDecimal corHectareas) {
        this.corHectareas = corHectareas;
    }

    @Column(name = "cor_fecha_desde")
    public Date getCorFechaDesde() {
        return corFechaDesde;
    }

    public void setCorFechaDesde(Date corFechaDesde) {
        this.corFechaDesde = corFechaDesde;
    }

    @Column(name = "cor_fecha_siembra")
    public Date getCorFechaSiembra() {
        return corFechaSiembra;
    }

    public void setCorFechaSiembra(Date corFechaSiembra) {
        this.corFechaSiembra = corFechaSiembra;
    }

    @Column(name = "cor_fecha_siembra_madre")
    public Date getCorFechaSiembraMadre() {
        return corFechaSiembraMadre;
    }

    public void setCorFechaSiembraMadre(Date corFechaSiembraMadre) {
        this.corFechaSiembraMadre = corFechaSiembraMadre;
    }

    @Column(name = "cor_fecha_pesca")
    public Date getCorFechaPesca() {
        return corFechaPesca;
    }

    public void setCorFechaPesca(Date corFechaPesca) {
        this.corFechaPesca = corFechaPesca;
    }

    @Column(name = "cor_fecha_hasta")
    public Date getCorFechaHasta() {
        return corFechaHasta;
    }

    public void setCorFechaHasta(Date corFechaHasta) {
        this.corFechaHasta = corFechaHasta;
    }

    @Column(name = "cor_tipo_siembra")
    public String getCorTipoSiembra() {
        return corTipoSiembra;
    }

    public void setCorTipoSiembra(String corTipoSiembra) {
        this.corTipoSiembra = corTipoSiembra;
    }

    public String corFechaDesdeFormato() {
        if (corFechaDesde != null) {
            return UtilsDate.fechaFormatoString(corFechaDesde, "yyyy-MM-dd");
        }
        return "";
    }

    public String corFechaSiembraFormato() {
        if (corFechaSiembra != null) {
            return UtilsDate.fechaFormatoString(corFechaSiembra, "yyyy-MM-dd");
        }
        return "";
    }

    public String corFechaPescaFormato() {
        if (corFechaPesca != null) {
            return UtilsDate.fechaFormatoString(corFechaPesca, "yyyy-MM-dd");
        }
        return "";
    }

    public String corFechaHastaFormato() {
        if (corFechaHasta != null) {
            return UtilsDate.fechaFormatoString(corFechaHasta, "yyyy-MM-dd");
        }
        return "";
    }

    @Column(name = "cor_numero_larvas")
    public Integer getCorNumeroLarvas() {
        return corNumeroLarvas;
    }

    public void setCorNumeroLarvas(Integer corNumeroLarvas) {
        this.corNumeroLarvas = corNumeroLarvas;
    }

    @Column(name = "cor_laboratorio")
    public String getCorLaboratorio() {
        return corLaboratorio;
    }

    public void setCorLaboratorio(String corLaboratorio) {
        this.corLaboratorio = corLaboratorio;
    }

    @Column(name = "cor_nauplio")
    public String getCorNauplio() {
        return corNauplio;
    }

    public void setCorNauplio(String corNauplio) {
        this.corNauplio = corNauplio;
    }

    @Column(name = "cor_pellet")
    public BigDecimal getCorPellet() {
        return corPellet;
    }

    public void setCorPellet(BigDecimal corPellet) {
        this.corPellet = corPellet;
    }

    @Column(name = "cor_biomasa")
    public BigDecimal getCorBiomasa() {
        return corBiomasa;
    }

    public void setCorBiomasa(BigDecimal corBiomasa) {
        this.corBiomasa = corBiomasa;
    }

    @Column(name = "cor_costo_directo", insertable = false, updatable = false)
    public BigDecimal getCorCostoDirecto() {
        return corCostoDirecto;
    }

    public void setCorCostoDirecto(BigDecimal corCostoDirecto) {
        this.corCostoDirecto = corCostoDirecto;
    }

    @Column(name = "cor_costo_indirecto", insertable = false, updatable = false)
    public BigDecimal getCorCostoIndirecto() {
        return corCostoIndirecto;
    }

    public void setCorCostoIndirecto(BigDecimal corCostoIndirecto) {
        this.corCostoIndirecto = corCostoIndirecto;
    }

    @Column(name = "cor_costo_transferencia", insertable = false, updatable = false)
    public BigDecimal getCorCostoTransferencia() {
        return corCostoTransferencia;
    }

    public void setCorCostoTransferencia(BigDecimal corCostoTransferencia) {
        this.corCostoTransferencia = corCostoTransferencia;
    }

    @Column(name = "cor_valor_venta")
    public BigDecimal getCorValorVenta() {
        return corValorVenta;
    }

    public void setCorValorVenta(BigDecimal corValorVenta) {
        this.corValorVenta = corValorVenta;
    }

    @Column(name = "cor_observaciones")
    public String getCorObservaciones() {
        return corObservaciones;
    }

    public void setCorObservaciones(String corObservaciones) {
        this.corObservaciones = corObservaciones;
    }

    @Column(name = "cor_activa")
    public Boolean getCorActiva() {
        return corActiva;
    }

    public void setCorActiva(Boolean corActiva) {
        this.corActiva = corActiva;
    }

    @Column(name = "usr_empresa")
    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    @Column(name = "usr_codigo")
    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    public Timestamp getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Timestamp usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    @Column(name = "cor_numero_larvas_plus")
    public BigDecimal getCorNumeroLarvasPlus() {
        return corNumeroLarvasPlus;
    }

    public void setCorNumeroLarvasPlus(BigDecimal corNumeroLarvasPlus) {
        this.corNumeroLarvasPlus = corNumeroLarvasPlus;
    }

    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumns({
        @JoinColumn(name = "pis_empresa", referencedColumnName = "pis_empresa")
        ,
			@JoinColumn(name = "pis_sector", referencedColumnName = "pis_sector")
        ,
			@JoinColumn(name = "pis_numero", referencedColumnName = "pis_numero")})
    @ManyToOne(optional = false)
    public PrdPiscina getPrdPiscina() {
        return prdPiscina;
    }

    public void setPrdPiscina(PrdPiscina prdPiscina) {
        this.prdPiscina = prdPiscina;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prdCorridaOrigen")
    @JsonIgnore
    public List<PrdCorridaDetalle> getPrdCorridaDetalleList() {
        return prdCorridaDetalleList;
    }

    public void setPrdCorridaDetalleList(List<PrdCorridaDetalle> prdCorridaDetalleList) {
        this.prdCorridaDetalleList = prdCorridaDetalleList;
    }

    @JoinColumns({
        @JoinColumn(name = "con_empresa", referencedColumnName = "con_empresa")
        ,
			@JoinColumn(name = "con_periodo", referencedColumnName = "con_periodo")
        ,
			@JoinColumn(name = "con_tipo", referencedColumnName = "con_tipo")
        ,
			@JoinColumn(name = "con_numero", referencedColumnName = "con_numero")})
    @ManyToOne(optional = false)
    public ConContable getConContable() {
        return conContable;
    }

    public void setConContable(ConContable conContable) {
        this.conContable = conContable;
    }

    @JoinColumns({
        @JoinColumn(name = "cv_empresa", referencedColumnName = "con_empresa")
        ,@JoinColumn(name = "cv_periodo", referencedColumnName = "con_periodo")
        ,@JoinColumn(name = "cv_tipo", referencedColumnName = "con_tipo")
        ,@JoinColumn(name = "cv_numero", referencedColumnName = "con_numero")})
    @ManyToOne(optional = false)
    public ConContable getConContableCostoVenta() {
        return conContableCostoVenta;
    }

    public void setConContableCostoVenta(ConContable conContableCostoVenta) {
        this.conContableCostoVenta = conContableCostoVenta;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((prdCorridaPK == null) ? 0 : prdCorridaPK.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        PrdCorrida other = (PrdCorrida) obj;
        if (prdCorridaPK == null) {
            if (other.prdCorridaPK != null) {
                return false;
            }
        } else if (!prdCorridaPK.equals(other.prdCorridaPK)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "produccion.entity.PrdCorrida[ prdCorridaPK=" + prdCorridaPK + " ]";
    }

}
