/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.io.Serializable;

/**
 *
 * @author DEVELOPER
 */
public class InvVentasDetalleSeriesTO implements Serializable {

    private Integer detSecuencial;
    private String detNumeroSerie;
    private Integer detSecuencialVenta;

    public InvVentasDetalleSeriesTO() {
    }

    public InvVentasDetalleSeriesTO(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public InvVentasDetalleSeriesTO(Integer detSecuencial, String detNumeroSerie) {
        this.detSecuencial = detSecuencial;
        this.detNumeroSerie = detNumeroSerie;
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

    public Integer getDetSecuencialVenta() {
        return detSecuencialVenta;
    }

    public void setDetSecuencialVenta(Integer detSecuencialVenta) {
        this.detSecuencialVenta = detSecuencialVenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detSecuencial != null ? detSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InvVentasDetalleSeriesTO)) {
            return false;
        }
        InvVentasDetalleSeriesTO other = (InvVentasDetalleSeriesTO) object;
        if ((this.detSecuencial == null && other.detSecuencial != null) || (this.detSecuencial != null && !this.detSecuencial.equals(other.detSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvVentasDetalleSeries[ detSecuencial=" + detSecuencial + " ]";
    }
    
}
