/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InvVentasComplementoTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "com_documento_tipo") 
    private String comDocumentoTipo;

    @Column(name = "com_documento_numero")
    private String comDocumentoNumero;

    @Column(name = "com_documento_motivo")
    private String comDocumentoMotivo;

    public InvVentasComplementoTO() {
    }

    public InvVentasComplementoTO(String comDocumentoTipo, String comDocumentoNumero, String comMotivo) {
        this.comDocumentoTipo = comDocumentoTipo;
        this.comDocumentoNumero = comDocumentoNumero;
    }

    public String getComDocumentoTipo() {
        return comDocumentoTipo;
    }

    public void setComDocumentoTipo(String comDocumentoTipo) {
        this.comDocumentoTipo = comDocumentoTipo;
    }

    public String getComDocumentoNumero() {
        return comDocumentoNumero;
    }

    public void setComDocumentoNumero(String comDocumentoNumero) {
        this.comDocumentoNumero = comDocumentoNumero;
    }

    public String getComDocumentoMotivo() {
        return comDocumentoMotivo;
    }

    public void setComDocumentoMotivo(String comDocumentoMotivo) {
        this.comDocumentoMotivo = comDocumentoMotivo;
    }
}
