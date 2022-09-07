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
public class InvTransportistaPK implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "trans_empresa")
    private String transEmpresa;
    @Column(name = "trans_codigo")
    private String transCodigo;

    public InvTransportistaPK() {
    }

    public InvTransportistaPK(String transEmpresa, String transCodigo) {
        this.transEmpresa = transEmpresa;
        this.transCodigo = transCodigo;
    }

    public String getTransEmpresa() {
        return transEmpresa;
    }

    public void setTransEmpresa(String transEmpresa) {
        this.transEmpresa = transEmpresa;
    }

    public String getTransCodigo() {
        return transCodigo;
    }

    public void setTransCodigo(String transCodigo) {
        this.transCodigo = transCodigo;
    }

}
