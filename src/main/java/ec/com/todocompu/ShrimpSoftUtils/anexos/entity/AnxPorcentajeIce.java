/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author mario
 */
@Entity
@Table(name = "anx_porcentaje_ice", schema = "anexo")
@NamedQueries({
    @NamedQuery(name = "AnxPorcentajeIce.findAll", query = "SELECT a FROM AnxPorcentajeIce a")})
public class AnxPorcentajeIce implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ice_secuencial")
    private Integer iceSecuencial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ice_codigo")
    private String iceCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ice_descripcion")
    private String iceDescripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ice_porcentaje")
    private BigDecimal icePorcentaje;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ice_tarifa_fija")
    private BigDecimal iceTarifaFija;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ice_fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date iceFechaInicio;
    @Column(name = "ice_fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date iceFechaFin;

    public AnxPorcentajeIce() {
    }

    public AnxPorcentajeIce(Integer iceSecuencial) {
        this.iceSecuencial = iceSecuencial;
    }

    public Integer getIceSecuencial() {
        return iceSecuencial;
    }

    public void setIceSecuencial(Integer iceSecuencial) {
        this.iceSecuencial = iceSecuencial;
    }

    public String getIceCodigo() {
        return iceCodigo;
    }

    public void setIceCodigo(String iceCodigo) {
        this.iceCodigo = iceCodigo;
    }

    public String getIceDescripcion() {
        return iceDescripcion;
    }

    public void setIceDescripcion(String iceDescripcion) {
        this.iceDescripcion = iceDescripcion;
    }

    public BigDecimal getIcePorcentaje() {
        return icePorcentaje;
    }

    public void setIcePorcentaje(BigDecimal icePorcentaje) {
        this.icePorcentaje = icePorcentaje;
    }

    public BigDecimal getIceTarifaFija() {
        return iceTarifaFija;
    }

    public void setIceTarifaFija(BigDecimal iceTarifaFija) {
        this.iceTarifaFija = iceTarifaFija;
    }

    public Date getIceFechaInicio() {
        return iceFechaInicio;
    }

    public void setIceFechaInicio(Date iceFechaInicio) {
        this.iceFechaInicio = iceFechaInicio;
    }

    public Date getIceFechaFin() {
        return iceFechaFin;
    }

    public void setIceFechaFin(Date iceFechaFin) {
        this.iceFechaFin = iceFechaFin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iceSecuencial != null ? iceSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AnxPorcentajeIce)) {
            return false;
        }
        AnxPorcentajeIce other = (AnxPorcentajeIce) object;
        if ((this.iceSecuencial == null && other.iceSecuencial != null) || (this.iceSecuencial != null && !this.iceSecuencial.equals(other.iceSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return iceCodigo;
    }
    
}
