package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
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
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Entity
@Table(name = "prd_piscina", schema = "produccion")
public class PrdPiscina implements Serializable {

    private static final long serialVersionUID = 1L;

    protected PrdPiscinaPK prdPiscinaPK;
    private String pisNombre;
    private BigDecimal pisHectareaje;
    private Boolean pisActiva;
    private String usrEmpresa;
    private String usrCodigo;
    private Timestamp usrFechaInserta;
    private String ctaCostoDirecto;
    private String ctaCostoIndirecto;
    private String ctaCostoTransferencia;
    private String ctaCostoProductoTerminado;
    private List<PrdVehiculos> prdVehiculosList;
    private List<PrdLiquidacion> prdLiquidacionList;
    private List<PrdCorrida> prdCorridaList;
    private List<PrdGrameaje> prdGrameajeList;
    private PrdSector prdSector;
    private PrdPiscinaTipo prdPiscinaTipo;
    private String ctaCostoVenta;

    public PrdPiscina() {
    }

    public PrdPiscina(PrdPiscinaPK prdPiscinaPK) {
        this.prdPiscinaPK = prdPiscinaPK;
    }

    public PrdPiscina(PrdPiscinaPK prdPiscinaPK, String pisNombre, BigDecimal pisHectareaje, String usrEmpresa,
            String usrCodigo, Timestamp usrFechaInserta) {
        this.prdPiscinaPK = prdPiscinaPK;
        this.pisNombre = pisNombre;
        this.pisHectareaje = pisHectareaje;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public PrdPiscina(String pisEmpresa, String pisSector, String pisNumero) {
        this.prdPiscinaPK = new PrdPiscinaPK(pisEmpresa, pisSector, pisNumero);
    }

    public PrdPiscina(PrdSector prdSector, String pisNumero) {
        this.prdPiscinaPK = new PrdPiscinaPK(prdSector.getPrdSectorPK().getSecEmpresa(),
                prdSector.getPrdSectorPK().getSecCodigo(), pisNumero);
    }

    public PrdPiscina(PrdPiscinaPK prdPiscinaPK, String pisNombre, BigDecimal pisHectareaje, Boolean pisActiva,
            String usrEmpresa, String usrCodigo, Timestamp usrFechaInserta, String ctaCostoDirecto,
            String ctaCostoIndirecto, String ctaCostoTransferencia, String ctaCostoProductoTerminado,
            List<PrdVehiculos> prdVehiculosList, List<PrdLiquidacion> prdLiquidacionList,
            List<PrdCorrida> prdCorridaList, List<PrdGrameaje> prdGrameajeList, PrdSector prdSector) {
        this.prdPiscinaPK = prdPiscinaPK;
        this.pisNombre = pisNombre;
        this.pisHectareaje = pisHectareaje;
        this.pisActiva = pisActiva;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.ctaCostoDirecto = ctaCostoDirecto;
        this.ctaCostoIndirecto = ctaCostoIndirecto;
        this.ctaCostoTransferencia = ctaCostoTransferencia;
        this.ctaCostoProductoTerminado = ctaCostoProductoTerminado;
        this.prdVehiculosList = prdVehiculosList;
        this.prdLiquidacionList = prdLiquidacionList;
        this.prdCorridaList = prdCorridaList;
        this.prdGrameajeList = prdGrameajeList;
        this.prdSector = prdSector;
    }

    @EmbeddedId
    public PrdPiscinaPK getPrdPiscinaPK() {
        return prdPiscinaPK;
    }

    public void setPrdPiscinaPK(PrdPiscinaPK prdPiscinaPK) {
        this.prdPiscinaPK = prdPiscinaPK;
    }

    @Column(name = "pis_nombre")
    public String getPisNombre() {
        return pisNombre;
    }

    public void setPisNombre(String pisNombre) {
        this.pisNombre = pisNombre;
    }

    @Column(name = "pis_hectareaje")
    public BigDecimal getPisHectareaje() {
        return pisHectareaje;
    }

    public void setPisHectareaje(BigDecimal pisHectareaje) {
        this.pisHectareaje = pisHectareaje;
    }

    @Column(name = "pis_activa")
    public Boolean getPisActiva() {
        return pisActiva;
    }

    public void setPisActiva(Boolean pisActiva) {
        this.pisActiva = pisActiva;
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

    @Column(name = "cta_costo_directo")
    public String getCtaCostoDirecto() {
        return ctaCostoDirecto;
    }

    public void setCtaCostoDirecto(String ctaCostoDirecto) {
        this.ctaCostoDirecto = ctaCostoDirecto;
    }

    @Column(name = "cta_costo_indirecto")
    public String getCtaCostoIndirecto() {
        return ctaCostoIndirecto;
    }

    public void setCtaCostoIndirecto(String ctaCostoIndirecto) {
        this.ctaCostoIndirecto = ctaCostoIndirecto;
    }

    @Column(name = "cta_costo_transferencia")
    public String getCtaCostoTransferencia() {
        return ctaCostoTransferencia;
    }

    public void setCtaCostoTransferencia(String ctaCostoTransferencia) {
        this.ctaCostoTransferencia = ctaCostoTransferencia;
    }

    @Column(name = "cta_costo_producto_terminado")
    public String getCtaCostoProductoTerminado() {
        return ctaCostoProductoTerminado;
    }

    public void setCtaCostoProductoTerminado(String ctaCostoProductoTerminado) {
        this.ctaCostoProductoTerminado = ctaCostoProductoTerminado;
    }

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prdPiscina")
    public List<PrdVehiculos> getPrdVehiculosList() {
        return prdVehiculosList;
    }

    public void setPrdVehiculosList(List<PrdVehiculos> prdVehiculosList) {
        this.prdVehiculosList = prdVehiculosList;
    }

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prdPiscina")
    public List<PrdLiquidacion> getPrdLiquidacionList() {
        return prdLiquidacionList;
    }

    public void setPrdLiquidacionList(List<PrdLiquidacion> prdLiquidacionList) {
        this.prdLiquidacionList = prdLiquidacionList;
    }

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prdPiscina")
    public List<PrdCorrida> getPrdCorridaList() {
        return prdCorridaList;
    }

    public void setPrdCorridaList(List<PrdCorrida> prdCorridaList) {
        this.prdCorridaList = prdCorridaList;
    }

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "prdPiscina")
    public List<PrdGrameaje> getPrdGrameajeList() {
        return prdGrameajeList;
    }

    public void setPrdGrameajeList(List<PrdGrameaje> prdGrameajeList) {
        this.prdGrameajeList = prdGrameajeList;
    }

    @JoinColumns({
        @JoinColumn(name = "sec_empresa", referencedColumnName = "sec_empresa")
        ,
			@JoinColumn(name = "sec_codigo", referencedColumnName = "sec_codigo")})
    @ManyToOne(optional = false)
    public PrdSector getPrdSector() {
        return prdSector;
    }

    public void setPrdSector(PrdSector prdSector) {
        this.prdSector = prdSector;
    }

    @NotFound(action = NotFoundAction.IGNORE)
    @JoinColumns({
        @JoinColumn(name = "tipo_empresa", referencedColumnName = "tipo_empresa")
        ,@JoinColumn(name = "tipo_codigo", referencedColumnName = "tipo_codigo")})
    @ManyToOne(optional = true)
    public PrdPiscinaTipo getPrdPiscinaTipo() {
        return prdPiscinaTipo;
    }

    public void setPrdPiscinaTipo(PrdPiscinaTipo prdPiscinaTipo) {
        this.prdPiscinaTipo = prdPiscinaTipo;
    }

    @Column(name = "cta_costo_venta")
    public String getCtaCostoVenta() {
        return ctaCostoVenta;
    }

    public void setCtaCostoVenta(String ctaCostoVenta) {
        this.ctaCostoVenta = ctaCostoVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (prdPiscinaPK != null ? prdPiscinaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof PrdPiscina)) {
            return false;
        }
        PrdPiscina other = (PrdPiscina) object;
        if ((this.prdPiscinaPK == null && other.prdPiscinaPK != null)
                || (this.prdPiscinaPK != null && !this.prdPiscinaPK.equals(other.prdPiscinaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "produccion.entity.PrdPiscina[ prdPiscinaPK=" + prdPiscinaPK + " ]";
    }

}
