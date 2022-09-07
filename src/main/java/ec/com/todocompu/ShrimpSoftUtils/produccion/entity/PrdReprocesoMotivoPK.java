/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Trabajo
 */
@Embeddable
public class PrdReprocesoMotivoPK implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "prd_empresa")
    private String prdEmpresa;
    @Column(name = "prd_codigo")
    private String prdCodigo;

    public PrdReprocesoMotivoPK() {
    }

    public String getPrdEmpresa() {
        return prdEmpresa;
    }

    public void setPrdEmpresa(String prdEmpresa) {
        this.prdEmpresa = prdEmpresa;
    }

    public String getPrdCodigo() {
        return prdCodigo;
    }

    public void setPrdCodigo(String prdCodigo) {
        this.prdCodigo = prdCodigo;
    }

}
