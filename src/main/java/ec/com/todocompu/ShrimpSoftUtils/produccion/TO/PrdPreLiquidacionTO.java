/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class PrdPreLiquidacionTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "pl_empresa")
    private String plEmpresa;

    @Column(name = "pl_motivo")
    private String plMotivo;

    @Column(name = "pl_numero")
    private String plNumero;

    @Column(name = "pl_lote")
    private String plLote;

    @Column(name = "pl_fecha")
    private String plFecha;

    @Column(name = "pl_libras_enviadas")
    private BigDecimal plLibrasEnviadas;

    @Column(name = "pl_libras_recibidas")
    private BigDecimal plLibrasRecibidas;

    @Column(name = "pl_libras_basura")
    private BigDecimal plLibrasBasura;

    @Column(name = "pl_libras_retiradas")
    private BigDecimal plLibrasRetiradas;

    @Column(name = "pl_libras_netas")
    private BigDecimal plLibrasNetas;

    @Column(name = "pl_libras_entero")
    private BigDecimal plLibrasEntero;

    @Column(name = "pl_libras_cola")
    private BigDecimal plLibrasCola;

    @Column(name = "pl_libras_cola_procesadas")
    private BigDecimal plLibrasColaProcesadas;

    @Column(name = "pl_animales_cosechados")
    private BigDecimal plAnimalesCosechados;

    @Column(name = "pl_total_monto")
    private BigDecimal plTotalMonto;

    @Column(name = "pl_pendiente")
    private boolean plPendiente;

    @Column(name = "pl_anulado")
    private boolean plAnulado;

    @Column(name = "cli_empresa")
    private String cliEmpresa;

    @Column(name = "cli_codigo")
    private String cliCodigo;

    @Column(name = "pis_empresa")
    private String pisEmpresa;

    @Column(name = "pis_sector")
    private String pisSector;

    @Column(name = "pis_numero")
    private String pisNumero;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    public PrdPreLiquidacionTO() {
    }

    public PrdPreLiquidacionTO(String plEmpresa, String plMotivo, String plNumero, String plLote, String plFecha,
            BigDecimal plLibrasEnviadas, BigDecimal plLibrasRecibidas, BigDecimal plLibrasBasura,
            BigDecimal plLibrasRetiradas, BigDecimal plLibrasNetas, BigDecimal plLibrasEntero,
            BigDecimal plLibrasCola, BigDecimal plLibrasColaProcesadas, BigDecimal plAnimalesCosechados,
            BigDecimal plTotalMonto, boolean plPendiente, boolean plAnulado, String cliEmpresa, String cliCodigo,
            String pisEmpresa, String pisSector, String pisNumero, String usrEmpresa, String usrCodigo,
            String usrFechaInserta) {
        this.plEmpresa = plEmpresa;
        this.plMotivo = plMotivo;
        this.plNumero = plNumero;
        this.plLote = plLote;
        this.plFecha = plFecha;
        this.plLibrasEnviadas = plLibrasEnviadas;
        this.plLibrasRecibidas = plLibrasRecibidas;
        this.plLibrasBasura = plLibrasBasura;
        this.plLibrasRetiradas = plLibrasRetiradas;
        this.plLibrasNetas = plLibrasNetas;
        this.plLibrasEntero = plLibrasEntero;
        this.plLibrasCola = plLibrasCola;
        this.plLibrasColaProcesadas = plLibrasColaProcesadas;
        this.plAnimalesCosechados = plAnimalesCosechados;
        this.plTotalMonto = plTotalMonto;
        this.plPendiente = plPendiente;
        this.plAnulado = plAnulado;
        this.cliEmpresa = cliEmpresa;
        this.cliCodigo = cliCodigo;
        this.pisEmpresa = pisEmpresa;
        this.pisSector = pisSector;
        this.pisNumero = pisNumero;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getPlEmpresa() {
        return plEmpresa;
    }

    public void setPlEmpresa(String plEmpresa) {
        this.plEmpresa = plEmpresa;
    }

    public String getPlMotivo() {
        return plMotivo;
    }

    public void setPlMotivo(String plMotivo) {
        this.plMotivo = plMotivo;
    }

    public String getPlNumero() {
        return plNumero;
    }

    public void setPlNumero(String plNumero) {
        this.plNumero = plNumero;
    }

    public String getPlLote() {
        return plLote;
    }

    public void setPlLote(String plLote) {
        this.plLote = plLote;
    }

    public String getPlFecha() {
        return plFecha;
    }

    public void setPlFecha(String plFecha) {
        this.plFecha = plFecha;
    }

    public BigDecimal getPlLibrasEnviadas() {
        return plLibrasEnviadas;
    }

    public void setPlLibrasEnviadas(BigDecimal plLibrasEnviadas) {
        this.plLibrasEnviadas = plLibrasEnviadas;
    }

    public BigDecimal getPlLibrasRecibidas() {
        return plLibrasRecibidas;
    }

    public void setPlLibrasRecibidas(BigDecimal plLibrasRecibidas) {
        this.plLibrasRecibidas = plLibrasRecibidas;
    }

    public BigDecimal getPlLibrasBasura() {
        return plLibrasBasura;
    }

    public void setPlLibrasBasura(BigDecimal plLibrasBasura) {
        this.plLibrasBasura = plLibrasBasura;
    }

    public BigDecimal getPlLibrasRetiradas() {
        return plLibrasRetiradas;
    }

    public void setPlLibrasRetiradas(BigDecimal plLibrasRetiradas) {
        this.plLibrasRetiradas = plLibrasRetiradas;
    }

    public BigDecimal getPlLibrasNetas() {
        return plLibrasNetas;
    }

    public void setPlLibrasNetas(BigDecimal plLibrasNetas) {
        this.plLibrasNetas = plLibrasNetas;
    }

    public BigDecimal getPlLibrasEntero() {
        return plLibrasEntero;
    }

    public void setPlLibrasEntero(BigDecimal plLibrasEntero) {
        this.plLibrasEntero = plLibrasEntero;
    }

    public BigDecimal getPlLibrasCola() {
        return plLibrasCola;
    }

    public void setPlLibrasCola(BigDecimal plLibrasCola) {
        this.plLibrasCola = plLibrasCola;
    }

    public BigDecimal getPlLibrasColaProcesadas() {
        return plLibrasColaProcesadas;
    }

    public void setPlLibrasColaProcesadas(BigDecimal plLibrasColaProcesadas) {
        this.plLibrasColaProcesadas = plLibrasColaProcesadas;
    }

    public BigDecimal getPlAnimalesCosechados() {
        return plAnimalesCosechados;
    }

    public void setPlAnimalesCosechados(BigDecimal plAnimalesCosechados) {
        this.plAnimalesCosechados = plAnimalesCosechados;
    }

    public BigDecimal getPlTotalMonto() {
        return plTotalMonto;
    }

    public void setPlTotalMonto(BigDecimal plTotalMonto) {
        this.plTotalMonto = plTotalMonto;
    }

    public boolean isPlPendiente() {
        return plPendiente;
    }

    public void setPlPendiente(boolean plPendiente) {
        this.plPendiente = plPendiente;
    }

    public boolean isPlAnulado() {
        return plAnulado;
    }

    public void setPlAnulado(boolean plAnulado) {
        this.plAnulado = plAnulado;
    }

    public String getCliEmpresa() {
        return cliEmpresa;
    }

    public void setCliEmpresa(String cliEmpresa) {
        this.cliEmpresa = cliEmpresa;
    }

    public String getCliCodigo() {
        return cliCodigo;
    }

    public void setCliCodigo(String cliCodigo) {
        this.cliCodigo = cliCodigo;
    }

    public String getPisEmpresa() {
        return pisEmpresa;
    }

    public void setPisEmpresa(String pisEmpresa) {
        this.pisEmpresa = pisEmpresa;
    }

    public String getPisSector() {
        return pisSector;
    }

    public void setPisSector(String pisSector) {
        this.pisSector = pisSector;
    }

    public String getPisNumero() {
        return pisNumero;
    }

    public void setPisNumero(String pisNumero) {
        this.pisNumero = pisNumero;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    

}
