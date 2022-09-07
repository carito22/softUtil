/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Mario Ramos Duque
 */
@Entity
public class RhListaSaldoConsolidadoHorasExtrasTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "scbv_categoria")
    private String scbvCategoria;

    @Column(name = "scbv_id")
    private String scbvId;

    @Column(name = "scbv_nombres")
    private String scbvNombres;

    @Column(name = "scbv_valor_50")
    private BigDecimal scbvValor50;

    @Column(name = "scbv_valor_100")
    private BigDecimal scbvValor100;

    @Column(name = "scbv_valor_extraordinarias_100")
    private BigDecimal scbvValorExtraordinarias100;

    @Column(name = "scbv_total")
    private BigDecimal scbvTotal;

    @Column(name = "scbv_orden")
    private String scbvOrden;

    public RhListaSaldoConsolidadoHorasExtrasTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScbvCategoria() {
        return scbvCategoria;
    }

    public void setScbvCategoria(String scbvCategoria) {
        this.scbvCategoria = scbvCategoria;
    }

    public String getScbvId() {
        return scbvId;
    }

    public void setScbvId(String scbvId) {
        this.scbvId = scbvId;
    }

    public String getScbvNombres() {
        return scbvNombres;
    }

    public void setScbvNombres(String scbvNombres) {
        this.scbvNombres = scbvNombres;
    }

    public String getScbvOrden() {
        return scbvOrden;
    }

    public void setScbvOrden(String scbvOrden) {
        this.scbvOrden = scbvOrden;
    }

    public BigDecimal getScbvTotal() {
        return scbvTotal;
    }

    public void setScbvTotal(BigDecimal scbvTotal) {
        this.scbvTotal = scbvTotal;
    }

    public BigDecimal getScbvValor50() {
        return scbvValor50;
    }

    public void setScbvValor50(BigDecimal scbvValor50) {
        this.scbvValor50 = scbvValor50;
    }

    public BigDecimal getScbvValor100() {
        return scbvValor100;
    }

    public void setScbvValor100(BigDecimal scbvValor100) {
        this.scbvValor100 = scbvValor100;
    }

    public BigDecimal getScbvValorExtraordinarias100() {
        return scbvValorExtraordinarias100;
    }

    public void setScbvValorExtraordinarias100(BigDecimal scbvValorExtraordinarias100) {
        this.scbvValorExtraordinarias100 = scbvValorExtraordinarias100;
    }

}
