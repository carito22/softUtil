/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "prd_ambiente_produccion", schema = "produccion")
public class PrdAmbienteProduccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "pro_ambiente_secuencial")
    private Integer proAmbienteSecuencial;

    @Column(name = "pro_ambiente_dias")
    private BigDecimal proAmbienteDias;
    @Column(name = "pro_conversion")
    private BigDecimal proConversion;
    @Column(name = "pro_ambiente_peso_promedio")
    private BigDecimal proAmbientePesoPromedio;
    @Column(name = "pro_ambiente_sobrevivencia")
    private BigDecimal proAmbienteSobrevivencia;
    @Column(name = "pro_ambiente_costo_hectarea_dia_directo")
    private BigDecimal proAmbienteCostoHectareaDiaDirecta;
    @Column(name = "pro_ambiente_costo_hectarea_dia_indirecto")
    private BigDecimal proAmbienteCostoHectareaDiaIndirecto;
    
    @Column(name = "cor_sector")
    private String corSector;
    @Column(name = "cor_piscina")
    private String corPiscina;
    @Column(name = "cor_numero")
    private String corNumero;
    
    @Column(name = "pis_sector")
    private String pisSector;
    @Column(name = "pis_numero")
    private String pisNumero;
                
    @Column(name = "sec_codigo")
    private String secCodigo;

    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;

    public PrdAmbienteProduccion() {
    }

    public Integer getProAmbienteSecuencial() {
        return proAmbienteSecuencial;
    }

    public void setProAmbienteSecuencial(Integer proAmbienteSecuencial) {
        this.proAmbienteSecuencial = proAmbienteSecuencial;
    }

    public BigDecimal getProAmbienteDias() {
        return proAmbienteDias;
    }

    public void setProAmbienteDias(BigDecimal proAmbienteDias) {
        this.proAmbienteDias = proAmbienteDias;
    }

    public BigDecimal getProConversion() {
        return proConversion;
    }

    public void setProConversion(BigDecimal proConversion) {
        this.proConversion = proConversion;
    }

    public BigDecimal getProAmbientePesoPromedio() {
        return proAmbientePesoPromedio;
    }

    public void setProAmbientePesoPromedio(BigDecimal proAmbientePesoPromedio) {
        this.proAmbientePesoPromedio = proAmbientePesoPromedio;
    }

    public BigDecimal getProAmbienteSobrevivencia() {
        return proAmbienteSobrevivencia;
    }

    public void setProAmbienteSobrevivencia(BigDecimal proAmbienteSobrevivencia) {
        this.proAmbienteSobrevivencia = proAmbienteSobrevivencia;
    }

    public BigDecimal getProAmbienteCostoHectareaDiaDirecta() {
        return proAmbienteCostoHectareaDiaDirecta;
    }

    public void setProAmbienteCostoHectareaDiaDirecta(BigDecimal proAmbienteCostoHectareaDiaDirecta) {
        this.proAmbienteCostoHectareaDiaDirecta = proAmbienteCostoHectareaDiaDirecta;
    }

    public BigDecimal getProAmbienteCostoHectareaDiaIndirecto() {
        return proAmbienteCostoHectareaDiaIndirecto;
    }

    public void setProAmbienteCostoHectareaDiaIndirecto(BigDecimal proAmbienteCostoHectareaDiaIndirecto) {
        this.proAmbienteCostoHectareaDiaIndirecto = proAmbienteCostoHectareaDiaIndirecto;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getCorSector() {
        return corSector;
    }

    public void setCorSector(String corSector) {
        this.corSector = corSector;
    }

    public String getCorPiscina() {
        return corPiscina;
    }

    public void setCorPiscina(String corPiscina) {
        this.corPiscina = corPiscina;
    }

    public String getCorNumero() {
        return corNumero;
    }

    public void setCorNumero(String corNumero) {
        this.corNumero = corNumero;
    }

    public String getPisSector() {
        return pisSector;
    }

    public void setPisSector(String pisSector) {
        this.pisSector = pisSector;
    }

    public String getPisNumero() {
        return pisNumero;
    }

    public void setPisNumero(String pisNumero) {
        this.pisNumero = pisNumero;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

}
