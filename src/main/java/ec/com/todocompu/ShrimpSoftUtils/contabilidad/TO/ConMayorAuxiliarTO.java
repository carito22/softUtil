/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class ConMayorAuxiliarTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ma_id")
    private Integer id;
    @Column(name = "ma_contable")
    private String maContable;
    @Column(name = "ma_fecha")
    private String maFecha;
    @Column(name = "ma_secuencia")
    private Integer maSecuencia;
    @Column(name = "ma_cuenta")
    private String maCuenta;
    @Column(name = "ma_cuenta_detalle")
    private String maCuentaDetalle;
    @Column(name = "ma_cp")
    private String maCP;
    @Column(name = "ma_cc")
    private String maCC;
    @Column(name = "ma_documento")
    private String maDocumento;
    @Column(name = "ma_debe")
    private java.math.BigDecimal maDebe;
    @Column(name = "ma_haber")
    private java.math.BigDecimal maHaber;
    @Column(name = "ma_saldo")
    private java.math.BigDecimal maSaldo;
    @Column(name = "ma_concepto")
    private String maConcepto;
    @Column(name = "ma_observaciones")
    private String maObservaciones;
    @Column(name = "ma_generado")
    private Boolean maGenerado;
    @Column(name = "ma_pendiente")
    private Boolean maPendiente;
    @Column(name = "ma_bloqueado")
    private Boolean maBloqueado;
    @Column(name = "ma_reversado")
    private Boolean maReversado;
    @Column(name = "ma_anulado")
    private Boolean maAnulado;
    @Column(name = "ma_referencia")
    private String maReferencia;
    @Column(name = "ma_orden")
    private Integer maOrden;

    public ConMayorAuxiliarTO() {
    }

    public ConMayorAuxiliarTO(String maContable, String maFecha, Integer maSecuencia, String maCuenta, String maCP,
            String maCC, String maDocumento, BigDecimal maDebe, BigDecimal maHaber, BigDecimal maSaldo,
            String maObservaciones, Boolean maGenerado, String maReferencia, Integer maOrden, Integer id) {
        this.maContable = maContable;
        this.maFecha = maFecha;
        this.maSecuencia = maSecuencia;
        this.maCuenta = maCuenta;
        this.maCP = maCP;
        this.maCC = maCC;
        this.maDocumento = maDocumento;
        this.maDebe = maDebe;
        this.maHaber = maHaber;
        this.maSaldo = maSaldo;
        this.maObservaciones = maObservaciones;
        this.maGenerado = maGenerado;
        this.maReferencia = maReferencia;
        this.maOrden = maOrden;
        this.id = id;
    }

    public String getMaCuentaDetalle() {
        return maCuentaDetalle;
    }

    public void setMaCuentaDetalle(String maCuentaDetalle) {
        this.maCuentaDetalle = maCuentaDetalle;
    }

    public String getMaCC() {
        return maCC;
    }

    public void setMaCC(String maCC) {
        this.maCC = maCC;
    }

    public String getMaCP() {
        return maCP;
    }

    public void setMaCP(String maCP) {
        this.maCP = maCP;
    }

    public String getMaContable() {
        return maContable;
    }

    public void setMaContable(String maContable) {
        this.maContable = maContable;
    }

    public String getMaCuenta() {
        return maCuenta;
    }

    public void setMaCuenta(String maCuenta) {
        this.maCuenta = maCuenta;
    }

    public BigDecimal getMaDebe() {
        return maDebe;
    }

    public void setMaDebe(BigDecimal maDebe) {
        this.maDebe = maDebe;
    }

    public String getMaDocumento() {
        return maDocumento;
    }

    public void setMaDocumento(String maDocumento) {
        this.maDocumento = maDocumento;
    }

    public String getMaFecha() {
        return maFecha;
    }

    public void setMaFecha(String maFecha) {
        this.maFecha = maFecha;
    }

    public Boolean getMaGenerado() {
        return maGenerado;
    }

    public void setMaGenerado(Boolean maGenerado) {
        this.maGenerado = maGenerado;
    }

    public BigDecimal getMaHaber() {
        return maHaber;
    }

    public void setMaHaber(BigDecimal maHaber) {
        this.maHaber = maHaber;
    }

    public String getMaObservaciones() {
        return maObservaciones;
    }

    public void setMaObservaciones(String maObservaciones) {
        this.maObservaciones = maObservaciones;
    }

    public Integer getMaOrden() {
        return maOrden;
    }

    public void setMaOrden(Integer maOrden) {
        this.maOrden = maOrden;
    }

    public String getMaReferencia() {
        return maReferencia;
    }

    public void setMaReferencia(String maReferencia) {
        this.maReferencia = maReferencia;
    }

    public BigDecimal getMaSaldo() {
        return maSaldo;
    }

    public void setMaSaldo(BigDecimal maSaldo) {
        this.maSaldo = maSaldo;
    }

    public Integer getMaSecuencia() {
        return maSecuencia;
    }

    public void setMaSecuencia(Integer maSecuencia) {
        this.maSecuencia = maSecuencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getMaPendiente() {
        return maPendiente;
    }

    public void setMaPendiente(Boolean maPendiente) {
        this.maPendiente = maPendiente;
    }

    public Boolean getMaBloqueado() {
        return maBloqueado;
    }

    public void setMaBloqueado(Boolean maBloqueado) {
        this.maBloqueado = maBloqueado;
    }

    public Boolean getMaReversado() {
        return maReversado;
    }

    public void setMaReversado(Boolean maReversado) {
        this.maReversado = maReversado;
    }

    public Boolean getMaAnulado() {
        return maAnulado;
    }

    public void setMaAnulado(Boolean maAnulado) {
        this.maAnulado = maAnulado;
    }

    public String getMaConcepto() {
        return maConcepto;
    }

    public void setMaConcepto(String maConcepto) {
        this.maConcepto = maConcepto;
    }

}
