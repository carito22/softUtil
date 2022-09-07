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
 * @author Usuario1
 */
@Entity
public class AfListadoActivoFijoTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "af_categoria")
    private String afCategoria;
    @Column(name = "af_descripcion")
    private String afDescripcion;
    @Column(name = "af_ubicacion")
    private String afUbicacion;
    @Column(name = "af_valor_adquisicion")
    private BigDecimal afValorAdquisicion;
    @Column(name = "af_valor_residual")
    private BigDecimal afValorResidual;
    @Column(name = "af_fecha_adquisicion")
    private String afFechaAdquisicion;
    @Column(name = "af_vida_util")
    private String afVidaUtil;
    @Column(name = "af_marca")
    private String afMarca;
    @Column(name = "af_serie")
    private String afSerie;
    @Column(name = "af_especificaciones")
    private String afEspecificaciones;
    @Column(name = "af_compra")
    private String afCompra;
    @Column(name = "af_proveedor_codigo")
    private String afProveedorCodigo;
    @Column(name = "af_proveedor_descripcion")
    private String afproveedorDescripcion;

    public AfListadoActivoFijoTO(){
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAfCategoria() {
        return afCategoria;
    }

    public void setAfCategoria(String afCategoria) {
        this.afCategoria = afCategoria;
    }

    public String getAfDescripcion() {
        return afDescripcion;
    }

    public void setAfDescripcion(String afDescripcion) {
        this.afDescripcion = afDescripcion;
    }

    public String getAfUbicacion() {
        return afUbicacion;
    }

    public void setAfUbicacion(String afUbicacion) {
        this.afUbicacion = afUbicacion;
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

    public String getAfFechaAdquisicion() {
        return afFechaAdquisicion;
    }

    public void setAfFechaAdquisicion(String afFechaAdquisicion) {
        this.afFechaAdquisicion = afFechaAdquisicion;
    }

    public String getAfVidaUtil() {
        return afVidaUtil;
    }

    public void setAfVidaUtil(String afVidaUtil) {
        this.afVidaUtil = afVidaUtil;
    }

    public String getAfMarca() {
        return afMarca;
    }

    public void setAfMarca(String afMarca) {
        this.afMarca = afMarca;
    }

    public String getAfSerie() {
        return afSerie;
    }

    public void setAfSerie(String afSerie) {
        this.afSerie = afSerie;
    }

    public String getAfEspecificaciones() {
        return afEspecificaciones;
    }

    public void setAfEspecificaciones(String afEspecificaciones) {
        this.afEspecificaciones = afEspecificaciones;
    }

    public String getAfCompra() {
        return afCompra;
    }

    public void setAfCompra(String afCompra) {
        this.afCompra = afCompra;
    }

    public String getAfProveedorCodigo() {
        return afProveedorCodigo;
    }

    public void setAfProveedorCodigo(String afProveedorCodigo) {
        this.afProveedorCodigo = afProveedorCodigo;
    }

    public String getAfproveedorDescripcion() {
        return afproveedorDescripcion;
    }

    public void setAfproveedorDescripcion(String afproveedorDescripcion) {
        this.afproveedorDescripcion = afproveedorDescripcion;
    }
            	
    
}
