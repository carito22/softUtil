/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvProductoCategoria;
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
@Table(name = "sis_suceso_producto_categoria", schema = "sistemaweb")
public class SisSucesoProductoCategoria implements Serializable{

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
        @JoinColumn(name = "cat_empresa", referencedColumnName = "cat_empresa")
        ,@JoinColumn(name = "cat_codigo", referencedColumnName = "cat_codigo")
    })
    @ManyToOne
    private InvProductoCategoria invProductoCategoria;

    public SisSucesoProductoCategoria() {
    }

    public SisSucesoProductoCategoria(Integer susSecuencial, String susJson, SisSuceso sisSuceso, InvProductoCategoria invProductoCategoria) {
        this.susSecuencial = susSecuencial;
        this.susJson = susJson;
        this.sisSuceso = sisSuceso;
        this.invProductoCategoria = invProductoCategoria;
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

    public InvProductoCategoria getInvProductoCategoria() {
        return invProductoCategoria;
    }

    public void setInvProductoCategoria(InvProductoCategoria invProductoCategoria) {
        this.invProductoCategoria = invProductoCategoria;
    }

}
