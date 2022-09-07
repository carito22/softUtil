package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ConDetalleTablaTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String ctaCodigo;
    private String ctaDetalle;
    private String secCodigo;
    private String secNombre;
    private String pisNumero;
    private String detDocumento;
    private BigDecimal detDebitos;
    private BigDecimal detCreditos;
    private String detObservaciones;
    private Integer detSecuencia;
    private Boolean detGenerado;
    private String detReferencia;

    public ConDetalleTablaTO() {
    }

    public ConDetalleTablaTO(Integer id, String ctaCodigo, String ctaDetalle, String secCodigo, String pisNumero,
            String detDocumento, BigDecimal detDebitos, BigDecimal detCreditos, String detObservaciones,
            Integer detSecuencia, Boolean detGenerado, String detReferencia) {
        this.id = id;
        this.ctaCodigo = ctaCodigo;
        this.ctaDetalle = ctaDetalle;
        this.secCodigo = secCodigo;
        this.pisNumero = pisNumero;
        this.detDocumento = detDocumento;
        this.detDebitos = detDebitos;
        this.detCreditos = detCreditos;
        this.detObservaciones = detObservaciones;
        this.detSecuencia = detSecuencia;
        this.detGenerado = detGenerado;
        this.detReferencia = detReferencia;
    }

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "cta_codigo")
    public String getCtaCodigo() {
        return ctaCodigo;
    }

    public void setCtaCodigo(String ctaCodigo) {
        this.ctaCodigo = ctaCodigo;
    }

    @Column(name = "cta_detalle")
    public String getCtaDetalle() {
        return ctaDetalle;
    }

    public void setCtaDetalle(String ctaDetalle) {
        this.ctaDetalle = ctaDetalle;
    }

    @Column(name = "sec_codigo")
    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    @Column(name = "pis_numero")
    public String getPisNumero() {
        return pisNumero;
    }

    public void setPisNumero(String pisNumero) {
        this.pisNumero = pisNumero;
    }

    @Column(name = "det_documento")
    public String getDetDocumento() {
        return detDocumento;
    }

    public void setDetDocumento(String detDocumento) {
        this.detDocumento = detDocumento;
    }

    @Column(name = "det_debitos")
    public BigDecimal getDetDebitos() {
        return detDebitos;
    }

    public void setDetDebitos(BigDecimal detDebitos) {
        this.detDebitos = detDebitos;
    }

    @Column(name = "det_creditos")
    public BigDecimal getDetCreditos() {
        return detCreditos;
    }

    public void setDetCreditos(BigDecimal detCreditos) {
        this.detCreditos = detCreditos;
    }

    @Column(name = "det_observaciones")
    public String getDetObservaciones() {
        return detObservaciones;
    }

    public void setDetObservaciones(String detObservaciones) {
        this.detObservaciones = detObservaciones;
    }

    @Column(name = "det_secuencia")
    public Integer getDetSecuencia() {
        return detSecuencia;
    }

    public void setDetSecuencia(Integer detSecuencia) {
        this.detSecuencia = detSecuencia;
    }

    @Column(name = "det_generado")
    public Boolean getDetGenerado() {
        return detGenerado;
    }

    public void setDetGenerado(Boolean detGenerado) {
        this.detGenerado = detGenerado;
    }

    @Column(name = "det_referencia")
    public String getDetReferencia() {
        return detReferencia;
    }

    public void setDetReferencia(String detReferencia) {
        this.detReferencia = detReferencia;
    }

    @Column(name = "sec_nombre")
    public String getSecNombre() {
        return secNombre;
    }

    public void setSecNombre(String secNombre) {
        this.secNombre = secNombre;
    }

}
