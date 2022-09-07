/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.activoFijo.TO;

import ec.com.todocompu.ShrimpSoftUtils.activoFijo.entity.AfCategorias;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Transient;

/**
 *
 * @author developer3
 */
public class AfCategoriasTO implements Serializable {

    private String catEmpresa;
    private String catCodigo;
    private String catDescripcion;
    private int catVidaUtil;
    private BigDecimal catPorcentajeDepreciacion;
    private boolean catInactivo;
    private String catCuentaActivo;
    private String catCuentaDepreciacion;
    private String catCuentaDepreciacionAcumulada;
    private String catCuentaGnd;
    private String usrEmpresa;
    private String usrCodigo;
    private Date usrFechaInserta;
    @Transient
    private String catCuentaActivoDetalle;
    @Transient
    private String catCuentaDepreciacionDetalle;
    @Transient
    private String catCuentaDepreciacionAcumuladaDetalle;
    @Transient
    private String catCuentaGndDetalle;

    public AfCategoriasTO() {
    }

    public String getCatEmpresa() {
        return catEmpresa;
    }

    public void setCatEmpresa(String catEmpresa) {
        this.catEmpresa = catEmpresa;
    }

    public String getCatCodigo() {
        return catCodigo;
    }

    public void setCatCodigo(String catCodigo) {
        this.catCodigo = catCodigo;
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

    public boolean isCatInactivo() {
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

    public String getCatCuentaGndDetalle() {
        return catCuentaGndDetalle;
    }

    public void setCatCuentaGndDetalle(String catCuentaGndDetalle) {
        this.catCuentaGndDetalle = catCuentaGndDetalle;
    }

    public void convertirObjeto(AfCategorias afCategorias) {
        if (afCategorias != null) {
            this.catCodigo = afCategorias.getAfCategoriasPK().getCatCodigo();
            this.catCuentaActivo = afCategorias.getCatCuentaActivo();
            this.catCuentaDepreciacion = afCategorias.getCatCuentaDepreciacion();
            this.catCuentaDepreciacionAcumulada = afCategorias.getCatCuentaDepreciacionAcumulada();
            this.catCuentaGnd = afCategorias.getCatCuentaGnd();
            this.catDescripcion = afCategorias.getCatDescripcion();
            this.catEmpresa = afCategorias.getAfCategoriasPK().getCatEmpresa();
            this.catInactivo = afCategorias.getCatInactivo();
            this.catPorcentajeDepreciacion = afCategorias.getCatPorcentajeDepreciacion();
            this.catVidaUtil = afCategorias.getCatVidaUtil();
            this.usrCodigo = afCategorias.getUsrCodigo();
            this.usrEmpresa = afCategorias.getUsrEmpresa();
            this.usrFechaInserta = afCategorias.getUsrFechaInserta();
        }
    }

    public String getCatCuentaActivoDetalle() {
        return catCuentaActivoDetalle;
    }

    public void setCatCuentaActivoDetalle(String catCuentaActivoDetalle) {
        this.catCuentaActivoDetalle = catCuentaActivoDetalle;
    }

    public String getCatCuentaDepreciacionDetalle() {
        return catCuentaDepreciacionDetalle;
    }

    public void setCatCuentaDepreciacionDetalle(String catCuentaDepreciacionDetalle) {
        this.catCuentaDepreciacionDetalle = catCuentaDepreciacionDetalle;
    }

    public String getCatCuentaDepreciacionAcumuladaDetalle() {
        return catCuentaDepreciacionAcumuladaDetalle;
    }

    public void setCatCuentaDepreciacionAcumuladaDetalle(String catCuentaDepreciacionAcumuladaDetalle) {
        this.catCuentaDepreciacionAcumuladaDetalle = catCuentaDepreciacionAcumuladaDetalle;
    }

}
