/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.activoFijo.TO;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
public class AfDepreciacionesTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "af_codigo")
    private String afCodigo;
    @Column(name = "af_categoria")
    private String afCategoria;
    @Column(name = "af_ubicacion")
    private String afUbicacion;
    @Column(name = "af_descripcion")
    private String afDescripcion;
    @Column(name = "af_fecha_adquisicion")
    private String afFechaAdquisicion;
    @Column(name = "af_valor_adquisicion")
    private BigDecimal afValorAdquisicion;
    @Column(name = "af_valor_residual")
    private BigDecimal afValorResidual;
    @Column(name = "af_depreciacion_anterior")
    private BigDecimal afDepreciacionAnterior;
    @Column(name = "af_depreciacion_actual")
    private BigDecimal afDepreciacionActual;
    @Column(name = "af_depreciacion_acumulada")
    private BigDecimal afDepreciacionAcumulada;
    @Column(name = "af_depreciacion_gnd")
    private BigDecimal afDepreciacionGnd;
    @Column(name = "af_sector")
    private String afSector;
    @Column(name = "af_cuenta_depreciacion_acumulada_activo")
    private String afCuentaDepreciacionAcumuladaActivo;
    @Column(name = "af_cuenta_depreciacion_acumulada_gasto")
    private String afCuentaDepreciacionAcumuladaGasto;
    @Column(name = "af_cuenta_depreciacion_no_deducible")
    private String afCuentaDepreciacionNoDeducible;
    @Column(name = "af_contable")
    private String afContable;

    public AfDepreciacionesTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAfCodigo() {
        return afCodigo;
    }

    public void setAfCodigo(String afCodigo) {
        this.afCodigo = afCodigo;
    }

    public String getAfCategoria() {
        return afCategoria;
    }

    public void setAfCategoria(String afCategoria) {
        this.afCategoria = afCategoria;
    }

    public String getAfUbicacion() {
        return afUbicacion;
    }

    public void setAfUbicacion(String afUbicacion) {
        this.afUbicacion = afUbicacion;
    }

    public String getAfDescripcion() {
        return afDescripcion;
    }

    public void setAfDescripcion(String afDescripcion) {
        this.afDescripcion = afDescripcion;
    }

    public String getAfFechaAdquisicion() {
        return afFechaAdquisicion;
    }

    public void setAfFechaAdquisicion(String afFechaAdquisicion) {
        this.afFechaAdquisicion = afFechaAdquisicion;
    }

    public BigDecimal getAfValorAdquisicion() {
        return afValorAdquisicion;
    }

    public void setAfValorAdquisicion(BigDecimal afValorAdquisicion) {
        this.afValorAdquisicion = afValorAdquisicion;
    }

    public BigDecimal getAfValorResidual() {
        return afValorResidual;
    }

    public void setAfValorResidual(BigDecimal afValorResidual) {
        this.afValorResidual = afValorResidual;
    }

    public BigDecimal getAfDepreciacionAnterior() {
        return afDepreciacionAnterior;
    }

    public void setAfDepreciacionAnterior(BigDecimal afDepreciacionAnterior) {
        this.afDepreciacionAnterior = afDepreciacionAnterior;
    }

    public BigDecimal getAfDepreciacionActual() {
        return afDepreciacionActual;
    }

    public void setAfDepreciacionActual(BigDecimal afDepreciacionActual) {
        this.afDepreciacionActual = afDepreciacionActual;
    }

    public BigDecimal getAfDepreciacionAcumulada() {
        return afDepreciacionAcumulada;
    }

    public void setAfDepreciacionAcumulada(BigDecimal afDepreciacionAcumulada) {
        this.afDepreciacionAcumulada = afDepreciacionAcumulada;
    }

    public BigDecimal getAfDepreciacionGnd() {
        return afDepreciacionGnd;
    }

    public void setAfDepreciacionGnd(BigDecimal afDepreciacionGnd) {
        this.afDepreciacionGnd = afDepreciacionGnd;
    }

    public String getAfSector() {
        return afSector;
    }

    public void setAfSector(String afSector) {
        this.afSector = afSector;
    }

    public String getAfCuentaDepreciacionAcumuladaActivo() {
        return afCuentaDepreciacionAcumuladaActivo;
    }

    public void setAfCuentaDepreciacionAcumuladaActivo(String afCuentaDepreciacionAcumuladaActivo) {
        this.afCuentaDepreciacionAcumuladaActivo = afCuentaDepreciacionAcumuladaActivo;
    }

    public String getAfCuentaDepreciacionAcumuladaGasto() {
        return afCuentaDepreciacionAcumuladaGasto;
    }

    public void setAfCuentaDepreciacionAcumuladaGasto(String afCuentaDepreciacionAcumuladaGasto) {
        this.afCuentaDepreciacionAcumuladaGasto = afCuentaDepreciacionAcumuladaGasto;
    }

    public String getAfCuentaDepreciacionNoDeducible() {
        return afCuentaDepreciacionNoDeducible;
    }

    public void setAfCuentaDepreciacionNoDeducible(String afCuentaDepreciacionNoDeducible) {
        this.afCuentaDepreciacionNoDeducible = afCuentaDepreciacionNoDeducible;
    }

    public String getAfContable() {
        return afContable;
    }

    public void setAfContable(String afContable) {
        this.afContable = afContable;
    }

}
