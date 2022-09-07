/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnxListaRetencionesRentaComprasTipoDocumentoTO implements java.io.Serializable {

    private String fechaDesde;
    private String fechaHasta;

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "ret_sustentotributario")
    private String retSustentotributario;

    @Column(name = "ret_concepto")
    private String retConcepto;

    @Column(name = "ret_proveedor_id")
    private String retProveedorId;

    @Column(name = "ret_proveedor_nombre")
    private String retProveedorNombre;

    @Column(name = "ret_documento_nombre")
    private String retDocumentoNombre;

    @Column(name = "ret_documento_autorizacion")
    private String retDocumentoAutorizacion;

    @Column(name = "ret_documento_numero")
    private String retDocumentoNumero;

    @Column(name = "ret_comprafecha")
    private String retCompraFecha;

    @Column(name = "ret_comprabase0")
    private java.math.BigDecimal retCompraBase0;

    @Column(name = "ret_comprabaseimponible")
    private java.math.BigDecimal retComprabaseImponible;

    @Column(name = "ret_retencionautorizacion")
    private String retRetencionAutorizacion;

    @Column(name = "ret_retencionnumero")
    private String retRetencionNumero;

    @Column(name = "ret_retencionfecha")
    private String retRetencionFecha;

    @Column(name = "ret_valorretenidoir")
    private String retValorRetenidoIr;

    @Column(name = "ret_llavecompra")
    private String retLlaveCompra;

    @Column(name = "ret_llavecontable")
    private String retLlavecontable;

    public AnxListaRetencionesRentaComprasTipoDocumentoTO() {
    }

    public AnxListaRetencionesRentaComprasTipoDocumentoTO(String fechaDesde, String fechaHasta, String retSustentotributario, String retConcepto, String retProveedorId,
            String retProveedorNombre, String retDocumentoNombre, String retDocumentoAutorizacion,
            String retDocumentoNumero, String retCompraFecha, BigDecimal retCompraBase0,
            BigDecimal retComprabaseImponible, String retRetencionAutorizacion, String retRetencionNumero,
            String retRetencionFecha, String retValorRetenidoIr, String retLlaveCompra, String retLlavecontable,
            Integer id) {

        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
        this.retSustentotributario = retSustentotributario;
        this.retConcepto = retConcepto;
        this.retProveedorId = retProveedorId;
        this.retProveedorNombre = retProveedorNombre;
        this.retDocumentoNombre = retDocumentoNombre;
        this.retDocumentoAutorizacion = retDocumentoAutorizacion;
        this.retDocumentoNumero = retDocumentoNumero;
        this.retCompraFecha = retCompraFecha;
        this.retCompraBase0 = retCompraBase0;
        this.retComprabaseImponible = retComprabaseImponible;
        this.retRetencionAutorizacion = retRetencionAutorizacion;
        this.retRetencionNumero = retRetencionNumero;
        this.retRetencionFecha = retRetencionFecha;
        this.retValorRetenidoIr = retValorRetenidoIr;
        this.retLlaveCompra = retLlaveCompra;
        this.retLlavecontable = retLlavecontable;
        this.id = id;
    }

    public String getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(String fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public String getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(String fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getRetCompraBase0() {
        return retCompraBase0;
    }

    public void setRetCompraBase0(BigDecimal retCompraBase0) {
        this.retCompraBase0 = retCompraBase0;
    }

    public BigDecimal getRetComprabaseImponible() {
        return retComprabaseImponible;
    }

    public void setRetComprabaseImponible(BigDecimal retComprabaseImponible) {
        this.retComprabaseImponible = retComprabaseImponible;
    }


    public String getRetCompraFecha() {
        return retCompraFecha;
    }

    public void setRetCompraFecha(String retCompraFecha) {
        this.retCompraFecha = retCompraFecha;
    }

    public String getRetDocumentoAutorizacion() {
        return retDocumentoAutorizacion;
    }

    public void setRetDocumentoAutorizacion(String retDocumentoAutorizacion) {
        this.retDocumentoAutorizacion = retDocumentoAutorizacion;
    }

    public String getRetDocumentoNombre() {
        return retDocumentoNombre;
    }

    public void setRetDocumentoNombre(String retDocumentoNombre) {
        this.retDocumentoNombre = retDocumentoNombre;
    }

    public String getRetDocumentoNumero() {
        return retDocumentoNumero;
    }

    public void setRetDocumentoNumero(String retDocumentoNumero) {
        this.retDocumentoNumero = retDocumentoNumero;
    }

    public String getRetLlaveCompra() {
        return retLlaveCompra;
    }

    public void setRetLlaveCompra(String retLlaveCompra) {
        this.retLlaveCompra = retLlaveCompra;
    }

    public String getRetLlavecontable() {
        return retLlavecontable;
    }

    public void setRetLlavecontable(String retLlavecontable) {
        this.retLlavecontable = retLlavecontable;
    }

    public String getRetConcepto() {
        return retConcepto;
    }

    public void setRetConcepto(String retConcepto) {
        this.retConcepto = retConcepto;
    }

    public String getRetProveedorId() {
        return retProveedorId;
    }

    public void setRetProveedorId(String retProveedorId) {
        this.retProveedorId = retProveedorId;
    }

    public String getRetProveedorNombre() {
        return retProveedorNombre;
    }

    public void setRetProveedorNombre(String retProveedorNombre) {
        this.retProveedorNombre = retProveedorNombre;
    }

    public String getRetRetencionAutorizacion() {
        return retRetencionAutorizacion;
    }

    public void setRetRetencionAutorizacion(String retRetencionAutorizacion) {
        this.retRetencionAutorizacion = retRetencionAutorizacion;
    }

    public String getRetRetencionFecha() {
        return retRetencionFecha;
    }

    public void setRetRetencionFecha(String retRetencionFecha) {
        this.retRetencionFecha = retRetencionFecha;
    }

    public String getRetRetencionNumero() {
        return retRetencionNumero;
    }

    public void setRetRetencionNumero(String retRetencionNumero) {
        this.retRetencionNumero = retRetencionNumero;
    }

    public String getRetSustentotributario() {
        return retSustentotributario;
    }

    public void setRetSustentotributario(String retSustentotributario) {
        this.retSustentotributario = retSustentotributario;
    }

    public String getRetValorRetenidoIr() {
        return retValorRetenidoIr;
    }

    public void setRetValorRetenidoIr(String retValorRetenidoIr) {
        this.retValorRetenidoIr = retValorRetenidoIr;
    }

}
