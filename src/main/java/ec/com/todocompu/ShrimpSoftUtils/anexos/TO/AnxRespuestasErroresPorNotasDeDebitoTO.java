/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.TO;

/**
 *
 * @author Mario Ramos Duque
 */
public class AnxRespuestasErroresPorNotasDeDebitoTO implements java.io.Serializable {

    private String provCodigo;
    private String provIdentificacion;
    private String provNombre;
    private String documento;
    private String retencion;
    private String fechaEmision;
    private String sustentoTributario;
    private String documentoModificado;

    public AnxRespuestasErroresPorNotasDeDebitoTO() {
    }

    public String getProvCodigo() {
        return provCodigo;
    }

    public void setProvCodigo(String provCodigo) {
        this.provCodigo = provCodigo;
    }

    public String getProvIdentificacion() {
        return provIdentificacion;
    }

    public void setProvIdentificacion(String provIdentificacion) {
        this.provIdentificacion = provIdentificacion;
    }

    public String getProvNombre() {
        return provNombre;
    }

    public void setProvNombre(String provNombre) {
        this.provNombre = provNombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getRetencion() {
        return retencion;
    }

    public void setRetencion(String retencion) {
        this.retencion = retencion;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getSustentoTributario() {
        return sustentoTributario;
    }

    public void setSustentoTributario(String sustentoTributario) {
        this.sustentoTributario = sustentoTributario;
    }

    public String getDocumentoModificado() {
        return documentoModificado;
    }

    public void setDocumentoModificado(String documentoModificado) {
        this.documentoModificado = documentoModificado;
    }

}
