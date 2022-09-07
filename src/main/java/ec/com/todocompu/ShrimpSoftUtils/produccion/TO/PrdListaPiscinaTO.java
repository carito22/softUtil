/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdListaPiscinaTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private BigDecimal id;
    @Column(name = "pis_numero")
    private String pisNumero;
    @Column(name = "pis_nombre")
    private String pisNombre;
    @Column(name = "pis_hectareaje")
    private BigDecimal pisHectareaje;
    @Column(name = "cta_costo_directo")
    private String ctaCostoDirecto;
    @Column(name = "cta_costo_indirecto")
    private String ctaCostoIndirecto;
    @Column(name = "cta_costo_transferencia")
    private String ctaCostoTransferencia;
    @Column(name = "cta_costo_producto_terminado")
    private String ctaCostoProductoTerminado;
    @Column(name = "pis_Activa")
    private Boolean pisActiva;
    @Column(name = "pis_sector")
    private String pisSector;
    @Column(name = "tipo_empresa")
    private String tipoEmpresa;
    @Column(name = "tipo_codigo")
    private String tipoCodigo;
    @Column(name = "grupo_empresa")
    private String grupoEmpresa;
    @Column(name = "grupo_codigo")
    private String grupoCodigo;
    @Column(name = "cta_costo_venta")
    private String ctaCostoVenta;

    public PrdListaPiscinaTO() {
    }

    public PrdListaPiscinaTO(String pisNumero, String pisNombre, BigDecimal pisHectareaje, Boolean pisActiva,
            String pisSector) {

        this.pisNumero = pisNumero;
        this.pisNombre = pisNombre;
        this.pisHectareaje = pisHectareaje;
        this.pisActiva = pisActiva;
        this.pisSector = pisSector;
    }

    public PrdListaPiscinaTO(String pisNumero, String pisNombre, BigDecimal pisHectareaje, String ctaCostoDirecto,
            String ctaCostoIndirecto, String ctaCostoTransferencia, String ctaCostoProductoTerminado, Boolean pisActiva,
            String pisSector) {
        this.pisNumero = pisNumero;
        this.pisNombre = pisNombre;
        this.pisHectareaje = pisHectareaje;
        this.ctaCostoDirecto = ctaCostoDirecto;
        this.ctaCostoIndirecto = ctaCostoIndirecto;
        this.ctaCostoTransferencia = ctaCostoTransferencia;
        this.ctaCostoProductoTerminado = ctaCostoProductoTerminado;
        this.pisActiva = pisActiva;
        this.pisSector = pisSector;
    }

    public String getCtaCostoVenta() {
        return ctaCostoVenta;
    }

    public void setCtaCostoVenta(String ctaCostoVenta) {
        this.ctaCostoVenta = ctaCostoVenta;
    }

    public Boolean getPisActiva() {
        return pisActiva;
    }

    public void setPisActiva(Boolean pisActiva) {
        this.pisActiva = pisActiva;
    }

    public BigDecimal getPisHectareaje() {
        return pisHectareaje;
    }

    public void setPisHectareaje(BigDecimal pisHectareaje) {
        this.pisHectareaje = pisHectareaje;
    }

    public String getPisNombre() {
        return pisNombre;
    }

    public void setPisNombre(String pisNombre) {
        this.pisNombre = pisNombre;
    }

    public String getPisNumero() {
        return pisNumero;
    }

    public void setPisNumero(String pisNumero) {
        this.pisNumero = pisNumero;
    }

    public String getPisSector() {
        return pisSector;
    }

    public void setPisSector(String pisSector) {
        this.pisSector = pisSector;
    }

    public String getCtaCostoDirecto() {
        return ctaCostoDirecto;
    }

    public void setCtaCostoDirecto(String ctaCostoDirecto) {
        this.ctaCostoDirecto = ctaCostoDirecto;
    }

    public String getCtaCostoIndirecto() {
        return ctaCostoIndirecto;
    }

    public void setCtaCostoIndirecto(String ctaCostoIndirecto) {
        this.ctaCostoIndirecto = ctaCostoIndirecto;
    }

    public String getCtaCostoTransferencia() {
        return ctaCostoTransferencia;
    }

    public void setCtaCostoTransferencia(String ctaCostoTransferencia) {
        this.ctaCostoTransferencia = ctaCostoTransferencia;
    }

    public String getCtaCostoProductoTerminado() {
        return ctaCostoProductoTerminado;
    }

    public void setCtaCostoProductoTerminado(String ctaCostoProductoTerminado) {
        this.ctaCostoProductoTerminado = ctaCostoProductoTerminado;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getTipoCodigo() {
        return tipoCodigo;
    }

    public void setTipoCodigo(String tipoCodigo) {
        this.tipoCodigo = tipoCodigo;
    }

    @Override
    public String toString() {
        return this.pisNumero + " " + this.pisNombre;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getGrupoEmpresa() {
        return grupoEmpresa;
    }

    public void setGrupoEmpresa(String grupoEmpresa) {
        this.grupoEmpresa = grupoEmpresa;
    }

    public String getGrupoCodigo() {
        return grupoCodigo;
    }

    public void setGrupoCodigo(String grupoCodigo) {
        this.grupoCodigo = grupoCodigo;
    }

}
