package ec.com.todocompu.ShrimpSoftUtils.cartera.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.Size;

@Entity
@Table(name = "car_cobros_detalle_forma", schema = "cartera")
public class CarCobrosDetalleForma implements Serializable {

    @Size(max = 2147483647)
    @Column(name = "cta_empresa")
    private String ctaEmpresa;
    @Size(max = 2147483647)
    @Column(name = "cta_codigo")
    private String ctaCodigo;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "det_secuencial")
    private Integer detSecuencial;
    @Column(name = "det_banco")
    private String detBanco;
    @Column(name = "det_cuenta")
    private String detCuenta;
    @Column(name = "det_fecha_vencimiento")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date detFechaVencimiento;
    @Column(name = "det_valor")
    private BigDecimal detValor;
    @Column(name = "det_referencia")
    private String detReferencia;
    @Column(name = "det_observaciones")
    private String detObservaciones;
    @Column(name = "ban_empresa")
    private String banEmpresa;
    @Column(name = "ban_codigo")
    private String banCodigo;
    @JoinColumn(name = "fp_secuencial", referencedColumnName = "fp_secuencial")
    @ManyToOne(optional = false)
    private CarCobrosForma fpSecuencial;
    @JoinColumns({
        @JoinColumn(name = "cob_empresa", referencedColumnName = "cob_empresa")
        , @JoinColumn(name = "cob_periodo", referencedColumnName = "cob_periodo")
        , @JoinColumn(name = "cob_tipo", referencedColumnName = "cob_tipo")
        , @JoinColumn(name = "cob_numero", referencedColumnName = "cob_numero")})
    @ManyToOne(optional = false)
    private CarCobros carCobros;
    @Size(max = 2147483647)
    @Column(name = "dep_empresa")
    private String depEmpresa;
    @Size(max = 2147483647)
    @Column(name = "dep_periodo")
    private String depPeriodo;
    @Size(max = 2147483647)
    @Column(name = "dep_tipo")
    private String depTipo;
    @Size(max = 2147483647)
    @Column(name = "dep_numero")
    private String depNumero;

    public CarCobrosDetalleForma() {
    }

    public CarCobrosDetalleForma(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public CarCobrosDetalleForma(Integer detSecuencial, BigDecimal detValor) {
        this.detSecuencial = detSecuencial;
        this.detValor = detValor;
    }

    public CarCobrosDetalleForma(Integer detSecuencial, String detBanco, String detCuenta, Date detFechaVencimiento,
            BigDecimal detValor, String detReferencia, String detObservaciones, String banEmpresa, String banCodigo,
            CarCobrosForma fpSecuencial, CarCobros carCobros) {
        this.detSecuencial = detSecuencial;
        this.detBanco = detBanco;
        this.detCuenta = detCuenta;
        this.detFechaVencimiento = detFechaVencimiento;
        this.detValor = detValor;
        this.detReferencia = detReferencia;
        this.detObservaciones = detObservaciones;
        this.banEmpresa = banEmpresa;
        this.banCodigo = banCodigo;
        this.fpSecuencial = fpSecuencial;
        this.carCobros = carCobros;
    }

    public Integer getDetSecuencial() {
        return detSecuencial;
    }

    public void setDetSecuencial(Integer detSecuencial) {
        this.detSecuencial = detSecuencial;
    }

    public String getDetBanco() {
        return detBanco;
    }

    public void setDetBanco(String detBanco) {
        this.detBanco = detBanco;
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

    public BigDecimal getDetValor() {
        return detValor;
    }

    public void setDetValor(BigDecimal detValor) {
        this.detValor = detValor;
    }

    public String getDetReferencia() {
        return detReferencia;
    }

    public void setDetReferencia(String detReferencia) {
        this.detReferencia = detReferencia;
    }

    public String getDetObservaciones() {
        return detObservaciones;
    }

    public void setDetObservaciones(String detObservaciones) {
        this.detObservaciones = detObservaciones;
    }

    public String getBanCodigo() {
        return banCodigo;
    }

    public void setBanCodigo(String banCodigo) {
        this.banCodigo = banCodigo;
    }

    public String getBanEmpresa() {
        return banEmpresa;
    }

    public void setBanEmpresa(String banEmpresa) {
        this.banEmpresa = banEmpresa;
    }

    public CarCobrosForma getFpSecuencial() {
        return fpSecuencial;
    }

    public void setFpSecuencial(CarCobrosForma fpSecuencial) {
        this.fpSecuencial = fpSecuencial;
    }

    public CarCobros getCarCobros() {
        return carCobros;
    }

    public void setCarCobros(CarCobros carCobros) {
        this.carCobros = carCobros;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detSecuencial != null ? detSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CarCobrosDetalleForma)) {
            return false;
        }
        CarCobrosDetalleForma other = (CarCobrosDetalleForma) object;
        if ((this.detSecuencial == null && other.detSecuencial != null)
                || (this.detSecuencial != null && !this.detSecuencial.equals(other.detSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cartera.entity.CarCobrosDetalleForma[ detSecuencial=" + detSecuencial + " ]";
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

}
