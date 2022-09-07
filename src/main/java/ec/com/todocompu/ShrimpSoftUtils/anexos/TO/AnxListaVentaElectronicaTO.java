/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author charly
 */
@Entity
public class AnxListaVentaElectronicaTO implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Column(name = "vta_periodo")
    private String vtaPeriodo;

    @Column(name = "vta_motivo")
    private String vtaMotivo;

    @Column(name = "vta_numero")
    private String vtaNumero;

    @Column(name = "vta_documento_tipo")
    private String vtaDocumento_tipo;

    @Column(name = "vta_documento_numero")
    private String vtaDocumentoNumero;

    @Column(name = "vta_fecha")
    private String vtaFecha;

    @Column(name = "vta_cliente_razon_social")
    private String vtaClienteRazonSocial;

    @Column(name = "vta_autorizacion_fecha")
    private String vtaAutorizacionFecha;

    @Column(name = "vta_autorizacion_numero")
    private String vtaAutorizacionNumero;

    @Column(name = "email")
    private Boolean email;

    @Column(name = "email_enviado")
    private Boolean emailEnviado;

    @Column(name = "email_entregado")
    private Boolean emailEntregado;

    @Column(name = "email_leido")
    private Boolean emailLeido;

    @Column(name = "email_rebotado")
    private Boolean emailRebotado;
    
    @Column(name = "vta_pendiente")
    private Boolean vtaPendiente;
    
    @Column(name = "vta_anulado")
    private Boolean vtaAnulado;

    @Id
    @Column(name = "id")
    private Integer id;

    public AnxListaVentaElectronicaTO() {
    }

    public AnxListaVentaElectronicaTO(String vtaPeriodo, String vtaMotivo, String vtaNumero, String vtaDocumento_tipo, String vtaDocumentoNumero, String vtaFecha, String vtaClienteRazonSocial, String vtaAutorizacionFecha, String vtaAutorizacionNumero, Boolean email, Boolean emailEnviado, Boolean emailEntregado, Boolean emailLeido, Boolean emailRebotado, Integer id) {
        this.vtaPeriodo = vtaPeriodo;
        this.vtaMotivo = vtaMotivo;
        this.vtaNumero = vtaNumero;
        this.vtaDocumento_tipo = vtaDocumento_tipo;
        this.vtaDocumentoNumero = vtaDocumentoNumero;
        this.vtaFecha = vtaFecha;
        this.vtaClienteRazonSocial = vtaClienteRazonSocial;
        this.vtaAutorizacionFecha = vtaAutorizacionFecha;
        this.vtaAutorizacionNumero = vtaAutorizacionNumero;
        this.email = email;
        this.emailEnviado = emailEnviado;
        this.emailEntregado = emailEntregado;
        this.emailLeido = emailLeido;
        this.emailRebotado = emailRebotado;
        this.id = id;
    }

    public String getVtaPeriodo() {
        return vtaPeriodo;
    }

    public void setVtaPeriodo(String vtaPeriodo) {
        this.vtaPeriodo = vtaPeriodo;
    }

    public String getVtaMotivo() {
        return vtaMotivo;
    }

    public void setVtaMotivo(String vtaMotivo) {
        this.vtaMotivo = vtaMotivo;
    }

    public String getVtaNumero() {
        return vtaNumero;
    }

    public void setVtaNumero(String vtaNumero) {
        this.vtaNumero = vtaNumero;
    }

    public String getVtaDocumento_tipo() {
        return vtaDocumento_tipo;
    }

    public void setVtaDocumento_tipo(String vtaDocumento_tipo) {
        this.vtaDocumento_tipo = vtaDocumento_tipo;
    }

    public String getVtaDocumentoNumero() {
        return vtaDocumentoNumero;
    }

    public void setVtaDocumentoNumero(String vtaDocumentoNumero) {
        this.vtaDocumentoNumero = vtaDocumentoNumero;
    }

    public String getVtaFecha() {
        return vtaFecha;
    }

    public void setVtaFecha(String vtaFecha) {
        this.vtaFecha = vtaFecha;
    }

    public String getVtaClienteRazonSocial() {
        return vtaClienteRazonSocial;
    }

    public void setVtaClienteRazonSocial(String vtaClienteRazonSocial) {
        this.vtaClienteRazonSocial = vtaClienteRazonSocial;
    }

    public String getVtaAutorizacionFecha() {
        return vtaAutorizacionFecha;
    }

    public void setVtaAutorizacionFecha(String vtaAutorizacionFecha) {
        this.vtaAutorizacionFecha = vtaAutorizacionFecha;
    }

    public String getVtaAutorizacionNumero() {
        return vtaAutorizacionNumero;
    }

    public void setVtaAutorizacionNumero(String vtaAutorizacionNumero) {
        this.vtaAutorizacionNumero = vtaAutorizacionNumero;
    }

    public Boolean getEmail() {
        return email;
    }

    public void setEmail(Boolean email) {
        this.email = email;
    }

    public Boolean getEmailEnviado() {
        return emailEnviado;
    }

    public void setEmailEnviado(Boolean emailEnviado) {
        this.emailEnviado = emailEnviado;
    }

    public Boolean getEmailEntregado() {
        return emailEntregado;
    }

    public void setEmailEntregado(Boolean emailEntregado) {
        this.emailEntregado = emailEntregado;
    }

    public Boolean getEmailLeido() {
        return emailLeido;
    }

    public void setEmailLeido(Boolean emailLeido) {
        this.emailLeido = emailLeido;
    }

    public Boolean getEmailRebotado() {
        return emailRebotado;
    }

    public void setEmailRebotado(Boolean emailRebotado) {
        this.emailRebotado = emailRebotado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getVtaPendiente() {
        return vtaPendiente;
    }

    public void setVtaPendiente(Boolean vtaPendiente) {
        this.vtaPendiente = vtaPendiente;
    }

    public Boolean getVtaAnulado() {
        return vtaAnulado;
    }

    public void setVtaAnulado(Boolean vtaAnulado) {
        this.vtaAnulado = vtaAnulado;
    }

}
