/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import ec.com.todocompu.ShrimpSoftUtils.cartera.entity.CarPagos;
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
@Table(name = "sis_suceso_pago", schema = "sistemaweb")
public class SisSucesoPago implements Serializable {

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
        @JoinColumn(name = "pag_empresa", referencedColumnName = "pag_empresa")
        ,@JoinColumn(name = "pag_periodo", referencedColumnName = "pag_periodo")
        ,@JoinColumn(name = "pag_tipo", referencedColumnName = "pag_tipo")
        ,@JoinColumn(name = "pag_numero", referencedColumnName = "pag_numero")
    })
    @ManyToOne
    private CarPagos carPagos;

    public SisSucesoPago() {
    }

    public SisSucesoPago(Integer susSecuencial, String susJson, SisSuceso sisSuceso, CarPagos carPagos) {
        this.susSecuencial = susSecuencial;
        this.susJson = susJson;
        this.sisSuceso = sisSuceso;
        this.carPagos = carPagos;
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

    public CarPagos getCarPagos() {
        return carPagos;
    }

    public void setCarPagos(CarPagos carPagos) {
        this.carPagos = carPagos;
    }

}
