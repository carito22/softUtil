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
 * @author Mario Ramos Duque
 */
@Entity
public class RhListaDetalleHorasExtrasTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "db_categoria")
    private String dbCategoria;

    @Column(name = "db_fecha")
    private String dbFecha;

    @Column(name = "db_id")
    private String dbId;

    @Column(name = "db_nombres")
    private String dbNombres;

    @Column(name = "db_concepto")
    private String dbConcepto;

    @Column(name = "db_sector")
    private String dbSector;

    @Column(name = "db_piscina")
    private String dbPiscina;

    @Column(name = "db_valor_50")
    private BigDecimal dbValor50;

    @Column(name = "db_valor_100")
    private BigDecimal dbValor100;

    @Column(name = "db_valor_extraordinarias_100")
    private BigDecimal dbValorExtraordinarias100;

    @Column(name = "db_pendiente")
    private Boolean dbPendiente;

    @Column(name = "db_reversado")
    private Boolean dbReversado;

    @Column(name = "db_anulado")
    private Boolean dbAnulado;

    @Column(name = "db_contable")
    private String dbContable;

    @Column(name = "db_observaciones")
    private String dbObservaciones;

    public RhListaDetalleHorasExtrasTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDbCategoria() {
        return dbCategoria;
    }

    public void setDbCategoria(String dbCategoria) {
        this.dbCategoria = dbCategoria;
    }

    public String getDbFecha() {
        return dbFecha;
    }

    public void setDbFecha(String dbFecha) {
        this.dbFecha = dbFecha;
    }

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    public String getDbNombres() {
        return dbNombres;
    }

    public void setDbNombres(String dbNombres) {
        this.dbNombres = dbNombres;
    }

    public String getDbConcepto() {
        return dbConcepto;
    }

    public void setDbConcepto(String dbConcepto) {
        this.dbConcepto = dbConcepto;
    }

    public String getDbSector() {
        return dbSector;
    }

    public void setDbSector(String dbSector) {
        this.dbSector = dbSector;
    }

    public String getDbPiscina() {
        return dbPiscina;
    }

    public void setDbPiscina(String dbPiscina) {
        this.dbPiscina = dbPiscina;
    }

    public Boolean getDbPendiente() {
        return dbPendiente;
    }

    public void setDbPendiente(Boolean dbPendiente) {
        this.dbPendiente = dbPendiente;
    }

    public Boolean getDbReversado() {
        return dbReversado;
    }

    public void setDbReversado(Boolean dbReversado) {
        this.dbReversado = dbReversado;
    }

    public Boolean getDbAnulado() {
        return dbAnulado;
    }

    public void setDbAnulado(Boolean dbAnulado) {
        this.dbAnulado = dbAnulado;
    }

    public String getDbContable() {
        return dbContable;
    }

    public void setDbContable(String dbContable) {
        this.dbContable = dbContable;
    }

    public String getDbObservaciones() {
        return dbObservaciones;
    }

    public void setDbObservaciones(String dbObservaciones) {
        this.dbObservaciones = dbObservaciones;
    }

    public BigDecimal getDbValor50() {
        return dbValor50;
    }

    public void setDbValor50(BigDecimal dbValor50) {
        this.dbValor50 = dbValor50;
    }

    public BigDecimal getDbValor100() {
        return dbValor100;
    }

    public void setDbValor100(BigDecimal dbValor100) {
        this.dbValor100 = dbValor100;
    }

    public BigDecimal getDbValorExtraordinarias100() {
        return dbValorExtraordinarias100;
    }

    public void setDbValorExtraordinarias100(BigDecimal dbValorExtraordinarias100) {
        this.dbValorExtraordinarias100 = dbValorExtraordinarias100;
    }

}
