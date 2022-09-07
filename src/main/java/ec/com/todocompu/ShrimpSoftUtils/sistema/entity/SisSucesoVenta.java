/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import ec.com.todocompu.ShrimpSoftUtils.inventario.entity.InvVentas;
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
@Table(name = "sis_suceso_venta", schema = "sistemaweb")
public class SisSucesoVenta implements Serializable {

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
        @JoinColumn(name = "vta_empresa", referencedColumnName = "vta_empresa")
        ,@JoinColumn(name = "vta_periodo", referencedColumnName = "vta_periodo")
        ,@JoinColumn(name = "vta_motivo", referencedColumnName = "vta_motivo")
        ,@JoinColumn(name = "vta_numero", referencedColumnName = "vta_numero")
    })
    @ManyToOne
    private InvVentas invVentas;

    public SisSucesoVenta() {
    }

    public SisSucesoVenta(Integer susSecuencial, String susJson, SisSuceso sisSuceso, InvVentas invVentas) {
        this.susSecuencial = susSecuencial;
        this.susJson = susJson;
        this.sisSuceso = sisSuceso;
        this.invVentas = invVentas;
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

    public InvVentas getInvVentas() {
        return invVentas;
    }

    public void setInvVentas(InvVentas invVentas) {
        this.invVentas = invVentas;
    }

}
