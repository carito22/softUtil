/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author MarioRamos
 */
@Entity
@Table(name = "sis_empresa_notificaciones_eventos", schema = "sistemaweb")
public class SisEmpresaNotificacionesEventos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "aws_configuration_set")
    private String awsConfigurationSet;

    public SisEmpresaNotificacionesEventos() {
    }

    public SisEmpresaNotificacionesEventos(String awsConfigurationSet) {
        this.awsConfigurationSet = awsConfigurationSet;
    }

    public String getAwsConfigurationSet() {
        return awsConfigurationSet;
    }

    public void setAwsConfigurationSet(String awsConfigurationSet) {
        this.awsConfigurationSet = awsConfigurationSet;
    }

}
