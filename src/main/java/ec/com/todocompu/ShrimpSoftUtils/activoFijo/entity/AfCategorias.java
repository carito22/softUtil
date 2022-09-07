/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.activoFijo.entity;

import ec.com.todocompu.ShrimpSoftUtils.activoFijo.TO.AfCategoriasTO;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "af_categorias", schema = "activosfijos")
@NamedQueries({
    @NamedQuery(name = "AfCategorias.findAll", query = "SELECT a FROM AfCategorias a")})
public class AfCategorias implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AfCategoriasPK afCategoriasPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "cat_descripcion")
    private String catDescripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cat_vida_util")
    private int catVidaUtil;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "cat_porcentaje_depreciacion")
    private BigDecimal catPorcentajeDepreciacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cat_inactivo")
    private boolean catInactivo;
    @Column(name = "cat_cuenta_activo")
    private String catCuentaActivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "cat_cuenta_depreciacion")
    private String catCuentaDepreciacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "cat_cuenta_depreciacion_acumulada")
    private String catCuentaDepreciacionAcumulada;
    @Basic(optional = false)
    @Size(min = 1, max = 2147483647)
    @Column(name = "cat_cuenta_gnd")
    private String catCuentaGnd;
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

    public AfCategorias() {
    }

    public AfCategorias(AfCategoriasPK afCategoriasPK) {
        this.afCategoriasPK = afCategoriasPK;
    }

    public AfCategorias(AfCategoriasPK afCategoriasPK, String catDescripcion, int catVidaUtil, BigDecimal catPorcentajeDepreciacion, boolean catInactivo, String catCuentaActivo, String catCuentaDepreciacion, String catCuentaDepreciacionAcumulada, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.afCategoriasPK = afCategoriasPK;
        this.catDescripcion = catDescripcion;
        this.catVidaUtil = catVidaUtil;
        this.catPorcentajeDepreciacion = catPorcentajeDepreciacion;
        this.catInactivo = catInactivo;
        this.catCuentaActivo = catCuentaActivo;
        this.catCuentaDepreciacion = catCuentaDepreciacion;
        this.catCuentaDepreciacionAcumulada = catCuentaDepreciacionAcumulada;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public AfCategorias(String catEmpresa, String catCodigo) {
        this.afCategoriasPK = new AfCategoriasPK(catEmpresa, catCodigo);
    }

    public AfCategoriasPK getAfCategoriasPK() {
        return afCategoriasPK;
    }

    public void setAfCategoriasPK(AfCategoriasPK afCategoriasPK) {
        this.afCategoriasPK = afCategoriasPK;
    }

    public String getCatDescripcion() {
        return catDescripcion;
    }

    public void setCatDescripcion(String catDescripcion) {
        this.catDescripcion = catDescripcion;
    }

    public int getCatVidaUtil() {
        return catVidaUtil;
    }

    public void setCatVidaUtil(int catVidaUtil) {
        this.catVidaUtil = catVidaUtil;
    }

    public BigDecimal getCatPorcentajeDepreciacion() {
        return catPorcentajeDepreciacion;
    }

    public void setCatPorcentajeDepreciacion(BigDecimal catPorcentajeDepreciacion) {
        this.catPorcentajeDepreciacion = catPorcentajeDepreciacion;
    }

    public boolean getCatInactivo() {
        return catInactivo;
    }

    public void setCatInactivo(boolean catInactivo) {
        this.catInactivo = catInactivo;
    }

    public String getCatCuentaActivo() {
        return catCuentaActivo;
    }

    public void setCatCuentaActivo(String catCuentaActivo) {
        this.catCuentaActivo = catCuentaActivo;
    }

    public String getCatCuentaDepreciacion() {
        return catCuentaDepreciacion;
    }

    public void setCatCuentaDepreciacion(String catCuentaDepreciacion) {
        this.catCuentaDepreciacion = catCuentaDepreciacion;
    }

    public String getCatCuentaDepreciacionAcumulada() {
        return catCuentaDepreciacionAcumulada;
    }

    public void setCatCuentaDepreciacionAcumulada(String catCuentaDepreciacionAcumulada) {
        this.catCuentaDepreciacionAcumulada = catCuentaDepreciacionAcumulada;
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

    public String getCatCuentaGnd() {
        return catCuentaGnd;
    }

    public void setCatCuentaGnd(String catCuentaGnd) {
        this.catCuentaGnd = catCuentaGnd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (afCategoriasPK != null ? afCategoriasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AfCategorias)) {
            return false;
        }
        AfCategorias other = (AfCategorias) object;
        if ((this.afCategoriasPK == null && other.afCategoriasPK != null) || (this.afCategoriasPK != null && !this.afCategoriasPK.equals(other.afCategoriasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.activoFijo.entity.AfCategorias[ afCategoriasPK=" + afCategoriasPK + " ]";
    }

    public void convertirObjeto(AfCategoriasTO afCategoriasTO) {
        this.afCategoriasPK = new AfCategoriasPK(afCategoriasTO.getCatEmpresa(), afCategoriasTO.getCatCodigo());
        this.catCuentaActivo = afCategoriasTO.getCatCuentaActivo();
        this.catCuentaDepreciacion = afCategoriasTO.getCatCuentaDepreciacion();
        this.catCuentaDepreciacionAcumulada = afCategoriasTO.getCatCuentaDepreciacionAcumulada();
        this.catCuentaGnd = afCategoriasTO.getCatCuentaGnd();
        this.catDescripcion = afCategoriasTO.getCatDescripcion();
        this.catInactivo = afCategoriasTO.isCatInactivo();
        this.catPorcentajeDepreciacion = afCategoriasTO.getCatPorcentajeDepreciacion();
        this.catVidaUtil = afCategoriasTO.getCatVidaUtil();
        this.usrCodigo = afCategoriasTO.getUsrCodigo();
        this.usrEmpresa = afCategoriasTO.getUsrEmpresa();
        this.usrFechaInserta = afCategoriasTO.getUsrFechaInserta();
    }

}
