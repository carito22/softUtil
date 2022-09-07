/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvCliente;
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
import javax.persistence.Transient;

/**
 *
 * @author Trabajo
 */
@Entity
@Table(name = "sis_suceso_cliente", schema = "sistemaweb")
public class SisSucesoCliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sus_secuencial")
    private Integer susSecuencial;

    @JoinColumns({
        @JoinColumn(name = "cli_empresa", referencedColumnName = "cli_empresa")
        ,@JoinColumn(name = "cli_codigo", referencedColumnName = "cli_codigo")})
    @ManyToOne
    private InvCliente invCliente;
    @Column(name = "sus_json")
    private String susJson;
    @JoinColumn(name = "sus_suceso", referencedColumnName = "sus_secuencia")
    @OneToOne
    private SisSuceso sisSuceso;
    @Transient
    private InvCliente invClienteModificado;

    public SisSucesoCliente() {
    }

    public SisSucesoCliente(Integer susSecuencial, InvCliente invCliente, String susJson, SisSuceso sisSuceso) {
        this.susSecuencial = susSecuencial;
        this.invCliente = invCliente;
        this.susJson = susJson;
        this.sisSuceso = sisSuceso;
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

    public InvCliente getInvCliente() {
        return invCliente;
    }

    public void setInvCliente(InvCliente invCliente) {
        this.invCliente = invCliente;
    }

    public InvCliente getInvClienteModificado() {
        return invClienteModificado;
    }

    public void setInvClienteModificado(InvCliente invClienteModificado) {
        this.invClienteModificado = invClienteModificado;
    }

}
