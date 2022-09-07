/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.banco.TO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class BanCajaTO implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Column(name = "caja_empresa")
    private String empCodigo;
    @Id
    @Column(name = "caja_codigo")
    private String cajaCodigo;

    @Column(name = "caja_nombre")
    private String cajaNombre;

    @Column(name = "cta_cuenta_contable")
    private String cajaCuenta;

    @Column(name = "usr_inserta_caja")
    private String usrInsertaCaja;

    @Column(name = "usr_fecha_inserta")
    private String usrFechaInsertaCaja;

    public BanCajaTO() {
    }

    public BanCajaTO(String empCodigo, String cajaCodigo, String cajaNombre, String cajaCuenta, String usrInsertaCaja,
            String usrFechaInsertaCaja) {
        this.empCodigo = empCodigo;
        this.cajaCodigo = cajaCodigo;
        this.cajaNombre = cajaNombre;
        this.cajaCuenta = cajaCuenta;
        this.usrInsertaCaja = usrInsertaCaja;
        this.usrFechaInsertaCaja = usrFechaInsertaCaja;
    }

    public String getCajaCodigo() {
        return cajaCodigo;
    }

    public void setCajaCodigo(String cajaCodigo) {
        this.cajaCodigo = cajaCodigo;
    }

    public String getCajaCuenta() {
        return cajaCuenta;
    }

    public void setCajaCuenta(String cajaCuenta) {
        this.cajaCuenta = cajaCuenta;
    }

    public String getCajaNombre() {
        return cajaNombre;
    }

    public void setCajaNombre(String cajaNombre) {
        this.cajaNombre = cajaNombre;
    }

    public String getEmpCodigo() {
        return empCodigo;
    }

    public void setEmpCodigo(String empCodigo) {
        this.empCodigo = empCodigo;
    }

    public String getUsrFechaInsertaCaja() {
        return usrFechaInsertaCaja;
    }

    public void setUsrFechaInsertaCaja(String usrFechaInsertaCaja) {
        this.usrFechaInsertaCaja = usrFechaInsertaCaja;
    }

    public String getUsrInsertaCaja() {
        return usrInsertaCaja;
    }

    public void setUsrInsertaCaja(String usrInsertaCaja) {
        this.usrInsertaCaja = usrInsertaCaja;
    }
}
