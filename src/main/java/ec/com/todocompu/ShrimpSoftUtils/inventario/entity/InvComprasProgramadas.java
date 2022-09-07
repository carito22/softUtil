/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author DEVELOPER
 */
@Entity
@Table(name = "inv_compras_programadas", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvComprasProgramadas.findAll", query = "SELECT i FROM InvComprasProgramadas i")})
public class InvComprasProgramadas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cp_secuencial")
    private Integer cpSecuencial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cp_desde")
    @Temporal(TemporalType.DATE)
    private Date cpDesde;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cp_hasta")
    @Temporal(TemporalType.DATE)
    private Date cpHasta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cp_lunes")
    private boolean cpLunes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cp_martes")
    private boolean cpMartes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cp_miercoles")
    private boolean cpMiercoles;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cp_jueves")
    private boolean cpJueves;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cp_viernes")
    private boolean cpViernes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cp_sabado")
    private boolean cpSabado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cp_domingo")
    private boolean cpDomingo;
    @Column(name = "cp_ultima_ejecucion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cpUltimaEjecucion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "cp_notificaciones")
    private String cpNotificaciones;
    @JoinColumns({
        @JoinColumn(name = "comp_empresa", referencedColumnName = "comp_empresa")
        , @JoinColumn(name = "comp_periodo", referencedColumnName = "comp_periodo")
        , @JoinColumn(name = "comp_motivo", referencedColumnName = "comp_motivo")
        , @JoinColumn(name = "comp_numero", referencedColumnName = "comp_numero")})
    @OneToOne(optional = false)
    private InvCompras invCompras;

    public InvComprasProgramadas() {
    }

    public InvComprasProgramadas(Integer cpSecuencial) {
        this.cpSecuencial = cpSecuencial;
    }

    public InvComprasProgramadas(Integer cpSecuencial, Date cpDesde, Date cpHasta, boolean cpLunes, boolean cpMartes, boolean cpMiercoles, boolean cpJueves, boolean cpViernes, boolean cpSabado, boolean cpDomingo, String cpNotificaciones) {
        this.cpSecuencial = cpSecuencial;
        this.cpDesde = cpDesde;
        this.cpHasta = cpHasta;
        this.cpLunes = cpLunes;
        this.cpMartes = cpMartes;
        this.cpMiercoles = cpMiercoles;
        this.cpJueves = cpJueves;
        this.cpViernes = cpViernes;
        this.cpSabado = cpSabado;
        this.cpDomingo = cpDomingo;
        this.cpNotificaciones = cpNotificaciones;
    }

    public Integer getCpSecuencial() {
        return cpSecuencial;
    }

    public void setCpSecuencial(Integer cpSecuencial) {
        this.cpSecuencial = cpSecuencial;
    }

    public Date getCpDesde() {
        return cpDesde;
    }

    public void setCpDesde(Date cpDesde) {
        this.cpDesde = cpDesde;
    }

    public Date getCpHasta() {
        return cpHasta;
    }

    public void setCpHasta(Date cpHasta) {
        this.cpHasta = cpHasta;
    }

    public boolean getCpLunes() {
        return cpLunes;
    }

    public void setCpLunes(boolean cpLunes) {
        this.cpLunes = cpLunes;
    }

    public boolean getCpMartes() {
        return cpMartes;
    }

    public void setCpMartes(boolean cpMartes) {
        this.cpMartes = cpMartes;
    }

    public boolean getCpMiercoles() {
        return cpMiercoles;
    }

    public void setCpMiercoles(boolean cpMiercoles) {
        this.cpMiercoles = cpMiercoles;
    }

    public boolean getCpJueves() {
        return cpJueves;
    }

    public void setCpJueves(boolean cpJueves) {
        this.cpJueves = cpJueves;
    }

    public boolean getCpViernes() {
        return cpViernes;
    }

    public void setCpViernes(boolean cpViernes) {
        this.cpViernes = cpViernes;
    }

    public boolean getCpSabado() {
        return cpSabado;
    }

    public void setCpSabado(boolean cpSabado) {
        this.cpSabado = cpSabado;
    }

    public boolean getCpDomingo() {
        return cpDomingo;
    }

    public void setCpDomingo(boolean cpDomingo) {
        this.cpDomingo = cpDomingo;
    }

    public Date getCpUltimaEjecucion() {
        return cpUltimaEjecucion;
    }

    public void setCpUltimaEjecucion(Date cpUltimaEjecucion) {
        this.cpUltimaEjecucion = cpUltimaEjecucion;
    }

    public String getCpNotificaciones() {
        return cpNotificaciones;
    }

    public void setCpNotificaciones(String cpNotificaciones) {
        this.cpNotificaciones = cpNotificaciones;
    }

    public InvCompras getInvCompras() {
        return invCompras;
    }

    public void setInvCompras(InvCompras invCompras) {
        this.invCompras = invCompras;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cpSecuencial != null ? cpSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvComprasProgramadas)) {
            return false;
        }
        InvComprasProgramadas other = (InvComprasProgramadas) object;
        if ((this.cpSecuencial == null && other.cpSecuencial != null) || (this.cpSecuencial != null && !this.cpSecuencial.equals(other.cpSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvComprasProgramadas[ cpSecuencial=" + cpSecuencial + " ]";
    }
    
}
