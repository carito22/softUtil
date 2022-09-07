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
 * @author VALDIVIEZO
 */
@Embeddable
public class PrdPiscinaTipoPK implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "tipo_empresa")
    private String tipoEmpresa;
    @Column(name = "tipo_codigo")
    private String tipoCodigo;

    public PrdPiscinaTipoPK() {
    }

    public PrdPiscinaTipoPK(String tipoEmpresa, String tipoCodigo) {
        this.tipoEmpresa = tipoEmpresa;
        this.tipoCodigo = tipoCodigo;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public void setTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
    }

    public String getTipoCodigo() {
        return tipoCodigo;
    }

    public void setTipoCodigo(String tipoCodigo) {
        this.tipoCodigo = tipoCodigo;
    }

}
