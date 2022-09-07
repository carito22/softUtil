/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Trabajo
 */
@Embeddable
public class PrdReprocesoPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "rep_empresa")
    private String repEmpresa;

    @Column(name = "rep_periodo")
    private String repPeriodo;

    @Column(name = "rep_motivo")
    private String repMotivo;

    @Column(name = "rep_numero")
    private String repNumero;

    public PrdReprocesoPK() {
    }

    public PrdReprocesoPK(String repEmpresa, String repPeriodo, String repMotivo, String repNumero) {
        this.repEmpresa = repEmpresa;
        this.repPeriodo = repPeriodo;
        this.repMotivo = repMotivo;
        this.repNumero = repNumero;
    }

    public String getRepEmpresa() {
        return repEmpresa;
    }

    public void setRepEmpresa(String repEmpresa) {
        this.repEmpresa = repEmpresa;
    }

    public String getRepPeriodo() {
        return repPeriodo;
    }

    public void setRepPeriodo(String repPeriodo) {
        this.repPeriodo = repPeriodo;
    }

    public String getRepMotivo() {
        return repMotivo;
    }

    public void setRepMotivo(String repMotivo) {
        this.repMotivo = repMotivo;
    }

    public String getRepNumero() {
        return repNumero;
    }

    public void setRepNumero(String repNumero) {
        this.repNumero = repNumero;
    }

}
