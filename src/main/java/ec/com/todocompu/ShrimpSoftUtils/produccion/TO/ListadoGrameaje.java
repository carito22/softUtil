package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ListadoGrameaje implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private Integer id;
    @Column(name = "gra_dias")
    private Integer graDias;
    @Column(name = "gra_fecha")
    private String graFecha;
    @Column(name = "gra_tpromedio")
    private BigDecimal graTpromedio;
    @Column(name = "gra_ipromedio")
    private BigDecimal graIpromedio;
    @Column(name = "gra_biomasa")
    private BigDecimal graBiomasa;
    @Column(name = "gra_sobrevivencia")
    private BigDecimal graSobrevivencia;
    @Column(name = "gra_balanceado_acumulado")
    private BigDecimal graBalanciadoAcumulado;
    @Column(name = "gra_promedio_semanal")
    private BigDecimal graPromedioSemanal;
    @Column(name = "gra_biomasa_hectarea")
    private BigDecimal graBiomasaHectarea;
    @Column(name = "gra_balanceado")
    private BigDecimal graBalanceado;
    @Column(name = "gra_balanceado_hectarea")
    private BigDecimal graBalanceadoHectarea;
    @Column(name = "gra_conversion_alimenticia")
    private BigDecimal graConversionAlimenticia;
    @Column(name = "gra_comentario")
    private String graComentario;
    @Column(name = "gra_balanceado_costo")
    private BigDecimal graBalanceadoCosto;

    public ListadoGrameaje() {
    }

    public String getGraFecha() {
        return graFecha;
    }

    public void setGraFecha(String graFecha) {
        this.graFecha = graFecha;
    }

    public BigDecimal getGraTpromedio() {
        return graTpromedio;
    }

    public void setGraTpromedio(BigDecimal graTpromedio) {
        this.graTpromedio = graTpromedio;
    }

    public BigDecimal getGraIpromedio() {
        return graIpromedio;
    }

    public void setGraIpromedio(BigDecimal graIpromedio) {
        this.graIpromedio = graIpromedio;
    }

    public BigDecimal getGraBiomasa() {
        return graBiomasa;
    }

    public void setGraBiomasa(BigDecimal graBiomasa) {
        this.graBiomasa = graBiomasa;
    }

    public BigDecimal getGraSobrevivencia() {
        return graSobrevivencia;
    }

    public void setGraSobrevivencia(BigDecimal graSobrevivencia) {
        this.graSobrevivencia = graSobrevivencia;
    }

    public BigDecimal getGraBalanciadoAcumulado() {
        return graBalanciadoAcumulado;
    }

    public void setGraBalanciadoAcumulado(BigDecimal graBalanciadoAcumulado) {
        this.graBalanciadoAcumulado = graBalanciadoAcumulado;
    }

    public String getGraComentario() {
        return graComentario;
    }

    public void setGraComentario(String graComentario) {
        this.graComentario = graComentario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getGraPromedioSemanal() {
        return graPromedioSemanal;
    }

    public void setGraPromedioSemanal(BigDecimal graPromedioSemanal) {
        this.graPromedioSemanal = graPromedioSemanal;
    }

    public BigDecimal getGraBiomasaHectarea() {
        return graBiomasaHectarea;
    }

    public void setGraBiomasaHectarea(BigDecimal graBiomasaHectarea) {
        this.graBiomasaHectarea = graBiomasaHectarea;
    }

    public BigDecimal getGraBalanceado() {
        return graBalanceado;
    }

    public void setGraBalanceado(BigDecimal graBalanceado) {
        this.graBalanceado = graBalanceado;
    }

    public BigDecimal getGraBalanceadoHectarea() {
        return graBalanceadoHectarea;
    }

    public void setGraBalanceadoHectarea(BigDecimal graBalanceadoHectarea) {
        this.graBalanceadoHectarea = graBalanceadoHectarea;
    }

    public BigDecimal getGraConversionAlimenticia() {
        return graConversionAlimenticia;
    }

    public void setGraConversionAlimenticia(BigDecimal graConversionAlimenticia) {
        this.graConversionAlimenticia = graConversionAlimenticia;
    }

    public Integer getGraDias() {
        return graDias;
    }

    public void setGraDias(Integer graDias) {
        this.graDias = graDias;
    }

    public BigDecimal getGraBalanceadoCosto() {
        return graBalanceadoCosto;
    }

    public void setGraBalanceadoCosto(BigDecimal graBalanceadoCosto) {
        this.graBalanceadoCosto = graBalanceadoCosto;
    }

}
