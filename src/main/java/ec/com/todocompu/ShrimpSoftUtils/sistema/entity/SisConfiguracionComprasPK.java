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
 * @author Mario Ramos Duque
 */
@Embeddable
public class SisConfiguracionComprasPK implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "conf_empresa")
    private String confEmpresa;
    @Column(name = "conf_usuario_responsable")
    private String confUsuarioResponsable;

    public SisConfiguracionComprasPK(String confEmpresa, String confUsuarioResponsable) {
        this.confEmpresa = confEmpresa;
        this.confUsuarioResponsable = confUsuarioResponsable;
    }

    public SisConfiguracionComprasPK() {
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
