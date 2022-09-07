/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.banco.entity;

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
@Table(name = "ban_conciliacion_datos_adjuntos", schema = "banco")
@NamedQueries({
    @NamedQuery(name = "BanConciliacionDatosAdjuntos.findAll", query = "SELECT i FROM BanConciliacionDatosAdjuntos i")})
public class BanConciliacionDatosAdjuntos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adj_secuencial")
    private Integer adjSecuencial;
    @JoinColumns({
        @JoinColumn(name = "conc_empresa", referencedColumnName = "conc_empresa")
        ,@JoinColumn(name = "conc_cuenta_contable", referencedColumnName = "conc_cuenta_contable")
        ,@JoinColumn(name = "conc_codigo", referencedColumnName = "conc_codigo")})
    @ManyToOne(optional = false)
    @JsonIgnore
    private BanConciliacion banConciliacion;

    @Column(name = "adj_url_archivo")
    private String adjUrlArchivo;
    @Column(name = "adj_clave_archivo")
    private String adjClaveArchivo;
    @Column(name = "adj_bucket")
    private String adjBucket;
    @Column(name = "adj_tipo")
    private String adjTipo;
    @Column(name = "adj_verificado")
    private boolean adjVerificado;
    @Transient
    String imagenString;

    public BanConciliacionDatosAdjuntos() {
    }

    public Integer getAdjSecuencial() {
        return adjSecuencial;
    }

    public void setAdjSecuencial(Integer adjSecuencial) {
        this.adjSecuencial = adjSecuencial;
    }

    public BanConciliacion getBanConciliacion() {
        return banConciliacion;
    }

    public void setBanConciliacion(BanConciliacion banConciliacion) {
        this.banConciliacion = banConciliacion;
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

    public String getAdjTipo() {
        return adjTipo;
    }

    public void setAdjTipo(String adjTipo) {
        this.adjTipo = adjTipo;
    }

}
