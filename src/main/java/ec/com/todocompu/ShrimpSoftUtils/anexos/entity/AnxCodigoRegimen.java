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
@Table(name = "anx_codigo_regimen", schema = "anexo")
public class AnxCodigoRegimen {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "regimen_secuencial")
    private Integer regimenSecuencial;
    @Column(name = "regimen_codigo")
    private String regimenCodigo;
    @Column(name = "regimen_descripcion")
    private String regimenDescripcion;

    public AnxCodigoRegimen() {
    }

    public Integer getRegimenSecuencial() {
        return regimenSecuencial;
    }

    public void setRegimenSecuencial(Integer regimenSecuencial) {
        this.regimenSecuencial = regimenSecuencial;
    }

    public String getRegimenCodigo() {
        return regimenCodigo;
    }

    public void setRegimenCodigo(String regimenCodigo) {
        this.regimenCodigo = regimenCodigo;
    }

    public String getRegimenDescripcion() {
        return regimenDescripcion;
    }

    public void setRegimenDescripcion(String regimenDescripcion) {
        this.regimenDescripcion = regimenDescripcion;
    }

}
