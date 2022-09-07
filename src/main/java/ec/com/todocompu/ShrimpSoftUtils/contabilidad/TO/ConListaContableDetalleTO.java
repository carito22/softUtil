/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConCuentas;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdListaPiscinaTO;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdListaSectorTO;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Desarrollador1
 */
public class ConListaContableDetalleTO extends ConDetalleTablaTO {

    private ConCuentas conCuentas;
    private Boolean conEstado;
    private Boolean conFilaEstado;
    private Boolean conEstadoDebitoCreditoValido;
    private Boolean conChequeRepetido;
    private Boolean conCuentaVacia;
    private Boolean conChequeImprimir;
    private PrdListaPiscinaTO piscinaSeleccionada;
    private PrdListaSectorTO sectorSeleccionado;
    private String debidoCredito;
    private BigDecimal saldo;

    private List<PrdListaPiscinaTO> ListapiscinaSeleccionada;

    public ConListaContableDetalleTO() {
    }

    public Boolean getConChequeImprimir() {
        return conChequeImprimir;
    }

    public void setConChequeImprimir(Boolean conChequeImprimir) {
        this.conChequeImprimir = conChequeImprimir;
    }

    public Boolean getConCuentaVacia() {
        return conCuentaVacia;
    }

    public void setConCuentaVacia(Boolean conCuentaVacia) {
        this.conCuentaVacia = conCuentaVacia;
    }

    public Boolean getConEstadoDebitoCreditoValido() {
        return conEstadoDebitoCreditoValido;
    }

    public void setConEstadoDebitoCreditoValido(Boolean conEstadoDebitoCreditoValido) {
        this.conEstadoDebitoCreditoValido = conEstadoDebitoCreditoValido;
    }

    public Boolean getConChequeRepetido() {
        return conChequeRepetido;
    }

    public void setConChequeRepetido(Boolean conChequeRepetido) {
        this.conChequeRepetido = conChequeRepetido;
    }

    public Boolean getConEstado() {
        return conEstado;
    }

    public Boolean getConFilaEstado() {
        return conFilaEstado;
    }

    public void setConFilaEstado(Boolean conFilaEstado) {
        this.conFilaEstado = conFilaEstado;
    }

    public void setConEstado(Boolean conEstado) {
        this.conEstado = conEstado;
    }

    public String getDebidoCredito() {
        return debidoCredito;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void setDebidoCredito(String debidoCredito) {
        this.debidoCredito = debidoCredito;
    }

    public PrdListaPiscinaTO getPiscinaSeleccionada() {
        return piscinaSeleccionada;
    }

    public void setPiscinaSeleccionada(PrdListaPiscinaTO piscinaSeleccionada) {
        this.piscinaSeleccionada = piscinaSeleccionada;
    }

    public PrdListaSectorTO getSectorSeleccionado() {
        return sectorSeleccionado;
    }

    public void setSectorSeleccionado(PrdListaSectorTO sectorSeleccionado) {
        this.sectorSeleccionado = sectorSeleccionado;
    }

    public List<PrdListaPiscinaTO> getListapiscinaSeleccionada() {
        return ListapiscinaSeleccionada;
    }

    public void setListapiscinaSeleccionada(List<PrdListaPiscinaTO> ListapiscinaSeleccionada) {
        this.ListapiscinaSeleccionada = ListapiscinaSeleccionada;
    }

    public ConCuentas getConCuentas() {
        return conCuentas;
    }

    public void setConCuentas(ConCuentas conCuentas) {
        this.conCuentas = conCuentas;
    }

}
