/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author User
 */
@Entity
public class PrdFunLiquidacionConsolidandoTallasTO implements Serializable {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "lct_talla")
    private String lctTalla;

    @Column(name = "lct_codigo")
    private String lctCodigo;

    @Column(name = "lct_medida")
    private String lctMedida;

    @Column(name = "lct_libras")
    private BigDecimal lctLibras;

    @Column(name = "lct_total")
    private BigDecimal lctTotal;

    @Column(name = "lct_porcentaje")
    private BigDecimal lctPorcentaje;

    public PrdFunLiquidacionConsolidandoTallasTO() {
    }

    public PrdFunLiquidacionConsolidandoTallasTO(String id, String lctTalla, String lctCodigo, String lctMedida, BigDecimal lctLibras, BigDecimal lctTotal, BigDecimal lctPorcentaje) {
        this.id = id;
        this.lctTalla = lctTalla;
        this.lctCodigo = lctCodigo;
        this.lctMedida = lctMedida;
        this.lctLibras = lctLibras;
        this.lctTotal = lctTotal;
        this.lctPorcentaje = lctPorcentaje;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLctTalla() {
        return lctTalla;
    }

    public void setLctTalla(String lctTalla) {
        this.lctTalla = lctTalla;
    }

    public String getLctCodigo() {
        return lctCodigo;
    }

    public void setLctCodigo(String lctCodigo) {
        this.lctCodigo = lctCodigo;
    }

    public String getLctMedida() {
        return lctMedida;
    }

    public void setLctMedida(String lctMedida) {
        this.lctMedida = lctMedida;
    }

    public BigDecimal getLctLibras() {
        return lctLibras;
    }

    public void setLctLibras(BigDecimal lctLibras) {
        this.lctLibras = lctLibras;
    }

    public BigDecimal getLctTotal() {
        return lctTotal;
    }

    public void setLctTotal(BigDecimal lctTotal) {
        this.lctTotal = lctTotal;
    }

    public BigDecimal getLctPorcentaje() {
        return lctPorcentaje;
    }

    public void setLctPorcentaje(BigDecimal lctPorcentaje) {
        this.lctPorcentaje = lctPorcentaje;
    }

    @Override
    public String toString() {
        return "InvFunLiquidacionConsolidandoProductosTO{" + "id=" + id + ", lctTalla=" + lctTalla + ", lctCodigo=" + lctCodigo + ", lctMedida=" + lctMedida + ", lctLibras=" + lctLibras + ", lctTotal=" + lctTotal + ", lctPorcentaje=" + lctPorcentaje + '}';
    }

}
