package ec.com.todocompu.ShrimpSoftUtils.cartera.TO;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CarCuentasPorPagarCobrarAnticiposTO implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "cxpg_codigo")
    private String cxpgCodigo;
    @Column(name = "cxpg_nombre")
    private String cxpgNombre;
    @Column(name = "cxpp_saldo_compras")
    private BigDecimal cxpgSaldo;
    @Column(name = "cxpp_saldo_anticipos")
    private BigDecimal cxpgAnticipos;
    @Column(name = "cxpp_total")
    private BigDecimal cxpgTotal;

    @Column(name = "cxpp_saldo_sin_vencer")
    private BigDecimal cxppSaldoSinVencer;
    @Column(name = "cxpp_saldo_vencido_30")
    private BigDecimal cxppSaldoVencido30;
    @Column(name = "cxpp_saldo_vencido_60")
    private BigDecimal cxppSaldoVencido60;
    @Column(name = "cxpp_saldo_vencido_90")
    private BigDecimal cxppSaldoVencido90;
    @Column(name = "cxpp_saldo_vencido_120")
    private BigDecimal cxppSaldoVencido120;
    @Column(name = "cxpp_saldo_vencido_mayor_120")
    private BigDecimal cxppSaldoVencidoMayor120;

    public CarCuentasPorPagarCobrarAnticiposTO() {
    }

    public CarCuentasPorPagarCobrarAnticiposTO(String cxpgCodigo, String cxpgNombre, BigDecimal cxpgSaldo,
            BigDecimal cxpgAnticipos, BigDecimal cxpgTotal, Integer id) {
        this.cxpgCodigo = cxpgCodigo;
        this.cxpgNombre = cxpgNombre;
        this.cxpgSaldo = cxpgSaldo;
        this.cxpgAnticipos = cxpgAnticipos;
        this.cxpgTotal = cxpgTotal;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getCxpgAnticipos() {
        return cxpgAnticipos;
    }

    public void setCxpgAnticipos(BigDecimal cxpgAnticipos) {
        this.cxpgAnticipos = cxpgAnticipos;
    }

    public String getCxpgCodigo() {
        return cxpgCodigo;
    }

    public void setCxpgCodigo(String cxpgCodigo) {
        this.cxpgCodigo = cxpgCodigo;
    }

    public String getCxpgNombre() {
        return cxpgNombre;
    }

    public void setCxpgNombre(String cxpgNombre) {
        this.cxpgNombre = cxpgNombre;
    }

    public BigDecimal getCxpgSaldo() {
        return cxpgSaldo;
    }

    public void setCxpgSaldo(BigDecimal cxpgSaldo) {
        this.cxpgSaldo = cxpgSaldo;
    }

    public BigDecimal getCxpgTotal() {
        return cxpgTotal;
    }

    public void setCxpgTotal(BigDecimal cxpgTotal) {
        this.cxpgTotal = cxpgTotal;
    }

    public BigDecimal getCxppSaldoSinVencer() {
        return cxppSaldoSinVencer;
    }

    public void setCxppSaldoSinVencer(BigDecimal cxppSaldoSinVencer) {
        this.cxppSaldoSinVencer = cxppSaldoSinVencer;
    }

    public BigDecimal getCxppSaldoVencido30() {
        return cxppSaldoVencido30;
    }

    public void setCxppSaldoVencido30(BigDecimal cxppSaldoVencido30) {
        this.cxppSaldoVencido30 = cxppSaldoVencido30;
    }

    public BigDecimal getCxppSaldoVencido60() {
        return cxppSaldoVencido60;
    }

    public void setCxppSaldoVencido60(BigDecimal cxppSaldoVencido60) {
        this.cxppSaldoVencido60 = cxppSaldoVencido60;
    }

    public BigDecimal getCxppSaldoVencido90() {
        return cxppSaldoVencido90;
    }

    public void setCxppSaldoVencido90(BigDecimal cxppSaldoVencido90) {
        this.cxppSaldoVencido90 = cxppSaldoVencido90;
    }

    public BigDecimal getCxppSaldoVencido120() {
        return cxppSaldoVencido120;
    }

    public void setCxppSaldoVencido120(BigDecimal cxppSaldoVencido120) {
        this.cxppSaldoVencido120 = cxppSaldoVencido120;
    }

    public BigDecimal getCxppSaldoVencidoMayor120() {
        return cxppSaldoVencidoMayor120;
    }

    public void setCxppSaldoVencidoMayor120(BigDecimal cxppSaldoVencidoMayor120) {
        this.cxppSaldoVencidoMayor120 = cxppSaldoVencidoMayor120;
    }

}
