/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

/**
 *
 * @author User
 */
public class InvComprasDetalleSeriesTO {

    private Integer detSecuencial;
    private String detNumeroSerie;
    private Integer detSecuencialCompra;
    private boolean serieOcupada;
    private String proCodigoPrincipal;

    public InvComprasDetalleSeriesTO() {
    }

    public InvComprasDetalleSeriesTO(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public Integer getDetSecuencial() {
        return detSecuencial;
    }

    public void setDetSecuencial(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public String getDetNumeroSerie() {
        return detNumeroSerie;
    }

    public void setDetNumeroSerie(String detNumeroSerie) {
        this.detNumeroSerie = detNumeroSerie;
    }

    public Integer getDetSecuencialCompra() {
        return detSecuencialCompra;
    }

    public void setDetSecuencialCompra(Integer detSecuencialCompra) {
        this.detSecuencialCompra = detSecuencialCompra;
    }

    public boolean isSerieOcupada() {
        return serieOcupada;
    }

    public void setSerieOcupada(boolean serieOcupada) {
        this.serieOcupada = serieOcupada;
    }

    public String getProCodigoPrincipal() {
        return proCodigoPrincipal;
    }

    public void setProCodigoPrincipal(String proCodigoPrincipal) {
        this.proCodigoPrincipal = proCodigoPrincipal;
    }

}
