/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author VALDIVIEZO
 */
@Entity
@Table(name = "inv_cliente_contrato_datos_adjuntos", schema = "inventario")
public class InvClienteContratoDatosAdjuntos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "adj_secuencial")
    private Integer adjSecuencial;

    @JoinColumn(name = "cli_secuencial", referencedColumnName = "cli_secuencial")
    @ManyToOne(optional = false)
    private InvClienteContrato invClienteContrato;

    @Column(name = "adj_tipo")
    private String adjTipo;
    @Column(name = "adj_url_archivo")
    private String adjUrlArchivo;
    @Column(name = "adj_clave_archivo")
    private String adjClaveArchivo;
    @Column(name = "adj_bucket")
    private String adjBucket;
    @Column(name = "adj_verificado")
    private boolean adjVerificado;
    @Transient
    String imagenString;
    @Column(name = "adj_extension")
    String adjExtension;

    public InvClienteContratoDatosAdjuntos() {
    }

    public Integer getAdjSecuencial() {
        return adjSecuencial;
    }

    public void setAdjSecuencial(Integer adjSecuencial) {
        this.adjSecuencial = adjSecuencial;
    }

    public InvClienteContrato getInvClienteContrato() {
        return invClienteContrato;
    }

    public void setInvClienteContrato(InvClienteContrato invClienteContrato) {
        this.invClienteContrato = invClienteContrato;
    }

    public String getAdjTipo() {
        return adjTipo;
    }

    public void setAdjTipo(String adjTipo) {
        this.adjTipo = adjTipo;
    }

    public String getAdjUrlArchivo() {
        return adjUrlArchivo;
    }

    public void setAdjUrlArchivo(String adjUrlArchivo) {
        this.adjUrlArchivo = adjUrlArchivo;
    }

    public String getAdjClaveArchivo() {
        return adjClaveArchivo;
    }

    public void setAdjClaveArchivo(String adjClaveArchivo) {
        this.adjClaveArchivo = adjClaveArchivo;
    }

    public String getAdjBucket() {
        return adjBucket;
    }

    public void setAdjBucket(String adjBucket) {
        this.adjBucket = adjBucket;
    }

    public boolean isAdjVerificado() {
        return adjVerificado;
    }

    public void setAdjVerificado(boolean adjVerificado) {
        this.adjVerificado = adjVerificado;
    }

    public String getImagenString() {
        return imagenString;
    }

    public void setImagenString(String imagenString) {
        this.imagenString = imagenString;
    }

    public String getAdjExtension() {
        return adjExtension;
    }

    public void setAdjExtension(String adjExtension) {
        this.adjExtension = adjExtension;
    }

}
