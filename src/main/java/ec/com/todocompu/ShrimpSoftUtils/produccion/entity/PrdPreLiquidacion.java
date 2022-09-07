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
@Table(name = "prd_preliquidacion", schema = "produccion")
public class PrdPreLiquidacion implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected PrdPreLiquidacionPK prdPreLiquidacionPK;
    @Column(name = "pl_lote")
    private String plLote;
    @Column(name = "pl_fecha")
    private Date plFecha;
    @Column(name = "pl_libras_enviadas")
    private BigDecimal plLibrasEnviadas;
    @Column(name = "pl_libras_recibidas")
    private BigDecimal plLibrasRecibidas;
    @Column(name = "pl_libras_basura")
    private BigDecimal plLibrasBasura;
    @Column(name = "pl_libras_retiradas")
    private BigDecimal plLibrasRetiradas;
    @Column(name = "pl_libras_netas")
    private BigDecimal plLibrasNetas;
    @Column(name = "pl_libras_entero")
    private BigDecimal plLibrasEntero;
    @Column(name = "pl_libras_cola")
    private BigDecimal plLibrasCola;
    @Column(name = "pl_libras_cola_procesadas")
    private BigDecimal plLibrasColaProcesadas;
    @Column(name = "pl_animales_cosechados")
    private BigDecimal plAnimalesCosechados;
    @Column(name = "pl_total_monto")
    private BigDecimal plTotalMonto;
    @Column(name = "pl_pendiente")
    private boolean plPendiente;
    @Column(name = "pl_anulado")
    private boolean plAnulado;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    private Timestamp usrFechaInserta;
    @JoinColumns({
        @JoinColumn(name = "cli_empresa", referencedColumnName = "cli_empresa")
        ,@JoinColumn(name = "cli_codigo", referencedColumnName = "cli_codigo")})
    @ManyToOne(optional = true)
    private InvCliente invCliente;
    @JoinColumns({
        @JoinColumn(name = "pis_empresa", referencedColumnName = "pis_empresa")
        ,@JoinColumn(name = "pis_sector", referencedColumnName = "pis_sector")
        ,@JoinColumn(name = "pis_numero", referencedColumnName = "pis_numero")})
    @ManyToOne(optional = false)
    private PrdPiscina prdPiscina;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prdPreLiquidacion")
    private List<PrdPreLiquidacionDetalle> prdPreLiquidacionDetalleList;
    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumns({
        @JoinColumn(name = "cor_empresa", referencedColumnName = "cor_empresa")
        , @JoinColumn(name = "cor_sector", referencedColumnName = "cor_sector")
        , @JoinColumn(name = "cor_piscina", referencedColumnName = "cor_piscina")
        , @JoinColumn(name = "cor_numero", referencedColumnName = "cor_numero")})
    @ManyToOne
    private PrdCorrida prdCorrida;
    @JoinColumns({
        @JoinColumn(name = "prov_empresa", referencedColumnName = "prov_empresa")
        , @JoinColumn(name = "prov_codigo", referencedColumnName = "prov_codigo")})
    @ManyToOne(optional = true)
    private InvProveedor invProveedor;

    public PrdPreLiquidacion() {
    }

    public PrdPreLiquidacion(PrdPreLiquidacionPK prdPreLiquidacionPK) {
        this.prdPreLiquidacionPK = prdPreLiquidacionPK;
    }

    public PrdPreLiquidacion(PrdPreLiquidacionPK prdPreLiquidacionPK, String plLote, Date plFecha,
            BigDecimal plLibrasEnviadas, BigDecimal plLibrasRecibidas, BigDecimal plLibrasBasura,
            BigDecimal plLibrasRetiradas, BigDecimal plLibrasNetas, BigDecimal plLibrasEntero, BigDecimal plLibrasCola,
            BigDecimal plLibrasColaProcesadas, BigDecimal plAnimalesCosechados, BigDecimal plTotalMonto,
            boolean plPendiente, boolean plAnulado, InvCliente invCliente, String usrEmpresa, String usrCodigo,
            Timestamp usrFechaInserta, InvProveedor invProveedor) {
        this.prdPreLiquidacionPK = prdPreLiquidacionPK;
        this.plLote = plLote;
        this.plFecha = plFecha;
        this.plLibrasEnviadas = plLibrasEnviadas;
        this.plLibrasRecibidas = plLibrasRecibidas;
        this.plLibrasBasura = plLibrasBasura;
        this.plLibrasRetiradas = plLibrasRetiradas;
        this.plLibrasNetas = plLibrasNetas;
        this.plLibrasEntero = plLibrasEntero;
        this.plLibrasCola = plLibrasCola;
        this.plLibrasColaProcesadas = plLibrasColaProcesadas;
        this.plAnimalesCosechados = plAnimalesCosechados;
        this.plTotalMonto = plTotalMonto;
        this.plPendiente = plPendiente;
        this.plAnulado = plAnulado;
        this.invCliente = invCliente;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.invProveedor = invProveedor;
    }

    public PrdPreLiquidacion(String plEmpresa, String plMotivo, String plNumero) {
        this.prdPreLiquidacionPK = new PrdPreLiquidacionPK(plEmpresa, plMotivo, plNumero);
    }

    public PrdPreLiquidacionPK getPrdPreLiquidacionPK() {
        return prdPreLiquidacionPK;
    }

    public void setPrdPreLiquidacionPK(PrdPreLiquidacionPK prdPreLiquidacionPK) {
        this.prdPreLiquidacionPK = prdPreLiquidacionPK;
    }

    public String getPlLote() {
        return plLote;
    }

    public void setPlLote(String plLote) {
        this.plLote = plLote;
    }

    public Date getPlFecha() {
        return plFecha;
    }

    public String plFechaFormato() {
        if (plFecha != null) {
            return UtilsDate.fechaFormatoString(plFecha, "yyyy-MM-dd");
        }
        return "";
    }

    public void setPlFecha(Date plFecha) {
        this.plFecha = plFecha;
    }

    public BigDecimal getPlLibrasEnviadas() {
        return plLibrasEnviadas;
    }

    public void setPlLibrasEnviadas(BigDecimal plLibrasEnviadas) {
        this.plLibrasEnviadas = plLibrasEnviadas;
    }

    public BigDecimal getPlLibrasRecibidas() {
        return plLibrasRecibidas;
    }

    public void setPlLibrasRecibidas(BigDecimal plLibrasRecibidas) {
        this.plLibrasRecibidas = plLibrasRecibidas;
    }

    public BigDecimal getPlLibrasBasura() {
        return plLibrasBasura;
    }

    public void setPlLibrasBasura(BigDecimal plLibrasBasura) {
        this.plLibrasBasura = plLibrasBasura;
    }

    public BigDecimal getPlLibrasRetiradas() {
        return plLibrasRetiradas;
    }

    public void setPlLibrasRetiradas(BigDecimal plLibrasRetiradas) {
        this.plLibrasRetiradas = plLibrasRetiradas;
    }

    public BigDecimal getPlLibrasNetas() {
        return plLibrasNetas;
    }

    public void setPlLibrasNetas(BigDecimal plLibrasNetas) {
        this.plLibrasNetas = plLibrasNetas;
    }

    public BigDecimal getPlLibrasEntero() {
        return plLibrasEntero;
    }

    public void setPlLibrasEntero(BigDecimal plLibrasEntero) {
        this.plLibrasEntero = plLibrasEntero;
    }

    public BigDecimal getPlLibrasCola() {
        return plLibrasCola;
    }

    public void setPlLibrasCola(BigDecimal plLibrasCola) {
        this.plLibrasCola = plLibrasCola;
    }

    public BigDecimal getPlLibrasColaProcesadas() {
        return plLibrasColaProcesadas;
    }

    public void setPlLibrasColaProcesadas(BigDecimal plLibrasColaProcesadas) {
        this.plLibrasColaProcesadas = plLibrasColaProcesadas;
    }

    public BigDecimal getPlAnimalesCosechados() {
        return plAnimalesCosechados;
    }

    public void setPlAnimalesCosechados(BigDecimal plAnimalesCosechados) {
        this.plAnimalesCosechados = plAnimalesCosechados;
    }

    public BigDecimal getPlTotalMonto() {
        return plTotalMonto;
    }

    public void setPlTotalMonto(BigDecimal plTotalMonto) {
        this.plTotalMonto = plTotalMonto;
    }

    public boolean getPlPendiente() {
        return plPendiente;
    }

    public void setPlPendiente(boolean plPendiente) {
        this.plPendiente = plPendiente;
    }

    public boolean getPlAnulado() {
        return plAnulado;
    }

    public void setPlAnulado(boolean plAnulado) {
        this.plAnulado = plAnulado;
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

    public List<PrdPreLiquidacionDetalle> getPrdPreLiquidacionDetalleList() {
        return prdPreLiquidacionDetalleList;
    }

    public void setPrdPreLiquidacionDetalleList(List<PrdPreLiquidacionDetalle> prdPreLiquidacionDetalleList) {
        this.prdPreLiquidacionDetalleList = prdPreLiquidacionDetalleList;
    }

    public PrdCorrida getPrdCorrida() {
        return prdCorrida;
    }

    public void setPrdCorrida(PrdCorrida prdCorrida) {
        this.prdCorrida = prdCorrida;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdPreLiquidacionPK != null ? prdPreLiquidacionPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PrdPreLiquidacion)) {
            return false;
        }
        PrdPreLiquidacion other = (PrdPreLiquidacion) object;
        if ((this.prdPreLiquidacionPK == null && other.prdPreLiquidacionPK != null)
                || (this.prdPreLiquidacionPK != null && !this.prdPreLiquidacionPK.equals(other.prdPreLiquidacionPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "produccion.entity.PrdPluidacion[ prdPreLiquidacionPK=" + prdPreLiquidacionPK + " ]";
    }

}
