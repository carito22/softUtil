/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Mario Ramos
 */
@Entity
public class ConFlujoCajaValorizacionActivoBiologicoTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "fc_id")
    private Integer fcId;
    @Column(name = "fc_sector")
    private String fcSector;
    @Column(name = "fc_piscina")
    private String fcPiscina;
    @Column(name = "fc_corrida")
    private String fcCorrida;
    @Column(name = "fc_fecha")
    private String fcFecha;
    @Column(name = "fc_gramos_promedio")
    private BigDecimal fcGramosPromedio;
    @Column(name = "fc_sobrevivencia")
    private BigDecimal fcSobrevivencia;
    @Column(name = "fc_biomasa")
    private BigDecimal fcBiomasa;
    @Column(name = "fc_venta")
    private BigDecimal fcVenta;
    @Column(name = "fc_talla1")
    private String fcTalla1;
    @Column(name = "fc_talla1_porcentaje")
    private BigDecimal fcTalla1Porcentaje;
    @Column(name = "fc_talla1_precio")
    private BigDecimal fcTalla1Precio;
    @Column(name = "fc_talla2")
    private String fcTalla2;
    @Column(name = "fc_talla2_porcentaje")
    private BigDecimal fcTalla2Porcentaje;
    @Column(name = "fc_talla2_precio")
    private BigDecimal fcTalla2Precio;
    
    public ConFlujoCajaValorizacionActivoBiologicoTO() {
    }

    public Integer getFcId() {
        return fcId;
    }

    public void setFcId(Integer fcId) {
        this.fcId = fcId;
    }

    public String getFcSector() {
        return fcSector;
    }

    public void setFcSector(String fcSector) {
        this.fcSector = fcSector;
    }

    public String getFcPiscina() {
        return fcPiscina;
    }

    public void setFcPiscina(String fcPiscina) {
        this.fcPiscina = fcPiscina;
    }

    public String getFcCorrida() {
        return fcCorrida;
    }

    public void setFcCorrida(String fcCorrida) {
        this.fcCorrida = fcCorrida;
    }

    public String getFcFecha() {
        return fcFecha;
    }

    public void setFcFecha(String fcFecha) {
        this.fcFecha = fcFecha;
    }

    public BigDecimal getFcGramosPromedio() {
        return fcGramosPromedio;
    }

    public void setFcGramosPromedio(BigDecimal fcGramosPromedio) {
        this.fcGramosPromedio = fcGramosPromedio;
    }

    public BigDecimal getFcSobrevivencia() {
        return fcSobrevivencia;
    }

    public void setFcSobrevivencia(BigDecimal fcSobrevivencia) {
        this.fcSobrevivencia = fcSobrevivencia;
    }

    public BigDecimal getFcBiomasa() {
        return fcBiomasa;
    }

    public void setFcBiomasa(BigDecimal fcBiomasa) {
        this.fcBiomasa = fcBiomasa;
    }

    public BigDecimal getFcVenta() {
        return fcVenta;
    }

    public void setFcVenta(BigDecimal fcVenta) {
        this.fcVenta = fcVenta;
    }

    public String getFcTalla1() {
        return fcTalla1;
    }

    public void setFcTalla1(String fcTalla1) {
        this.fcTalla1 = fcTalla1;
    }

    public BigDecimal getFcTalla1Porcentaje() {
        return fcTalla1Porcentaje;
    }

    public void setFcTalla1Porcentaje(BigDecimal fcTalla1Porcentaje) {
        this.fcTalla1Porcentaje = fcTalla1Porcentaje;
    }

    public BigDecimal getFcTalla1Precio() {
        return fcTalla1Precio;
    }

    public void setFcTalla1Precio(BigDecimal fcTalla1Precio) {
        this.fcTalla1Precio = fcTalla1Precio;
    }

    public String getFcTalla2() {
        return fcTalla2;
    }

    public void setFcTalla2(String fcTalla2) {
        this.fcTalla2 = fcTalla2;
    }

    public BigDecimal getFcTalla2Porcentaje() {
        return fcTalla2Porcentaje;
    }

    public void setFcTalla2Porcentaje(BigDecimal fcTalla2Porcentaje) {
        this.fcTalla2Porcentaje = fcTalla2Porcentaje;
    }

    public BigDecimal getFcTalla2Precio() {
        return fcTalla2Precio;
    }

    public void setFcTalla2Precio(BigDecimal fcTalla2Precio) {
        this.fcTalla2Precio = fcTalla2Precio;
    }

    
}
