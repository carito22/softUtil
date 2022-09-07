/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.TO;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author VALDIVIEZO
 */
@Entity
public class SisPeriodoInnecesarioTO implements Serializable {

    @Id
    @Column(name = "per_codigo")
    private String perCodigo;

    @Column(name = "per_detalle")
    private String perDetalle;

    SisPeriodoInnecesarioTO() {

    }

    public String getPerCodigo() {
        return perCodigo;
    }

    public void setPerCodigo(String perCodigo) {
        this.perCodigo = perCodigo;
    }

    public String getPerDetalle() {
        return perDetalle;
    }

    public void setPerDetalle(String perDetalle) {
        this.perDetalle = perDetalle;
    }

}
