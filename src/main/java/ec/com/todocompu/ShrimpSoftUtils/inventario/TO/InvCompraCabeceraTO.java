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

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvCompraCabeceraTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "comp_documento_tipo")
    private String compDocumentoTipo;

    @Column(name = "comp_documento_numero")
    private String compDocumentoNumero;

    @Column(name = "comp_fecha")
    private String compfecha;

    @Column(name = "comp_fecha_vencimiento") // comp_fecha_vencimiento
    private String compFechaVencimiento;

    @Column(name = "comp_iva_vigente")
    private java.math.BigDecimal compIvaVigente;

    @Column(name = "comp_observaciones")
    private String compObservaciones;

    @Column(name = "comp_electronica")
    private Boolean compElectronica;

    @Column(name = "comp_pendiente")
    private Boolean compPendiente;

    @Column(name = "comp_revisado")
    private Boolean compRevisado;

    @Column(name = "comp_anulado")
    private Boolean compAnulado;

    @Column(name = "comp_forma_pago")
    private String compFormaPago;

    @Column(name = "comp_base0")
    private java.math.BigDecimal compBase0;

    @Column(name = "comp_base_imponible")
    private java.math.BigDecimal compBaseimponible;

    @Column(name = "comp_base_no_objeto")
    private java.math.BigDecimal compBaseNoObjeto;

    @Column(name = "comp_base_exenta")
    private java.math.BigDecimal compBaseExenta;

    @Column(name = "comp_monto_iva")
    private java.math.BigDecimal compMontoiva;

    @Column(name = "comp_total")
    private java.math.BigDecimal compTotal;

    @Column(name = "comp_valor_retenido")
    private java.math.BigDecimal compValorretenido;

    @Column(name = "comp_saldo")
    private java.math.BigDecimal compSaldo;

    @Column(name = "prov_codigo")
    private String provCodigo;

    @Column(name = "sec_codigo")
    private String secCodigo;

    @Column(name = "con_periodo")
    private String conPeriodo;

    @Column(name = "con_tipo")
    private String conTipo;

    @Column(name = "con_numero")
    private String conNumero;

    @Column(name = "usr_codigo")
    private String usuarioInserto;

    @Column(name = "usr_fecha_inserta")
    private String fechaUsuarioInserto;

    @Column(name = "comp_retencion_asumida")
    private boolean retencionAsumida;

    @Column(name = "comp_documento_forma_pago")
    private String documentoFormaPago;

    @Column(name = "anu_comentario")
    private String comentarioAnulado;

    @Column(name = "comp_activo_fijo")
    private Boolean compActivoFijo;

    @Column(name = "comp_importacion")
    private Boolean compImportacion;

    @Column(name = "comp_otros_impuestos")
    private java.math.BigDecimal compOtrosImpuestos;

    @Column(name = "comp_ice")
    private java.math.BigDecimal compIce;

    @Column(name = "comp_propina")
    private java.math.BigDecimal compPropina;

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
    @Column(name = "comp_imb_facturado")
    private boolean compImbFacturado;
    //transportista
    @Column(name = "comp_transportista_ruc")
    private String compTransportistaRuc;
    @Column(name = "fecha_ultima_validacion_sri")
    private String fechaUltimaValidacionSri;
    @Column(name = "oc_orden_pedido")
    private String ocOrdenPedido;
    @Column(name = "comp_saldo_importado")
    private boolean compSaldoImportado;
    @Column(name = "fp_secuencial")
    private Integer fpSecuencial;
    @Column(name = "cta_codigo")
    private String ctaCodigo;
    @Column(name = "comp_guia_compra")
    private String compGuiaCompra;
    @Column(name = "bod_codigo")
    private String bodCodigo;
    @Column(name = "comp_es_imb")
    private Boolean compEsImb;

    @Column(name = "comp_periodo")
    private String compPeriodo;
    @Column(name = "comp_motivo")
    private String compMotivo;
    @Column(name = "comp_numero")
    private String compNumero;


    /*
	 * comp_ice, comp_otros_impuestos
     */
    public InvCompraCabeceraTO() {
    }

    public InvCompraCabeceraTO(String compDocumentoTipo, String compDocumentoNumero,
            String compfecha, String compFechaVencimiento, BigDecimal compIvaVigente, String compObservaciones,
            Boolean compElectronica, Boolean compPendiente, Boolean compRevisado, Boolean compAnulado,
            String compFormaPago, BigDecimal compBase0, BigDecimal compBaseimponible, BigDecimal compBaseNoObjeto,
            BigDecimal compBaseExenta, BigDecimal compMontoiva, BigDecimal compTotal, BigDecimal compValorretenido,
            BigDecimal compSaldo, String provCodigo, String secCodigo, String conPeriodo, String conTipo,
            String conNumero, String usuarioInserto, String fechaUsuarioInserto, boolean retencionAsumida,
            String documentoFormaPago, String comentarioAnulado, Boolean compActivoFijo, Boolean compImportacion,
            BigDecimal compOtrosImpuestos, BigDecimal compIce, BigDecimal compPropina) {
        this.compDocumentoTipo = compDocumentoTipo;
        this.compDocumentoNumero = compDocumentoNumero;
        this.compfecha = compfecha;
        this.compFechaVencimiento = compFechaVencimiento;
        this.compIvaVigente = compIvaVigente;
        this.compObservaciones = compObservaciones;
        this.compElectronica = compElectronica;
        this.compPendiente = compPendiente;
        this.compRevisado = compRevisado;
        this.compAnulado = compAnulado;
        this.compFormaPago = compFormaPago;
        this.compBase0 = compBase0;
        this.compBaseimponible = compBaseimponible;
        this.compBaseNoObjeto = compBaseNoObjeto;
        this.compBaseExenta = compBaseExenta;
        this.compMontoiva = compMontoiva;
        this.compTotal = compTotal;
        this.compValorretenido = compValorretenido;
        this.compSaldo = compSaldo;
        this.provCodigo = provCodigo;
        this.secCodigo = secCodigo;
        this.conPeriodo = conPeriodo;
        this.conTipo = conTipo;
        this.conNumero = conNumero;
        this.usuarioInserto = usuarioInserto;
        this.fechaUsuarioInserto = fechaUsuarioInserto;
        this.retencionAsumida = retencionAsumida;
        this.documentoFormaPago = documentoFormaPago;
        this.comentarioAnulado = comentarioAnulado;
        this.compActivoFijo = compActivoFijo;
        this.compImportacion = compImportacion;
        this.compOtrosImpuestos = compOtrosImpuestos;
        this.compIce = compIce;
        this.compPropina = compPropina;
    }

    public java.math.BigDecimal getCompIce() {
        return compIce;
    }

    public void setCompIce(java.math.BigDecimal compIce) {
        this.compIce = compIce;
    }

    public java.math.BigDecimal getCompPropina() {
        return compPropina;
    }

    public void setCompPropina(java.math.BigDecimal compPropina) {
        this.compPropina = compPropina;
    }

    public BigDecimal getCompBaseExenta() {
        return compBaseExenta;
    }

    public void setCompBaseExenta(BigDecimal compBaseExenta) {
        this.compBaseExenta = compBaseExenta;
    }

    public BigDecimal getCompBaseNoObjeto() {
        return compBaseNoObjeto;
    }

    public void setCompBaseNoObjeto(BigDecimal compBaseNoObjeto) {
        this.compBaseNoObjeto = compBaseNoObjeto;
    }

    public Boolean getCompImportacion() {
        return compImportacion;
    }

    public void setCompImportacion(Boolean compImportacion) {
        this.compImportacion = compImportacion;
    }

    public Boolean getCompElectronica() {
        return compElectronica;
    }

    public void setCompElectronica(Boolean compElectronica) {
        this.compElectronica = compElectronica;
    }

    public String getComentarioAnulado() {
        return comentarioAnulado;
    }

    public void setComentarioAnulado(String comentarioAnulado) {
        this.comentarioAnulado = comentarioAnulado;
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

    public BigDecimal getCompBaseimponible() {
        return compBaseimponible;
    }

    public void setCompBaseimponible(BigDecimal compBaseimponible) {
        this.compBaseimponible = compBaseimponible;
    }

    public String getCompDocumentoNumero() {
        return compDocumentoNumero;
    }

    public void setCompDocumentoNumero(String compDocumentoNumero) {
        this.compDocumentoNumero = compDocumentoNumero;
    }

    public String getCompDocumentoTipo() {
        return compDocumentoTipo;
    }

    public void setCompDocumentoTipo(String compDocumentoTipo) {
        this.compDocumentoTipo = compDocumentoTipo;
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

    public BigDecimal getCompIvaVigente() {
        return compIvaVigente;
    }

    public void setCompIvaVigente(BigDecimal compIvaVigente) {
        this.compIvaVigente = compIvaVigente;
    }

    public BigDecimal getCompMontoiva() {
        return compMontoiva;
    }

    public void setCompMontoiva(BigDecimal compMontoiva) {
        this.compMontoiva = compMontoiva;
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

    public BigDecimal getCompValorretenido() {
        return compValorretenido;
    }

    public void setCompValorretenido(BigDecimal compValorretenido) {
        this.compValorretenido = compValorretenido;
    }

    public String getCompfecha() {
        return compfecha;
    }

    public void setCompfecha(String compfecha) {
        this.compfecha = compfecha;
    }

    public String getConNumero() {
        return conNumero;
    }

    public void setConNumero(String conNumero) {
        this.conNumero = conNumero;
    }

    public String getConPeriodo() {
        return conPeriodo;
    }

    public void setConPeriodo(String conPeriodo) {
        this.conPeriodo = conPeriodo;
    }

    public String getConTipo() {
        return conTipo;
    }

    public void setConTipo(String conTipo) {
        this.conTipo = conTipo;
    }

    public String getDocumentoFormaPago() {
        return documentoFormaPago;
    }

    public void setDocumentoFormaPago(String documentoFormaPago) {
        this.documentoFormaPago = documentoFormaPago;
    }

    public String getFechaUsuarioInserto() {
        return fechaUsuarioInserto;
    }

    public void setFechaUsuarioInserto(String fechaUsuarioInserto) {
        this.fechaUsuarioInserto = fechaUsuarioInserto;
    }

    public String getProvCodigo() {
        return provCodigo;
    }

    public void setProvCodigo(String provCodigo) {
        this.provCodigo = provCodigo;
    }

    public boolean isRetencionAsumida() {
        return retencionAsumida;
    }

    public void setRetencionAsumida(boolean retencionAsumida) {
        this.retencionAsumida = retencionAsumida;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getUsuarioInserto() {
        return usuarioInserto;
    }

    public void setUsuarioInserto(String usuarioInserto) {
        this.usuarioInserto = usuarioInserto;
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

    public String getCtaCodigo() {
        return ctaCodigo;
    }

    public void setCtaCodigo(String ctaCodigo) {
        this.ctaCodigo = ctaCodigo;
    }

    public String getCompGuiaCompra() {
        return compGuiaCompra;
    }

    public void setCompGuiaCompra(String compGuiaCompra) {
        this.compGuiaCompra = compGuiaCompra;
    }

    public String getBodCodigo() {
        return bodCodigo;
    }

    public void setBodCodigo(String bodCodigo) {
        this.bodCodigo = bodCodigo;
    }

    public Boolean getCompEsImb() {
        return compEsImb;
    }

    public void setCompEsImb(Boolean compEsImb) {
        this.compEsImb = compEsImb;
    }

    public String getCompPeriodo() {
        return compPeriodo;
    }

    public void setCompPeriodo(String compPeriodo) {
        this.compPeriodo = compPeriodo;
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

    @Override
    public String toString() {
        return this.compDocumentoTipo + " " + this.compDocumentoNumero + " "
                + this.compfecha + " " + this.compFechaVencimiento + " " + this.compIvaVigente + " "
                + this.compObservaciones + " " + this.compPendiente + " " + this.compRevisado + " " + this.compAnulado
                + " " + this.compFormaPago + " " + this.compBase0 + " " + this.compBaseimponible + " "
                + this.compMontoiva + " " + this.compTotal + " " + this.compValorretenido + " " + this.compSaldo + " "
                + this.provCodigo + " " + this.secCodigo + " " + this.conPeriodo + " " + this.conTipo + " "
                + this.conNumero + " " + this.comentarioAnulado;
    }
}
