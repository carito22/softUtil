/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.util.List;

/**
 *
 * @author VALDIVIEZO
 */
public class InvVentaConDetalle {

    InvVentasTO invVentasTO;
    List<InvVentasDetalleTO> listaInvVentasDetalleTO;
    String claveAcceso;
    String tipoDocumentoComplemento;
    String numeroDocumentoComplemento;
    String motivoDocumentoComplemento;
    private byte[] comproXml;

    public InvVentaConDetalle() {
    }

    public InvVentasTO getInvVentasTO() {
        return invVentasTO;
    }

    public void setInvVentasTO(InvVentasTO invVentasTO) {
        this.invVentasTO = invVentasTO;
    }

    public List<InvVentasDetalleTO> getListaInvVentasDetalleTO() {
        return listaInvVentasDetalleTO;
    }

    public void setListaInvVentasDetalleTO(List<InvVentasDetalleTO> listaInvVentasDetalleTO) {
        this.listaInvVentasDetalleTO = listaInvVentasDetalleTO;
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public byte[] getComproXml() {
        return comproXml;
    }

    public void setComproXml(byte[] comproXml) {
        this.comproXml = comproXml;
    }

    public String getTipoDocumentoComplemento() {
        return tipoDocumentoComplemento;
    }

    public void setTipoDocumentoComplemento(String tipoDocumentoComplemento) {
        this.tipoDocumentoComplemento = tipoDocumentoComplemento;
    }

    public String getNumeroDocumentoComplemento() {
        return numeroDocumentoComplemento;
    }

    public void setNumeroDocumentoComplemento(String numeroDocumentoComplemento) {
        this.numeroDocumentoComplemento = numeroDocumentoComplemento;
    }

    public String getMotivoDocumentoComplemento() {
        return motivoDocumentoComplemento;
    }

    public void setMotivoDocumentoComplemento(String motivoDocumentoComplemento) {
        this.motivoDocumentoComplemento = motivoDocumentoComplemento;
    }

}
