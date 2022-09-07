/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.activoFijo.entity;

import ec.com.todocompu.ShrimpSoftUtils.activoFijo.TO.AfActivoTO;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author User
 */
@Entity
@Table(name = "af_activos", schema = "activosfijos")
@NamedQueries({
    @NamedQuery(name = "AfActivos.findAll", query = "SELECT a FROM AfActivos a")})
public class AfActivos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AfActivosPK afActivosPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "af_descripcion")
    private String afDescripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "af_fecha_adquisicion")
    @Temporal(TemporalType.DATE)
    private Date afFechaAdquisicion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "af_valor_adquision")
    private BigDecimal afValorAdquision = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "af_valor_residual")
    private BigDecimal afValorResidual = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "af_vida_util")
    private int afVidaUtil;
    @Basic(optional = false)
    @NotNull
    @Column(name = "af_depreciacion_inicial_monto")
    private BigDecimal afDepreciacionInicialMonto = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "af_depreciacion_inicial_meses")
    private BigDecimal afDepreciacionInicialMeses = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usr_fecha_inserta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @JoinColumns({
        @JoinColumn(name = "cat_empresa", referencedColumnName = "cat_empresa")
        , @JoinColumn(name = "cat_codigo", referencedColumnName = "cat_codigo")})
    @ManyToOne(optional = false)
    private AfCategorias afCategorias;
    @JoinColumns({
        @JoinColumn(name = "ubi_empresa", referencedColumnName = "ubi_empresa")
        , @JoinColumn(name = "ubi_sector", referencedColumnName = "ubi_sector")
        , @JoinColumn(name = "ubi_codigo", referencedColumnName = "ubi_codigo")})
    @ManyToOne(optional = false)
    private AfUbicaciones afUbicaciones;

    public AfActivos() {
    }

    public AfActivos(AfActivosPK afActivosPK) {
        this.afActivosPK = afActivosPK;
    }

    public AfActivos(AfActivosPK afActivosPK, String afDescripcion, Date afFechaAdquisicion, BigDecimal afValorAdquision, BigDecimal afValorResidual, BigDecimal afDepreciacionInicialMonto, BigDecimal afDepreciacionInicialMeses, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.afActivosPK = afActivosPK;
        this.afDescripcion = afDescripcion;
        this.afFechaAdquisicion = afFechaAdquisicion;
        this.afValorAdquision = afValorAdquision;
        this.afValorResidual = afValorResidual;
        this.afDepreciacionInicialMonto = afDepreciacionInicialMonto;
        this.afDepreciacionInicialMeses = afDepreciacionInicialMeses;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public AfActivos(String afEmpresa, String afCodigo) {
        this.afActivosPK = new AfActivosPK(afEmpresa, afCodigo);
    }

    public AfActivosPK getAfActivosPK() {
        return afActivosPK;
    }

    public void setAfActivosPK(AfActivosPK afActivosPK) {
        this.afActivosPK = afActivosPK;
    }

    public String getAfDescripcion() {
        return afDescripcion;
    }

    public void setAfDescripcion(String afDescripcion) {
        this.afDescripcion = afDescripcion;
    }

    public Date getAfFechaAdquisicion() {
        return afFechaAdquisicion;
    }

    public void setAfFechaAdquisicion(Date afFechaAdquisicion) {
        this.afFechaAdquisicion = afFechaAdquisicion;
    }

    public BigDecimal getAfValorAdquision() {
        return afValorAdquision;
    }

    public void setAfValorAdquision(BigDecimal afValorAdquision) {
        this.afValorAdquision = afValorAdquision;
    }

    public BigDecimal getAfValorResidual() {
        return afValorResidual;
    }

    public void setAfValorResidual(BigDecimal afValorResidual) {
        this.afValorResidual = afValorResidual;
    }

    public BigDecimal getAfDepreciacionInicialMonto() {
        return afDepreciacionInicialMonto;
    }

    public void setAfDepreciacionInicialMonto(BigDecimal afDepreciacionInicialMonto) {
        this.afDepreciacionInicialMonto = afDepreciacionInicialMonto;
    }

    public BigDecimal getAfDepreciacionInicialMeses() {
        return afDepreciacionInicialMeses;
    }

    public void setAfDepreciacionInicialMeses(BigDecimal afDepreciacionInicialMeses) {
        this.afDepreciacionInicialMeses = afDepreciacionInicialMeses;
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

    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public AfCategorias getAfCategorias() {
        return afCategorias;
    }

    public void setAfCategorias(AfCategorias afCategorias) {
        this.afCategorias = afCategorias;
    }

    public AfUbicaciones getAfUbicaciones() {
        return afUbicaciones;
    }

    public void setAfUbicaciones(AfUbicaciones afUbicaciones) {
        this.afUbicaciones = afUbicaciones;
    }

    public int getAfVidaUtil() {
        return afVidaUtil;
    }

    public void setAfVidaUtil(int afVidaUtil) {
        this.afVidaUtil = afVidaUtil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (afActivosPK != null ? afActivosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AfActivos)) {
            return false;
        }
        AfActivos other = (AfActivos) object;
        if ((this.afActivosPK == null && other.afActivosPK != null) || (this.afActivosPK != null && !this.afActivosPK.equals(other.afActivosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.activoFijo.entity.AfActivos[ afActivosPK=" + afActivosPK + " ]";
    }

    public void convertirObjeto(AfActivoTO afActivoTO) {
        this.afActivosPK = new AfActivosPK(afActivoTO.getAfEmpresa(), afActivoTO.getAfCodigo());
        this.afDepreciacionInicialMeses = afActivoTO.getAfDepreciacionInicialMeses();
        this.afDepreciacionInicialMonto = afActivoTO.getAfDepreciacionInicialMonto();
        this.afDescripcion = afActivoTO.getAfDescripcion();
        this.afFechaAdquisicion = afActivoTO.getAfFechaAdquisicion();
        this.afUbicaciones = new AfUbicaciones(afActivoTO.getAfUbicaciones().getUbiEmpresa(), afActivoTO.getAfUbicaciones().getUbiSector(), afActivoTO.getAfUbicaciones().getUbiCodigo());
        this.afCategorias = new AfCategorias(afActivoTO.getAfCategorias().getCatEmpresa(), afActivoTO.getAfCategorias().getCatCodigo());
        this.afValorAdquision = afActivoTO.getAfValorAdquision();
        this.afValorResidual = afActivoTO.getAfValorResidual();
        this.afVidaUtil = afActivoTO.getAfVidaUtil();
        this.usrCodigo = afActivoTO.getUsrCodigo();
        this.usrEmpresa = afActivoTO.getUsrEmpresa();
        this.usrFechaInserta = afActivoTO.getUsrFechaInserta();
    }

}
