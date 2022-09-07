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
@Table(name = "sis_empresa_notificaciones", schema = "sistemaweb")
public class SisEmpresaNotificaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "id_principal")
    private String idPrincipal;
    @Size(max = 2147483647)
    @Column(name = "id_secundaria")
    private String idSecundaria;
    @Size(max = 2147483647)
    @Column(name = "id_descripcion")
    private String idDescripcion;
    @Size(max = 2147483647)
    @Column(name = "id_notificaciones_eventos")
    private String idNotificacionesEventos;
    @Column(name = "id_verificado")
    private Boolean idVerificado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "usr_codigo")
    private String usrCodigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "usr_fecha_inserta_empresa")
    @Temporal(TemporalType.TIMESTAMP)
    private Date usrFechaInsertaEmpresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "emp_codigo")
//    @JoinColumn(name = "emp_codigo", referencedColumnName = "emp_codigo")
//    @ManyToOne(optional = false)
    private String empCodigo;

    public SisEmpresaNotificaciones() {
    }

    public SisEmpresaNotificaciones(Integer id) {
        this.id = id;
    }

    public SisEmpresaNotificaciones(Integer id, String usrCodigo, Date usrFechaInsertaEmpresa) {
        this.id = id;
        this.usrCodigo = usrCodigo;
        this.usrFechaInsertaEmpresa = usrFechaInsertaEmpresa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdPrincipal() {
        return idPrincipal;
    }

    public void setIdPrincipal(String idPrincipal) {
        this.idPrincipal = idPrincipal;
    }

    public String getIdSecundaria() {
        return idSecundaria;
    }

    public void setIdSecundaria(String idSecundaria) {
        this.idSecundaria = idSecundaria;
    }

    public String getIdDescripcion() {
        return idDescripcion;
    }

    public void setIdDescripcion(String idDescripcion) {
        this.idDescripcion = idDescripcion;
    }

    public String getIdNotificacionesEventos() {
        return idNotificacionesEventos;
    }

    public void setIdNotificacionesEventos(String idNotificacionesEventos) {
        this.idNotificacionesEventos = idNotificacionesEventos;
    }

    public Boolean getIdVerificado() {
        return idVerificado;
    }

    public void setIdVerificado(Boolean idVerificado) {
        this.idVerificado = idVerificado;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public Date getUsrFechaInsertaEmpresa() {
        return usrFechaInsertaEmpresa;
    }

    public void setUsrFechaInsertaEmpresa(Date usrFechaInsertaEmpresa) {
        this.usrFechaInsertaEmpresa = usrFechaInsertaEmpresa;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SisEmpresaNotificaciones)) {
            return false;
        }
        SisEmpresaNotificaciones other = (SisEmpresaNotificaciones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.com.todocompu.ShrimpSoftUtils.sistema.entity.SisEmpresaNotificaciones[ id=" + id + " ]";
    }

}
