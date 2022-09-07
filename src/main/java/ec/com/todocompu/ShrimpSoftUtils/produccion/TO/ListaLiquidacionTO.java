package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ListaLiquidacionTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String liqMotivo;
    private String liqNumero;
    private String liqLote;
    private String liqFecha;
    private String pisSector;
    private String pisNumero;
    private String cliCodigo;
    private String cliNombre;
    private BigDecimal liqLibrasEnviadas;
    private BigDecimal liqLibrasRecibidas;
    private BigDecimal liqLibrasBasura;
    private BigDecimal liqLibrasRetiradas;
    private BigDecimal liqLibrasNetas;
    private BigDecimal liqLibrasEntero;
    private BigDecimal liqLibrasCola;
    private BigDecimal liqLibrasColaProcesadas;
    private BigDecimal liqAnimalesCosechados;
    private BigDecimal liqTotalMonto;
    private String liqPendiente;
    private String liqAnulado;
    private String liqCorrida;
    private String provCodigo;
    private String provNombre;
    private String liqBloqueado;
    private String liqDocumentoNumero;
    private String liqComisionista;
    private String liqBines;
    private String liqAguaje;
    private String liqPiscinaEx;
    private String liqGuia;

    public ListaLiquidacionTO() {
    }

    public ListaLiquidacionTO(String liqMotivo, String liqNumero, String liqLote, String liqFecha,
            BigDecimal liqLibrasEnviadas, BigDecimal liqLibrasRecibidas, BigDecimal liqLibrasBasura,
            BigDecimal liqLibrasRetiradas, BigDecimal liqLibrasNetas, BigDecimal liqLibrasEntero,
            BigDecimal liqLibrasCola, BigDecimal liqLibrasColaProcesadas, BigDecimal liqAnimalesCosechados,
            BigDecimal liqTotalMonto, String liqPendiente, String liqAnulado, String cliCodigo, String cliNombre,
            String pisSector, String pisNumero, String provCodigo, String provNombre, Integer id) {
        this.liqMotivo = liqMotivo;
        this.liqNumero = liqNumero;
        this.liqLote = liqLote;
        this.liqFecha = liqFecha;
        this.liqLibrasEnviadas = liqLibrasEnviadas;
        this.liqLibrasRecibidas = liqLibrasRecibidas;
        this.liqLibrasBasura = liqLibrasBasura;
        this.liqLibrasRetiradas = liqLibrasRetiradas;
        this.liqLibrasNetas = liqLibrasNetas;
        this.liqLibrasEntero = liqLibrasEntero;
        this.liqLibrasCola = liqLibrasCola;
        this.liqLibrasColaProcesadas = liqLibrasColaProcesadas;
        this.liqAnimalesCosechados = liqAnimalesCosechados;
        this.liqTotalMonto = liqTotalMonto;
        this.liqPendiente = liqPendiente;
        this.liqAnulado = liqAnulado;
        this.cliCodigo = cliCodigo;
        this.cliNombre = cliNombre;
        this.pisSector = pisSector;
        this.pisNumero = pisNumero;
        this.provCodigo = provCodigo;
        this.provNombre = provNombre;
        this.id = id;
    }

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "liq_bloqueado")
    public String getLiqBloqueado() {
        return liqBloqueado;
    }

    public void setLiqBloqueado(String liqBloqueado) {
        this.liqBloqueado = liqBloqueado;
    }

    @Column(name = "liq_documento_numero")
    public String getLiqDocumentoNumero() {
        return liqDocumentoNumero;
    }

    public void setLiqDocumentoNumero(String liqDocumentoNumero) {
        this.liqDocumentoNumero = liqDocumentoNumero;
    }

    @Column(name = "liq_cliente_codigo")
    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    @Column(name = "liq_cliente_nombre")
    public String getCliNombre() {
        return cliNombre;
    }

    public void setCliNombre(String cliNombre) {
        this.cliNombre = cliNombre;
    }

    @Column(name = "liq_animales_cosechados")
    public BigDecimal getLiqAnimalesCosechados() {
        return liqAnimalesCosechados;
    }

    public void setLiqAnimalesCosechados(BigDecimal liqAnimalesCosechados) {
        this.liqAnimalesCosechados = liqAnimalesCosechados;
    }

    @Column(name = "liq_anulado")
    public String getLiqAnulado() {
        return liqAnulado;
    }

    public void setLiqAnulado(String liqAnulado) {
        this.liqAnulado = liqAnulado;
    }

    @Column(name = "liq_fecha")
    public String getLiqFecha() {
        return liqFecha;
    }

    public void setLiqFecha(String liqFecha) {
        this.liqFecha = liqFecha;
    }

    @Column(name = "liq_libras_basura")
    public BigDecimal getLiqLibrasBasura() {
        return liqLibrasBasura;
    }

    public void setLiqLibrasBasura(BigDecimal liqLibrasBasura) {
        this.liqLibrasBasura = liqLibrasBasura;
    }

    @Column(name = "liq_libras_cola")
    public BigDecimal getLiqLibrasCola() {
        return liqLibrasCola;
    }

    public void setLiqLibrasCola(BigDecimal liqLibrasCola) {
        this.liqLibrasCola = liqLibrasCola;
    }

    @Column(name = "liq_libras_cola_procesadas")
    public BigDecimal getLiqLibrasColaProcesadas() {
        return liqLibrasColaProcesadas;
    }

    public void setLiqLibrasColaProcesadas(BigDecimal liqLibrasColaProcesadas) {
        this.liqLibrasColaProcesadas = liqLibrasColaProcesadas;
    }

    @Column(name = "liq_libras_entero")
    public BigDecimal getLiqLibrasEntero() {
        return liqLibrasEntero;
    }

    public void setLiqLibrasEntero(BigDecimal liqLibrasEntero) {
        this.liqLibrasEntero = liqLibrasEntero;
    }

    @Column(name = "liq_libras_enviadas")
    public BigDecimal getLiqLibrasEnviadas() {
        return liqLibrasEnviadas;
    }

    public void setLiqLibrasEnviadas(BigDecimal liqLibrasEnviadas) {
        this.liqLibrasEnviadas = liqLibrasEnviadas;
    }

    @Column(name = "liq_libras_neta")
    public BigDecimal getLiqLibrasNetas() {
        return liqLibrasNetas;
    }

    public void setLiqLibrasNetas(BigDecimal liqLibrasNetas) {
        this.liqLibrasNetas = liqLibrasNetas;
    }

    @Column(name = "liq_libras_recibidas")
    public BigDecimal getLiqLibrasRecibidas() {
        return liqLibrasRecibidas;
    }

    public void setLiqLibrasRecibidas(BigDecimal liqLibrasRecibidas) {
        this.liqLibrasRecibidas = liqLibrasRecibidas;
    }

    @Column(name = "liq_libras_retiradas")
    public BigDecimal getLiqLibrasRetiradas() {
        return liqLibrasRetiradas;
    }

    public void setLiqLibrasRetiradas(BigDecimal liqLibrasRetiradas) {
        this.liqLibrasRetiradas = liqLibrasRetiradas;
    }

    @Column(name = "liq_lote")
    public String getLiqLote() {
        return liqLote;
    }

    public void setLiqLote(String liqLote) {
        this.liqLote = liqLote;
    }

    @Column(name = "liq_motivo")
    public String getLiqMotivo() {
        return liqMotivo;
    }

    public void setLiqMotivo(String liqMotivo) {
        this.liqMotivo = liqMotivo;
    }

    @Column(name = "liq_numero")
    public String getLiqNumero() {
        return liqNumero;
    }

    public void setLiqNumero(String liqNumero) {
        this.liqNumero = liqNumero;
    }

    @Column(name = "liq_pendiente")
    public String getLiqPendiente() {
        return liqPendiente;
    }

    public void setLiqPendiente(String liqPendiente) {
        this.liqPendiente = liqPendiente;
    }

    @Column(name = "liq_corrida")
    public String getLiqCorrida() {
        return liqCorrida;
    }

    public void setLiqCorrida(String liqCorrida) {
        this.liqCorrida = liqCorrida;
    }

    @Column(name = "liq_total_monto")
    public BigDecimal getLiqTotalMonto() {
        return liqTotalMonto;
    }

    public void setLiqTotalMonto(BigDecimal liqTotalMonto) {
        this.liqTotalMonto = liqTotalMonto;
    }

    @Column(name = "liq_piscina")
    public String getPisNumero() {
        return pisNumero;
    }

    public void setPisNumero(String pisNumero) {
        this.pisNumero = pisNumero;
    }

    @Column(name = "liq_sector")
    public String getPisSector() {
        return pisSector;
    }

    public void setPisSector(String pisSector) {
        this.pisSector = pisSector;
    }

    @Column(name = "liq_proveedor_codigo")
    public String getProvCodigo() {
        return provCodigo;
    }

    public void setProvCodigo(String provCodigo) {
        this.provCodigo = provCodigo;
    }

    @Column(name = "liq_proveedor_nombre")
    public String getProvNombre() {
        return provNombre;
    }

    public void setProvNombre(String provNombre) {
        this.provNombre = provNombre;
    }

    @Column(name = "liq_comisionista")
    public String getLiqComisionista() {
        return liqComisionista;
    }

    public void setLiqComisionista(String liqComisionista) {
        this.liqComisionista = liqComisionista;
    }

    @Column(name = "liq_bines")
    public String getLiqBines() {
        return liqBines;
    }

    public void setLiqBines(String liqBines) {
        this.liqBines = liqBines;
    }

    @Column(name = "liq_aguaje")
    public String getLiqAguaje() {
        return liqAguaje;
    }

    public void setLiqAguaje(String liqAguaje) {
        this.liqAguaje = liqAguaje;
    }

    @Column(name = "liq_piscina_ex")
    public String getLiqPiscinaEx() {
        return liqPiscinaEx;
    }

    public void setLiqPiscinaEx(String liqPiscinaEx) {
        this.liqPiscinaEx = liqPiscinaEx;
    }

    @Column(name="liq_guia")
    public String getLiqGuia() {
        return liqGuia;
    }

    public void setLiqGuia(String liqGuia) {
        this.liqGuia = liqGuia;
    }

}
