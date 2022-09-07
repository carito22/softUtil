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
@Table(name = "anx_paraisos_fiscales", schema = "anexo")
public class AnxParaisosFiscales {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "paraiso_secuencial")
    private Integer paraisoSecuencial;
    @Column(name = "paraiso_codigo")
    private String paraisoCodigo;
    @Column(name = "paraiso_nombre")
    private String paraisoNombre;
    @Column(name = "paraiso_fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date paraisoFechaInicio;
    @Column(name = "paraiso_fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date paraisoFechaFin;
    @Column(name = "pais_codigo")
    private String paisCodigo;

    public AnxParaisosFiscales() {
    }

    public Integer getParaisoSecuencial() {
        return paraisoSecuencial;
    }

    public void setParaisoSecuencial(Integer paraisoSecuencial) {
        this.paraisoSecuencial = paraisoSecuencial;
    }

    public String getParaisoCodigo() {
        return paraisoCodigo;
    }

    public void setParaisoCodigo(String paraisoCodigo) {
        this.paraisoCodigo = paraisoCodigo;
    }

    public String getParaisoNombre() {
        return paraisoNombre;
    }

    public void setParaisoNombre(String paraisoNombre) {
        this.paraisoNombre = paraisoNombre;
    }

    public Date getParaisoFechaInicio() {
        return paraisoFechaInicio;
    }

    public void setParaisoFechaInicio(Date paraisoFechaInicio) {
        this.paraisoFechaInicio = paraisoFechaInicio;
    }

    public Date getParaisoFechaFin() {
        return paraisoFechaFin;
    }

    public void setParaisoFechaFin(Date paraisoFechaFin) {
        this.paraisoFechaFin = paraisoFechaFin;
    }

    public String getPaisCodigo() {
        return paisCodigo;
    }

    public void setPaisCodigo(String paisCodigo) {
        this.paisCodigo = paisCodigo;
    }

}
