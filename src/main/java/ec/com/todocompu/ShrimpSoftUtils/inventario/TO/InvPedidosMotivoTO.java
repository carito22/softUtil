/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosMotivo;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author developer3
 */
public class InvPedidosMotivoTO implements Serializable {

    private String pmEmpresa;
    private String pmCodigo;
    private String pmSector;
    private String pmDetalle;
    private boolean pmLunes;
    private boolean pmMartes;
    private boolean pmMiercoles;
    private boolean pmJueves;
    private boolean pmViernes;
    private boolean pmSabado;
    private boolean pmDomingo;
    private Time pmHoraInicio;
    private Time pmHoraFin;
    private boolean pmInactivo;
    private String usrCodigo;
    private Date usrFechaInserta;
    private boolean pmAprobacionAutomatica;
    private boolean pmNotificarProveedor;
    private boolean pmNotificarAprobador;
    private boolean pmNotificarRegistrador;
    private boolean pmNotificarEjecutor;
    private int idNotificaciones;
    private boolean pmCambiarFecha;
    private boolean pmExigirCliente;

    public InvPedidosMotivoTO() {
        pmLunes = true;
        pmMartes = true;
        pmMiercoles = true;
        pmJueves = true;
        pmViernes = true;
        pmSabado = true;
        pmDomingo = true;
        pmInactivo = false;
        pmAprobacionAutomatica = false;
        pmExigirCliente = false;
        pmNotificarProveedor = false;
        pmNotificarAprobador = false;
        pmNotificarRegistrador = false;
        pmNotificarEjecutor = false;
    }

    public String getPmEmpresa() {
        return pmEmpresa;
    }

    public void setPmEmpresa(String pmEmpresa) {
        this.pmEmpresa = pmEmpresa;
    }

    public String getPmCodigo() {
        return pmCodigo;
    }

    public void setPmCodigo(String pmCodigo) {
        this.pmCodigo = pmCodigo;
    }

    public String getPmDetalle() {
        return pmDetalle;
    }

    public void setPmDetalle(String pmDetalle) {
        this.pmDetalle = pmDetalle;
    }

    public boolean isPmLunes() {
        return pmLunes;
    }

    public void setPmLunes(boolean pmLunes) {
        this.pmLunes = pmLunes;
    }

    public boolean isPmMartes() {
        return pmMartes;
    }

    public void setPmMartes(boolean pmMartes) {
        this.pmMartes = pmMartes;
    }

    public boolean isPmMiercoles() {
        return pmMiercoles;
    }

    public void setPmMiercoles(boolean pmMiercoles) {
        this.pmMiercoles = pmMiercoles;
    }

    public boolean isPmJueves() {
        return pmJueves;
    }

    public void setPmJueves(boolean pmJueves) {
        this.pmJueves = pmJueves;
    }

    public boolean isPmViernes() {
        return pmViernes;
    }

    public void setPmViernes(boolean pmViernes) {
        this.pmViernes = pmViernes;
    }

    public boolean isPmSabado() {
        return pmSabado;
    }

    public void setPmSabado(boolean pmSabado) {
        this.pmSabado = pmSabado;
    }

    public boolean isPmDomingo() {
        return pmDomingo;
    }

    public void setPmDomingo(boolean pmDomingo) {
        this.pmDomingo = pmDomingo;
    }

    public Time getPmHoraInicio() {
        return pmHoraInicio;
    }

    public void setPmHoraInicio(Time pmHoraInicio) {
        this.pmHoraInicio = pmHoraInicio;
    }

    public Time getPmHoraFin() {
        return pmHoraFin;
    }

    public void setPmHoraFin(Time pmHoraFin) {
        this.pmHoraFin = pmHoraFin;
    }

    public boolean isPmInactivo() {
        return pmInactivo;
    }

    public void setPmInactivo(boolean pmInactivo) {
        this.pmInactivo = pmInactivo;
    }

    public String getPmSector() {
        return pmSector;
    }

