/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author KevinQuispe
 */
@Entity
public class RhListaParametrosTO implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    private Integer parSecuencial;
    private Date parDesde;
    private Date parHasta;
    private BigDecimal parIessPorcentajeAporteIndividual;
    private BigDecimal parIessPorcentajeAporteExtendido;
    private BigDecimal parIessPorcentajeAportePatronal;
    private BigDecimal parIessPorcentajeIece;
    private BigDecimal parIessPorcentajeSecap;
    private BigDecimal parSalarioMinimoVital;

    public RhListaParametrosTO() {
    }

    public Integer getParSecuencial() {
        return parSecuencial;
    }

    public void setParSecuencial(Integer parSecuencial) {
        this.parSecuencial = parSecuencial;
    }

    public Date getParDesde() {
        return parDesde;
    }

    public void setParDesde(Date parDesde) {
        this.parDesde = parDesde;
    }

    public Date getParHasta() {
        return parHasta;
    }

    public void setParHasta(Date parHasta) {
        this.parHasta = parHasta;
    }

    public BigDecimal getParIessPorcentajeAporteIndividual() {
        return parIessPorcentajeAporteIndividual;
    }

    public void setParIessPorcentajeAporteIndividual(BigDecimal parIessPorcentajeAporteIndividual) {
        this.parIessPorcentajeAporteIndividual = parIessPorcentajeAporteIndividual;
    }

    public BigDecimal getParIessPorcentajeAporteExtendido() {
        return parIessPorcentajeAporteExtendido;
    }

    public void setParIessPorcentajeAporteExtendido(BigDecimal parIessPorcentajeAporteExtendido) {
        this.parIessPorcentajeAporteExtendido = parIessPorcentajeAporteExtendido;
    }

    public BigDecimal getParIessPorcentajeAportePatronal() {
        return parIessPorcentajeAportePatronal;
    }

    public void setParIessPorcentajeAportePatronal(BigDecimal parIessPorcentajeAportePatronal) {
        this.parIessPorcentajeAportePatronal = parIessPorcentajeAportePatronal;
    }

    public BigDecimal getParIessPorcentajeIece() {
        return parIessPorcentajeIece;
    }

    public void setParIessPorcentajeIece(BigDecimal parIessPorcentajeIece) {
        this.parIessPorcentajeIece = parIessPorcentajeIece;
    }

    public BigDecimal getParIessPorcentajeSecap() {
        return parIessPorcentajeSecap;
    }

    public void setParIessPorcentajeSecap(BigDecimal parIessPorcentajeSecap) {
        this.parIessPorcentajeSecap = parIessPorcentajeSecap;
    }

    public BigDecimal getParSalarioMinimoVital() {
        return parSalarioMinimoVital;
    }

    public void setParSalarioMinimoVital(BigDecimal parSalarioMinimoVital) {
        this.parSalarioMinimoVital = parSalarioMinimoVital;
    }
    
    
}
