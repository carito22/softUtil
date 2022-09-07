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

import ec.com.todocompu.ShrimpSoftUtils.UtilsDate;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvCliente;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvProveedor;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name = "prd_liquidacion", schema = "produccion")
public class PrdLiquidacion implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected PrdLiquidacionPK prdLiquidacionPK;
    @Column(name = "liq_lote")
    private String liqLote;
    @Column(name = "liq_fecha")
    private Date liqFecha;
    @Column(name = "liq_libras_enviadas")
    private BigDecimal liqLibrasEnviadas;
    @Column(name = "liq_libras_recibidas")
    private BigDecimal liqLibrasRecibidas;
    @Column(name = "liq_libras_basura")
    private BigDecimal liqLibrasBasura;
    @Column(name = "liq_libras_retiradas")
    private BigDecimal liqLibrasRetiradas;
    @Column(name = "liq_libras_netas")
    private BigDecimal liqLibrasNetas;
    @Column(name = "liq_libras_entero")
    private BigDecimal liqLibrasEntero;
    @Column(name = "liq_libras_cola")
    private BigDecimal liqLibrasCola;
    @Column(name = "liq_libras_cola_procesadas")
    private BigDecimal liqLibrasColaProcesadas;
    @Column(name = "liq_animales_cosechados")
    private BigDecimal liqAnimalesCosechados;
    @Column(name = "liq_total_monto")
    private BigDecimal liqTotalMonto;
    @Column(name = "liq_pendiente")
    private boolean liqPendiente;
    @Column(name = "liq_anulado")
    private boolean liqAnulado;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    private Timestamp usrFechaInserta;
    @JoinColumns({
        @JoinColumn(name = "pis_empresa", referencedColumnName = "pis_empresa")
        ,
        @JoinColumn(name = "pis_sector", referencedColumnName = "pis_sector")
        ,
        @JoinColumn(name = "pis_numero", referencedColumnName = "pis_numero")})
    @ManyToOne(optional = false)
    private PrdPiscina prdPiscina;
    @JoinColumns({
        @JoinColumn(name = "cli_empresa", referencedColumnName = "cli_empresa")
        ,
        @JoinColumn(name = "cli_codigo", referencedColumnName = "cli_codigo")})
    @ManyToOne(optional = true)
    private InvCliente invCliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prdLiquidacion")
    private List<PrdLiquidacionDetalle> prdLiquidacionDetalleList;
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumns({
        @JoinColumn(name = "cor_empresa", referencedColumnName = "cor_empresa")
        , @JoinColumn(name = "cor_sector", referencedColumnName = "cor_sector")
        , @JoinColumn(name = "cor_piscina", referencedColumnName = "cor_piscina")
        , @JoinColumn(name = "cor_numero", referencedColumnName = "cor_numero")})
    @ManyToOne
    private PrdCorrida prdCorrida;

    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumns({
        @JoinColumn(name = "pl_empresa", referencedColumnName = "pl_empresa")
        , @JoinColumn(name = "pl_motivo", referencedColumnName = "pl_motivo")
        , @JoinColumn(name = "pl_numero", referencedColumnName = "pl_numero")})
    @ManyToOne
    private PrdPreLiquidacion prdPreLiquidacion;
    @JoinColumns({
        @JoinColumn(name = "prov_empresa", referencedColumnName = "prov_empresa")
        , @JoinColumn(name = "prov_codigo", referencedColumnName = "prov_codigo")})
    @ManyToOne(optional = true)
    private InvProveedor invProveedor;
    @Column(name = "liq_facturado")
    private boolean liqFacturado;
    @Column(name = "liq_guia")
    private String liqGuia;
    @Column(name = "liq_tipo_liquidacion")
    private String liqTipoReliquidacion;

    @Column(name = "liq_gramaje")
    private BigDecimal liqGramaje;
    @Column(name = "liq_gavetas")
    private BigDecimal liqGavetas;
    @Column(name = "liq_peso_promedio")
    private BigDecimal liqPesoPromedio;
    @Column(name = "liq_larvilla")
    private BigDecimal liqLarvilla;
    @Column(name = "liq_quebrado")
    private BigDecimal liqQuebrado;
    @Column(name = "liq_observaciones")
    private String liqObservaciones;
    @Column(name = "liq_comisionista")
    private String liqComisionista;
    @Column(name = "liq_lista_de_precios")
    private String liqListaDePrecios;
    @Column(name = "liq_bines")
    private String liqBines;
    @Column(name = "liq_aguaje")
    private String liqAguaje;
    @Column(name = "liq_piscina")
    private String liqPiscina;

    @JoinColumns({
        @JoinColumn(name = "co_empresa", referencedColumnName = "co_empresa")
            , @JoinColumn(name = "co_codigo", referencedColumnName = "co_codigo")
            , @JoinColumn(name = "co_cedula", referencedColumnName = "co_cedula")})
    @ManyToOne(optional = true)
    private PrdComisionista prdComisionista;
    
    public PrdLiquidacion() {
    }

    public PrdLiquidacion(PrdLiquidacionPK prdLiquidacionPK) {
        this.prdLiquidacionPK = prdLiquidacionPK;
    }

    public PrdLiquidacion(PrdLiquidacionPK prdLiquidacionPK, String liqLote, Date liqFecha,
            BigDecimal liqLibrasEnviadas, BigDecimal liqLibrasRecibidas, BigDecimal liqLibrasBasura,
            BigDecimal liqLibrasRetiradas, BigDecimal liqLibrasNetas, BigDecimal liqLibrasEntero,
            BigDecimal liqLibrasCola, BigDecimal liqLibrasColaProcesadas, BigDecimal liqAnimalesCosechados,
            BigDecimal liqTotalMonto, boolean liqPendiente, boolean liqAnulado, InvCliente invCliente,
            String usrEmpresa, String usrCodigo, Timestamp usrFechaInserta, InvProveedor invProveedor, String liqGuia) {
        this.prdLiquidacionPK = prdLiquidacionPK;
        this.liqLote = liqLote;
        this.liqFecha = liqFecha;
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
        this.liqPendiente = liqPendiente;
        this.liqAnulado = liqAnulado;
        this.invCliente = invCliente;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.invProveedor = invProveedor;
        this.liqGuia = liqGuia;
    }

    public PrdLiquidacion(String liqEmpresa, String liqMotivo, String liqNumero) {
        this.prdLiquidacionPK = new PrdLiquidacionPK(liqEmpresa, liqMotivo, liqNumero);
    }

    public PrdLiquidacionPK getPrdLiquidacionPK() {
        return prdLiquidacionPK;
    }

    public void setPrdLiquidacionPK(PrdLiquidacionPK prdLiquidacionPK) {
        this.prdLiquidacionPK = prdLiquidacionPK;
    }

    public String getLiqLote() {
        return liqLote;
    }

    public void setLiqLote(String liqLote) {
        this.liqLote = liqLote;
    }

    public Date getLiqFecha() {
        return liqFecha;
    }

    public String liqFechaFormato() {
        if (liqFecha != null) {
            return UtilsDate.fechaFormatoString(liqFecha, "yyyy-MM-dd");
        }
        return "";
    }

    public void setLiqFecha(Date liqFecha) {
        this.liqFecha = liqFecha;
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

    public String getLiqGuia() {
        return liqGuia;
    }

    public void setLiqGuia(String liqGuia) {
        this.liqGuia = liqGuia;
    }

    public boolean getLiqPendiente() {
        return liqPendiente;
    }

    public void setLiqPendiente(boolean liqPendiente) {
        this.liqPendiente = liqPendiente;
    }

    public boolean getLiqAnulado() {
        return liqAnulado;
    }

    public void setLiqAnulado(boolean liqAnulado) {
        this.liqAnulado = liqAnulado;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public Timestamp getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Timestamp usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public InvCliente getInvCliente() {
        return invCliente;
    }

    public void setInvCliente(InvCliente invCliente) {
        this.invCliente = invCliente;
    }

    public InvProveedor getInvProveedor() {
        return invProveedor;
    }

    public void setInvProveedor(InvProveedor invProveedor) {
        this.invProveedor = invProveedor;
    }

    public PrdPiscina getPrdPiscina() {
        return prdPiscina;
    }

    public void setPrdPiscina(PrdPiscina prdPiscina) {
        this.prdPiscina = prdPiscina;
    }

    public List<PrdLiquidacionDetalle> getPrdLiquidacionDetalleList() {
        return prdLiquidacionDetalleList;
    }

    public void setPrdLiquidacionDetalleList(List<PrdLiquidacionDetalle> prdLiquidacionDetalleList) {
        this.prdLiquidacionDetalleList = prdLiquidacionDetalleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdLiquidacionPK != null ? prdLiquidacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PrdLiquidacion)) {
            return false;
        }
        PrdLiquidacion other = (PrdLiquidacion) object;
        if ((this.prdLiquidacionPK == null && other.prdLiquidacionPK != null)
                || (this.prdLiquidacionPK != null && !this.prdLiquidacionPK.equals(other.prdLiquidacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "produccion.entity.PrdLiquidacion[ prdLiquidacionPK=" + prdLiquidacionPK + " ]";
    }

    public PrdCorrida getPrdCorrida() {
        return prdCorrida;
    }

    public void setPrdCorrida(PrdCorrida prdCorrida) {
        this.prdCorrida = prdCorrida;
    }

    public PrdPreLiquidacion getPrdPreLiquidacion() {
        return prdPreLiquidacion;
    }

    public void setPrdPreLiquidacion(PrdPreLiquidacion prdPreLiquidacion) {
        this.prdPreLiquidacion = prdPreLiquidacion;
    }

    public boolean isLiqFacturado() {
        return liqFacturado;
    }

    public void setLiqFacturado(boolean liqFacturado) {
        this.liqFacturado = liqFacturado;
    }

    public String getLiqTipoReliquidacion() {
        return liqTipoReliquidacion;
    }

    public void setLiqTipoReliquidacion(String liqTipoReliquidacion) {
        this.liqTipoReliquidacion = liqTipoReliquidacion;
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

    public String getLiqComisionista() {
        return liqComisionista;
    }

    public void setLiqComisionista(String liqComisionista) {
        this.liqComisionista = liqComisionista;
    }

    public String getLiqListaDePrecios() {
        return liqListaDePrecios;
    }

    public void setLiqListaDePrecios(String liqListaDePrecios) {
        this.liqListaDePrecios = liqListaDePrecios;
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

    public PrdComisionista getPrdComisionista() {
        return prdComisionista;
    }

    public void setPrdComisionista(PrdComisionista prdComisionista) {
        this.prdComisionista = prdComisionista;
    }

}
