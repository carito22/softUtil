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
public class AnxListaLiquidacionComprasPendientesReducidoTO {

    private Integer id;
    private String compPeriodo;
    private String compMotivo;
    private String compNumero;
    private String compDocumentoTipo;
    private String compDocumentoNumero;
    private String compAmbiente;

    public AnxListaLiquidacionComprasPendientesReducidoTO() {
    }

    public AnxListaLiquidacionComprasPendientesReducidoTO(Integer id, String compPeriodo, String compMotivo, String compNumero, String compDocumentoTipo, String compDocumentoNumero, String compAmbiente) {
        this.id = id;
        this.compPeriodo = compPeriodo;
        this.compMotivo = compMotivo;
        this.compNumero = compNumero;
        this.compDocumentoTipo = compDocumentoTipo;
        this.compDocumentoNumero = compDocumentoNumero;
        this.compAmbiente = compAmbiente;
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

    public String getCompDocumentoTipo() {
        return compDocumentoTipo;
    }

    public void setCompDocumentoTipo(String compDocumentoTipo) {
        this.compDocumentoTipo = compDocumentoTipo;
    }

    public String getCompDocumentoNumero() {
        return compDocumentoNumero;
    }

    public void setCompDocumentoNumero(String compDocumentoNumero) {
        this.compDocumentoNumero = compDocumentoNumero;
    }

    public String getCompAmbiente() {
        return compAmbiente;
    }

    public void setCompAmbiente(String compAmbiente) {
        this.compAmbiente = compAmbiente;
    }

}
