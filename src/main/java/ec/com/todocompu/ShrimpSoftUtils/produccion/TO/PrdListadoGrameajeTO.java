package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdListadoGrameajeTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "gra_dias")
    private Integer graDias;
    @Column(name = "gra_fecha")
    private String graFecha;
    @Column(name = "gra_tpromedio")
    private BigDecimal gratPromedio;
    @Column(name = "gra_ipromedio")
    private BigDecimal graiPromedio;
    @Column(name = "gra_biomasa")
    private BigDecimal graBiomasa;
    @Column(name = "gra_sobrevivencia")
    private BigDecimal graSobrevivencia;
    @Column(name = "gra_balanceado_acumulado")
    private BigDecimal gratBalanceadoAcumulado;
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
    @Column(name = "gra_balanceado_costo")
    private BigDecimal graBalanceadoCosto;
    @Column(name = "gra_comentario")
    private String graComentario;

    public PrdListadoGrameajeTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGraFecha() {
        return graFecha;
    }

    public void setGraFecha(String graFecha) {
        this.graFecha = graFecha;
    }

    public BigDecimal getGratPromedio() {
        return gratPromedio;
    }

    public void setGratPromedio(BigDecimal gratPromedio) {
        this.gratPromedio = gratPromedio;
    }

    public BigDecimal getGraiPromedio() {
        return graiPromedio;
    }

    public void setGraiPromedio(BigDecimal graiPromedio) {
        this.graiPromedio = graiPromedio;
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

    public BigDecimal getGratBalanceadoAcumulado() {
        return gratBalanceadoAcumulado;
    }

    public void setGratBalanceadoAcumulado(BigDecimal gratBalanceadoAcumulado) {
        this.gratBalanceadoAcumulado = gratBalanceadoAcumulado;
    }

    public String getGraComentario() {
        return graComentario;
    }

    public void setGraComentario(String graComentario) {
        this.graComentario = graComentario;
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

    @Override
    public String toString() {
        return "PrdListadoGrameajeTO [id=" + id + ", graFecha=" + graFecha + ", gratPromedio=" + gratPromedio
                + ", graiPromedio=" + graiPromedio + ", graBiomasa=" + graBiomasa + ", graSobrevivencia="
                + graSobrevivencia + ", gratBalanceadoAcumulado=" + gratBalanceadoAcumulado + ", graComentario="
                + graComentario + "]";
    }

}
