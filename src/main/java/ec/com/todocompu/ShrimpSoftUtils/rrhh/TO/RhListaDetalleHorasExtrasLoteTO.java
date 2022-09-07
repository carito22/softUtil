package ec.com.todocompu.ShrimpSoftUtils.rrhh.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RhListaDetalleHorasExtrasLoteTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "dbl_fecha")
    private String dblFecha;
    @Column(name = "dbl_id")
    private String dblId;
    @Column(name = "dbl_nombres")
    private String dblNombres;
    @Column(name = "dbl_valor_50")
    private BigDecimal dblValor50;
    @Column(name = "dbl_valor_100")
    private BigDecimal dblValor100;
    @Column(name = "dbl_valor_extraordinarias_100")
    private BigDecimal dblValorExtraordinarias100;
    @Column(name = "dbl_forma_pago_detalle")
    private String dblFormaPagoDetalle;
    @Column(name = "dbl_documento")
    private String dblDocumento;
    @Column(name = "dbl_observaciones")
    private String dblObservaciones;

    public RhListaDetalleHorasExtrasLoteTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDblDocumento() {
        return dblDocumento;
    }

    public void setDblDocumento(String dblDocumento) {
        this.dblDocumento = dblDocumento;
    }

    public String getDblFecha() {
        return dblFecha;
    }

    public void setDblFecha(String dblFecha) {
        this.dblFecha = dblFecha;
    }

    public String getDblFormaPagoDetalle() {
        return dblFormaPagoDetalle;
    }

    public void setDblFormaPagoDetalle(String dblFormaPagoDetalle) {
        this.dblFormaPagoDetalle = dblFormaPagoDetalle;
    }

    public String getDblId() {
        return dblId;
    }

    public void setDblId(String dblId) {
        this.dblId = dblId;
    }

    public String getDblNombres() {
        return dblNombres;
    }

    public void setDblNombres(String dblNombres) {
        this.dblNombres = dblNombres;
    }

    public String getDblObservaciones() {
        return dblObservaciones;
    }

    public void setDblObservaciones(String dblObservaciones) {
        this.dblObservaciones = dblObservaciones;
    }

    public BigDecimal getDblValor50() {
        return dblValor50;
    }

    public void setDblValor50(BigDecimal dblValor50) {
        this.dblValor50 = dblValor50;
    }

    public BigDecimal getDblValor100() {
        return dblValor100;
    }

    public void setDblValor100(BigDecimal dblValor100) {
        this.dblValor100 = dblValor100;
    }

    public BigDecimal getDblValorExtraordinarias100() {
        return dblValorExtraordinarias100;
    }

    public void setDblValorExtraordinarias100(BigDecimal dblValorExtraordinarias100) {
        this.dblValorExtraordinarias100 = dblValorExtraordinarias100;
    }

}
