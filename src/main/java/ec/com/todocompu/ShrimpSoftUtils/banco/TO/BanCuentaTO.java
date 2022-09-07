/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.banco.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class BanCuentaTO implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "cta_empresa")
    private String ctaEmpresa;

    @Column(name = "cta_cuenta_contable")
    private String ctaContable;

    @Column(name = "cta_numero")
    private String ctaNumero;

    @Column(name = "cta_titular")
    private String ctaTitular;

    @Column(name = "cta_oficial")
    private String ctaOficial;

    @Column(name = "cta_codigo_bancario")
    private String ctaCodigoBancario;

    @Column(name = "cta_prefijo_bancario")
    private String ctaPrefijoBancario;

    @Column(name = "cta_formato_cheque")
    private String ctaFormatoCheque;

    @Column(name = "usr_inserta_cuenta")
    private String usrInsertaCuenta;

    @Column(name = "usr_inserta_empresa")
    private String usrInsertaEmpresa;

    @Column(name = "usr_fecha_inserta_cuenta")
    private String usrFechaInsertaCuenta;
    
    @Column(name = "usr_codigo")
    private String usrCodigo;
    
    @Column(name = "cta_numeracion")
    private String ctaNumeracion;

    public BanCuentaTO() {
    }

    public BanCuentaTO(String ctaEmpresa, String ctaContable, String ctaNumero, String ctaTitular, String ctaOficial,
            String ctaCodigoBancario, String ctaPrefijoBancario, String ctaFormatoCheque, String usrInsertaCuenta,
            String usrInsertaEmpresa, String usrFechaInsertaCuenta) {
        this.ctaEmpresa = ctaEmpresa;
        this.ctaContable = ctaContable;
        this.ctaNumero = ctaNumero;
        this.ctaTitular = ctaTitular;
        this.ctaOficial = ctaOficial;
        this.ctaCodigoBancario = ctaCodigoBancario;
        this.ctaPrefijoBancario = ctaPrefijoBancario;
        this.ctaFormatoCheque = ctaFormatoCheque;
        this.usrInsertaCuenta = usrInsertaCuenta;
        this.usrInsertaEmpresa = usrInsertaEmpresa;
        this.usrFechaInsertaCuenta = usrFechaInsertaCuenta;
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

    public String getCtaEmpresa() {
        return ctaEmpresa;
    }

    public void setCtaEmpresa(String ctaEmpresa) {
        this.ctaEmpresa = ctaEmpresa;
    }

    public String getCtaFormatoCheque() {
        return ctaFormatoCheque;
    }

    public void setCtaFormatoCheque(String ctaFormatoCheque) {
        this.ctaFormatoCheque = ctaFormatoCheque;
    }

    public String getCtaNumero() {
        return ctaNumero;
    }

    public void setCtaNumero(String ctaNumero) {
        this.ctaNumero = ctaNumero;
    }

    public String getCtaOficial() {
        return ctaOficial;
    }

    public void setCtaOficial(String ctaOficial) {
        this.ctaOficial = ctaOficial;
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

    public String getUsrFechaInsertaCuenta() {
        return usrFechaInsertaCuenta;
    }

    public void setUsrFechaInsertaCuenta(String usrFechaInsertaCuenta) {
        this.usrFechaInsertaCuenta = usrFechaInsertaCuenta;
    }

    public String getUsrInsertaCuenta() {
        return usrInsertaCuenta;
    }

    public void setUsrInsertaCuenta(String usrInsertaCuenta) {
        this.usrInsertaCuenta = usrInsertaCuenta;
    }

    public String getUsrInsertaEmpresa() {
        return usrInsertaEmpresa;
    }

    public void setUsrInsertaEmpresa(String usrInsertaEmpresa) {
        this.usrInsertaEmpresa = usrInsertaEmpresa;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getCtaNumeracion() {
        return ctaNumeracion;
    }

    public void setCtaNumeracion(String ctaNumeracion) {
        this.ctaNumeracion = ctaNumeracion;
    }
    
}
