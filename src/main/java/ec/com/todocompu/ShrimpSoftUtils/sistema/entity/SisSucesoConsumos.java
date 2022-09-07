package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;


import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvConsumos;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Trabajo
 */
@Entity
@Table(name = "sis_suceso_consumos", schema = "sistemaweb")
public class SisSucesoConsumos implements Serializable {

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
        @JoinColumn(name = "cons_empresa", referencedColumnName = "cons_empresa")
        ,@JoinColumn(name = "cons_periodo", referencedColumnName = "cons_periodo")
        ,@JoinColumn(name = "cons_motivo", referencedColumnName = "cons_motivo")
        ,@JoinColumn(name = "cons_numero", referencedColumnName = "cons_numero")
    })
    @ManyToOne
    private InvConsumos invConsumos;

    public SisSucesoConsumos() {
    }

    public SisSucesoConsumos(Integer susSecuencial, String susJson, SisSuceso sisSuceso, InvConsumos invConsumos) {
        this.susSecuencial = susSecuencial;
        this.susJson = susJson;
        this.sisSuceso = sisSuceso;
        this.invConsumos = invConsumos;
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

    public InvConsumos getInvConsumos() {
        return invConsumos;
    }

    public void setInvConsumos(InvConsumos invConsumos) {
        this.invConsumos = invConsumos;
    }

}
