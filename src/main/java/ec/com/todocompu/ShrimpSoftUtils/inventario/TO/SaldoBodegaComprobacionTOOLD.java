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
 * @author Andres Guachisaca
 */
@Entity
public class SaldoBodegaComprobacionTOOLD implements java.io.Serializable {
    // private String desde;
    // private String hasta;
    // private String bodega;

    ///////////// DETALLE
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "sbc_producto_nombre")
    private String sbcProductoNombre;

    @Column(name = "sbc_producto_codigo")
    private String sbcProductoCodigo;

    @Column(name = "sbc_medida")
    private String sbcMedida;

    @Column(name = "sbc_inicial")
    private java.math.BigDecimal sbcInicial;

    @Column(name = "sbc_compra")
    private java.math.BigDecimal sbcCompra;

    @Column(name = "sbc_venta")
    private java.math.BigDecimal sbcVenta;

    @Column(name = "sbc_consumo")
    private java.math.BigDecimal sbcConsumo;

    @Column(name = "sbc_transferencia_i")
    private java.math.BigDecimal sbcTransferenciaI;

    @Column(name = "sbc_transferencia_e")
    private java.math.BigDecimal sbcTransferenciaE;

    @Column(name = "sbc_devolucion_c")
    private java.math.BigDecimal sbcDevolucionC;

    @Column(name = "sbc_devolucion_v")
    private java.math.BigDecimal sbcDevolucionV;

    @Column(name = "sbc_final")
    private java.math.BigDecimal sbcFinal;

    @Column(name = "sbc_diferencia")
    private java.math.BigDecimal sbcDiferencia;

    @Column(name = "sbc_ajuste_i")
    private java.math.BigDecimal sbcAjusteI;

    @Column(name = "sbc_ajuste_e")
    private java.math.BigDecimal sbcAjusteE;

    public SaldoBodegaComprobacionTOOLD() {
    }

    public SaldoBodegaComprobacionTOOLD(String sbcProductoNombre, String sbcProductoCodigo, String sbcMedida,
            BigDecimal sbcInicial, BigDecimal sbcCompra, BigDecimal sbcVenta, BigDecimal sbcConsumo,
            BigDecimal sbcTransferenciaI, BigDecimal sbcTransferenciaE, BigDecimal sbcDevolucionC,
            BigDecimal sbcDevolucionV, BigDecimal sbcFinal, BigDecimal sbcDiferencia) {
        // this.desde = desde;
        // this.hasta = hasta;
        // this.bodega = bodega;
        this.sbcProductoNombre = sbcProductoNombre;
        this.sbcProductoCodigo = sbcProductoCodigo;
        this.sbcMedida = sbcMedida;
        this.sbcInicial = sbcInicial;
        this.sbcCompra = sbcCompra;
        this.sbcVenta = sbcVenta;
        this.sbcConsumo = sbcConsumo;
        this.sbcTransferenciaI = sbcTransferenciaI;
        this.sbcTransferenciaE = sbcTransferenciaE;
        this.sbcDevolucionC = sbcDevolucionC;
        this.sbcDevolucionV = sbcDevolucionV;
        this.sbcFinal = sbcFinal;
        this.sbcDiferencia = sbcDiferencia;
    }

    // public String getDesde() {
    // return desde;
    // }
    //
    // public void setDesde(String desde) {
    // this.desde = desde;
    // }
    //
    // public String getHasta() {
    // return hasta;
    // }
    //
    // public void setHasta(String hasta) {
    // this.hasta = hasta;
    // }
    //
    // public String getBodega() {
    // return bodega;
    // }
    //
    // public void setBodega(String bodega) {
    // this.bodega = bodega;
    // }
    public String getSbcProductoNombre() {
        return sbcProductoNombre;
    }

    public void setSbcProductoNombre(String sbcProductoNombre) {
        this.sbcProductoNombre = sbcProductoNombre;
    }

    public String getSbcProductoCodigo() {
        return sbcProductoCodigo;
    }

    public void setSbcProductoCodigo(String sbcProductoCodigo) {
        this.sbcProductoCodigo = sbcProductoCodigo;
    }

    public String getSbcMedida() {
        return sbcMedida;
    }

    public void setSbcMedida(String sbcMedida) {
        this.sbcMedida = sbcMedida;
    }

    public BigDecimal getSbcInicial() {
        return sbcInicial;
    }

    public void setSbcInicial(BigDecimal sbcInicial) {
        this.sbcInicial = sbcInicial;
    }

    public BigDecimal getSbcCompra() {
        return sbcCompra;
    }

    public void setSbcCompra(BigDecimal sbcCompra) {
        this.sbcCompra = sbcCompra;
    }

    public BigDecimal getSbcVenta() {
        return sbcVenta;
    }

    public void setSbcVenta(BigDecimal sbcVenta) {
        this.sbcVenta = sbcVenta;
    }

    public BigDecimal getSbcConsumo() {
        return sbcConsumo;
    }

    public void setSbcConsumo(BigDecimal sbcConsumo) {
        this.sbcConsumo = sbcConsumo;
    }

    public BigDecimal getSbcTransferenciaI() {
        return sbcTransferenciaI;
    }

    public void setSbcTransferenciaI(BigDecimal sbcTransferenciaI) {
        this.sbcTransferenciaI = sbcTransferenciaI;
    }

    public BigDecimal getSbcTransferenciaE() {
        return sbcTransferenciaE;
    }

    public void setSbcTransferenciaE(BigDecimal sbcTransferenciaE) {
        this.sbcTransferenciaE = sbcTransferenciaE;
    }

    public BigDecimal getSbcDevolucionC() {
        return sbcDevolucionC;
    }

    public void setSbcDevolucionC(BigDecimal sbcDevolucionC) {
        this.sbcDevolucionC = sbcDevolucionC;
    }

    public BigDecimal getSbcDevolucionV() {
        return sbcDevolucionV;
    }

    public void setSbcDevolucionV(BigDecimal sbcDevolucionV) {
        this.sbcDevolucionV = sbcDevolucionV;
    }

    public BigDecimal getSbcFinal() {
        return sbcFinal;
    }

    public void setSbcFinal(BigDecimal sbcFinal) {
        this.sbcFinal = sbcFinal;
    }

    public BigDecimal getSbcDiferencia() {
        return sbcDiferencia;
    }

    public void setSbcDiferencia(BigDecimal sbcDiferencia) {
        this.sbcDiferencia = sbcDiferencia;
    }

    public BigDecimal getSbcAjusteI() {
        return sbcAjusteI;
    }

    public void setSbcAjusteI(BigDecimal sbcAjusteI) {
        this.sbcAjusteI = sbcAjusteI;
    }

    public BigDecimal getSbcAjusteE() {
        return sbcAjusteE;
    }

    public void setSbcAjusteE(BigDecimal sbcAjusteE) {
        this.sbcAjusteE = sbcAjusteE;
    }

}
