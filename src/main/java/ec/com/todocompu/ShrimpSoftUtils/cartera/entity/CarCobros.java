package ec.com.todocompu.ShrimpSoftUtils.cartera.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "car_cobros", schema = "cartera")
public class CarCobros implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected CarCobrosPK carCobrosPK;
    @Column(name = "cob_auxiliar")
    private Boolean cobAuxiliar;
    @Column(name = "cob_saldo_anterior")
    private BigDecimal cobSaldoAnterior;
    @Column(name = "cob_valor")
    private BigDecimal cobValor;
    @Column(name = "cob_saldo_actual")
    private BigDecimal cobSaldoActual;
    @Column(name = "cli_empresa")
    private String cliEmpresa;
    @Column(name = "cli_codigo")
    private String cliCodigo;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "cob_codigo_transaccional")
    private String cobCodigoTransaccional;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carCobros")
    private List<CarCobrosDetalleForma> carCobrosDetalleFormaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carCobros")
    private List<CarCobrosDetalleVentas> carCobrosDetalleVentasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carCobros")
    private List<CarCobrosDetalleAnticipos> carCobrosDetalleAnticiposList;

    public CarCobros() {
    }

    public CarCobros(CarCobrosPK carCobrosPK) {
        this.carCobrosPK = carCobrosPK;
    }

    public CarCobros(CarCobrosPK carCobrosPK, Boolean cobAuxiliar, BigDecimal cobSaldoAnterior, BigDecimal cobValor,
            BigDecimal cobSaldoActual, String cliEmpresa, String cliCodigo, String usrEmpresa, String usrCodigo,
            Date usrFechaInserta, List<CarCobrosDetalleForma> carCobrosDetalleFormaList,
            List<CarCobrosDetalleVentas> carCobrosDetalleVentasList,
            List<CarCobrosDetalleAnticipos> carCobrosDetalleAnticiposList) {
        this.carCobrosPK = carCobrosPK;
        this.cobAuxiliar = cobAuxiliar;
        this.cobSaldoAnterior = cobSaldoAnterior;
        this.cobValor = cobValor;
        this.cobSaldoActual = cobSaldoActual;
        this.cliEmpresa = cliEmpresa;
        this.cliCodigo = cliCodigo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.carCobrosDetalleFormaList = carCobrosDetalleFormaList;
        this.carCobrosDetalleVentasList = carCobrosDetalleVentasList;
        this.carCobrosDetalleAnticiposList = carCobrosDetalleAnticiposList;
    }

    public BigDecimal getCobSaldoAnterior() {
        return cobSaldoAnterior;
    }

    public void setCobSaldoAnterior(BigDecimal cobSaldoAnterior) {
        this.cobSaldoAnterior = cobSaldoAnterior;
    }

    public BigDecimal getCobValor() {
        return cobValor;
    }

    public void setCobValor(BigDecimal cobValor) {
        this.cobValor = cobValor;
    }

    public BigDecimal getCobSaldoActual() {
        return cobSaldoActual;
    }

    public void setCobSaldoActual(BigDecimal cobSaldoActual) {
        this.cobSaldoActual = cobSaldoActual;
    }

    public CarCobros(String cobEmpresa, String cobPeriodo, String cobTipo, String cobNumero) {
        this.carCobrosPK = new CarCobrosPK(cobEmpresa, cobPeriodo, cobTipo, cobNumero);
    }

    public CarCobrosPK getCarCobrosPK() {
        return carCobrosPK;
    }

    public void setCarCobrosPK(CarCobrosPK carCobrosPK) {
        this.carCobrosPK = carCobrosPK;
    }

    public Boolean getCobAuxiliar() {
        return cobAuxiliar;
    }

    public void setCobAuxiliar(Boolean cobAuxiliar) {
        this.cobAuxiliar = cobAuxiliar;
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

    public List<CarCobrosDetalleForma> getCarCobrosDetalleFormaList() {
        return carCobrosDetalleFormaList;
    }

    public void setCarCobrosDetalleFormaList(List<CarCobrosDetalleForma> carCobrosDetalleFormaList) {
        this.carCobrosDetalleFormaList = carCobrosDetalleFormaList;
    }

    public List<CarCobrosDetalleVentas> getCarCobrosDetalleVentasList() {
        return carCobrosDetalleVentasList;
    }

    public void setCarCobrosDetalleVentasList(List<CarCobrosDetalleVentas> carCobrosDetalleVentasList) {
        this.carCobrosDetalleVentasList = carCobrosDetalleVentasList;
    }

    public List<CarCobrosDetalleAnticipos> getCarCobrosDetalleAnticiposList() {
        return carCobrosDetalleAnticiposList;
    }

    public void setCarCobrosDetalleAnticiposList(List<CarCobrosDetalleAnticipos> carCobrosDetalleAnticiposList) {
        this.carCobrosDetalleAnticiposList = carCobrosDetalleAnticiposList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carCobrosPK != null ? carCobrosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CarCobros)) {
            return false;
        }
        CarCobros other = (CarCobros) object;
        if ((this.carCobrosPK == null && other.carCobrosPK != null)
                || (this.carCobrosPK != null && !this.carCobrosPK.equals(other.carCobrosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cartera.entity.CarCobros[ carCobrosPK=" + carCobrosPK + " ]";
    }

    public String getCobCodigoTransaccional() {
        return cobCodigoTransaccional;
    }

    public void setCobCodigoTransaccional(String cobCodigoTransaccional) {
        this.cobCodigoTransaccional = cobCodigoTransaccional;
    }

}
