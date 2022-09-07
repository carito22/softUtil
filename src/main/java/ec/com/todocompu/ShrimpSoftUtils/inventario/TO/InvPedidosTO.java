/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author developer3
 */
@Entity
public class InvPedidosTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ped_numero")
    private String pedNumero;
    @Column(name = "ped_empresa")
    private String pedEmpresa;
    @Column(name = "ped_motivo")
    private String pedMotivo;
    @Column(name = "ped_fecha")
    private Date pedFecha;
    @Column(name = "ped_pendiente")
    private boolean pedPendiente;
    @Column(name = "ped_aprobado")
    private boolean pedAprobado;
    @Column(name = "ped_ejecutado")
    private boolean pedEjecutado;
    @Column(name = "ped_anulado")
    private boolean pedAnulado;
    @Column(name = "ped_monto_total")
    private BigDecimal pedMontoTotal;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_registra")
    private String usrRegistra;
    @Column(name = "usr_aprueba")
    private String usrAprueba;
    @Column(name = "usr_ejecuta")
    private String usrEjecuta;
    @Column(name = "usr_fecha_inserta")
    private Date usrFechaInserta;
    @Column(name = "usr_fecha_aprobada")
    private Date usrFechaAprobada;
    @Column(name = "ped_observaciones_registra")
    private String pedObservacionesRegistra;
    @Column(name = "ped_observaciones_aprueba")
    private String pedObservacionesAprueba;
    @Column(name = "ped_observaciones_ejecuta")
    private String pedObservacionesEjecuta;
    @Column(name = "aprobador_apellidos", insertable = false, updatable = false)
    private String aprobadorApellidos;
    @Column(name = "aprobador_nombres", insertable = false, updatable = false)
    private String aprobadoNombres;
    @Column(name = "ejecutor_apellidos", insertable = false, updatable = false)
    private String ejecutorApellidos;
    @Column(name = "ejecutor_nombres", insertable = false, updatable = false)
    private String ejecutorNombres;
    @Column(name = "registrador_nombres", insertable = false, updatable = false)
    private String registradorApellidos;
    @Column(name = "registrador_apellidos", insertable = false, updatable = false)
    private String registradorNombres;
    //Motivo
    @Column(name = "pm_detalle", insertable = false, updatable = false)
    private String pmDetalle;

    @Transient
    private List<InvPedidosDetalleTO> invPedidosDetalleListTO;
    private InvPedidosMotivoPK invPedidosMotivoPK;

    public InvPedidosTO() {
    }

    public String getPedNumero() {
        return pedNumero;
    }

    public void setPedNumero(String pedNumero) {
        this.pedNumero = pedNumero;
    }

    public String getPedEmpresa() {
        return pedEmpresa;
    }

    public void setPedEmpresa(String pedEmpresa) {
        this.pedEmpresa = pedEmpresa;
    }

    public String getPedMotivo() {
        return pedMotivo;
    }

    public void setPedMotivo(String pedMotivo) {
        this.pedMotivo = pedMotivo;
    }

    public Date getPedFecha() {
        return pedFecha;
    }

    public void setPedFecha(Date pedFecha) {
        this.pedFecha = pedFecha;
    }

    public boolean isPedPendiente() {
        return pedPendiente;
    }

    public void setPedPendiente(boolean pedPendiente) {
        this.pedPendiente = pedPendiente;
    }

    public boolean isPedAprobado() {
        return pedAprobado;
    }

    public void setPedAprobado(boolean pedAprobado) {
        this.pedAprobado = pedAprobado;
    }

    public boolean isPedEjecutado() {
        return pedEjecutado;
    }

    public void setPedEjecutado(boolean pedEjecutado) {
        this.pedEjecutado = pedEjecutado;
    }

    public boolean isPedAnulado() {
        return pedAnulado;
    }

    public void setPedAnulado(boolean pedAnulado) {
        this.pedAnulado = pedAnulado;
    }

    public BigDecimal getPedMontoTotal() {
        return pedMontoTotal;
    }

    public void setPedMontoTotal(BigDecimal pedMontoTotal) {
        this.pedMontoTotal = pedMontoTotal;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrRegistra() {
        return usrRegistra;
    }

    public void setUsrRegistra(String usrRegistra) {
        this.usrRegistra = usrRegistra;
    }

    public String getUsrAprueba() {
        return usrAprueba;
    }

    public void setUsrAprueba(String usrAprueba) {
        this.usrAprueba = usrAprueba;
    }

    public String getUsrEjecuta() {
        return usrEjecuta;
    }

    public void setUsrEjecuta(String usrEjecuta) {
        this.usrEjecuta = usrEjecuta;
    }

    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getPedObservacionesRegistra() {
        return pedObservacionesRegistra;
    }

    public void setPedObservacionesRegistra(String pedObservacionesRegistra) {
        this.pedObservacionesRegistra = pedObservacionesRegistra;
    }

    public String getPedObservacionesAprueba() {
        return pedObservacionesAprueba;
    }

    public void setPedObservacionesAprueba(String pedObservacionesAprueba) {
        this.pedObservacionesAprueba = pedObservacionesAprueba;
    }

    public String getPedObservacionesEjecuta() {
        return pedObservacionesEjecuta;
    }

    public void setPedObservacionesEjecuta(String pedObservacionesEjecuta) {
        this.pedObservacionesEjecuta = pedObservacionesEjecuta;
    }

    public List<InvPedidosDetalleTO> getInvPedidosDetalleListTO() {
        return invPedidosDetalleListTO;
    }

    public void setInvPedidosDetalleListTO(List<InvPedidosDetalleTO> invPedidosDetalleListTO) {
        this.invPedidosDetalleListTO = invPedidosDetalleListTO;
    }

    public InvPedidosMotivoPK getInvPedidosMotivoPK() {
        return invPedidosMotivoPK;
    }

    public void setInvPedidosMotivoPK(InvPedidosMotivoPK invPedidosMotivoPK) {
        this.invPedidosMotivoPK = invPedidosMotivoPK;
    }

    public String getPmDetalle() {
        return pmDetalle;
    }

    public void setPmDetalle(String pmDetalle) {
        this.pmDetalle = pmDetalle;
    }

    public String getAprobadorApellidos() {
        return aprobadorApellidos;
    }

    public void setAprobadorApellidos(String aprobadorApellidos) {
        this.aprobadorApellidos = aprobadorApellidos;
    }

    public String getAprobadoNombres() {
        return aprobadoNombres;
    }

    public void setAprobadoNombres(String aprobadoNombres) {
        this.aprobadoNombres = aprobadoNombres;
    }

    public String getEjecutorApellidos() {
        return ejecutorApellidos;
    }

    public void setEjecutorApellidos(String ejecutorApellidos) {
        this.ejecutorApellidos = ejecutorApellidos;
    }

    public String getEjecutorNombres() {
        return ejecutorNombres;
    }

    public void setEjecutorNombres(String ejecutorNombres) {
        this.ejecutorNombres = ejecutorNombres;
    }

    public String getRegistradorApellidos() {
        return registradorApellidos;
    }

    public void setRegistradorApellidos(String registradorApellidos) {
        this.registradorApellidos = registradorApellidos;
    }

    public String getRegistradorNombres() {
        return registradorNombres;
    }

    public void setRegistradorNombres(String registradorNombres) {
        this.registradorNombres = registradorNombres;
    }
    
    public Date getUsrFechaAprobada() {
        return usrFechaAprobada;
    }

    public void setUsrFechaAprobada(Date usrFechaAprobada) {
        this.usrFechaAprobada = usrFechaAprobada;
    }

}
