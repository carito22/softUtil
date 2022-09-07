package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrdListaConsultaGrameajePromedioPorPiscinaTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "gra_piscina")
    private String graPiscina;
    @Column(name = "gra_laboratorio")
    private String graLaboratorio;
    @Column(name = "gra_densidad")
    private BigDecimal graDensidad;
    @Column(name = "gra_fecha")
    private String graFecha;
    @Column(name = "cor_fecha_siembra")
    private String corFechaSiembra;
    @Column(name = "gra_edad")
    private String graEdad;
    @Column(name = "gra_tpromedio")
    private String graTPromedio;
    @Column(name = "gra_sobrevivencia")
    private String graSobrevivencia;

    public PrdListaConsultaGrameajePromedioPorPiscinaTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCorFechaSiembra() {
        return corFechaSiembra;
    }

    public void setCorFechaSiembra(String corFechaSiembra) {
        this.corFechaSiembra = corFechaSiembra;
    }

    public String getGraEdad() {
        return graEdad;
    }

    public void setGraEdad(String graEdad) {
        this.graEdad = graEdad;
    }

    public String getGraFecha() {
        return graFecha;
    }

    public void setGraFecha(String graFecha) {
        this.graFecha = graFecha;
    }

    public String getGraPiscina() {
        return graPiscina;
    }

    public void setGraPiscina(String graPiscina) {
        this.graPiscina = graPiscina;
    }

    public String getGraTPromedio() {
        return graTPromedio;
    }

    public void setGraTPromedio(String graTPromedio) {
        this.graTPromedio = graTPromedio;
    }

    public String getGraSobrevivencia() {
        return graSobrevivencia;
    }

    public void setGraSobrevivencia(String graSobrevivencia) {
        this.graSobrevivencia = graSobrevivencia;
    }

    public String getGraLaboratorio() {
        return graLaboratorio;
    }

    public void setGraLaboratorio(String graLaboratorio) {
        this.graLaboratorio = graLaboratorio;
    }

    public BigDecimal getGraDensidad() {
        return graDensidad;
    }

    public void setGraDensidad(BigDecimal graDensidad) {
        this.graDensidad = graDensidad;
    }
    
}