    public void setPmSector(String pmSector) {
        this.pmSector = pmSector;
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

    public boolean isPmAprobacionAutomatica() {
        return pmAprobacionAutomatica;
    }

    public void setPmAprobacionAutomatica(boolean pmAprobacionAutomatica) {
        this.pmAprobacionAutomatica = pmAprobacionAutomatica;
    }

    public boolean isPmExigirCliente() {
        return pmExigirCliente;
    }

    public void setPmExigirCliente(boolean pmExigirCliente) {
        this.pmExigirCliente = pmExigirCliente;
    }

    public boolean isPmNotificarProveedor() {
        return pmNotificarProveedor;
    }

    public void setPmNotificarProveedor(boolean pmNotificarProveedor) {
        this.pmNotificarProveedor = pmNotificarProveedor;
    }

    public boolean isPmNotificarAprobador() {
        return pmNotificarAprobador;
    }

    public void setPmNotificarAprobador(boolean pmNotificarAprobador) {
        this.pmNotificarAprobador = pmNotificarAprobador;
    }

    public boolean isPmNotificarRegistrador() {
        return pmNotificarRegistrador;
    }

    public void setPmNotificarRegistrador(boolean pmNotificarRegistrador) {
        this.pmNotificarRegistrador = pmNotificarRegistrador;
    }

    public boolean isPmNotificarEjecutor() {
        return pmNotificarEjecutor;
    }

    public void setPmNotificarEjecutor(boolean pmNotificarEjecutor) {
        this.pmNotificarEjecutor = pmNotificarEjecutor;
    }

    public int getIdNotificaciones() {
        return idNotificaciones;
    }

    public void setIdNotificaciones(int idNotificaciones) {
        this.idNotificaciones = idNotificaciones;
    }

    public boolean isPmCambiarFecha() {
        return pmCambiarFecha;
    }

    public void setPmCambiarFecha(boolean pmCambiarFecha) {
        this.pmCambiarFecha = pmCambiarFecha;
    }

    public void convertirObjeto(InvPedidosMotivo invPedidosMotivo) {
        if (invPedidosMotivo != null) {
            this.pmCodigo = invPedidosMotivo.getInvPedidosMotivoPK().getPmCodigo();
            this.pmEmpresa = invPedidosMotivo.getInvPedidosMotivoPK().getPmEmpresa();
            this.pmDetalle = invPedidosMotivo.getPmDetalle();
            this.pmLunes = invPedidosMotivo.getPmLunes();
            this.pmMartes = invPedidosMotivo.getPmMartes();
            this.pmMiercoles = invPedidosMotivo.getPmMiercoles();
            this.pmJueves = invPedidosMotivo.getPmJueves();
            this.pmViernes = invPedidosMotivo.getPmViernes();
            this.pmSabado = invPedidosMotivo.getPmSabado();
            this.pmDomingo = invPedidosMotivo.getPmDomingo();
            this.pmHoraInicio = invPedidosMotivo.getPmHoraInicio();
            this.pmHoraFin = invPedidosMotivo.getPmHoraFin();
            this.pmInactivo = invPedidosMotivo.getPmInactivo();
            this.usrCodigo = invPedidosMotivo.getUsrCodigo();
            this.pmSector = invPedidosMotivo.getInvPedidosMotivoPK().getPmSector();
            this.usrFechaInserta = invPedidosMotivo.getUsrFechaInserta();
            this.pmAprobacionAutomatica = invPedidosMotivo.getPmAprobacionAutomatica();
            this.pmExigirCliente = invPedidosMotivo.getPmExigirCliente();
            this.pmNotificarAprobador = invPedidosMotivo.isPmNotificarAprobador();
            this.pmNotificarRegistrador = invPedidosMotivo.isPmNotificarRegistrador();
            this.pmNotificarEjecutor = invPedidosMotivo.isPmNotificarEjecutor();
            this.pmCambiarFecha = invPedidosMotivo.isPmCambiarFecha();
            this.idNotificaciones = (invPedidosMotivo.getIdNotificaciones() != null ? invPedidosMotivo.getIdNotificaciones().getId() : 0);
        }
    }

}
