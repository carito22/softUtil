package ec.com.todocompu.ShrimpSoftUtils.rrhh.report;

import java.io.Serializable;
import java.math.BigDecimal;

public class ReporteConsultaAnticiposLote implements Serializable {

    private static final long serialVersionUID = 1L;

    private String periodo;
    private String tipo;
    private String numero;

    private String dalFecha;
    private String dalId;
    private String dalNombres;
    private BigDecimal dalValor;
    private BigDecimal dalValorARecibir;
    private BigDecimal dalImpuestoRenta;

    private String formaPago;
    private String documento;
    private String observaciones;

    public ReporteConsultaAnticiposLote() {
    }

    public ReporteConsultaAnticiposLote(String periodo, String tipo, String numero, String dalFecha, String dalId,
            String dalNombres, BigDecimal dalValor, String formaPago, String documento, String observaciones) {
        this.periodo = periodo;
        this.tipo = tipo;
        this.numero = numero;
        this.dalFecha = dalFecha;
        this.dalId = dalId;
        this.dalNombres = dalNombres;
        this.dalValor = dalValor;
        this.formaPago = formaPago;
        this.documento = documento;
        this.observaciones = observaciones;
    }

    public String getDalFecha() {
        return dalFecha;
    }

    public void setDalFecha(String dalFecha) {
        this.dalFecha = dalFecha;
    }

    public String getDalId() {
        return dalId;
    }

    public void setDalId(String dalId) {
        this.dalId = dalId;
    }

    public String getDalNombres() {
        return dalNombres;
    }

    public void setDalNombres(String dalNombres) {
        this.dalNombres = dalNombres;
    }

    public BigDecimal getDalValor() {
        return dalValor;
    }

    public void setDalValor(BigDecimal dalValor) {
        this.dalValor = dalValor;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getDalValorARecibir() {
        return dalValorARecibir;
    }

    public void setDalValorARecibir(BigDecimal dalValorARecibir) {
        this.dalValorARecibir = dalValorARecibir;
    }

    public BigDecimal getDalImpuestoRenta() {
        return dalImpuestoRenta;
    }

    public void setDalImpuestoRenta(BigDecimal dalImpuestoRenta) {
        this.dalImpuestoRenta = dalImpuestoRenta;
    }

}
