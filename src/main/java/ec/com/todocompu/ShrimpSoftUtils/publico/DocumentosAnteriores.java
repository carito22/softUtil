package ec.com.todocompu.ShrimpSoftUtils.publico;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "documentosanteriores", schema = "public")
public class DocumentosAnteriores implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "clave_acceso")
    private String claveAcceso;
    @Column(name = "empresa")
    private String empresa;
    @Column(name = "documento_tipo")
    private String documentoTipo;
    @Column(name = "documento_numero")
    private String documentoNumero;
    @Column(name = "fecha_emision")
    private String fechaEmision;
    @Column(name = "ruc_emisor")
    private String rucEmisor;
    @Column(name = "clave_interna")
    private String claveInterna;

    public DocumentosAnteriores() {
    }

    public String getClaveAcceso() {
        return claveAcceso;
    }

    public void setClaveAcceso(String claveAcceso) {
        this.claveAcceso = claveAcceso;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDocumentoTipo() {
        return documentoTipo;
    }

    public void setDocumentoTipo(String documentoTipo) {
        this.documentoTipo = documentoTipo;
    }

    public String getDocumentoNumero() {
        return documentoNumero;
    }

    public void setDocumentoNumero(String documentoNumero) {
        this.documentoNumero = documentoNumero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getRucEmisor() {
        return rucEmisor;
    }

    public void setRucEmisor(String rucEmisor) {
        this.rucEmisor = rucEmisor;
    }

    public String getClaveInterna() {
        return claveInterna;
    }

    public void setClaveInterna(String claveInterna) {
        this.claveInterna = claveInterna;
    }

}
