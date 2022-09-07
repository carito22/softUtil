/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author MarioRamos
 */
@Entity
@Table(name = "rh_relacion_trabajo", schema = "recursoshumanos")
@NamedQueries({
    @NamedQuery(name = "RhRelacionTrabajo.findAll", query = "SELECT r FROM RhRelacionTrabajo r")})
public class RhRelacionTrabajo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "rt_codigo")
    private String rtCodigo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "rt_descripcion")
    private String rtDescripcion;

    public RhRelacionTrabajo() {
    }

    public RhRelacionTrabajo(String rtCodigo) {
        this.rtCodigo = rtCodigo;
    }

    public RhRelacionTrabajo(String rtCodigo, String rtDescripcion) {
        this.rtCodigo = rtCodigo;
        this.rtDescripcion = rtDescripcion;
    }

    public String getRtCodigo() {
        return rtCodigo;
    }

    public void setRtCodigo(String rtCodigo) {
        this.rtCodigo = rtCodigo;
    }

    public String getRtDescripcion() {
        return rtDescripcion;
    }

    public void setRtDescripcion(String rtDescripcion) {
        this.rtDescripcion = rtDescripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rtCodigo != null ? rtCodigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RhRelacionTrabajo)) {
            return false;
        }
        RhRelacionTrabajo other = (RhRelacionTrabajo) object;
        if ((this.rtCodigo == null && other.rtCodigo != null) || (this.rtCodigo != null && !this.rtCodigo.equals(other.rtCodigo))) {
            return false;
        }
        return true;
    }

    public String retornoDatos() {
        return this.rtCodigo + " " + this.rtDescripcion + " ";
    }

    @Override
    public String toString() {
        return this.rtCodigo + " " + this.rtDescripcion + " ";
    }

}
