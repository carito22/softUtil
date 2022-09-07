/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Mario Ramos Duque
 */
@Entity
public class InvFunComprasProgramadasListadoTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "comp_status")
    private String compStatus;
    @Column(name = "comp_fecha")
    private String compFecha;
    @Column(name = "comp_proveedor_codigo")
    private String provCodigo;
    @Column(name = "comp_proveedor_razon_social")
    private String provRazonSocial;
    @Column(name = "comp_total")
    private BigDecimal compTotal;
    @Column(name = "comp_observaciones")
    private String compObservaciones;
    @Column(name = "comp_numero")
    private String compNumero;
    @Column(name = "comp_programada")
    private boolean compProgramada;
    @Column(name = "comp_tipo_fp")
    private String tipoFormaPago;

    public InvFunComprasProgramadasListadoTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompStatus() {
        return compStatus;
    }

    public void setCompStatus(String compStatus) {
        this.compStatus = compStatus;
    }

    public String getCompFecha() {
        return compFecha;
    }

    public void setCompFecha(String compFecha) {
        this.compFecha = compFecha;
    }

    public String getProvCodigo() {
        return provCodigo;
    }

    public void setProvCodigo(String provCodigo) {
        this.provCodigo = provCodigo;
    }

    public String getProvRazonSocial() {
        return provRazonSocial;
    }

    public void setProvRazonSocial(String provRazonSocial) {
        this.provRazonSocial = provRazonSocial;
    }

    public BigDecimal getCompTotal() {
        return compTotal;
    }

    public void setCompTotal(BigDecimal compTotal) {
        this.compTotal = compTotal;
    }

    public String getCompObservaciones() {
        return compObservaciones;
    }

    public void setCompObservaciones(String compObservaciones) {
        this.compObservaciones = compObservaciones;
    }

    public String getCompNumero() {
        return compNumero;
    }

    public void setCompNumero(String compNumero) {
        this.compNumero = compNumero;
    }

    public boolean isCompProgramada() {
        return compProgramada;
    }

    public void setCompProgramada(boolean compProgramada) {
        this.compProgramada = compProgramada;
    }

    public String getTipoFormaPago() {
        return tipoFormaPago;
    }

    public void setTipoFormaPago(String tipoFormaPago) {
        this.tipoFormaPago = tipoFormaPago;
    }

}
