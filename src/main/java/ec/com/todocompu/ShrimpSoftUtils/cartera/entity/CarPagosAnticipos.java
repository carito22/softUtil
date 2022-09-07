package ec.com.todocompu.ShrimpSoftUtils.cartera.entity;

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
@Table(name = "car_pagos_anticipos", schema = "cartera")
public class CarPagosAnticipos implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    protected CarPagosAnticiposPK carPagosAnticiposPK;
    @Column(name = "ant_valor")
    private BigDecimal antValor;
    @Column(name = "ant_pagado")
    private boolean antPagado;
    @Column(name = "ant_auxiliar")
    private boolean antAuxiliar;
    @Column(name = "prov_empresa")
    private String provEmpresa;
    @Column(name = "prov_codigo")
    private String provCodigo;
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
    private CarPagosForma fpSecuencial;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carPagosAnticipos")
    private List<CarPagosDetalleAnticipos> carPagosDetalleAnticiposList;
    @JoinColumns({
        @JoinColumn(name = "pis_empresa", referencedColumnName = "pis_empresa")
        ,
        @JoinColumn(name = "pis_sector", referencedColumnName = "pis_sector")
        ,
        @JoinColumn(name = "pis_numero", referencedColumnName = "pis_numero")})
    @ManyToOne(optional = true)
    private PrdPiscina prdPiscina;

    public CarPagosAnticipos() {
    }

    public CarPagosAnticipos(CarPagosAnticiposPK carPagosAnticiposPK) {
        this.carPagosAnticiposPK = carPagosAnticiposPK;
    }

    public CarPagosAnticipos(CarPagosAnticiposPK carPagosAnticiposPK, BigDecimal antValor, boolean antPagado,
            boolean antAuxiliar, String provEmpresa, String provCodigo, String secEmpresa, String secCodigo,
            String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.carPagosAnticiposPK = carPagosAnticiposPK;
        this.antValor = antValor;
        this.antPagado = antPagado;
        this.antAuxiliar = antAuxiliar;
        this.provEmpresa = provEmpresa;
        this.provCodigo = provCodigo;
        this.secEmpresa = secEmpresa;
        this.secCodigo = secCodigo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public CarPagosAnticipos(String antEmpresa, String antPeriodo, String antTipo, String antNumero) {
        this.carPagosAnticiposPK = new CarPagosAnticiposPK(antEmpresa, antPeriodo, antTipo, antNumero);
    }

    public CarPagosAnticiposPK getCarPagosAnticiposPK() {
        return carPagosAnticiposPK;
    }

    public void setCarPagosAnticiposPK(CarPagosAnticiposPK carPagosAnticiposPK) {
        this.carPagosAnticiposPK = carPagosAnticiposPK;
    }

    public BigDecimal getAntValor() {
        return antValor;
    }

    public void setAntValor(BigDecimal antValor) {
        this.antValor = antValor;
    }

    public boolean getAntPagado() {
        return antPagado;
    }

    public void setAntPagado(boolean antPagado) {
        this.antPagado = antPagado;
    }

    public boolean isAntAuxiliar() {
        return antAuxiliar;
    }

    public void setAntAuxiliar(boolean antAuxiliar) {
        this.antAuxiliar = antAuxiliar;
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

    public CarPagosForma getFpSecuencial() {
        return fpSecuencial;
    }

    public void setFpSecuencial(CarPagosForma fpSecuencial) {
        this.fpSecuencial = fpSecuencial;
    }

    public List<CarPagosDetalleAnticipos> getCarPagosDetalleAnticiposList() {
        return carPagosDetalleAnticiposList;
    }

    public void setCarPagosDetalleAnticiposList(List<CarPagosDetalleAnticipos> carPagosDetalleAnticiposList) {
        this.carPagosDetalleAnticiposList = carPagosDetalleAnticiposList;
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
        hash += (carPagosAnticiposPK != null ? carPagosAnticiposPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {

        if (!(object instanceof CarPagosAnticipos)) {
            return false;
        }
        CarPagosAnticipos other = (CarPagosAnticipos) object;
        if ((this.carPagosAnticiposPK == null && other.carPagosAnticiposPK != null)
                || (this.carPagosAnticiposPK != null && !this.carPagosAnticiposPK.equals(other.carPagosAnticiposPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cartera.entity.CarPagosAnticipos[ carPagosAnticiposPK=" + carPagosAnticiposPK + " ]";
    }

}
