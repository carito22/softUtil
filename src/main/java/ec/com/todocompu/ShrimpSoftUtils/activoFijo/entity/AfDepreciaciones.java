/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.activoFijo.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "af_depreciaciones", schema = "activosfijos")
@NamedQueries({
    @NamedQuery(name = "AfDepreciaciones.findAll", query = "SELECT a FROM AfDepreciaciones a")})
public class AfDepreciaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "dep_secuencial")
    private Integer depSecuencial;

    @Basic(optional = false)
    @NotNull
    @Column(name = "af_fecha_adquisicion")
    @Temporal(TemporalType.DATE)
    private Date afFechaAdquisicion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "af_valor_depreciacion")
    private BigDecimal afValorDepreciacion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "af_valor_adquision")
    private BigDecimal afValorAdquision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "af_valor_residual")
    private BigDecimal afValorResidual;
    @Basic(optional = false)
    @NotNull
    @Column(name = "af_valor_depreciacion_gnd")
    private BigDecimal afValorDepreciacionGnd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "con_empresa")
    private String conEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "con_periodo")
    private String conPeriodo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "con_tipo")
    private String conTipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "con_numero")
    private String conNumero;
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
        @JoinColumn(name = "af_empresa", referencedColumnName = "af_empresa")
        , @JoinColumn(name = "af_codigo", referencedColumnName = "af_codigo")})
    @ManyToOne(optional = false)
    private AfActivos afActivos;
    @JoinColumns({
        @JoinColumn(name = "cat_empresa", referencedColumnName = "cat_empresa")
        , @JoinColumn(name = "cat_codigo", referencedColumnName = "cat_codigo")})
    @ManyToOne(optional = false)
    private AfCategorias afCategoria;
    @JoinColumns({
        @JoinColumn(name = "ubi_empresa", referencedColumnName = "ubi_empresa")
        , @JoinColumn(name = "ubi_sector", referencedColumnName = "ubi_sector")
        , @JoinColumn(name = "ubi_codigo", referencedColumnName = "ubi_codigo")})
    @ManyToOne(optional = false)
    private AfUbicaciones afUbicaciones;

    public AfDepreciaciones() {
    }

    public AfDepreciaciones(Integer depSecuencial) {
        this.depSecuencial = depSecuencial;
    }

    public AfDepreciaciones(Integer depSecuencial, Date afFechaAdquisicion, BigDecimal afValorDepreciacion, BigDecimal afValorAdquision, BigDecimal afValorResidual, String conEmpresa, String conPeriodo, String conTipo, String conNumero, String usrEmpresa, String usrCodigo, Date usrFechaInserta, AfActivos afActivos, AfCategorias afCategoria, AfUbicaciones afUbicaciones) {
        this.depSecuencial = depSecuencial;
        this.afFechaAdquisicion = afFechaAdquisicion;
        this.afValorDepreciacion = afValorDepreciacion;
        this.afValorAdquision = afValorAdquision;
        this.afValorResidual = afValorResidual;
        this.conEmpresa = conEmpresa;
        this.conPeriodo = conPeriodo;
        this.conTipo = conTipo;
        this.conNumero = conNumero;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.afActivos = afActivos;
        this.afCategoria = afCategoria;
        this.afUbicaciones = afUbicaciones;
    }

    public Integer getDepSecuencial() {
        return depSecuencial;
    }

    public void setDepSecuencial(Integer depSecuencial) {
        this.depSecuencial = depSecuencial;
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

    public BigDecimal getAfValorDepreciacion() {
        return afValorDepreciacion;
    }

    public void setAfValorDepreciacion(BigDecimal afValorDepreciacion) {
        this.afValorDepreciacion = afValorDepreciacion;
    }

    public String getConEmpresa() {
        return conEmpresa;
    }

    public void setConEmpresa(String conEmpresa) {
        this.conEmpresa = conEmpresa;
    }

    public String getConPeriodo() {
        return conPeriodo;
    }

    public void setConPeriodo(String conPeriodo) {
        this.conPeriodo = conPeriodo;
    }

    public String getConTipo() {
        return conTipo;
    }

    public void setConTipo(String conTipo) {
        this.conTipo = conTipo;
    }

    public String getConNumero() {
        return conNumero;
    }

    public void setConNumero(String conNumero) {
        this.conNumero = conNumero;
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

    public AfActivos getAfActivos() {
        return afActivos;
    }

    public void setAfActivos(AfActivos afActivos) {
        this.afActivos = afActivos;
    }

    public AfUbicaciones getAfUbicaciones() {
        return afUbicaciones;
    }

    public void setAfUbicaciones(AfUbicaciones afUbicaciones) {
        this.afUbicaciones = afUbicaciones;
    }

    public AfCategorias getAfCategoria() {
        return afCategoria;
    }

    public void setAfCategoria(AfCategorias afCategoria) {
        this.afCategoria = afCategoria;
    }

    public BigDecimal getAfValorDepreciacionGnd() {
        return afValorDepreciacionGnd;
    }

    public void setAfValorDepreciacionGnd(BigDecimal afValorDepreciacionGnd) {
        this.afValorDepreciacionGnd = afValorDepreciacionGnd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (depSecuencial != null ? depSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AfDepreciaciones)) {
            return false;
        }
        AfDepreciaciones other = (AfDepreciaciones) object;
        if ((this.depSecuencial == null && other.depSecuencial != null) || (this.depSecuencial != null && !this.depSecuencial.equals(other.depSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.activoFijo.entity.AfDepreciaciones[ depSecuencial=" + depSecuencial + " ]";
    }

}
