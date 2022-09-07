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
 * @author Mario Ramos
 */
@Entity
public class InventarioProductosEnProcesoErroresConsumo implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ipp_secuencial")
    private String ippSecuencial;
    @Column(name = "ipp_compra")
    private String ippCompra;
    @Column(name = "ipp_fecha")
    private String ippFecha;
    @Column(name = "ipp_producto_codigo")
    private String ippProductoCodigo;
    @Column(name = "ipp_producto_nombre")
    private String ippProductoNombre;
    @Column(name = "ipp_valor")
    private java.math.BigDecimal ippValor;
    @Column(name = "ipp_sector")
    private String ippSector;
    @Column(name = "ipp_piscina")
    private String ippPiscina;
    @Column(name = "ipp_pendiente")
    private boolean ippPendiente;
    @Column(name = "ipp_anulado")
    private boolean ippAnulado;

    public InventarioProductosEnProcesoErroresConsumo() {
    }

    public boolean isIppPendiente() {
        return ippPendiente;
    }

    public void setIppPendiente(boolean ippPendiente) {
        this.ippPendiente = ippPendiente;
    }

    public boolean isIppAnulado() {
        return ippAnulado;
    }

    public void setIppAnulado(boolean ippAnulado) {
        this.ippAnulado = ippAnulado;
    }

    public String getIppSecuencial() {
        return ippSecuencial;
    }

    public void setIppSecuencial(String ippSecuencial) {
        this.ippSecuencial = ippSecuencial;
    }

    public String getIppCompra() {
        return ippCompra;
    }

    public void setIppCompra(String ippCompra) {
        this.ippCompra = ippCompra;
    }

    public String getIppFecha() {
        return ippFecha;
    }

    public void setIppFecha(String ippFecha) {
        this.ippFecha = ippFecha;
    }

    public String getIppProductoCodigo() {
        return ippProductoCodigo;
    }

    public void setIppProductoCodigo(String ippProductoCodigo) {
        this.ippProductoCodigo = ippProductoCodigo;
    }

    public String getIppProductoNombre() {
        return ippProductoNombre;
    }

    public void setIppProductoNombre(String ippProductoNombre) {
        this.ippProductoNombre = ippProductoNombre;
    }

    public BigDecimal getIppValor() {
        return ippValor;
    }

    public void setIppValor(BigDecimal ippValor) {
        this.ippValor = ippValor;
    }

    public String getIppSector() {
        return ippSector;
    }

    public void setIppSector(String ippSector) {
        this.ippSector = ippSector;
    }

    public String getIppPiscina() {
        return ippPiscina;
    }

    public void setIppPiscina(String ippPiscina) {
        this.ippPiscina = ippPiscina;
    }

}
