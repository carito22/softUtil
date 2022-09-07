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
@Table(name = "anx_tipos_regimen_fiscal_exterior", schema = "anexo")
public class AnxTiposRegimenFiscalExterior {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "tipo_secuencial")
    private Integer tipoSecuencial;
    @Column(name = "tipo_codigo", unique = true, nullable = false)
    private String tipoCodigo;
    @Column(name = "tipo_descripcion")
    private String tipoDescripcion;

    public AnxTiposRegimenFiscalExterior() {
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

}
