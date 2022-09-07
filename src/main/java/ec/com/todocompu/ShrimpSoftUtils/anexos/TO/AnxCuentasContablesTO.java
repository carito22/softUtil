/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author paca94
 */
@Entity
public class AnxCuentasContablesTO implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    // @Id
    // @Column(name = "id")
    // private Integer id;
    @Id
    @Column(name = "cta_secuencial")
    private Integer ctaSecuencial;

    @Column(name = "cta_empresa")
    private String ctaEmpresa;

    @Column(name = "cta_iva_pagado")
    private String ctaIvaPagado;

    @Column(name = "cta_iva_pagado_activo_fijo")
    private String ctaIvaPagadoActivoFijo;

    @Column(name = "cta_iva_pagado_gasto")
    private String ctaIvaPagadoGasto;

    @Column(name = "cta_iva_cobrado")
    private String ctaIvaCobrado;

    @Column(name = "cta_ret_fte_iva_pagado")
    private String ctaRetFteIvaPagado;

    @Column(name = "cta_ret_fte_iva_cobrado")
    private String ctaRetFteIvaCobrado;

    @Column(name = "cta_ret_fte_iva_asumido")
    private String ctaRetFteIvaAsumido;

    @Column(name = "cta_ret_fte_ir_pagado")
    private String ctaRetFteIrPagado;

    @Column(name = "cta_ret_fte_ir_cobrado")
    private String ctaRetFteIrCobrado;

    @Column(name = "cta_ret_fte_ir_asumido")
    private String ctaRetFteIrAsumido;

    @Column(name = "cta_otros_impuestos")
    private String ctaOtrosImpuestos;

    @Column(name = "cta_cuentas_por_cobrar")
    private String ctaCuentasPorCobrar;

    @Column(name = "cta_cuentas_por_pagar")
    private String ctaCuentasPorPagar;

    @Column(name = "cta_cuentas_por_pagar_activo_fijo")
    private String ctaCuentasPorPagarActivoFijo;

    @Column(name = "cta_anticipos_de_clientes")
    private String ctaAnticiposDeClientes;
    // cta_anticipos_a_proveedores

    @Column(name = "cta_anticipos_a_proveedores")
    private String ctaAnticiposAProveedores;

    @Column(name = "cta_inventario_productos_proceso")
    private String ctaInventarioProductosProceso;

    @Column(name = "cta_costo_productos_proceso")
    private String ctaCostoProductosProceso;

    @Column(name = "cta_utilidad_ejercicio")
    private String ctaUtilidadEjercicio;

    @Column(name = "cta_propina")
    private String ctaPropina;

    @Column(name = "cta_cuentas_mercaderia_transito")
    private String ctaCuentasMercaderiaTransito;
    
    @Column(name = "cta_costo_inicial_productos_proceso")
    private String ctaCostoInicialProductosProceso;

    @Column(name = "cta_costo_final_productos_proceso")
    private String ctaCostoFinalProductosProceso;
    
    public AnxCuentasContablesTO() {
    }

    public String getCtaAnticiposAProveedores() {
        return ctaAnticiposAProveedores;
    }

    public void setCtaAnticiposAProveedores(String ctaAnticiposAProveedores) {
        this.ctaAnticiposAProveedores = ctaAnticiposAProveedores;
    }

    public String getCtaAnticiposDeClientes() {
        return ctaAnticiposDeClientes;
    }

    public void setCtaAnticiposDeClientes(String ctaAnticiposDeClientes) {
        this.ctaAnticiposDeClientes = ctaAnticiposDeClientes;
    }

    public String getCtaCuentasPorCobrar() {
        return ctaCuentasPorCobrar;
    }

    public void setCtaCuentasPorCobrar(String ctaCuentasPorCobrar) {
        this.ctaCuentasPorCobrar = ctaCuentasPorCobrar;
    }

    public String getCtaCuentasPorPagar() {
        return ctaCuentasPorPagar;
    }

    public void setCtaCuentasPorPagar(String ctaCuentasPorPagar) {
        this.ctaCuentasPorPagar = ctaCuentasPorPagar;
    }

    public String getCtaCuentasPorPagarActivoFijo() {
        return ctaCuentasPorPagarActivoFijo;
    }

    public void setCtaCuentasPorPagarActivoFijo(String ctaCuentasPorPagarActivoFijo) {
        this.ctaCuentasPorPagarActivoFijo = ctaCuentasPorPagarActivoFijo;
    }

    public String getCtaEmpresa() {
        return ctaEmpresa;
    }

    public void setCtaEmpresa(String ctaEmpresa) {
        this.ctaEmpresa = ctaEmpresa;
    }

    public String getCtaIvaCobrado() {
        return ctaIvaCobrado;
    }

    public void setCtaIvaCobrado(String ctaIvaCobrado) {
        this.ctaIvaCobrado = ctaIvaCobrado;
    }

    public String getCtaIvaPagado() {
        return ctaIvaPagado;
    }

    public void setCtaIvaPagado(String ctaIvaPagado) {
        this.ctaIvaPagado = ctaIvaPagado;
    }

    public String getCtaOtrosImpuestos() {
        return ctaOtrosImpuestos;
    }

    public void setCtaOtrosImpuestos(String ctaOtrosImpuestos) {
        this.ctaOtrosImpuestos = ctaOtrosImpuestos;
    }

    public String getCtaRetFteIrAsumido() {
        return ctaRetFteIrAsumido;
    }

    public void setCtaRetFteIrAsumido(String ctaRetFteIrAsumido) {
        this.ctaRetFteIrAsumido = ctaRetFteIrAsumido;
    }

    public String getCtaRetFteIrCobrado() {
        return ctaRetFteIrCobrado;
    }

    public void setCtaRetFteIrCobrado(String ctaRetFteIrCobrado) {
        this.ctaRetFteIrCobrado = ctaRetFteIrCobrado;
    }

    public String getCtaRetFteIrPagado() {
        return ctaRetFteIrPagado;
    }

    public void setCtaRetFteIrPagado(String ctaRetFteIrPagado) {
        this.ctaRetFteIrPagado = ctaRetFteIrPagado;
    }

    public String getCtaRetFteIvaAsumido() {
        return ctaRetFteIvaAsumido;
    }

    public void setCtaRetFteIvaAsumido(String ctaRetFteIvaAsumido) {
        this.ctaRetFteIvaAsumido = ctaRetFteIvaAsumido;
    }

    public String getCtaRetFteIvaCobrado() {
        return ctaRetFteIvaCobrado;
    }

    public void setCtaRetFteIvaCobrado(String ctaRetFteIvaCobrado) {
        this.ctaRetFteIvaCobrado = ctaRetFteIvaCobrado;
    }

    public String getCtaRetFteIvaPagado() {
        return ctaRetFteIvaPagado;
    }

    public void setCtaRetFteIvaPagado(String ctaRetFteIvaPagado) {
        this.ctaRetFteIvaPagado = ctaRetFteIvaPagado;
    }

    public Integer getCtaSecuencial() {
        return ctaSecuencial;
    }

    public void setCtaSecuencial(Integer ctaSecuencial) {
        this.ctaSecuencial = ctaSecuencial;
    }

    public String getCtaInventarioProductosProceso() {
        return ctaInventarioProductosProceso;
    }

    public void setCtaInventarioProductosProceso(String ctaInventarioProductosProceso) {
        this.ctaInventarioProductosProceso = ctaInventarioProductosProceso;
    }

    public String getCtaCostoProductosProceso() {
        return ctaCostoProductosProceso;
    }

    public void setCtaCostoProductosProceso(String ctaCostoProductosProceso) {
        this.ctaCostoProductosProceso = ctaCostoProductosProceso;
    }

    public String getCtaUtilidadEjercicio() {
        return ctaUtilidadEjercicio;
    }

    public void setCtaUtilidadEjercicio(String ctaUtilidadEjercicio) {
        this.ctaUtilidadEjercicio = ctaUtilidadEjercicio;
    }

    public String getCtaIvaPagadoGasto() {
        return ctaIvaPagadoGasto;
    }

    public void setCtaIvaPagadoGasto(String ctaIvaPagadoGasto) {
        this.ctaIvaPagadoGasto = ctaIvaPagadoGasto;
    }

    public String getCtaPropina() {
        return ctaPropina;
    }

    public void setCtaPropina(String ctaPropina) {
        this.ctaPropina = ctaPropina;
    }

    public String getCtaIvaPagadoActivoFijo() {
        return ctaIvaPagadoActivoFijo;
    }

    public void setCtaIvaPagadoActivoFijo(String ctaIvaPagadoActivoFijo) {
        this.ctaIvaPagadoActivoFijo = ctaIvaPagadoActivoFijo;
    }

    public String getCtaCuentasMercaderiaTransito() {
        return ctaCuentasMercaderiaTransito;
    }

    public void setCtaCuentasMercaderiaTransito(String ctaCuentasMercaderiaTransito) {
        this.ctaCuentasMercaderiaTransito = ctaCuentasMercaderiaTransito;
    }

    public String getCtaCostoInicialProductosProceso() {
        return ctaCostoInicialProductosProceso;
    }

    public void setCtaCostoInicialProductosProceso(String ctaCostoInicialProductosProceso) {
        this.ctaCostoInicialProductosProceso = ctaCostoInicialProductosProceso;
    }

    public String getCtaCostoFinalProductosProceso() {
        return ctaCostoFinalProductosProceso;
    }

    public void setCtaCostoFinalProductosProceso(String ctaCostoFinalProductosProceso) {
        this.ctaCostoFinalProductosProceso = ctaCostoFinalProductosProceso;
    }
    
}
