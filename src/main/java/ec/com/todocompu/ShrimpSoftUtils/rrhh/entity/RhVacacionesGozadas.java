/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author MarioRamos
 */
@Entity
@Table(name = "rh_vacaciones_gozadas", schema = "recursoshumanos")
public class RhVacacionesGozadas implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RhVacacionesGozadasPK rhVacacionesGozadasPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "vac_observaciones")
    private String vacObservaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vac_fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vacFecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vac_desde")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vacDesde;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vac_hasta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vacHasta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vac_gozadas_desde")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vacGozadasDesde;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vac_gozadas_hasta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vacGozadasHasta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vac_pendiente")
    private boolean vacPendiente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "vac_anulado")
    private boolean vacAnulado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "sec_empresa")
    private String secEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "sec_codigo")
    private String secCodigo;
    @Column(name = "con_empresa")
    private String conEmpresa;
    @Column(name = "con_periodo")
    private String conPeriodo;
    @Column(name = "con_tipo")
    private String conTipo;
    @Column(name = "con_numero")
    private String conNumero;
    @JoinColumns({
        @JoinColumn(name = "emp_empresa", referencedColumnName = "emp_empresa"),
        @JoinColumn(name = "emp_id", referencedColumnName = "emp_id")})
    @ManyToOne(optional = false)
    private RhEmpleado rhEmpleado;

    public RhVacacionesGozadas() {
    }

    public RhVacacionesGozadas(RhVacacionesGozadasPK rhVacacionesGozadasPK) {
        this.rhVacacionesGozadasPK = rhVacacionesGozadasPK;
    }

    public RhVacacionesGozadas(RhVacacionesGozadasPK rhVacacionesGozadasPK, Date vacDesde, Date vacHasta, boolean vacPendiente, String secEmpresa, String secCodigo,
            String conEmpresa, String conPeriodo, String conTipo, String conNumero) {
        this.rhVacacionesGozadasPK = rhVacacionesGozadasPK;
        this.vacDesde = vacDesde;
        this.vacHasta = vacHasta;
        this.vacPendiente = vacPendiente;
        this.secEmpresa = secEmpresa;
        this.secCodigo = secCodigo;
        this.conEmpresa = conEmpresa;
        this.conPeriodo = conPeriodo;
        this.conTipo = conTipo;
        this.conNumero = conNumero;
    }

    public RhVacacionesGozadas(String vacEmpresa, String vacNumero) {
        this.rhVacacionesGozadasPK = new RhVacacionesGozadasPK(vacEmpresa, vacNumero);
    }

    public RhVacacionesGozadasPK getRhVacacionesGozadasPK() {
        return rhVacacionesGozadasPK;
    }

    public void setRhVacacionesGozadasPK(RhVacacionesGozadasPK rhVacacionesGozadasPK) {
        this.rhVacacionesGozadasPK = rhVacacionesGozadasPK;
    }

    public Date getVacDesde() {
        return vacDesde;
    }

    public void setVacDesde(Date vacDesde) {
        this.vacDesde = vacDesde;
    }

    public Date getVacHasta() {
        return vacHasta;
    }

    public void setVacHasta(Date vacHasta) {
        this.vacHasta = vacHasta;
    }

    public Date getVacGozadasDesde() {
        return vacGozadasDesde;
    }

    public void setVacGozadasDesde(Date vacGozadasDesde) {
        this.vacGozadasDesde = vacGozadasDesde;
    }

    public Date getVacGozadasHasta() {
        return vacGozadasHasta;
    }

    public void setVacGozadasHasta(Date vacGozadasHasta) {
        this.vacGozadasHasta = vacGozadasHasta;
    }

    public boolean getVacPendiente() {
        return vacPendiente;
    }

    public void setVacPendiente(boolean vacPendiente) {
        this.vacPendiente = vacPendiente;
    }

    public String getSecEmpresa() {
        return secEmpresa;
    }

    public void setSecEmpresa(String secEmpresa) {
        this.secEmpresa = secEmpresa;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public RhEmpleado getRhEmpleado() {
        return rhEmpleado;
    }

    public String getConEmpresa() {
        return conEmpresa;
    }

    public void setConEmpresa(String conEmpresa) {
        this.conEmpresa = conEmpresa;
    }

    public String getConPeriodo() {
        return conPeriodo;
    }

    public void setConPeriodo(String conPeriodo) {
        this.conPeriodo = conPeriodo;
    }

    public String getConTipo() {
        return conTipo;
    }

    public void setConTipo(String conTipo) {
        this.conTipo = conTipo;
    }

    public String getConNumero() {
        return conNumero;
    }

    public void setConNumero(String conNumero) {
        this.conNumero = conNumero;
    }

    public void setRhEmpleado(RhEmpleado rhEmpleado) {
        this.rhEmpleado = rhEmpleado;
    }

    public Date getVacFecha() {
        return vacFecha;
    }

    public void setVacFecha(Date vacFecha) {
        this.vacFecha = vacFecha;
    }

    public String getVacObservaciones() {
        return vacObservaciones;
    }

    public void setVacObservaciones(String vacObservaciones) {
        this.vacObservaciones = vacObservaciones;
    }

    public boolean isVacAnulado() {
        return vacAnulado;
    }

    public void setVacAnulado(boolean vacAnulado) {
        this.vacAnulado = vacAnulado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rhVacacionesGozadasPK != null ? rhVacacionesGozadasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RhVacacionesGozadas)) {
            return false;
        }
        RhVacacionesGozadas other = (RhVacacionesGozadas) object;
        if ((this.rhVacacionesGozadasPK == null && other.rhVacacionesGozadasPK != null) || (this.rhVacacionesGozadasPK != null && !this.rhVacacionesGozadasPK.equals(other.rhVacacionesGozadasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhVacacionesGozadas[ rhVacacionesGozadasPK=" + rhVacacionesGozadasPK + " ]";
    }

}
