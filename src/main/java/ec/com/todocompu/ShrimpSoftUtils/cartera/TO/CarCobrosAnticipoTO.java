/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdPiscina;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class CarCobrosAnticipoTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ant_empresa")
    private String antEmpresa;

    @Column(name = "ant_periodo")
    private String antPeriodo;

    @Column(name = "ant_tipo")
    private String antTipo;

    @Column(name = "ant_numero")
    private String antNumero;

    @Column(name = "ant_valor")
    private java.math.BigDecimal antValor;

    @Column(name = "ant_cobrado")
    private Boolean antCobrado;

    @Column(name = "ant_reversado")
    private Boolean antReversado;

    @Column(name = "fp_secuencial")
    private Integer fpSecuencial;

    @Column(name = "cli_empresa")
    private String cliEmpresa;

    @Column(name = "cli_codigo")
    private String cliCodigo;

    @Column(name = "sec_empresa")
    private String secEmpresa;

    @Column(name = "sec_codigo")
    private String secCodigo;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    @Column(name = "det_cuenta")
    private String detCuenta;
    @Column(name = "det_fecha_vencimiento")
    private Date detFechaVencimiento;
    @Column(name = "dep_empresa")
    private String depEmpresa;
    @Column(name = "dep_periodo")
    private String depPeriodo;
    @Column(name = "dep_tipo")
    private String depTipo;
    @Column(name = "dep_numero")
    private String depNumero;
    @Column(name = "ban_empresa")
    private String banEmpresa;
    @Column(name = "ban_codigo")
    private String banCodigo;
    @Column(name = "cta_empresa")
    private String ctaEmpresa;
    @Column(name = "cta_codigo")
    private String ctaCodigo;
    @Column(name = "det_banco")
    private String detBanco;
    @Column(name = "det_referencia")
    private String detReferencia;
    @JoinColumns({
        @JoinColumn(name = "pis_empresa", referencedColumnName = "pis_empresa")
        ,
        @JoinColumn(name = "pis_sector", referencedColumnName = "pis_sector")
        ,
        @JoinColumn(name = "pis_numero", referencedColumnName = "pis_numero")})
    @ManyToOne(optional = false)
    private PrdPiscina prdPiscina;

    public CarCobrosAnticipoTO() {
    }

    public CarCobrosAnticipoTO(String antEmpresa, String antPeriodo, String antTipo, String antNumero,
            BigDecimal antValor, Boolean antCobrado, Boolean antReversado, Integer fpSecuencial, String cliEmpresa,
            String cliCodigo, String secEmpresa, String secCodigo, String usrEmpresa, String usrCodigo,
            String usrFechaInserta) {
        this.antEmpresa = antEmpresa;
        this.antPeriodo = antPeriodo;
        this.antTipo = antTipo;
        this.antNumero = antNumero;
        this.antValor = antValor;
        this.antCobrado = antCobrado;
        this.antReversado = antReversado;
        this.fpSecuencial = fpSecuencial;
        this.cliEmpresa = cliEmpresa;
        this.cliCodigo = cliCodigo;
        this.secEmpresa = secEmpresa;
        this.secCodigo = secCodigo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public Boolean getAntCobrado() {
        return antCobrado;
    }

    public void setAntCobrado(Boolean antCobrado) {
        this.antCobrado = antCobrado;
    }

    public String getAntEmpresa() {
        return antEmpresa;
    }

    public void setAntEmpresa(String antEmpresa) {
        this.antEmpresa = antEmpresa;
    }

    public String getAntNumero() {
        return antNumero;
    }

    public void setAntNumero(String antNumero) {
        this.antNumero = antNumero;
    }

    public String getAntPeriodo() {
        return antPeriodo;
    }

    public void setAntPeriodo(String antPeriodo) {
        this.antPeriodo = antPeriodo;
    }

    public String getAntTipo() {
        return antTipo;
    }

    public void setAntTipo(String antTipo) {
        this.antTipo = antTipo;
    }

    public BigDecimal getAntValor() {
        return antValor;
    }

    public void setAntValor(BigDecimal antValor) {
        this.antValor = antValor;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getCliEmpresa() {
        return cliEmpresa;
    }

    public void setCliEmpresa(String cliEmpresa) {
        this.cliEmpresa = cliEmpresa;
    }

    public Integer getFpSecuencial() {
        return fpSecuencial;
    }

    public void setFpSecuencial(Integer fpSecuencial) {
        this.fpSecuencial = fpSecuencial;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getSecEmpresa() {
        return secEmpresa;
    }

    public void setSecEmpresa(String secEmpresa) {
        this.secEmpresa = secEmpresa;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public Boolean getAntReversado() {
        return antReversado;
    }

    public void setAntReversado(Boolean antReversado) {
        this.antReversado = antReversado;
    }

    public String getBanEmpresa() {
        return banEmpresa;
    }

    public void setBanEmpresa(String banEmpresa) {
        this.banEmpresa = banEmpresa;
    }

    public String getBanCodigo() {
        return banCodigo;
    }

    public void setBanCodigo(String banCodigo) {
        this.banCodigo = banCodigo;
    }

    public String getDetCuenta() {
        return detCuenta;
    }

    public void setDetCuenta(String detCuenta) {
        this.detCuenta = detCuenta;
    }

    public Date getDetFechaVencimiento() {
        return detFechaVencimiento;
    }

    public void setDetFechaVencimiento(Date detFechaVencimiento) {
        this.detFechaVencimiento = detFechaVencimiento;
    }

    public String getDepEmpresa() {
        return depEmpresa;
    }

    public void setDepEmpresa(String depEmpresa) {
        this.depEmpresa = depEmpresa;
    }

    public String getDepPeriodo() {
        return depPeriodo;
    }

    public void setDepPeriodo(String depPeriodo) {
        this.depPeriodo = depPeriodo;
    }

    public String getDepTipo() {
        return depTipo;
    }

    public void setDepTipo(String depTipo) {
        this.depTipo = depTipo;
    }

    public String getDepNumero() {
        return depNumero;
    }

    public void setDepNumero(String depNumero) {
        this.depNumero = depNumero;
    }

    public String getCtaEmpresa() {
        return ctaEmpresa;
    }

    public void setCtaEmpresa(String ctaEmpresa) {
        this.ctaEmpresa = ctaEmpresa;
    }

    public String getCtaCodigo() {
        return ctaCodigo;
    }

    public void setCtaCodigo(String ctaCodigo) {
        this.ctaCodigo = ctaCodigo;
    }

    public String getDetBanco() {
        return detBanco;
    }

    public void setDetBanco(String detBanco) {
        this.detBanco = detBanco;
    }

    public String getDetReferencia() {
        return detReferencia;
    }

    public void setDetReferencia(String detReferencia) {
        this.detReferencia = detReferencia;
    }

    public PrdPiscina getPrdPiscina() {
        return prdPiscina;
    }

    public void setPrdPiscina(PrdPiscina prdPiscina) {
        this.prdPiscina = prdPiscina;
    }

}
