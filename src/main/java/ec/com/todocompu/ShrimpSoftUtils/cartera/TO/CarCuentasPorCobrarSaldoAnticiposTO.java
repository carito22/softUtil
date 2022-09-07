package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import java.math.BigDecimal;
import javax.persistence.Basic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarCuentasPorCobrarSaldoAnticiposTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "ant_periodo")
    private String antPeriodo;
    @Column(name = "ant_tipo")
    private String antTipo;
    @Column(name = "ant_numero")
    private String antNumero;
    @Column(name = "ant_sector")
    private String antSector;
    @Column(name = "ant_centro_costo")
    private String antCentroCosto;
    @Column(name = "ant_fecha")
    private String antFecha;
    @Column(name = "ant_valor")
    private BigDecimal antValor;
    @Column(name = "ant_cliente_codigo")
    private String antClienteCodigo;
    @Column(name = "ant_cliente_identificacion")
    private String antClienteIdentificacion;
    @Column(name = "ant_cliente_razon_social")
    private String antClienteRazonSocial;
    @Column(name = "ant_observaciones")
    private String antObservaciones;
    @Column(name = "ant_pendiente")
    private Boolean antPendiente;
    @Column(name = "ant_anulado")
    private Boolean antAnulado;
    @Column(name = "ant_reversado")
    private Boolean antReversado;
    @Column(name = "ant_bloqueado")
    private Boolean antBloqueado;
    @Column(name = "ant_contable_deposito_pk")
    private String contableDepositoPK;

    public CarCuentasPorCobrarSaldoAnticiposTO() {
    }

    public CarCuentasPorCobrarSaldoAnticiposTO(Integer id, String antPeriodo, String antTipo, String antNumero,
            String antSector, String antFecha, BigDecimal antValor, String antClienteCodigo, String antClienteRazonSocial,
            String antObservaciones) {

        this.id = id;
        this.antPeriodo = antPeriodo;
        this.antTipo = antTipo;
        this.antNumero = antNumero;
        this.antSector = antSector;
        this.antFecha = antFecha;
        this.antValor = antValor;
        this.antClienteCodigo = antClienteCodigo;
        this.antClienteRazonSocial = antClienteRazonSocial;
        this.antObservaciones = antObservaciones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getAntNumero() {
        return antNumero;
    }

    public void setAntNumero(String antNumero) {
        this.antNumero = antNumero;
    }

    public String getAntSector() {
        return antSector;
    }

    public void setAntSector(String antSector) {
        this.antSector = antSector;
    }

    public String getAntFecha() {
        return antFecha;
    }

    public void setAntFecha(String antFecha) {
        this.antFecha = antFecha;
    }

    public BigDecimal getAntValor() {
        return antValor;
    }

    public void setAntValor(BigDecimal antValor) {
        this.antValor = antValor;
    }

    public String getAntClienteCodigo() {
        return antClienteCodigo;
    }

    public void setAntClienteCodigo(String antClienteCodigo) {
        this.antClienteCodigo = antClienteCodigo;
    }

    public String getAntClienteRazonSocial() {
        return antClienteRazonSocial;
    }

    public void setAntClienteRazonSocial(String antClienteRazonSocial) {
        this.antClienteRazonSocial = antClienteRazonSocial;
    }

    public String getAntObservaciones() {
        return antObservaciones;
    }

    public void setAntObservaciones(String antObservaciones) {
        this.antObservaciones = antObservaciones;
    }

    public Boolean getAntPendiente() {
        return antPendiente;
    }

    public void setAntPendiente(Boolean antPendiente) {
        this.antPendiente = antPendiente;
    }

    public Boolean getAntAnulado() {
        return antAnulado;
    }

    public void setAntAnulado(Boolean antAnulado) {
        this.antAnulado = antAnulado;
    }

    public Boolean getAntReversado() {
        return antReversado;
    }

    public void setAntReversado(Boolean antReversado) {
        this.antReversado = antReversado;
    }

    public Boolean getAntBloqueado() {
        return antBloqueado;
    }

    public void setAntBloqueado(Boolean antBloqueado) {
        this.antBloqueado = antBloqueado;
    }

    public String getContableDepositoPK() {
        return contableDepositoPK;
    }

    public void setContableDepositoPK(String contableDepositoPK) {
        this.contableDepositoPK = contableDepositoPK;
    }

    public String getAntCentroCosto() {
        return antCentroCosto;
    }

    public void setAntCentroCosto(String antCentroCosto) {
        this.antCentroCosto = antCentroCosto;
    }

    public String getAntClienteIdentificacion() {
        return antClienteIdentificacion;
    }

    public void setAntClienteIdentificacion(String antClienteIdentificacion) {
        this.antClienteIdentificacion = antClienteIdentificacion;
    }

}
