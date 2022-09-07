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
@Table(name = "car_pagos", schema = "cartera")
public class CarPagos implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected CarPagosPK carPagosPK;
    @Column(name = "pag_auxiliar")
    private Boolean pagAuxiliar;
    @Column(name = "pag_saldo_anterior")
    private BigDecimal pagSaldoAnterior;
    @Column(name = "pag_valor")
    private BigDecimal pagValor;
    @Column(name = "pag_saldo_actual")
    private BigDecimal pagSaldoActual;
    @Column(name = "prov_empresa")
    private String provEmpresa;
    @Column(name = "prov_codigo")
    private String provCodigo;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "pag_codigo_transaccional")
    private String pagCodigoTransaccional;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carPagos")
    private List<CarPagosDetalleCompras> carPagosDetalleComprasList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carPagos")
    private List<CarPagosDetalleAnticipos> carPagosDetalleAnticiposList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carPagos")
    private List<CarPagosDetalleForma> carPagosDetalleFormaList;

    public CarPagos() {
    }

    public CarPagos(CarPagosPK carPagosPK) {
        this.carPagosPK = carPagosPK;
    }

    public CarPagos(CarPagosPK carPagosPK, Boolean pagAuxiliar, BigDecimal pagSaldoAnterior, BigDecimal pagValor,
            BigDecimal pagSaldoActual, String provEmpresa, String provCodigo, String usrEmpresa, String usrCodigo,
            Date usrFechaInserta, List<CarPagosDetalleCompras> carPagosDetalleComprasList,
            List<CarPagosDetalleAnticipos> carPagosDetalleAnticiposList,
            List<CarPagosDetalleForma> carPagosDetalleFormaList) {
        this.carPagosPK = carPagosPK;
        this.pagAuxiliar = pagAuxiliar;
        this.pagSaldoAnterior = pagSaldoAnterior;
        this.pagValor = pagValor;
        this.pagSaldoActual = pagSaldoActual;
        this.provEmpresa = provEmpresa;
        this.provCodigo = provCodigo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.carPagosDetalleComprasList = carPagosDetalleComprasList;
        this.carPagosDetalleAnticiposList = carPagosDetalleAnticiposList;
        this.carPagosDetalleFormaList = carPagosDetalleFormaList;
    }

    public BigDecimal getPagSaldoAnterior() {
        return pagSaldoAnterior;
    }

    public void setPagSaldoAnterior(BigDecimal pagSaldoAnterior) {
        this.pagSaldoAnterior = pagSaldoAnterior;
    }

    public BigDecimal getPagValor() {
        return pagValor;
    }

    public void setPagValor(BigDecimal pagValor) {
        this.pagValor = pagValor;
    }

    public BigDecimal getPagSaldoActual() {
        return pagSaldoActual;
    }

    public void setPagSaldoActual(BigDecimal pagSaldoActual) {
        this.pagSaldoActual = pagSaldoActual;
    }

    public CarPagos(String pagEmpresa, String pagPeriodo, String pagTipo, String pagNumero) {
        this.carPagosPK = new CarPagosPK(pagEmpresa, pagPeriodo, pagTipo, pagNumero);
    }

    public CarPagosPK getCarPagosPK() {
        return carPagosPK;
    }

    public void setCarPagosPK(CarPagosPK carPagosPK) {
        this.carPagosPK = carPagosPK;
    }

    public Boolean getPagAuxiliar() {
        return pagAuxiliar;
    }

    public void setPagAuxiliar(Boolean pagAuxiliar) {
        this.pagAuxiliar = pagAuxiliar;
    }

    public String getProvEmpresa() {
        return provEmpresa;
    }

    public void setProvEmpresa(String provEmpresa) {
        this.provEmpresa = provEmpresa;
    }

    public String getProvCodigo() {
        return provCodigo;
    }

    public void setProvCodigo(String provCodigo) {
        this.provCodigo = provCodigo;
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

    public List<CarPagosDetalleCompras> getCarPagosDetalleComprasList() {
        return carPagosDetalleComprasList;
    }

    public void setCarPagosDetalleComprasList(List<CarPagosDetalleCompras> carPagosDetalleComprasList) {
        this.carPagosDetalleComprasList = carPagosDetalleComprasList;
    }

    public List<CarPagosDetalleAnticipos> getCarPagosDetalleAnticiposList() {
        return carPagosDetalleAnticiposList;
    }

    public void setCarPagosDetalleAnticiposList(List<CarPagosDetalleAnticipos> carPagosDetalleAnticiposList) {
        this.carPagosDetalleAnticiposList = carPagosDetalleAnticiposList;
    }

    public List<CarPagosDetalleForma> getCarPagosDetalleFormaList() {
        return carPagosDetalleFormaList;
    }

    public void setCarPagosDetalleFormaList(List<CarPagosDetalleForma> carPagosDetalleFormaList) {
        this.carPagosDetalleFormaList = carPagosDetalleFormaList;
    }

    public String getPagCodigoTransaccional() {
        return pagCodigoTransaccional;
    }

    public void setPagCodigoTransaccional(String pagCodigoTransaccional) {
        this.pagCodigoTransaccional = pagCodigoTransaccional;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (carPagosPK != null ? carPagosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CarPagos)) {
            return false;
        }
        CarPagos other = (CarPagos) object;
        if ((this.carPagosPK == null && other.carPagosPK != null)
                || (this.carPagosPK != null && !this.carPagosPK.equals(other.carPagosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cartera.entity.CarPagos[ carPagosPK=" + carPagosPK + " ]";
    }

}
