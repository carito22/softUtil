/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Mario Ramos
 */
@Entity
public class ConEstadoSituacionFinancieraComparativoOtrasEmpresasTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "esf_id")
    private Integer esfId;
    @Column(name = "esf_empresa")
    private String esfEmpresa;
    @Column(name = "esf_grupo")
    private String esfGrupo;
    @Column(name = "esf_grupo_comparativo")
    private String esfGrupoComparativo;
    @Column(name = "esf_detalle_comparativo")
    private String esfDetalleComparativo;
    @Column(name = "esf_saldo")
    private BigDecimal esfSaldo;
    @Column(name = "esf_saldo_relacionado")
    private BigDecimal esfSaldoRelacionado;

    public ConEstadoSituacionFinancieraComparativoOtrasEmpresasTO() {
    }

    public Integer getEsfId() {
        return esfId;
    }

    public void setEsfId(Integer esfId) {
        this.esfId = esfId;
    }

    public String getEsfEmpresa() {
        return esfEmpresa;
    }

    public void setEsfEmpresa(String esfEmpresa) {
        this.esfEmpresa = esfEmpresa;
    }

    public String getEsfGrupo() {
        return esfGrupo;
    }

    public void setEsfGrupo(String esfGrupo) {
        this.esfGrupo = esfGrupo;
    }

    public String getEsfGrupoComparativo() {
        return esfGrupoComparativo;
    }

    public void setEsfGrupoComparativo(String esfGrupoComparativo) {
        this.esfGrupoComparativo = esfGrupoComparativo;
    }

    public String getEsfDetalleComparativo() {
        return esfDetalleComparativo;
    }

    public void setEsfDetalleComparativo(String esfDetalleComparativo) {
        this.esfDetalleComparativo = esfDetalleComparativo;
    }

    public BigDecimal getEsfSaldo() {
        return esfSaldo;
    }

    public void setEsfSaldo(BigDecimal esfSaldo) {
        this.esfSaldo = esfSaldo;
    }

    public BigDecimal getEsfSaldoRelacionado() {
        return esfSaldoRelacionado;
    }

    public void setEsfSaldoRelacionado(BigDecimal esfSaldoRelacionado) {
        this.esfSaldoRelacionado = esfSaldoRelacionado;
    }

}
