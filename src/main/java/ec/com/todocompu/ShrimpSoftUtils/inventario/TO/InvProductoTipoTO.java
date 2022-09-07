/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvProductoTipoTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "tip_empresa")
    private String tipEmpresa;

    @Column(name = "tip_codigo")
    private String tipCodigo;

    @Column(name = "tip_detalle")
    private String tipDetalle;

    @Column(name = "tip_tipo")
    private String tipTipo;

    @Column(name = "tip_activo")
    private Boolean tipActivo;

    @Column(name = "usr_empresa")
    private String usrEmpresa;

    @Column(name = "usr_codigo")
    private String usrCodigo;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInserta;

    @Column(name = "cta_codigo")
    private String ctaCodigo;

    @Column(name = "cta_empresa")
    private String ctaEmpresa;

    @Column(name = "tip_replicar")
    private boolean tipReplicar;

    public InvProductoTipoTO() {
    }

    public InvProductoTipoTO(String tipEmpresa, String tipCodigo, String tipDetalle, String tipTipo, Boolean tipActivo,
            String usrEmpresa, String usrCodigo, String usrFechaInserta, String ctaCodigo, String ctaEmpresa) {
        this.tipEmpresa = tipEmpresa;
        this.tipCodigo = tipCodigo;
        this.tipDetalle = tipDetalle;
        this.tipTipo = tipTipo;
        this.tipActivo = tipActivo;
        this.usrEmpresa = usrEmpresa;
        this.usrCodigo = usrCodigo;
        this.usrFechaInserta = usrFechaInserta;
        this.ctaCodigo = ctaCodigo;
        this.ctaEmpresa = ctaEmpresa;
    }

    public Boolean getTipActivo() {
        return tipActivo;
    }

    public void setTipActivo(Boolean tipActivo) {
        this.tipActivo = tipActivo;
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

    public String getTipEmpresa() {
        return tipEmpresa;
    }

    public void setTipEmpresa(String tipEmpresa) {
        this.tipEmpresa = tipEmpresa;
    }

    public String getTipTipo() {
        return tipTipo;
    }

    public void setTipTipo(String tipTipo) {
        this.tipTipo = tipTipo;
    }

    public String getUsrCodigo() {
        return usrCodigo;
    }

    public void setUsrCodigo(String usrCodigo) {
        this.usrCodigo = usrCodigo;
    }

    public String getUsrEmpresa() {
        return usrEmpresa;
    }

    public void setUsrEmpresa(String usrEmpresa) {
        this.usrEmpresa = usrEmpresa;
    }

    public String getUsrFechaInserta() {
        return usrFechaInserta;
    }

    public void setUsrFechaInserta(String usrFechaInserta) {
        this.usrFechaInserta = usrFechaInserta;
    }

    public String getCtaCodigo() {
        return ctaCodigo;
    }

    public void setCtaCodigo(String ctaCodigo) {
        this.ctaCodigo = ctaCodigo;
    }

    public String getCtaEmpresa() {
        return ctaEmpresa;
    }

    public void setCtaEmpresa(String ctaEmpresa) {
        this.ctaEmpresa = ctaEmpresa;
    }

    public boolean isTipReplicar() {
        return tipReplicar;
    }

    public void setTipReplicar(boolean tipReplicar) {
        this.tipReplicar = tipReplicar;
    }

}
