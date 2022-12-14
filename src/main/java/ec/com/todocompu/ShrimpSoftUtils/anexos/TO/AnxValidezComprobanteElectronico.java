/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

import ec.com.todocompu.ShrimpSoftUtils.UtilsValidacion;
import ec.com.todocompu.ShrimpSoftUtils.sri.util.TipoAmbienteEnum;
import ec.com.todocompu.ShrimpSoftUtils.sri.util.TipoComprobanteEnum;
import ec.com.todocompu.ShrimpSoftUtils.sri.ws.autorizacion.Autorizacion;
import ec.com.todocompu.ShrimpSoftUtils.sri.ws.autorizacion.RespuestaComprobante;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AnxValidezComprobanteElectronico implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id

    String clave;
    String tipoComprobante;
    String ambiente;
    String razonSocialEmisor;
    String rucEmisor;
    String estado;
    String numeroDocumento;
    String fechaEmision;
    String fechaAutorizacion;
    String totalComprobante;
    String numeroAutorizacion;
    String codigoDocumento;
    RespuestaComprobante respuestaComprobante;

    public AnxValidezComprobanteElectronico() {
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public String getRazonSocialEmisor() {
        return razonSocialEmisor;
    }

    public void setRazonSocialEmisor(String razonSocialEmisor) {
        this.razonSocialEmisor = razonSocialEmisor;
    }

    public String getRucEmisor() {
        return rucEmisor;
    }

    public void setRucEmisor(String rucEmisor) {
        this.rucEmisor = rucEmisor;
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

    public String getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    public void setFechaAutorizacion(String fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }

    public String getTotalComprobante() {
        return totalComprobante;
    }

    public void setTotalComprobante(String totalComprobante) {
        this.totalComprobante = totalComprobante;
    }

    public String getNumeroAutorizacion() {
        return numeroAutorizacion;
    }

    public void setNumeroAutorizacion(String numeroAutorizacion) {
        this.numeroAutorizacion = numeroAutorizacion;
    }

    public String getCodigoDocumento() {
        return codigoDocumento;
    }

    public void setCodigoDocumento(String codigoDocumento) {
        this.codigoDocumento = codigoDocumento;
    }

    public RespuestaComprobante getRespuestaComprobante() {
        return respuestaComprobante;
    }

    public void setRespuestaComprobante(RespuestaComprobante respuestaComprobante) {
        this.respuestaComprobante = respuestaComprobante;
    }

    public static AnxValidezComprobanteElectronico convertirXMLEnITEM(Autorizacion autorizacion) {

        AnxValidezComprobanteElectronico itemResultadoFinal = new AnxValidezComprobanteElectronico();

        /*TIPO COMPROBANTE*/
        String comprobante = "";
        String total = "";
        String tipoComprobante = autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<codDoc>") + 8, autorizacion.getComprobante().lastIndexOf("</codDoc>")).trim();

        if (tipoComprobante.equals(TipoComprobanteEnum.FACTURA.getCode())) {
            comprobante = TipoComprobanteEnum.FACTURA.getDescripcion();
            total = autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<importeTotal>") + 14, autorizacion.getComprobante().lastIndexOf("</importeTotal>")).trim();
        } else if (tipoComprobante.equals(TipoComprobanteEnum.NOTA_DE_CREDITO.getCode())) {
            comprobante = TipoComprobanteEnum.NOTA_DE_CREDITO.getDescripcion();
            total = autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<valorModificacion>") + 19, autorizacion.getComprobante().lastIndexOf("</valorModificacion>")).trim();
        } else if (tipoComprobante.equals(TipoComprobanteEnum.NOTA_DE_DEBITO.getCode())) {
            comprobante = TipoComprobanteEnum.NOTA_DE_DEBITO.getDescripcion();
            total = autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<valorTotal>") + 12, autorizacion.getComprobante().lastIndexOf("</valorTotal>")).trim();
        } else if (tipoComprobante.equals(TipoComprobanteEnum.COMPROBANTE_DE_RETENCION.getCode())) {
            comprobante = TipoComprobanteEnum.COMPROBANTE_DE_RETENCION.getDescripcion();
        }
        itemResultadoFinal.setTipoComprobante(comprobante);
        itemResultadoFinal.setTotalComprobante(total);

        /*AMBIENTE*/
        itemResultadoFinal.setAmbiente(
                autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<ambiente>") + 10, autorizacion.getComprobante().lastIndexOf("</ambiente>")).trim().equals(TipoAmbienteEnum.PRODUCCION.getCode())
                ? TipoAmbienteEnum.PRODUCCION.toString() : TipoAmbienteEnum.PRUEBAS.toString());

        /*RAZ??N SOCIAL EMISOR*/
        itemResultadoFinal.setRazonSocialEmisor(autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<razonSocial>") + 13, autorizacion.getComprobante().lastIndexOf("</razonSocial>")).trim());

        /*RUC DEL EMISOR*/
        itemResultadoFinal.setRucEmisor(autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<ruc>") + 5, autorizacion.getComprobante().lastIndexOf("</ruc>")).trim());

        /*ESTADO*/
        itemResultadoFinal.setEstado(autorizacion.getEstado());

        /*N??MERO DOCUMENTO*/
        itemResultadoFinal.setNumeroDocumento(
                autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<estab>") + 7, autorizacion.getComprobante().lastIndexOf("</estab>")).trim()
                + "-"
                + autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<ptoEmi>") + 8, autorizacion.getComprobante().lastIndexOf("</ptoEmi>")).trim()
                + "-"
                + autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<secuencial>") + 12, autorizacion.getComprobante().lastIndexOf("</secuencial>")).trim());

        /*FECHA EMISI??N*/
        itemResultadoFinal.setFechaEmision(autorizacion.getComprobante().substring(autorizacion.getComprobante().lastIndexOf("<fechaEmision>") + 14, autorizacion.getComprobante().lastIndexOf("</fechaEmision>")).trim());

        /*NUMERO AUTORIZACI??N*/
        itemResultadoFinal.setNumeroAutorizacion(autorizacion.getNumeroAutorizacion());

        /*FECHA AUTORIZACI??N*/
        itemResultadoFinal.setFechaAutorizacion(UtilsValidacion.fecha(autorizacion.getFechaAutorizacion().toGregorianCalendar().getTime(), "yyyy-MM-dd hh:mm:ss"));

        return itemResultadoFinal;
    }
}
