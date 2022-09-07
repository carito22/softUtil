/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

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
@Table(name = "inv_compras_detalle_imb", schema = "inventario")
public class InvComprasDetalleImb implements Serializable {

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
        @JoinColumn(name = "comp_imb_empresa", referencedColumnName = "comp_empresa")
        ,@JoinColumn(name = "comp_imb_periodo", referencedColumnName = "comp_periodo")
        ,@JoinColumn(name = "comp_imb_motivo", referencedColumnName = "comp_motivo")
        ,@JoinColumn(name = "comp_imb_numero", referencedColumnName = "comp_numero")})
    @ManyToOne(optional = false)
    private InvCompras invComprasImb;
    @JoinColumns({
        @JoinColumn(name = "prov_imb_empresa", referencedColumnName = "prov_empresa")
        ,
        @JoinColumn(name = "prov_imb_codigo", referencedColumnName = "prov_codigo")})
    @ManyToOne(optional = false)
    private InvProveedor invProveedorImb;
    @Column(name = "comp_imb_total")
    private BigDecimal compImbTotal;

    public InvComprasDetalleImb() {
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

    public InvCompras getInvComprasImb() {
        return invComprasImb;
    }

    public void setInvComprasImb(InvCompras invComprasImb) {
        this.invComprasImb = invComprasImb;
    }

    public InvProveedor getInvProveedorImb() {
        return invProveedorImb;
    }

    public void setInvProveedorImb(InvProveedor invProveedorImb) {
        this.invProveedorImb = invProveedorImb;
    }

    public BigDecimal getCompImbTotal() {
        return compImbTotal;
    }

    public void setCompImbTotal(BigDecimal compImbTotal) {
        this.compImbTotal = compImbTotal;
    }

}
