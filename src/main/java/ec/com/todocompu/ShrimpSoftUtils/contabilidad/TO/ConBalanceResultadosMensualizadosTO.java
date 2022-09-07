/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.contabilidad.TO;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Carlos Ajila
 */
@Entity
public class ConBalanceResultadosMensualizadosTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "br_id")
    private Integer id;
    @Column(name = "br_cuenta")
    private String brCuenta;
    @Column(name = "br_detalle")
    private String brDetalle;
    @Column(name = "br_saldo")
    private java.math.BigDecimal brSaldo;
    @Column(name = "br_enero")
    private java.math.BigDecimal brEnero;
    @Column(name = "br_febrero")
    private java.math.BigDecimal brFebrero;
    @Column(name = "br_marzo")
    private java.math.BigDecimal brMarzo;
    @Column(name = "br_abril")
    private java.math.BigDecimal brAbril;
    @Column(name = "br_mayo")
    private java.math.BigDecimal brMayo;
    @Column(name = "br_junio")
    private java.math.BigDecimal brJunio;
    @Column(name = "br_julio")
    private java.math.BigDecimal brJulio;
    @Column(name = "br_agosto")
    private java.math.BigDecimal brAgosto;
    @Column(name = "br_septiembre")
    private java.math.BigDecimal brSeptiembre;
    @Column(name = "br_octubre")
    private java.math.BigDecimal brOctubre;
    @Column(name = "br_noviembre")
    private java.math.BigDecimal brNoviembre;
    @Column(name = "br_diciembre")
    private java.math.BigDecimal brDiciembre;

    public ConBalanceResultadosMensualizadosTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrCuenta() {
        return brCuenta;
    }

    public void setBrCuenta(String brCuenta) {
        this.brCuenta = brCuenta;
    }

    public String getBrDetalle() {
        return brDetalle;
    }

    public void setBrDetalle(String brDetalle) {
        this.brDetalle = brDetalle;
    }

    public BigDecimal getBrSaldo() {
        return brSaldo;
    }

    public void setBrSaldo(BigDecimal brSaldo) {
        this.brSaldo = brSaldo;
    }

    public BigDecimal getBrEnero() {
        return brEnero;
    }

    public void setBrEnero(BigDecimal brEnero) {
        this.brEnero = brEnero;
    }

    public BigDecimal getBrFebrero() {
        return brFebrero;
    }

    public void setBrFebrero(BigDecimal brFebrero) {
        this.brFebrero = brFebrero;
    }

    public BigDecimal getBrMarzo() {
        return brMarzo;
    }

    public void setBrMarzo(BigDecimal brMarzo) {
        this.brMarzo = brMarzo;
    }

    public BigDecimal getBrAbril() {
        return brAbril;
    }

    public void setBrAbril(BigDecimal brAbril) {
        this.brAbril = brAbril;
    }

    public BigDecimal getBrMayo() {
        return brMayo;
    }

    public void setBrMayo(BigDecimal brMayo) {
        this.brMayo = brMayo;
    }

    public BigDecimal getBrJunio() {
        return brJunio;
    }

    public void setBrJunio(BigDecimal brJunio) {
        this.brJunio = brJunio;
    }

    public BigDecimal getBrJulio() {
        return brJulio;
    }

    public void setBrJulio(BigDecimal brJulio) {
        this.brJulio = brJulio;
    }

    public BigDecimal getBrAgosto() {
        return brAgosto;
    }

    public void setBrAgosto(BigDecimal brAgosto) {
        this.brAgosto = brAgosto;
    }

    public BigDecimal getBrSeptiembre() {
        return brSeptiembre;
    }

    public void setBrSeptiembre(BigDecimal brSeptiembre) {
        this.brSeptiembre = brSeptiembre;
    }

    public BigDecimal getBrOctubre() {
        return brOctubre;
    }

    public void setBrOctubre(BigDecimal brOctubre) {
        this.brOctubre = brOctubre;
    }

    public BigDecimal getBrNoviembre() {
        return brNoviembre;
    }

    public void setBrNoviembre(BigDecimal brNoviembre) {
        this.brNoviembre = brNoviembre;
    }

    public BigDecimal getBrDiciembre() {
        return brDiciembre;
    }

    public void setBrDiciembre(BigDecimal brDiciembre) {
        this.brDiciembre = brDiciembre;
    }

}
