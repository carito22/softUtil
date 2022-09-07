/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Developer4
 */
@Entity
public class InvPedidosOrdenCompraTO implements Serializable {

    @Id
    private Integer index;
    private String ocEmpresa;
    private String ocSector;
    private String ocMotivo;
    private String ocNumero;
    private Date ocFecha;
    private boolean ocAnulado;
    private boolean ocAprobada;
    private boolean ocPendiente;
    private boolean ocCerrada;
    private BigDecimal ocMontoTotal;
    private String provRazonSocial;
    private String provCodigo;
    private String ocmDetalle;
    private String provEmailOrdenCompra;
    private String usrAprueba;
    private String usrCodigo;
    private boolean ocmNotificarProveedor;
    private boolean ocPuedeAprobar;
    private boolean ocPuedeModificar;
    private boolean ocAprobacionAutomatica;
    private int idNotificaciones;
    private String ordenPedido;
    private String registrador;
    private String emailRegistrador;
    private BigDecimal ocBase0;
    private BigDecimal ocBaseImponible;
    private BigDecimal ocMontoIva;
    private BigDecimal ocIvaVigente;

    public InvPedidosOrdenCompraTO() {
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getOcEmpresa() {
        return ocEmpresa;
    }

    public void setOcEmpresa(String ocEmpresa) {
        this.ocEmpresa = ocEmpresa;
    }

    public String getOcSector() {
        return ocSector;
    }

    public void setOcSector(String ocSector) {
        this.ocSector = ocSector;
    }

    public String getOcMotivo() {
        return ocMotivo;
    }

    public void setOcMotivo(String ocMotivo) {
        this.ocMotivo = ocMotivo;
    }

    public String getOcNumero() {
        return ocNumero;
    }

    public void setOcNumero(String ocNumero) {
        this.ocNumero = ocNumero;
    }

    public Date getOcFecha() {
        return ocFecha;
    }

    public void setOcFecha(Date ocFecha) {
        this.ocFecha = ocFecha;
    }

    public boolean isOcAnulado() {
        return ocAnulado;
    }

    public void setOcAnulado(boolean ocAnulado) {
        this.ocAnulado = ocAnulado;
    }

    public BigDecimal getOcMontoTotal() {
        return ocMontoTotal;
    }

    public void setOcMontoTotal(BigDecimal ocMontoTotal) {
        this.ocMontoTotal = ocMontoTotal;
    }

    public String getProvRazonSocial() {
        return provRazonSocial;
    }

    public void setProvRazonSocial(String provRazonSocial) {
        this.provRazonSocial = provRazonSocial;
    }

    public String getProvCodigo() {
        return provCodigo;
    }

    public void setProvCodigo(String provCodigo) {
        this.provCodigo = provCodigo;
    }

    public String getOcmDetalle() {
        return ocmDetalle;
    }

    public void setOcmDetalle(String ocmDetalle) {
        this.ocmDetalle = ocmDetalle;
    }

    public String getProvEmailOrdenCompra() {
        return provEmailOrdenCompra;
    }

    public void setProvEmailOrdenCompra(String provEmailOrdenCompra) {
        this.provEmailOrdenCompra = provEmailOrdenCompra;
    }

    public boolean isOcmNotificarProveedor() {
        return ocmNotificarProveedor;
    }

    public void setOcmNotificarProveedor(boolean ocmNotificarProveedor) {
        this.ocmNotificarProveedor = ocmNotificarProveedor;
    }

    public boolean isOcAprobada() {
        return ocAprobada;
    }

    public void setOcAprobada(boolean ocAprobada) {
        this.ocAprobada = ocAprobada;
    }

    public boolean isOcPuedeAprobar() {
        return ocPuedeAprobar;
    }

    public void setOcPuedeAprobar(boolean ocPuedeAprobar) {
        this.ocPuedeAprobar = ocPuedeAprobar;
    }

    public String getUsrAprueba() {
        return usrAprueba;
    }

    public void setUsrAprueba(String usrAprueba) {
        this.usrAprueba = usrAprueba;
    }

    public boolean isOcPendiente() {
        return ocPendiente;
    }

    public void setOcPendiente(boolean ocPendiente) {
        this.ocPendiente = ocPendiente;
    }

    public boolean isOcCerrada() {
        return ocCerrada;
    }

    public void setOcCerrada(boolean ocCerrada) {
        this.ocCerrada = ocCerrada;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public boolean isOcAprobacionAutomatica() {
        return ocAprobacionAutomatica;
    }

    public void setOcAprobacionAutomatica(boolean ocAprobacionAutomatica) {
        this.ocAprobacionAutomatica = ocAprobacionAutomatica;
    }

    public boolean isOcPuedeModificar() {
        return ocPuedeModificar;
    }

    public void setOcPuedeModificar(boolean ocPuedeModificar) {
        this.ocPuedeModificar = ocPuedeModificar;
    }

    public int getIdNotificaciones() {
        return idNotificaciones;
    }

    public void setIdNotificaciones(int idNotificaciones) {
        this.idNotificaciones = idNotificaciones;
    }

    public String getOrdenPedido() {
        return ordenPedido;
    }

    public void setOrdenPedido(String ordenPedido) {
        this.ordenPedido = ordenPedido;
    }

    public BigDecimal getOcBase0() {
        return ocBase0;
    }

    public void setOcBase0(BigDecimal ocBase0) {
        this.ocBase0 = ocBase0;
    }

    public BigDecimal getOcBaseImponible() {
        return ocBaseImponible;
    }

    public void setOcBaseImponible(BigDecimal ocBaseImponible) {
        this.ocBaseImponible = ocBaseImponible;
    }

    public BigDecimal getOcMontoIva() {
        return ocMontoIva;
    }

    public void setOcMontoIva(BigDecimal ocMontoIva) {
        this.ocMontoIva = ocMontoIva;
    }

    public BigDecimal getOcIvaVigente() {
        return ocIvaVigente;
    }

    public void setOcIvaVigente(BigDecimal ocIvaVigente) {
        this.ocIvaVigente = ocIvaVigente;
    }

    public String getRegistrador() {
        return registrador;
    }

    public void setRegistrador(String registrador) {
        this.registrador = registrador;
    }

    public String getEmailRegistrador() {
        return emailRegistrador;
    }

    public void setEmailRegistrador(String emailRegistrador) {
        this.emailRegistrador = emailRegistrador;
    }

}
