/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author CarolValdiviezo
 */
@Embeddable
public class SisConfiguracionConsumosPK implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "conf_empresa")
    private String confEmpresa;
    @Column(name = "conf_usuario_responsable")
    private String confUsuarioResponsable;

    public SisConfiguracionConsumosPK() {
    }

    public String getConfEmpresa() {
        return confEmpresa;
    }

    public void setConfEmpresa(String confEmpresa) {
        this.confEmpresa = confEmpresa;
    }

    public String getConfUsuarioResponsable() {
        return confUsuarioResponsable;
    }

    public void setConfUsuarioResponsable(String confUsuarioResponsable) {
        this.confUsuarioResponsable = confUsuarioResponsable;
    }

}
