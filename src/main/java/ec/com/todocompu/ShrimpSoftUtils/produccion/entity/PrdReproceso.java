/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvBodega;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Trabajo
 */
@Entity
@Table(name = "prd_reproceso", schema = "produccion")
public class PrdReproceso implements Serializable {

    @EmbeddedId
    private PrdReprocesoPK prdReprocesoPK;
    @Column(name = "rep_fecha")
    private Date repFecha;
    @Column(name = "rep_observaciones")
    private String repObservaciones;
    @Column(name = "rep_pendiente")
    private boolean repPendiente;
    @Column(name = "rep_anulado")
    private boolean repAnulado;
    @JoinColumns({
        @JoinColumn(name = "bod_empresa", referencedColumnName = "bod_empresa")
        , @JoinColumn(name = "bod_codigo", referencedColumnName = "bod_codigo")})
    @ManyToOne
    private InvBodega invBodega;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    private Timestamp usrFechaInserta;

    public PrdReproceso() {
    }

    public PrdReprocesoPK getPrdReprocesoPK() {
        return prdReprocesoPK;
    }

    public void setPrdReprocesoPK(PrdReprocesoPK prdReprocesoPK) {
        this.prdReprocesoPK = prdReprocesoPK;
    }

    public Date getRepFecha() {
        return repFecha;
    }

    public void setRepFecha(Date repFecha) {
        this.repFecha = repFecha;
    }

    public String getRepObservaciones() {
        return repObservaciones;
    }

    public void setRepObservaciones(String repObservaciones) {
        this.repObservaciones = repObservaciones;
    }

    public boolean isRepPendiente() {
        return repPendiente;
    }

    public void setRepPendiente(boolean repPendiente) {
        this.repPendiente = repPendiente;
    }

    public boolean isRepAnulado() {
        return repAnulado;
    }

    public void setRepAnulado(boolean repAnulado) {
        this.repAnulado = repAnulado;
    }

    public InvBodega getInvBodega() {
        return invBodega;
    }

    public void setInvBodega(InvBodega invBodega) {
        this.invBodega = invBodega;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public Timestamp getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Timestamp usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

}
