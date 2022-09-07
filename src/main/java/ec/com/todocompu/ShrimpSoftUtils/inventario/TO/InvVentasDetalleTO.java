/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import ec.com.todocompu.ShrimpSoftUtils.sri.util.InformacionAdicional;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvVentasDetalleTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "det_secuencial")
    private Integer detSecuencia;

    @Column(name = "det_orden")
    private Integer detOrden;

    @Column(name = "det_pendiente")
    private Boolean detPendiente = false;

    @Column(name = "det_cantidad")
    private java.math.BigDecimal detCantidad = BigDecimal.ZERO;

    @Column(name = "det_precio")
    private java.math.BigDecimal detPrecio = BigDecimal.ZERO;

    @Column(name = "det_parcial")
    private java.math.BigDecimal detParcial = BigDecimal.ZERO;

    @Column(name = "det_porcentaje_recargo")
    private java.math.BigDecimal detPorcentajeRecargo = BigDecimal.ZERO;

    @Column(name = "det_porcentaje_descuento")
    private java.math.BigDecimal detPorcentajeDescuento = BigDecimal.ZERO;

    @Column(name = "det_valor_promedio")
    private java.math.BigDecimal detValorPromedio = BigDecimal.ZERO;

    @Column(name = "det_valor_ultima_compra")
    private java.math.BigDecimal detValorUltimaCompra = BigDecimal.ZERO;

    @Column(name = "det_saldo")
    private java.math.BigDecimal detSaldo = BigDecimal.ZERO;

    @Column(name = "bod_empresa")
    private String bodEmpresa;

    @Column(name = "bod_codigo")
    private String bodCodigo;

    @Column(name = "pro_empresa")
    private String proEmpresa;

    @Column(name = "pro_codigo_principal")
    private String proCodigoPrincipal;

    @Column(name = "pro_nombre")
    private String proNombre;

    @Column(name = "pro_credito_tributario")
    private String proCreditoTributario;

    @Column(name = "sec_empresa")
    private String secEmpresa;

    @Column(name = "sec_codigo")
    private String secCodigo;

    @Column(name = "pis_empresa")
    private String pisEmpresa;

    @Column(name = "pis_sector")
    private String pisSector;

    @Column(name = "pis_numero")
    private String pisNumero;

    @Column(name = "vta_empresa")
    private String vtaEmpresa;

    @Column(name = "vta_periodo")
    private String vtaPeriodo;

    @Column(name = "vta_motivo")
    private String vtaMotivo;

    @Column(name = "emp_codigo")
    private String vtaNumero;

    // @Column(name = "emp_codigo")
    private Boolean vtIva = false;

    // @Column(name = "emp_codigo")
    private String vtCodigoPorcentaje;

    // @Column(name = "emp_codigo")
    private String proMedida;

    // @Column(name = "emp_codigo")
    private String proEstadoIva;

    // @Column(name = "emp_codigo")
    private String proTipo;

    @Transient
    private List<InvVentasDetalleSeriesTO> invVentasDetalleSeriesList;

    @Column(name = "det_monto_ice")
    private BigDecimal detMontoIce = BigDecimal.ZERO;

    @Column(name = "ice_tarifa_fija")
    private BigDecimal iceTarifaFija = BigDecimal.ZERO;

    @Column(name = "ice_porcentaje")
    private BigDecimal icePorcentaje = BigDecimal.ZERO;

    @Column(name = "ice_codigo")
    private String iceCodigo;

    @Transient
    private String pisNumeroLiq;
    @Transient
    private String sectorLiq;

    @Column(name = "pro_complementario")
    private Integer proComplementario;

    @Column(name = "det_observaciones")
    private String detObservaciones;

    @Transient
    private List<InvVentasDetalleTO> invVentasDetalleComplementarioList;

    @Column(name = "det_empaque")
    private String detEmpaque;
    @Column(name = "det_empaque_cantidad")
    private BigDecimal detEmpaqueCantidad = BigDecimal.ZERO;
    @Column(name = "det_conversion_peso_neto")
    private BigDecimal detConversionPesoNeto = BigDecimal.ZERO;

    @Column(name = "par_agente_retencion")
    private String parAgenteRetencion;
    @Column(name = "par_cotribuyente_regimen_microempresa")
    private Boolean parContribuyenteRegimenMicroempresa = false;
    @Column(name = "par_resolucion_contribuyente_especial")
    private String parResolucionContribuyenteEspecial;
    @Column(name = "par_obligado_llevar_contabilidad")
    private Boolean parObligadoLlevarContabilidad = false;

    @Column(name = "med_conversion_libras")
    private BigDecimal medConversionLibras = BigDecimal.ZERO;
    @Column(name = "med_conversion_kilos")
    private BigDecimal medConversionKilos = BigDecimal.ZERO;

    @Transient
    private List<InformacionAdicional> infoAdicional;

    @Transient
    private BigDecimal montoIVa = BigDecimal.ZERO;
    
    @Transient
    private BigDecimal conversion = BigDecimal.ZERO;

    @Transient
    private String tallaCodigo = null;

    public InvVentasDetalleTO() {
    }

    public InvVentasDetalleTO(Integer detSecuencia, Integer detOrden, Boolean detPendiente, BigDecimal detCantidad,
            BigDecimal detPrecio, BigDecimal detPorcentajeRecargo, BigDecimal detPorcentajeDescuento,
            BigDecimal detValorPromedio, BigDecimal detValorUltimaCompra, BigDecimal detSaldo, String bodEmpresa,
            String bodCodigo, String proEmpresa, String proCodigoPrincipal, String proNombre,
            String proCreditoTributario, String secEmpresa, String secCodigo, String pisEmpresa, String pisSector,
            String pisNumero, String vtaEmpresa, String vtaPeriodo, String vtaMotivo, String vtaNumero, Boolean vtIva,
            String vtCodigoPorcentaje, String proMedida, String proEstadoIva, String proTipo) {
        this.detSecuencia = detSecuencia;
        this.detOrden = detOrden;
        this.detPendiente = detPendiente;
        this.detCantidad = detCantidad;
        this.detPrecio = detPrecio;
        this.detPorcentajeRecargo = detPorcentajeRecargo;
        this.detPorcentajeDescuento = detPorcentajeDescuento;
        this.detValorPromedio = detValorPromedio;
        this.detValorUltimaCompra = detValorUltimaCompra;
        this.detSaldo = detSaldo;
        this.bodEmpresa = bodEmpresa;
        this.bodCodigo = bodCodigo;
        this.proEmpresa = proEmpresa;
        this.proCodigoPrincipal = proCodigoPrincipal;
        this.proNombre = proNombre;
        this.proCreditoTributario = proCreditoTributario;
        this.secEmpresa = secEmpresa;
        this.secCodigo = secCodigo;
        this.pisEmpresa = pisEmpresa;
        this.pisSector = pisSector;
        this.pisNumero = pisNumero;
        this.vtaEmpresa = vtaEmpresa;
        this.vtaPeriodo = vtaPeriodo;
        this.vtaMotivo = vtaMotivo;
        this.vtaNumero = vtaNumero;
        this.vtIva = vtIva;
        this.vtCodigoPorcentaje = vtCodigoPorcentaje;
        this.proMedida = proMedida;
        this.proEstadoIva = proEstadoIva;
        this.proTipo = proTipo;
    }

    public Integer getProComplementario() {
        return proComplementario;
    }

    public void setProComplementario(Integer proComplementario) {
        this.proComplementario = proComplementario;
    }

    public BigDecimal getDetSaldo() {
        return detSaldo;
    }

    public void setDetSaldo(BigDecimal detSaldo) {
        this.detSaldo = detSaldo;
    }

    public BigDecimal getDetValorPromedio() {
        return detValorPromedio;
    }

    public void setDetValorPromedio(BigDecimal detValorPromedio) {
        this.detValorPromedio = detValorPromedio;
    }

    public BigDecimal getDetValorUltimaCompra() {
        return detValorUltimaCompra;
    }

    public void setDetValorUltimaCompra(BigDecimal detValorUltimaCompra) {
        this.detValorUltimaCompra = detValorUltimaCompra;
    }

    public String getProCreditoTributario() {
        return proCreditoTributario;
    }

    public void setProCreditoTributario(String proCreditoTributario) {
        this.proCreditoTributario = proCreditoTributario;
    }

    public String getProMedida() {
        return proMedida;
    }

    public void setProMedida(String proMedida) {
        this.proMedida = proMedida;
    }

    public String getVtCodigoPorcentaje() {
        return vtCodigoPorcentaje;
    }

    public void setVtCodigoPorcentaje(String vtCodigoPorcentaje) {
        this.vtCodigoPorcentaje = vtCodigoPorcentaje;
    }

    public Boolean getVtIva() {
        return vtIva;
    }

    public void setVtIva(Boolean vtIva) {
        this.vtIva = vtIva;
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

    public BigDecimal getDetCantidad() {
        return detCantidad;
    }

    public void setDetCantidad(BigDecimal detCantidad) {
        this.detCantidad = detCantidad;
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

    public BigDecimal getDetPorcentajeRecargo() {
        return detPorcentajeRecargo;
    }

    public void setDetPorcentajeRecargo(BigDecimal detPorcentajeRecargo) {
        this.detPorcentajeRecargo = detPorcentajeRecargo;
    }

    public BigDecimal getDetPorcentajeDescuento() {
        return detPorcentajeDescuento;
    }

    public void setDetPorcentajeDescuento(BigDecimal detPorcentajeDescuento) {
        this.detPorcentajeDescuento = detPorcentajeDescuento;
    }

    public BigDecimal getDetPrecio() {
        return detPrecio;
    }

    public void setDetPrecio(BigDecimal detPrecio) {
        this.detPrecio = detPrecio;
    }

    public Integer getDetSecuencia() {
        return detSecuencia;
    }

    public void setDetSecuencia(Integer detSecuencia) {
        this.detSecuencia = detSecuencia;
    }

    public String getPisEmpresa() {
        return pisEmpresa;
    }

    public void setPisEmpresa(String pisEmpresa) {
        this.pisEmpresa = pisEmpresa;
    }

    public String getPisNumero() {
        return pisNumero;
    }

    public void setPisNumero(String pisNumero) {
        this.pisNumero = pisNumero;
    }

    public String getPisSector() {
        return pisSector;
    }

    public void setPisSector(String pisSector) {
        this.pisSector = pisSector;
    }

    public String getProCodigoPrincipal() {
        return proCodigoPrincipal;
    }

    public void setProCodigoPrincipal(String proCodigoPrincipal) {
        this.proCodigoPrincipal = proCodigoPrincipal;
    }

    public String getProEmpresa() {
        return proEmpresa;
    }

    public void setProEmpresa(String proEmpresa) {
        this.proEmpresa = proEmpresa;
    }

    public String getProNombre() {
        return proNombre;
    }

    public void setProNombre(String proNombre) {
        this.proNombre = proNombre;
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

    public String getVtaEmpresa() {
        return vtaEmpresa;
    }

    public void setVtaEmpresa(String vtaEmpresa) {
        this.vtaEmpresa = vtaEmpresa;
    }

    public String getVtaMotivo() {
        return vtaMotivo;
    }

    public void setVtaMotivo(String vtaMotivo) {
        this.vtaMotivo = vtaMotivo;
    }

    public String getVtaNumero() {
        return vtaNumero;
    }

    public void setVtaNumero(String vtaNumero) {
        this.vtaNumero = vtaNumero;
    }

    public String getVtaPeriodo() {
        return vtaPeriodo;
    }

    public void setVtaPeriodo(String vtaPeriodo) {
        this.vtaPeriodo = vtaPeriodo;
    }

    public String getProEstadoIva() {
        return proEstadoIva;
    }

    public void setProEstadoIva(String proEstadoIva) {
        this.proEstadoIva = proEstadoIva;
    }

    public String getProTipo() {
        return proTipo;
    }

    public void setProTipo(String proTipo) {
        this.proTipo = proTipo;
    }

    public List<InvVentasDetalleSeriesTO> getInvVentasDetalleSeriesList() {
        return invVentasDetalleSeriesList;
    }

    public void setInvVentasDetalleSeriesList(List<InvVentasDetalleSeriesTO> invVentasDetalleSeriesList) {
        this.invVentasDetalleSeriesList = invVentasDetalleSeriesList;
    }

    public BigDecimal getDetParcial() {
        return detParcial;
    }

    public void setDetParcial(BigDecimal detParcial) {
        this.detParcial = detParcial;
    }

    public BigDecimal getDetMontoIce() {
        return detMontoIce;
    }

    public void setDetMontoIce(BigDecimal detMontoIce) {
        this.detMontoIce = detMontoIce;
    }

    public BigDecimal getIceTarifaFija() {
        return iceTarifaFija;
    }

    public void setIceTarifaFija(BigDecimal iceTarifaFija) {
        this.iceTarifaFija = iceTarifaFija;
    }

    public BigDecimal getIcePorcentaje() {
        return icePorcentaje;
    }

    public void setIcePorcentaje(BigDecimal icePorcentaje) {
        this.icePorcentaje = icePorcentaje;
    }

    public String getIceCodigo() {
        return iceCodigo;
    }

    public void setIceCodigo(String iceCodigo) {
        this.iceCodigo = iceCodigo;
    }

    public String getPisNumeroLiq() {
        return pisNumeroLiq;
    }

    public void setPisNumeroLiq(String pisNumeroLiq) {
        this.pisNumeroLiq = pisNumeroLiq;
    }

    public String getSectorLiq() {
        return sectorLiq;
    }

    public void setSectorLiq(String sectorLiq) {
        this.sectorLiq = sectorLiq;
    }

    public List<InvVentasDetalleTO> getInvVentasDetalleComplementarioList() {
        return invVentasDetalleComplementarioList;
    }

    public void setInvVentasDetalleComplementarioList(List<InvVentasDetalleTO> invVentasDetalleComplementarioList) {
        this.invVentasDetalleComplementarioList = invVentasDetalleComplementarioList;
    }

    public String getDetObservaciones() {
        return detObservaciones;
    }

    public void setDetObservaciones(String detObservaciones) {
        this.detObservaciones = detObservaciones;
    }

    public String getDetEmpaque() {
        return detEmpaque;
    }

    public void setDetEmpaque(String detEmpaque) {
        this.detEmpaque = detEmpaque;
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

    public BigDecimal getMontoIVa() {
        return montoIVa;
    }

    public void setMontoIVa(BigDecimal montoIVa) {
        this.montoIVa = montoIVa;
    }

    public String getTallaCodigo() {
        return tallaCodigo;
    }

    public void setTallaCodigo(String tallaCodigo) {
        this.tallaCodigo = tallaCodigo;
    }

    public BigDecimal getConversion() {
        return conversion;
    }

    public void setConversion(BigDecimal conversion) {
        this.conversion = conversion;
    }

}
