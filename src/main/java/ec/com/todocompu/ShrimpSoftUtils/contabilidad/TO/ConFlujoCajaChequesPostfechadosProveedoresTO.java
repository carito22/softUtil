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
public class ConFlujoCajaChequesPostfechadosProveedoresTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "chq_numero")
    private String chqNumero;
    @Column(name = "chq_beneficiario")
    private String chqBeneficiario;
    @Column(name = "chq_fecha")
    private String chqFecha;
    @Column(name = "chq_valor")
    private BigDecimal chqValor;
    
    public ConFlujoCajaChequesPostfechadosProveedoresTO() {
    }

    public String getChqNumero() {
        return chqNumero;
    }

    public void setChqNumero(String chqNumero) {
        this.chqNumero = chqNumero;
    }

    public String getChqBeneficiario() {
        return chqBeneficiario;
    }

    public void setChqBeneficiario(String chqBeneficiario) {
        this.chqBeneficiario = chqBeneficiario;
    }

    public String getChqFecha() {
        return chqFecha;
    }

    public void setChqFecha(String chqFecha) {
        this.chqFecha = chqFecha;
    }

    public BigDecimal getChqValor() {
        return chqValor;
    }

    public void setChqValor(BigDecimal chqValor) {
        this.chqValor = chqValor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
