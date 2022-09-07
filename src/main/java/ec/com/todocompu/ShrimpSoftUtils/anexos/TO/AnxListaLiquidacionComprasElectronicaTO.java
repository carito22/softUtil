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
public class AnxListaLiquidacionComprasElectronicaTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "comp_periodo")
    private String compPeriodo;

    @Column(name = "comp_motivo")
    private String compMotivo;

    @Column(name = "comp_numero")
    private String compNumero;

    @Column(name = "liquidacion_compra_documento_numero")
    private String liquidacionCompraDocumentoNumero;

    @Column(name = "liquidacion_compra_fecha")
    private String liquidacionCompraFecha;

    @Column(name = "prov_razon_social")
    private String provRazonSocial;

    @Column(name = "liquidacion_compra_autorizacion_fecha")
    private String liquidacionCompraAutorizacionFecha;

    @Column(name = "liquidacion_compra_autorizacion_numero")
    private String liquidacionCompraAutorizacionNumero;

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

    public AnxListaLiquidacionComprasElectronicaTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getLiquidacionCompraDocumentoNumero() {
        return liquidacionCompraDocumentoNumero;
    }

    public void setLiquidacionCompraDocumentoNumero(String liquidacionCompraDocumentoNumero) {
        this.liquidacionCompraDocumentoNumero = liquidacionCompraDocumentoNumero;
    }

    public String getLiquidacionCompraFecha() {
        return liquidacionCompraFecha;
    }

    public void setLiquidacionCompraFecha(String liquidacionCompraFecha) {
        this.liquidacionCompraFecha = liquidacionCompraFecha;
    }

    public String getProvRazonSocial() {
        return provRazonSocial;
    }

    public void setProvRazonSocial(String provRazonSocial) {
        this.provRazonSocial = provRazonSocial;
    }

    public String getLiquidacionCompraAutorizacionFecha() {
        return liquidacionCompraAutorizacionFecha;
    }

    public void setLiquidacionCompraAutorizacionFecha(String liquidacionCompraAutorizacionFecha) {
        this.liquidacionCompraAutorizacionFecha = liquidacionCompraAutorizacionFecha;
    }

    public String getLiquidacionCompraAutorizacionNumero() {
        return liquidacionCompraAutorizacionNumero;
    }

    public void setLiquidacionCompraAutorizacionNumero(String liquidacionCompraAutorizacionNumero) {
        this.liquidacionCompraAutorizacionNumero = liquidacionCompraAutorizacionNumero;
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
