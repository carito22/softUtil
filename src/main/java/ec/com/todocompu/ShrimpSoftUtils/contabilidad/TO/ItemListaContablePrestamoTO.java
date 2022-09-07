/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConTipo;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdListaSectorTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.entity.SisPeriodo;
import java.util.Date;
import java.util.List;

/**
 *
 * @author tabango94
 */
public class ItemListaContablePrestamoTO extends ListaConContableTO {
    private String conStatus;
    private boolean generado;
    private List<ConListaContableDetalleTO> detalle;
    private Date fechaFormato;
    private SisPeriodo periodoSeleccionado;
    private List<SisPeriodo> ListaperiodoSeleccionado;
    private List<ConTipo> listaTipoContable;
    private ConTipo tipoContableSeleccionado;
    private List<PrdListaSectorTO> ListasectorSeleccionado;


    public String getConStatus() {
        return conStatus;
    }

    public void setConStatus(String conStatus) {
        this.conStatus = conStatus;
    }

    public boolean isGenerado() {
        return generado;
    }

    public void setGenerado(boolean generado) {
        this.generado = generado;
    }

    public List<ConListaContableDetalleTO> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<ConListaContableDetalleTO> detalle) {
        this.detalle = detalle;
    }

    public Date getFechaFormato() {
        return fechaFormato;
    }

    public void setFechaFormato(Date fechaFormato) {
        this.fechaFormato = fechaFormato;
    }

    public SisPeriodo getPeriodoSeleccionado() {
        return periodoSeleccionado;
    }

    public void setPeriodoSeleccionado(SisPeriodo periodoSeleccionado) {
        this.periodoSeleccionado = periodoSeleccionado;
    }

    public List<SisPeriodo> getListaperiodoSeleccionado() {
        return ListaperiodoSeleccionado;
    }

    public void setListaperiodoSeleccionado(List<SisPeriodo> ListaperiodoSeleccionado) {
        this.ListaperiodoSeleccionado = ListaperiodoSeleccionado;
    }

    public List<ConTipo> getListaTipoContable() {
        return listaTipoContable;
    }

    public void setListaTipoContable(List<ConTipo> listaTipoContable) {
        this.listaTipoContable = listaTipoContable;
    }

    public ConTipo getTipoContableSeleccionado() {
        return tipoContableSeleccionado;
    }

    public void setTipoContableSeleccionado(ConTipo tipoContableSeleccionado) {
        this.tipoContableSeleccionado = tipoContableSeleccionado;
    }

    public List<PrdListaSectorTO> getListasectorSeleccionado() {
        return ListasectorSeleccionado;
    }

    public void setListasectorSeleccionado(List<PrdListaSectorTO> ListasectorSeleccionado) {
        this.ListasectorSeleccionado = ListasectorSeleccionado;
    }
    
    
}
