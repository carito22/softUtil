/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import ec.com.todocompu.ShrimpSoftUtils.inventario.TO.InvPedidosMotivoTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdSector;
import ec.com.todocompu.ShrimpSoftUtils.sistema.entity.SisEmpresaNotificaciones;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.JoinColumnOrFormula;
import org.hibernate.annotations.JoinColumnsOrFormulas;
import org.hibernate.annotations.JoinFormula;

/**
 *
 * @author Developer0
 */
@Entity
@Table(name = "inv_pedidos_motivo", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvPedidosMotivo.findAll", query = "SELECT i FROM InvPedidosMotivo i")})
public class InvPedidosMotivo implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "pm_aprobacion_automatica")
    private boolean pmAprobacionAutomatica;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pm_exigir_cliente")
    private boolean pmExigirCliente;
    @Column(name = "pm_cambiar_fecha")
    private boolean pmCambiarFecha;
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InvPedidosMotivoPK invPedidosMotivoPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "pm_detalle")
    private String pmDetalle;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pm_lunes")
    private boolean pmLunes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pm_martes")
    private boolean pmMartes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pm_miercoles")
    private boolean pmMiercoles;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pm_jueves")
    private boolean pmJueves;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pm_viernes")
    private boolean pmViernes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pm_sabado")
    private boolean pmSabado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pm_domingo")
    private boolean pmDomingo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pm_hora_inicio")
    private Time pmHoraInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pm_hora_fin")
    private Time pmHoraFin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pm_plazo_predeterminado")
    private int pmPlazoPredeterminado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pm_notificar_proveedor")
    private boolean pmNotificarProveedor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pm_notificar_aprobador")
    private boolean pmNotificarAprobador;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pm_notificar_registrador")
    private boolean pmNotificarRegistrador;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pm_notificar_ejecutor")
    private boolean pmNotificarEjecutor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "pm_inactivo")
    private boolean pmInactivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @JoinColumnsOrFormulas(value = {
        @JoinColumnOrFormula(formula = @JoinFormula(value = "pm_empresa", referencedColumnName = "sec_empresa"))
        , @JoinColumnOrFormula(formula = @JoinFormula(value = "pm_sector", referencedColumnName = "sec_codigo"))
    })
    @ManyToOne(optional = false)
    private PrdSector prdSector;
    @JoinColumnsOrFormulas(value = {
        @JoinColumnOrFormula(formula = @JoinFormula(value = "pm_empresa", referencedColumnName = "cat_empresa"))
        , @JoinColumnOrFormula(column = @JoinColumn(name = "pm_categoria_item_permitida", referencedColumnName = "cat_codigo"))
    })
    @ManyToOne(optional = false)
    private InvProductoCategoria invProductoCategoria;
    @JoinColumn(name = "id_notificaciones", referencedColumnName = "id")
    @ManyToOne(optional = true)
    private SisEmpresaNotificaciones idNotificaciones;

    public InvPedidosMotivo() {
    }

    public InvPedidosMotivo(InvPedidosMotivoPK invPedidosMotivoPK) {
        this.invPedidosMotivoPK = invPedidosMotivoPK;
    }

    public InvPedidosMotivo(boolean pmAprobacionAutomatica, boolean pmExigirCliente, InvPedidosMotivoPK invPedidosMotivoPK, String pmDetalle, boolean pmLunes, boolean pmMartes, boolean pmMiercoles, boolean pmJueves, boolean pmViernes, boolean pmSabado, boolean pmDomingo, Time pmHoraInicio, Time pmHoraFin, int pmPlazoPredeterminado, boolean pmNotificarProveedor, boolean pmNotificarAprobador, boolean pmNotificarRegistrador, boolean pmNotificarEjecutor, boolean pmInactivo, String usrCodigo, Date usrFechaInserta, PrdSector prdSector, InvProductoCategoria invProductoCategoria) {
        this.pmAprobacionAutomatica = pmAprobacionAutomatica;
        this.pmExigirCliente = pmExigirCliente;
        this.invPedidosMotivoPK = invPedidosMotivoPK;
        this.pmDetalle = pmDetalle;
        this.pmLunes = pmLunes;
        this.pmMartes = pmMartes;
        this.pmMiercoles = pmMiercoles;
        this.pmJueves = pmJueves;
        this.pmViernes = pmViernes;
        this.pmSabado = pmSabado;
        this.pmDomingo = pmDomingo;
        this.pmHoraInicio = pmHoraInicio;
        this.pmHoraFin = pmHoraFin;
        this.pmPlazoPredeterminado = pmPlazoPredeterminado;
        this.pmNotificarProveedor = pmNotificarProveedor;
        this.pmNotificarAprobador = pmNotificarAprobador;
        this.pmNotificarRegistrador = pmNotificarRegistrador;
        this.pmNotificarEjecutor = pmNotificarEjecutor;
        this.pmInactivo = pmInactivo;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.prdSector = prdSector;
        this.invProductoCategoria = invProductoCategoria;
    }

    public InvPedidosMotivo(String pmEmpresa, String pmSector, String pmCodigo) {
        this.invPedidosMotivoPK = new InvPedidosMotivoPK(pmEmpresa, pmSector, pmCodigo);
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

    public boolean getPmLunes() {
        return pmLunes;
    }

    public void setPmLunes(boolean pmLunes) {
        this.pmLunes = pmLunes;
    }

    public boolean getPmMartes() {
        return pmMartes;
    }

    public void setPmMartes(boolean pmMartes) {
        this.pmMartes = pmMartes;
    }

    public boolean getPmMiercoles() {
        return pmMiercoles;
    }

    public void setPmMiercoles(boolean pmMiercoles) {
        this.pmMiercoles = pmMiercoles;
    }

    public boolean getPmJueves() {
        return pmJueves;
    }

    public void setPmJueves(boolean pmJueves) {
        this.pmJueves = pmJueves;
    }

    public boolean getPmViernes() {
        return pmViernes;
    }

    public void setPmViernes(boolean pmViernes) {
        this.pmViernes = pmViernes;
    }

    public boolean getPmSabado() {
        return pmSabado;
    }

    public void setPmSabado(boolean pmSabado) {
        this.pmSabado = pmSabado;
    }

    public boolean getPmDomingo() {
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

    public boolean getPmInactivo() {
        return pmInactivo;
    }

    public void setPmInactivo(boolean pmInactivo) {
        this.pmInactivo = pmInactivo;
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

    public InvProductoCategoria getInvProductoCategoria() {
        return invProductoCategoria;
    }

    public void setInvProductoCategoria(InvProductoCategoria invProductoCategoria) {
        this.invProductoCategoria = invProductoCategoria;
    }

    public PrdSector getPrdSector() {
        return prdSector;
    }

    public void setPrdSector(PrdSector prdSector) {
        this.prdSector = prdSector;
    }

    public boolean isPmCambiarFecha() {
        return pmCambiarFecha;
    }

    public void setPmCambiarFecha(boolean pmCambiarFecha) {
        this.pmCambiarFecha = pmCambiarFecha;
    }

    public void convertirObjeto(InvPedidosMotivoTO invPedidosMotivoTO) {
        this.invPedidosMotivoPK = new InvPedidosMotivoPK(invPedidosMotivoTO.getPmEmpresa(), null, invPedidosMotivoTO.getPmCodigo());
        this.pmDetalle = invPedidosMotivoTO.getPmDetalle();
        this.pmLunes = invPedidosMotivoTO.isPmLunes();
        this.pmMartes = invPedidosMotivoTO.isPmMartes();
        this.pmMiercoles = invPedidosMotivoTO.isPmMiercoles();
        this.pmJueves = invPedidosMotivoTO.isPmJueves();
        this.pmViernes = invPedidosMotivoTO.isPmViernes();
        this.pmSabado = invPedidosMotivoTO.isPmSabado();
        this.pmDomingo = invPedidosMotivoTO.isPmDomingo();
        this.pmHoraInicio = invPedidosMotivoTO.getPmHoraInicio();
        this.pmHoraFin = invPedidosMotivoTO.getPmHoraFin();
        this.pmInactivo = invPedidosMotivoTO.isPmInactivo();
        this.usrCodigo = invPedidosMotivoTO.getUsrCodigo();
        this.usrFechaInserta = invPedidosMotivoTO.getUsrFechaInserta();
        this.pmCambiarFecha = invPedidosMotivoTO.isPmCambiarFecha();
        this.idNotificaciones = invPedidosMotivoTO.getIdNotificaciones() > 0 ? new SisEmpresaNotificaciones(invPedidosMotivoTO.getIdNotificaciones()) : null;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (invPedidosMotivoPK != null ? invPedidosMotivoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvPedidosMotivo)) {
            return false;
        }
        InvPedidosMotivo other = (InvPedidosMotivo) object;
        if ((this.invPedidosMotivoPK == null && other.invPedidosMotivoPK != null) || (this.invPedidosMotivoPK != null && !this.invPedidosMotivoPK.equals(other.invPedidosMotivoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosMotivo[ invPedidosMotivoPK=" + invPedidosMotivoPK + " ]";
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

    public boolean getPmNotificarProveedor() {
        return pmNotificarProveedor;
    }

    public void setPmNotificarProveedor(boolean pmNotificarProveedor) {
        this.pmNotificarProveedor = pmNotificarProveedor;
    }

    public int getPmPlazoPredeterminado() {
        return pmPlazoPredeterminado;
    }

    public void setPmPlazoPredeterminado(int pmPlazoPredeterminado) {
        this.pmPlazoPredeterminado = pmPlazoPredeterminado;
    }

    public boolean getPmAprobacionAutomatica() {
        return pmAprobacionAutomatica;
    }

    public void setPmAprobacionAutomatica(boolean pmAprobacionAutomatica) {
        this.pmAprobacionAutomatica = pmAprobacionAutomatica;
    }

    public boolean getPmExigirCliente() {
        return pmExigirCliente;
    }

    public void setPmExigirCliente(boolean pmExigirCliente) {
        this.pmExigirCliente = pmExigirCliente;
    }

    public SisEmpresaNotificaciones getIdNotificaciones() {
        return idNotificaciones;
    }

    public void setIdNotificaciones(SisEmpresaNotificaciones idNotificaciones) {
        this.idNotificaciones = idNotificaciones;
    }

}
