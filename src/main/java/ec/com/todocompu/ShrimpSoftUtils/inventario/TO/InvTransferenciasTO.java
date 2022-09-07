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
public class InvTransferenciasTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "trans_empresa")
    private String transEmpresa;

    @Column(name = "trans_periodo")
    private String transPeriodo;

    @Column(name = "trans_motivo")
    private String transMotivo;

    @Column(name = "trans_numero")
    private String transNumero;

    @Column(name = "trans_fecha")
    private String transFecha;

    @Column(name = "trans_observaciones")
    private String transObservaciones;

    @Column(name = "trans_pendiente")
    private Boolean transPendiente;

    @Column(name = "trans_revisado")
    private Boolean transRevisado;

    @Column(name = "trans_anulado")
    private Boolean transAnulado;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    public InvTransferenciasTO() {
    }

    public InvTransferenciasTO(String transEmpresa, String transPeriodo, String transMotivo, String transNumero,
            String transFecha, String transObservaciones, Boolean transPendiente, Boolean transRevisado,
            Boolean transAnulado,
            String usrEmpresa, String usrCodigo, String usrFechaInserta) {
        this.transEmpresa = transEmpresa;
        this.transPeriodo = transPeriodo;
        this.transMotivo = transMotivo;
        this.transNumero = transNumero;
        this.transFecha = transFecha;
        this.transObservaciones = transObservaciones;
        this.transPendiente = transPendiente;
        this.transRevisado = transRevisado;
        this.transAnulado = transAnulado;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public Boolean getTransAnulado() {
        return transAnulado;
    }

    public void setTransAnulado(Boolean transAnulado) {
        this.transAnulado = transAnulado;
    }

    public String getTransEmpresa() {
        return transEmpresa;
    }

    public void setTransEmpresa(String transEmpresa) {
        this.transEmpresa = transEmpresa;
    }

    public String getTransFecha() {
        return transFecha;
    }

    public void setTransFecha(String transFecha) {
        this.transFecha = transFecha;
    }

    public String getTransMotivo() {
        return transMotivo;
    }

    public void setTransMotivo(String transMotivo) {
        this.transMotivo = transMotivo;
    }

    public String getTransNumero() {
        return transNumero;
    }

    public void setTransNumero(String transNumero) {
        this.transNumero = transNumero;
    }

    public String getTransObservaciones() {
        return transObservaciones;
    }

    public void setTransObservaciones(String transObservaciones) {
        this.transObservaciones = transObservaciones;
    }

    public Boolean getTransPendiente() {
        return transPendiente;
    }

    public void setTransPendiente(Boolean transPendiente) {
        this.transPendiente = transPendiente;
    }

    public String getTransPeriodo() {
        return transPeriodo;
    }

    public void setTransPeriodo(String transPeriodo) {
        this.transPeriodo = transPeriodo;
    }

    public Boolean getTransRevisado() {
        return transRevisado;
    }

    public void setTransRevisado(Boolean transRevisado) {
        this.transRevisado = transRevisado;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }
}
