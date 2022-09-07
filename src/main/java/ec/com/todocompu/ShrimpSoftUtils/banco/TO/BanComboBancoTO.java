/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.banco.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class BanComboBancoTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Column(name = "ban_nombre")
    private String banNombre;

    @Column(name = "cta_numero")
    private String ctaNumero;

    @Column(name = "cta_titular")
    private String ctaTitular;

    @Id
    @Column(name = "cta_cuenta_contable")
    private String ctaContable;

    @Column(name = "cta_codigo_bancario")
    private String ctaCodigoBancario;

    @Column(name = "cta_prefijo_bancario")
    private String ctaPrefijoBancario;

    @Column(name = "cta_formato_cheque")
    private String ctaFormatoCheque;

    public BanComboBancoTO() {
    }

    public BanComboBancoTO(String banNombre, String ctaNumero, String ctaTitular, String ctaContable,
            String ctaCodigoBancario, String ctaPrefijoBancario, String ctaFormatoCheque) {
        this.banNombre = banNombre;
        this.ctaNumero = ctaNumero;
        this.ctaTitular = ctaTitular;
        this.ctaContable = ctaContable;
        this.ctaCodigoBancario = ctaCodigoBancario;
        this.ctaPrefijoBancario = ctaPrefijoBancario;
        this.ctaFormatoCheque = ctaFormatoCheque;
    }

    public String getBanNombre() {
        return banNombre;
    }

    public void setBanNombre(String banNombre) {
        this.banNombre = banNombre;
    }

    public String getCtaCodigoBancario() {
        return ctaCodigoBancario;
    }

    public void setCtaCodigoBancario(String ctaCodigoBancario) {
        this.ctaCodigoBancario = ctaCodigoBancario;
    }

    public String getCtaContable() {
        return ctaContable;
    }

    public void setCtaContable(String ctaContable) {
        this.ctaContable = ctaContable;
    }

    public String getCtaNumero() {
        return ctaNumero;
    }

    public void setCtaNumero(String ctaNumero) {
        this.ctaNumero = ctaNumero;
    }

    public String getCtaPrefijoBancario() {
        return ctaPrefijoBancario;
    }

    public void setCtaPrefijoBancario(String ctaPrefijoBancario) {
        this.ctaPrefijoBancario = ctaPrefijoBancario;
    }

    public String getCtaTitular() {
        return ctaTitular;
    }

    public void setCtaTitular(String ctaTitular) {
        this.ctaTitular = ctaTitular;
    }

    public String getCtaFormatoCheque() {
        return ctaFormatoCheque;
    }

    public void setCtaFormatoCheque(String ctaFormatoCheque) {
        this.ctaFormatoCheque = ctaFormatoCheque;
    }

    @Override
    public String toString() {
        return this.banNombre + " - " + this.ctaNumero;
    }
}
