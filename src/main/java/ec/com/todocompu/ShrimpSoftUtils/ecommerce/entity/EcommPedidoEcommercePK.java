/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.ecommerce.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author mario
 */
@Embeddable
public class EcommPedidoEcommercePK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "e_codigo_pedido")
    private String eCodigoPedido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "e_empresa")
    private String eEmpresa;

    public EcommPedidoEcommercePK() {
    }

    public EcommPedidoEcommercePK(String eCodigoPedido, String eEmpresa) {
        this.eCodigoPedido = eCodigoPedido;
        this.eEmpresa = eEmpresa;
    }

    public String geteCodigoPedido() {
        return eCodigoPedido;
    }

    public void seteCodigoPedido(String eCodigoPedido) {
        this.eCodigoPedido = eCodigoPedido;
    }

    public String geteEmpresa() {
        return eEmpresa;
    }

    public void seteEmpresa(String eEmpresa) {
        this.eEmpresa = eEmpresa;
    }

}
