/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.com.todocompu.ShrimpSoftUtils.inventario.TO;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Andres Guachisaca
 */
@Entity
public class InvFunComprasVsVentasTonelajeTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "cvsv_tipo_transaccion")
    private String cvsvTipoTransaccion;
    @Column(name = "cvsv_grupo_empresarial")
    private String cvsvGrupoEmpresarial;
    @Column(name = "cvsv_razon_social")
    private String cvsvRazonSocial;
    @Column(name = "cvsv_producto")
    private String cvsvProducto;
    @Column(name = "cvsv_enero")
    private BigDecimal cvsvEnero;
    @Column(name = "cvsv_febrero")
    private BigDecimal cvsvFebrero;
    @Column(name = "cvsv_marzo")
    private BigDecimal cvsvMarzo;
    @Column(name = "cvsv_abril")
    private BigDecimal cvsvAbril;
    @Column(name = "cvsv_mayo")
    private BigDecimal cvsvMayo;
    @Column(name = "cvsv_junio")
    private BigDecimal cvsvJunio;
    @Column(name = "cvsv_julio")
    private BigDecimal cvsvJulio;
    @Column(name = "cvsv_agosto")
    private BigDecimal cvsvAgosto;
    @Column(name = "cvsv_septiembre")
    private BigDecimal cvsvSeptiembre;
    @Column(name = "cvsv_octubre")
    private BigDecimal cvsvOctubre;
    @Column(name = "cvsv_noviembre")
    private BigDecimal cvsvNoviembre;
    @Column(name = "cvsv_diciembre")
    private BigDecimal cvsvDiciembre;
    @Column(name = "cvsv_tonelaje_total")
    private BigDecimal cvsvTonelajeTotal;

    public InvFunComprasVsVentasTonelajeTO() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCvsvTipoTransaccion() {
        return cvsvTipoTransaccion;
    }

    public void setCvsvTipoTransaccion(String cvsvTipoTransaccion) {
        this.cvsvTipoTransaccion = cvsvTipoTransaccion;
    }

    public String getCvsvGrupoEmpresarial() {
        return cvsvGrupoEmpresarial;
    }

    public void setCvsvGrupoEmpresarial(String cvsvGrupoEmpresarial) {
        this.cvsvGrupoEmpresarial = cvsvGrupoEmpresarial;
    }

    public String getCvsvRazonSocial() {
        return cvsvRazonSocial;
    }

    public void setCvsvRazonSocial(String cvsvRazonSocial) {
        this.cvsvRazonSocial = cvsvRazonSocial;
    }

    public String getCvsvProducto() {
        return cvsvProducto;
    }

    public void setCvsvProducto(String cvsvProducto) {
        this.cvsvProducto = cvsvProducto;
    }

    public BigDecimal getCvsvEnero() {
        return cvsvEnero;
    }

    public void setCvsvEnero(BigDecimal cvsvEnero) {
        this.cvsvEnero = cvsvEnero;
    }

    public BigDecimal getCvsvFebrero() {
        return cvsvFebrero;
    }

    public void setCvsvFebrero(BigDecimal cvsvFebrero) {
        this.cvsvFebrero = cvsvFebrero;
    }

    public BigDecimal getCvsvMarzo() {
        return cvsvMarzo;
    }

    public void setCvsvMarzo(BigDecimal cvsvMarzo) {
        this.cvsvMarzo = cvsvMarzo;
    }

    public BigDecimal getCvsvAbril() {
        return cvsvAbril;
    }

    public void setCvsvAbril(BigDecimal cvsvAbril) {
        this.cvsvAbril = cvsvAbril;
    }

    public BigDecimal getCvsvMayo() {
        return cvsvMayo;
    }

    public void setCvsvMayo(BigDecimal cvsvMayo) {
        this.cvsvMayo = cvsvMayo;
    }

    public BigDecimal getCvsvJunio() {
        return cvsvJunio;
    }

    public void setCvsvJunio(BigDecimal cvsvJunio) {
        this.cvsvJunio = cvsvJunio;
    }

    public BigDecimal getCvsvJulio() {
        return cvsvJulio;
    }

    public void setCvsvJulio(BigDecimal cvsvJulio) {
        this.cvsvJulio = cvsvJulio;
    }

    public BigDecimal getCvsvAgosto() {
        return cvsvAgosto;
    }

    public void setCvsvAgosto(BigDecimal cvsvAgosto) {
        this.cvsvAgosto = cvsvAgosto;
    }

    public BigDecimal getCvsvSeptiembre() {
        return cvsvSeptiembre;
    }

    public void setCvsvSeptiembre(BigDecimal cvsvSeptiembre) {
        this.cvsvSeptiembre = cvsvSeptiembre;
    }

    public BigDecimal getCvsvOctubre() {
        return cvsvOctubre;
    }

    public void setCvsvOctubre(BigDecimal cvsvOctubre) {
        this.cvsvOctubre = cvsvOctubre;
    }

    public BigDecimal getCvsvNoviembre() {
        return cvsvNoviembre;
    }

    public void setCvsvNoviembre(BigDecimal cvsvNoviembre) {
        this.cvsvNoviembre = cvsvNoviembre;
    }

    public BigDecimal getCvsvDiciembre() {
        return cvsvDiciembre;
    }

    public void setCvsvDiciembre(BigDecimal cvsvDiciembre) {
        this.cvsvDiciembre = cvsvDiciembre;
    }

    public BigDecimal getCvsvTonelajeTotal() {
        return cvsvTonelajeTotal;
    }

    public void setCvsvTonelajeTotal(BigDecimal cvsvTonelajeTotal) {
        this.cvsvTonelajeTotal = cvsvTonelajeTotal;
    }

}
