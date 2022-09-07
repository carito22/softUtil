/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class RhProvisionDetalladoTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "prov_id")
    private String provId;

    @Column(name = "prov_nombres")
    private String provNombres;

    @Column(name = "prov_xiii")
    private java.math.BigDecimal provXiii;

    @Column(name = "prov_xiv")
    private java.math.BigDecimal provXiv;

    @Column(name = "prov_vacaciones")
    private java.math.BigDecimal provVacaciones;

    public RhProvisionDetalladoTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvId() {
        return provId;
    }

    public void setProvId(String provId) {
        this.provId = provId;
    }

    public String getProvNombres() {
        return provNombres;
    }

    public void setProvNombres(String provNombres) {
        this.provNombres = provNombres;
    }

    public BigDecimal getProvXiii() {
        return provXiii;
    }

    public void setProvXiii(BigDecimal provXiii) {
        this.provXiii = provXiii;
    }

    public BigDecimal getProvXiv() {
        return provXiv;
    }

    public void setProvXiv(BigDecimal provXiv) {
        this.provXiv = provXiv;
    }

    public BigDecimal getProvVacaciones() {
        return provVacaciones;
    }

    public void setProvVacaciones(BigDecimal provVacaciones) {
        this.provVacaciones = provVacaciones;
    }

}
