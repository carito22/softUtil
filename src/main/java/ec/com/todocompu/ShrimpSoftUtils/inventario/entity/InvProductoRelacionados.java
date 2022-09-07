package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CarolValdiviezo
 */
@Entity
@Table(name = "inv_productos_relacionados", schema = "inventario")
public class InvProductoRelacionados implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pr_secuencial")
    private Integer prSecuencial;
    @JoinColumns({
        @JoinColumn(name = "pr_principal_empresa", referencedColumnName = "pro_empresa")
        , @JoinColumn(name = "pr_principal_codigo", referencedColumnName = "pro_codigo_principal")})
    @ManyToOne(optional = false)
    private InvProducto invProducto;
    @JoinColumns({
        @JoinColumn(name = "pr_relacionado_empresa", referencedColumnName = "pro_empresa")
        , @JoinColumn(name = "pr_relacionado_codigo", referencedColumnName = "pro_codigo_principal")})
    @ManyToOne(optional = false)
    private InvProducto invProductoRelacionado;

    public InvProductoRelacionados() {
    }

    public Integer getPrSecuencial() {
        return prSecuencial;
    }

    public void setPrSecuencial(Integer prSecuencial) {
        this.prSecuencial = prSecuencial;
    }

    public InvProducto getInvProducto() {
        return invProducto;
    }

    public void setInvProducto(InvProducto invProducto) {
        this.invProducto = invProducto;
    }

    public InvProducto getInvProductoRelacionado() {
        return invProductoRelacionado;
    }

    public void setInvProductoRelacionado(InvProducto invProductoRelacionado) {
        this.invProductoRelacionado = invProductoRelacionado;
    }

}
