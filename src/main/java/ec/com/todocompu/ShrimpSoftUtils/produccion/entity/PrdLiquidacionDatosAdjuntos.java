/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author VALDIVIEZO
 */
@Entity
@Table(name = "prd_liquidacion_datos_adjuntos", schema = "produccion")
@NamedQueries({
    @NamedQuery(name = "PrdLiquidacionDatosAdjuntos.findAll", query = "SELECT i FROM PrdLiquidacionDatosAdjuntos i")})
public class PrdLiquidacionDatosAdjuntos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adj_secuencial")
    private Integer adjSecuencial;
    @JoinColumns({
        @JoinColumn(name = "liq_empresa", referencedColumnName = "liq_empresa")
        ,
			@JoinColumn(name = "liq_motivo", referencedColumnName = "liq_motivo")
        ,
			@JoinColumn(name = "liq_numero", referencedColumnName = "liq_numero")})
    @ManyToOne(optional = false)
    @JsonIgnore
    private PrdLiquidacion prdLiquidacion;

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

    public PrdLiquidacionDatosAdjuntos() {
    }

    public PrdLiquidacionDatosAdjuntos(PrdLiquidacion prdLiquidacion) {
        this.prdLiquidacion = prdLiquidacion;
    }

    public PrdLiquidacionDatosAdjuntos(Integer adjSecuencial, PrdLiquidacion prdLiquidacion, String adjUrlArchivo, String adjClaveArchivo, String adjBucket, boolean adjVerificado) {
        this.adjSecuencial = adjSecuencial;
        this.prdLiquidacion = prdLiquidacion;
        this.adjUrlArchivo = adjUrlArchivo;
        this.adjClaveArchivo = adjClaveArchivo;
        this.adjBucket = adjBucket;
        this.adjVerificado = adjVerificado;
    }

    public Integer getAdjSecuencial() {
        return adjSecuencial;
    }

    public void setAdjSecuencial(Integer adjSecuencial) {
        this.adjSecuencial = adjSecuencial;
    }

    public PrdLiquidacion getPrdLiquidacion() {
        return prdLiquidacion;
    }

    public void setPrdLiquidacion(PrdLiquidacion prdLiquidacion) {
        this.prdLiquidacion = prdLiquidacion;
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

}
