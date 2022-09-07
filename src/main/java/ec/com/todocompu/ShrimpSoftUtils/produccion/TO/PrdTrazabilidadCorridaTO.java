/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author VALDIVIEZO
 */
@Entity
public class PrdTrazabilidadCorridaTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "traz_sector")
    private String trazSector;

    @Column(name = "traz_piscina")
    private String trazPiscina;

    @Column(name = "traz_corrida")
    private String trazCorrida;

    @Column(name = "traz_larvas")
    private Integer trazLarvas;

    @Column(name = "traz_porcentaje")
    private BigDecimal trazPorcentaje;

    @Column(name = "traz_siembra")
    private Date trazSiembra;

    @Column(name = "traz_laboratorio")
    private String trazLaboratorio;

    @Column(name = "traz_nauplio")
    private String trazNauplio;

    public PrdTrazabilidadCorridaTO() {
    }

    public PrdTrazabilidadCorridaTO(Integer id, String trazSector, String trazPiscina, String trazCorrida, Integer trazLarvas, BigDecimal trazPorcentaje, Date trazSiembra) {
        this.id = id;
        this.trazSector = trazSector;
        this.trazPiscina = trazPiscina;
        this.trazCorrida = trazCorrida;
        this.trazLarvas = trazLarvas;
        this.trazPorcentaje = trazPorcentaje;
        this.trazSiembra = trazSiembra;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTrazSector() {
        return trazSector;
    }

    public void setTrazSector(String trazSector) {
        this.trazSector = trazSector;
    }

    public String getTrazPiscina() {
        return trazPiscina;
    }

    public void setTrazPiscina(String trazPiscina) {
        this.trazPiscina = trazPiscina;
    }

    public String getTrazCorrida() {
        return trazCorrida;
    }

    public void setTrazCorrida(String trazCorrida) {
        this.trazCorrida = trazCorrida;
    }

    public Integer getTrazLarvas() {
        return trazLarvas;
    }

    public void setTrazLarvas(Integer trazLarvas) {
        this.trazLarvas = trazLarvas;
    }

    public BigDecimal getTrazPorcentaje() {
        return trazPorcentaje;
    }

    public void setTrazPorcentaje(BigDecimal trazPorcentaje) {
        this.trazPorcentaje = trazPorcentaje;
    }

    public Date getTrazSiembra() {
        return trazSiembra;
    }

    public void setTrazSiembra(Date trazSiembra) {
        this.trazSiembra = trazSiembra;
    }

    public String getTrazLaboratorio() {
        return trazLaboratorio;
    }

    public void setTrazLaboratorio(String trazLaboratorio) {
        this.trazLaboratorio = trazLaboratorio;
    }

    public String getTrazNauplio() {
        return trazNauplio;
    }

    public void setTrazNauplio(String trazNauplio) {
        this.trazNauplio = trazNauplio;
    }

}
