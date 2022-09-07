package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RhListaDetalleUtilidadesLoteTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "util_fecha")
    private String utilFecha;
    @Column(name = "util_id")
    private String utilId;
    @Column(name = "util_nombres")
    private String utilNombres;
    @Column(name = "util_valor")
    private BigDecimal utilValor;
    @Column(name = "util_impuesto_renta")
    private BigDecimal utilImpuestoRenta;
    @Column(name = "util_forma_pago_detalle")
    private String utilFormaPagoDetalle;
    @Column(name = "util_documento")
    private String utilDocumento;
    @Column(name = "util_observaciones")
    private String utilObservaciones;

    public RhListaDetalleUtilidadesLoteTO() {
    }

    public RhListaDetalleUtilidadesLoteTO(Integer id, String utilFecha, String utilId, String utilNombres, BigDecimal utilValor, BigDecimal utilImpuestoRenta, String utilFormaPagoDetalle, String utilDocumento, String utilObservaciones) {
        this.id = id;
        this.utilFecha = utilFecha;
        this.utilId = utilId;
        this.utilNombres = utilNombres;
        this.utilValor = utilValor;
        this.utilImpuestoRenta = utilImpuestoRenta;
        this.utilFormaPagoDetalle = utilFormaPagoDetalle;
        this.utilDocumento = utilDocumento;
        this.utilObservaciones = utilObservaciones;
    }

    public BigDecimal getUtilImpuestoRenta() {
        return utilImpuestoRenta;
    }

    public void setUtilImpuestoRenta(BigDecimal utilImpuestoRenta) {
        this.utilImpuestoRenta = utilImpuestoRenta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUtilFecha() {
        return utilFecha;
    }

    public void setUtilFecha(String utilFecha) {
        this.utilFecha = utilFecha;
    }

    public String getUtilId() {
        return utilId;
    }

    public void setUtilId(String utilId) {
        this.utilId = utilId;
    }

    public String getUtilNombres() {
        return utilNombres;
    }

    public void setUtilNombres(String utilNombres) {
        this.utilNombres = utilNombres;
    }

    public BigDecimal getUtilValor() {
        return utilValor;
    }

    public void setUtilValor(BigDecimal utilValor) {
        this.utilValor = utilValor;
    }

    public String getUtilFormaPagoDetalle() {
        return utilFormaPagoDetalle;
    }

    public void setUtilFormaPagoDetalle(String utilFormaPagoDetalle) {
        this.utilFormaPagoDetalle = utilFormaPagoDetalle;
    }

    public String getUtilDocumento() {
        return utilDocumento;
    }

    public void setUtilDocumento(String utilDocumento) {
        this.utilDocumento = utilDocumento;
    }

    public String getUtilObservaciones() {
        return utilObservaciones;
    }

    public void setUtilObservaciones(String utilObservaciones) {
        this.utilObservaciones = utilObservaciones;
    }
}
