/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.activoFijo.TO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import ec.com.todocompu.ShrimpSoftUtils.activoFijo.entity.AfActivos;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdListaSectorTO;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author developer3
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AfActivoTO implements Serializable {

    private String afEmpresa;
    private String afCodigo;
    private String afDescripcion;
    private Date afFechaAdquisicion;
    private BigDecimal afValorAdquision;
    private BigDecimal afValorResidual;
    private Integer afVidaUtil;
    private BigDecimal afDepreciacionInicialMonto;
    private BigDecimal afDepreciacionInicialMeses;
    private String usrEmpresa;
    private String usrCodigo;
    private Date usrFechaInserta;
    private AfUbicacionesTO afUbicaciones;
    private PrdListaSectorTO prdListaSectorTO;
    private AfCategoriasTO afCategorias;

    private String categoriaDescripcion;
    private String ubicacionDescripcion;
    private String sectorDescripcion;

    public AfActivoTO() {
        afUbicaciones = new AfUbicacionesTO();
        prdListaSectorTO = new PrdListaSectorTO();
        afCategorias = new AfCategoriasTO();
    }

    public AfCategoriasTO getAfCategorias() {
        return afCategorias;
    }

    public void setAfCategorias(AfCategoriasTO afCategorias) {
        this.afCategorias = afCategorias;
    }

    public String getAfEmpresa() {
        return afEmpresa;
    }

    public void setAfEmpresa(String afEmpresa) {
        this.afEmpresa = afEmpresa;
    }

    public String getAfCodigo() {
        return afCodigo;
    }

    public void setAfCodigo(String afCodigo) {
        this.afCodigo = afCodigo;
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

    public AfUbicacionesTO getAfUbicaciones() {
        return afUbicaciones;
    }

    public void setAfUbicaciones(AfUbicacionesTO afUbicaciones) {
        this.afUbicaciones = afUbicaciones;
    }

    public PrdListaSectorTO getPrdListaSectorTO() {
        return prdListaSectorTO;
    }

    public void setPrdListaSectorTO(PrdListaSectorTO prdListaSectorTO) {
        this.prdListaSectorTO = prdListaSectorTO;
    }

    public String getCategoriaDescripcion() {
        return categoriaDescripcion;
    }

    public void setCategoriaDescripcion(String categoriaDescripcion) {
        this.categoriaDescripcion = categoriaDescripcion;
    }

    public String getUbicacionDescripcion() {
        return ubicacionDescripcion;
    }

    public void setUbicacionDescripcion(String ubicacionDescripcion) {
        this.ubicacionDescripcion = ubicacionDescripcion;
    }

    public String getSectorDescripcion() {
        return sectorDescripcion;
    }

    public void setSectorDescripcion(String sectorDescripcion) {
        this.sectorDescripcion = sectorDescripcion;
    }

    public Integer getAfVidaUtil() {
        return afVidaUtil;
    }

    public void setAfVidaUtil(Integer afVidaUtil) {
        this.afVidaUtil = afVidaUtil;
    }

    public void convertirObjeto(AfActivos afActivos) {
        if (afActivos != null) {
            this.afCodigo = afActivos.getAfActivosPK().getAfCodigo();
            this.afEmpresa = afActivos.getAfActivosPK().getAfEmpresa();
            this.afDepreciacionInicialMeses = afActivos.getAfDepreciacionInicialMeses();
            this.afDepreciacionInicialMonto = afActivos.getAfDepreciacionInicialMonto();
            this.afDescripcion = afActivos.getAfDescripcion();
            this.afFechaAdquisicion = afActivos.getAfFechaAdquisicion();
            this.afValorAdquision = afActivos.getAfValorAdquision();
            this.afValorResidual = afActivos.getAfValorResidual();
            this.afVidaUtil = afActivos.getAfVidaUtil();
            this.categoriaDescripcion = afActivos.getAfCategorias().getCatDescripcion();
            this.ubicacionDescripcion = afActivos.getAfUbicaciones().getUbiDescripcion();
            this.afUbicaciones.convertirObjeto(afActivos.getAfUbicaciones());
            this.afCategorias.convertirObjeto(afActivos.getAfCategorias());
            this.usrCodigo = afActivos.getUsrCodigo();
            this.usrEmpresa = afActivos.getUsrEmpresa();
            this.usrFechaInserta = afActivos.getUsrFechaInserta();
        }
    }

}
