/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author mario
 */
@Entity
@Table(name = "con_verificacion_errores", schema = "contabilidad")
@NamedQueries({
    @NamedQuery(name = "ConVerificacionErrores.findAll", query = "SELECT c FROM ConVerificacionErrores c")})
public class ConVerificacionErrores implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ve_secuencial")
    private Integer veSecuencial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ve_empresa")
    private String veEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "ve_url_evidencias")
    private String veUrlEvidencias;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usr_fecha_inserta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;

    public ConVerificacionErrores() {
    }

    public ConVerificacionErrores(Integer veSecuencial) {
        this.veSecuencial = veSecuencial;
    }

    public ConVerificacionErrores(Integer veSecuencial, String veEmpresa, String veUrlEvidencias, String usrCodigo, Date usrFechaInserta) {
        this.veSecuencial = veSecuencial;
        this.veEmpresa = veEmpresa;
        this.veUrlEvidencias = veUrlEvidencias;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public Integer getVeSecuencial() {
        return veSecuencial;
    }

    public void setVeSecuencial(Integer veSecuencial) {
        this.veSecuencial = veSecuencial;
    }

    public String getVeEmpresa() {
        return veEmpresa;
    }

    public void setVeEmpresa(String veEmpresa) {
        this.veEmpresa = veEmpresa;
    }

    public String getVeUrlEvidencias() {
        return veUrlEvidencias;
    }

    public void setVeUrlEvidencias(String veUrlEvidencias) {
        this.veUrlEvidencias = veUrlEvidencias;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public Date getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(Date usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (veSecuencial != null ? veSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConVerificacionErrores)) {
            return false;
        }
        ConVerificacionErrores other = (ConVerificacionErrores) object;
        if ((this.veSecuencial == null && other.veSecuencial != null) || (this.veSecuencial != null && !this.veSecuencial.equals(other.veSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.contabilidad.entity.ConVerificacionErrores[ veSecuencial=" + veSecuencial + " ]";
    }
    
}
