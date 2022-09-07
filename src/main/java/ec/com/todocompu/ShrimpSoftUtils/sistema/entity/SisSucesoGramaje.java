/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdGrameaje;
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
@Table(name = "sis_suceso_gramaje", schema = "sistemaweb")
public class SisSucesoGramaje implements Serializable {

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
        @JoinColumn(name = "gra_empresa", referencedColumnName = "gra_empresa")
        ,@JoinColumn(name = "gra_sector", referencedColumnName = "gra_sector")
        ,@JoinColumn(name = "gra_piscina", referencedColumnName = "gra_piscina")
        ,@JoinColumn(name = "gra_fecha", referencedColumnName = "gra_fecha")
    })
    @ManyToOne
    private PrdGrameaje prdGrameaje;

    public SisSucesoGramaje() {
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

    public PrdGrameaje getPrdGrameaje() {
        return prdGrameaje;
    }

    public void setPrdGrameaje(PrdGrameaje prdGrameaje) {
        this.prdGrameaje = prdGrameaje;
    }

}
