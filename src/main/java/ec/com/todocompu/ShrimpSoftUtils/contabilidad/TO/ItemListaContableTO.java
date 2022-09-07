package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import ec.com.todocompu.ShrimpSoftUtils.banco.TO.ListaBanCuentaTO;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConContable;
import ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConTipo;
import ec.com.todocompu.ShrimpSoftUtils.produccion.TO.PrdListaSectorTO;
import ec.com.todocompu.ShrimpSoftUtils.sistema.entity.SisPeriodo;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

public class ItemListaContableTO {

    private ConContable conContable;
    private SisPeriodo periodoSeleccionado;
    private ConTipoTO tipoSeleccionado;
    private List<ConListaContableDetalleTO> detalle;
    private List<SisPeriodo> ListaperiodoSeleccionado;
    private List<ConTipo> listaTipoContable;
    private List<ConTipoTO> listaTipoContableTO;
    private ConTipo tipoContableSeleccionado;
    private List<PrdListaSectorTO> ListasectorSeleccionado;
    private String conReferencia;
    private Timestamp fechaActual;
    private boolean isPeriodoAbierto;
    private boolean isDetalleValido;
    private List<ListaBanCuentaTO> listaCuentaBanco;

    public String getConReferencia() {
        return conReferencia;
    }

    public void setConReferencia(String conReferencia) {
        this.conReferencia = conReferencia;
    }

    public List<PrdListaSectorTO> getListasectorSeleccionado() {
        return ListasectorSeleccionado;
    }

    public void setListasectorSeleccionado(List<PrdListaSectorTO> ListasectorSeleccionado) {
        this.ListasectorSeleccionado = ListasectorSeleccionado;
    }

    public ConTipo getTipoContableSeleccionado() {
        return tipoContableSeleccionado;
    }

    public void setTipoContableSeleccionado(ConTipo tipoContableSeleccionado) {
        this.tipoContableSeleccionado = tipoContableSeleccionado;
    }

    public List<ConTipo> getListaTipoContable() {
        return listaTipoContable;
    }

    public void setListaTipoContable(List<ConTipo> listaTipoContable) {
        this.listaTipoContable = listaTipoContable;
    }

    public List<SisPeriodo> getListaperiodoSeleccionado() {
        return ListaperiodoSeleccionado;
    }

    public void setListaperiodoSeleccionado(List<SisPeriodo> ListaperiodoSeleccionado) {
        this.ListaperiodoSeleccionado = ListaperiodoSeleccionado;
    }
    private String conStatus;
    private Date fechaFormato;
    private boolean generado;

    public boolean isGenerado() {
        return generado;
    }

    public void setGenerado(boolean generado) {
        this.generado = generado;
    }

    public String getConStatus() {
        return conStatus;
    }

    public void setConStatus(String conStatus) {
        this.conStatus = conStatus;
    }

    public Date getFechaFormato() {
        return fechaFormato;
    }

    public void setFechaFormato(Date fechaFormato) {
        this.fechaFormato = fechaFormato;
    }

    public ItemListaContableTO() {
    }

    public ConTipoTO getTipoSeleccionado() {
        return tipoSeleccionado;
    }

    public void setTipoSeleccionado(ConTipoTO tipoSeleccionado) {
        this.tipoSeleccionado = tipoSeleccionado;
    }

    public ConContable getConContable() {
        return conContable;
    }

    public void setConContable(ConContable conContable) {
        this.conContable = conContable;
    }

    public SisPeriodo getPeriodoSeleccionado() {
        return periodoSeleccionado;
    }

    public void setPeriodoSeleccionado(SisPeriodo periodoSeleccionado) {
        this.periodoSeleccionado = periodoSeleccionado;
    }

    public List<ConListaContableDetalleTO> getDetalle() {
        return detalle;
    }

    public void setDetalle(List<ConListaContableDetalleTO> detalle) {
        this.detalle = detalle;
    }

    public List<ConTipoTO> getListaTipoContableTO() {
        return listaTipoContableTO;
    }

    public void setListaTipoContableTO(List<ConTipoTO> listaTipoContableTO) {
        this.listaTipoContableTO = listaTipoContableTO;
    }

    public List<ListaBanCuentaTO> getListaCuentaBanco() {
        return listaCuentaBanco;
    }

    public void setListaCuentaBanco(List<ListaBanCuentaTO> listaCuentaBanco) {
        this.listaCuentaBanco = listaCuentaBanco;
    }

    public Timestamp getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(Timestamp fechaActual) {
        this.fechaActual = fechaActual;
    }

    public boolean isIsPeriodoAbierto() {
        return isPeriodoAbierto;
    }

    public void setIsPeriodoAbierto(boolean isPeriodoAbierto) {
        this.isPeriodoAbierto = isPeriodoAbierto;
    }

    public boolean isIsDetalleValido() {
        return isDetalleValido;
    }

    public void setIsDetalleValido(boolean isDetalleValido) {
        this.isDetalleValido = isDetalleValido;
    }

}
