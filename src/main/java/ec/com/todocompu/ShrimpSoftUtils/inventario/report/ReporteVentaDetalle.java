package ec.com.todocompu.ShrimpSoftUtils.inventario.report;

import ec.com.todocompu.ShrimpSoftUtils.sri.util.InformacionAdicional;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class ReporteVentaDetalle implements Serializable {

    private static final long serialVersionUID = 1L;

    //////////////////// COMPRAS CABECERA
    private String empCodigo;
    private String perCodigo;
    private String motCodigo;
    private String vtaNumero;
    private String vtaNumeroAlterno;
    private String vtaDocumentoTipo;
    private String vtaDocumentoNumero;
    private String vtaFecha;
    private String vtaFechaVencimiento;
    private BigDecimal vtaIvaVigente;
    private String vtaObservaciones;
    private Boolean vtaPendiente;
    private Boolean vtaRevisado;
    private Boolean vtaAnulado;
    private String vtaFormaPago;
    private BigDecimal vtaBase0;
    private BigDecimal vtaBaseimponible;
    private BigDecimal vtaBaseNoObjeto;
    private BigDecimal vtaBaseExenta;
    private String vtaVendedor;

    // vtaDescuentoGeneralBaseImponible
    private BigDecimal vtaRecargoBase0;
    private BigDecimal vtaRecargoImponible;

    private BigDecimal vtaDescuentoGeneralBase0;
    private BigDecimal vtaDescuentoGeneralBaseImponible;
    private BigDecimal vtaDescuentoIva;
    private String vtaTotalLetra;

    private BigDecimal vtaDescuentoBase0;
    private BigDecimal vtaDescuentoBaseImponible;
    private BigDecimal vtaDescuentoBaseNoObjeto;
    private BigDecimal vtaDescuentoBaseExenta;

    private BigDecimal vtaSubtotalBase0;
    private BigDecimal vtaSubtotalBaseImponible;
    private BigDecimal vtaSubtotalBaseNoObjeto;
    private BigDecimal vtaSubtotalBaseExenta;

    private BigDecimal vtaMontoiva;
    private BigDecimal vtaMontoice;
    private BigDecimal vtaTotal;
    private BigDecimal vtaPagado;
    private BigDecimal vtaPagadoEfectivo;
    private BigDecimal vtaPagadoDineroElectronico;
    private BigDecimal vtaPagadoTarjetaCredito;
    private BigDecimal vtaPagadoOtro;

    private String cliCodigo;
    private String cliNombre;
    private String cliDireccion;
    private String cliTelefono;
    private String cliRuc;
    private String cliCiudad;
    private String cliEmail;
    private String codigoSector;
    private String contPeriodo;
    private String contTipo;
    private String contNumero;
    private String usrInsertaCompra;
    private String usrFechaInsertaCompra;

    ///////////////// VENTAS DETALLE
    private String bodCodigo;
    private Boolean detPendiente;
    private String proCodigoPrincipal;
    private String proNombre;
    private BigDecimal detCantidad;
    private String detMedida;
    private BigDecimal detPrecio;
    private BigDecimal detParcial;
    private BigDecimal detPorcentajeRecargo;
    private BigDecimal detPorcentajeDescuento;
    private BigDecimal detIvaCobrado;
    private BigDecimal detTotal;
    private String secCodigo;
    private String pisNumero;
    private Boolean detIva;
    private BigDecimal detCantidadCaja;
    private String detEmpaque;
    private BigDecimal detEmpaqueCantidad;
    private BigDecimal detConversionPesoNeto;
    private BigDecimal medConversionLibras;
    private BigDecimal medConversionKilos;
    private String detPresentacionUnidad;
    private String detPresentacionCaja;
    //// datos RIDE Electronicos
    // private String docElectonicoNumeroAutorizacion;
    // private String docElectonicoFechaAutorizacion;
    // private String docElectonicoAmbiente;
    // private String docElectonicoEmision;
    private String docElectronicoClaveAcceso;
    private boolean vtaConsignacion;
    // private String docElectonicoObligadoContabilidad;
    // private String docElectonicoNumeroContribuyenteEspecial;
    // private String cliMail;
    //complemento
    private String comDocumentoNumero;
    private String comDocumentoTipo;
    private String comDocumentoMotivo;
    private String comFechaEmisionDocSustento;
    
    private String parAgenteRetencion;
    private Boolean parContribuyenteRegimenMicroempresa;
    private String parResolucionContribuyenteEspecial;
    private Boolean parObligadoLlevarContabilidad;
    private List<InformacionAdicional> infoAdicional;

    public BigDecimal getVtaDescuentoGeneralBaseImponible() {
        return vtaDescuentoGeneralBaseImponible;
    }

    public BigDecimal getVtaPagado() {
        return vtaPagado;
    }

    public void setVtaPagado(BigDecimal vtaPagado) {
        this.vtaPagado = vtaPagado;
    }

    public BigDecimal getVtaPagadoEfectivo() {
        return vtaPagadoEfectivo;
    }

    public void setVtaPagadoEfectivo(BigDecimal vtaPagadoEfectivo) {
        this.vtaPagadoEfectivo = vtaPagadoEfectivo;
    }

    public BigDecimal getVtaPagadoDineroElectronico() {
        return vtaPagadoDineroElectronico;
    }

    public void setVtaPagadoDineroElectronico(BigDecimal vtaPagadoDineroElectronico) {
        this.vtaPagadoDineroElectronico = vtaPagadoDineroElectronico;
    }

    public BigDecimal getVtaPagadoTarjetaCredito() {
        return vtaPagadoTarjetaCredito;
    }

    public void setVtaPagadoTarjetaCredito(BigDecimal vtaPagadoTarjetaCredito) {
        this.vtaPagadoTarjetaCredito = vtaPagadoTarjetaCredito;
    }

    public BigDecimal getVtaPagadoOtro() {
        return vtaPagadoOtro;
    }

    public void setVtaPagadoOtro(BigDecimal vtaPagadoOtro) {
        this.vtaPagadoOtro = vtaPagadoOtro;
    }

    public String getVtaTotalLetra() {
        return vtaTotalLetra;
    }

    public void setVtaTotalLetra(String vtaTotalLetra) {
        this.vtaTotalLetra = vtaTotalLetra;
    }

    public void setVtaDescuentoGeneralBaseImponible(BigDecimal vtaDescuentoGeneralBaseImponible) {
        this.vtaDescuentoGeneralBaseImponible = vtaDescuentoGeneralBaseImponible;
    }

    public BigDecimal getVtaDescuentoGeneralBase0() {
        return vtaDescuentoGeneralBase0;
    }

    public void setVtaDescuentoGeneralBase0(BigDecimal vtaDescuentoGeneralBase0) {
        this.vtaDescuentoGeneralBase0 = vtaDescuentoGeneralBase0;
    }

    public BigDecimal getVtaDescuentoIva() {
        return vtaDescuentoIva;
    }

    public void setVtaDescuentoIva(BigDecimal vtaDescuentoIva) {
        this.vtaDescuentoIva = vtaDescuentoIva;
    }

    public BigDecimal getVtaRecargoBase0() {
        return vtaRecargoBase0;
    }

    public void setVtaRecargoBase0(BigDecimal vtaRecargoBase0) {
        this.vtaRecargoBase0 = vtaRecargoBase0;
    }

    public BigDecimal getVtaRecargoImponible() {
        return vtaRecargoImponible;
    }

    public void setVtaRecargoImponible(BigDecimal vtaRecargoImponible) {
        this.vtaRecargoImponible = vtaRecargoImponible;
    }

    public BigDecimal getVtaBaseExenta() {
        return vtaBaseExenta;
    }

    public void setVtaBaseExenta(BigDecimal vtaBaseExenta) {
        this.vtaBaseExenta = vtaBaseExenta;
    }

    public BigDecimal getVtaBaseimponible() {
        return vtaBaseimponible;
    }

    public void setVtaBaseimponible(BigDecimal vtaBaseimponible) {
        this.vtaBaseimponible = vtaBaseimponible;
    }

    public BigDecimal getVtaBaseNoObjeto() {
        return vtaBaseNoObjeto;
    }

    public void setVtaBaseNoObjeto(BigDecimal vtaBaseNoObjeto) {
        this.vtaBaseNoObjeto = vtaBaseNoObjeto;
    }

    public ReporteVentaDetalle() {
    }

    public String getDocElectronicoClaveAcceso() {
        return docElectronicoClaveAcceso;
    }

    public void setDocElectronicoClaveAcceso(String docElectronicoClaveAcceso) {
        this.docElectronicoClaveAcceso = docElectronicoClaveAcceso;
    }

    public BigDecimal getDetIvaCobrado() {
        return detIvaCobrado;
    }

    public void setDetIvaCobrado(BigDecimal detIvaCobrado) {
        this.detIvaCobrado = detIvaCobrado;
    }

    public BigDecimal getDetPorcentajeDescuento() {
        return detPorcentajeDescuento;
    }

    public void setDetPorcentajeDescuento(BigDecimal detPorcentajeDescuento) {
        this.detPorcentajeDescuento = detPorcentajeDescuento;
    }

    public BigDecimal getDetPorcentajeRecargo() {
        return detPorcentajeRecargo;
    }

    public void setDetPorcentajeRecargo(BigDecimal detPorcentajeRecargo) {
        this.detPorcentajeRecargo = detPorcentajeRecargo;
    }

    public BigDecimal getDetTotal() {
        return detTotal;
    }

    public void setDetTotal(BigDecimal detTotal) {
        this.detTotal = detTotal;
    }

    public BigDecimal getDetCantidadCaja() {
        return detCantidadCaja;
    }

    public void setDetCantidadCaja(BigDecimal detCantidadCaja) {
        this.detCantidadCaja = detCantidadCaja;
    }

    public String getDetEmpaque() {
        return detEmpaque;
    }

    public void setDetEmpaque(String detEmpaque) {
        this.detEmpaque = detEmpaque;
    }

    public String getDetPresentacionUnidad() {
        return detPresentacionUnidad;
    }

    public void setDetPresentacionUnidad(String detPresentacionUnidad) {
        this.detPresentacionUnidad = detPresentacionUnidad;
    }

    public String getDetPresentacionCaja() {
        return detPresentacionCaja;
    }

    public void setDetPresentacionCaja(String detPresentacionCaja) {
        this.detPresentacionCaja = detPresentacionCaja;
    }

    public Boolean getDetIva() {
        return detIva;
    }

    public void setDetIva(Boolean detIva) {
        this.detIva = detIva;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getPerCodigo() {
        return perCodigo;
    }

    public void setPerCodigo(String perCodigo) {
        this.perCodigo = perCodigo;
    }

    public String getMotCodigo() {
        return motCodigo;
    }

    public void setMotCodigo(String motCodigo) {
        this.motCodigo = motCodigo;
    }

    public String getVtaNumero() {
        return vtaNumero;
    }

    public void setVtaNumero(String vtaNumero) {
        this.vtaNumero = vtaNumero;
    }

    public String getVtaNumeroAlterno() {
        return vtaNumeroAlterno;
    }

    public void setVtaNumeroAlterno(String vtaNumeroAlterno) {
        this.vtaNumeroAlterno = vtaNumeroAlterno;
    }

    public String getVtaDocumentoTipo() {
        return vtaDocumentoTipo;
    }

    public void setVtaDocumentoTipo(String vtaDocumentoTipo) {
        this.vtaDocumentoTipo = vtaDocumentoTipo;
    }

    public String getVtaDocumentoNumero() {
        return vtaDocumentoNumero;
    }

    public void setVtaDocumentoNumero(String vtaDocumentoNumero) {
        this.vtaDocumentoNumero = vtaDocumentoNumero;
    }

    public String getVtaFecha() {
        return vtaFecha;
    }

    public void setVtaFecha(String vtaFecha) {
        this.vtaFecha = vtaFecha;
    }

    public String getVtaFechaVencimiento() {
        return vtaFechaVencimiento;
    }

    public void setVtaFechaVencimiento(String vtaFechaVencimiento) {
        this.vtaFechaVencimiento = vtaFechaVencimiento;
    }

    public BigDecimal getVtaIvaVigente() {
        return vtaIvaVigente;
    }

    public void setVtaIvaVigente(BigDecimal vtaIvaVigente) {
        this.vtaIvaVigente = vtaIvaVigente;
    }

    public String getVtaObservaciones() {
        return vtaObservaciones;
    }

    public void setVtaObservaciones(String vtaObservaciones) {
        this.vtaObservaciones = vtaObservaciones;
    }

    public Boolean getVtaPendiente() {
        return vtaPendiente;
    }

    public void setVtaPendiente(Boolean vtaPendiente) {
        this.vtaPendiente = vtaPendiente;
    }

    public Boolean getVtaRevisado() {
        return vtaRevisado;
    }

    public void setVtaRevisado(Boolean vtaRevisado) {
        this.vtaRevisado = vtaRevisado;
    }

    public Boolean getVtaAnulado() {
        return vtaAnulado;
    }

    public void setVtaAnulado(Boolean vtaAnulado) {
        this.vtaAnulado = vtaAnulado;
    }

    public String getVtaFormaPago() {
        return vtaFormaPago;
    }

    public void setVtaFormaPago(String vtaFormaPago) {
        this.vtaFormaPago = vtaFormaPago;
    }

    public BigDecimal getVtaBase0() {
        return vtaBase0;
    }

    public void setVtaBase0(BigDecimal vtaBase0) {
        this.vtaBase0 = vtaBase0;
    }

    // public BigDecimal getVtaBaseimponible() {
    // return vtaBaseimponible;
    // }
    //
    // public void setVtaBaseimponible(BigDecimal vtaBaseimponible) {
    // this.vtaBaseimponible = vtaBaseimponible;
    // }
    public BigDecimal getVtaDescuentoBase0() {
        return vtaDescuentoBase0;
    }

    public void setVtaDescuentoBase0(BigDecimal vtaDescuentoBase0) {
        this.vtaDescuentoBase0 = vtaDescuentoBase0;
    }

    public BigDecimal getVtaDescuentoBaseImponible() {
        return vtaDescuentoBaseImponible;
    }

    public void setVtaDescuentoBaseImponible(BigDecimal vtaDescuentoBaseImponible) {
        this.vtaDescuentoBaseImponible = vtaDescuentoBaseImponible;
    }

    public BigDecimal getVtaDescuentoBaseExenta() {
        return vtaDescuentoBaseExenta;
    }

    public void setVtaDescuentoBaseExenta(BigDecimal vtaDescuentoBaseExenta) {
        this.vtaDescuentoBaseExenta = vtaDescuentoBaseExenta;
    }

    public BigDecimal getVtaDescuentoBaseNoObjeto() {
        return vtaDescuentoBaseNoObjeto;
    }

    public void setVtaDescuentoBaseNoObjeto(BigDecimal vtaDescuentoBaseNoObjeto) {
        this.vtaDescuentoBaseNoObjeto = vtaDescuentoBaseNoObjeto;
    }

    public BigDecimal getVtaSubtotalBaseExenta() {
        return vtaSubtotalBaseExenta;
    }

    public void setVtaSubtotalBaseExenta(BigDecimal vtaSubtotalBaseExenta) {
        this.vtaSubtotalBaseExenta = vtaSubtotalBaseExenta;
    }

    public BigDecimal getVtaSubtotalBaseNoObjeto() {
        return vtaSubtotalBaseNoObjeto;
    }

    public void setVtaSubtotalBaseNoObjeto(BigDecimal vtaSubtotalBaseNoObjeto) {
        this.vtaSubtotalBaseNoObjeto = vtaSubtotalBaseNoObjeto;
    }

    public BigDecimal getVtaSubtotalBase0() {
        return vtaSubtotalBase0;
    }

    public void setVtaSubtotalBase0(BigDecimal vtaSubtotalBase0) {
        this.vtaSubtotalBase0 = vtaSubtotalBase0;
    }

    public BigDecimal getVtaSubtotalBaseImponible() {
        return vtaSubtotalBaseImponible;
    }

    public void setVtaSubtotalBaseImponible(BigDecimal vtaSubtotalBaseImponible) {
        this.vtaSubtotalBaseImponible = vtaSubtotalBaseImponible;
    }

    public BigDecimal getVtaMontoiva() {
        return vtaMontoiva;
    }

    public void setVtaMontoiva(BigDecimal vtaMontoiva) {
        this.vtaMontoiva = vtaMontoiva;
    }

    public BigDecimal getVtaTotal() {
        return vtaTotal;
    }

    public void setVtaTotal(BigDecimal vtaTotal) {
        this.vtaTotal = vtaTotal;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getCliNombre() {
        return cliNombre;
    }

    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }

    public String getCliDireccion() {
        return cliDireccion;
    }

    public void setCliDireccion(String cliDireccion) {
        this.cliDireccion = cliDireccion;
    }

    public String getCliTelefono() {
        return cliTelefono;
    }

    public void setCliTelefono(String cliTelefono) {
        this.cliTelefono = cliTelefono;
    }

    public String getCliRuc() {
        return cliRuc;
    }

    public void setCliRuc(String cliRuc) {
        this.cliRuc = cliRuc;
    }

    public String getCliCiudad() {
        return cliCiudad;
    }

    public void setCliCiudad(String cliCiudad) {
        this.cliCiudad = cliCiudad;
    }

    public String getCliEmail() {
        return cliEmail;
    }

    public void setCliEmail(String cliEmail) {
        this.cliEmail = cliEmail;
    }

    public String getCodigoSector() {
        return codigoSector;
    }

    public void setCodigoSector(String codigoSector) {
        this.codigoSector = codigoSector;
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

    public String getContNumero() {
        return contNumero;
    }

    public void setContNumero(String contNumero) {
        this.contNumero = contNumero;
    }

    public String getUsrInsertaCompra() {
        return usrInsertaCompra;
    }

    public void setUsrInsertaCompra(String usrInsertaCompra) {
        this.usrInsertaCompra = usrInsertaCompra;
    }

    public String getUsrFechaInsertaCompra() {
        return usrFechaInsertaCompra;
    }

    public void setUsrFechaInsertaCompra(String usrFechaInsertaCompra) {
        this.usrFechaInsertaCompra = usrFechaInsertaCompra;
    }

    public String getBodCodigo() {
        return bodCodigo;
    }

    public void setBodCodigo(String bodCodigo) {
        this.bodCodigo = bodCodigo;
    }

    public Boolean getDetPendiente() {
        return detPendiente;
    }

    public void setDetPendiente(Boolean detPendiente) {
        this.detPendiente = detPendiente;
    }

    public String getProCodigoPrincipal() {
        return proCodigoPrincipal;
    }

    public void setProCodigoPrincipal(String proCodigoPrincipal) {
        this.proCodigoPrincipal = proCodigoPrincipal;
    }

    public String getProNombre() {
        return proNombre;
    }

    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
    }

    public BigDecimal getDetCantidad() {
        return detCantidad;
    }

    public void setDetCantidad(BigDecimal detCantidad) {
        this.detCantidad = detCantidad;
    }

    public String getDetMedida() {
        return detMedida;
    }

    public void setDetMedida(String detMedida) {
        this.detMedida = detMedida;
    }

    public BigDecimal getDetPrecio() {
        return detPrecio;
    }

    public void setDetPrecio(BigDecimal detPrecio) {
        this.detPrecio = detPrecio;
    }

    public BigDecimal getDetParcial() {
        return detParcial;
    }

    public void setDetParcial(BigDecimal detParcial) {
        this.detParcial = detParcial;
    }

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
    }

    public String getPisNumero() {
        return pisNumero;
    }

    public void setPisNumero(String pisNumero) {
        this.pisNumero = pisNumero;
    }

    public String getVtaVendedor() {
        return vtaVendedor;
    }

    public void setVtaVendedor(String vtaVendedor) {
        this.vtaVendedor = vtaVendedor;
    }

    public boolean isVtaConsignacion() {
        return vtaConsignacion;
    }

    public void setVtaConsignacion(boolean vtaConsignacion) {
        this.vtaConsignacion = vtaConsignacion;
    }

    public String getComDocumentoNumero() {
        return comDocumentoNumero;
    }

    public void setComDocumentoNumero(String comDocumentoNumero) {
        this.comDocumentoNumero = comDocumentoNumero;
    }

    public String getComDocumentoTipo() {
        return comDocumentoTipo;
    }

    public void setComDocumentoTipo(String comDocumentoTipo) {
        this.comDocumentoTipo = comDocumentoTipo;
    }

    public String getComDocumentoMotivo() {
        return comDocumentoMotivo;
    }

    public void setComDocumentoMotivo(String comDocumentoMotivo) {
        this.comDocumentoMotivo = comDocumentoMotivo;
    }

    public BigDecimal getVtaMontoice() {
        return vtaMontoice;
    }

    public void setVtaMontoice(BigDecimal vtaMontoice) {
        this.vtaMontoice = vtaMontoice;
    }

    public String getParAgenteRetencion() {
        return parAgenteRetencion;
    }

    public void setParAgenteRetencion(String parAgenteRetencion) {
        this.parAgenteRetencion = parAgenteRetencion;
    }

    public Boolean getParContribuyenteRegimenMicroempresa() {
        return parContribuyenteRegimenMicroempresa;
    }

    public void setParContribuyenteRegimenMicroempresa(Boolean parContribuyenteRegimenMicroempresa) {
        this.parContribuyenteRegimenMicroempresa = parContribuyenteRegimenMicroempresa;
    }

    public String getParResolucionContribuyenteEspecial() {
        return parResolucionContribuyenteEspecial;
    }

    public void setParResolucionContribuyenteEspecial(String parResolucionContribuyenteEspecial) {
        this.parResolucionContribuyenteEspecial = parResolucionContribuyenteEspecial;
    }

    public Boolean getParObligadoLlevarContabilidad() {
        return parObligadoLlevarContabilidad;
    }

    public void setParObligadoLlevarContabilidad(Boolean parObligadoLlevarContabilidad) {
        this.parObligadoLlevarContabilidad = parObligadoLlevarContabilidad;
    }    

    public BigDecimal getDetEmpaqueCantidad() {
        return detEmpaqueCantidad;
    }

    public void setDetEmpaqueCantidad(BigDecimal detEmpaqueCantidad) {
        this.detEmpaqueCantidad = detEmpaqueCantidad;
    }

    public BigDecimal getDetConversionPesoNeto() {
        return detConversionPesoNeto;
    }

    public void setDetConversionPesoNeto(BigDecimal detConversionPesoNeto) {
        this.detConversionPesoNeto = detConversionPesoNeto;
    }

    public BigDecimal getMedConversionLibras() {
        return medConversionLibras;
    }

    public void setMedConversionLibras(BigDecimal medConversionLibras) {
        this.medConversionLibras = medConversionLibras;
    }

    public BigDecimal getMedConversionKilos() {
        return medConversionKilos;
    }

    public void setMedConversionKilos(BigDecimal medConversionKilos) {
        this.medConversionKilos = medConversionKilos;
    }

    public List<InformacionAdicional> getInfoAdicional() {
        return infoAdicional;
    }

    public void setInfoAdicional(List<InformacionAdicional> infoAdicional) {
        this.infoAdicional = infoAdicional;
    }

    public String getComFechaEmisionDocSustento() {
        return comFechaEmisionDocSustento;
    }

    public void setComFechaEmisionDocSustento(String comFechaEmisionDocSustento) {
        this.comFechaEmisionDocSustento = comFechaEmisionDocSustento;
    }
    
}
