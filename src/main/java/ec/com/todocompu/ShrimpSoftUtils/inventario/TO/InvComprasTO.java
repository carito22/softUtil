/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvComprasTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "emp_codigo")
    private String empCodigo;

    @Column(name = "comp_periodo")
    private String compPeriodo;

    @Column(name = "comp_motivo")
    private String compMotivo;

    @Column(name = "comp_numero")
    private String compNumero;

    @Column(name = "comp_documento_proveedor")
    private String compDocumentoProveedor;

    @Column(name = "comp_documento_tipo")
    private String compDocumentoTipo;

    @Column(name = "comp_documento_numero")
    private String compDocumentoNumero;

    @Column(name = "comp_fecha")
    private String compFecha;

    @Column(name = "comp_fecha_vencimiento")
    private String compFechaVencimiento;

    @Column(name = "comp_iva_vigente")
    private java.math.BigDecimal compIvaVigente;

    @Column(name = "comp_observaciones")
    private String compObservaciones;

    @Column(name = "comp_electronica")
    private Boolean compElectronica;

    @Column(name = "comp_activo_fijo")
    private Boolean compActivoFijo;

    @Column(name = "comp_importacion")
    private Boolean compImportacion;

    @Column(name = "comp_pendiente")
    private Boolean compPendiente;

    @Column(name = "comp_revisado")
    private Boolean compRevisado;

    @Column(name = "comp_anulado")
    private Boolean compAnulado;

    @Column(name = "comp_forma_pago")
    private String compFormaPago;

    @Column(name = "comp_documento_forma_pago")
    private String compDocumentoFormaPago;

    @Column(name = "comp_base0")
    private java.math.BigDecimal compBase0;

    @Column(name = "comp_base_imponible")
    private java.math.BigDecimal compBaseImponible;

    @Column(name = "comp_base_no_objeto")
    private java.math.BigDecimal compBaseNoObjeto;

    @Column(name = "comp_base_exenta")
    private java.math.BigDecimal compBaseExenta;
    @Column(name = "comp_ice")
    private BigDecimal compIce;

    @Column(name = "comp_monto_iva")
    private java.math.BigDecimal compMontoIva;

    @Column(name = "comp_otros_impuestos")
    private java.math.BigDecimal compOtrosImpuestos;

    @Column(name = "comp_propina")
    private java.math.BigDecimal compPropina;

    @Column(name = "comp_total")
    private java.math.BigDecimal compTotal;

    @Column(name = "comp_valor_retenido")
    private java.math.BigDecimal compValorRetenido;

    @Column(name = "comp_retencion_asumida")
    private boolean compRetencionAsumida;

    @Column(name = "comp_saldo")
    private java.math.BigDecimal compSaldo;

    @Column(name = "prov_empresa")
    private String provEmpresa;

    @Column(name = "prov_codigo")
    private String provCodigo;

    @Column(name = "bod_empresa")
    private String bodEmpresa;

    @Column(name = "bod_codigo")
    private String bodCodigo;

    @Column(name = "sec_empresa")
    private String secEmpresa;

    @Column(name = "sec_codigo")
    private String secCodigo;

    @Column(name = "cta_empresa")
    private String ctaEmpresa;

    @Column(name = "cta_codigo")
    private String ctaCodigo;

    @Column(name = "con_periodo")
    private String contPeriodo;

    @Column(name = "con_tipo")
    private String contTipo;

    @Column(name = "con_numero")
    private String contNumero;

    @Column(name = "usr_inserta_compra")
    private String usrInsertaCompra;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInsertaCompra;

    @Column(name = "comp_programada")
    private boolean compProgramada;

    @Column(name = "comp_usuario_aprueba_pago")
    private String compUsuarioApruebaPago;

    @Column(name = "comp_fecha_aprueba_pago")
    @Temporal(TemporalType.DATE)
    private Date compFechaApruebaPago;

    //orden de compra 
    @Column(name = "oc_empresa")
    private String ocEmpresa;
    @Column(name = "oc_sector")
    private String ocSector;
    @Column(name = "oc_motivo")
    private String ocMotivo;
    @Column(name = "oc_numero")
    private String ocNumero;
    @Transient
    private boolean tieneImagenes;
    @Column(name = "comp_imb_facturado")
    private boolean compImbFacturado;
    //transportista
    @Column(name = "comp_transportista_ruc")
    private String compTransportistaRuc;

    @Column(name = "clave_acceso_externa")
    private String compClaveAccesoExterna;

    @Column(name = "fecha_ultima_validacion_sri")
    private String fechaUltimaValidacionSri;

    @Column(name = "oc_orden_pedido")
    private String ocOrdenPedido;

    @Column(name = "comp_saldo_importado")
    private boolean compSaldoImportado;

    @Column(name = "fp_secuencial")
    private Integer fpSecuencial;

    @Column(name = "comp_guia_compra")
    private String compGuiaCompra;

    @Column(name = "comp_es_imb")
    private Boolean compEsImb;

    @Column(name = "caja_empresa")
    private String cajaEmpresa;
    
    @Column(name = "caja_periodo")
    private String cajaPeriodo;
    
    @Column(name = "caja_tipo")
    private String cajaTipo;
    
    @Column(name = "caja_numero")
    private String cajaNumero;
    
    public InvComprasTO() {
    }

    public InvComprasTO(String empCodigo, String compPeriodo, String compMotivo, String compNumero,
            String compDocumentoProveedor, String compDocumentoTipo,
            String compDocumentoNumero, String compFecha, String compFechaVencimiento, BigDecimal compIvaVigente,
            String compObservaciones, Boolean compElectronica, Boolean compActivoFijo, Boolean compImportacion,
            Boolean compPendiente, Boolean compRevisado, Boolean compAnulado, String compFormaPago,
            String compDocumentoFormaPago, BigDecimal compBase0, BigDecimal compBaseImponible,
            BigDecimal compBaseNoObjeto, BigDecimal compBaseExenta, BigDecimal compIce, BigDecimal compMontoIva,
            BigDecimal compOtrosImpuestos, BigDecimal compPropina, BigDecimal compTotal, BigDecimal compValorRetenido,
            boolean compRetencionAsumida, BigDecimal compSaldo, String provEmpresa, String provCodigo,
            String bodEmpresa, String bodCodigo, String secEmpresa, String secCodigo, String ctaEmpresa,
            String ctaCodigo, String contPeriodo, String contTipo, String contNumero, String usrInsertaCompra,
            String usrFechaInsertaCompra) {
        this.empCodigo = empCodigo;
        this.compPeriodo = compPeriodo;
        this.compMotivo = compMotivo;
        this.compNumero = compNumero;
        this.compDocumentoProveedor = compDocumentoProveedor;
        this.compDocumentoTipo = compDocumentoTipo;
        this.compDocumentoNumero = compDocumentoNumero;
        this.compFecha = compFecha;
        this.compFechaVencimiento = compFechaVencimiento;
        this.compIvaVigente = compIvaVigente;
        this.compObservaciones = compObservaciones;
        this.compElectronica = compElectronica;
        this.compActivoFijo = compActivoFijo;
        this.compImportacion = compImportacion;
        this.compPendiente = compPendiente;
        this.compRevisado = compRevisado;
        this.compAnulado = compAnulado;
        this.compFormaPago = compFormaPago;
        this.compDocumentoFormaPago = compDocumentoFormaPago;
        this.compBase0 = compBase0;
        this.compBaseImponible = compBaseImponible;
        this.compBaseNoObjeto = compBaseNoObjeto;
        this.compBaseExenta = compBaseExenta;
        this.compIce = compIce;
        this.compMontoIva = compMontoIva;
        this.compOtrosImpuestos = compOtrosImpuestos;
        this.compPropina = compPropina;
        this.compTotal = compTotal;
        this.compValorRetenido = compValorRetenido;
        this.compRetencionAsumida = compRetencionAsumida;
        this.compSaldo = compSaldo;
        this.provEmpresa = provEmpresa;
        this.provCodigo = provCodigo;
        this.bodEmpresa = bodEmpresa;
        this.bodCodigo = bodCodigo;
        this.secEmpresa = secEmpresa;
        this.secCodigo = secCodigo;
        this.ctaEmpresa = ctaEmpresa;
        this.ctaCodigo = ctaCodigo;
        this.contPeriodo = contPeriodo;
        this.contTipo = contTipo;
        this.contNumero = contNumero;
        this.usrInsertaCompra = usrInsertaCompra;
        this.usrFechaInsertaCompra = usrFechaInsertaCompra;
    }

    public BigDecimal getCompIce() {
        return compIce;
    }

    public void setCompIce(BigDecimal compIce) {
        this.compIce = compIce;
    }

    public java.math.BigDecimal getCompPropina() {
        return compPropina;
    }

    public void setCompPropina(java.math.BigDecimal compPropina) {
        this.compPropina = compPropina;
    }

    public String getBodCodigo() {
        return bodCodigo;
    }

    public void setBodCodigo(String bodCodigo) {
        this.bodCodigo = bodCodigo;
    }

    public String getBodEmpresa() {
        return bodEmpresa;
    }

    public void setBodEmpresa(String bodEmpresa) {
        this.bodEmpresa = bodEmpresa;
    }

    public Boolean getCompActivoFijo() {
        return compActivoFijo;
    }

    public void setCompActivoFijo(Boolean compActivoFijo) {
        this.compActivoFijo = compActivoFijo;
    }

    public Boolean getCompAnulado() {
        return compAnulado;
    }

    public void setCompAnulado(Boolean compAnulado) {
        this.compAnulado = compAnulado;
    }

    public BigDecimal getCompBase0() {
        return compBase0;
    }

    public void setCompBase0(BigDecimal compBase0) {
        this.compBase0 = compBase0;
    }

    public BigDecimal getCompBaseExenta() {
        return compBaseExenta;
    }

    public void setCompBaseExenta(BigDecimal compBaseExenta) {
        this.compBaseExenta = compBaseExenta;
    }

    public BigDecimal getCompBaseImponible() {
        return compBaseImponible;
    }

    public void setCompBaseImponible(BigDecimal compBaseImponible) {
        this.compBaseImponible = compBaseImponible;
    }

    public BigDecimal getCompBaseNoObjeto() {
        return compBaseNoObjeto;
    }

    public void setCompBaseNoObjeto(BigDecimal compBaseNoObjeto) {
        this.compBaseNoObjeto = compBaseNoObjeto;
    }

    public String getCompDocumentoFormaPago() {
        return compDocumentoFormaPago;
    }

    public void setCompDocumentoFormaPago(String compDocumentoFormaPago) {
        this.compDocumentoFormaPago = compDocumentoFormaPago;
    }

    public String getCompDocumentoNumero() {
        return compDocumentoNumero;
    }

    public void setCompDocumentoNumero(String compDocumentoNumero) {
        this.compDocumentoNumero = compDocumentoNumero;
    }

    public String getCompDocumentoProveedor() {
        return compDocumentoProveedor;
    }

    public void setCompDocumentoProveedor(String compDocumentoProveedor) {
        this.compDocumentoProveedor = compDocumentoProveedor;
    }

    public String getCompDocumentoTipo() {
        return compDocumentoTipo;
    }

    public void setCompDocumentoTipo(String compDocumentoTipo) {
        this.compDocumentoTipo = compDocumentoTipo;
    }

    public Boolean getCompElectronica() {
        return compElectronica;
    }

    public void setCompElectronica(Boolean compElectronica) {
        this.compElectronica = compElectronica;
    }

    public String getCompFecha() {
        return compFecha;
    }

    public void setCompFecha(String compFecha) {
        this.compFecha = compFecha;
    }

    public String getCompFechaVencimiento() {
        return compFechaVencimiento;
    }

    public void setCompFechaVencimiento(String compFechaVencimiento) {
        this.compFechaVencimiento = compFechaVencimiento;
    }

    public String getCompFormaPago() {
        return compFormaPago;
    }

    public void setCompFormaPago(String compFormaPago) {
        this.compFormaPago = compFormaPago;
    }

    public Boolean getCompImportacion() {
        return compImportacion;
    }

    public void setCompImportacion(Boolean compImportacion) {
        this.compImportacion = compImportacion;
    }

    public BigDecimal getCompIvaVigente() {
        return compIvaVigente;
    }

    public void setCompIvaVigente(BigDecimal compIvaVigente) {
        this.compIvaVigente = compIvaVigente;
    }

    public BigDecimal getCompMontoIva() {
        return compMontoIva;
    }

    public void setCompMontoIva(BigDecimal compMontoIva) {
        this.compMontoIva = compMontoIva;
    }

    public String getCompMotivo() {
        return compMotivo;
    }

    public void setCompMotivo(String compMotivo) {
        this.compMotivo = compMotivo;
    }

    public String getCompNumero() {
        return compNumero;
    }

    public void setCompNumero(String compNumero) {
        this.compNumero = compNumero;
    }

    public String getCompObservaciones() {
        return compObservaciones;
    }

    public void setCompObservaciones(String compObservaciones) {
        this.compObservaciones = compObservaciones;
    }

    public BigDecimal getCompOtrosImpuestos() {
        return compOtrosImpuestos;
    }

    public void setCompOtrosImpuestos(BigDecimal compOtrosImpuestos) {
        this.compOtrosImpuestos = compOtrosImpuestos;
    }

    public Boolean getCompPendiente() {
        return compPendiente;
    }

    public void setCompPendiente(Boolean compPendiente) {
        this.compPendiente = compPendiente;
    }

    public String getCompPeriodo() {
        return compPeriodo;
    }

    public void setCompPeriodo(String compPeriodo) {
        this.compPeriodo = compPeriodo;
    }

    public boolean isCompRetencionAsumida() {
        return compRetencionAsumida;
    }

    public void setCompRetencionAsumida(boolean compRetencionAsumida) {
        this.compRetencionAsumida = compRetencionAsumida;
    }

    public Boolean getCompRevisado() {
        return compRevisado;
    }

    public void setCompRevisado(Boolean compRevisado) {
        this.compRevisado = compRevisado;
    }

    public BigDecimal getCompSaldo() {
        return compSaldo;
    }

    public void setCompSaldo(BigDecimal compSaldo) {
        this.compSaldo = compSaldo;
    }

    public BigDecimal getCompTotal() {
        return compTotal;
    }

    public void setCompTotal(BigDecimal compTotal) {
        this.compTotal = compTotal;
    }

    public BigDecimal getCompValorRetenido() {
        return compValorRetenido;
    }

    public void setCompValorRetenido(BigDecimal compValorRetenido) {
        this.compValorRetenido = compValorRetenido;
    }

    public String getContNumero() {
        return contNumero;
    }

    public void setContNumero(String contNumero) {
        this.contNumero = contNumero;
    }

    public String getContPeriodo() {
        return contPeriodo;
    }

    public void setContPeriodo(String contPeriodo) {
        this.contPeriodo = contPeriodo;
    }

    public String getContTipo() {
        return contTipo;
    }

    public void setContTipo(String contTipo) {
        this.contTipo = contTipo;
    }

    public String getCtaCodigo() {
        return ctaCodigo;
    }

    public void setCtaCodigo(String ctaCodigo) {
        this.ctaCodigo = ctaCodigo;
    }

    public String getCtaEmpresa() {
        return ctaEmpresa;
    }

    public void setCtaEmpresa(String ctaEmpresa) {
        this.ctaEmpresa = ctaEmpresa;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getProvCodigo() {
        return provCodigo;
    }

    public void setProvCodigo(String provCodigo) {
        this.provCodigo = provCodigo;
    }

    public String getProvEmpresa() {
        return provEmpresa;
    }

    public void setProvEmpresa(String provEmpresa) {
        this.provEmpresa = provEmpresa;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getSecEmpresa() {
        return secEmpresa;
    }

    public void setSecEmpresa(String secEmpresa) {
        this.secEmpresa = secEmpresa;
    }

    public String getUsrFechaInsertaCompra() {
        return usrFechaInsertaCompra;
    }

    public void setUsrFechaInsertaCompra(String usrFechaInsertaCompra) {
        this.usrFechaInsertaCompra = usrFechaInsertaCompra;
    }

    public String getUsrInsertaCompra() {
        return usrInsertaCompra;
    }

    public void setUsrInsertaCompra(String usrInsertaCompra) {
        this.usrInsertaCompra = usrInsertaCompra;
    }

    public String getOcEmpresa() {
        return ocEmpresa;
    }

    public void setOcEmpresa(String ocEmpresa) {
        this.ocEmpresa = ocEmpresa;
    }

    public String getOcSector() {
        return ocSector;
    }

    public void setOcSector(String ocSector) {
        this.ocSector = ocSector;
    }

    public String getOcMotivo() {
        return ocMotivo;
    }

    public void setOcMotivo(String ocMotivo) {
        this.ocMotivo = ocMotivo;
    }

    public String getOcNumero() {
        return ocNumero;
    }

    public void setOcNumero(String ocNumero) {
        this.ocNumero = ocNumero;
    }

    public boolean isCompProgramada() {
        return compProgramada;
    }

    public void setCompProgramada(boolean compProgramada) {
        this.compProgramada = compProgramada;
    }

    public String getCompUsuarioApruebaPago() {
        return compUsuarioApruebaPago;
    }

    public void setCompUsuarioApruebaPago(String compUsuarioApruebaPago) {
        this.compUsuarioApruebaPago = compUsuarioApruebaPago;
    }

    public Date getCompFechaApruebaPago() {
        return compFechaApruebaPago;
    }

    public void setCompFechaApruebaPago(Date compFechaApruebaPago) {
        this.compFechaApruebaPago = compFechaApruebaPago;
    }

    public boolean isTieneImagenes() {
        return tieneImagenes;
    }

    public void setTieneImagenes(boolean tieneImagenes) {
        this.tieneImagenes = tieneImagenes;
    }

    public boolean isCompImbFacturado() {
        return compImbFacturado;
    }

    public void setCompImbFacturado(boolean compImbFacturado) {
        this.compImbFacturado = compImbFacturado;
    }

    public String getCompTransportistaRuc() {
        return compTransportistaRuc;
    }

    public void setCompTransportistaRuc(String compTransportistaRuc) {
        this.compTransportistaRuc = compTransportistaRuc;
    }

    public String getCompClaveAccesoExterna() {
        return compClaveAccesoExterna;
    }

    public void setCompClaveAccesoExterna(String compClaveAccesoExterna) {
        this.compClaveAccesoExterna = compClaveAccesoExterna;
    }

    public String getFechaUltimaValidacionSri() {
        return fechaUltimaValidacionSri;
    }

    public void setFechaUltimaValidacionSri(String fechaUltimaValidacionSri) {
        this.fechaUltimaValidacionSri = fechaUltimaValidacionSri;
    }

    public String getOcOrdenPedido() {
        return ocOrdenPedido;
    }

    public void setOcOrdenPedido(String ocOrdenPedido) {
        this.ocOrdenPedido = ocOrdenPedido;
    }

    public boolean isCompSaldoImportado() {
        return compSaldoImportado;
    }

    public void setCompSaldoImportado(boolean compSaldoImportado) {
        this.compSaldoImportado = compSaldoImportado;
    }

    public Integer getFpSecuencial() {
        return fpSecuencial;
    }

    public void setFpSecuencial(Integer fpSecuencial) {
        this.fpSecuencial = fpSecuencial;
    }

    public String getCompGuiaCompra() {
        return compGuiaCompra;
    }

    public void setCompGuiaCompra(String compGuiaCompra) {
        this.compGuiaCompra = compGuiaCompra;
    }

    public Boolean getCompEsImb() {
        return compEsImb;
    }

    public void setCompEsImb(Boolean compEsImb) {
        this.compEsImb = compEsImb;
    }

    public String getCajaEmpresa() {
        return cajaEmpresa;
    }

    public void setCajaEmpresa(String cajaEmpresa) {
        this.cajaEmpresa = cajaEmpresa;
    }

    public String getCajaPeriodo() {
        return cajaPeriodo;
    }

    public void setCajaPeriodo(String cajaPeriodo) {
        this.cajaPeriodo = cajaPeriodo;
    }

    public String getCajaTipo() {
        return cajaTipo;
    }

    public void setCajaTipo(String cajaTipo) {
        this.cajaTipo = cajaTipo;
    }

    public String getCajaNumero() {
        return cajaNumero;
    }

    public void setCajaNumero(String cajaNumero) {
        this.cajaNumero = cajaNumero;
    }

}
