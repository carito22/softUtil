package ec.com.todocompu.ShrimpSoftUtils.cartera.entity;

import ec.com.todocompu.ShrimpSoftUtils.banco.entity.BanBanco;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConContable;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConCuentas;
import ec.com.todocompu.ShrimpSoftUtils.produccion.entity.PrdPiscina;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "car_cobros_anticipos", schema = "cartera")
public class CarCobrosAnticipos implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected CarCobrosAnticiposPK carCobrosAnticiposPK;
    @Column(name = "ant_valor")
    private BigDecimal antValor;
    @Column(name = "ant_cobrado")
    private boolean antCobrado;
    @Column(name = "ant_auxiliar")
    private boolean antAuxiliar;
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
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @JoinColumn(name = "fp_secuencial", referencedColumnName = "fp_secuencial")
    @ManyToOne(optional = false)
    private CarCobrosForma fpSecuencial;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carCobrosAnticipos")
    private List<CarCobrosDetalleAnticipos> carCobrosDetalleAnticiposList;
    @Column(name = "det_cuenta")
    private String detCuenta;
    @Column(name = "det_fecha_vencimiento")
    private Date detFechaVencimiento;

    @JoinColumns({
        @JoinColumn(name = "dep_empresa", referencedColumnName = "con_empresa")
        , @JoinColumn(name = "dep_periodo", referencedColumnName = "con_periodo")
        ,@JoinColumn(name = "dep_tipo", referencedColumnName = "con_tipo")
        ,@JoinColumn(name = "dep_numero", referencedColumnName = "con_numero")
    })
    @ManyToOne(optional = true)
    private ConContable conContableDeposito;

    @JoinColumns({
        @JoinColumn(name = "ban_empresa", referencedColumnName = "ban_empresa")
        ,@JoinColumn(name = "ban_codigo", referencedColumnName = "ban_codigo")})
    @ManyToOne(optional = true)
    private BanBanco banBanco;

    @JoinColumns({
        @JoinColumn(name = "cta_empresa", referencedColumnName = "cta_empresa")
        ,@JoinColumn(name = "cta_codigo", referencedColumnName = "cta_codigo")})
    @ManyToOne(optional = true)
    private ConCuentas conCuentas;

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
    @ManyToOne(optional = true)
    private PrdPiscina prdPiscina;

    public CarCobrosAnticipos() {
    }

    public CarCobrosAnticipos(CarCobrosAnticiposPK carCobrosAnticiposPK) {
        this.carCobrosAnticiposPK = carCobrosAnticiposPK;
    }

    public CarCobrosAnticipos(CarCobrosAnticiposPK carCobrosAnticiposPK, BigDecimal antValor, boolean antCobrado,
            boolean antAuxiliar, String cliEmpresa, String cliCodigo, String secEmpresa, String secCodigo,
            String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.carCobrosAnticiposPK = carCobrosAnticiposPK;
        this.antValor = antValor;
        this.antCobrado = antCobrado;
        this.antAuxiliar = antAuxiliar;
        this.cliEmpresa = cliEmpresa;
        this.cliCodigo = cliCodigo;
        this.secEmpresa = secEmpresa;
        this.secCodigo = secCodigo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public CarCobrosAnticipos(String antEmpresa, String antPeriodo, String antTipo, String antNumero) {
        this.carCobrosAnticiposPK = new CarCobrosAnticiposPK(antEmpresa, antPeriodo, antTipo, antNumero);
    }

    public CarCobrosAnticiposPK getCarCobrosAnticiposPK() {
        return carCobrosAnticiposPK;
    }

    public void setCarCobrosAnticiposPK(CarCobrosAnticiposPK carCobrosAnticiposPK) {
        this.carCobrosAnticiposPK = carCobrosAnticiposPK;
    }

    public BigDecimal getAntValor() {
        return antValor;
    }

    public void setAntValor(BigDecimal antValor) {
        this.antValor = antValor;
    }

    public boolean getAntCobrado() {
        return antCobrado;
    }

    public void setAntCobrado(boolean antCobrado) {
        this.antCobrado = antCobrado;
    }

    public boolean isAntAuxiliar() {
        return antAuxiliar;
    }

    public void setAntAuxiliar(boolean antAuxiliar) {
        this.antAuxiliar = antAuxiliar;
    }

    public String getCliEmpresa() {
        return cliEmpresa;
    }

    public void setCliEmpresa(String cliEmpresa) {
        this.cliEmpresa = cliEmpresa;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getSecEmpresa() {
        return secEmpresa;
    }

    public void setSecEmpresa(String secEmpresa) {
        this.secEmpresa = secEmpresa;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
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

    public CarCobrosForma getFpSecuencial() {
        return fpSecuencial;
    }

    public void setFpSecuencial(CarCobrosForma fpSecuencial) {
        this.fpSecuencial = fpSecuencial;
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

    public ConContable getConContableDeposito() {
        return conContableDeposito;
    }

    public void setConContableDeposito(ConContable conContableDEposito) {
        this.conContableDeposito = conContableDEposito;
    }

    public List<CarCobrosDetalleAnticipos> getCarCobrosDetalleAnticiposList() {
        return carCobrosDetalleAnticiposList;
    }

    public void setCarCobrosDetalleAnticiposList(List<CarCobrosDetalleAnticipos> carCobrosDetalleAnticiposList) {
        this.carCobrosDetalleAnticiposList = carCobrosDetalleAnticiposList;
    }

    public BanBanco getBanBanco() {
        return banBanco;
    }

    public void setBanBanco(BanBanco banBanco) {
        this.banBanco = banBanco;
    }

    public ConCuentas getConCuentas() {
        return conCuentas;
    }

    public void setConCuentas(ConCuentas conCuentas) {
        this.conCuentas = conCuentas;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carCobrosAnticiposPK != null ? carCobrosAnticiposPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CarCobrosAnticipos)) {
            return false;
        }
        CarCobrosAnticipos other = (CarCobrosAnticipos) object;
        if ((this.carCobrosAnticiposPK == null && other.carCobrosAnticiposPK != null)
                || (this.carCobrosAnticiposPK != null
                && !this.carCobrosAnticiposPK.equals(other.carCobrosAnticiposPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cartera.entity.CarCobrosAnticipos[ carCobrosAnticiposPK=" + carCobrosAnticiposPK + " ]";
    }

}
