/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author CarolValdiviezo
 */
@Embeddable
public class PrdFitoplanctonPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "fit_empresa")
    private String fitEmpresa;
    @Column(name = "fit_sector")
    private String fitSector;
    @Column(name = "fit_piscina")
    private String fitPiscina;
    @Column(name = "fit_fecha")
    private Date fitFecha;

    public PrdFitoplanctonPK() {
    }

    public PrdFitoplanctonPK(String fitEmpresa, String fitSector, String fitPiscina, Date fitFecha) {
        this.fitEmpresa = fitEmpresa;
        this.fitSector = fitSector;
        this.fitPiscina = fitPiscina;
        this.fitFecha = fitFecha;
    }

    public String getFitEmpresa() {
        return fitEmpresa;
    }

    public void setFitEmpresa(String fitEmpresa) {
        this.fitEmpresa = fitEmpresa;
    }

    public String getFitSector() {
        return fitSector;
    }

    public void setFitSector(String fitSector) {
        this.fitSector = fitSector;
    }

    public String getFitPiscina() {
        return fitPiscina;
    }

    public void setFitPiscina(String fitPiscina) {
        this.fitPiscina = fitPiscina;
    }

    public Date getFitFecha() {
        return fitFecha;
    }

    public void setFitFecha(Date fitFecha) {
        this.fitFecha = fitFecha;
    }

}
