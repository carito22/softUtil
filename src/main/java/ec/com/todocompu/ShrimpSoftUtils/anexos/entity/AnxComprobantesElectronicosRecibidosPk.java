/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.anexos.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 *
 * @author Usuario1
 */
@Embeddable
public class AnxComprobantesElectronicosRecibidosPk implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Column(name = "compro_empresa")
    private String comproEmpresa;
    @Column(name = "compro_periodo")
    private String comproPeriodo;
    @Column(name = "compro_clave_acceso")
    private String comproClaveAcceso;
    
    public AnxComprobantesElectronicosRecibidosPk() {}
    
    public AnxComprobantesElectronicosRecibidosPk(String comproEmpresa, String comproPeriodo, String comproClaveAcceso){
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
    
    @Override
    public int hashCode(){
        int hash = 0;
        hash += (comproEmpresa != null ? comproEmpresa.hashCode() : 0);
        hash += (comproPeriodo != null ? comproPeriodo.hashCode() : 0);
        hash += (comproClaveAcceso != null ? comproClaveAcceso.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object){
        if(!(object instanceof AnxComprobantesElectronicosRecibidosPk)){
            return false;
        }
        AnxComprobantesElectronicosRecibidosPk other = (AnxComprobantesElectronicosRecibidosPk) object;
        if((this.comproEmpresa == null && other.comproEmpresa != null) || 
                (this.comproEmpresa != null && !this.comproEmpresa.equals(other.comproEmpresa))){
            return false;
        }
        if((this.comproPeriodo == null && other.comproPeriodo != null)
                || (this.comproPeriodo != null && !this.comproPeriodo.equals(other.comproPeriodo))){
            return false;
        }
        if((this.comproClaveAcceso == null && other.comproClaveAcceso != null)
                || (this.comproClaveAcceso != null && !this.comproClaveAcceso.equals(other.comproClaveAcceso))){
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return "anexos.entity.AnxComprobantesElectronicosRecibidosPk[ comproEmpresa=" + comproEmpresa + ", comproPeriodo=" + comproPeriodo + ", comproClaveAcceso=" + comproClaveAcceso + "]";
    }
}
