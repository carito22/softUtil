/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Trabajo
 */
@Entity
public class SisSucesoDetalle {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "sus_json")
    private String susJson;

    @Column(name = "sus_accion")
    private String susAccion;

    @Column(name = "sus_usuario")
    private String susUsuario;

    @Column(name = "sus_fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date susFecha;

    @Column(name = "sus_secuencia")
    private Integer susSecuencia;
    @Column(name = "sus_secuencia_detalle")
    private Integer susSecuenciaDetalle;

    public SisSucesoDetalle() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSusJson() {
        return susJson;
    }

    public void setSusJson(String susJson) {
        this.susJson = susJson;
    }

    public String getSusAccion() {
        return susAccion;
    }

    public void setSusAccion(String susAccion) {
        this.susAccion = susAccion;
    }

    public String getSusUsuario() {
        return susUsuario;
    }

    public void setSusUsuario(String susUsuario) {
        this.susUsuario = susUsuario;
    }

    public Date getSusFecha() {
        return susFecha;
    }

    public void setSusFecha(Date susFecha) {
        this.susFecha = susFecha;
    }

    public Integer getSusSecuencia() {
        return susSecuencia;
    }

    public void setSusSecuencia(Integer susSecuencia) {
        this.susSecuencia = susSecuencia;
    }

    public Integer getSusSecuenciaDetalle() {
        return susSecuenciaDetalle;
    }

    public void setSusSecuenciaDetalle(Integer susSecuenciaDetalle) {
        this.susSecuenciaDetalle = susSecuenciaDetalle;
    }

}
