/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.quartz.TO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author krlos1206
 */
@Entity
public class InvComprasProgramadasTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cp_secuencial")
    private Integer cpSecuencial;

    @Column(name = "cp_desde")
    private Date cpDesde;

    @Column(name = "cp_hasta")
    private Date cpHasta;

    @Column(name = "cp_lunes")
    private Boolean cpLunes;

    @Column(name = "cp_martes")
    private Boolean cpMartes;
    @Column(name = "cp_miercoles")
    private Boolean cpMiercoles;
    @Column(name = "cp_jueves")
    private Boolean cpJueves;
    @Column(name = "cp_viernes")
    private Boolean cpViernes;
    @Column(name = "cp_sabado")
    private Boolean cpSabado;
    @Column(name = "cp_domingo")
    private Boolean cpDomingo;

    @Column(name = "cp_ultima_ejecucion")
    private Timestamp cpUltimaEjecucion;

    @Column(name = "cp_notificaciones")
    private String cpNotificaciones;

    @Column(name = "comp_empresa")
    private String compEmpresa;

    @Column(name = "comp_periodo")
    private String compPeriodo;

    @Column(name = "comp_motivo")
    private String compMotivo;

    @Column(name = "comp_numero")
    private String compNumero;
    @Column(name = "comp_observaciones")
    private String compObservaciones;
    @Column(name = "comp_total")
    private BigDecimal compTotal;

    public InvComprasProgramadasTO() {
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

    public Boolean getCpLunes() {
        return cpLunes;
    }

    public void setCpLunes(Boolean cpLunes) {
        this.cpLunes = cpLunes;
    }

    public Boolean getCpMartes() {
        return cpMartes;
    }

    public void setCpMartes(Boolean cpMartes) {
        this.cpMartes = cpMartes;
    }

    public Boolean getCpMiercoles() {
        return cpMiercoles;
    }

    public void setCpMiercoles(Boolean cpMiercoles) {
        this.cpMiercoles = cpMiercoles;
    }

    public Boolean getCpJueves() {
        return cpJueves;
    }

    public void setCpJueves(Boolean cpJueves) {
        this.cpJueves = cpJueves;
    }

    public Boolean getCpViernes() {
        return cpViernes;
    }

    public void setCpViernes(Boolean cpViernes) {
        this.cpViernes = cpViernes;
    }

    public Boolean getCpSabado() {
        return cpSabado;
    }

    public void setCpSabado(Boolean cpSabado) {
        this.cpSabado = cpSabado;
    }

    public Boolean getCpDomingo() {
        return cpDomingo;
    }

    public void setCpDomingo(Boolean cpDomingo) {
        this.cpDomingo = cpDomingo;
    }

    public Timestamp getCpUltimaEjecucion() {
        return cpUltimaEjecucion;
    }

    public void setCpUltimaEjecucion(Timestamp cpUltimaEjecucion) {
        this.cpUltimaEjecucion = cpUltimaEjecucion;
    }

    public String getCpNotificaciones() {
        return cpNotificaciones;
    }

    public void setCpNotificaciones(String cpNotificaciones) {
        this.cpNotificaciones = cpNotificaciones;
    }

    public String getCompEmpresa() {
        return compEmpresa;
    }

    public void setCompEmpresa(String compEmpresa) {
        this.compEmpresa = compEmpresa;
    }

    public String getCompPeriodo() {
        return compPeriodo;
    }

    public void setCompPeriodo(String compPeriodo) {
        this.compPeriodo = compPeriodo;
    }

    public String getCompMotivo() {
        return compMotivo;
    }

    public void setCompMotivo(String compMotivo) {
        this.compMotivo = compMotivo;
    }

    public String getCompNumero() {
        return compNumero;
    }

    public void setCompNumero(String compNumero) {
        this.compNumero = compNumero;
    }

    public String getCompObservaciones() {
        return compObservaciones;
    }

    public void setCompObservaciones(String compObservaciones) {
        this.compObservaciones = compObservaciones;
    }

    public BigDecimal getCompTotal() {
        return compTotal;
    }

    public void setCompTotal(BigDecimal compTotal) {
        this.compTotal = compTotal;
    }

}
