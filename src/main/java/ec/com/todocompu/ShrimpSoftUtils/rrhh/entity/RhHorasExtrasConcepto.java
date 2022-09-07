/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.rrhh.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author MarioRamos
 */
@Entity
@Table(name = "rh_horas_extras_concepto", schema = "recursoshumanos")
public class RhHorasExtrasConcepto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "hec_secuencial")
    private Integer hecSecuencial;
    @Size(max = 2147483647)
    @Column(name = "hec_detalle")
    private String hecDetalle;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "hec_valor")
    private BigDecimal hecValor;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hec_valor_fijo")
    private boolean hecValorFijo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hec_inactivo")
    private boolean hecInactivo;
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

    public RhHorasExtrasConcepto() {
    }

    public RhHorasExtrasConcepto(Integer hecSecuencial) {
        this.hecSecuencial = hecSecuencial;
    }

    public RhHorasExtrasConcepto(Integer hecSecuencial, BigDecimal hecValor, boolean hecValorFijo, boolean hecInactivo, String usrEmpresa, String usrCodigo, Date usrFechaInserta) {
        this.hecSecuencial = hecSecuencial;
        this.hecValor = hecValor;
        this.hecValorFijo = hecValorFijo;
        this.hecInactivo = hecInactivo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
    }

    public Integer getHecSecuencial() {
        return hecSecuencial;
    }

    public void setHecSecuencial(Integer hecSecuencial) {
        this.hecSecuencial = hecSecuencial;
    }

    public String getHecDetalle() {
        return hecDetalle;
    }

    public void setHecDetalle(String hecDetalle) {
        this.hecDetalle = hecDetalle;
    }

    public BigDecimal getHecValor() {
        return hecValor;
    }

    public void setHecValor(BigDecimal hecValor) {
        this.hecValor = hecValor;
    }

    public boolean getHecValorFijo() {
        return hecValorFijo;
    }

    public void setHecValorFijo(boolean hecValorFijo) {
        this.hecValorFijo = hecValorFijo;
    }

    public boolean getHecInactivo() {
        return hecInactivo;
    }

    public void setHecInactivo(boolean hecInactivo) {
        this.hecInactivo = hecInactivo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hecSecuencial != null ? hecSecuencial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RhHorasExtrasConcepto)) {
            return false;
        }
        RhHorasExtrasConcepto other = (RhHorasExtrasConcepto) object;
        if ((this.hecSecuencial == null && other.hecSecuencial != null) || (this.hecSecuencial != null && !this.hecSecuencial.equals(other.hecSecuencial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.rrhh.entity.RhHorasExtrasConcepto[ hecSecuencial=" + hecSecuencial + " ]";
    }
    
}
