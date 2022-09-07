/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvAdjuntoComprasTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "adj_secuencial")
    private Integer adjSecuencial;
    @Column(name = "adj_tipo")
    private String adjTipo;
    @Column(name = "adj_archivo")
    private byte[] adjArchivo;
    @Column(name = "comp_empresa")
    private String compEmpresa;
    @Column(name = "comp_periodo")
    private String compPeriodo;
    @Column(name = "comp_motivo")
    private String compMotivo;
    @Column(name = "comp_numero")
    private String compNumero;

    public InvAdjuntoComprasTO() {
    }

    public Integer getAdjSecuencial() {
        return adjSecuencial;
    }

    public void setAdjSecuencial(Integer adjSecuencial) {
        this.adjSecuencial = adjSecuencial;
    }

    public String getAdjTipo() {
        return adjTipo;
    }

    public void setAdjTipo(String adjTipo) {
        this.adjTipo = adjTipo;
    }

    public byte[] getAdjArchivo() {
        return adjArchivo;
    }

    public void setAdjArchivo(byte[] adjArchivo) {
        this.adjArchivo = adjArchivo;
    }

    public String getCompEmpresa() {
        return compEmpresa;
    }

    public void setCompEmpresa(String compEmpresa) {
        this.compEmpresa = compEmpresa;
    }

    public String getCompPeriodo() {
        return compPeriodo;
    }

    public void setCompPeriodo(String compPeriodo) {
        this.compPeriodo = compPeriodo;
    }

    public String getCompMotivo() {
        return compMotivo;
    }

    public void setCompMotivo(String compMotivo) {
        this.compMotivo = compMotivo;
    }

    public String getCompNumero() {
        return compNumero;
    }

    public void setCompNumero(String compNumero) {
        this.compNumero = compNumero;
    }

   
}
