/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class ConTipoTO implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "tip_codigo")
    private String tipCodigo;
    @Column(name = "tip_empresa")
    private String empCodigo;
    @Column(name = "tip_detalle")
    private String tipDetalle;
    @Column(name = "tip_modulo")
    private String tipModulo;
    @Column(name = "tip_tipo_principal")
    private String tipTipoPrincipal;
    @Column(name = "tip_inactivo")
    private Boolean tipInactivo;
    @Column(name = "usr_codigo")
    private String usrInsertaTipo;
    @Column(name = "usr_fecha_inserta")
    private String fechaInsertaTipo;

    public ConTipoTO() {
    }

    public ConTipoTO(String empCodigo, String tipCodigo, String tipDetalle, Boolean tipInactivo, String usrInsertaTipo,
            String fechaInsertaTipo, String tipModulo, String tipTipoPrincipal) {
        this.empCodigo = empCodigo;
        this.tipCodigo = tipCodigo;
        this.tipDetalle = tipDetalle;
        this.tipInactivo = tipInactivo;
        this.usrInsertaTipo = usrInsertaTipo;
        this.fechaInsertaTipo = fechaInsertaTipo;
        this.tipModulo = tipModulo;
        this.tipTipoPrincipal = tipTipoPrincipal;
    }

    public String getTipModulo() {
        return tipModulo;
    }

    public void setTipModulo(String tipModulo) {
        this.tipModulo = tipModulo;
    }

    public String getTipTipoPrincipal() {
        return tipTipoPrincipal;
    }

    public void setTipTipoPrincipal(String tipTipoPrincipal) {
        this.tipTipoPrincipal = tipTipoPrincipal;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getFechaInsertaTipo() {
        return fechaInsertaTipo;
    }

    public void setFechaInsertaTipo(String fechaInsertaTipo) {
        this.fechaInsertaTipo = fechaInsertaTipo;
    }

    public String getTipCodigo() {
        return tipCodigo;
    }

    public void setTipCodigo(String tipCodigo) {
        this.tipCodigo = tipCodigo;
    }

    public String getTipDetalle() {
        return tipDetalle;
    }

    public void setTipDetalle(String tipDetalle) {
        this.tipDetalle = tipDetalle;
    }

    public Boolean getTipInactivo() {
        return tipInactivo;
    }

    public void setTipInactivo(Boolean tipInactivo) {
        this.tipInactivo = tipInactivo;
    }

    public String getUsrInsertaTipo() {
        return usrInsertaTipo;
    }

    public void setUsrInsertaTipo(String usrInsertaTipo) {
        this.usrInsertaTipo = usrInsertaTipo;
    }

    @Override
    public String toString() {
        return this.tipCodigo + " - " + this.tipDetalle;
    }

}
