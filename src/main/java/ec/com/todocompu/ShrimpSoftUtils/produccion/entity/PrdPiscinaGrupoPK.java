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
public class PrdPiscinaGrupoPK implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "grupo_empresa")
    private String grupoEmpresa;
    @Column(name = "grupo_codigo")
    private String grupoCodigo;

    public PrdPiscinaGrupoPK() {
    }

    public PrdPiscinaGrupoPK(String grupoEmpresa, String grupoCodigo) {
        this.grupoEmpresa = grupoEmpresa;
        this.grupoCodigo = grupoCodigo;
    }

    public String getGrupoEmpresa() {
        return grupoEmpresa;
    }

    public void setGrupoEmpresa(String grupoEmpresa) {
        this.grupoEmpresa = grupoEmpresa;
    }

    public String getGrupoCodigo() {
        return grupoCodigo;
    }

    public void setGrupoCodigo(String grupoCodigo) {
        this.grupoCodigo = grupoCodigo;
    }

}
