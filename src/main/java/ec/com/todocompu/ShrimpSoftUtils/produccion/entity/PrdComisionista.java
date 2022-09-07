/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.produccion.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "prd_comisionista", schema = "produccion")
public class PrdComisionista implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PrdComisionistaPK prdComisionistaPK;
    @Column(name = "co_nombre")
    private String coNombre;
    @Column(name = "co_direccion")
    private String coDireccion;
    @Column(name = "co_telefono")
    private BigDecimal coTelefono;
    @Column(name = "co_email")
    private String coEmail;
    @Column(name = "co_comision")
    private BigDecimal coComision;
    @Column(name = "usr_empresa")
    private String usrEmpresa;
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Column(name = "usr_fecha_inserta", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInserta;

    public PrdComisionista() {
    }

    public PrdComisionistaPK getPrdComisionistaPK() {
        return prdComisionistaPK;
    }

    public void setPrdComisionistaPK(PrdComisionistaPK prdComisionistaPK) {
        this.prdComisionistaPK = prdComisionistaPK;
    }

    public String getCoNombre() {
        return coNombre;
    }

    public void setCoNombre(String coNombre) {
        this.coNombre = coNombre;
    }

    public String getCoDireccion() {
        return coDireccion;
    }

    public void setCoDireccion(String coDireccion) {
        this.coDireccion = coDireccion;
    }

    public BigDecimal getCoTelefono() {
        return coTelefono;
    }

    public void setCoTelefono(BigDecimal coTelefono) {
        this.coTelefono = coTelefono;
    }

    public String getCoEmail() {
        return coEmail;
    }

    public void setCoEmail(String coEmail) {
        this.coEmail = coEmail;
    }

    public BigDecimal getCoComision() {
        return coComision;
    }

    public void setCoComision(BigDecimal coComision) {
        this.coComision = coComision;
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

}
