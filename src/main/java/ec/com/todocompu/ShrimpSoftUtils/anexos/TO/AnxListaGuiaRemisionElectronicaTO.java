/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
public class AnxListaGuiaRemisionElectronicaTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "guia_periodo")
    private String guiaPeriodo;

    @Column(name = "guia_numero")
    private String guiaNumero;

    @Column(name = "guia_documento_numero")
    private String guiaDocumentoNumero;

    @Column(name = "guia_fecha")
    private String guiaFecha;

    @Column(name = "guia_destinatario_razon_social")
    private String guiaDestinatarioRazonSocial;

    @Column(name = "guia_autorizacion_fecha")
    private String guiaAutorizacionFecha;

    @Column(name = "guia_autorizacion_numero")
    private String guiaAutorizacionNumero;

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

    public AnxListaGuiaRemisionElectronicaTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGuiaPeriodo() {
        return guiaPeriodo;
    }

    public void setGuiaPeriodo(String guiaPeriodo) {
        this.guiaPeriodo = guiaPeriodo;
    }

    public String getGuiaNumero() {
        return guiaNumero;
    }

    public void setGuiaNumero(String guiaNumero) {
        this.guiaNumero = guiaNumero;
    }

    public String getGuiaDocumentoNumero() {
        return guiaDocumentoNumero;
    }

    public void setGuiaDocumentoNumero(String guiaDocumentoNumero) {
        this.guiaDocumentoNumero = guiaDocumentoNumero;
    }

    public String getGuiaFecha() {
        return guiaFecha;
    }

    public void setGuiaFecha(String guiaFecha) {
        this.guiaFecha = guiaFecha;
    }

    public String getGuiaDestinatarioRazonSocial() {
        return guiaDestinatarioRazonSocial;
    }

    public void setGuiaDestinatarioRazonSocial(String guiaDestinatarioRazonSocial) {
        this.guiaDestinatarioRazonSocial = guiaDestinatarioRazonSocial;
    }

    public String getGuiaAutorizacionFecha() {
        return guiaAutorizacionFecha;
    }

    public void setGuiaAutorizacionFecha(String guiaAutorizacionFecha) {
        this.guiaAutorizacionFecha = guiaAutorizacionFecha;
    }

    public String getGuiaAutorizacionNumero() {
        return guiaAutorizacionNumero;
    }

    public void setGuiaAutorizacionNumero(String guiaAutorizacionNumero) {
        this.guiaAutorizacionNumero = guiaAutorizacionNumero;
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

}
