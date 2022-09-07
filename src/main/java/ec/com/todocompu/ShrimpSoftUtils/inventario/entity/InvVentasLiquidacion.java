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
@Table(name = "inv_ventas_liquidacion", schema = "inventario")
public class InvVentasLiquidacion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "det_secuencial")
    private Integer detSecuencial;
    @JoinColumns({
        @JoinColumn(name = "vta_empresa", referencedColumnName = "vta_empresa")
        ,@JoinColumn(name = "vta_periodo", referencedColumnName = "vta_periodo")
        ,@JoinColumn(name = "vta_motivo", referencedColumnName = "vta_motivo")
        ,@JoinColumn(name = "vta_numero", referencedColumnName = "vta_numero")})
    @ManyToOne(optional = false)
    private InvVentas invVentas;
    @JoinColumns({
        @JoinColumn(name = "liq_empresa", referencedColumnName = "liq_empresa")
        ,@JoinColumn(name = "liq_motivo", referencedColumnName = "liq_motivo")
        ,@JoinColumn(name = "liq_numero", referencedColumnName = "liq_numero")})
    @ManyToOne(optional = false)
    private PrdLiquidacion prdLiquidacion;
    @Column(name = "liq_total")
    private BigDecimal liqTotal;

    public InvVentasLiquidacion() {
    }

    public Integer getDetSecuencial() {
        return detSecuencial;
    }

    public void setDetSecuencial(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public InvVentas getInvVentas() {
        return invVentas;
    }

    public void setInvVentas(InvVentas invVentas) {
        this.invVentas = invVentas;
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
