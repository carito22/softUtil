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
public class ConEstadoResultadosComparativoOtrasEmpresasTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "er_id")
    private Integer erId;
    @Column(name = "er_empresa")
    private String erEmpresa;
    @Column(name = "er_grupo")
    private String erGrupo;
    @Column(name = "er_grupo_comparativo")
    private String erGrupoComparativo;
    @Column(name = "er_detalle_comparativo")
    private String erDetalleComparativo;
    @Column(name = "er_saldo")
    private BigDecimal erSaldo;
    @Column(name = "er_saldo_relacionado")
    private BigDecimal erSaldoRelacionado;

    public ConEstadoResultadosComparativoOtrasEmpresasTO() {
    }

    public Integer getErId() {
        return erId;
    }

    public void setErId(Integer erId) {
        this.erId = erId;
    }

    public String getErEmpresa() {
        return erEmpresa;
    }

    public void setErEmpresa(String erEmpresa) {
        this.erEmpresa = erEmpresa;
    }

    public String getErGrupo() {
        return erGrupo;
    }

    public void setErGrupo(String erGrupo) {
        this.erGrupo = erGrupo;
    }

    public String getErGrupoComparativo() {
        return erGrupoComparativo;
    }

    public void setErGrupoComparativo(String erGrupoComparativo) {
        this.erGrupoComparativo = erGrupoComparativo;
    }

    public String getErDetalleComparativo() {
        return erDetalleComparativo;
    }

    public void setErDetalleComparativo(String erDetalleComparativo) {
        this.erDetalleComparativo = erDetalleComparativo;
    }

    public BigDecimal getErSaldo() {
        return erSaldo;
    }

    public void setErSaldo(BigDecimal erSaldo) {
        this.erSaldo = erSaldo;
    }

    public BigDecimal getErSaldoRelacionado() {
        return erSaldoRelacionado;
    }

    public void setErSaldoRelacionado(BigDecimal erSaldoRelacionado) {
        this.erSaldoRelacionado = erSaldoRelacionado;
    }

}
