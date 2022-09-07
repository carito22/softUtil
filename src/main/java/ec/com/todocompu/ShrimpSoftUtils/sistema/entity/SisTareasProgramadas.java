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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author mario
 */
@Entity
@Table(name = "sis_tareas_programadas", schema = "sistemaweb")
@NamedQueries({
    @NamedQuery(name = "SisTareasProgramadas.findAll", query = "SELECT s FROM SisTareasProgramadas s")})
public class SisTareasProgramadas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tar_secuencial")
    private Integer tarSecuencial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "tar_tipo")
    private String tarTipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "tar_empresa")
    private String tarEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "tar_hora")
    private String tarHora;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "tar_minuto")
    private String tarMinuto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "tar_segundo")
    private String tarSegundo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "tar_nombre")
    private String tarNombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "tar_grupo")
    private String tarGrupo;

    public SisTareasProgramadas() {
    }

    public SisTareasProgramadas(Integer tarSecuencial) {
        this.tarSecuencial = tarSecuencial;
    }

    public SisTareasProgramadas(Integer tarSecuencial, String tarTipo, String tarEmpresa, String tarHora, String tarMinuto, String tarSegundo, String tarNombre, String tarGrupo) {
        this.tarSecuencial = tarSecuencial;
        this.tarTipo = tarTipo;
        this.tarEmpresa = tarEmpresa;
        this.tarHora = tarHora;
        this.tarMinuto = tarMinuto;
        this.tarSegundo = tarSegundo;
        this.tarNombre = tarNombre;
        this.tarGrupo = tarGrupo;
    }

    public Integer getTarSecuencial() {
        return tarSecuencial;
    }

    public void setTarSecuencial(Integer tarSecuencial) {
        this.tarSecuencial = tarSecuencial;
    }

    public String getTarTipo() {
        return tarTipo;
    }

    public void setTarTipo(String tarTipo) {
        this.tarTipo = tarTipo;
    }

    public String getTarEmpresa() {
        return tarEmpresa;
    }

    public void setTarEmpresa(String tarEmpresa) {
        this.tarEmpresa = tarEmpresa;
    }

    public String getTarHora() {
        return tarHora;
    }

    public void setTarHora(String tarHora) {
        this.tarHora = tarHora;
    }

    public String getTarMinuto() {
        return tarMinuto;
    }

    public void setTarMinuto(String tarMinuto) {
        this.tarMinuto = tarMinuto;
    }

    public String getTarSegundo() {
        return tarSegundo;
    }

    public void setTarSegundo(String tarSegundo) {
        this.tarSegundo = tarSegundo;
    }

    public String getTarNombre() {
        return tarNombre;
    }

    public void setTarNombre(String tarNombre) {
        this.tarNombre = tarNombre;
    }

    public String getTarGrupo() {
        return tarGrupo;
    }

    public void setTarGrupo(String tarGrupo) {
        this.tarGrupo = tarGrupo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tarSecuencial != null ? tarSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SisTareasProgramadas)) {
            return false;
        }
        SisTareasProgramadas other = (SisTareasProgramadas) object;
        if ((this.tarSecuencial == null && other.tarSecuencial != null) || (this.tarSecuencial != null && !this.tarSecuencial.equals(other.tarSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.sistema.entity.SisTareasProgramadas[ tarSecuencial=" + tarSecuencial + " ]";
    }
    
}
