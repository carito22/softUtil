/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
@Table(name = "anx_tipos_ingreso_exterior", schema = "anexo")
public class AnxTiposIngresoExterior {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "tipo_secuencial")
    private Integer tipoSecuencial;
    @Column(name = "tipo_codigo")
    private String tipoCodigo;
    @Column(name = "tipo_descripcion")
    private String tipoDescripcion;
    @Column(name = "tipo_fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date tipoFechaInicio;
    @Column(name = "tipo_fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date tipoFechaFin;

    public AnxTiposIngresoExterior() {
    }

    public Integer getTipoSecuencial() {
        return tipoSecuencial;
    }

    public void setTipoSecuencial(Integer tipoSecuencial) {
        this.tipoSecuencial = tipoSecuencial;
    }

    public String getTipoCodigo() {
        return tipoCodigo;
    }

    public void setTipoCodigo(String tipoCodigo) {
        this.tipoCodigo = tipoCodigo;
    }

    public String getTipoDescripcion() {
        return tipoDescripcion;
    }

    public void setTipoDescripcion(String tipoDescripcion) {
        this.tipoDescripcion = tipoDescripcion;
    }

    public Date getTipoFechaInicio() {
        return tipoFechaInicio;
    }

    public void setTipoFechaInicio(Date tipoFechaInicio) {
        this.tipoFechaInicio = tipoFechaInicio;
    }

    public Date getTipoFechaFin() {
        return tipoFechaFin;
    }

    public void setTipoFechaFin(Date tipoFechaFin) {
        this.tipoFechaFin = tipoFechaFin;
    }

}
