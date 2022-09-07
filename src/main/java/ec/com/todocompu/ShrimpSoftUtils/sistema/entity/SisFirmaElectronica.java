/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.sistema.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.annotations.Type;

/**
 *
 * @author MarioRamos
 */
@Entity
@Table(name = "sis_firma_electronica", schema = "sistemaweb")
public class SisFirmaElectronica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "firma_secuencial")
    private Integer firmaSecuencial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "firma_empresa")
    private String firmaEmpresa;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Type(type = "org.hibernate.type.BinaryType")
    @Column(name = "firma_electronica_archivo")
    private byte[] firmaElectronicaArchivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "firma_electronica_nombre")
    private String firmaElectronicaNombre;
    @Basic(optional = true)
    @Column(name = "firma_fecha_aviso")
    @Temporal(TemporalType.DATE)
    private Date firmaFechaAviso;
    @Basic(optional = true)
    @Column(name = "firma_fecha_caducidad")
    @Temporal(TemporalType.DATE)
    private Date firmaFechaCaducidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usr_empresa")
    private String usrEmpresa;
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

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "firma_clave")
    private String firmaClave;

    @Column(name = "firma_emails_alertas")
    private String firmaEmail;

    @Column(name = "firma_verificada")
    private boolean firmaVerificada;

    public SisFirmaElectronica() {
    }

    public SisFirmaElectronica(Integer firmaSecuencial) {
        this.firmaSecuencial = firmaSecuencial;
    }

    public SisFirmaElectronica(Integer firmaSecuencial, String firmaEmpresa, byte[] firmaElectronicaArchivo, String firmaElectronicaNombre, Date firmaFechaAviso, Date firmaFechaCaducidad, String usrEmpresa, String usrCodigo, Date usrFechaInserta, String firmaClave, String firmaEmail, boolean firmaVerificada) {
        this.firmaSecuencial = firmaSecuencial;
        this.firmaEmpresa = firmaEmpresa;
        this.firmaElectronicaArchivo = firmaElectronicaArchivo;
        this.firmaElectronicaNombre = firmaElectronicaNombre;
        this.firmaFechaAviso = firmaFechaAviso;
        this.firmaFechaCaducidad = firmaFechaCaducidad;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.firmaClave = firmaClave;
        this.firmaEmail = firmaEmail;
        this.firmaVerificada = firmaVerificada;
    }

    public boolean isFirmaVerificada() {
        return firmaVerificada;
    }

    public void setFirmaVerificada(boolean firmaVerificada) {
        this.firmaVerificada = firmaVerificada;
    }

    public String getFirmaEmail() {
        return firmaEmail;
    }

    public void setFirmaEmail(String firmaEmail) {
        this.firmaEmail = firmaEmail;
    }

    public Integer getFirmaSecuencial() {
        return firmaSecuencial;
    }

    public void setFirmaSecuencial(Integer firmaSecuencial) {
        this.firmaSecuencial = firmaSecuencial;
    }

    public String getFirmaEmpresa() {
        return firmaEmpresa;
    }

    public void setFirmaEmpresa(String firmaEmpresa) {
        this.firmaEmpresa = firmaEmpresa;
    }

    public byte[] getFirmaElectronicaArchivo() {
        return firmaElectronicaArchivo;
    }

    public void setFirmaElectronicaArchivo(byte[] firmaElectronicaArchivo) {
        this.firmaElectronicaArchivo = firmaElectronicaArchivo;
    }

    public String getFirmaElectronicaNombre() {
        return firmaElectronicaNombre;
    }

    public void setFirmaElectronicaNombre(String firmaElectronicaNombre) {
        this.firmaElectronicaNombre = firmaElectronicaNombre;
    }

    public Date getFirmaFechaAviso() {
        return firmaFechaAviso;
    }

    public void setFirmaFechaAviso(Date firmaFechaAviso) {
        this.firmaFechaAviso = firmaFechaAviso;
    }

    public Date getFirmaFechaCaducidad() {
        return firmaFechaCaducidad;
    }

    public void setFirmaFechaCaducidad(Date firmaFechaCaducidad) {
        this.firmaFechaCaducidad = firmaFechaCaducidad;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
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

    public String getFirmaClave() {
        return firmaClave;
    }

    public void setFirmaClave(String firmaClave) {
        this.firmaClave = firmaClave;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (firmaSecuencial != null ? firmaSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SisFirmaElectronica)) {
            return false;
        }
        SisFirmaElectronica other = (SisFirmaElectronica) object;
        if ((this.firmaSecuencial == null && other.firmaSecuencial != null) || (this.firmaSecuencial != null && !this.firmaSecuencial.equals(other.firmaSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.sistema.entity.SisFirmaElectronica[ firmaSecuencial=" + firmaSecuencial + " ]";
    }

}
