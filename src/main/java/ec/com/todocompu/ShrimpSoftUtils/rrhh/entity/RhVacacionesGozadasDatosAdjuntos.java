/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Type;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
@Table(name = "rh_vacaciones_gozadas_datos_adjuntos", schema = "recursoshumanos")
public class RhVacacionesGozadasDatosAdjuntos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "adj_secuencial")
    private Integer adjSecuencial;

    @Column(name = "adj_tipo")
    private String adjTipo;

    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    @Column(name = "adj_archivo")
    private byte[] adjArchivo;

    @JoinColumns({
        @JoinColumn(name = "vac_empresa", referencedColumnName = "vac_empresa"),
        @JoinColumn(name = "vac_numero", referencedColumnName = "vac_numero")})
    @ManyToOne(optional = false)
    private RhVacacionesGozadas rhVacacionesGozadas;

    @Column(name = "adj_url_archivo")
    private String adjUrlArchivo;
    @Column(name = "adj_clave_archivo")
    private String adjClaveArchivo;
    @Column(name = "adj_bucket")
    private String adjBucket;
    @Column(name = "adj_extension")
    private String adjExtension;
    @Column(name = "adj_verificado")
    private boolean adjVerificado;

    public RhVacacionesGozadasDatosAdjuntos() {
    }

    public Integer getAdjSecuencial() {
        return adjSecuencial;
    }

    public void setAdjSecuencial(Integer adjSecuencial) {
        this.adjSecuencial = adjSecuencial;
    }

    public String getAdjTipo() {
        return adjTipo;
    }

    public void setAdjTipo(String adjTipo) {
        this.adjTipo = adjTipo;
    }

    public byte[] getAdjArchivo() {
        return adjArchivo;
    }

    public void setAdjArchivo(byte[] adjArchivo) {
        this.adjArchivo = adjArchivo;
    }

    public RhVacacionesGozadas getRhVacacionesGozadas() {
        return rhVacacionesGozadas;
    }

    public void setRhVacacionesGozadas(RhVacacionesGozadas rhVacacionesGozadas) {
        this.rhVacacionesGozadas = rhVacacionesGozadas;
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

    public String getAdjExtension() {
        return adjExtension;
    }

    public void setAdjExtension(String adjExtension) {
        this.adjExtension = adjExtension;
    }

}
