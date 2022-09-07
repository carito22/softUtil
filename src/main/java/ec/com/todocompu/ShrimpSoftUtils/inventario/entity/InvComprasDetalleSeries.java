/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author DEVELOPER
 */
@Entity
@Table(name = "inv_compras_detalle_series", schema = "inventario")
@NamedQueries({
    @NamedQuery(name = "InvComprasDetalleSeries.findAll", query = "SELECT i FROM InvComprasDetalleSeries i")})
public class InvComprasDetalleSeries implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "det_secuencial")
    private Integer detSecuencial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "det_numero_serie")
    private String detNumeroSerie;
    @JoinColumn(name = "det_secuencial_compra", referencedColumnName = "det_secuencial")
    @ManyToOne(optional = false)
    private InvComprasDetalle detSecuencialCompra;

    public InvComprasDetalleSeries() {
    }

    public InvComprasDetalleSeries(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public InvComprasDetalleSeries(Integer detSecuencial, String detNumeroSerie) {
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

    public InvComprasDetalle getDetSecuencialCompra() {
        return detSecuencialCompra;
    }

    public void setDetSecuencialCompra(InvComprasDetalle detSecuencialCompra) {
        this.detSecuencialCompra = detSecuencialCompra;
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
        if (!(object instanceof InvComprasDetalleSeries)) {
            return false;
        }
        InvComprasDetalleSeries other = (InvComprasDetalleSeries) object;
        if ((this.detSecuencial == null && other.detSecuencial != null) || (this.detSecuencial != null && !this.detSecuencial.equals(other.detSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvComprasDetalleSeries[ detSecuencial=" + detSecuencial + " ]";
    }
    
}
