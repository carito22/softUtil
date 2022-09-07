/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author VALDIVIEZO
 */
@Embeddable
public class AnxComprobantesElectronicosEmitidosPk implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "compro_empresa")
    private String comproEmpresa;
    @Column(name = "compro_periodo")
    private String comproPeriodo;
    @Column(name = "compro_clave_acceso")
    private String comproClaveAcceso;

    public AnxComprobantesElectronicosEmitidosPk() {
    }

    public AnxComprobantesElectronicosEmitidosPk(String comproEmpresa, String comproPeriodo, String comproClaveAcceso) {
        this.comproEmpresa = comproEmpresa;
        this.comproPeriodo = comproPeriodo;
        this.comproClaveAcceso = comproClaveAcceso;
    }

    public String getComproEmpresa() {
        return comproEmpresa;
    }

    public void setComproEmpresa(String comproEmpresa) {
        this.comproEmpresa = comproEmpresa;
    }

    public String getComproPeriodo() {
        return comproPeriodo;
    }

    public void setComproPeriodo(String comproPeriodo) {
        this.comproPeriodo = comproPeriodo;
    }

    public String getComproClaveAcceso() {
        return comproClaveAcceso;
    }

    public void setComproClaveAcceso(String comproClaveAcceso) {
        this.comproClaveAcceso = comproClaveAcceso;
    }

}
