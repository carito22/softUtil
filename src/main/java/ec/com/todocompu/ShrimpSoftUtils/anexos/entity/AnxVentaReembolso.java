/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvCompras;
import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvVentas;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Trabajo
 */
@Entity
@Table(name = "anx_venta_reembolso", schema = "anexo")
@XmlRootElement
public class AnxVentaReembolso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "reemb_secuencial")
    private Integer reembSecuencial;

    @JoinColumns({
        @JoinColumn(name = "comp_empresa", referencedColumnName = "comp_empresa")
        ,@JoinColumn(name = "comp_periodo", referencedColumnName = "comp_periodo")
        ,@JoinColumn(name = "comp_motivo", referencedColumnName = "comp_motivo")
        ,@JoinColumn(name = "comp_numero", referencedColumnName = "comp_numero")})
    @ManyToOne(optional = false)
    private InvCompras invCompra;

    @JoinColumns({
        @JoinColumn(name = "vta_empresa", referencedColumnName = "vta_empresa")
        ,@JoinColumn(name = "vta_periodo", referencedColumnName = "vta_periodo")
        ,@JoinColumn(name = "vta_motivo", referencedColumnName = "vta_motivo")
        ,@JoinColumn(name = "vta_numero", referencedColumnName = "vta_numero")})
    @ManyToOne(optional = false)
    private InvVentas invVenta;

    public AnxVentaReembolso() {
    }

    public Integer getReembSecuencial() {
        return reembSecuencial;
    }

    public void setReembSecuencial(Integer reembSecuencial) {
        this.reembSecuencial = reembSecuencial;
    }

    public InvCompras getInvCompra() {
        return invCompra;
    }

    public void setInvCompra(InvCompras invCompra) {
        this.invCompra = invCompra;
    }

    public InvVentas getInvVenta() {
        return invVenta;
    }

    public void setInvVenta(InvVentas invVenta) {
        this.invVenta = invVenta;
    }

}
