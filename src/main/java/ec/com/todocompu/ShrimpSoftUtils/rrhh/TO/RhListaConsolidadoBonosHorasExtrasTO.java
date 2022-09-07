/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class RhListaConsolidadoBonosHorasExtrasTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "cbhe_categoria")
    private String cbheCategoria;

    @Column(name = "cbhe_id")
    private String cbheId;

    @Column(name = "cbhe_nombres")
    private String cbheNombres;

    @Column(name = "cbhe_rol_horas_extras")
    private BigDecimal cbheRolHorasExtras;

    @Column(name = "cbhe_rol_horas_extras_100")
    private BigDecimal cbheRolHorasExtras100;

    @Column(name = "cbhe_rol_horas_extras_extraordinarias_100")
    private BigDecimal cbheRolHorasExtrasExtraordinarias100;

    @Column(name = "cbhe_bonos")
    private BigDecimal cbheBonos;

    @Column(name = "cbhe_bonos_nd")
    private BigDecimal cbheBonosND;

    @Column(name = "cbhe_bono_fijo")
    private BigDecimal cbheBonoFijo;

    @Column(name = "cbhe_bono_fijo_nd")
    private BigDecimal cbheBonoFijoND;

    @Column(name = "cbhe_horas_extras")
    private BigDecimal cbheHorasExtras;

    @Column(name = "cbhe_horas_extras_100")
    private BigDecimal cbheHorasExtras100;

    @Column(name = "cbhe_horas_extras_extraordinarias_100")
    private BigDecimal cbheHorasExtrasExtraordinarias100;

    @Column(name = "cbhe_total")
    private BigDecimal cbheTotal;

    public RhListaConsolidadoBonosHorasExtrasTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCbheCategoria() {
        return cbheCategoria;
    }

    public void setCbheCategoria(String cbheCategoria) {
        this.cbheCategoria = cbheCategoria;
    }

    public String getCbheId() {
        return cbheId;
    }

    public void setCbheId(String cbheId) {
        this.cbheId = cbheId;
    }

    public String getCbheNombres() {
        return cbheNombres;
    }

    public void setCbheNombres(String cbheNombres) {
        this.cbheNombres = cbheNombres;
    }

    public BigDecimal getCbheRolHorasExtras() {
        return cbheRolHorasExtras;
    }

    public void setCbheRolHorasExtras(BigDecimal cbheRolHorasExtras) {
        this.cbheRolHorasExtras = cbheRolHorasExtras;
    }

    public BigDecimal getCbheRolHorasExtras100() {
        return cbheRolHorasExtras100;
    }

    public void setCbheRolHorasExtras100(BigDecimal cbheRolHorasExtras100) {
        this.cbheRolHorasExtras100 = cbheRolHorasExtras100;
    }

    public BigDecimal getCbheRolHorasExtrasExtraordinarias100() {
        return cbheRolHorasExtrasExtraordinarias100;
    }

    public void setCbheRolHorasExtrasExtraordinarias100(BigDecimal cbheRolHorasExtrasExtraordinarias100) {
        this.cbheRolHorasExtrasExtraordinarias100 = cbheRolHorasExtrasExtraordinarias100;
    }

    public BigDecimal getCbheBonos() {
        return cbheBonos;
    }

    public void setCbheBonos(BigDecimal cbheBonos) {
        this.cbheBonos = cbheBonos;
    }

    public BigDecimal getCbheBonosND() {
        return cbheBonosND;
    }

    public void setCbheBonosND(BigDecimal cbheBonosND) {
        this.cbheBonosND = cbheBonosND;
    }

    public BigDecimal getCbheBonoFijo() {
        return cbheBonoFijo;
    }

    public void setCbheBonoFijo(BigDecimal cbheBonoFijo) {
        this.cbheBonoFijo = cbheBonoFijo;
    }

    public BigDecimal getCbheBonoFijoND() {
        return cbheBonoFijoND;
    }

    public void setCbheBonoFijoND(BigDecimal cbheBonoFijoND) {
        this.cbheBonoFijoND = cbheBonoFijoND;
    }

    public BigDecimal getCbheHorasExtras() {
        return cbheHorasExtras;
    }

    public void setCbheHorasExtras(BigDecimal cbheHorasExtras) {
        this.cbheHorasExtras = cbheHorasExtras;
    }

    public BigDecimal getCbheHorasExtras100() {
        return cbheHorasExtras100;
    }

    public void setCbheHorasExtras100(BigDecimal cbheHorasExtras100) {
        this.cbheHorasExtras100 = cbheHorasExtras100;
    }

    public BigDecimal getCbheHorasExtrasExtraordinarias100() {
        return cbheHorasExtrasExtraordinarias100;
    }

    public void setCbheHorasExtrasExtraordinarias100(BigDecimal cbheHorasExtrasExtraordinarias100) {
        this.cbheHorasExtrasExtraordinarias100 = cbheHorasExtrasExtraordinarias100;
    }

    public BigDecimal getCbheTotal() {
        return cbheTotal;
    }

    public void setCbheTotal(BigDecimal cbheTotal) {
        this.cbheTotal = cbheTotal;
    }

}
