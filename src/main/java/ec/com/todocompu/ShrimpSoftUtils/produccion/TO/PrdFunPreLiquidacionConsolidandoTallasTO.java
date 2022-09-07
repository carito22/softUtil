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
 * @author Usuario1
 */
@Entity
public class PrdFunPreLiquidacionConsolidandoTallasTO implements Serializable{
    
    @Id
    @Column(name = "id")
    private String id;
    
    @Column(name = "plct_talla")
    private String plctTalla;
    
    @Column(name = "plct_codigo")
    private String plctCodigo;
    
    @Column(name = "plct_medida")
    private String plctMedida;
    
    @Column(name = "plct_libras")
    private BigDecimal plctLibras;
    
    @Column(name = "plct_total")
    private BigDecimal plctTotal;
    
    @Column(name = "plct_porcentaje")
    private BigDecimal plctPorcentaje;

    public PrdFunPreLiquidacionConsolidandoTallasTO(){
    }
    
    public PrdFunPreLiquidacionConsolidandoTallasTO(String id, String plctTalla, String plctCodigo, String plctMedida, BigDecimal plctLibras, BigDecimal plctTotal, BigDecimal plctPorcentaje){
        this.id = id;
        this.plctTalla = plctTalla;
        this.plctCodigo = plctCodigo;
        this.plctMedida = plctMedida;
        this.plctLibras = plctLibras;
        this.plctTotal = plctTotal;
        this.plctPorcentaje = plctPorcentaje;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlctTalla() {
        return plctTalla;
    }

    public void setPlctTalla(String plctTalla) {
        this.plctTalla = plctTalla;
    }

    public String getPlctCodigo() {
        return plctCodigo;
    }

    public void setPlctCodigo(String plctCodigo) {
        this.plctCodigo = plctCodigo;
    }

    public String getPlctMedida() {
        return plctMedida;
    }

    public void setPlctMedida(String plctMedida) {
        this.plctMedida = plctMedida;
    }

    public BigDecimal getPlctLibras() {
        return plctLibras;
    }

    public void setPlctLibras(BigDecimal plctLibras) {
        this.plctLibras = plctLibras;
    }

    public BigDecimal getPlctTotal() {
        return plctTotal;
    }

    public void setPlctTotal(BigDecimal plctTotal) {
        this.plctTotal = plctTotal;
    }

    public BigDecimal getPlctPorcentaje() {
        return plctPorcentaje;
    }

    public void setPlctPorcentaje(BigDecimal plctPorcentaje) {
        this.plctPorcentaje = plctPorcentaje;
    }
    
    @Override
    public String toString(){
        return "PrdFunPreLiquidacionConsolidandoTallasTO {" + "id=" + id + ", plctTalla=" + plctTalla + ", plctCodigo=" + plctCodigo + ", plctMedida=" + plctMedida + ", plctLibras=" + plctLibras + ", plctTotal=" + plctTotal + ", plctPorcentaje=" + plctPorcentaje + '}';
    }
}
