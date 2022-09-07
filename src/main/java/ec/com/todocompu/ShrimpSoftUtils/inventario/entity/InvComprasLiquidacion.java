/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdLiquidacion;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author CarolValdiviezo
 */
@Entity
@Table(name = "inv_compras_liquidacion", schema = "inventario")
public class InvComprasLiquidacion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "det_secuencial")
    private Integer detSecuencial;
    @JoinColumns({
        @JoinColumn(name = "comp_empresa", referencedColumnName = "comp_empresa")
        ,@JoinColumn(name = "comp_periodo", referencedColumnName = "comp_periodo")
        ,@JoinColumn(name = "comp_motivo", referencedColumnName = "comp_motivo")
        ,@JoinColumn(name = "comp_numero", referencedColumnName = "comp_numero")})
    @ManyToOne(optional = false)
    private InvCompras invCompras;
    @JoinColumns({
        @JoinColumn(name = "liq_empresa", referencedColumnName = "liq_empresa")
        ,@JoinColumn(name = "liq_motivo", referencedColumnName = "liq_motivo")
        ,@JoinColumn(name = "liq_numero", referencedColumnName = "liq_numero")})
    @ManyToOne(optional = false)
    private PrdLiquidacion prdLiquidacion;
    @Column(name = "liq_total")
    private BigDecimal liqTotal;

    public InvComprasLiquidacion() {
    }

    public Integer getDetSecuencial() {
        return detSecuencial;
    }

    public void setDetSecuencial(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public InvCompras getInvCompras() {
        return invCompras;
    }

    public void setInvCompras(InvCompras invCompras) {
        this.invCompras = invCompras;
    }

    public PrdLiquidacion getPrdLiquidacion() {
        return prdLiquidacion;
    }

    public void setPrdLiquidacion(PrdLiquidacion prdLiquidacion) {
        this.prdLiquidacion = prdLiquidacion;
    }

    public BigDecimal getLiqTotal() {
        return liqTotal;
    }

    public void setLiqTotal(BigDecimal liqTotal) {
        this.liqTotal = liqTotal;
    }

}
