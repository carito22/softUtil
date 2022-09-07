/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvGuiaRemision;
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
@Table(name = "sis_suceso_guia_remision", schema = "sistemaweb")
public class SisSucesoGuiaRemision implements Serializable {

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
        @JoinColumn(name = "guia_empresa", referencedColumnName = "guia_empresa")
        ,@JoinColumn(name = "guia_periodo", referencedColumnName = "guia_periodo")
        ,@JoinColumn(name = "guia_numero", referencedColumnName = "guia_numero")
    })
    @ManyToOne
    private InvGuiaRemision invGuiaRemision;

    public SisSucesoGuiaRemision() {
    }

    public SisSucesoGuiaRemision(Integer susSecuencial, String susJson, SisSuceso sisSuceso, InvGuiaRemision invGuiaRemision) {
        this.susSecuencial = susSecuencial;
        this.susJson = susJson;
        this.sisSuceso = sisSuceso;
        this.invGuiaRemision = invGuiaRemision;
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

    public InvGuiaRemision getInvGuiaRemision() {
        return invGuiaRemision;
    }

    public void setInvGuiaRemision(InvGuiaRemision invGuiaRemision) {
        this.invGuiaRemision = invGuiaRemision;
    }

}
