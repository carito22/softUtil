/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
 * @author Usuario1
 */
@Entity
public class RhListaConsolidadoHorasExtrasTO implements Serializable{
    private static final long serialVserionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "che_categoria")
    private String cheCategoria;
    
    @Column(name = "che_id")
    private String cheId;
    
    @Column(name = "che_nombres")
    private String cheNombres;
    
    @Column(name = "che_rol_valor_50")
    private BigDecimal cheRolValor50;
    
    @Column(name = "che_rol_valor_100")
    private BigDecimal cheRolValor100;
    
    @Column(name = "che_rol_valor_extraordinario")
    private BigDecimal cheRolValorExtraordinario;
    
    @Column(name = "che_valor_50")
    private BigDecimal cheValor50;
    
    @Column(name = "che_valor_100")
    private BigDecimal cheValor100;
    
    @Column(name = "che_valor_extraordinaria")
    private BigDecimal cheValorExtraordinaria;
    
    @Column(name = "che_total")
    private BigDecimal cheTotal;

    public RhListaConsolidadoHorasExtrasTO(){
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCheCategoria() {
        return cheCategoria;
    }

    public void setCheCategoria(String cheCategoria) {
        this.cheCategoria = cheCategoria;
    }

    public String getCheId() {
        return cheId;
    }

    public void setCheId(String cheId) {
        this.cheId = cheId;
    }

    public String getCheNombres() {
        return cheNombres;
    }

    public void setCheNombres(String cheNombres) {
        this.cheNombres = cheNombres;
    }

    public BigDecimal getCheRolValor50() {
        return cheRolValor50;
    }

    public void setCheRolValor50(BigDecimal cheRolValor50) {
        this.cheRolValor50 = cheRolValor50;
    }

    public BigDecimal getCheRolValor100() {
        return cheRolValor100;
    }

    public void setCheRolValor100(BigDecimal cheRolValor100) {
        this.cheRolValor100 = cheRolValor100;
    }

    public BigDecimal getCheRolValorExtraordinario() {
        return cheRolValorExtraordinario;
    }

    public void setCheRolValorExtraordinario(BigDecimal cheRolValorExtraordinario) {
        this.cheRolValorExtraordinario = cheRolValorExtraordinario;
    }

    public BigDecimal getCheValor50() {
        return cheValor50;
    }

    public void setCheValor50(BigDecimal cheValor50) {
        this.cheValor50 = cheValor50;
    }

    public BigDecimal getCheValor100() {
        return cheValor100;
    }

    public void setCheValor100(BigDecimal cheValor100) {
        this.cheValor100 = cheValor100;
    }

    public BigDecimal getCheValorExtraordinaria() {
        return cheValorExtraordinaria;
    }

    public void setCheValorExtraordinaria(BigDecimal cheValorExtraordinaria) {
        this.cheValorExtraordinaria = cheValorExtraordinaria;
    }

    public BigDecimal getCheTotal() {
        return cheTotal;
    }

    public void setCheTotal(BigDecimal cheTotal) {
        this.cheTotal = cheTotal;
    }
    
    
}
