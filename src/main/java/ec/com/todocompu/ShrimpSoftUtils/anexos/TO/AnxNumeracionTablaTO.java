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
 * @author Andres Guachisaca
 */
@Entity
public class AnxNumeracionTablaTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "num_secuencial")
    private Integer numSecuencial;

    @Column(name = "num_comprobante")
    private String numeroComprobante;

    @Column(name = "num_desde")
    private String numeroDesde;

    @Column(name = "num_hasta")
    private String numeroHasta;

    @Column(name = "num_autorizacion")
    private String numeroAutorizacion;

    @Column(name = "id_principal")
    private String idPrincipal;

    @Column(name = "num_observacion")
    private String numObservacion;
    
    @Column(name = "num_caduca")
    private String numCaduca;

    public AnxNumeracionTablaTO() {
    }

    public AnxNumeracionTablaTO(Integer numSecuencial, String numeroComprobante, String numeroDesde,
            String numeroHasta, String numObservacion, String numCaduca) {
        this.numSecuencial = numSecuencial;
        this.numeroComprobante = numeroComprobante;
        this.numeroDesde = numeroDesde;
        this.numeroHasta = numeroHasta;
        this.numObservacion = numObservacion;
        this.numCaduca = numCaduca;
    }

    public Integer getNumSecuencial() {
        return numSecuencial;
    }

    public void setNumSecuencial(Integer numSecuencial) {
        this.numSecuencial = numSecuencial;
    }

    public String getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public String getNumeroDesde() {
        return numeroDesde;
    }

    public void setNumeroDesde(String numeroDesde) {
        this.numeroDesde = numeroDesde;
    }

    public String getNumeroHasta() {
        return numeroHasta;
    }

    public void setNumeroHasta(String numeroHasta) {
        this.numeroHasta = numeroHasta;
    }

    public String getEstablecimientoPtoEmisionDesde() {
        return numeroDesde.split("-")[0] + "-" + numeroDesde.split("-")[1];
    }

    public int getSecuenciaDesde() {
        return Integer.parseInt(numeroDesde.split("-")[2]);
    }

    public String getEstablecimientoPtoEmisionHasta() {
        return numeroHasta.split("-")[0] + "-" + numeroHasta.split("-")[1];
    }

    public int getSecuenciaHasta() {
        return Integer.parseInt(numeroHasta.split("-")[2]);
    }

    public String getNumeroAutorizacion() {
        return numeroAutorizacion;
    }

    public void setNumeroAutorizacion(String numeroAutorizacion) {
        this.numeroAutorizacion = numeroAutorizacion;
    }

    public String getIdPrincipal() {
        return idPrincipal;
    }

    public void setIdPrincipal(String idPrincipal) {
        this.idPrincipal = idPrincipal;
    }

    public String getNumObservacion() {
        return numObservacion;
    }

    public void setNumObservacion(String numObservacion) {
        this.numObservacion = numObservacion;
    }

    public String getNumCaduca() {
        return numCaduca;
    }

    public void setNumCaduca(String numCaduca) {
        this.numCaduca = numCaduca;
    }

}
