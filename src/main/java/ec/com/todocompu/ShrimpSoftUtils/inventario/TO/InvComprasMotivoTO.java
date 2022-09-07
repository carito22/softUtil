/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvComprasMotivoTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cm_codigo")
    private String cmCodigo;

    @Column(name = "cm_empresa")
    private String cmEmpresa;

    @Column(name = "cm_detalle")
    private String cmDetalle;

    @Column(name = "cm_forma_contabilizar")
    private String cmFormaContabilizar;

    @Column(name = "cm_forma_imprimir")
    private String cmFormaImprimir;

    @Column(name = "cm_ajustes_de_inventario")
    private Boolean cmAjustesDeInventario;

    @Column(name = "cm_inactivo")
    private Boolean cmInactivo;

    @Column(name = "tip_codigo")
    private String tipCodigo;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    @Column(name = "cm_imb")
    private Boolean cmImb;

    @Column(name = "cm_exigir_liquidacion")
    private Boolean cmExigirLiquidacion;

    @Column(name = "cm_exigir_imb")
    private Boolean cmExigirImb;

    @Column(name = "cm_exigir_orden_compra")
    private Boolean cmExigirOrdenCompra;

    public InvComprasMotivoTO() {
    }

    public InvComprasMotivoTO(String cmEmpresa, String cmCodigo, String cmDetalle, String cmFormaContabilizar,
            String cmFormaImprimir, Boolean cmAjustesDeInventario, Boolean cmInactivo, String tipCodigo,
            String usrCodigo, String usrFechaInserta) {
        this.cmEmpresa = cmEmpresa;
        this.cmCodigo = cmCodigo;
        this.cmDetalle = cmDetalle;
        this.cmFormaContabilizar = cmFormaContabilizar;
        this.cmFormaImprimir = cmFormaImprimir;
        this.cmAjustesDeInventario = cmAjustesDeInventario;
        this.cmInactivo = cmInactivo;
        this.tipCodigo = tipCodigo;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public Boolean getCmAjustesDeInventario() {
        return cmAjustesDeInventario;
    }

    public void setCmAjustesDeInventario(Boolean cmAjustesDeInventario) {
        this.cmAjustesDeInventario = cmAjustesDeInventario;
    }

    public String getCmFormaContabilizar() {
        return cmFormaContabilizar;
    }

    public void setCmFormaContabilizar(String cmFormaContabilizar) {
        this.cmFormaContabilizar = cmFormaContabilizar;
    }

    public String getCmFormaImprimir() {
        return cmFormaImprimir;
    }

    public void setCmFormaImprimir(String cmFormaImprimir) {
        this.cmFormaImprimir = cmFormaImprimir;
    }

    public String getCmEmpresa() {
        return cmEmpresa;
    }

    public void setCmEmpresa(String cmEmpresa) {
        this.cmEmpresa = cmEmpresa;
    }

    public String getCmCodigo() {
        return cmCodigo;
    }

    public void setCmCodigo(String cmCodigo) {
        this.cmCodigo = cmCodigo;
    }

    public String getCmDetalle() {
        return cmDetalle;
    }

    public void setCmDetalle(String cmDetalle) {
        this.cmDetalle = cmDetalle;
    }

    public Boolean getCmInactivo() {
        return cmInactivo;
    }

    public void setCmInactivo(Boolean cmInactivo) {
        this.cmInactivo = cmInactivo;
    }

    public String getTipCodigo() {
        return tipCodigo;
    }

    public void setTipCodigo(String tipCodigo) {
        this.tipCodigo = tipCodigo;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public Boolean getCmImb() {
        return cmImb;
    }

    public void setCmImb(Boolean cmImb) {
        this.cmImb = cmImb;
    }

    public Boolean getCmExigirLiquidacion() {
        return cmExigirLiquidacion;
    }

    public void setCmExigirLiquidacion(Boolean cmExigirLiquidacion) {
        this.cmExigirLiquidacion = cmExigirLiquidacion;
    }

    public Boolean getCmExigirImb() {
        return cmExigirImb;
    }

    public void setCmExigirImb(Boolean cmExigirImb) {
        this.cmExigirImb = cmExigirImb;
    }

    public Boolean getCmExigirOrdenCompra() {
        return cmExigirOrdenCompra;
    }

    public void setCmExigirOrdenCompra(Boolean cmExigirOrdenCompra) {
        this.cmExigirOrdenCompra = cmExigirOrdenCompra;
    }

}
