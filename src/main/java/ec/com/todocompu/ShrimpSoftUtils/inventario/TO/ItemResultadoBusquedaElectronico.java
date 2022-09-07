/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import ec.com.todocompu.ShrimpSoftUtils.UtilsDate;
import ec.com.todocompu.ShrimpSoftUtils.UtilsValidacion;
import ec.com.todocompu.ShrimpSoftUtils.sri.util.TipoAmbienteEnum;
import ec.com.todocompu.ShrimpSoftUtils.sri.util.TipoComprobanteEnum;
import ec.com.todocompu.ShrimpSoftUtils.sri.ws.autorizacion.Autorizacion;
import java.util.Date;

public class ItemResultadoBusquedaElectronico {

    public static ItemResultadoBusquedaElectronico convertirAutorizacionEnItemResultadoBusquedaElectronico(Autorizacion autorizacion) {
        ItemResultadoBusquedaElectronico itemResultadoFinal = new ItemResultadoBusquedaElectronico();
        itemResultadoFinal.setRucComprador(autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<identificacionComprador>") + 25, autorizacion.getComprobante().lastIndexOf("</identificacionComprador>")).trim());
        itemResultadoFinal.setNombre(autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<razonSocial>") + 13, autorizacion.getComprobante().lastIndexOf("</razonSocial>")).trim());
        itemResultadoFinal.setRucProveedor(autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<ruc>") + 5, autorizacion.getComprobante().lastIndexOf("</ruc>")).trim());
        itemResultadoFinal.setNumeroAutorizacion(autorizacion.getNumeroAutorizacion());

        itemResultadoFinal.setFechaAutorizacion(UtilsValidacion.fecha(autorizacion.getFechaAutorizacion().toGregorianCalendar().getTime(), "yyyy-MM-dd hh:mm:ss"));
        itemResultadoFinal.setEstado(autorizacion.getEstado());
        itemResultadoFinal.setFechaAut(UtilsDate.fechaFormatoDate(itemResultadoFinal.getFechaAutorizacion(), "yyyy-MM-dd"));
        itemResultadoFinal.setFechaCaduca(UtilsDate.fechaFormatoDate(itemResultadoFinal.getFechaAutorizacion(), "yyyy-MM-dd"));

        itemResultadoFinal.setNumeroDocumento(
                autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<estab>") + 7, autorizacion.getComprobante().lastIndexOf("</estab>")).trim()
                + "-"
                + autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<ptoEmi>") + 8, autorizacion.getComprobante().lastIndexOf("</ptoEmi>")).trim()
                + "-"
                + autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<secuencial>") + 12, autorizacion.getComprobante().lastIndexOf("</secuencial>")).trim());

        itemResultadoFinal.setFechaEmision(autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<fechaEmision>") + 14, autorizacion.getComprobante().lastIndexOf("</fechaEmision>")).trim());
        itemResultadoFinal.setFechaCompra(UtilsDate.fechaFormatoDate(itemResultadoFinal.getFechaEmision(), "dd/MM/yyyy"));

        itemResultadoFinal.setAmbiente(
                autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<ambiente>") + 10, autorizacion.getComprobante().lastIndexOf("</ambiente>")).trim().equals(TipoAmbienteEnum.PRODUCCION.getCode())
                ? TipoAmbienteEnum.PRODUCCION.toString() : TipoAmbienteEnum.PRUEBAS.toString());

        String comprobante = "";
        String total = "";
        String complemento = "";
        String codDocu = autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<codDoc>") + 8, autorizacion.getComprobante().lastIndexOf("</codDoc>")).trim();

        if (codDocu.equals(TipoComprobanteEnum.FACTURA.getCode())) {
            comprobante = TipoComprobanteEnum.FACTURA.getDescripcion();
            total = autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<importeTotal>") + 14, autorizacion.getComprobante().lastIndexOf("</importeTotal>")).trim();
        } else if (codDocu.equals(TipoComprobanteEnum.NOTA_DE_CREDITO.getCode())) {
            complemento = autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<numDocModificado>") + 18, autorizacion.getComprobante().lastIndexOf("</numDocModificado>")).trim();
            comprobante = TipoComprobanteEnum.NOTA_DE_CREDITO.getDescripcion();
            total = autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<valorModificacion>") + 19, autorizacion.getComprobante().lastIndexOf("</valorModificacion>")).trim();
        } else if (codDocu.equals(TipoComprobanteEnum.NOTA_DE_DEBITO.getCode())) {
            complemento = autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<numDocModificado>") + 18, autorizacion.getComprobante().lastIndexOf("</numDocModificado>")).trim();
            comprobante = TipoComprobanteEnum.NOTA_DE_DEBITO.getDescripcion();
            total = autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<valorTotal>") + 12,
                    autorizacion.getComprobante().lastIndexOf("</valorTotal>")).trim();
        } else if (codDocu.equals(TipoComprobanteEnum.COMPROBANTE_DE_RETENCION.getCode())) {
            comprobante = TipoComprobanteEnum.COMPROBANTE_DE_RETENCION.getDescripcion();
        }
        itemResultadoFinal.setCodigoDocumento(codDocu);
        itemResultadoFinal.setTipoComprobante(comprobante);
        itemResultadoFinal.setTotalComprobante(total);
        itemResultadoFinal.setNumeroComplemento(complemento);

        return itemResultadoFinal;
    }

    String nombre;
    String rucProveedor;
    String numeroAutorizacion;
    String fechaAutorizacion;
    String codigoDocumento;
    String estado;
    String numeroDocumento;
    String fechaEmision;
    String ambiente;
    String tipoComprobante;
    String totalComprobante;
    String rucComprador;
    String idProveedor;
    Date fechaAut;
    Date fechaCaduca;
    Date fechaCompra;
    String provTipoId;
    String numeroComplemento;

    public ItemResultadoBusquedaElectronico() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRucProveedor() {
        return rucProveedor;
    }

    public void setRucProveedor(String rucProveedor) {
        this.rucProveedor = rucProveedor;
    }

    public String getNumeroAutorizacion() {
        return numeroAutorizacion;
    }

    public void setNumeroAutorizacion(String numeroAutorizacion) {
        this.numeroAutorizacion = numeroAutorizacion;
    }

    public String getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    public void setFechaAutorizacion(String fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }

    public String getCodigoDocumento() {
        return codigoDocumento;
    }

    public void setCodigoDocumento(String codigoDocumento) {
        this.codigoDocumento = codigoDocumento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getTotalComprobante() {
        return totalComprobante;
    }

    public void setTotalComprobante(String totalComprobante) {
        this.totalComprobante = totalComprobante;
    }

    public String getRucComprador() {
        return rucComprador;
    }

    public void setRucComprador(String rucComprador) {
        this.rucComprador = rucComprador;
    }

    public String getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(String idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Date getFechaAut() {
        return fechaAut;
    }

    public void setFechaAut(Date fechaAut) {
        this.fechaAut = fechaAut;
    }

    public Date getFechaCaduca() {
        return fechaCaduca;
    }

    public void setFechaCaduca(Date fechaCaduca) {
        this.fechaCaduca = fechaCaduca;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getProvTipoId() {
        return provTipoId;
    }

    public void setProvTipoId(String provTipoId) {
        this.provTipoId = provTipoId;
    }

    public String getNumeroComplemento() {
        return numeroComplemento;
    }

    public void setNumeroComplemento(String numeroComplemento) {
        this.numeroComplemento = numeroComplemento;
    }

}
