/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Mario Ramos Duque
 */
@Entity
public class AnxDiferenciasTributacionTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ret_id")
    private Integer retId;
    @Column(name = "ret_comp_empresa")
    private String retCompEmpresa;
    @Column(name = "ret_comp_periodo")
    private String retCompPeriodo;
    @Column(name = "ret_comp_motivo")
    private String retCompMotivo;
    @Column(name = "ret_comp_numero")
    private String retCompNumero;
    @Column(name = "ret_comp_fecha")
    private String retCompFecha;
    @Column(name = "ret_fecha_emision")
    private String retFechaEmision;
    @Column(name = "ret_retencion_numero")
    private String retRetencionNumero;
    @Column(name = "ret_prov_codigo")
    private String retProvCodigo;
    @Column(name = "ret_prov_empresa")
    private String retProvEmpresa;

    public AnxDiferenciasTributacionTO() {
    }

    public Integer getRetId() {
        return retId;
    }

    public void setRetId(Integer retId) {
        this.retId = retId;
    }

    public String getRetCompEmpresa() {
        return retCompEmpresa;
    }

    public void setRetCompEmpresa(String retCompEmpresa) {
        this.retCompEmpresa = retCompEmpresa;
    }

    public String getRetCompPeriodo() {
        return retCompPeriodo;
    }

    public void setRetCompPeriodo(String retCompPeriodo) {
        this.retCompPeriodo = retCompPeriodo;
    }

    public String getRetCompMotivo() {
        return retCompMotivo;
    }

    public void setRetCompMotivo(String retCompMotivo) {
        this.retCompMotivo = retCompMotivo;
    }

    public String getRetCompNumero() {
        return retCompNumero;
    }

    public void setRetCompNumero(String retCompNumero) {
        this.retCompNumero = retCompNumero;
    }

    public String getRetCompFecha() {
        return retCompFecha;
    }

    public void setRetCompFecha(String retCompFecha) {
        this.retCompFecha = retCompFecha;
    }

    public String getRetFechaEmision() {
        return retFechaEmision;
    }

    public void setRetFechaEmision(String retFechaEmision) {
        this.retFechaEmision = retFechaEmision;
    }

    public String getRetRetencionNumero() {
        return retRetencionNumero;
    }

    public void setRetRetencionNumero(String retRetencionNumero) {
        this.retRetencionNumero = retRetencionNumero;
    }

    public String getRetProvCodigo() {
        return retProvCodigo;
    }

    public void setRetProvCodigo(String retProvCodigo) {
        this.retProvCodigo = retProvCodigo;
    }

    public String getRetProvEmpresa() {
        return retProvEmpresa;
    }

    public void setRetProvEmpresa(String retProvEmpresa) {
        this.retProvEmpresa = retProvEmpresa;
    }

}
