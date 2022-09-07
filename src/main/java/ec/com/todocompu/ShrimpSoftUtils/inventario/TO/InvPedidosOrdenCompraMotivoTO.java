/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.io.Serializable;

/**
 *
 * @author Developer4
 */
public class InvPedidosOrdenCompraMotivoTO implements Serializable {

    private String ocmEmpresa;
    private String ocmSector;
    private String ocmCodigo;
    private String ocmDetalle;
    private boolean ocmNotificarProveedor;
    private boolean ocmNotificarAprobador;
    private Boolean ocmCostoFijo;
    private Boolean ocmAprobacionAutomatica;
    private Boolean ocmInactivo;
    private int idNotificaciones;

    public InvPedidosOrdenCompraMotivoTO() {

    }

    public InvPedidosOrdenCompraMotivoTO(String ocmEmpresa, String ocmSector, String ocmCodigo, String ocmDetalle, boolean ocmNotificarProveedor, boolean ocmNotificarAprobador, Boolean ocmCostoFijo, Boolean ocmAprobacionAutomatica) {
        this.ocmEmpresa = ocmEmpresa;
        this.ocmSector = ocmSector;
        this.ocmCodigo = ocmCodigo;
        this.ocmDetalle = ocmDetalle;
        this.ocmNotificarProveedor = ocmNotificarProveedor;
        this.ocmNotificarAprobador = ocmNotificarAprobador;
        this.ocmCostoFijo = ocmCostoFijo;
        this.ocmAprobacionAutomatica = ocmAprobacionAutomatica;
    }

    public String getOcmEmpresa() {
        return ocmEmpresa;
    }

    public void setOcmEmpresa(String ocmEmpresa) {
        this.ocmEmpresa = ocmEmpresa;
    }

    public String getOcmSector() {
        return ocmSector;
    }

    public void setOcmSector(String ocmSector) {
        this.ocmSector = ocmSector;
    }

    public String getOcmCodigo() {
        return ocmCodigo;
    }

    public void setOcmCodigo(String ocmCodigo) {
        this.ocmCodigo = ocmCodigo;
    }

    public String getOcmDetalle() {
        return ocmDetalle;
    }

    public void setOcmDetalle(String ocmDetalle) {
        this.ocmDetalle = ocmDetalle;
    }

    public boolean isOcmNotificarProveedor() {
        return ocmNotificarProveedor;
    }

    public void setOcmNotificarProveedor(boolean ocmNotificarProveedor) {
        this.ocmNotificarProveedor = ocmNotificarProveedor;
    }

    public Boolean getOcmCostoFijo() {
        return ocmCostoFijo;
    }

    public void setOcmCostoFijo(Boolean ocmCostoFijo) {
        this.ocmCostoFijo = ocmCostoFijo;
    }

    public Boolean getOcmAprobacionAutomatica() {
        return ocmAprobacionAutomatica;
    }

    public void setOcmAprobacionAutomatica(Boolean ocmAprobacionAutomatica) {
        this.ocmAprobacionAutomatica = ocmAprobacionAutomatica;
    }

    public boolean isOcmNotificarAprobador() {
        return ocmNotificarAprobador;
    }

    public void setOcmNotificarAprobador(boolean ocmNotificarAprobador) {
        this.ocmNotificarAprobador = ocmNotificarAprobador;
    }

    public Boolean getOcmInactivo() {
        return ocmInactivo;
    }

    public void setOcmInactivo(Boolean ocmInactivo) {
        this.ocmInactivo = ocmInactivo;
    }

    public int getIdNotificaciones() {
        return idNotificaciones;
    }

    public void setIdNotificaciones(int idNotificaciones) {
        this.idNotificaciones = idNotificaciones;
    }

}
