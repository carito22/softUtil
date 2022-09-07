/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author CarolValdiviezo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class AnxListaGuiaRemisionPendientesTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "guia_periodo")
    private String guiaPeriodo;
    @Column(name = "guia_numero")
    private String guiaNumero;
    @Column(name = "guia_fecha")
    private String guiaFecha;
    @Column(name = "guia_documento_numero")
    private String guiaDocumentoNumero;
    @Column(name = "guia_transportista_codigo")
    private String transportistaCodigo;
    @Column(name = "guia_transportista_nombre")
    private String transportistaNombre;
    @Column(name = "guia_destinatario_codigo")
    private String destinatarioCodigo;
    @Column(name = "guia_destinatario_nombre")
    private String destinatarioNombre;
    @Column(name = "guia_ambiente")
    private String guiaAmbiente;
    @Column(name = "auxiliar")
    private boolean estado;

    public AnxListaGuiaRemisionPendientesTO() {
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

    public String getGuiaFecha() {
        return guiaFecha;
    }

    public void setGuiaFecha(String guiaFecha) {
        this.guiaFecha = guiaFecha;
    }

    public String getGuiaDocumentoNumero() {
        return guiaDocumentoNumero;
    }

    public void setGuiaDocumentoNumero(String guiaDocumentoNumero) {
        this.guiaDocumentoNumero = guiaDocumentoNumero;
    }

    public String getTransportistaCodigo() {
        return transportistaCodigo;
    }

    public void setTransportistaCodigo(String transportistaCodigo) {
        this.transportistaCodigo = transportistaCodigo;
    }

    public String getTransportistaNombre() {
        return transportistaNombre;
    }

    public void setTransportistaNombre(String transportistaNombre) {
        this.transportistaNombre = transportistaNombre;
    }

    public String getDestinatarioCodigo() {
        return destinatarioCodigo;
    }

    public void setDestinatarioCodigo(String destinatarioCodigo) {
        this.destinatarioCodigo = destinatarioCodigo;
    }

    public String getDestinatarioNombre() {
        return destinatarioNombre;
    }

    public void setDestinatarioNombre(String destinatarioNombre) {
        this.destinatarioNombre = destinatarioNombre;
    }

    public String getGuiaAmbiente() {
        return guiaAmbiente;
    }

    public void setGuiaAmbiente(String guiaAmbiente) {
        this.guiaAmbiente = guiaAmbiente;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
