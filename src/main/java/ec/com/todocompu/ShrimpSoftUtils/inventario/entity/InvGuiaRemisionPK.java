/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author CarolValdiviezo
 */
@Embeddable
public class InvGuiaRemisionPK implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "guia_empresa")
    private String guiaEmpresa;
    @Column(name = "guia_periodo")
    private String guiaPeriodo;
    @Column(name = "guia_numero")
    private String guiaNumero;

    public InvGuiaRemisionPK() {
    }

    public InvGuiaRemisionPK(String guiaEmpresa, String guiaPeriodo, String guiaNumero) {
        this.guiaEmpresa = guiaEmpresa;
        this.guiaPeriodo = guiaPeriodo;
        this.guiaNumero = guiaNumero;
    }

    public String getGuiaEmpresa() {
        return guiaEmpresa;
    }

    public void setGuiaEmpresa(String guiaEmpresa) {
        this.guiaEmpresa = guiaEmpresa;
    }

    public String getGuiaPeriodo() {
        return guiaPeriodo;
    }

    public void setGuiaPeriodo(String guiaPeriodo) {
        this.guiaPeriodo = guiaPeriodo;
    }

    public String getGuiaNumero() {
        return guiaNumero;
    }

    public void setGuiaNumero(String guiaNumero) {
        this.guiaNumero = guiaNumero;
    }

}
