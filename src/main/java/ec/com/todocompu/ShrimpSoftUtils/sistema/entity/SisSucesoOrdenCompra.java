/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvPedidosOrdenCompra;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Trabajo
 */
@Entity
@Table(name = "sis_suceso_pedido_orden_compra", schema = "sistemaweb")
public class SisSucesoOrdenCompra implements Serializable {

    private static final long serialVersionUID = 1L;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sus_secuencial")
    @Id
    private Integer susSecuencial;
    @Column(name = "sus_json")
    private String susJson;
    @JoinColumn(name = "sus_suceso", referencedColumnName = "sus_secuencia")
    @OneToOne
    private SisSuceso sisSuceso;
    @JoinColumns({
        @JoinColumn(name = "oc_empresa", referencedColumnName = "oc_empresa")
        ,@JoinColumn(name = "oc_sector", referencedColumnName = "oc_sector")
        ,@JoinColumn(name = "oc_motivo", referencedColumnName = "oc_motivo")
        ,@JoinColumn(name = "oc_numero", referencedColumnName = "oc_numero")
    })
    @ManyToOne
    private InvPedidosOrdenCompra invPedidosOrdenCompra;

    public SisSucesoOrdenCompra() {
    }

    public SisSucesoOrdenCompra(Integer susSecuencial, String susJson, SisSuceso sisSuceso, InvPedidosOrdenCompra invPedidosOrdenCompra) {
        this.susSecuencial = susSecuencial;
        this.susJson = susJson;
        this.sisSuceso = sisSuceso;
        this.invPedidosOrdenCompra = invPedidosOrdenCompra;
    }

    public Integer getSusSecuencial() {
        return susSecuencial;
    }

    public void setSusSecuencial(Integer susSecuencial) {
        this.susSecuencial = susSecuencial;
    }

    public String getSusJson() {
        return susJson;
    }

    public void setSusJson(String susJson) {
        this.susJson = susJson;
    }

    public SisSuceso getSisSuceso() {
        return sisSuceso;
    }

    public void setSisSuceso(SisSuceso sisSuceso) {
        this.sisSuceso = sisSuceso;
    }

    public InvPedidosOrdenCompra getInvPedidosOrdenCompra() {
        return invPedidosOrdenCompra;
    }

    public void setInvPedidosOrdenCompra(InvPedidosOrdenCompra invPedidosOrdenCompra) {
        this.invPedidosOrdenCompra = invPedidosOrdenCompra;
    }

}
