package ec.com.todocompu.ShrimpSoftUtils.inventario.report;

import ec.com.todocompu.ShrimpSoftUtils.inventario.TO.InvListaDetalleComprasTO;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class ReporteCompraDetalle implements Serializable {

    private static final long serialVersionUID = 1L;

    //////////////////// COMPRAS CABECERA
    private String empCodigo;
    private String perCodigo;
    private String motCodigo;
    private String motDetalle;
    private String compNumero;
    private String compAutorizacion;
    private String compSustentoTributario;
    private String compDocumentoTipo;
    private String compDocumentoNumero;
    private String provCodigo;
    private String provRazonSocial;
    private String compFecha;
    private String compFechaVencimiento;
    private BigDecimal compIvaVigente;
    private BigDecimal compPropina;
    private String compObservaciones;
    private Boolean compPendiente;
    private Boolean compRevisado;
    private Boolean compAnulado;
    private String compFormaPago;

    private BigDecimal compBase0;
    private BigDecimal compBaseimponible;
    private BigDecimal compMontoiva;
    private BigDecimal compTotal;
    private BigDecimal compValorretenido;
    private BigDecimal compSaldo;

    private String codigoSector;
    private String nombreSector;

    private String compElaboradoPor;
    private String contPeriodo;
    private String contTipo;
    private String contNumero;
    private String usrInsertaCompra;
    private String usrFechaInsertaCompra;
    private Boolean compElectronica;
    ///////////////// COMPRAS DETALLE
    private String bodCodigo;
    private String bogDetalle;
    private String proCodigoPrincipal;
    private String proNombre;
    private BigDecimal detCantidad;
    private String detMedida;
    private BigDecimal detPrecio;
    private BigDecimal detTotal;
    private Boolean detPendiente;
    private Boolean detIva;
    private String secCodigo;
    private String secDetalle;
    private String pisNumero;
    private String detFecha;
    private Integer detSecuencia;
    private Integer detOrden;
    private BigDecimal valorUltimaCompra;
    private BigDecimal detCantidadCaja;
    private String detEmpaque;
    private String detPresentacionUnidad;
    private String detPresentacionCaja;

    private BigDecimal precio1;
    private BigDecimal precio2;
    private BigDecimal precio3;
    private BigDecimal precio4;
    private BigDecimal precio5;
    private BigDecimal detIce;
    private BigDecimal detOtrosImpuestos;
    private boolean esImb;

    private String ocMotivo;
    private String ocNumero;
    private String ocSector;
    private String nombreSubreporte;
    private JRBeanCollectionDataSource contable;
    private String ocOrdenPedido;
    private String compGuiaCompra;
    private Boolean compEsImb;
    
    List<InvListaDetalleComprasTO> listaInvListaDetalleComprasTO;

    public ReporteCompraDetalle() {
    }

    public ReporteCompraDetalle(String empCodigo, String perCodigo, String motCodigo, String compNumero,
            String compAutorizacion, String compSustentoTributario, String compDocumentoTipo, String compDocumentoNumero,
            String provCodigo, String provRazonSocial, String compFecha, String compFechaVencimiento,
            BigDecimal compIvaVigente, String compObservaciones, Boolean compPendiente, Boolean compRevisado,
            Boolean compAnulado, String compFormaPago, BigDecimal compBase0, BigDecimal compBaseimponible,
            BigDecimal compMontoiva, BigDecimal compTotal, BigDecimal compValorretenido, BigDecimal compSaldo,
            String codigoSector, String nombreSector, String compElaboradoPor, String contPeriodo, String contTipo, String contNumero,
            String usrInsertaCompra, String usrFechaInsertaCompra, Boolean compElectronica, String bodCodigo,
            String proCodigoPrincipal, String proNombre, BigDecimal detCantidad, String detMedida, BigDecimal detPrecio,
            BigDecimal detTotal, Boolean detPendiente, Boolean detIva, String secCodigo, String pisNumero,
            String detFecha, Integer detSecuencia, Integer detOrden, BigDecimal valorUltimaCompra,
            BigDecimal detCantidadCaja, String detEmpaque, String detPresentacionUnidad, String detPresentacionCaja,
            BigDecimal precio1, BigDecimal precio2, BigDecimal precio3, BigDecimal precio4, BigDecimal precio5,
            BigDecimal detIce, BigDecimal detOtrosImpuestos, boolean esImb, String ocMotivo, String ocNumero, String ocSector) {

        this.empCodigo = empCodigo;
        this.perCodigo = perCodigo;
        this.motCodigo = motCodigo;
        this.compNumero = compNumero;
        this.compAutorizacion = compAutorizacion;
        this.compSustentoTributario = compSustentoTributario;
        this.compDocumentoTipo = compDocumentoTipo;
        this.compDocumentoNumero = compDocumentoNumero;
        this.provCodigo = provCodigo;
        this.provRazonSocial = provRazonSocial;
        this.compFecha = compFecha;
        this.compFechaVencimiento = compFechaVencimiento;
        this.compIvaVigente = compIvaVigente;
        this.compObservaciones = compObservaciones;
        this.compPendiente = compPendiente;
        this.compRevisado = compRevisado;
        this.compAnulado = compAnulado;
        this.compFormaPago = compFormaPago;
        this.compBase0 = compBase0;
        this.compBaseimponible = compBaseimponible;
        this.compMontoiva = compMontoiva;
        this.compTotal = compTotal;
        this.compValorretenido = compValorretenido;
        this.compSaldo = compSaldo;
        this.codigoSector = codigoSector;
        this.nombreSector = nombreSector;
        this.compElaboradoPor = compElaboradoPor;
        this.contPeriodo = contPeriodo;
        this.contTipo = contTipo;
        this.contNumero = contNumero;
        this.usrInsertaCompra = usrInsertaCompra;
        this.usrFechaInsertaCompra = usrFechaInsertaCompra;
        this.compElectronica = compElectronica;
        this.bodCodigo = bodCodigo;
        this.proCodigoPrincipal = proCodigoPrincipal;
        this.proNombre = proNombre;
        this.detCantidad = detCantidad;
        this.detMedida = detMedida;
        this.detPrecio = detPrecio;
        this.detTotal = detTotal;
        this.detPendiente = detPendiente;
        this.detIva = detIva;
        this.secCodigo = secCodigo;
        this.pisNumero = pisNumero;
        this.detFecha = detFecha;
        this.detSecuencia = detSecuencia;
        this.detOrden = detOrden;
        this.valorUltimaCompra = valorUltimaCompra;
        this.detCantidadCaja = detCantidadCaja;
        this.detEmpaque = detEmpaque;
        this.detPresentacionUnidad = detPresentacionUnidad;
        this.detPresentacionCaja = detPresentacionCaja;
        this.precio1 = precio1;
        this.precio2 = precio2;
        this.precio3 = precio3;
        this.precio4 = precio4;
        this.precio5 = precio5;
        this.detIce = detIce;
        this.detOtrosImpuestos = detOtrosImpuestos;
        this.esImb = esImb;
        this.ocMotivo = ocMotivo;
        this.ocNumero = ocNumero;
        this.ocSector = ocSector;
    }

    public String getCompElaboradoPor() {
        return compElaboradoPor;
    }

    public void setCompElaboradoPor(String compElaboradoPor) {
        this.compElaboradoPor = compElaboradoPor;
    }

    public String getCompAutorizacion() {
        return compAutorizacion;
    }

    public void setCompAutorizacion(String compAutorizacion) {
        this.compAutorizacion = compAutorizacion;
    }

    public BigDecimal getPrecio1() {
        return precio1;
    }

    public void setPrecio1(BigDecimal precio1) {
        this.precio1 = precio1;
    }

    public BigDecimal getPrecio2() {
        return precio2;
    }

    public void setPrecio2(BigDecimal precio2) {
        this.precio2 = precio2;
    }

    public BigDecimal getPrecio3() {
        return precio3;
    }

    public void setPrecio3(BigDecimal precio3) {
        this.precio3 = precio3;
    }

    public BigDecimal getPrecio4() {
        return precio4;
    }

    public void setPrecio4(BigDecimal precio4) {
        this.precio4 = precio4;
    }

    public BigDecimal getPrecio5() {
        return precio5;
    }

    public void setPrecio5(BigDecimal precio5) {
        this.precio5 = precio5;
    }

    public BigDecimal getDetIce() {
        return detIce;
    }

    public void setDetIce(BigDecimal detIce) {
        this.detIce = detIce;
    }

    public boolean isEsImb() {
        return esImb;
    }

    public void setEsImb(boolean esImb) {
        this.esImb = esImb;
    }

    public BigDecimal getDetOtrosImpuestos() {
        return detOtrosImpuestos;
    }

    public void setDetOtrosImpuestos(BigDecimal detOtrosImpuestos) {
        this.detOtrosImpuestos = detOtrosImpuestos;
    }

    public String getBodCodigo() {
        return bodCodigo;
    }

    public void setBodCodigo(String bodCodigo) {
        this.bodCodigo = bodCodigo;
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

    public String getOcSector() {
        return ocSector;
    }

    public void setOcSector(String ocSector) {
        this.ocSector = ocSector;
    }

    public String getCodigoSector() {
        return codigoSector;
    }

    public void setCodigoSector(String codigoSector) {
        this.codigoSector = codigoSector;
    }

    public String getNombreSector() {
        return nombreSector;
    }

    public void setNombreSector(String nombreSector) {
        this.nombreSector = nombreSector;
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

    public BigDecimal getDetCantidad() {
        return detCantidad;
    }

    public void setDetCantidad(BigDecimal detCantidad) {
        this.detCantidad = detCantidad;
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

    public String getDetFecha() {
        return detFecha;
    }

    public void setDetFecha(String detFecha) {
        this.detFecha = detFecha;
    }

    public Boolean getDetIva() {
        return detIva;
    }

    public void setDetIva(Boolean detIva) {
        this.detIva = detIva;
    }

    public String getDetMedida() {
        return detMedida;
    }

    public void setDetMedida(String detMedida) {
        this.detMedida = detMedida;
    }

    public Integer getDetOrden() {
        return detOrden;
    }

    public void setDetOrden(Integer detOrden) {
        this.detOrden = detOrden;
    }

    public Boolean getDetPendiente() {
        return detPendiente;
    }

    public void setDetPendiente(Boolean detPendiente) {
        this.detPendiente = detPendiente;
    }

    public BigDecimal getDetPrecio() {
        return detPrecio;
    }

    public void setDetPrecio(BigDecimal detPrecio) {
        this.detPrecio = detPrecio;
    }

    public String getDetPresentacionCaja() {
        return detPresentacionCaja;
    }

    public void setDetPresentacionCaja(String detPresentacionCaja) {
        this.detPresentacionCaja = detPresentacionCaja;
    }

    public String getDetPresentacionUnidad() {
        return detPresentacionUnidad;
    }

    public void setDetPresentacionUnidad(String detPresentacionUnidad) {
        this.detPresentacionUnidad = detPresentacionUnidad;
    }

    public Integer getDetSecuencia() {
        return detSecuencia;
    }

    public void setDetSecuencia(Integer detSecuencia) {
        this.detSecuencia = detSecuencia;
    }

    public BigDecimal getDetTotal() {
        return detTotal;
    }

    public void setDetTotal(BigDecimal detTotal) {
        this.detTotal = detTotal;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getMotCodigo() {
        return motCodigo;
    }

    public void setMotCodigo(String motCodigo) {
        this.motCodigo = motCodigo;
    }

    public String getPerCodigo() {
        return perCodigo;
    }

    public void setPerCodigo(String perCodigo) {
        this.perCodigo = perCodigo;
    }

    public String getPisNumero() {
        return pisNumero;
    }

    public void setPisNumero(String pisNumero) {
        this.pisNumero = pisNumero;
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

    public String getSecCodigo() {
        return secCodigo;
    }

    public void setSecCodigo(String secCodigo) {
        this.secCodigo = secCodigo;
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

    public BigDecimal getValorUltimaCompra() {
        return valorUltimaCompra;
    }

    public void setValorUltimaCompra(BigDecimal valorUltimaCompra) {
        this.valorUltimaCompra = valorUltimaCompra;
    }

    public String getCompSustentoTributario() {
        return compSustentoTributario;
    }

    public void setCompSustentoTributario(String compSustentoTributario) {
        this.compSustentoTributario = compSustentoTributario;
    }

    public BigDecimal getCompPropina() {
        return compPropina;
    }

    public void setCompPropina(BigDecimal compPropina) {
        this.compPropina = compPropina;
    }

    public JRBeanCollectionDataSource getContable() {
        return contable;
    }

    public void setContable(JRBeanCollectionDataSource contable) {
        this.contable = contable;
    }

    public String getNombreSubreporte() {
        return nombreSubreporte;
    }

    public void setNombreSubreporte(String nombreSubreporte) {
        this.nombreSubreporte = nombreSubreporte;
    }

    public String getOcOrdenPedido() {
        return ocOrdenPedido;
    }

    public void setOcOrdenPedido(String ocOrdenPedido) {
        this.ocOrdenPedido = ocOrdenPedido;
    }

    public String getMotDetalle() {
        return motDetalle;
    }

    public void setMotDetalle(String motDetalle) {
        this.motDetalle = motDetalle;
    }

    public String getBogDetalle() {
        return bogDetalle;
    }

    public void setBogDetalle(String bogDetalle) {
        this.bogDetalle = bogDetalle;
    }

    public String getSecDetalle() {
        return secDetalle;
    }

    public void setSecDetalle(String secDetalle) {
        this.secDetalle = secDetalle;
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

    public List<InvListaDetalleComprasTO> getListaInvListaDetalleComprasTO() {
        return listaInvListaDetalleComprasTO;
    }

    public void setListaInvListaDetalleComprasTO(List<InvListaDetalleComprasTO> listaInvListaDetalleComprasTO) {
        this.listaInvListaDetalleComprasTO = listaInvListaDetalleComprasTO;
    }

}
