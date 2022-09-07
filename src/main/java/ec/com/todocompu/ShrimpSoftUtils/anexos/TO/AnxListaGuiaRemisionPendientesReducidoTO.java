/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

/**
 *
 * @author CarolValdiviezo
 */
public class AnxListaGuiaRemisionPendientesReducidoTO {

    private Integer id;
    private String guiaPeriodo;
    private String guiaNumero;
    private String guiaDocumentoNumero;
    private String guiaAmbiente;

    public AnxListaGuiaRemisionPendientesReducidoTO() {
    }

    public AnxListaGuiaRemisionPendientesReducidoTO(Integer id, String guiaPeriodo, String guiaNumero, String guiaDocumentoNumero, String guiaAmbiente) {
        this.id = id;
        this.guiaPeriodo = guiaPeriodo;
        this.guiaNumero = guiaNumero;
        this.guiaDocumentoNumero = guiaDocumentoNumero;
        this.guiaAmbiente = guiaAmbiente;
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

    public String getGuiaAmbiente() {
        return guiaAmbiente;
    }

    public void setGuiaAmbiente(String guiaAmbiente) {
        this.guiaAmbiente = guiaAmbiente;
    }

}
