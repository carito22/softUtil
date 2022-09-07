/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
@Table(name = "anx_distritos_aduaneros", schema = "anexo")
public class AnxDistritosAduaneros {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "distrito_secuencial")
    private Integer distritoSecuencial;
    @Column(name = "distrito_codigo")
    private String distritoCodigo;
    @Column(name = "distrito_descripcion")
    private String distritoDescripcion;

    public AnxDistritosAduaneros() {
    }

    public Integer getDistritoSecuencial() {
        return distritoSecuencial;
    }

    public void setDistritoSecuencial(Integer distritoSecuencial) {
        this.distritoSecuencial = distritoSecuencial;
    }

    public String getDistritoCodigo() {
        return distritoCodigo;
    }

    public void setDistritoCodigo(String distritoCodigo) {
        this.distritoCodigo = distritoCodigo;
    }

    public String getDistritoDescripcion() {
        return distritoDescripcion;
    }

    public void setDistritoDescripcion(String distritoDescripcion) {
        this.distritoDescripcion = distritoDescripcion;
    }

}
